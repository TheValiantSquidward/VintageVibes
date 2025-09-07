package net.thevaliantsquidward.vintagevibes.events;

import com.google.common.collect.Maps;
import net.minecraft.Util;
import net.minecraft.client.renderer.blockentity.SkullBlockRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.SkullBlock;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.thevaliantsquidward.vintagevibes.VintageVibes;
import net.thevaliantsquidward.vintagevibes.blocks.VVSkullBlock;
import net.thevaliantsquidward.vintagevibes.client.models.armor.*;
import net.thevaliantsquidward.vintagevibes.client.models.entity.*;
import net.thevaliantsquidward.vintagevibes.client.models.skull.*;
import net.thevaliantsquidward.vintagevibes.client.renderer.*;
import net.thevaliantsquidward.vintagevibes.client.renderer.blockentities.*;
import net.thevaliantsquidward.vintagevibes.registry.*;

import java.util.Map;

@Mod.EventBusSubscriber(modid = VintageVibes.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class VVClientEvents {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        SkullBlockRenderer.SKIN_BY_TYPE.putAll(Util.make(Maps.newHashMap(), VVClientEvents::addSkull));
    }

    @SubscribeEvent
    public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(VVEntities.BUTTERFLY.get(), ButterflyRenderer::new);
    }

    @SubscribeEvent
    public static void registerEntityLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(VVModelLayers.BUTTERFLY, ButterflyModel::createBodyLayer);
        event.registerLayerDefinition(VVModelLayers.BIG_MASK, MaskModel::createArmorLayer);
        event.registerLayerDefinition(VVModelLayers.GOLDEN_HEAD, GoldenHeadModel::createSkullLayer);
    }

    @SubscribeEvent
    public static void registerBlockEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(VVBlockEntityTypes.DISPLAY_CASE.get(), DisplayCaseRenderer::new);
        event.registerBlockEntityRenderer(VVBlockEntityTypes.SKULL.get(), SkullBlockRenderer::new);
    }

    public static void addSkull(Map<SkullBlock.Type, ResourceLocation> map) {
        for (VVSkullBlock.Type type : VVSkullBlock.Types.values()) {
            map.put(type, VintageVibes.modPrefix("textures/entity/skulls/" + type.toString().toLowerCase() + ".png"));
        }
    }

    @SubscribeEvent
    public static void onCreateSkullModels(EntityRenderersEvent.CreateSkullModels event) {
        event.registerSkullModel(VVSkullBlock.Types.GOLDEN_HEAD, new GoldenHeadModel(event.getEntityModelSet().bakeLayer(VVModelLayers.GOLDEN_HEAD)));
    }
}
