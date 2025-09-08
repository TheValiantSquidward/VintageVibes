package net.thevaliantsquidward.vintagevibes.blocks;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SkullBlock;
import net.minecraft.world.level.block.WallSkullBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.thevaliantsquidward.vintagevibes.blocks.blockentity.VVSkullBlockEntity;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public class VVWallSkullBlock extends WallSkullBlock {

    private static final Map<Direction, VoxelShape> AABBS = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Block.box(4.0D, 4.0D, 8.0D, 12.0D, 12.0D, 16.0D),
            Direction.SOUTH, Block.box(4.0D, 4.0D, 0.0D, 12.0D, 12.0D, 8.0D),
            Direction.EAST, Block.box(0.0D, 4.0D, 4.0D, 8.0D, 12.0D, 12.0D),
            Direction.WEST, Block.box(8.0D, 4.0D, 4.0D, 16.0D, 12.0D, 12.0D)
    ));

    private static final Map<Direction, VoxelShape> GOLDEN_HEAD_AABBS = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Block.box(2.0D, 2.0D, 4.0D, 14.0D, 14.0D, 16.0D),
            Direction.SOUTH, Block.box(2.0D, 2.0D, 0.0D, 14.0D, 14.0D, 12.0D),
            Direction.WEST,  Block.box(4.0D, 2.0D, 2.0D, 16.0D, 14.0D, 14.0D),
            Direction.EAST,  Block.box(0.0D, 2.0D, 2.0D, 12.0D, 14.0D, 14.0D)
    ));

    public VVWallSkullBlock(SkullBlock.Type type, Properties properties) {
        super(type, properties);
        VVSkullBlockEntity.SKULLS.add(this);
    }

    @Override
    @NotNull
    public VoxelShape getShape(BlockState state, BlockGetter blockGetter, BlockPos pos, CollisionContext context) {
        return this.getType() == VVSkullBlock.Types.GOLDEN_HEAD ? GOLDEN_HEAD_AABBS.get(state.getValue(FACING)) : AABBS.get(state.getValue(FACING));
    }

    @NotNull
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new VVSkullBlockEntity(pos, state);
    }
}