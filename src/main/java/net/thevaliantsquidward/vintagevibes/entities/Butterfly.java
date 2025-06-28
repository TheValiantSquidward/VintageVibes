package net.thevaliantsquidward.vintagevibes.entities;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.FlyingMoveControl;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.TemptGoal;
import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
import net.minecraft.world.entity.ai.navigation.GroundPathNavigation;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.Bucketable;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;
import net.thevaliantsquidward.vintagevibes.entities.ai.navigation.FlyingMoveController;
import net.thevaliantsquidward.vintagevibes.registry.VVItems;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.EnumSet;

public class Butterfly extends Animal implements Bucketable {

    @Nullable
    private static final EntityDataAccessor<Boolean> FLYING = SynchedEntityData.defineId(Butterfly.class, EntityDataSerializers.BOOLEAN);
    private static final EntityDataAccessor<Integer> VARIANT = SynchedEntityData.defineId(Butterfly.class, EntityDataSerializers.INT);
    private static final EntityDataAccessor<Boolean> FROM_BUCKET = SynchedEntityData.defineId(Butterfly.class, EntityDataSerializers.BOOLEAN);

    public final float[] ringBuffer = new float[64];
    public float prevFlyProgress;
    public float flyProgress;
    public int ringBufferIndex = -1;
    private boolean isLandNavigator;
    private int timeFlying;

    public final AnimationState idleAnimationState = new AnimationState();
    public final AnimationState flyingAnimationState = new AnimationState();

    public Butterfly(EntityType<? extends Animal> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
        this.moveControl = new FlyingMoveControl(this, 20, true);
        this.setPathfindingMalus(BlockPathTypes.DANGER_FIRE, -1.0F);
        this.setPathfindingMalus(BlockPathTypes.WATER, -1.0F);
        this.setPathfindingMalus(BlockPathTypes.WATER_BORDER, 16.0F);
        this.setPathfindingMalus(BlockPathTypes.COCOA, -1.0F);
        this.setPathfindingMalus(BlockPathTypes.FENCE, -1.0F);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Animal.createLivingAttributes().add(Attributes.MAX_HEALTH, 4.0D).add(Attributes.FLYING_SPEED, 0.1F).add(Attributes.MOVEMENT_SPEED, 0.1F).add(Attributes.FOLLOW_RANGE, 16.0F);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(1, new TemptGoal(this, 1.0D, Ingredient.of(ItemTags.FLOWERS), false));
        this.goalSelector.addGoal(2, new ButterflyFlightGoal());
    }

    private void switchNavigator(boolean onLand) {
        if (onLand) {
            this.moveControl = new MoveControl(this);
            this.navigation = new GroundPathNavigation(this, level());
            this.isLandNavigator = true;
        } else {
            this.moveControl = new FlyingMoveController(this, 1.0F, false, true);
            this.navigation = new FlyingPathNavigation(this, level()) {
                public boolean isStableDestination(BlockPos pos) {
                    return !this.level.getBlockState(pos.below(2)).isAir();
                }
            };
            navigation.setCanFloat(false);
            this.isLandNavigator = false;
        }
    }

    public static String getVariantName(int variant) {
        return switch (variant) {
            case 1 -> "blue_banded_swallowtail";
            case 2 -> "blue_morpho";
            case 3 -> "cabbage";
            case 4 -> "clouded_yellow";
            case 5 -> "glasswing";
            case 6 -> "malachite";
            case 7 -> "mexican_shoemaker";
            case 8 -> "mourning_cloak";
            case 9 -> "purple_emperor";
            case 10 -> "gulf_fritillary";
            case 11 -> "tiger_swallowtail";
            case 12 -> "zebra";
            case 13 -> "common_blue";
            case 14 -> "atala";
            case 15 -> "red_admiral";
            case 16 -> "queen_alexandra_birdwing";
            default -> "monarch";
        };
    }


