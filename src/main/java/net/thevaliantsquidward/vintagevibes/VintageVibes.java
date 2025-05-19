package net.thevaliantsquidward.vintagevibes;

import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.thevaliantsquidward.vintagevibes.block.VVBlocks;
import net.thevaliantsquidward.vintagevibes.data.VVBlockTagProvider;
import net.thevaliantsquidward.vintagevibes.data.VVItemModelProvider;
import net.thevaliantsquidward.vintagevibes.data.VVLangProvider;
import net.thevaliantsquidward.vintagevibes.data.VVBlockstateProvider;
import net.thevaliantsquidward.vintagevibes.entity.VVEntities;
import net.thevaliantsquidward.vintagevibes.entity.client.ButterflyRenderer;
import net.thevaliantsquidward.vintagevibes.item.VVItems;
import net.thevaliantsquidward.vintagevibes.sound.VVSounds;
import net.thevaliantsquidward.vintagevibes.tab.VVCreativeTabs;
import org.slf4j.Logger;

import java.util.Locale;
import java.util.concurrent.CompletableFuture;

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
    }

    private void dataSetup(GatherDataEvent event) {
        DataGenerator dataGenerator = event.getGenerator();
        PackOutput output = dataGenerator.getPackOutput();
        CompletableFuture<Provider> provider = event.getLookupProvider();
        ExistingFileHelper helper = event.getExistingFileHelper();

        boolean client = event.includeClient();
        dataGenerator.addProvider(client, new VVBlockstateProvider(event));
        dataGenerator.addProvider(client, new VVItemModelProvider(event));
        dataGenerator.addProvider(client, new VVLangProvider(event));

        boolean server = event.includeServer();
        VVBlockTagProvider blockTags = new VVBlockTagProvider(output, provider, helper);
        dataGenerator.addProvider(server, blockTags);
    }

    public static ResourceLocation modPrefix(String name) {
        return new ResourceLocation(MOD_ID, name.toLowerCase(Locale.ROOT));
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            EntityRenderers.register(VVEntities.BUTTERFLY.get(), ButterflyRenderer::new);
        }
    }
}
