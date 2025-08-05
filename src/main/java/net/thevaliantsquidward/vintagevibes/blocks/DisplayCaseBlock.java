package net.thevaliantsquidward.vintagevibes.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.Containers;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.thevaliantsquidward.vintagevibes.blocks.blockentity.DisplayCaseBlockEntity;
import org.jetbrains.annotations.Nullable;

public class DisplayCaseBlock extends Block implements EntityBlock {

    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

    public DisplayCaseBlock(Properties pProperties) {
        super(pProperties);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {
        BlockEntity entity = level.getBlockEntity(pos);
        ItemStack itemstack = player.getItemInHand(hand);
        if (entity instanceof DisplayCaseBlockEntity itemDisplay) {
            if (itemDisplay.getDisplayItem().isEmpty()) {
                itemDisplay.setDisplayItem(itemstack.copy());
                if (!player.isCreative() && !player.getAbilities().instabuild) {
                    itemstack.shrink(1);
                }
                return InteractionResult.sidedSuccess(level.isClientSide());
            } else if (itemstack.isEmpty()) {
                if (!player.isCreative() && !player.getAbilities().instabuild) {
                    if (!player.addItem(new ItemStack(itemstack.getItem()))) {
                        player.spawnAtLocation(itemDisplay.getDisplayItem().getItem());
                    }
                }
                itemDisplay.setDisplayItem(ItemStack.EMPTY);
                return InteractionResult.sidedSuccess(level.isClientSide());
            }
        }
        return super.use(state, level, pos, player, hand, hitResult);
    }

    @Override
    public void onRemove(BlockState state, Level level, BlockPos pos, BlockState newState, boolean isMoving) {
        if (!state.is(newState.getBlock())) {
            BlockEntity entity = level.getBlockEntity(pos);
            if (entity instanceof DisplayCaseBlockEntity itemStand && !itemStand.getDisplayItem().isEmpty()) {
                Containers.dropItemStack(level, pos.getX(), pos.getY(), pos.getZ(), itemStand.getDisplayItem());
            }
            super.onRemove(state, level, pos, newState, isMoving);
        }
    }

    @Override
    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
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
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> stateBuilder) {
        stateBuilder.add(FACING);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new DisplayCaseBlockEntity(pPos, pState);
    }
}