    @Override
    public @NotNull InteractionResult mobInteract(Player player, @NotNull InteractionHand hand) {
        ItemStack heldItem = player.getItemInHand(hand);

        if (heldItem.getItem() == Items.GLASS_BOTTLE && this.isAlive()) {
            playSound(SoundEvents.BOTTLE_FILL_DRAGONBREATH, 0.5F, 1.0F);
            heldItem.shrink(1);
            ItemStack itemstack1 = new ItemStack(VVItems.BUTTERFLY_BOTTLE.get());
            this.setBucketData(itemstack1);
            if (!this.level().isClientSide) {
                CriteriaTriggers.FILLED_BUCKET.trigger((ServerPlayer) player, itemstack1);
            }
            if (heldItem.isEmpty() && !player.isCreative()) {
                player.setItemInHand(hand, itemstack1);
            } else if (!player.getInventory().add(itemstack1)) {
                player.drop(itemstack1, false);
            }
            this.discard();
            return InteractionResult.SUCCESS;
        }
        return super.mobInteract(player, hand);
    }


    @Override
    public void tick() {
        super.tick();

        this.prevFlyProgress = flyProgress;
        if (this.isFlying() && flyProgress < 5F) {
            flyProgress++;
        }
        if (!this.isFlying() && flyProgress > 0F) {
            flyProgress--;
        }
        if (this.ringBufferIndex < 0) {
            for (int i = 0; i < this.ringBuffer.length; ++i) {
                this.ringBuffer[i] = 15;
            }
        }
        this.ringBufferIndex++;
        if (this.ringBufferIndex == this.ringBuffer.length) {
            this.ringBufferIndex = 0;
        }
        if (!level().isClientSide) {
            if (isFlying() && this.isLandNavigator) {
                switchNavigator(false);
            }
            if (!isFlying() && !this.isLandNavigator) {
                switchNavigator(true);
            }
            if (this.isFlying()) {
                if (this.isFlying() && !this.onGround()) {
                    if (!this.isInWaterOrBubble()) {
                        this.setDeltaMovement(this.getDeltaMovement().multiply(1F, 0.6F, 1F));
                    }
                }
                if (this.onGround() && timeFlying > 20) {
                    this.setFlying(false);
                }
                this.timeFlying++;
            } else {
                this.timeFlying = 0;
            }
        }

        if (this.level().isClientSide()) {
            this.setupAnimationStates();
        }
    }

    private void setupAnimationStates() {
        this.idleAnimationState.animateWhen(this.isAlive() && this.onGround(), this.tickCount);
        this.flyingAnimationState.animateWhen(this.isAlive() && !this.onGround() && this.isFlying(), this.tickCount);
    }

    @Nullable
    @Override
    public SpawnGroupData finalizeSpawn(ServerLevelAccessor worldIn, DifficultyInstance difficultyIn, MobSpawnType reason, @Nullable SpawnGroupData spawnDataIn, @Nullable CompoundTag dataTag) {
        int variantChange = this.random.nextInt(0, 100);

        if (reason == MobSpawnType.BUCKET && dataTag != null) {
            this.setVariant(dataTag.getInt("Variant"));
        } else
        if (variantChange <= 6) {
            this.setVariant(1);
        }
        else if (variantChange <= 12) {
            this.setVariant(2);
        }
        else if (variantChange <= 18) {
            this.setVariant(3);
        }
        else if (variantChange <= 24) {
            this.setVariant(4);
        }
        else if (variantChange <= 30) {
            this.setVariant(5);
        }
        else if (variantChange <= 36) {
            this.setVariant(6);
        }
        else if (variantChange <= 42) {
            this.setVariant(7);
        }
        else if (variantChange <= 48) {
            this.setVariant(9);
        }
        else if (variantChange <= 54) {
            this.setVariant(10);
        }
        else if (variantChange <= 60) {
            this.setVariant(11);
        }
        else if (variantChange <= 66) {
            this.setVariant(12);
        }
        else if (variantChange <= 72) {
            this.setVariant(13);
        }
        else if (variantChange <= 78) {
            this.setVariant(14);
        }
        else if (variantChange <= 84) {
            this.setVariant(15);
        }
        else if (variantChange <= 90) {
            this.setVariant(16);
        } else {
            this.setVariant(0);
        }
        return super.finalizeSpawn(worldIn, difficultyIn, reason, spawnDataIn, dataTag);
    }


        public int getVariant() {
        return this.entityData.get(VARIANT);
    }

    public void setVariant(int variant) {
        this.entityData.set(VARIANT, variant);
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(VARIANT, 0);
        this.entityData.define(FROM_BUCKET, false);
        this.entityData.define(FLYING, false);
    }

    public boolean fromBucket() {
        return this.entityData.get(FROM_BUCKET);
    }

