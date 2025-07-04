package net.thevaliantsquidward.vintagevibes.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.thevaliantsquidward.vintagevibes.registry.VVBlocks;
import net.thevaliantsquidward.vintagevibes.registry.VVItems;

public class AttachedPineappleStemBlock extends BushBlock {

    public AttachedPineappleStemBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    protected boolean mayPlaceOn(BlockState state, BlockGetter blockGetter, BlockPos pos) {
        return state.is(Blocks.FARMLAND);
    }

    @Override
    public ItemStack getCloneItemStack(BlockGetter blockGetter, BlockPos pos, BlockState state) {
        return new ItemStack(VVItems.PINEAPPLE_SEEDS.get());
    }

    @Override
    public BlockState updateShape(BlockState state, Direction direction, BlockState state1, LevelAccessor level, BlockPos pos, BlockPos pos1) {
        return !level.getBlockState(pos.above()).is(VVBlocks.PINEAPPLE.get()) ? VVBlocks.PINEAPPLE_STEM.get().defaultBlockState().setValue(PineappleStemBlock.AGE, 3) : super.updateShape(state, direction, state1, level, pos, pos1);
    }
}