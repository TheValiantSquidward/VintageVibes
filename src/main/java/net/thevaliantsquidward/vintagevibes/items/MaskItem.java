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
import net.thevaliantsquidward.vintagevibes.registry.VVItems;
import org.jetbrains.annotations.Nullable;

import java.util.function.Consumer;

import static net.thevaliantsquidward.vintagevibes.registry.VVItems.*;

public class MaskItem extends ArmorItem {

    public MaskItem(ArmorMaterial armorMaterial, Type type, Properties properties) {
        super(armorMaterial, type, properties);
    }

    @SubscribeEvent
    public static void maskEquippedEvent(LivingEquipmentChangeEvent event) {
        if (event.getEntity().getItemBySlot(EquipmentSlot.HEAD).getItem() instanceof MaskItem) {
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
            if (stack.is(CELESTIAL_MASK.get())) {
                return VintageVibes.MOD_ID + ":textures/models/armor/celestial_mask.png";
            }
            if (stack.is(DEITY_MASK.get())) {
                return VintageVibes.MOD_ID + ":textures/models/armor/deity_mask.png";
            }
            if (stack.is(FESTIVE_MASK.get())) {
                return VintageVibes.MOD_ID + ":textures/models/armor/festive_mask.png";
            }
            if (stack.is(FROND_MASK.get())) {
                return VintageVibes.MOD_ID + ":textures/models/armor/frond_mask.png";
            }
            if (stack.is(MONSOON_MASK.get())) {
                return VintageVibes.MOD_ID + ":textures/models/armor/monsoon_mask.png";
            }
            if (stack.is(PETRIFIED_MASK.get())) {
                return VintageVibes.MOD_ID + ":textures/models/armor/petrified_mask.png";
            }
            if (stack.is(SPIRIT_MASK.get())) {
                return VintageVibes.MOD_ID + ":textures/models/armor/spirit_mask.png";
            }
            if (stack.is(SUNRISE_MASK.get())) {
                return VintageVibes.MOD_ID + ":textures/models/armor/sunrise_mask.png";
            }
            if (stack.is(TIDAL_MASK.get())) {
                return VintageVibes.MOD_ID + ":textures/models/armor/tidal_mask.png";
            }
            if (stack.is(VOLCANIC_MASK.get())) {
                return VintageVibes.MOD_ID + ":textures/models/armor/volcanic_mask.png";
            }
        }
        return VintageVibes.MOD_ID + ":textures/models/armor/celestial_mask.png";
    }
}
