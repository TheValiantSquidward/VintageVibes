package net.thevaliantsquidward.vintagevibes;

import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.RegistryObject;
import net.thevaliantsquidward.vintagevibes.block.ModBlocks;
import net.thevaliantsquidward.vintagevibes.entity.ModEntities;
import net.thevaliantsquidward.vintagevibes.entity.client.ButterflyRenderer;
import net.thevaliantsquidward.vintagevibes.item.ModItems;
import net.thevaliantsquidward.vintagevibes.tab.ModCreativeModeTabs;
import org.slf4j.Logger;

import java.util.Locale;
import java.util.function.Supplier;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(VintageVibes.MOD_ID)
public class VintageVibes
{

    public static final String MOD_ID = "vintagevibes";

    private static final Logger LOGGER = LogUtils.getLogger();

    public VintageVibes()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.BLOCKS.register(modEventBus);
        ModEntities.register(modEventBus);
        ModCreativeModeTabs.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);

    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        addToFlowerPot(ModBlocks.PINK_HIBISCUS, ModBlocks.POTTED_PINK_HIBISCUS);
        addToFlowerPot(ModBlocks.ORANGE_HIBISCUS, ModBlocks.POTTED_ORANGE_HIBISCUS);
        addToFlowerPot(ModBlocks.PURPLE_HIBISCUS, ModBlocks.POTTED_PURPLE_HIBISCUS);
        addToFlowerPot(ModBlocks.WHITE_HIBISCUS, ModBlocks.POTTED_WHITE_HIBISCUS);

        addToFlowerPot(ModBlocks.BLACK_CALLA, ModBlocks.POTTED_BLACK_CALLA);
        addToFlowerPot(ModBlocks.ORANGE_CALLA, ModBlocks.POTTED_ORANGE_CALLA);
        addToFlowerPot(ModBlocks.YELLOW_CALLA, ModBlocks.POTTED_YELLOW_CALLA);
        addToFlowerPot(ModBlocks.WHITE_CALLA, ModBlocks.POTTED_WHITE_CALLA);

        addToFlowerPot(ModBlocks.LACELEAF, ModBlocks.POTTED_LACELEAF);

    }
    public static ResourceLocation prefix(String name) {
        return new ResourceLocation(MOD_ID, name.toLowerCase(Locale.ROOT));
    }
    public static void addToFlowerPot(RegistryObject<Block> plantBlockLoc, Supplier<? extends Block> pottedPlantBlock){
        ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(plantBlockLoc.getId(),pottedPlantBlock);
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            EntityRenderers.register(ModEntities.BUTTERFLY.get(), ButterflyRenderer::new);
        }
    }
}
