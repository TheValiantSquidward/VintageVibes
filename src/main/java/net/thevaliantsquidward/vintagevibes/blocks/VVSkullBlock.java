package net.thevaliantsquidward.vintagevibes.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SkullBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.thevaliantsquidward.vintagevibes.blocks.blockentity.VVSkullBlockEntity;
import org.jetbrains.annotations.NotNull;

public class VVSkullBlock extends SkullBlock {

    protected static final VoxelShape SHAPE = Block.box(4.0D, 0.0D, 4.0D, 12.0D, 8.0D, 12.0D);
    protected static final VoxelShape GOLDEN_HEAD_SHAPE = Block.box(2.0D, 0.0D, 2.0D, 14.0D, 12.0D, 14.0D);

    public VVSkullBlock(Type pType, Properties pProperties) {
        super(pType, pProperties);
        VVSkullBlockEntity.SKULLS.add(this);
    }

    @Override
    @NotNull
    public VoxelShape getShape(BlockState state, BlockGetter blockGetter, BlockPos pos, CollisionContext context) {
        return this.getType() == Types.GOLDEN_HEAD ? GOLDEN_HEAD_SHAPE : SHAPE;
    }

    @Override
    @NotNull
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new VVSkullBlockEntity(pos, state);
    }

    public VVSkullBlock.Types getSkullType() {
        return (Types) this.getType();
    }

    public enum Types implements SkullBlock.Type {
        GOLDEN_HEAD
    }
}