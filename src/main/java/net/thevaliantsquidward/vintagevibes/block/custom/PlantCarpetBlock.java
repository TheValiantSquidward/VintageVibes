package net.thevaliantsquidward.vintagevibes.block.custom;


import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class PlantCarpetBlock extends BushBlock {
    public PlantCarpetBlock(Properties pProperties) {
        super(pProperties);
    }
    @Override
    public boolean mayPlaceOn(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
        return pState.is(BlockTags.DIRT) || pState.is(Blocks.FARMLAND) && !(pLevel.getBlockState(pPos.below()).getBlock() instanceof PlantCarpetBlock)
                && super.mayPlaceOn(pState, pLevel, pPos);
    }
    protected static final VoxelShape SHAPE = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 1.0D, 16.0D);


    public VoxelShape getShape(BlockState p_152917_, BlockGetter p_152918_, BlockPos p_152919_, CollisionContext p_152920_) {
        return SHAPE;
    }

    public BlockState updateShape(BlockState p_152926_, Direction p_152927_, BlockState p_152928_, LevelAccessor p_152929_, BlockPos p_152930_, BlockPos p_152931_) {
        return !p_152926_.canSurvive(p_152929_, p_152930_) ? Blocks.AIR.defaultBlockState() : super.updateShape(p_152926_, p_152927_, p_152928_, p_152929_, p_152930_, p_152931_);
    }

    public boolean canSurvive(BlockState p_152922_, LevelReader p_152923_, BlockPos p_152924_) {
        BlockState belowBlockState = p_152923_.getBlockState(p_152924_.below());
        return !(belowBlockState.getBlock() instanceof PlantCarpetBlock) && !p_152923_.isEmptyBlock(p_152924_.below());

    }
}
