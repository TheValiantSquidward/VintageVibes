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

    Supplier<BiMap<Block, Block>> NEXT_BY_BLOCK = Suppliers.memoize(() ->
            ImmutableBiMap.<Block, Block>builder()
                    .put(VVBlocks.GREEN_PINEAPPLE.get(), VVBlocks.SPOTTED_PINEAPPLE.get())
                    .put(VVBlocks.SPOTTED_PINEAPPLE.get(), VVBlocks.PINEAPPLE.get())
                    .build()
    );

    static Optional<Block> getNext(Block block) {
        return Optional.ofNullable(NEXT_BY_BLOCK.get().get(block));
    }

    default Optional<BlockState> getNext(BlockState state) {
        return getNext(state.getBlock()).map((block) -> block.withPropertiesOf(state));
    }

    enum RipenState {
        GREEN,
        SPOTTED,
        YELLOW;
    }
}
