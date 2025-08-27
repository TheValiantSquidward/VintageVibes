package net.thevaliantsquidward.vintagevibes.blocks.interfaces;

import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.thevaliantsquidward.vintagevibes.registry.VVBlocks;

import java.util.Optional;
import java.util.function.Supplier;

public interface RipeningPineapple extends PineappleChangeOverTime<RipeningPineapple.RipenState> {

    Supplier<BiMap<Block, Block>> NEXT_BY_BLOCK = Suppliers.memoize(() -> ImmutableBiMap.<Block, Block>builder().put(VVBlocks.GREEN_PINEAPPLE.get(), VVBlocks.SPOTTED_PINEAPPLE.get()).put(VVBlocks.SPOTTED_PINEAPPLE.get(), VVBlocks.PINEAPPLE.get()).build());
    Supplier<BiMap<Block, Block>> PREVIOUS_BY_BLOCK = Suppliers.memoize(() -> NEXT_BY_BLOCK.get().inverse());

    static Optional<Block> getPrevious(Block p_154891_) {
        return Optional.ofNullable(PREVIOUS_BY_BLOCK.get().get(p_154891_));
    }

    static Block getFirst(Block block) {
        Block block1 = block;

        for(Block block2 = PREVIOUS_BY_BLOCK.get().get(block); block2 != null; block2 = PREVIOUS_BY_BLOCK.get().get(block2)) {
            block1 = block2;
        }

        return block1;
    }

    static Optional<BlockState> getPrevious(BlockState state) {
        return getPrevious(state.getBlock()).map((block) -> block.withPropertiesOf(state));
    }

    static Optional<Block> getNext(Block block) {
        return Optional.ofNullable(NEXT_BY_BLOCK.get().get(block));
    }

    static BlockState getFirst(BlockState state) {
        return getFirst(state.getBlock()).withPropertiesOf(state);
    }

    default Optional<BlockState> getNext(BlockState state) {
        return getNext(state.getBlock()).map((block) -> block.withPropertiesOf(state));
    }

    default float getChanceModifier() {
        return 1.0F;
    }

    enum RipenState {
        GREEN,
        SPOTTED,
        YELLOW;
    }
}
