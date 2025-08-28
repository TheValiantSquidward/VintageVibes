package net.thevaliantsquidward.vintagevibes.blocks.interfaces;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.state.BlockState;
import net.thevaliantsquidward.vintagevibes.registry.VVBlocks;

import java.util.Optional;

public interface PineappleChangeOverTime <T extends Enum<T>> {

    Optional<BlockState> getNext(BlockState state);

    default void onRandomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (random.nextFloat() < 0.05688889F && level.getBlockState(pos.below()).is(VVBlocks.ATTACHED_PINEAPPLE_STEM.get())) {
            this.getNext(state).ifPresent((state1) -> level.setBlockAndUpdate(pos, state1));
        }
    }

    T getAge();
}