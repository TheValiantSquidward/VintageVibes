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
import net.minecraft.util.RandomSource;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.FlyingMoveControl;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.TemptGoal;
import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.util.AirAndWaterRandomPos;
import net.minecraft.world.entity.ai.util.HoverRandomPos;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.Bucketable;
import net.minecraft.world.entity.animal.FlyingAnimal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.thevaliantsquidward.vintagevibes.registry.VVItems;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.EnumSet;

public class Butterfly extends Animal implements Bucketable, FlyingAnimal {

    private static final EntityDataAccessor<Integer> VARIANT = SynchedEntityData.defineId(Butterfly.class, EntityDataSerializers.INT);
    private static final EntityDataAccessor<Boolean> FROM_BUCKET = SynchedEntityData.defineId(Butterfly.class, EntityDataSerializers.BOOLEAN);

    public int groundTicks;

    public final AnimationState idleAnimationState = new AnimationState();
    public final AnimationState flyingAnimationState = new AnimationState();

    public Butterfly(EntityType<? extends Animal> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
        this.moveControl = new FlyingMoveControl(this, 20, false);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Animal.createLivingAttributes()
                .add(Attributes.MAX_HEALTH, 4.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.2F)
                .add(Attributes.FLYING_SPEED, 0.7F)
                .add(Attributes.FOLLOW_RANGE, 16.0D);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(1, new TemptGoal(this, 1.0D, Ingredient.of(ItemTags.FLOWERS), false));
        this.goalSelector.addGoal(2, new ButterflyWanderAroundGoal());
        this.goalSelector.addGoal(3, new ButterflyLookAroundGoal());
    }

    @Override
    public boolean causeFallDamage(float f, float g, DamageSource damageSource) {
        return false;
    }

    @Override
    protected void playStepSound(BlockPos blockPos, BlockState blockState) {
    }

    @Override
    protected void checkFallDamage(double d, boolean bl, BlockState blockState, BlockPos blockPos) {
    }

    @Override
    protected PathNavigation createNavigation(Level level) {
        FlyingPathNavigation flyingPathNavigation = new FlyingPathNavigation(this, level){
            @Override
            public boolean isStableDestination(BlockPos blockPos) {
                return !level().getBlockState(blockPos.below()).isAir();
            }
        };
        flyingPathNavigation.setCanOpenDoors(false);
        flyingPathNavigation.setCanFloat(false);
        flyingPathNavigation.setCanPassDoors(true);
        return flyingPathNavigation;
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

        if (this.level().isClientSide()) {
            this.setupAnimationStates();
        }
    }

    private void setupAnimationStates() {
        this.idleAnimationState.animateWhen(this.isAlive() && this.onGround(), this.tickCount);
    }

    @Override
    public void aiStep() {
        super.aiStep();
        Vec3 vec3d = this.getDeltaMovement();
        if (!this.onGround() && vec3d.y < 0.0 && this.getTarget() == null) {
            this.setDeltaMovement(vec3d.multiply(1.0, 0.8, 1.0));
        }
        if (this.isFlying()) {
            this.groundTicks = random.nextInt(200) + 20;
            this.setPose(Pose.FALL_FLYING);
        } else {
            this.groundTicks--;
            this.setPose(Pose.STANDING);
        }
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
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(VARIANT, 0);
        this.entityData.define(FROM_BUCKET, false);
    }

    @Override
    public void addAdditionalSaveData(CompoundTag compound) {
        super.addAdditionalSaveData(compound);
        compound.putInt("Variant", this.getVariant());
    }

    @Override
    public void readAdditionalSaveData(CompoundTag compound) {
        super.readAdditionalSaveData(compound);
        this.setVariant(compound.getInt("Variant"));
    }

    @Override
    public void onSyncedDataUpdated(EntityDataAccessor<?> entityDataAccessor) {
        if (DATA_POSE.equals(entityDataAccessor)) {
            Pose entityPose = this.getPose();
            if (entityPose == Pose.FALL_FLYING) {
                this.flyingAnimationState.start(this.age);
            } else {
                this.flyingAnimationState.stop();
            }
        }
        super.onSyncedDataUpdated(entityDataAccessor);
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
    public boolean isFlying() {
        return !this.onGround();
    }

    @Override
    public float getWalkTargetValue(BlockPos pPos, LevelReader pLevel) {
        return pLevel.getBlockState(pPos).isAir() ? 10.0F : 0.0F;
    }

    @Override
    public Fallsounds getFallSounds() {
        return null;
    }

    @SuppressWarnings("unused")
    public static boolean canSpawn(EntityType<Butterfly> entitty, ServerLevelAccessor world, MobSpawnType spawnReason, BlockPos pos, RandomSource random) {
        return world.getBlockState(pos.below()).is(BlockTags.ANIMALS_SPAWNABLE_ON) && Animal.isBrightEnoughToSpawn(world, pos);
    }

    class ButterflyWanderAroundGoal extends Goal {

        ButterflyWanderAroundGoal() {
            this.setFlags(EnumSet.of(Goal.Flag.MOVE));
        }

        @Override
        public boolean canUse() {
            if (Butterfly.this.groundTicks < 0) return true;
            else if (Butterfly.this.isFlying()) return Butterfly.this.navigation.isDone() && Butterfly.this.random.nextInt(10) == 0;
            return false;
        }

        @Override
        public boolean canContinueToUse() {
            return Butterfly.this.navigation.isInProgress();
        }

        @Override
        public void start() {
            Vec3 vec3d = this.getRandomLocation();
            if (vec3d != null) {
                Butterfly.this.navigation.moveTo(Butterfly.this.navigation.createPath(BlockPos.containing(vec3d), 1), 1.0);
            }
        }

        @Nullable
        private Vec3 getRandomLocation() {
            Vec3 vec3d2;

            vec3d2 = Butterfly.this.getViewVector(0.0F);

            Vec3 vec3d3 = HoverRandomPos.getPos(Butterfly.this, 16, 8, vec3d2.x, vec3d2.z, 1.5707964F, 3, 1);
            return vec3d3 != null ? vec3d3 : AirAndWaterRandomPos.getPos(Butterfly.this, 16, 6, -2, vec3d2.x, vec3d2.z, 1.5707963705062866);
        }
    }

    class ButterflyLookAroundGoal extends RandomLookAroundGoal {

        ButterflyLookAroundGoal() {
            super(Butterfly.this);
        }

        @Override
        public boolean canUse() {
            return Butterfly.this.onGround() && super.canUse();
        }

        @Override
        public boolean canContinueToUse() {
            return Butterfly.this.onGround() && super.canContinueToUse();
        }
    }
}
