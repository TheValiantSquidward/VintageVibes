package net.thevaliantsquidward.vintagevibes.blocks.interfaces;

import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.thevaliantsquidward.vintagevibes.registry.VVBlocks;

import java.util.Optional;
import java.util.function.Supplier;

public interface FruitLeaves extends FruitLeavesChangeOverTime<FruitLeaves.FruitState> {

    Supplier<BiMap<Block, Block>> NEXT_BY_BLOCK = Suppliers.memoize(() ->
            ImmutableBiMap.<Block, Block>builder()
                    .put(VVBlocks.GRAPEFRUIT_LEAVES.get(), VVBlocks.FLOWERING_GRAPEFRUIT_LEAVES.get())
                    .put(VVBlocks.FLOWERING_GRAPEFRUIT_LEAVES.get(), VVBlocks.FRUITFUL_GRAPEFRUIT_LEAVES.get())

                    .put(VVBlocks.LEMON_LEAVES.get(), VVBlocks.FLOWERING_LEMON_LEAVES.get())
                    .put(VVBlocks.FLOWERING_LEMON_LEAVES.get(), VVBlocks.FRUITFUL_LEMON_LEAVES.get())

                    .put(VVBlocks.LIME_LEAVES.get(), VVBlocks.FLOWERING_LIME_LEAVES.get())
                    .put(VVBlocks.FLOWERING_LIME_LEAVES.get(), VVBlocks.FRUITFUL_LIME_LEAVES.get())

                    .put(VVBlocks.MANGO_LEAVES.get(), VVBlocks.FLOWERING_MANGO_LEAVES.get())
                    .put(VVBlocks.FLOWERING_MANGO_LEAVES.get(), VVBlocks.FRUITFUL_MANGO_LEAVES.get())

                    .put(VVBlocks.ORANGE_LEAVES.get(), VVBlocks.FLOWERING_ORANGE_LEAVES.get())
                    .put(VVBlocks.FLOWERING_ORANGE_LEAVES.get(), VVBlocks.FRUITFUL_ORANGE_LEAVES.get())
                    .build()
    );

    static Optional<Block> getNext(Block block) {
        return Optional.ofNullable(NEXT_BY_BLOCK.get().get(block));
    }

    default Optional<BlockState> getNext(BlockState state) {
        return getNext(state.getBlock()).map((block) -> block.withPropertiesOf(state));
    }

    enum FruitState {
        FRUITLESS,
        FLOWERING,
        FRUITFUL;
    }
}
