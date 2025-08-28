package net.thevaliantsquidward.vintagevibes.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.PlantType;
import net.thevaliantsquidward.vintagevibes.registry.VVBlocks;
import net.thevaliantsquidward.vintagevibes.registry.VVItems;

public class PineappleStemBlock extends CropBlock {

    public static final IntegerProperty PINEAPPLE_AGE = BlockStateProperties.AGE_5;

    private static final VoxelShape[] SHAPE_BY_AGE = new VoxelShape[]{
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D),
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 6.0D, 16.0D),
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D),
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 10.0D, 16.0D),
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D),
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 14.0D, 16.0D)
    };

    public PineappleStemBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(PINEAPPLE_AGE, 0));
    }

    @Override
    protected IntegerProperty getAgeProperty() {
        return PINEAPPLE_AGE;
    }

    public int getMaxAge() {
        return 5;
    }

    @Override
    public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (!level.isAreaLoaded(pos, 1)) return;
        if (level.getRawBrightness(pos, 0) >= 9) {
            float growthSpeed = getGrowthSpeed(this, level, pos);
            if (ForgeHooks.onCropsGrowPre(level, pos, state, random.nextInt((int) (25.0F / growthSpeed) + 1) == 0)) {
                int age = state.getValue(PINEAPPLE_AGE);
                if (age < getMaxAge()) {
                    level.setBlock(pos, state.setValue(PINEAPPLE_AGE, age + 1), 2);
                } else {
                    BlockPos blockpos = pos.above();
                    BlockPos blockpos1 = pos.above(2);
                    if (level.isEmptyBlock(blockpos) && level.isEmptyBlock(blockpos1)) {
                        level.setBlockAndUpdate(blockpos, VVBlocks.GREEN_PINEAPPLE.get().defaultBlockState());
                        level.setBlockAndUpdate(blockpos1, VVBlocks.PINEAPPLE_CROWN.get().defaultBlockState());
                        level.setBlockAndUpdate(pos, VVBlocks.ATTACHED_PINEAPPLE_STEM.get().defaultBlockState());
                    }
                }
                ForgeHooks.onCropsGrowPost(level, pos, state);
            }
        }
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter blockGetter, BlockPos pos, CollisionContext context) {
        return SHAPE_BY_AGE [this.getAge(state)];
    }

    @Override
    public BlockState getPlant(BlockGetter level, BlockPos pos) {
        return VVBlocks.PINEAPPLE_STEM.get().defaultBlockState();
    }

    @Override
    public ItemStack getCloneItemStack(BlockGetter blockGetter, BlockPos pos, BlockState state) {
        return new ItemStack(VVItems.PINEAPPLE_SEEDS.get());
    }

    @Override
    public boolean isValidBonemealTarget(LevelReader level, BlockPos pos, BlockState state, boolean valid) {
        return state.getValue(PINEAPPLE_AGE) != 5;
    }

    @Override
    protected int getBonemealAgeIncrease(Level level) {
        return Mth.nextInt(level.random, 1, 2);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> state) {
        state.add(PINEAPPLE_AGE);
    }

    @Override
    public PlantType getPlantType(BlockGetter world, BlockPos pos) {
        return PlantType.CROP;
    }
}