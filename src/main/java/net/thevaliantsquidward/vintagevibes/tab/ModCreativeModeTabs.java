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

    public static final RegistryObject<CreativeModeTab> VINTAGE_VIBES_TAB = CREATIVE_MODE_TABS.register("vintage_vibes_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.CARVED_SANDSTONE_GRIN.get()))
                    .title(Component.translatable("creativetab.vintage_vibes_tab"))
                    .displayItems((pParameters, pOutput) -> {


                        //gem blocks
                        pOutput.accept(ModBlocks.AQUAMARINE_BLOCK.get());
                        pOutput.accept(ModBlocks.ROUGH_AQUAMARINE_BLOCK.get());
                        pOutput.accept(ModBlocks.AQUAMARINE_TILES.get());

                        pOutput.accept(ModBlocks.AMBER_BLOCK.get());
                        pOutput.accept(ModBlocks.ROUGH_AMBER_BLOCK.get());
                        pOutput.accept(ModBlocks.AMBER_TILES.get());

                        pOutput.accept(ModBlocks.ENSTATITE_BLOCK.get());
                        pOutput.accept(ModBlocks.ROUGH_ENSTATITE_BLOCK.get());
                        pOutput.accept(ModBlocks.ENSTATITE_TILES.get());

                        pOutput.accept(ModBlocks.GARNET_BLOCK.get());
                        pOutput.accept(ModBlocks.ROUGH_GARNET_BLOCK.get());
                        pOutput.accept(ModBlocks.GARNET_TILES.get());

                        pOutput.accept(ModBlocks.JADE_BLOCK.get());
                        pOutput.accept(ModBlocks.ROUGH_JADE_BLOCK.get());
                        pOutput.accept(ModBlocks.JADE_TILES.get());

                        pOutput.accept(ModBlocks.KUNZITE_BLOCK.get());
                        pOutput.accept(ModBlocks.ROUGH_KUNZITE_BLOCK.get());
                        pOutput.accept(ModBlocks.KUNZITE_TILES.get());

                        pOutput.accept(ModBlocks.LARIMAR_BLOCK.get());
                        pOutput.accept(ModBlocks.ROUGH_LARIMAR_BLOCK.get());
                        pOutput.accept(ModBlocks.LARIMAR_TILES.get());

                        pOutput.accept(ModBlocks.MILKY_QUARTZ_BLOCK.get());
                        pOutput.accept(ModBlocks.ROUGH_MILKY_QUARTZ_BLOCK.get());
                        pOutput.accept(ModBlocks.MILKY_QUARTZ_TILES.get());

                        pOutput.accept(ModBlocks.MOONSTONE_BLOCK.get());
                        pOutput.accept(ModBlocks.ROUGH_MOONSTONE_BLOCK.get());
                        pOutput.accept(ModBlocks.MOONSTONE_TILES.get());

                        pOutput.accept(ModBlocks.ONYX_BLOCK.get());
                        pOutput.accept(ModBlocks.ROUGH_ONYX_BLOCK.get());
                        pOutput.accept(ModBlocks.ONYX_TILES.get());

                        pOutput.accept(ModBlocks.PERIDOT_BLOCK.get());
                        pOutput.accept(ModBlocks.ROUGH_PERIDOT_BLOCK.get());
                        pOutput.accept(ModBlocks.PERIDOT_TILES.get());

                        pOutput.accept(ModBlocks.ROSE_QUARTZ_BLOCK.get());
                        pOutput.accept(ModBlocks.ROUGH_ROSE_QUARTZ_BLOCK.get());
                        pOutput.accept(ModBlocks.ROSE_QUARTZ_TILES.get());

                        pOutput.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        pOutput.accept(ModBlocks.ROUGH_SAPPHIRE_BLOCK.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_TILES.get());

                        pOutput.accept(ModBlocks.SMOKY_QUARTZ_BLOCK.get());
                        pOutput.accept(ModBlocks.ROUGH_SMOKY_QUARTZ_BLOCK.get());
                        pOutput.accept(ModBlocks.SMOKY_QUARTZ_TILES.get());

                        pOutput.accept(ModBlocks.TAAFFEITE_BLOCK.get());
                        pOutput.accept(ModBlocks.ROUGH_TAAFFEITE_BLOCK.get());
                        pOutput.accept(ModBlocks.TAAFFEITE_TILES.get());

                        pOutput.accept(ModBlocks.TOPAZ_BLOCK.get());
                        pOutput.accept(ModBlocks.ROUGH_TOPAZ_BLOCK.get());
                        pOutput.accept(ModBlocks.TOPAZ_TILES.get());

                        //crystal stand
                        pOutput.accept(ModBlocks.AMBER_STAND.get());

                        //vanilla gem blocks
                        pOutput.accept(ModBlocks.AMETHYST_TILES.get());
                        pOutput.accept(ModBlocks.DIAMOND_TILES.get());
                        pOutput.accept(ModBlocks.EMERALD_TILES.get());
                        pOutput.accept(ModBlocks.QUARTZ_TILES.get());

                        pOutput.accept(ModBlocks.STARRY_AMETHYST_CALCITE_TILES.get());
                        pOutput.accept(ModBlocks.STARRY_DIAMOND_CALCITE_TILES.get());
                        pOutput.accept(ModBlocks.STARRY_EMERALD_CALCITE_TILES.get());
                        pOutput.accept(ModBlocks.STARRY_QUARTZ_CALCITE_TILES.get());

                        pOutput.accept(ModBlocks.AMETHYST_BEJEWELED_CALCITE_BRICKS.get());
                        pOutput.accept(ModBlocks.DIAMOND_BEJEWELED_CALCITE_BRICKS.get());
                        pOutput.accept(ModBlocks.EMERALD_BEJEWELED_CALCITE_BRICKS.get());
                        pOutput.accept(ModBlocks.QUARTZ_BEJEWELED_CALCITE_BRICKS.get());


                        //calcite tiles
                        pOutput.accept(ModBlocks.CALCITE_TILES.get());
                        pOutput.accept(ModBlocks.STARRY_AMBER_CALCITE_TILES.get());
                        pOutput.accept(ModBlocks.STARRY_AQUAMARINE_CALCITE_TILES.get());
                        pOutput.accept(ModBlocks.STARRY_ENSTATITE_CALCITE_TILES.get());
                        pOutput.accept(ModBlocks.STARRY_GARNET_CALCITE_TILES.get());
                        pOutput.accept(ModBlocks.STARRY_JADE_CALCITE_TILES.get());
                        pOutput.accept(ModBlocks.STARRY_KUNZITE_CALCITE_TILES.get());
                        pOutput.accept(ModBlocks.STARRY_LARIMAR_CALCITE_TILES.get());
                        pOutput.accept(ModBlocks.STARRY_MILKY_QUARTZ_CALCITE_TILES.get());
                        pOutput.accept(ModBlocks.STARRY_MOONSTONE_CALCITE_TILES.get());
                        pOutput.accept(ModBlocks.STARRY_ONYX_CALCITE_TILES.get());
                        pOutput.accept(ModBlocks.STARRY_PERIDOT_CALCITE_TILES.get());
                        pOutput.accept(ModBlocks.STARRY_ROSE_QUARTZ_CALCITE_TILES.get());
                        pOutput.accept(ModBlocks.STARRY_SAPPHIRE_CALCITE_TILES.get());
                        pOutput.accept(ModBlocks.STARRY_SMOKY_QUARTZ_CALCITE_TILES.get());
                        pOutput.accept(ModBlocks.STARRY_TAAFFEITE_CALCITE_TILES.get());
                        pOutput.accept(ModBlocks.STARRY_TOPAZ_CALCITE_TILES.get());

                        //calcite bricks
                        pOutput.accept(ModBlocks.CALCITE_BRICKS.get());
                        pOutput.accept(ModBlocks.AMBER_BEJEWELED_CALCITE_BRICKS.get());
                        pOutput.accept(ModBlocks.AQUAMARINE_BEJEWELED_CALCITE_BRICKS.get());
                        pOutput.accept(ModBlocks.ENSTATITE_BEJEWELED_CALCITE_BRICKS.get());
                        pOutput.accept(ModBlocks.GARNET_BEJEWELED_CALCITE_BRICKS.get());
                        pOutput.accept(ModBlocks.JADE_BEJEWELED_CALCITE_BRICKS.get());
                        pOutput.accept(ModBlocks.KUNZITE_BEJEWELED_CALCITE_BRICKS.get());
                        pOutput.accept(ModBlocks.LARIMAR_BEJEWELED_CALCITE_BRICKS.get());
                        pOutput.accept(ModBlocks.MILKY_QUARTZ_BEJEWELED_CALCITE_BRICKS.get());
                        pOutput.accept(ModBlocks.MOONSTONE_BEJEWELED_CALCITE_BRICKS.get());
                        pOutput.accept(ModBlocks.ONYX_BEJEWELED_CALCITE_BRICKS.get());
                        pOutput.accept(ModBlocks.PERIDOT_BEJEWELED_CALCITE_BRICKS.get());
                        pOutput.accept(ModBlocks.ROSE_QUARTZ_BEJEWELED_CALCITE_BRICKS.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_BEJEWELED_CALCITE_BRICKS.get());
                        pOutput.accept(ModBlocks.SMOKY_QUARTZ_BEJEWELED_CALCITE_BRICKS.get());
                        pOutput.accept(ModBlocks.TAAFFEITE_BEJEWELED_CALCITE_BRICKS.get());
                        pOutput.accept(ModBlocks.TOPAZ_BEJEWELED_CALCITE_BRICKS.get());

                        //plants
                        pOutput.accept(ModBlocks.ORANGE_HIBISCUS.get());
                        pOutput.accept(ModBlocks.PINK_HIBISCUS.get());
                        pOutput.accept(ModBlocks.PURPLE_HIBISCUS.get());
                        pOutput.accept(ModBlocks.WHITE_HIBISCUS.get());

                        pOutput.accept(ModBlocks.TALL_ORANGE_HIBISCUS.get());
                        pOutput.accept(ModBlocks.TALL_PINK_HIBISCUS.get());
                        pOutput.accept(ModBlocks.TALL_PURPLE_HIBISCUS.get());
                        pOutput.accept(ModBlocks.TALL_WHITE_HIBISCUS.get());

                        pOutput.accept(ModBlocks.ORANGE_HIBISCUS_CARPET.get());
                        pOutput.accept(ModBlocks.PINK_HIBISCUS_CARPET.get());
                        pOutput.accept(ModBlocks.PURPLE_HIBISCUS_CARPET.get());
                        pOutput.accept(ModBlocks.WHITE_HIBISCUS_CARPET.get());

                        pOutput.accept(ModBlocks.BLACK_CALLA.get());
                        pOutput.accept(ModBlocks.ORANGE_CALLA.get());
                        pOutput.accept(ModBlocks.WHITE_CALLA.get());
                        pOutput.accept(ModBlocks.YELLOW_CALLA.get());

                        pOutput.accept(ModBlocks.ORANGE_BROMELIA.get());
                        pOutput.accept(ModBlocks.PINK_BROMELIA.get());
                        pOutput.accept(ModBlocks.YELLOW_BROMELIA.get());

                        pOutput.accept(ModBlocks.ORANGE_ORCHID.get());
                        pOutput.accept(ModBlocks.PINK_ORCHID.get());
                        pOutput.accept(ModBlocks.YELLOW_ORCHID.get());

                        pOutput.accept(ModBlocks.BIRD_OF_PARADISE.get());
                        pOutput.accept(ModBlocks.CANNA_LILY.get());

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
                        pOutput.accept(ModBlocks.CARVED_SANDSTONE_SPIRAL.get());

                        pOutput.accept(ModBlocks.RED_CARVED_SANDSTONE_BOLD_AND_BRASH.get());
                        pOutput.accept(ModBlocks.RED_CARVED_SANDSTONE_CLOSED.get());
                        pOutput.accept(ModBlocks.RED_CARVED_SANDSTONE_EXCITED.get());
                        pOutput.accept(ModBlocks.RED_CARVED_SANDSTONE_FROWN.get());
                        pOutput.accept(ModBlocks.RED_CARVED_SANDSTONE_HAPPY.get());
                        pOutput.accept(ModBlocks.RED_CARVED_SANDSTONE_LIPS.get());
                        pOutput.accept(ModBlocks.RED_CARVED_SANDSTONE_SAD.get());
                        pOutput.accept(ModBlocks.RED_CARVED_SANDSTONE_TOUCH.get());
                        pOutput.accept(ModBlocks.RED_CARVED_SANDSTONE_MESSAGE.get());

                        pOutput.accept(ModBlocks.PINEAPPLE.get());

                        pOutput.accept(ModBlocks.OAK_PAPER_LANTERN.get());
                        pOutput.accept(ModBlocks.SPRUCE_PAPER_LANTERN.get());
                        pOutput.accept(ModBlocks.BIRCH_PAPER_LANTERN.get());
                        pOutput.accept(ModBlocks.JUNGLE_PAPER_LANTERN.get());
                        pOutput.accept(ModBlocks.ACACIA_PAPER_LANTERN.get());
                        pOutput.accept(ModBlocks.DARK_OAK_PAPER_LANTERN.get());
                        pOutput.accept(ModBlocks.WARPED_PAPER_LANTERN.get());
                        pOutput.accept(ModBlocks.CRIMSON_PAPER_LANTERN.get());
                        pOutput.accept(ModBlocks.MANGROVE_PAPER_LANTERN.get());
                        pOutput.accept(ModBlocks.CHERRY_PAPER_LANTERN.get());
                        pOutput.accept(ModBlocks.BAMBOO_PAPER_LANTERN.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> VINTAGE_VIBES_ITEM_TAB = CREATIVE_MODE_TABS.register("vintage_vibes_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TOPAZ.get()))
                    .title(Component.translatable("creativetab.vintage_vibes_items_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        //gem items (normal & rough)
                        pOutput.accept(ModItems.AQUAMARINE.get());
                        pOutput.accept(ModItems.ROUGH_AQUAMARINE.get());
                        pOutput.accept(ModItems.AMBER.get());
                        pOutput.accept(ModItems.ROUGH_AMBER.get());
                        pOutput.accept(ModItems.ENSTATITE.get());
                        pOutput.accept(ModItems.ROUGH_ENSTATITE.get());
                        pOutput.accept(ModItems.GARNET.get());
                        pOutput.accept(ModItems.ROUGH_GARNET.get());
                        pOutput.accept(ModItems.JADE.get());
                        pOutput.accept(ModItems.ROUGH_JADE.get());
                        pOutput.accept(ModItems.KUNZITE.get());
                        pOutput.accept(ModItems.ROUGH_KUNZITE.get());
                        pOutput.accept(ModItems.LARIMAR.get());
                        pOutput.accept(ModItems.ROUGH_LARIMAR.get());
                        pOutput.accept(ModItems.MILKY_QUARTZ.get());
                        pOutput.accept(ModItems.ROUGH_MILKY_QUARTZ.get());
                        pOutput.accept(ModItems.ROUGH_MOONSTONE.get());
                        pOutput.accept(ModItems.MOONSTONE.get());
                        pOutput.accept(ModItems.ONYX.get());
                        pOutput.accept(ModItems.ROUGH_ONYX.get());
                        pOutput.accept(ModItems.PERIDOT.get());
                        pOutput.accept(ModItems.ROUGH_PERIDOT.get());
                        pOutput.accept(ModItems.ROSE_QUARTZ.get());
                        pOutput.accept(ModItems.ROUGH_ROSE_QUARTZ.get());
                        pOutput.accept(ModItems.SAPPHIRE.get());
                        pOutput.accept(ModItems.ROUGH_SAPPHIRE.get());
                        pOutput.accept(ModItems.SMOKY_QUARTZ.get());
                        pOutput.accept(ModItems.ROUGH_SMOKY_QUARTZ.get());
                        pOutput.accept(ModItems.TAAFFEITE.get());
                        pOutput.accept(ModItems.ROUGH_TAAFFEITE.get());
                        pOutput.accept(ModItems.TOPAZ.get());
                        pOutput.accept(ModItems.ROUGH_TOPAZ.get());

                        pOutput.accept(ModItems.PINEAPPLE_SLICE.get());

                    })
                    .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}