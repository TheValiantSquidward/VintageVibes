package net.thevaliantsquidward.vintagevibes.blocks.blockentity;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.thevaliantsquidward.vintagevibes.registry.VVBlockEntityTypes;

import javax.annotation.Nonnull;

public class DisplayCaseBlockEntity extends BlockEntity {

    ItemStack displayItem = ItemStack.EMPTY;

    public DisplayCaseBlockEntity(BlockPos pos, BlockState state) {
        super(VVBlockEntityTypes.DISPLAY_CASE.get(), pos, state);
    }

    @Override
    public void load(CompoundTag compoundTag) {
        super.load(compoundTag);
        this.setDisplayItem(ItemStack.of(compoundTag.getCompound("DisplayItem")));
    }

    @Override
    protected void saveAdditional(CompoundTag compoundTag) {
        super.saveAdditional(compoundTag);
        if (!this.getDisplayItem().isEmpty()) {
            compoundTag.put("DisplayItem", this.getDisplayItem().save(new CompoundTag()));
        }
    }

    @Override
    public CompoundTag getUpdateTag() {
        CompoundTag compoundTag = new CompoundTag();
        if (!this.getDisplayItem().isEmpty()) {
            compoundTag.put("DisplayItem", this.getDisplayItem().save(new CompoundTag()));
        }
        return compoundTag;
    }

    @Override
    public Packet<ClientGamePacketListener> getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    public ItemStack getDisplayItem() {
        return this.displayItem;
    }

    public void setDisplayItem(ItemStack item) {
        this.displayItem = item;
    }

    @Nonnull
    @Override
    public BlockEntityType<?> getType() {
        return VVBlockEntityTypes.DISPLAY_CASE.get();
    }
}
