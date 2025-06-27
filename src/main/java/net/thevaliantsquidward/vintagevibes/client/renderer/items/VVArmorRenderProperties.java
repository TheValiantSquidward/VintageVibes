package net.thevaliantsquidward.vintagevibes.client.renderer.items;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import net.thevaliantsquidward.vintagevibes.client.models.armor.MaskModel;
import net.thevaliantsquidward.vintagevibes.items.MaskItem;
import net.thevaliantsquidward.vintagevibes.registry.VVModelLayers;

public class VVArmorRenderProperties implements IClientItemExtensions {

    private static boolean init;

    public static MaskModel TIKI_MASK;

    public static void initializeModels() {
        init = true;
        TIKI_MASK = new MaskModel(Minecraft.getInstance().getEntityModels().bakeLayer(VVModelLayers.TIKI_MASK_LAYER));
    }

    @Override
    public HumanoidModel<?> getHumanoidArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlot armorSlot, HumanoidModel<?> humanoidModel) {

        if (!init) {
            initializeModels();
        }

        final var item = itemStack.getItem();

        if (item instanceof MaskItem) {
            return TIKI_MASK;
        }

        return humanoidModel;
    }
}