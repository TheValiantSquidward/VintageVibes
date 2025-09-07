package net.thevaliantsquidward.vintagevibes.blocks.blockentity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SkullBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.thevaliantsquidward.vintagevibes.registry.VVBlockEntityTypes;
import org.jetbrains.annotations.NotNull;

import java.util.HashSet;

public class VVSkullBlockEntity extends SkullBlockEntity {

    public static HashSet<Block> SKULLS = new HashSet<>();

    public VVSkullBlockEntity(BlockPos pos, BlockState state) {
        super(pos, state);
    }

    @NotNull
    @Override
    public BlockEntityType<?> getType() {
        return VVBlockEntityTypes.SKULL.get();
    }
}