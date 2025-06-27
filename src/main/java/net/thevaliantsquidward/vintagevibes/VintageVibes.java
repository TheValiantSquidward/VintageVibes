package net.thevaliantsquidward.vintagevibes;

import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.thevaliantsquidward.vintagevibes.data.*;
import net.thevaliantsquidward.vintagevibes.registry.*;
import net.thevaliantsquidward.vintagevibes.utils.*;

import java.util.Locale;
import java.util.concurrent.CompletableFuture;

@Mod(VintageVibes.MOD_ID)
public class VintageVibes {

    public static final String MOD_ID = "vintagevibes";
    public static final CommonProxy PROXY = DistExecutor.safeRunForDist(() -> ClientProxy::new, () -> CommonProxy::new);


    public VintageVibes() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::commonSetup);
        bus.addListener(this::clientSetup);
        bus.addListener(this::dataSetup);

        VVItems.ITEMS.register(bus);
        VVSoundEvents.SOUNDS.register(bus);
        VVBlocks.BLOCKS.register(bus);
        VVEntities.ENTITIES.register(bus);
        VVCreativeTab.CREATIVE_TABS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
        PROXY.init();
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(VVCompat::registerCompat);
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        event.enqueueWork(PROXY::clientInit);
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
        dataGenerator.addProvider(server, new VVItemTagProvider(output, provider, blockTags.contentsGetter(), helper));
        dataGenerator.addProvider(server, new VVRecipeProvider(output));
    }

    public static ResourceLocation modPrefix(String name) {
        return new ResourceLocation(MOD_ID, name.toLowerCase(Locale.ROOT));
    }
}
