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

public class PineappleStemBlock extends BushBlock implements BonemealableBlock {

    public static final IntegerProperty AGE = BlockStateProperties.AGE_3;

    private static final VoxelShape[] SHAPE_BY_AGE = new VoxelShape[]{
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D),
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 10.0D, 16.0D),
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D),
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 14.0D, 16.0D)
    };

    public PineappleStemBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(AGE, 0));
    }

    @Override
    public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (!level.isAreaLoaded(pos, 1)) return;
        if (level.getRawBrightness(pos, 0) >= 9) {
            float growthSpeed = getGrowthSpeed(this, level, pos);
            if (ForgeHooks.onCropsGrowPre(level, pos, state, random.nextInt((int) (25.0F / growthSpeed) + 1) == 0)) {
                int age = state.getValue(AGE);
                if (age < 3) {
                    level.setBlock(pos, state.setValue(AGE, age + 1), 2);
                } else {
                    BlockPos blockpos = pos.above();
                    BlockPos blockpos1 = pos.above(2);
                    if (level.isEmptyBlock(blockpos) && level.isEmptyBlock(blockpos1)) {
                        level.setBlockAndUpdate(blockpos, VVBlocks.PINEAPPLE.get().defaultBlockState());
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
        return SHAPE_BY_AGE [
                state.getValue(AGE)
        ];
    }

    @Override
    protected boolean mayPlaceOn(BlockState state, BlockGetter blockGetter, BlockPos pos) {
        return state.is(Blocks.FARMLAND);
    }

    @Override
    public BlockState getPlant(BlockGetter level, BlockPos pos) {
        return VVBlocks.PINEAPPLE_STEM.get().defaultBlockState();
    }

    protected static float getGrowthSpeed(Block block, BlockGetter blockGetter, BlockPos pos) {
        float speed = 1.0F;
        BlockPos blockpos = pos.below();

        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                float f1 = 0.0F;
                BlockState blockstate = blockGetter.getBlockState(blockpos.offset(i, 0, j));
                if (blockstate.canSustainPlant(blockGetter, blockpos.offset(i, 0, j), net.minecraft.core.Direction.UP, (net.minecraftforge.common.IPlantable) block)) {
                    f1 = 1.0F;
                    if (blockstate.isFertile(blockGetter, pos.offset(i, 0, j))) {
                        f1 = 3.0F;
                    }
                }

                if (i != 0 || j != 0) {
                    f1 /= 4.0F;
                }

                speed += f1;
            }
        }

        BlockPos blockpos1 = pos.north();
        BlockPos blockpos2 = pos.south();
        BlockPos blockpos3 = pos.west();
        BlockPos blockpos4 = pos.east();

        boolean flag = blockGetter.getBlockState(blockpos3).is(block) || blockGetter.getBlockState(blockpos4).is(block);
        boolean flag1 = blockGetter.getBlockState(blockpos1).is(block) || blockGetter.getBlockState(blockpos2).is(block);
        if (flag && flag1) {
            speed /= 2.0F;
        } else {
            boolean flag2 = blockGetter.getBlockState(blockpos3.north()).is(block) || blockGetter.getBlockState(blockpos4.north()).is(block) || blockGetter.getBlockState(blockpos4.south()).is(block) || blockGetter.getBlockState(blockpos3.south()).is(block);
            if (flag2) {
                speed /= 2.0F;
            }
        }

        return speed;
    }

    @Override
    public ItemStack getCloneItemStack(BlockGetter blockGetter, BlockPos pos, BlockState state) {
        return new ItemStack(VVItems.PINEAPPLE_SEEDS.get());
    }

    @Override
    public boolean isValidBonemealTarget(LevelReader level, BlockPos pos, BlockState state, boolean valid) {
        return state.getValue(AGE) != 3;
    }

    @Override
    public boolean isBonemealSuccess(Level level, RandomSource random, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public void performBonemeal(ServerLevel level, RandomSource random, BlockPos pos, BlockState state) {
        int i = Math.min(3, state.getValue(AGE) + Mth.nextInt(level.random, 1, 2));
        BlockState blockstate = state.setValue(AGE, i);
        level.setBlock(pos, blockstate, 2);
        if (i == 3) {
            blockstate.randomTick(level, pos, level.random);
        }
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> state) {
        state.add(AGE);
    }

    @Override
    public PlantType getPlantType(BlockGetter world, BlockPos pos) {
        return PlantType.CROP;
    }
}