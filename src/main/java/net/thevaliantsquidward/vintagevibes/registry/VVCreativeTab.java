package net.thevaliantsquidward.vintagevibes.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.thevaliantsquidward.vintagevibes.VintageVibes;

public class VVCreativeTab {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, VintageVibes.MOD_ID);

    public static final RegistryObject<CreativeModeTab> VINTAGE_VIBES_TAB = CREATIVE_TABS.register("vintage_vibes_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(VVBlocks.PINK_HIBISCUS.get()))
                    .title(Component.translatable("creativetab.vintage_vibes_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        // EVIL BEASTS OF EVIL ORIGINS
                        pOutput.accept(VVItems.BUTTERFLY_SPAWN_EGG.get());

                        pOutput.accept(VVItems.AMBER.get());
                        pOutput.accept(VVItems.AQUAMARINE.get());
                        pOutput.accept(VVItems.ENSTATITE.get());
                        pOutput.accept(VVItems.GARNET.get());
                        pOutput.accept(VVItems.JADE.get());
                        pOutput.accept(VVItems.KUNZITE.get());
                        pOutput.accept(VVItems.LARIMAR.get());
                        pOutput.accept(VVItems.MILKY_QUARTZ.get());
                        pOutput.accept(VVItems.MOONSTONE.get());
                        pOutput.accept(VVItems.ONYX.get());
                        pOutput.accept(VVItems.PERIDOT.get());
                        pOutput.accept(VVItems.ROSE_QUARTZ.get());
                        pOutput.accept(VVItems.SAPPHIRE.get());
                        pOutput.accept(VVItems.SMOKY_QUARTZ.get());
                        pOutput.accept(VVItems.TAAFFEITE.get());
                        pOutput.accept(VVItems.TOPAZ.get());

                        pOutput.accept(VVItems.PINEAPPLE_SEEDS.get());
                        pOutput.accept(VVItems.PINEAPPLE_SLICE.get());
                        pOutput.accept(VVItems.VIBE_DISC.get());

                        // bejeweled lamp
                        pOutput.accept(VVBlocks.BANDED_BEJEWELED_LAMP.get());
                        pOutput.accept(VVBlocks.DIAMANTE_BEJEWELED_LAMP.get());
                        pOutput.accept(VVBlocks.FLORAL_BEJEWELED_LAMP.get());
                        pOutput.accept(VVBlocks.HONEYCOMB_BEJEWELED_LAMP.get());

                        // gem blocks
                        pOutput.accept(VVBlocks.AMBER_BLOCK.get());
                        pOutput.accept(VVBlocks.POLISHED_AMBER.get());
                        pOutput.accept(VVBlocks.AMBER_TILES.get());
                        pOutput.accept(VVBlocks.AMBER_TILE_STAIRS.get());
                        pOutput.accept(VVBlocks.AMBER_TILE_SLAB.get());
                        pOutput.accept(VVBlocks.AMBER_TILE_WALL.get());

                        pOutput.accept(VVBlocks.AQUAMARINE_BLOCK.get());
                        pOutput.accept(VVBlocks.POLISHED_AQUAMARINE.get());
                        pOutput.accept(VVBlocks.AQUAMARINE_TILES.get());
                        pOutput.accept(VVBlocks.AQUAMARINE_TILE_STAIRS.get());
                        pOutput.accept(VVBlocks.AQUAMARINE_TILE_SLAB.get());
                        pOutput.accept(VVBlocks.AQUAMARINE_TILE_WALL.get());

                        pOutput.accept(VVBlocks.ENSTATITE_BLOCK.get());
                        pOutput.accept(VVBlocks.POLISHED_ENSTATITE.get());
                        pOutput.accept(VVBlocks.ENSTATITE_TILES.get());
                        pOutput.accept(VVBlocks.ENSTATITE_TILE_STAIRS.get());
                        pOutput.accept(VVBlocks.ENSTATITE_TILE_SLAB.get());
                        pOutput.accept(VVBlocks.ENSTATITE_TILE_WALL.get());

                        pOutput.accept(VVBlocks.GARNET_BLOCK.get());
                        pOutput.accept(VVBlocks.POLISHED_GARNET.get());
                        pOutput.accept(VVBlocks.GARNET_TILES.get());
                        pOutput.accept(VVBlocks.GARNET_TILE_STAIRS.get());
                        pOutput.accept(VVBlocks.GARNET_TILE_SLAB.get());
                        pOutput.accept(VVBlocks.GARNET_TILE_WALL.get());

                        pOutput.accept(VVBlocks.JADE_BLOCK.get());
                        pOutput.accept(VVBlocks.POLISHED_JADE.get());
                        pOutput.accept(VVBlocks.JADE_TILES.get());
                        pOutput.accept(VVBlocks.JADE_TILE_STAIRS.get());
                        pOutput.accept(VVBlocks.JADE_TILE_SLAB.get());
                        pOutput.accept(VVBlocks.JADE_TILE_WALL.get());

                        pOutput.accept(VVBlocks.KUNZITE_BLOCK.get());
                        pOutput.accept(VVBlocks.POLISHED_KUNZITE.get());
                        pOutput.accept(VVBlocks.KUNZITE_TILES.get());
                        pOutput.accept(VVBlocks.KUNZITE_TILE_STAIRS.get());
                        pOutput.accept(VVBlocks.KUNZITE_TILE_SLAB.get());
                        pOutput.accept(VVBlocks.KUNZITE_TILE_WALL.get());

                        pOutput.accept(VVBlocks.LARIMAR_BLOCK.get());
                        pOutput.accept(VVBlocks.POLISHED_LARIMAR.get());
                        pOutput.accept(VVBlocks.LARIMAR_TILES.get());
                        pOutput.accept(VVBlocks.LARIMAR_TILE_STAIRS.get());
                        pOutput.accept(VVBlocks.LARIMAR_TILE_SLAB.get());
                        pOutput.accept(VVBlocks.LARIMAR_TILE_WALL.get());

                        pOutput.accept(VVBlocks.MILKY_QUARTZ_BLOCK.get());
                        pOutput.accept(VVBlocks.POLISHED_MILKY_QUARTZ.get());
                        pOutput.accept(VVBlocks.MILKY_QUARTZ_TILES.get());
                        pOutput.accept(VVBlocks.MILKY_QUARTZ_TILE_STAIRS.get());
                        pOutput.accept(VVBlocks.MILKY_QUARTZ_TILE_SLAB.get());
                        pOutput.accept(VVBlocks.MILKY_QUARTZ_TILE_WALL.get());

                        pOutput.accept(VVBlocks.MOONSTONE_BLOCK.get());
                        pOutput.accept(VVBlocks.POLISHED_MOONSTONE.get());
                        pOutput.accept(VVBlocks.MOONSTONE_TILES.get());
                        pOutput.accept(VVBlocks.MOONSTONE_TILE_STAIRS.get());
                        pOutput.accept(VVBlocks.MOONSTONE_TILE_SLAB.get());
                        pOutput.accept(VVBlocks.MOONSTONE_TILE_WALL.get());

                        pOutput.accept(VVBlocks.ONYX_BLOCK.get());
                        pOutput.accept(VVBlocks.POLISHED_ONYX.get());
                        pOutput.accept(VVBlocks.ONYX_TILES.get());
                        pOutput.accept(VVBlocks.ONYX_TILE_STAIRS.get());
                        pOutput.accept(VVBlocks.ONYX_TILE_SLAB.get());
                        pOutput.accept(VVBlocks.ONYX_TILE_WALL.get());

                        pOutput.accept(VVBlocks.PERIDOT_BLOCK.get());
                        pOutput.accept(VVBlocks.POLISHED_PERIDOT.get());
                        pOutput.accept(VVBlocks.PERIDOT_TILES.get());
                        pOutput.accept(VVBlocks.PERIDOT_TILE_STAIRS.get());
                        pOutput.accept(VVBlocks.PERIDOT_TILE_SLAB.get());
                        pOutput.accept(VVBlocks.PERIDOT_TILE_WALL.get());

                        pOutput.accept(VVBlocks.ROSE_QUARTZ_BLOCK.get());
                        pOutput.accept(VVBlocks.POLISHED_ROSE_QUARTZ.get());
                        pOutput.accept(VVBlocks.ROSE_QUARTZ_TILES.get());
                        pOutput.accept(VVBlocks.ROSE_QUARTZ_TILE_STAIRS.get());
                        pOutput.accept(VVBlocks.ROSE_QUARTZ_TILE_SLAB.get());
                        pOutput.accept(VVBlocks.ROSE_QUARTZ_TILE_WALL.get());

                        pOutput.accept(VVBlocks.SAPPHIRE_BLOCK.get());
                        pOutput.accept(VVBlocks.POLISHED_SAPPHIRE.get());
                        pOutput.accept(VVBlocks.SAPPHIRE_TILES.get());
                        pOutput.accept(VVBlocks.SAPPHIRE_TILE_STAIRS.get());
                        pOutput.accept(VVBlocks.SAPPHIRE_TILE_SLAB.get());
                        pOutput.accept(VVBlocks.SAPPHIRE_TILE_WALL.get());

                        pOutput.accept(VVBlocks.SMOKY_QUARTZ_BLOCK.get());
                        pOutput.accept(VVBlocks.POLISHED_SMOKY_QUARTZ.get());
                        pOutput.accept(VVBlocks.SMOKY_QUARTZ_TILES.get());
                        pOutput.accept(VVBlocks.SMOKY_QUARTZ_TILE_STAIRS.get());
                        pOutput.accept(VVBlocks.SMOKY_QUARTZ_TILE_SLAB.get());
                        pOutput.accept(VVBlocks.SMOKY_QUARTZ_TILE_WALL.get());

                        pOutput.accept(VVBlocks.TAAFFEITE_BLOCK.get());
                        pOutput.accept(VVBlocks.POLISHED_TAAFFEITE.get());
                        pOutput.accept(VVBlocks.TAAFFEITE_TILES.get());
                        pOutput.accept(VVBlocks.TAAFFEITE_TILE_STAIRS.get());
                        pOutput.accept(VVBlocks.TAAFFEITE_TILE_SLAB.get());
                        pOutput.accept(VVBlocks.TAAFFEITE_TILE_WALL.get());

                        pOutput.accept(VVBlocks.TOPAZ_BLOCK.get());
                        pOutput.accept(VVBlocks.POLISHED_TOPAZ.get());
                        pOutput.accept(VVBlocks.TOPAZ_TILES.get());
                        pOutput.accept(VVBlocks.TOPAZ_TILE_STAIRS.get());
                        pOutput.accept(VVBlocks.TOPAZ_TILE_SLAB.get());
                        pOutput.accept(VVBlocks.TOPAZ_TILE_WALL.get());

                        // vanilla gem blocks
                        pOutput.accept(VVBlocks.AMETHYST_TILES.get());
                        pOutput.accept(VVBlocks.AMETHYST_TILE_STAIRS.get());
                        pOutput.accept(VVBlocks.AMETHYST_TILE_SLAB.get());
                        pOutput.accept(VVBlocks.AMETHYST_TILE_WALL.get());
                        pOutput.accept(VVBlocks.DIAMOND_TILES.get());
                        pOutput.accept(VVBlocks.DIAMOND_TILE_STAIRS.get());
                        pOutput.accept(VVBlocks.DIAMOND_TILE_SLAB.get());
                        pOutput.accept(VVBlocks.DIAMOND_TILE_WALL.get());
                        pOutput.accept(VVBlocks.EMERALD_TILES.get());
                        pOutput.accept(VVBlocks.EMERALD_TILE_STAIRS.get());
                        pOutput.accept(VVBlocks.EMERALD_TILE_SLAB.get());
                        pOutput.accept(VVBlocks.EMERALD_TILE_WALL.get());
                        pOutput.accept(VVBlocks.QUARTZ_TILES.get());
                        pOutput.accept(VVBlocks.QUARTZ_TILE_STAIRS.get());
                        pOutput.accept(VVBlocks.QUARTZ_TILE_SLAB.get());
                        pOutput.accept(VVBlocks.QUARTZ_TILE_WALL.get());

                        // calcite tiles
                        pOutput.accept(VVBlocks.CALCITE_TILES.get());
                        pOutput.accept(VVBlocks.CALCITE_TILE_STAIRS.get());
                        pOutput.accept(VVBlocks.CALCITE_TILE_SLAB.get());
                        pOutput.accept(VVBlocks.CALCITE_TILE_WALL.get());
                        pOutput.accept(VVBlocks.STARRY_AMBER_CALCITE_TILES.get());
                        pOutput.accept(VVBlocks.STARRY_AQUAMARINE_CALCITE_TILES.get());
                        pOutput.accept(VVBlocks.STARRY_ENSTATITE_CALCITE_TILES.get());
                        pOutput.accept(VVBlocks.STARRY_GARNET_CALCITE_TILES.get());
                        pOutput.accept(VVBlocks.STARRY_JADE_CALCITE_TILES.get());
                        pOutput.accept(VVBlocks.STARRY_KUNZITE_CALCITE_TILES.get());
                        pOutput.accept(VVBlocks.STARRY_LARIMAR_CALCITE_TILES.get());
                        pOutput.accept(VVBlocks.STARRY_MILKY_QUARTZ_CALCITE_TILES.get());
                        pOutput.accept(VVBlocks.STARRY_MOONSTONE_CALCITE_TILES.get());
                        pOutput.accept(VVBlocks.STARRY_ONYX_CALCITE_TILES.get());
                        pOutput.accept(VVBlocks.STARRY_PERIDOT_CALCITE_TILES.get());
                        pOutput.accept(VVBlocks.STARRY_ROSE_QUARTZ_CALCITE_TILES.get());
                        pOutput.accept(VVBlocks.STARRY_SAPPHIRE_CALCITE_TILES.get());
                        pOutput.accept(VVBlocks.STARRY_SMOKY_QUARTZ_CALCITE_TILES.get());
                        pOutput.accept(VVBlocks.STARRY_TAAFFEITE_CALCITE_TILES.get());
                        pOutput.accept(VVBlocks.STARRY_TOPAZ_CALCITE_TILES.get());

                        pOutput.accept(VVBlocks.STARRY_AMETHYST_CALCITE_TILES.get());
                        pOutput.accept(VVBlocks.STARRY_DIAMOND_CALCITE_TILES.get());
                        pOutput.accept(VVBlocks.STARRY_EMERALD_CALCITE_TILES.get());
                        pOutput.accept(VVBlocks.STARRY_QUARTZ_CALCITE_TILES.get());

                        // calcite bricks
                        pOutput.accept(VVBlocks.CALCITE_BRICKS.get());
                        pOutput.accept(VVBlocks.CALCITE_BRICK_STAIRS.get());
                        pOutput.accept(VVBlocks.CALCITE_BRICK_SLAB.get());
                        pOutput.accept(VVBlocks.CALCITE_BRICK_WALL.get());
                        pOutput.accept(VVBlocks.AMBER_BEJEWELED_CALCITE_BRICKS.get());
                        pOutput.accept(VVBlocks.AMBER_BEJEWELED_CALCITE_BRICK_STAIRS.get());
                        pOutput.accept(VVBlocks.AMBER_BEJEWELED_CALCITE_BRICK_SLAB.get());
                        pOutput.accept(VVBlocks.AMBER_BEJEWELED_CALCITE_BRICK_WALL.get());
                        pOutput.accept(VVBlocks.AQUAMARINE_BEJEWELED_CALCITE_BRICKS.get());
                        pOutput.accept(VVBlocks.AQUAMARINE_BEJEWELED_CALCITE_BRICK_STAIRS.get());
                        pOutput.accept(VVBlocks.AQUAMARINE_BEJEWELED_CALCITE_BRICK_SLAB.get());
                        pOutput.accept(VVBlocks.AQUAMARINE_BEJEWELED_CALCITE_BRICK_WALL.get());
                        pOutput.accept(VVBlocks.ENSTATITE_BEJEWELED_CALCITE_BRICKS.get());
                        pOutput.accept(VVBlocks.ENSTATITE_BEJEWELED_CALCITE_BRICK_STAIRS.get());
                        pOutput.accept(VVBlocks.ENSTATITE_BEJEWELED_CALCITE_BRICK_SLAB.get());
                        pOutput.accept(VVBlocks.ENSTATITE_BEJEWELED_CALCITE_BRICK_WALL.get());
                        pOutput.accept(VVBlocks.GARNET_BEJEWELED_CALCITE_BRICKS.get());
                        pOutput.accept(VVBlocks.GARNET_BEJEWELED_CALCITE_BRICK_STAIRS.get());
                        pOutput.accept(VVBlocks.GARNET_BEJEWELED_CALCITE_BRICK_SLAB.get());
                        pOutput.accept(VVBlocks.GARNET_BEJEWELED_CALCITE_BRICK_WALL.get());
                        pOutput.accept(VVBlocks.JADE_BEJEWELED_CALCITE_BRICKS.get());
                        pOutput.accept(VVBlocks.JADE_BEJEWELED_CALCITE_BRICK_STAIRS.get());
                        pOutput.accept(VVBlocks.JADE_BEJEWELED_CALCITE_BRICK_SLAB.get());
                        pOutput.accept(VVBlocks.JADE_BEJEWELED_CALCITE_BRICK_WALL.get());
                        pOutput.accept(VVBlocks.KUNZITE_BEJEWELED_CALCITE_BRICKS.get());
                        pOutput.accept(VVBlocks.KUNZITE_BEJEWELED_CALCITE_BRICK_STAIRS.get());
                        pOutput.accept(VVBlocks.KUNZITE_BEJEWELED_CALCITE_BRICK_SLAB.get());
                        pOutput.accept(VVBlocks.KUNZITE_BEJEWELED_CALCITE_BRICK_WALL.get());
                        pOutput.accept(VVBlocks.LARIMAR_BEJEWELED_CALCITE_BRICKS.get());
                        pOutput.accept(VVBlocks.LARIMAR_BEJEWELED_CALCITE_BRICK_STAIRS.get());
                        pOutput.accept(VVBlocks.LARIMAR_BEJEWELED_CALCITE_BRICK_SLAB.get());
                        pOutput.accept(VVBlocks.LARIMAR_BEJEWELED_CALCITE_BRICK_WALL.get());
                        pOutput.accept(VVBlocks.MILKY_QUARTZ_BEJEWELED_CALCITE_BRICKS.get());
                        pOutput.accept(VVBlocks.MILKY_QUARTZ_BEJEWELED_CALCITE_BRICK_STAIRS.get());
                        pOutput.accept(VVBlocks.MILKY_QUARTZ_BEJEWELED_CALCITE_BRICK_SLAB.get());
                        pOutput.accept(VVBlocks.MILKY_QUARTZ_BEJEWELED_CALCITE_BRICK_WALL.get());
                        pOutput.accept(VVBlocks.MOONSTONE_BEJEWELED_CALCITE_BRICKS.get());
                        pOutput.accept(VVBlocks.MOONSTONE_BEJEWELED_CALCITE_BRICK_STAIRS.get());
                        pOutput.accept(VVBlocks.MOONSTONE_BEJEWELED_CALCITE_BRICK_SLAB.get());
                        pOutput.accept(VVBlocks.MOONSTONE_BEJEWELED_CALCITE_BRICK_WALL.get());
                        pOutput.accept(VVBlocks.ONYX_BEJEWELED_CALCITE_BRICKS.get());
                        pOutput.accept(VVBlocks.ONYX_BEJEWELED_CALCITE_BRICK_STAIRS.get());
                        pOutput.accept(VVBlocks.ONYX_BEJEWELED_CALCITE_BRICK_SLAB.get());
                        pOutput.accept(VVBlocks.ONYX_BEJEWELED_CALCITE_BRICK_WALL.get());
                        pOutput.accept(VVBlocks.PERIDOT_BEJEWELED_CALCITE_BRICKS.get());
                        pOutput.accept(VVBlocks.PERIDOT_BEJEWELED_CALCITE_BRICK_STAIRS.get());
                        pOutput.accept(VVBlocks.PERIDOT_BEJEWELED_CALCITE_BRICK_SLAB.get());
                        pOutput.accept(VVBlocks.PERIDOT_BEJEWELED_CALCITE_BRICK_WALL.get());
                        pOutput.accept(VVBlocks.ROSE_QUARTZ_BEJEWELED_CALCITE_BRICKS.get());
                        pOutput.accept(VVBlocks.ROSE_QUARTZ_BEJEWELED_CALCITE_BRICK_STAIRS.get());
                        pOutput.accept(VVBlocks.ROSE_QUARTZ_BEJEWELED_CALCITE_BRICK_SLAB.get());
                        pOutput.accept(VVBlocks.ROSE_QUARTZ_BEJEWELED_CALCITE_BRICK_WALL.get());
                        pOutput.accept(VVBlocks.SAPPHIRE_BEJEWELED_CALCITE_BRICKS.get());
                        pOutput.accept(VVBlocks.SAPPHIRE_BEJEWELED_CALCITE_BRICK_STAIRS.get());
                        pOutput.accept(VVBlocks.SAPPHIRE_BEJEWELED_CALCITE_BRICK_SLAB.get());
                        pOutput.accept(VVBlocks.SAPPHIRE_BEJEWELED_CALCITE_BRICK_WALL.get());
                        pOutput.accept(VVBlocks.SMOKY_QUARTZ_BEJEWELED_CALCITE_BRICKS.get());
                        pOutput.accept(VVBlocks.SMOKY_QUARTZ_BEJEWELED_CALCITE_BRICK_STAIRS.get());
                        pOutput.accept(VVBlocks.SMOKY_QUARTZ_BEJEWELED_CALCITE_BRICK_SLAB.get());
                        pOutput.accept(VVBlocks.SMOKY_QUARTZ_BEJEWELED_CALCITE_BRICK_WALL.get());
                        pOutput.accept(VVBlocks.TAAFFEITE_BEJEWELED_CALCITE_BRICKS.get());
                        pOutput.accept(VVBlocks.TAAFFEITE_BEJEWELED_CALCITE_BRICK_STAIRS.get());
                        pOutput.accept(VVBlocks.TAAFFEITE_BEJEWELED_CALCITE_BRICK_SLAB.get());
                        pOutput.accept(VVBlocks.TAAFFEITE_BEJEWELED_CALCITE_BRICK_WALL.get());
                        pOutput.accept(VVBlocks.TOPAZ_BEJEWELED_CALCITE_BRICKS.get());
                        pOutput.accept(VVBlocks.TOPAZ_BEJEWELED_CALCITE_BRICK_STAIRS.get());
                        pOutput.accept(VVBlocks.TOPAZ_BEJEWELED_CALCITE_BRICK_SLAB.get());
                        pOutput.accept(VVBlocks.TOPAZ_BEJEWELED_CALCITE_BRICK_WALL.get());

                        pOutput.accept(VVBlocks.AMETHYST_BEJEWELED_CALCITE_BRICKS.get());
                        pOutput.accept(VVBlocks.AMETHYST_BEJEWELED_CALCITE_BRICK_STAIRS.get());
                        pOutput.accept(VVBlocks.AMETHYST_BEJEWELED_CALCITE_BRICK_SLAB.get());
                        pOutput.accept(VVBlocks.AMETHYST_BEJEWELED_CALCITE_BRICK_WALL.get());
                        pOutput.accept(VVBlocks.DIAMOND_BEJEWELED_CALCITE_BRICKS.get());
                        pOutput.accept(VVBlocks.DIAMOND_BEJEWELED_CALCITE_BRICK_STAIRS.get());
                        pOutput.accept(VVBlocks.DIAMOND_BEJEWELED_CALCITE_BRICK_SLAB.get());
                        pOutput.accept(VVBlocks.DIAMOND_BEJEWELED_CALCITE_BRICK_WALL.get());
                        pOutput.accept(VVBlocks.EMERALD_BEJEWELED_CALCITE_BRICKS.get());
                        pOutput.accept(VVBlocks.EMERALD_BEJEWELED_CALCITE_BRICK_STAIRS.get());
                        pOutput.accept(VVBlocks.EMERALD_BEJEWELED_CALCITE_BRICK_SLAB.get());
                        pOutput.accept(VVBlocks.EMERALD_BEJEWELED_CALCITE_BRICK_WALL.get());
                        pOutput.accept(VVBlocks.QUARTZ_BEJEWELED_CALCITE_BRICKS.get());
                        pOutput.accept(VVBlocks.QUARTZ_BEJEWELED_CALCITE_BRICK_STAIRS.get());
                        pOutput.accept(VVBlocks.QUARTZ_BEJEWELED_CALCITE_BRICK_SLAB.get());
                        pOutput.accept(VVBlocks.QUARTZ_BEJEWELED_CALCITE_BRICK_WALL.get());

                        // crystal stands
                        pOutput.accept(VVBlocks.AMBER_STAND.get());
                        pOutput.accept(VVBlocks.AQUAMARINE_STAND.get());
                        pOutput.accept(VVBlocks.ENSTATITE_STAND.get());
                        pOutput.accept(VVBlocks.GARNET_STAND.get());
                        pOutput.accept(VVBlocks.JADE_STAND.get());
                        pOutput.accept(VVBlocks.KUNZITE_STAND.get());
                        pOutput.accept(VVBlocks.LARIMAR_STAND.get());
                        pOutput.accept(VVBlocks.MILKY_QUARTZ_STAND.get());
                        pOutput.accept(VVBlocks.MOONSTONE_STAND.get());
                        pOutput.accept(VVBlocks.ONYX_STAND.get());
                        pOutput.accept(VVBlocks.PERIDOT_STAND.get());
                        pOutput.accept(VVBlocks.ROSE_QUARTZ_STAND.get());
                        pOutput.accept(VVBlocks.SAPPHIRE_STAND.get());
                        pOutput.accept(VVBlocks.SMOKY_QUARTZ_STAND.get());
                        pOutput.accept(VVBlocks.TAAFFEITE_STAND.get());
                        pOutput.accept(VVBlocks.TOPAZ_STAND.get());

                        pOutput.accept(VVBlocks.AMETHYST_STAND.get());
                        pOutput.accept(VVBlocks.DIAMOND_STAND.get());
                        pOutput.accept(VVBlocks.EMERALD_STAND.get());
                        pOutput.accept(VVBlocks.QUARTZ_STAND.get());

                        //plants
                        pOutput.accept(VVBlocks.WHITE_HIBISCUS.get());
                        pOutput.accept(VVBlocks.RED_HIBISCUS.get());
                        pOutput.accept(VVBlocks.ORANGE_HIBISCUS.get());
                        pOutput.accept(VVBlocks.PURPLE_HIBISCUS.get());
                        pOutput.accept(VVBlocks.PINK_HIBISCUS.get());

                        pOutput.accept(VVBlocks.TALL_WHITE_HIBISCUS.get());
                        pOutput.accept(VVBlocks.TALL_RED_HIBISCUS.get());
                        pOutput.accept(VVBlocks.TALL_ORANGE_HIBISCUS.get());
                        pOutput.accept(VVBlocks.TALL_PURPLE_HIBISCUS.get());
                        pOutput.accept(VVBlocks.TALL_PINK_HIBISCUS.get());

                        pOutput.accept(VVBlocks.WHITE_HIBISCUS_CARPET.get());
                        pOutput.accept(VVBlocks.RED_HIBISCUS_CARPET.get());
                        pOutput.accept(VVBlocks.ORANGE_HIBISCUS_CARPET.get());
                        pOutput.accept(VVBlocks.PURPLE_HIBISCUS_CARPET.get());
                        pOutput.accept(VVBlocks.PINK_HIBISCUS_CARPET.get());

                        pOutput.accept(VVBlocks.WHITE_CALLA.get());
                        pOutput.accept(VVBlocks.BLACK_CALLA.get());
                        pOutput.accept(VVBlocks.ORANGE_CALLA.get());
                        pOutput.accept(VVBlocks.YELLOW_CALLA.get());

                        pOutput.accept(VVBlocks.ORANGE_BROMELIAD.get());
                        pOutput.accept(VVBlocks.YELLOW_BROMELIAD.get());
                        pOutput.accept(VVBlocks.PURPLE_BROMELIAD.get());
                        pOutput.accept(VVBlocks.PINK_BROMELIAD.get());

                        pOutput.accept(VVBlocks.WHITE_ORCHID.get());
                        pOutput.accept(VVBlocks.ORANGE_ORCHID.get());
                        pOutput.accept(VVBlocks.YELLOW_ORCHID.get());
                        pOutput.accept(VVBlocks.PINK_ORCHID.get());

                        pOutput.accept(VVBlocks.BIRD_OF_PARADISE.get());
                        pOutput.accept(VVBlocks.CANNA_LILY.get());

                        pOutput.accept(VVBlocks.LACELEAF.get());
                        pOutput.accept(VVBlocks.TALL_LACELEAF.get());

                        pOutput.accept(VVBlocks.TORCH_GINGER.get());

                        pOutput.accept(VVBlocks.PINEAPPLE.get());
                        pOutput.accept(VVBlocks.PINEAPPLE_SCALE_BLOCK.get());
                        pOutput.accept(VVBlocks.PINEAPPLE_CROWN.get());

                        pOutput.accept(VVBlocks.CARVED_SANDSTONE_CONCERNED.get());
                        pOutput.accept(VVBlocks.CARVED_SANDSTONE_DISAPPOINTED.get());
                        pOutput.accept(VVBlocks.CARVED_SANDSTONE_FISHEYE.get());
                        pOutput.accept(VVBlocks.CARVED_SANDSTONE_GRIN.get());
                        pOutput.accept(VVBlocks.CARVED_SANDSTONE_JOYOUS.get());
                        pOutput.accept(VVBlocks.CARVED_SANDSTONE_LAZYBONES.get());
                        pOutput.accept(VVBlocks.CARVED_SANDSTONE_NOSE.get());
                        pOutput.accept(VVBlocks.CARVED_SANDSTONE_OPEN.get());
                        pOutput.accept(VVBlocks.CARVED_SANDSTONE_SPIRAL.get());

                        pOutput.accept(VVBlocks.RED_CARVED_SANDSTONE_BOLD_AND_BRASH.get());
                        pOutput.accept(VVBlocks.RED_CARVED_SANDSTONE_CLOSED.get());
                        pOutput.accept(VVBlocks.RED_CARVED_SANDSTONE_EXCITED.get());
                        pOutput.accept(VVBlocks.RED_CARVED_SANDSTONE_FROWN.get());
                        pOutput.accept(VVBlocks.RED_CARVED_SANDSTONE_HAPPY.get());
                        pOutput.accept(VVBlocks.RED_CARVED_SANDSTONE_LIPS.get());
                        pOutput.accept(VVBlocks.RED_CARVED_SANDSTONE_SAD.get());
                        pOutput.accept(VVBlocks.RED_CARVED_SANDSTONE_TOUCH.get());
                        pOutput.accept(VVBlocks.RED_CARVED_SANDSTONE_MESSAGE.get());

                        pOutput.accept(VVBlocks.OAK_PAPER_LANTERN.get());
                        pOutput.accept(VVBlocks.SPRUCE_PAPER_LANTERN.get());
                        pOutput.accept(VVBlocks.BIRCH_PAPER_LANTERN.get());
                        pOutput.accept(VVBlocks.JUNGLE_PAPER_LANTERN.get());
                        pOutput.accept(VVBlocks.ACACIA_PAPER_LANTERN.get());
                        pOutput.accept(VVBlocks.DARK_OAK_PAPER_LANTERN.get());
                        pOutput.accept(VVBlocks.MANGROVE_PAPER_LANTERN.get());
                        pOutput.accept(VVBlocks.CHERRY_PAPER_LANTERN.get());
                        pOutput.accept(VVBlocks.BAMBOO_PAPER_LANTERN.get());
                        pOutput.accept(VVBlocks.CRIMSON_PAPER_LANTERN.get());
                        pOutput.accept(VVBlocks.WARPED_PAPER_LANTERN.get());

                    }).build());
}