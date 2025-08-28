package net.thevaliantsquidward.vintagevibes.blocks.interfaces;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Optional;

public interface FruitLeavesChangeOverTime<T extends Enum<T>> {

    Optional<BlockState> getNext(BlockState state);

    default void onRandomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (random.nextFloat() < 0.05688889F) {
            this.applyChangeOverTime(state, level, pos, random);
        }
    }

    default void applyChangeOverTime(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (random.nextFloat() < 1) {
            this.getNext(state).ifPresent((state1) -> level.setBlockAndUpdate(pos, state1));
        }
    }

    T getAge();
}