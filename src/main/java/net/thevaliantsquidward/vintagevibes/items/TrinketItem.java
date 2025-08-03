package net.thevaliantsquidward.vintagevibes.items;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class TrinketItem extends Item {
    public TrinketItem(Properties p_41383_) {
        super(p_41383_);
    }

    public void appendHoverText(ItemStack p_43043_, @Nullable Level p_43044_, List<Component> p_43045_, TooltipFlag p_43046_) {
        p_43045_.add(this.getDisplayName().withStyle(ChatFormatting.GRAY));
    }

    public MutableComponent getDisplayName() {
        return Component.translatable(this.getDescriptionId() + ".desc");
    }

}
