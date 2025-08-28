package net.thevaliantsquidward.vintagevibes.mixins;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.animal.Bee;
import net.minecraft.world.level.block.state.BlockState;
import net.thevaliantsquidward.vintagevibes.registry.tags.VVBlockTags;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Optional;
import java.util.function.Predicate;

@Mixin(Bee.class)
public abstract class BeeMixin {

    @Mixin(targets = "net.minecraft.world.entity.animal.Bee$BeePollinateGoal")
    public abstract static class BeePollinateGoalMixin {

        @Unique
        public Bee bee;

        @Inject(method = "<init>", at = @At(value = "TAIL"))
        private void setBee(Bee bee, CallbackInfo ci) {
            this.bee = bee;
        }

        @Shadow
        protected abstract Optional<BlockPos> findNearestBlock(Predicate<BlockState> predicate, double distance);

        @Inject(method = "findNearbyFlower", at = @At("HEAD"), cancellable = true)
        private void findLeaves(CallbackInfoReturnable<Optional<BlockPos>> cir) {
            Optional<BlockPos> pos = findNearestBlock((blockState) -> blockState.is(VVBlockTags.BEES_POLLINATE),5.0D);
            if (pos.isPresent()) cir.setReturnValue(pos);
        }
    }
}