    public void setFromBucket(boolean pFromBucket) {
        this.entityData.set(FROM_BUCKET, pFromBucket);
    }

    @Override
    public void saveToBucketTag(ItemStack bucket) {
        CompoundTag compoundnbt = bucket.getOrCreateTag();
        Bucketable.saveDefaultDataToBucketTag(this, bucket);
        compoundnbt.putFloat("Health", this.getHealth());
        compoundnbt.putInt("Age", this.getAge());
        compoundnbt.putInt("Variant", this.getVariant());
        if (this.hasCustomName()) {
            bucket.setHoverName(this.getCustomName());
        }
    }

    @Override
    public void loadFromBucketTag(CompoundTag pTag) {
        Bucketable.loadDefaultDataFromBucketTag(this, pTag);
    }

    @Override
    public ItemStack getBucketItemStack() {
        return new ItemStack(VVItems.BUTTERFLY_BOTTLE.get());
    }

    private void setBucketData(ItemStack bucket) {
        CompoundTag compoundnbt = bucket.getOrCreateTag();
        compoundnbt.putFloat("Health", this.getHealth());
        compoundnbt.putInt("Variant", this.getVariant());
        if (this.hasCustomName()) {
            bucket.setHoverName(this.getCustomName());
        }
    }

    @Override
    public SoundEvent getPickupSound() {
        return SoundEvents.BOTTLE_FILL_DRAGONBREATH;
    }

    @Override
    public void addAdditionalSaveData(CompoundTag compound) {
        super.addAdditionalSaveData(compound);
        compound.putInt("Variant", this.getVariant());
        compound.putBoolean("Flying", this.isFlying());
    }

    @Override
    public void readAdditionalSaveData(CompoundTag compound) {
        super.readAdditionalSaveData(compound);
        this.setVariant(compound.getInt("Variant"));
        this.setFlying(compound.getBoolean("Flying"));
    }

    @Override
    public MobType getMobType() {
        return MobType.ARTHROPOD;
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel pLevel, AgeableMob pOtherParent) {
        return null;
    }

    @Override
    public boolean isFlapping() {
        return this.isFlying() && this.tickCount % Mth.ceil(1.4959966F) == 0;
    }

    @Override
    public float getWalkTargetValue(BlockPos pPos, LevelReader pLevel) {
        return pLevel.getBlockState(pPos).isAir() ? 10.0F : 0.0F;
    }

    @Override
    public Fallsounds getFallSounds() {
        return null;
    }

    @Override
    public boolean causeFallDamage(float pFallDistance, float pMultiplier, DamageSource pSource) {
        return false;
    }

    @Override
    protected void checkFallDamage(double pY, boolean pOnGround, BlockState pState, BlockPos pPos) {
    }

    @Override
    protected void playStepSound(BlockPos pPos, BlockState pState) {
    }

    @SuppressWarnings("unused")
    public static boolean canSpawn(EntityType<Butterfly> entitty, ServerLevelAccessor world, MobSpawnType spawnReason, BlockPos pos, RandomSource random) {
        return world.getBlockState(pos.below()).is(BlockTags.ANIMALS_SPAWNABLE_ON) && Animal.isBrightEnoughToSpawn(world, pos);
    }

    // flight
    public boolean isFlying() {
        return this.entityData.get(FLYING);
    }

    public void setFlying(boolean flying) {
        if (flying && isBaby()) {
            return;
        }
        this.entityData.set(FLYING, flying);
    }

    public Vec3 getBlockGrounding(Vec3 fleePos) {
        final float radius = 3.15F * -3 - this.getRandom().nextInt(24);
        float neg = this.getRandom().nextBoolean() ? 1 : -1;
        float renderYawOffset = this.yBodyRot;
        float angle = (0.01745329251F * renderYawOffset) + 3.15F + (this.getRandom().nextFloat() * neg);
        final double extraX = radius * Mth.sin(Mth.PI + angle);
        final double extraZ = radius * Mth.cos(angle);
        final BlockPos radialPos = new BlockPos((int) (fleePos.x() + extraX), (int) getY(), (int) (fleePos.z() + extraZ));
        BlockPos ground = this.getGround(radialPos);
        if (ground.getY() == -64) {
            return this.position();
        } else {
            ground = this.blockPosition();
            while (ground.getY() > -64 && !level().getBlockState(ground).isSolid()) {
                ground = ground.below();
            }
        }
        if (!this.isTargetBlocked(Vec3.atCenterOf(ground.above()))) {
            return Vec3.atCenterOf(ground);
        }
        return null;
    }

