package net.thevaliantsquidward.vintagevibes.items;

import net.minecraft.ChatFormatting;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.StandingAndWallBlockItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

import javax.annotation.Nullable;
import java.util.List;

public class TrinketSkullItem extends StandingAndWallBlockItem {

    public TrinketSkullItem(Block floorBlock, Block wallBlock, Properties properties, Direction direction) {
        super(floorBlock, wallBlock, properties, direction);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> component, TooltipFlag flag) {
        component.add(this.getDisplayName().withStyle(ChatFormatting.GRAY).withStyle(ChatFormatting.ITALIC));
    }

    public MutableComponent getDisplayName() {
        return Component.translatable(this.getDescriptionId() + ".desc");
    }
}
