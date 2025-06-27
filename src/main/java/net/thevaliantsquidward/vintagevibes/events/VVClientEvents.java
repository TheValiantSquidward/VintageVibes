package net.thevaliantsquidward.vintagevibes.events;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.thevaliantsquidward.vintagevibes.VintageVibes;
import net.thevaliantsquidward.vintagevibes.client.models.armor.TikiMaskModel;
import net.thevaliantsquidward.vintagevibes.client.models.entity.ButterflyModel;
import net.thevaliantsquidward.vintagevibes.client.renderer.ButterflyRenderer;
import net.thevaliantsquidward.vintagevibes.registry.VVEntities;
import net.thevaliantsquidward.vintagevibes.registry.VVModelLayers;

@Mod.EventBusSubscriber(modid = VintageVibes.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class VVClientEvents {

    @SubscribeEvent
    public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(VVEntities.BUTTERFLY.get(), ButterflyRenderer::new);
    }

    @SubscribeEvent
    public static void registerEntityLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(VVModelLayers.BUTTERFLY_LAYER, ButterflyModel::createBodyLayer);
        event.registerLayerDefinition(VVModelLayers.TIKI_MASK_LAYER, TikiMaskModel::createArmorLayer);
    }
}
