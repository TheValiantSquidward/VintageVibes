package net.thevaliantsquidward.vintagevibes;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.thevaliantsquidward.vintagevibes.registry.VVBlocks;
import net.thevaliantsquidward.vintagevibes.registry.VVItems;

public class VintageVibesTab {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, VintageVibes.MOD_ID);

    public static final RegistryObject<CreativeModeTab> VINTAGE_VIBES_TAB = CREATIVE_TABS.register("vintage_vibes_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(VVItems.BEJEWELED_BROOCH.get()))
                    .title(Component.translatable("creativetab.vintage_vibes_tab"))
                    .displayItems((pParameters, output) -> {

                        // EVIL BEASTS OF EVIL ORIGINS
                        output.accept(VVItems.BUTTERFLY_SPAWN_EGG.get());
                        output.accept(VVItems.BUTTERFLY_BOTTLE.get());

                        output.accept(VVBlocks.DISPLAY_CASE.get());
                        output.accept(VVItems.AMBERIZED_CRITTER.get());
                        output.accept(VVItems.ANCIENT_FIGURINE.get());
                        output.accept(VVItems.ANTIQUE_KEY.get());
                        output.accept(VVItems.AQUA_PORCELAIN.get());
                        output.accept(VVItems.BEJEWELED_BROOCH.get());
                        output.accept(VVItems.BLOSSOM_NECKLACE.get());
                        output.accept(VVItems.BRITTLE_VASE.get());
                        output.accept(VVItems.CHIPPED_RING.get());
                        output.accept(VVItems.CITRINE_DIAMOND.get());
                        output.accept(VVItems.COMEDY_MASK.get());
                        output.accept(VVItems.COPPER_APPLE.get());
                        output.accept(VVItems.CORAL_BEADS.get());
                        output.accept(VVItems.CREATURE_MASK.get());
                        output.accept(VVItems.CROWNED_INSECT.get());
                        output.accept(VVItems.CROWNED_JEWEL.get());
                        output.accept(VVItems.CRYSTAL_EYE.get());
                        output.accept(VVItems.CRYSTALLIZED_SHELL.get());
                        output.accept(VVItems.CUT_TULMARINE.get());
                        output.accept(VVItems.DELICATE_BOWL.get());
                        output.accept(VVItems.DUSTY_SPHINX.get());
                        output.accept(VVItems.ELONGATED_SKULL.get());
                        output.accept(VVItems.EMBEDDED_FOSSIL.get());
                        output.accept(VVItems.ENCHANTED_TOME.get());
                        output.accept(VVItems.ENDER_AMULET.get());
                        output.accept(VVItems.ENERGY_SPEAR.get());
                        output.accept(VVItems.EYE_RING.get());
                        output.accept(VVItems.FACETED_AMETRINE.get());
                        output.accept(VVItems.FADED_MASK.get());
                        output.accept(VVItems.FOOLS_FOSSIL.get());
                        output.accept(VVItems.FRAGILE_POT.get());
                        output.accept(VVItems.GLIMMERING_SKULL.get());
                        output.accept(VVItems.GOLDEN_HEAD.get());
                        output.accept(VVItems.GOLDEN_SYMBOL.get());
                        output.accept(VVItems.JADE_FIGURINE.get());
                        output.accept(VVItems.MARBLE_CROSS.get());
                        output.accept(VVItems.LUXURIOUS_BOWL.get());
                        output.accept(VVItems.LUXURIOUS_MASONRY.get());
                        output.accept(VVItems.MERCHANTS_AMULET.get());
                        output.accept(VVItems.METAL_COIN.get());
                        output.accept(VVItems.MUD_TOTEM.get());
                        output.accept(VVItems.OBSIDIAN_BLADE.get());
                        output.accept(VVItems.OBSIDIAN_TOOL.get());
                        output.accept(VVItems.OBSIDIAN_MASK.get());
                        output.accept(VVItems.OCEANIC_PENDANT.get());
                        output.accept(VVItems.ODD_COIN.get());
                        output.accept(VVItems.ODD_STONE.get());
                        output.accept(VVItems.OLD_TOKEN.get());
                        output.accept(VVItems.OLIVE_PORCELAIN.get());
                        output.accept(VVItems.ONYX_FIGURINE.get());
                        output.accept(VVItems.OSSEOUS_AXE.get());
                        output.accept(VVItems.OSSEOUS_PICKAXE.get());
                        output.accept(VVItems.OSSEOUS_SHOVEL.get());
                        output.accept(VVItems.OSSEOUS_SWORD.get());
                        output.accept(VVItems.PEARLESCENT_FACE.get());
                        output.accept(VVItems.POCKET_MIRROR.get());
                        output.accept(VVItems.PRICELESS_COIN.get());
                        output.accept(VVItems.RELUCENT_GRAIL.get());
                        output.accept(VVItems.RUBY_SLIPPERS.get());
                        output.accept(VVItems.RUSTED_SPEARHEAD.get());
                        output.accept(VVItems.RUSTIC_MASK.get());
                        output.accept(VVItems.SHATTERED_DAGGER.get());
                        output.accept(VVItems.SILVER_PORCELAIN.get());
                        output.accept(VVItems.SIRENS_PEARL.get());
                        output.accept(VVItems.SOUL_AMULET.get());
                        output.accept(VVItems.SPLIT_MASK.get());
                        output.accept(VVItems.TONGUE_STONE.get());
                        output.accept(VVItems.WEATHERED_COIN.get());
                        output.accept(VVItems.WHIMSICAL_BUNDLE.get());

                        output.accept(VVItems.CELESTIAL_MASK.get());
                        output.accept(VVItems.DEITY_MASK.get());
                        output.accept(VVItems.FESTIVE_MASK.get());
                        output.accept(VVItems.FROND_MASK.get());
                        output.accept(VVItems.MONSOON_MASK.get());
                        output.accept(VVItems.PETRIFIED_MASK.get());
                        output.accept(VVItems.SPIRIT_MASK.get());
                        output.accept(VVItems.SUNRISE_MASK.get());
                        output.accept(VVItems.TIDAL_MASK.get());
                        output.accept(VVItems.VOLCANIC_MASK.get());
                        output.accept(VVItems.VIBE_DISC.get());

                        //plants
                        output.accept(VVBlocks.WHITE_HIBISCUS.get());
                        output.accept(VVBlocks.RED_HIBISCUS.get());
                        output.accept(VVBlocks.ORANGE_HIBISCUS.get());
                        output.accept(VVBlocks.PURPLE_HIBISCUS.get());
                        output.accept(VVBlocks.PINK_HIBISCUS.get());

                        output.accept(VVBlocks.TALL_WHITE_HIBISCUS.get());
                        output.accept(VVBlocks.TALL_RED_HIBISCUS.get());
                        output.accept(VVBlocks.TALL_ORANGE_HIBISCUS.get());
                        output.accept(VVBlocks.TALL_PURPLE_HIBISCUS.get());
                        output.accept(VVBlocks.TALL_PINK_HIBISCUS.get());

                        output.accept(VVBlocks.WHITE_HIBISCUS_CARPET.get());
                        output.accept(VVBlocks.RED_HIBISCUS_CARPET.get());
                        output.accept(VVBlocks.ORANGE_HIBISCUS_CARPET.get());
                        output.accept(VVBlocks.PURPLE_HIBISCUS_CARPET.get());
                        output.accept(VVBlocks.PINK_HIBISCUS_CARPET.get());

                        output.accept(VVBlocks.WHITE_CALLA.get());
                        output.accept(VVBlocks.BLACK_CALLA.get());
                        output.accept(VVBlocks.ORANGE_CALLA.get());
                        output.accept(VVBlocks.YELLOW_CALLA.get());

                        output.accept(VVBlocks.ORANGE_BROMELIAD.get());
                        output.accept(VVBlocks.YELLOW_BROMELIAD.get());
                        output.accept(VVBlocks.PURPLE_BROMELIAD.get());
                        output.accept(VVBlocks.PINK_BROMELIAD.get());

                        output.accept(VVBlocks.WHITE_ORCHID.get());
                        output.accept(VVBlocks.ORANGE_ORCHID.get());
                        output.accept(VVBlocks.YELLOW_ORCHID.get());
                        output.accept(VVBlocks.PINK_ORCHID.get());

                        output.accept(VVBlocks.BIRD_OF_PARADISE.get());
                        output.accept(VVBlocks.CANNA_LILY.get());

                        output.accept(VVBlocks.LACELEAF.get());
                        output.accept(VVBlocks.TALL_LACELEAF.get());

                        output.accept(VVBlocks.TORCH_GINGER.get());

                        output.accept(VVBlocks.GREEN_FLOWERING_GRASS.get());
                        output.accept(VVBlocks.PINK_FLOWERING_GRASS.get());

                        output.accept(VVItems.GRAPEFRUIT.get());
                        output.accept(VVBlocks.GRAPEFRUIT_SAPLING.get());
                        output.accept(VVBlocks.GRAPEFRUIT_LEAVES.get());
                        output.accept(VVBlocks.FLOWERING_GRAPEFRUIT_LEAVES.get());
                        output.accept(VVBlocks.FRUITFUL_GRAPEFRUIT_LEAVES.get());

                        output.accept(VVItems.LEMON.get());
                        output.accept(VVBlocks.LEMON_SAPLING.get());
                        output.accept(VVBlocks.LEMON_LEAVES.get());
                        output.accept(VVBlocks.FLOWERING_LEMON_LEAVES.get());
                        output.accept(VVBlocks.FRUITFUL_LEMON_LEAVES.get());

                        output.accept(VVItems.LIME.get());
                        output.accept(VVBlocks.LIME_SAPLING.get());
                        output.accept(VVBlocks.LIME_LEAVES.get());
                        output.accept(VVBlocks.FLOWERING_LIME_LEAVES.get());
                        output.accept(VVBlocks.FRUITFUL_LIME_LEAVES.get());

                        output.accept(VVItems.MANGO.get());
                        output.accept(VVBlocks.MANGO_SAPLING.get());
                        output.accept(VVBlocks.MANGO_LEAVES.get());
                        output.accept(VVBlocks.FLOWERING_MANGO_LEAVES.get());
                        output.accept(VVBlocks.FRUITFUL_MANGO_LEAVES.get());

                        output.accept(VVItems.ORANGE.get());
                        output.accept(VVBlocks.ORANGE_SAPLING.get());
                        output.accept(VVBlocks.ORANGE_LEAVES.get());
                        output.accept(VVBlocks.FLOWERING_ORANGE_LEAVES.get());
                        output.accept(VVBlocks.FRUITFUL_ORANGE_LEAVES.get());

                        output.accept(VVItems.PINEAPPLE_SEEDS.get());
                        output.accept(VVItems.PINEAPPLE_SLICE.get());
                        output.accept(VVItems.PINEAPPLE_CHUNKS.get());
                        output.accept(VVBlocks.PINEAPPLE_CROWN.get());
                        output.accept(VVBlocks.GREEN_PINEAPPLE.get());
                        output.accept(VVBlocks.GREEN_PINEAPPLE_SCALE_BLOCK.get());
                        output.accept(VVBlocks.SPOTTED_PINEAPPLE.get());
                        output.accept(VVBlocks.SPOTTED_PINEAPPLE_SCALE_BLOCK.get());
                        output.accept(VVBlocks.PINEAPPLE.get());
                        output.accept(VVBlocks.PINEAPPLE_SCALE_BLOCK.get());
                        output.accept(VVBlocks.SKINNED_PINEAPPLE.get());
                        output.accept(VVBlocks.PINEAPPLE_FLESH_BLOCK.get());

                        output.accept(VVBlocks.CARVED_SANDSTONE_CONCERNED.get());
                        output.accept(VVBlocks.CARVED_SANDSTONE_DISAPPOINTED.get());
                        output.accept(VVBlocks.CARVED_SANDSTONE_FISHEYE.get());
                        output.accept(VVBlocks.CARVED_SANDSTONE_GRIN.get());
                        output.accept(VVBlocks.CARVED_SANDSTONE_JOYOUS.get());
                        output.accept(VVBlocks.CARVED_SANDSTONE_LAZYBONES.get());
                        output.accept(VVBlocks.CARVED_SANDSTONE_NOSE.get());
                        output.accept(VVBlocks.CARVED_SANDSTONE_OPEN.get());
                        output.accept(VVBlocks.CARVED_SANDSTONE_SPIRAL.get());

                        output.accept(VVBlocks.RED_CARVED_SANDSTONE_BOLD_AND_BRASH.get());
                        output.accept(VVBlocks.RED_CARVED_SANDSTONE_CLOSED.get());
                        output.accept(VVBlocks.RED_CARVED_SANDSTONE_EXCITED.get());
                        output.accept(VVBlocks.RED_CARVED_SANDSTONE_FROWN.get());
                        output.accept(VVBlocks.RED_CARVED_SANDSTONE_HAPPY.get());
                        output.accept(VVBlocks.RED_CARVED_SANDSTONE_LIPS.get());
                        output.accept(VVBlocks.RED_CARVED_SANDSTONE_SAD.get());
                        output.accept(VVBlocks.RED_CARVED_SANDSTONE_TOUCH.get());
                        output.accept(VVBlocks.RED_CARVED_SANDSTONE_MESSAGE.get());

                        output.accept(VVBlocks.OAK_PAPER_LANTERN.get());
                        output.accept(VVBlocks.SPRUCE_PAPER_LANTERN.get());
                        output.accept(VVBlocks.BIRCH_PAPER_LANTERN.get());
                        output.accept(VVBlocks.JUNGLE_PAPER_LANTERN.get());
                        output.accept(VVBlocks.ACACIA_PAPER_LANTERN.get());
                        output.accept(VVBlocks.DARK_OAK_PAPER_LANTERN.get());
                        output.accept(VVBlocks.MANGROVE_PAPER_LANTERN.get());
                        output.accept(VVBlocks.CHERRY_PAPER_LANTERN.get());
                        output.accept(VVBlocks.BAMBOO_PAPER_LANTERN.get());
                        output.accept(VVBlocks.CRIMSON_PAPER_LANTERN.get());
                        output.accept(VVBlocks.WARPED_PAPER_LANTERN.get());

                        output.accept(VVBlocks.AMPHORA_BLANK.get());
                        output.accept(VVBlocks.AMPHORA_CHIMERA.get());
                        output.accept(VVBlocks.AMPHORA_HARPY.get());
                        output.accept(VVBlocks.AMPHORA_MEDUSA.get());
                        output.accept(VVBlocks.AMPHORA_PEGASUS.get());
                        output.accept(VVBlocks.AMPHORA_RIDGES.get());
                        output.accept(VVBlocks.AMPHORA_SEGMENTED.get());
                        output.accept(VVBlocks.AMPHORA_SERPENT.get());
                        output.accept(VVBlocks.AMPHORA_SIREN.get());
                        output.accept(VVBlocks.AMPHORA_SPROUTS.get());
                        output.accept(VVBlocks.AMPHORA_STRIPED.get());
                        output.accept(VVBlocks.AMPHORA_TIDES.get());
                        output.accept(VVBlocks.AMPHORA_WAVY.get());
                        output.accept(VVBlocks.AMPHORA_ZIGZAG.get());

                        output.accept(VVBlocks.BEJEWELED_ORE.get());
                        output.accept(VVBlocks.DEEPSLATE_BEJEWELED_ORE.get());

                        output.accept(VVItems.AMBER.get());
                        output.accept(VVItems.AQUAMARINE.get());
                        output.accept(VVItems.ENSTATITE.get());
                        output.accept(VVItems.GARNET.get());
                        output.accept(VVItems.JADE.get());
                        output.accept(VVItems.KUNZITE.get());
                        output.accept(VVItems.LARIMAR.get());
                        output.accept(VVItems.MILKY_QUARTZ.get());
                        output.accept(VVItems.MOONSTONE.get());
                        output.accept(VVItems.ONYX.get());
                        output.accept(VVItems.PERIDOT.get());
                        output.accept(VVItems.ROSE_QUARTZ.get());
                        output.accept(VVItems.SAPPHIRE.get());
                        output.accept(VVItems.SMOKY_QUARTZ.get());
                        output.accept(VVItems.TAAFFEITE.get());
                        output.accept(VVItems.TOPAZ.get());

                        // crystal stands
                        output.accept(VVBlocks.AMBER_STAND.get());
                        output.accept(VVBlocks.AQUAMARINE_STAND.get());
                        output.accept(VVBlocks.ENSTATITE_STAND.get());
                        output.accept(VVBlocks.GARNET_STAND.get());
                        output.accept(VVBlocks.JADE_STAND.get());
                        output.accept(VVBlocks.KUNZITE_STAND.get());
                        output.accept(VVBlocks.LARIMAR_STAND.get());
                        output.accept(VVBlocks.MILKY_QUARTZ_STAND.get());
                        output.accept(VVBlocks.MOONSTONE_STAND.get());
                        output.accept(VVBlocks.ONYX_STAND.get());
                        output.accept(VVBlocks.PERIDOT_STAND.get());
                        output.accept(VVBlocks.ROSE_QUARTZ_STAND.get());
                        output.accept(VVBlocks.SAPPHIRE_STAND.get());
                        output.accept(VVBlocks.SMOKY_QUARTZ_STAND.get());
                        output.accept(VVBlocks.TAAFFEITE_STAND.get());
                        output.accept(VVBlocks.TOPAZ_STAND.get());

                        output.accept(VVBlocks.AMETHYST_STAND.get());
                        output.accept(VVBlocks.DIAMOND_STAND.get());
                        output.accept(VVBlocks.EMERALD_STAND.get());
                        output.accept(VVBlocks.QUARTZ_STAND.get());

                        // bejeweled lamp
                        output.accept(VVBlocks.BANDED_BEJEWELED_LAMP.get());
                        output.accept(VVBlocks.DIAMANTE_BEJEWELED_LAMP.get());
                        output.accept(VVBlocks.FLORAL_BEJEWELED_LAMP.get());
                        output.accept(VVBlocks.HONEYCOMB_BEJEWELED_LAMP.get());

                        // gems
                        output.accept(VVBlocks.AMBER_BLOCK.get());
                        output.accept(VVBlocks.POLISHED_AMBER.get());
                        output.accept(VVBlocks.AMBER_TILES.get());
                        output.accept(VVBlocks.AMBER_TILE_STAIRS.get());
                        output.accept(VVBlocks.AMBER_TILE_SLAB.get());
                        output.accept(VVBlocks.AMBER_TILE_WALL.get());

                        output.accept(VVBlocks.AQUAMARINE_BLOCK.get());
                        output.accept(VVBlocks.POLISHED_AQUAMARINE.get());
                        output.accept(VVBlocks.AQUAMARINE_TILES.get());
                        output.accept(VVBlocks.AQUAMARINE_TILE_STAIRS.get());
                        output.accept(VVBlocks.AQUAMARINE_TILE_SLAB.get());
                        output.accept(VVBlocks.AQUAMARINE_TILE_WALL.get());

                        output.accept(VVBlocks.ENSTATITE_BLOCK.get());
                        output.accept(VVBlocks.POLISHED_ENSTATITE.get());
                        output.accept(VVBlocks.ENSTATITE_TILES.get());
                        output.accept(VVBlocks.ENSTATITE_TILE_STAIRS.get());
                        output.accept(VVBlocks.ENSTATITE_TILE_SLAB.get());
                        output.accept(VVBlocks.ENSTATITE_TILE_WALL.get());

                        output.accept(VVBlocks.GARNET_BLOCK.get());
                        output.accept(VVBlocks.POLISHED_GARNET.get());
                        output.accept(VVBlocks.GARNET_TILES.get());
                        output.accept(VVBlocks.GARNET_TILE_STAIRS.get());
                        output.accept(VVBlocks.GARNET_TILE_SLAB.get());
                        output.accept(VVBlocks.GARNET_TILE_WALL.get());

                        output.accept(VVBlocks.JADE_BLOCK.get());
                        output.accept(VVBlocks.POLISHED_JADE.get());
                        output.accept(VVBlocks.JADE_TILES.get());
                        output.accept(VVBlocks.JADE_TILE_STAIRS.get());
                        output.accept(VVBlocks.JADE_TILE_SLAB.get());
                        output.accept(VVBlocks.JADE_TILE_WALL.get());

                        output.accept(VVBlocks.KUNZITE_BLOCK.get());
                        output.accept(VVBlocks.POLISHED_KUNZITE.get());
                        output.accept(VVBlocks.KUNZITE_TILES.get());
                        output.accept(VVBlocks.KUNZITE_TILE_STAIRS.get());
                        output.accept(VVBlocks.KUNZITE_TILE_SLAB.get());
                        output.accept(VVBlocks.KUNZITE_TILE_WALL.get());

                        output.accept(VVBlocks.LARIMAR_BLOCK.get());
                        output.accept(VVBlocks.POLISHED_LARIMAR.get());
                        output.accept(VVBlocks.LARIMAR_TILES.get());
                        output.accept(VVBlocks.LARIMAR_TILE_STAIRS.get());
                        output.accept(VVBlocks.LARIMAR_TILE_SLAB.get());
                        output.accept(VVBlocks.LARIMAR_TILE_WALL.get());

                        output.accept(VVBlocks.MILKY_QUARTZ_BLOCK.get());
                        output.accept(VVBlocks.POLISHED_MILKY_QUARTZ.get());
                        output.accept(VVBlocks.MILKY_QUARTZ_TILES.get());
                        output.accept(VVBlocks.MILKY_QUARTZ_TILE_STAIRS.get());
                        output.accept(VVBlocks.MILKY_QUARTZ_TILE_SLAB.get());
                        output.accept(VVBlocks.MILKY_QUARTZ_TILE_WALL.get());

                        output.accept(VVBlocks.MOONSTONE_BLOCK.get());
                        output.accept(VVBlocks.POLISHED_MOONSTONE.get());
                        output.accept(VVBlocks.MOONSTONE_TILES.get());
                        output.accept(VVBlocks.MOONSTONE_TILE_STAIRS.get());
                        output.accept(VVBlocks.MOONSTONE_TILE_SLAB.get());
                        output.accept(VVBlocks.MOONSTONE_TILE_WALL.get());

                        output.accept(VVBlocks.ONYX_BLOCK.get());
                        output.accept(VVBlocks.POLISHED_ONYX.get());
                        output.accept(VVBlocks.ONYX_TILES.get());
                        output.accept(VVBlocks.ONYX_TILE_STAIRS.get());
                        output.accept(VVBlocks.ONYX_TILE_SLAB.get());
                        output.accept(VVBlocks.ONYX_TILE_WALL.get());

                        output.accept(VVBlocks.PERIDOT_BLOCK.get());
                        output.accept(VVBlocks.POLISHED_PERIDOT.get());
                        output.accept(VVBlocks.PERIDOT_TILES.get());
                        output.accept(VVBlocks.PERIDOT_TILE_STAIRS.get());
                        output.accept(VVBlocks.PERIDOT_TILE_SLAB.get());
                        output.accept(VVBlocks.PERIDOT_TILE_WALL.get());

                        output.accept(VVBlocks.ROSE_QUARTZ_BLOCK.get());
                        output.accept(VVBlocks.POLISHED_ROSE_QUARTZ.get());
                        output.accept(VVBlocks.ROSE_QUARTZ_TILES.get());
                        output.accept(VVBlocks.ROSE_QUARTZ_TILE_STAIRS.get());
                        output.accept(VVBlocks.ROSE_QUARTZ_TILE_SLAB.get());
                        output.accept(VVBlocks.ROSE_QUARTZ_TILE_WALL.get());

                        output.accept(VVBlocks.SAPPHIRE_BLOCK.get());
                        output.accept(VVBlocks.POLISHED_SAPPHIRE.get());
                        output.accept(VVBlocks.SAPPHIRE_TILES.get());
                        output.accept(VVBlocks.SAPPHIRE_TILE_STAIRS.get());
                        output.accept(VVBlocks.SAPPHIRE_TILE_SLAB.get());
                        output.accept(VVBlocks.SAPPHIRE_TILE_WALL.get());

                        output.accept(VVBlocks.SMOKY_QUARTZ_BLOCK.get());
                        output.accept(VVBlocks.POLISHED_SMOKY_QUARTZ.get());
                        output.accept(VVBlocks.SMOKY_QUARTZ_TILES.get());
                        output.accept(VVBlocks.SMOKY_QUARTZ_TILE_STAIRS.get());
                        output.accept(VVBlocks.SMOKY_QUARTZ_TILE_SLAB.get());
                        output.accept(VVBlocks.SMOKY_QUARTZ_TILE_WALL.get());

                        output.accept(VVBlocks.TAAFFEITE_BLOCK.get());
                        output.accept(VVBlocks.POLISHED_TAAFFEITE.get());
                        output.accept(VVBlocks.TAAFFEITE_TILES.get());
                        output.accept(VVBlocks.TAAFFEITE_TILE_STAIRS.get());
                        output.accept(VVBlocks.TAAFFEITE_TILE_SLAB.get());
                        output.accept(VVBlocks.TAAFFEITE_TILE_WALL.get());

                        output.accept(VVBlocks.TOPAZ_BLOCK.get());
                        output.accept(VVBlocks.POLISHED_TOPAZ.get());
                        output.accept(VVBlocks.TOPAZ_TILES.get());
                        output.accept(VVBlocks.TOPAZ_TILE_STAIRS.get());
                        output.accept(VVBlocks.TOPAZ_TILE_SLAB.get());
                        output.accept(VVBlocks.TOPAZ_TILE_WALL.get());

                        // vanilla gem blocks
                        output.accept(VVBlocks.AMETHYST_TILES.get());
                        output.accept(VVBlocks.AMETHYST_TILE_STAIRS.get());
                        output.accept(VVBlocks.AMETHYST_TILE_SLAB.get());
                        output.accept(VVBlocks.AMETHYST_TILE_WALL.get());
                        output.accept(VVBlocks.DIAMOND_TILES.get());
                        output.accept(VVBlocks.DIAMOND_TILE_STAIRS.get());
                        output.accept(VVBlocks.DIAMOND_TILE_SLAB.get());
                        output.accept(VVBlocks.DIAMOND_TILE_WALL.get());
                        output.accept(VVBlocks.EMERALD_TILES.get());
                        output.accept(VVBlocks.EMERALD_TILE_STAIRS.get());
                        output.accept(VVBlocks.EMERALD_TILE_SLAB.get());
                        output.accept(VVBlocks.EMERALD_TILE_WALL.get());
                        output.accept(VVBlocks.QUARTZ_TILES.get());
                        output.accept(VVBlocks.QUARTZ_TILE_STAIRS.get());
                        output.accept(VVBlocks.QUARTZ_TILE_SLAB.get());
                        output.accept(VVBlocks.QUARTZ_TILE_WALL.get());

                        output.accept(VVBlocks.CALCITE_PILLAR.get());
                        output.accept(VVBlocks.CHISELED_CALCITE.get());
                        output.accept(VVBlocks.CALCITE_BRICKS.get());
                        output.accept(VVBlocks.CALCITE_BRICK_STAIRS.get());
                        output.accept(VVBlocks.CALCITE_BRICK_SLAB.get());
                        output.accept(VVBlocks.CALCITE_BRICK_WALL.get());

                        output.accept(VVBlocks.CALCITE_TILES.get());
                        output.accept(VVBlocks.CALCITE_TILE_STAIRS.get());
                        output.accept(VVBlocks.CALCITE_TILE_SLAB.get());
                        output.accept(VVBlocks.CALCITE_TILE_WALL.get());
                        output.accept(VVBlocks.STARRY_AMBER_CALCITE_TILES.get());
                        output.accept(VVBlocks.STARRY_AQUAMARINE_CALCITE_TILES.get());
                        output.accept(VVBlocks.STARRY_ENSTATITE_CALCITE_TILES.get());
                        output.accept(VVBlocks.STARRY_GARNET_CALCITE_TILES.get());
                        output.accept(VVBlocks.STARRY_JADE_CALCITE_TILES.get());
                        output.accept(VVBlocks.STARRY_KUNZITE_CALCITE_TILES.get());
                        output.accept(VVBlocks.STARRY_LARIMAR_CALCITE_TILES.get());
                        output.accept(VVBlocks.STARRY_MILKY_QUARTZ_CALCITE_TILES.get());
                        output.accept(VVBlocks.STARRY_MOONSTONE_CALCITE_TILES.get());
                        output.accept(VVBlocks.STARRY_ONYX_CALCITE_TILES.get());
                        output.accept(VVBlocks.STARRY_PERIDOT_CALCITE_TILES.get());
                        output.accept(VVBlocks.STARRY_ROSE_QUARTZ_CALCITE_TILES.get());
                        output.accept(VVBlocks.STARRY_SAPPHIRE_CALCITE_TILES.get());
                        output.accept(VVBlocks.STARRY_SMOKY_QUARTZ_CALCITE_TILES.get());
                        output.accept(VVBlocks.STARRY_TAAFFEITE_CALCITE_TILES.get());
                        output.accept(VVBlocks.STARRY_TOPAZ_CALCITE_TILES.get());

                        output.accept(VVBlocks.STARRY_AMETHYST_CALCITE_TILES.get());
                        output.accept(VVBlocks.STARRY_DIAMOND_CALCITE_TILES.get());
                        output.accept(VVBlocks.STARRY_EMERALD_CALCITE_TILES.get());
                        output.accept(VVBlocks.STARRY_QUARTZ_CALCITE_TILES.get());

                        // calcite bricks
                        output.accept(VVBlocks.AMBER_BEJEWELED_CALCITE_BRICKS.get());
                        output.accept(VVBlocks.AMBER_BEJEWELED_CALCITE_BRICK_STAIRS.get());
                        output.accept(VVBlocks.AMBER_BEJEWELED_CALCITE_BRICK_SLAB.get());
                        output.accept(VVBlocks.AMBER_BEJEWELED_CALCITE_BRICK_WALL.get());
                        output.accept(VVBlocks.AQUAMARINE_BEJEWELED_CALCITE_BRICKS.get());
                        output.accept(VVBlocks.AQUAMARINE_BEJEWELED_CALCITE_BRICK_STAIRS.get());
                        output.accept(VVBlocks.AQUAMARINE_BEJEWELED_CALCITE_BRICK_SLAB.get());
                        output.accept(VVBlocks.AQUAMARINE_BEJEWELED_CALCITE_BRICK_WALL.get());
                        output.accept(VVBlocks.ENSTATITE_BEJEWELED_CALCITE_BRICKS.get());
                        output.accept(VVBlocks.ENSTATITE_BEJEWELED_CALCITE_BRICK_STAIRS.get());
                        output.accept(VVBlocks.ENSTATITE_BEJEWELED_CALCITE_BRICK_SLAB.get());
                        output.accept(VVBlocks.ENSTATITE_BEJEWELED_CALCITE_BRICK_WALL.get());
                        output.accept(VVBlocks.GARNET_BEJEWELED_CALCITE_BRICKS.get());
                        output.accept(VVBlocks.GARNET_BEJEWELED_CALCITE_BRICK_STAIRS.get());
                        output.accept(VVBlocks.GARNET_BEJEWELED_CALCITE_BRICK_SLAB.get());
                        output.accept(VVBlocks.GARNET_BEJEWELED_CALCITE_BRICK_WALL.get());
                        output.accept(VVBlocks.JADE_BEJEWELED_CALCITE_BRICKS.get());
                        output.accept(VVBlocks.JADE_BEJEWELED_CALCITE_BRICK_STAIRS.get());
                        output.accept(VVBlocks.JADE_BEJEWELED_CALCITE_BRICK_SLAB.get());
                        output.accept(VVBlocks.JADE_BEJEWELED_CALCITE_BRICK_WALL.get());
                        output.accept(VVBlocks.KUNZITE_BEJEWELED_CALCITE_BRICKS.get());
                        output.accept(VVBlocks.KUNZITE_BEJEWELED_CALCITE_BRICK_STAIRS.get());
                        output.accept(VVBlocks.KUNZITE_BEJEWELED_CALCITE_BRICK_SLAB.get());
                        output.accept(VVBlocks.KUNZITE_BEJEWELED_CALCITE_BRICK_WALL.get());
                        output.accept(VVBlocks.LARIMAR_BEJEWELED_CALCITE_BRICKS.get());
                        output.accept(VVBlocks.LARIMAR_BEJEWELED_CALCITE_BRICK_STAIRS.get());
                        output.accept(VVBlocks.LARIMAR_BEJEWELED_CALCITE_BRICK_SLAB.get());
                        output.accept(VVBlocks.LARIMAR_BEJEWELED_CALCITE_BRICK_WALL.get());
                        output.accept(VVBlocks.MILKY_QUARTZ_BEJEWELED_CALCITE_BRICKS.get());
                        output.accept(VVBlocks.MILKY_QUARTZ_BEJEWELED_CALCITE_BRICK_STAIRS.get());
                        output.accept(VVBlocks.MILKY_QUARTZ_BEJEWELED_CALCITE_BRICK_SLAB.get());
                        output.accept(VVBlocks.MILKY_QUARTZ_BEJEWELED_CALCITE_BRICK_WALL.get());
                        output.accept(VVBlocks.MOONSTONE_BEJEWELED_CALCITE_BRICKS.get());
                        output.accept(VVBlocks.MOONSTONE_BEJEWELED_CALCITE_BRICK_STAIRS.get());
                        output.accept(VVBlocks.MOONSTONE_BEJEWELED_CALCITE_BRICK_SLAB.get());
                        output.accept(VVBlocks.MOONSTONE_BEJEWELED_CALCITE_BRICK_WALL.get());
                        output.accept(VVBlocks.ONYX_BEJEWELED_CALCITE_BRICKS.get());
                        output.accept(VVBlocks.ONYX_BEJEWELED_CALCITE_BRICK_STAIRS.get());
                        output.accept(VVBlocks.ONYX_BEJEWELED_CALCITE_BRICK_SLAB.get());
                        output.accept(VVBlocks.ONYX_BEJEWELED_CALCITE_BRICK_WALL.get());
                        output.accept(VVBlocks.PERIDOT_BEJEWELED_CALCITE_BRICKS.get());
                        output.accept(VVBlocks.PERIDOT_BEJEWELED_CALCITE_BRICK_STAIRS.get());
                        output.accept(VVBlocks.PERIDOT_BEJEWELED_CALCITE_BRICK_SLAB.get());
                        output.accept(VVBlocks.PERIDOT_BEJEWELED_CALCITE_BRICK_WALL.get());
                        output.accept(VVBlocks.ROSE_QUARTZ_BEJEWELED_CALCITE_BRICKS.get());
                        output.accept(VVBlocks.ROSE_QUARTZ_BEJEWELED_CALCITE_BRICK_STAIRS.get());
                        output.accept(VVBlocks.ROSE_QUARTZ_BEJEWELED_CALCITE_BRICK_SLAB.get());
                        output.accept(VVBlocks.ROSE_QUARTZ_BEJEWELED_CALCITE_BRICK_WALL.get());
                        output.accept(VVBlocks.SAPPHIRE_BEJEWELED_CALCITE_BRICKS.get());
                        output.accept(VVBlocks.SAPPHIRE_BEJEWELED_CALCITE_BRICK_STAIRS.get());
                        output.accept(VVBlocks.SAPPHIRE_BEJEWELED_CALCITE_BRICK_SLAB.get());
                        output.accept(VVBlocks.SAPPHIRE_BEJEWELED_CALCITE_BRICK_WALL.get());
                        output.accept(VVBlocks.SMOKY_QUARTZ_BEJEWELED_CALCITE_BRICKS.get());
                        output.accept(VVBlocks.SMOKY_QUARTZ_BEJEWELED_CALCITE_BRICK_STAIRS.get());
                        output.accept(VVBlocks.SMOKY_QUARTZ_BEJEWELED_CALCITE_BRICK_SLAB.get());
                        output.accept(VVBlocks.SMOKY_QUARTZ_BEJEWELED_CALCITE_BRICK_WALL.get());
                        output.accept(VVBlocks.TAAFFEITE_BEJEWELED_CALCITE_BRICKS.get());
                        output.accept(VVBlocks.TAAFFEITE_BEJEWELED_CALCITE_BRICK_STAIRS.get());
                        output.accept(VVBlocks.TAAFFEITE_BEJEWELED_CALCITE_BRICK_SLAB.get());
                        output.accept(VVBlocks.TAAFFEITE_BEJEWELED_CALCITE_BRICK_WALL.get());
                        output.accept(VVBlocks.TOPAZ_BEJEWELED_CALCITE_BRICKS.get());
                        output.accept(VVBlocks.TOPAZ_BEJEWELED_CALCITE_BRICK_STAIRS.get());
                        output.accept(VVBlocks.TOPAZ_BEJEWELED_CALCITE_BRICK_SLAB.get());
                        output.accept(VVBlocks.TOPAZ_BEJEWELED_CALCITE_BRICK_WALL.get());

                        output.accept(VVBlocks.AMETHYST_BEJEWELED_CALCITE_BRICKS.get());
                        output.accept(VVBlocks.AMETHYST_BEJEWELED_CALCITE_BRICK_STAIRS.get());
                        output.accept(VVBlocks.AMETHYST_BEJEWELED_CALCITE_BRICK_SLAB.get());
                        output.accept(VVBlocks.AMETHYST_BEJEWELED_CALCITE_BRICK_WALL.get());
                        output.accept(VVBlocks.DIAMOND_BEJEWELED_CALCITE_BRICKS.get());
                        output.accept(VVBlocks.DIAMOND_BEJEWELED_CALCITE_BRICK_STAIRS.get());
                        output.accept(VVBlocks.DIAMOND_BEJEWELED_CALCITE_BRICK_SLAB.get());
                        output.accept(VVBlocks.DIAMOND_BEJEWELED_CALCITE_BRICK_WALL.get());
                        output.accept(VVBlocks.EMERALD_BEJEWELED_CALCITE_BRICKS.get());
                        output.accept(VVBlocks.EMERALD_BEJEWELED_CALCITE_BRICK_STAIRS.get());
                        output.accept(VVBlocks.EMERALD_BEJEWELED_CALCITE_BRICK_SLAB.get());
                        output.accept(VVBlocks.EMERALD_BEJEWELED_CALCITE_BRICK_WALL.get());
                        output.accept(VVBlocks.QUARTZ_BEJEWELED_CALCITE_BRICKS.get());
                        output.accept(VVBlocks.QUARTZ_BEJEWELED_CALCITE_BRICK_STAIRS.get());
                        output.accept(VVBlocks.QUARTZ_BEJEWELED_CALCITE_BRICK_SLAB.get());
                        output.accept(VVBlocks.QUARTZ_BEJEWELED_CALCITE_BRICK_WALL.get());

                    }).build());
}