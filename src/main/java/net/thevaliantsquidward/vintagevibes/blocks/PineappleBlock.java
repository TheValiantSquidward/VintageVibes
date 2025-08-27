package net.thevaliantsquidward.vintagevibes.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.common.ToolActions;
import net.thevaliantsquidward.vintagevibes.blocks.interfaces.RipeningPineapple;
import net.thevaliantsquidward.vintagevibes.registry.VVBlocks;

public class PineappleBlock extends Block implements RipeningPineapple {

    public static final DirectionProperty FACING = BlockStateProperties.FACING;

    private final RipeningPineapple.RipenState ripenState;

    public PineappleBlock(RipeningPineapple.RipenState ripenState, BlockBehaviour.Properties properties) {
        super(properties);
        this.ripenState = ripenState;
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.UP));
    }

    @Override
    public BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
        ItemStack itemStack = context.getItemInHand();
        if (!itemStack.canPerformAction(toolAction)) return null;

        if (ToolActions.AXE_STRIP == toolAction) {
            if (this == VVBlocks.GREEN_PINEAPPLE.get() || this == VVBlocks.SPOTTED_PINEAPPLE.get() || this == VVBlocks.PINEAPPLE.get()) {
                return VVBlocks.SKINNED_PINEAPPLE.get().defaultBlockState().setValue(FACING, state.getValue(FACING));
            }
            if (this == VVBlocks.GREEN_PINEAPPLE_SCALE_BLOCK.get() || this == VVBlocks.SPOTTED_PINEAPPLE_SCALE_BLOCK.get() || this == VVBlocks.PINEAPPLE_SCALE_BLOCK.get()) {
                return VVBlocks.PINEAPPLE_FLESH_BLOCK.get().defaultBlockState().setValue(FACING, state.getValue(FACING));
            }
        }
        return super.getToolModifiedState(state, context, toolAction, simulate);
    }

    @Override
    public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        this.onRandomTick(state, level, pos, random);
    }

    @Override
    public boolean isRandomlyTicking(BlockState state) {
        return RipeningPineapple.getNext(state.getBlock()).isPresent();
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getPlayer() == null || context.getPlayer().isCrouching() ? context.getNearestLookingDirection().getOpposite() : context.getClickedFace());
    }

    @Override
    public BlockState rotate(BlockState state, Rotation rotation) {
        return state.setValue(FACING, rotation.rotate(state.getValue(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, Mirror mirror) {
        return state.rotate(mirror.getRotation(state.getValue(FACING)));
    }

    @Override
    public RipenState getAge() {
        return this.ripenState;
    }
}
