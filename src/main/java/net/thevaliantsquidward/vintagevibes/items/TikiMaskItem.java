package net.thevaliantsquidward.vintagevibes.items;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import net.minecraftforge.event.entity.living.LivingEquipmentChangeEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.thevaliantsquidward.vintagevibes.VintageVibes;
import org.jetbrains.annotations.Nullable;

import java.util.function.Consumer;

public class TikiMaskItem extends ArmorItem {

    public TikiMaskItem(ArmorMaterial armorMaterial, Type type, Properties properties) {
        super(armorMaterial, type, properties);
    }

    @SubscribeEvent
    public static void maskEquippedEvent(LivingEquipmentChangeEvent event) {
        if (event.getEntity().getItemBySlot(EquipmentSlot.HEAD).getItem() instanceof TikiMaskItem) {
            if (event.getEntity() instanceof Player player) {
                player.refreshDisplayName();
            }
        }
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        consumer.accept((IClientItemExtensions) VintageVibes.PROXY.getArmorRenderProperties());
    }

    @Nullable
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
        if (slot == EquipmentSlot.HEAD) {
            return VintageVibes.MOD_ID + ":textures/models/armor/volcanic_tiki_mask.png";
        }
        return VintageVibes.MOD_ID + ":textures/models/armor/celestial_tiki_mask.png";
    }
}
