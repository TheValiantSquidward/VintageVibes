package net.thevaliantsquidward.vintagevibes.entities.ai.goals;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;
import net.thevaliantsquidward.vintagevibes.entities.Butterfly;

import java.util.EnumSet;

public class ButterflyFlightGoal extends Goal {

    private Butterfly butterfly;
    private double x;
    private double y;
    private double z;

    public ButterflyFlightGoal(Butterfly butterfly) {
        this.setFlags(EnumSet.of(Flag.MOVE));
        this.butterfly = butterfly;
    }

    @Override
    public boolean canUse() {
        if (butterfly.isVehicle() || (butterfly.getTarget() != null && butterfly.getTarget().isAlive()) || butterfly.isPassenger()) {
            return false;
        }
        if (!butterfly.isFlying() && butterfly.getRandom().nextInt(50) != 0) {
            return false;
        }
        Vec3 target = this.getPosition();
        if (target == null) {
            return false;
        } else {
            this.x = target.x;
            this.y = target.y;
            this.z = target.z;
            return true;
        }
    }

    private Vec3 getPosition() {
        return findFlightPos();
    }

    public void start() {
        this.butterfly.setFlying(true);
        butterfly.getNavigation().moveTo(this.x, this.y, this.z, 0.5F);
    }

    public void stop() {
        butterfly.getNavigation().stop();
        butterfly.landingFlag = false;
        x = 0;
        y = 0;
        z = 0;
        super.stop();
    }

    public void tick() {
        if (butterfly.isFlying() && butterfly.onGround() && butterfly.timeFlying > 40) {
            butterfly.setFlying(false);
        }
        if (butterfly.isFlying() && butterfly.timeFlying % 600 == 0 && !isOverWaterOrVoid()) {
            butterfly.landingFlag = true;
        }
        if (isOverWaterOrVoid() || butterfly.isInWaterOrBubble()) {
            butterfly.setFlying(true);
            butterfly.landingFlag = false;
        }
    }

    public boolean canContinueToUse() {
        if (butterfly.landingFlag) {
            return !butterfly.getNavigation().isDone() && !butterfly.onGround() && butterfly.groundedFor <= 0;
        } else {
            return butterfly.isFlying() && !butterfly.getNavigation().isDone() && butterfly.groundedFor <= 0;
        }
    }

    private Vec3 findFlightPos() {
        int range = 13;

        Vec3 heightAdjusted = butterfly.position().add(butterfly.getRandom().nextInt(range * 2) - range, 0, butterfly.getRandom().nextInt(range * 2) - range);
        if (butterfly.level().canSeeSky(BlockPos.containing(heightAdjusted))) {
            Vec3 ground = groundPosition(heightAdjusted);
            heightAdjusted = new Vec3(heightAdjusted.x, ground.y + 4 + butterfly.getRandom().nextInt(8), heightAdjusted.z);
        } else {
            Vec3 ground = groundPosition(heightAdjusted);
            BlockPos ceiling = BlockPos.containing(ground).above(2);
            while (ceiling.getY() < butterfly.level().getMaxBuildHeight() && !butterfly.level().getBlockState(ceiling).isSolid()) {
                ceiling = ceiling.above();
            }
            float randCeilVal = 0.3F + butterfly.getRandom().nextFloat() * 0.5F;
            heightAdjusted = new Vec3(heightAdjusted.x, ground.y + (ceiling.getY() - ground.y) * randCeilVal, heightAdjusted.z);
        }

        BlockHitResult result = butterfly.level().clip(new ClipContext(butterfly.getEyePosition(), heightAdjusted, ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, butterfly));
        if (result.getType() == HitResult.Type.MISS) {
            return heightAdjusted;
        } else {
            return result.getLocation();
        }
    }

    public Vec3 groundPosition(Vec3 airPosition) {
        BlockPos.MutableBlockPos ground = new BlockPos.MutableBlockPos();
        ground.set(airPosition.x, airPosition.y, airPosition.z);
        boolean flag = false;
        while (ground.getY() < butterfly.level().getMaxBuildHeight() && !butterfly.level().getBlockState(ground).isSolid() && butterfly.level().getFluidState(ground).isEmpty()){
            ground.move(0, 1, 0);
            flag = true;
        }
        ground.move(0, -1, 0);
        while (ground.getY() > butterfly.level().getMinBuildHeight() && !butterfly.level().getBlockState(ground).isSolid() && butterfly.level().getFluidState(ground).isEmpty()) {
            ground.move(0, -1, 0);
        }
        return Vec3.atCenterOf(flag ? ground.above() : ground.below());
    }

    private boolean isOverWaterOrVoid() {
        BlockPos position = butterfly.blockPosition();
        while (position.getY() > butterfly.level().getMinBuildHeight() && butterfly.level().isEmptyBlock(position) && butterfly.level().getFluidState(position).isEmpty()) {
            position = position.below();
        }
        return !butterfly.level().getFluidState(position).isEmpty() || butterfly.level().getBlockState(position).is(Blocks.VINE) || position.getY() <= butterfly.level().getMinBuildHeight();
    }
}
