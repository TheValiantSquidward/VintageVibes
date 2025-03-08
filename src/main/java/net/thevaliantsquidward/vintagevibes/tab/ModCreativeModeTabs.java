package net.thevaliantsquidward.vintagevibes.tab;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.thevaliantsquidward.vintagevibes.VintageVibes;
import net.thevaliantsquidward.vintagevibes.block.ModBlocks;
import net.thevaliantsquidward.vintagevibes.item.ModItems;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, VintageVibes.MOD_ID);

    public static final RegistryObject<CreativeModeTab> RAINBOW_REEF_TAB = CREATIVE_MODE_TABS.register("rainbow_reef_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.PINK_HIBISCUS.get()))
                    .title(Component.translatable("creativetab.vintage_vibes_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModItems.GARNET.get());
                        pOutput.accept(ModItems.PERIDOT.get());
                        pOutput.accept(ModItems.TOPAZ.get());

                        pOutput.accept(ModItems.ROUGH_GARNET.get());
                        pOutput.accept(ModItems.ROUGH_PERIDOT.get());
                        pOutput.accept(ModItems.ROUGH_TOPAZ.get());

                        pOutput.accept(ModBlocks.GARNET_BLOCK.get());
                        pOutput.accept(ModBlocks.PERIDOT_BLOCK.get());
                        pOutput.accept(ModBlocks.TOPAZ_BLOCK.get());

                        pOutput.accept(ModBlocks.ROUGH_GARNET_BLOCK.get());
                        pOutput.accept(ModBlocks.ROUGH_PERIDOT_BLOCK.get());
                        pOutput.accept(ModBlocks.ROUGH_TOPAZ_BLOCK.get());

                        pOutput.accept(ModBlocks.GARNET_TILES.get());
                        pOutput.accept(ModBlocks.PERIDOT_TILES.get());
                        pOutput.accept(ModBlocks.TOPAZ_TILES.get());

                        pOutput.accept(ModBlocks.ORANGE_HIBISCUS.get());
                        pOutput.accept(ModBlocks.PINK_HIBISCUS.get());
                        pOutput.accept(ModBlocks.PURPLE_HIBISCUS.get());
                        pOutput.accept(ModBlocks.WHITE_HIBISCUS.get());

                        pOutput.accept(ModBlocks.ORANGE_HIBISCUS_CARPET.get());
                        pOutput.accept(ModBlocks.PINK_HIBISCUS_CARPET.get());
                        pOutput.accept(ModBlocks.PURPLE_HIBISCUS_CARPET.get());
                        pOutput.accept(ModBlocks.WHITE_HIBISCUS_CARPET.get());

                        pOutput.accept(ModBlocks.BLACK_CALLA.get());
                        pOutput.accept(ModBlocks.ORANGE_CALLA.get());
                        pOutput.accept(ModBlocks.WHITE_CALLA.get());
                        pOutput.accept(ModBlocks.YELLOW_CALLA.get());

                        pOutput.accept(ModBlocks.BIRD_OF_PARADISE.get());

                        pOutput.accept(ModBlocks.LACELEAF.get());
                        pOutput.accept(ModBlocks.TALL_LACELEAF.get());

                        pOutput.accept(ModBlocks.CARVED_SANDSTONE_CONCERNED.get());
                        pOutput.accept(ModBlocks.CARVED_SANDSTONE_DISAPPOINTED.get());
                        pOutput.accept(ModBlocks.CARVED_SANDSTONE_FISHEYE.get());
                        pOutput.accept(ModBlocks.CARVED_SANDSTONE_GRIN.get());
                        pOutput.accept(ModBlocks.CARVED_SANDSTONE_JOYOUS.get());
                        pOutput.accept(ModBlocks.CARVED_SANDSTONE_LAZYBONES.get());
                        pOutput.accept(ModBlocks.CARVED_SANDSTONE_NOSE.get());
                        pOutput.accept(ModBlocks.CARVED_SANDSTONE_OPEN.get());

                        pOutput.accept(ModBlocks.RED_CARVED_SANDSTONE_BOLD_AND_BRASH.get());
                        pOutput.accept(ModBlocks.RED_CARVED_SANDSTONE_CLOSED.get());
                        pOutput.accept(ModBlocks.RED_CARVED_SANDSTONE_EXCITED.get());
                        pOutput.accept(ModBlocks.RED_CARVED_SANDSTONE_FROWN.get());
                        pOutput.accept(ModBlocks.RED_CARVED_SANDSTONE_HAPPY.get());
                        pOutput.accept(ModBlocks.RED_CARVED_SANDSTONE_LIPS.get());
                        pOutput.accept(ModBlocks.RED_CARVED_SANDSTONE_SAD.get());
                        pOutput.accept(ModBlocks.RED_CARVED_SANDSTONE_TOUCH.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}