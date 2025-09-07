package net.thevaliantsquidward.vintagevibes.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.SkullBlock;
import net.minecraft.world.level.block.WallSkullBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.thevaliantsquidward.vintagevibes.blocks.blockentity.VVSkullBlockEntity;
import org.jetbrains.annotations.NotNull;

public class VVWallSkullBlock extends WallSkullBlock {

    public VVWallSkullBlock(SkullBlock.Type type, Properties properties) {
        super(type, properties);
        VVSkullBlockEntity.SKULLS.add(this);
    }

    @NotNull
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new VVSkullBlockEntity(pos, state);
    }
}