    public boolean isTargetBlocked(Vec3 target) {
        Vec3 Vector3d = new Vec3(this.getX(), this.getEyeY(), this.getZ());

        return this.level().clip(new ClipContext(Vector3d, target, ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, this)).getType() != HitResult.Type.MISS;
    }

    public Vec3 getBlockInViewAway(Vec3 fleePos, float radiusAdd) {
        float radius = 5 + radiusAdd + this.getRandom().nextInt(5);
        float neg = this.getRandom().nextBoolean() ? 1 : -1;
        float renderYawOffset = this.yBodyRot;
        float angle = (0.01745329251F * renderYawOffset) + 3.15F + (this.getRandom().nextFloat() * neg);
        double extraX = radius * Mth.sin((float) (Math.PI + angle));
        double extraZ = radius * Mth.cos(angle);
        final BlockPos radialPos = new BlockPos((int) (fleePos.x() + extraX), (int) getY(), (int) (fleePos.z() + extraZ));
        BlockPos ground = getGround(radialPos);
        int distFromGround = (int) this.getY() - ground.getY();
        int flightHeight = 5 + this.getRandom().nextInt(5);
        int j = this.getRandom().nextInt(5) + 5;

        BlockPos newPos = ground.above(distFromGround > 5 ? flightHeight : j);
        if (!this.isTargetBlocked(Vec3.atCenterOf(newPos)) && this.distanceToSqr(Vec3.atCenterOf(newPos)) > 1) {
            return Vec3.atCenterOf(newPos);
        }
        return null;
    }

    private boolean isOverWaterOrVoid() {
        BlockPos position = this.blockPosition();
        while (position.getY() > -65 && level().isEmptyBlock(position)) {
            position = position.below();
        }
        return !level().getFluidState(position).isEmpty() || level().getBlockState(position).is(Blocks.VINE) || position.getY() <= -65;
    }

    public BlockPos getGround(BlockPos in) {
        BlockPos position = new BlockPos(in.getX(), (int) this.getY(), in.getZ());
        while (position.getY() > -64 && !level().getBlockState(position).isSolid() && level().getFluidState(position).isEmpty()) {
            position = position.below();
        }
        return position;
    }

    // goals
    private class ButterflyFlightGoal extends Goal {

        protected double x;
        protected double y;
        protected double z;

        public ButterflyFlightGoal() {
            super();
            this.setFlags(EnumSet.of(Flag.MOVE));
        }

        @Override
        public boolean canUse() {
            if (Butterfly.this.isVehicle() || (Butterfly.this.getTarget() != null && Butterfly.this.getTarget().isAlive()) || Butterfly.this.isPassenger()) {
                return false;
            } else {
                if (Butterfly.this.getRandom().nextInt(10) != 0 && !Butterfly.this.isFlying()) {
                    return false;
                }

                Vec3 vec3 = this.getPosition();
                if (vec3 == null) {
                    return false;
                } else {
                    this.x = vec3.x;
                    this.y = vec3.y;
                    this.z = vec3.z;
                    return true;
                }
            }
        }

        public void tick() {
            Butterfly.this.getMoveControl().setWantedPosition(this.x, this.y, this.z, 1F);
            if (isFlying() && Butterfly.this.onGround() && Butterfly.this.timeFlying > 10) {
                Butterfly.this.setFlying(false);
            }
        }

        @Nullable
        protected Vec3 getPosition() {
            Vec3 vector3d = Butterfly.this.position();
            if (Butterfly.this.timeFlying < 200 || Butterfly.this.isOverWaterOrVoid()) {
                return Butterfly.this.getBlockInViewAway(vector3d, 0);
            } else {
                return Butterfly.this.getBlockGrounding(vector3d);
            }
        }

        public boolean canContinueToUse() {
            return Butterfly.this.isFlying() && Butterfly.this.distanceToSqr(x, y, z) > 5F;
        }

        public void start() {
            Butterfly.this.setFlying(true);
            Butterfly.this.getMoveControl().setWantedPosition(this.x, this.y, this.z, 1F);
        }

        public void stop() {
            Butterfly.this.getNavigation().stop();
            x = 0;
            y = 0;
            z = 0;
            super.stop();
        }
    }
}
