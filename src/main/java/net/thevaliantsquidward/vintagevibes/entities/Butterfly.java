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
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.TemptGoal;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.Bucketable;
import net.minecraft.world.entity.animal.FlyingAnimal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import net.thevaliantsquidward.vintagevibes.entities.ai.goals.*;
import net.thevaliantsquidward.vintagevibes.entities.ai.navigation.*;
import net.thevaliantsquidward.vintagevibes.registry.VVItems;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Butterfly extends Animal implements Bucketable, FlyingAnimal {

    private static final EntityDataAccessor<Integer> VARIANT = SynchedEntityData.defineId(Butterfly.class, EntityDataSerializers.INT);
    private static final EntityDataAccessor<Boolean> FROM_BUCKET = SynchedEntityData.defineId(Butterfly.class, EntityDataSerializers.BOOLEAN);
    private static final EntityDataAccessor<Boolean> FLYING = SynchedEntityData.defineId(Butterfly.class, EntityDataSerializers.BOOLEAN);

    protected float flyProgress;
    protected float prevFlyProgress;
    public int timeFlying = 0;
    protected float flightPitch = 0;
    protected float prevFlightPitch = 0;
    protected float flightRoll = 0;
    protected float prevFlightRoll = 0;
    public int groundedFor = 0;
    public boolean landingFlag;

    public final AnimationState idleAnimationState = new AnimationState();
    public final AnimationState flyingAnimationState = new AnimationState();

    public Butterfly(EntityType<? extends Animal> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
        this.moveControl = new ButterflyMoveController(this);
    }

    protected @NotNull PathNavigation createNavigation(@NotNull Level level) {
        return new FlyingPathNavigationNoSpin(this, level, 0.75F);
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
        this.goalSelector.addGoal(2, new ButterflyFlightGoal(this));
        this.goalSelector.addGoal(3, new ButterflyLookAroundGoal(this));
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
    protected void doPush(Entity entity) {
    }

    @Override
    protected void pushEntities() {
    }

    @Override
    protected Entity.MovementEmission getMovementEmission() {
        return Entity.MovementEmission.EVENTS;
    }

    @Override
    protected void doWaterSplashEffect() {
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
            case 17 -> "rusty_tip_page";
            case 18 -> "tailed_jay";
            case 19 -> "emerald_swallowtail";
            case 20 -> "great_eggfly";
            case 21 -> "rose_pink";
            case 22 -> "one_spotted_prepona";
            case 23 -> "giant_glasswing";
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
    public void aiStep() {
        super.aiStep();
        if (this.isFlying()) {
            this.setPose(Pose.FALL_FLYING);
        } else {
            this.setPose(Pose.STANDING);
        }
    }

    @Override
    public void tick() {
        super.tick();

        prevFlyProgress = flyProgress;
        prevFlightPitch = flightPitch;
        prevFlightRoll = flightRoll;

        this.tickFlight();
        this.tickRotation((float) this.getDeltaMovement().y * 2 * -(float) (180F / (float) Math.PI));

        if (this.level().isClientSide()) {
            this.setupAnimationStates();
        }
    }

    public void tickFlight() {
        if (isFlying() && flyProgress < 5F) {
            flyProgress++;
        }
        if (!isFlying() && flyProgress > 0F) {
            flyProgress--;
        }

        if (this.isFlying()) {
            timeFlying++;
            this.setNoGravity(true);
            if (groundedFor > 0) {
                this.setFlying(false);
            }
        } else {
            timeFlying = 0;
            this.setNoGravity(false);
        }
        if (groundedFor > 0) {
            groundedFor--;
        }

        if (!level().isClientSide) {
            if (isFlying() && this.isAlive() && !this.isVehicle()) {
                if (landingFlag) {
                    this.setDeltaMovement(this.getDeltaMovement().add(0, -0.1D, 0));
                }
                if ((horizontalCollision || this.isInWaterOrBubble()) && !landingFlag) {
                    this.setDeltaMovement(this.getDeltaMovement().add(0, 0.05D, 0));
                }
            }
            if (this.isFlying() && timeFlying > 40 && this.onGround()) {
                this.setFlying(false);
            }
        }
    }

    public void tickRotation(float yMov) {
        flightPitch = yMov;
        float threshold = 1F;
        boolean flag = false;
        if (isFlying() && this.yRotO - this.getYRot() > threshold) {
            flightRoll += 10;
            flag = true;
        }
        if (isFlying() && this.yRotO - this.getYRot() < -threshold) {
            flightRoll -= 10;
            flag = true;
        }
        if (!flag) {
            if (flightRoll > 0) {
                flightRoll = Math.max(flightRoll - 5, 0);
            }
            if (flightRoll < 0) {
                flightRoll = Math.min(flightRoll + 5, 0);
            }
        }
        flightRoll = Mth.clamp(flightRoll, -60, 60);
    }

    private void setupAnimationStates() {
        this.idleAnimationState.animateWhen(this.onGround() && !this.isFlying(), this.tickCount);
    }

    @Override
    public void onSyncedDataUpdated(EntityDataAccessor<?> entityDataAccessor) {
        if (DATA_POSE.equals(entityDataAccessor)) {
            Pose entityPose = this.getPose();
            if (entityPose == Pose.FALL_FLYING) {
                this.flyingAnimationState.start(this.tickCount);
            } else {
                this.flyingAnimationState.stop();
            }
        }
        super.onSyncedDataUpdated(entityDataAccessor);
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(FLYING, false);
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
    public boolean isFlying() {
        return this.entityData.get(FLYING);
    }

    public void setFlying(boolean flying) {
        this.entityData.set(FLYING, flying);
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

    public void setFromBucket(boolean fromBucket) {
        this.entityData.set(FROM_BUCKET, fromBucket);
    }

    public float getFlightPitch(float partialTicks) {
        return (prevFlightPitch + (flightPitch - prevFlightPitch) * partialTicks);
    }

    public float getFlightRoll(float partialTicks) {
        return (prevFlightRoll + (flightRoll - prevFlightRoll) * partialTicks);
    }

    public float getFlyProgress(float partialTicks) {
        return (prevFlyProgress + (flyProgress - prevFlyProgress) * partialTicks) * 0.2F;
    }

    @Nullable
    @Override
    public SpawnGroupData finalizeSpawn(ServerLevelAccessor worldIn, DifficultyInstance difficultyIn, MobSpawnType reason, @Nullable SpawnGroupData spawnDataIn, @Nullable CompoundTag dataTag) {
        int variantChange = this.random.nextInt(0, 100);
        if (reason == MobSpawnType.BUCKET && dataTag != null) {
            this.setVariant(dataTag.getInt("Variant"));
        } else if (variantChange <= 4) {
            this.setVariant(1);
        } else if (variantChange <= 8) {
            this.setVariant(2);
        } else if (variantChange <= 12) {
            this.setVariant(3);
        } else if (variantChange <= 16) {
            this.setVariant(4);
        } else if (variantChange <= 20) {
            this.setVariant(5);
        } else if (variantChange <= 24) {
            this.setVariant(6);
        } else if (variantChange <= 28) {
            this.setVariant(7);
        } else if (variantChange <= 32) {
            this.setVariant(9);
        } else if (variantChange <= 36) {
            this.setVariant(10);
        } else if (variantChange <= 40) {
            this.setVariant(11);
        } else if (variantChange <= 44) {
            this.setVariant(12);
        } else if (variantChange <= 48) {
            this.setVariant(13);
        } else if (variantChange <= 52) {
            this.setVariant(14);
        } else if (variantChange <= 56) {
            this.setVariant(15);
        } else if (variantChange <= 60) {
            this.setVariant(16);
        } else if (variantChange <= 64) {
            this.setVariant(17);
        } else if (variantChange <= 68) {
            this.setVariant(18);
        } else if (variantChange <= 72) {
            this.setVariant(19);
        } else if (variantChange <= 76) {
            this.setVariant(20);
        } else if (variantChange <= 80) {
            this.setVariant(21);
        } else if (variantChange <= 84) {
            this.setVariant(22);
        } else if (variantChange <= 88) {
            this.setVariant(23);
        } else {
            this.setVariant(0);
        }
        return super.finalizeSpawn(worldIn, difficultyIn, reason, spawnDataIn, dataTag);
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
    public @NotNull MobType getMobType() {
        return MobType.ARTHROPOD;
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel pLevel, AgeableMob pOtherParent) {
        return null;
    }

    @SuppressWarnings("unused")
    public static boolean canSpawn(EntityType<Butterfly> entity, ServerLevelAccessor level, MobSpawnType spawnType, BlockPos pos, RandomSource random) {
        return level.getBlockState(pos.below()).is(BlockTags.ANIMALS_SPAWNABLE_ON) && Animal.isBrightEnoughToSpawn(level, pos);
    }
}
