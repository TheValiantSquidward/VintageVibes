package net.thevaliantsquidward.vintagevibes;

import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.RegistryObject;
import net.thevaliantsquidward.vintagevibes.block.VVBlocks;
import net.thevaliantsquidward.vintagevibes.data.VVLangProvider;
import net.thevaliantsquidward.vintagevibes.data.VVModelProvider;
import net.thevaliantsquidward.vintagevibes.entity.VVEntities;
import net.thevaliantsquidward.vintagevibes.entity.client.ButterflyRenderer;
import net.thevaliantsquidward.vintagevibes.item.VVItems;
import net.thevaliantsquidward.vintagevibes.sound.VVSounds;
import net.thevaliantsquidward.vintagevibes.tab.VVCreativeTabs;
import org.slf4j.Logger;

import java.util.Locale;
import java.util.function.Supplier;

@Mod(VintageVibes.MOD_ID)
public class VintageVibes {

    public static final String MOD_ID = "vintagevibes";

    private static final Logger LOGGER = LogUtils.getLogger();

    public VintageVibes() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);

        VVItems.ITEMS.register(bus);
        VVSounds.SOUNDS.register(bus);
        VVBlocks.BLOCKS.register(bus);
        VVEntities.ENTITIES.register(bus);
        VVCreativeTabs.CREATIVE_TABS.register(bus);

        bus.addListener(this::commonSetup);
        bus.addListener(this::dataSetup);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        addToFlowerPot(VVBlocks.PINK_HIBISCUS, VVBlocks.POTTED_PINK_HIBISCUS);
        addToFlowerPot(VVBlocks.ORANGE_HIBISCUS, VVBlocks.POTTED_ORANGE_HIBISCUS);
        addToFlowerPot(VVBlocks.PURPLE_HIBISCUS, VVBlocks.POTTED_PURPLE_HIBISCUS);
        addToFlowerPot(VVBlocks.RED_HIBISCUS, VVBlocks.POTTED_RED_HIBISCUS);
        addToFlowerPot(VVBlocks.WHITE_HIBISCUS, VVBlocks.POTTED_WHITE_HIBISCUS);

        addToFlowerPot(VVBlocks.BLACK_CALLA, VVBlocks.POTTED_BLACK_CALLA);
        addToFlowerPot(VVBlocks.ORANGE_CALLA, VVBlocks.POTTED_ORANGE_CALLA);
        addToFlowerPot(VVBlocks.YELLOW_CALLA, VVBlocks.POTTED_YELLOW_CALLA);
        addToFlowerPot(VVBlocks.WHITE_CALLA, VVBlocks.POTTED_WHITE_CALLA);

        addToFlowerPot(VVBlocks.ORANGE_BROMELIA, VVBlocks.POTTED_ORANGE_BROMELIA);
        addToFlowerPot(VVBlocks.PINK_BROMELIA, VVBlocks.POTTED_PINK_BROMELIA);
        addToFlowerPot(VVBlocks.PURPLE_BROMELIA, VVBlocks.POTTED_PURPLE_BROMELIA);
        addToFlowerPot(VVBlocks.YELLOW_BROMELIA, VVBlocks.POTTED_YELLOW_BROMELIA);

        addToFlowerPot(VVBlocks.ORANGE_ORCHID, VVBlocks.POTTED_ORANGE_ORCHID);
        addToFlowerPot(VVBlocks.PINK_ORCHID, VVBlocks.POTTED_PINK_ORCHID);
        addToFlowerPot(VVBlocks.WHITE_ORCHID, VVBlocks.POTTED_WHITE_ORCHID);
        addToFlowerPot(VVBlocks.YELLOW_ORCHID, VVBlocks.POTTED_YELLOW_ORCHID);

        addToFlowerPot(VVBlocks.LACELEAF, VVBlocks.POTTED_LACELEAF);

        addToFlowerPot(VVBlocks.TORCH_GINGER, VVBlocks.POTTED_TORCH_GINGER);
    }

    private void dataSetup(GatherDataEvent event) {
        DataGenerator dataGenerator = event.getGenerator();

        boolean client = event.includeClient();
        dataGenerator.addProvider(client, new VVModelProvider(event));
        dataGenerator.addProvider(client, new VVLangProvider(event));

        boolean server = event.includeServer();
    }

    public static ResourceLocation prefix(String name) {
        return new ResourceLocation(MOD_ID, name.toLowerCase(Locale.ROOT));
    }

    public static void addToFlowerPot(RegistryObject<Block> plantBlockLoc, Supplier<? extends Block> pottedPlantBlock){
        ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(plantBlockLoc.getId(),pottedPlantBlock);
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            EntityRenderers.register(VVEntities.BUTTERFLY.get(), ButterflyRenderer::new);
        }
    }
}
