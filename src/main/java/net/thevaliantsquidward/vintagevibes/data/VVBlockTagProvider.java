package net.thevaliantsquidward.vintagevibes.data;

import net.minecraft.core.HolderLookup;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.thevaliantsquidward.vintagevibes.VintageVibes;

import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.thevaliantsquidward.vintagevibes.registry.tags.VVBlockTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

import static net.thevaliantsquidward.vintagevibes.registry.VVBlocks.*;

public class VVBlockTagProvider extends BlockTagsProvider {

    public VVBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, VintageVibes.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        // vanilla tags
        this.tag(BlockTags.STAIRS).add(
                AMBER_TILE_STAIRS.get(), AQUAMARINE_TILE_STAIRS.get(),
                ENSTATITE_TILE_STAIRS.get(), GARNET_TILE_STAIRS.get(),
                JADE_TILE_STAIRS.get(), KUNZITE_TILE_STAIRS.get(),
                LARIMAR_TILE_STAIRS.get(), MILKY_QUARTZ_TILE_STAIRS.get(),
                MOONSTONE_TILE_STAIRS.get(), ONYX_TILE_STAIRS.get(),
                PERIDOT_TILE_STAIRS.get(), ROSE_QUARTZ_TILE_STAIRS.get(),
                SAPPHIRE_TILE_STAIRS.get(), SMOKY_QUARTZ_TILE_STAIRS.get(),
                TAAFFEITE_TILE_STAIRS.get(), TOPAZ_TILE_STAIRS.get(),
                AMETHYST_TILE_STAIRS.get(), DIAMOND_TILE_STAIRS.get(), EMERALD_TILE_STAIRS.get(), QUARTZ_TILE_STAIRS.get(),

                CALCITE_TILE_STAIRS.get(), CALCITE_BRICK_STAIRS.get(),
                AMBER_BEJEWELED_CALCITE_BRICK_STAIRS.get(), AQUAMARINE_BEJEWELED_CALCITE_BRICK_STAIRS.get(),
                ENSTATITE_BEJEWELED_CALCITE_BRICK_STAIRS.get(), GARNET_BEJEWELED_CALCITE_BRICK_STAIRS.get(),
                JADE_BEJEWELED_CALCITE_BRICK_STAIRS.get(), KUNZITE_BEJEWELED_CALCITE_BRICK_STAIRS.get(),
                LARIMAR_BEJEWELED_CALCITE_BRICK_STAIRS.get(), MILKY_QUARTZ_BEJEWELED_CALCITE_BRICK_STAIRS.get(),
                MOONSTONE_BEJEWELED_CALCITE_BRICK_STAIRS.get(), ONYX_BEJEWELED_CALCITE_BRICK_STAIRS.get(),
                PERIDOT_BEJEWELED_CALCITE_BRICK_STAIRS.get(), ROSE_QUARTZ_BEJEWELED_CALCITE_BRICK_STAIRS.get(),
                SAPPHIRE_BEJEWELED_CALCITE_BRICK_STAIRS.get(), SMOKY_QUARTZ_BEJEWELED_CALCITE_BRICK_STAIRS.get(),
                TAAFFEITE_BEJEWELED_CALCITE_BRICK_STAIRS.get(), TOPAZ_BEJEWELED_CALCITE_BRICK_STAIRS.get(),
                AMETHYST_BEJEWELED_CALCITE_BRICK_STAIRS.get(), DIAMOND_BEJEWELED_CALCITE_BRICK_STAIRS.get(), EMERALD_BEJEWELED_CALCITE_BRICK_STAIRS.get(), QUARTZ_BEJEWELED_CALCITE_BRICK_STAIRS.get()
        );

        this.tag(BlockTags.SLABS).add(
                AMBER_TILE_SLAB.get(), AQUAMARINE_TILE_SLAB.get(),
                ENSTATITE_TILE_SLAB.get(), GARNET_TILE_SLAB.get(),
                JADE_TILE_SLAB.get(), KUNZITE_TILE_SLAB.get(),
                LARIMAR_TILE_SLAB.get(), MILKY_QUARTZ_TILE_SLAB.get(),
                MOONSTONE_TILE_SLAB.get(), ONYX_TILE_SLAB.get(),
                PERIDOT_TILE_SLAB.get(), ROSE_QUARTZ_TILE_SLAB.get(),
                SAPPHIRE_TILE_SLAB.get(), SMOKY_QUARTZ_TILE_SLAB.get(),
                TAAFFEITE_TILE_SLAB.get(), TOPAZ_TILE_SLAB.get(),
                AMETHYST_TILE_SLAB.get(), DIAMOND_TILE_SLAB.get(), EMERALD_TILE_SLAB.get(), QUARTZ_TILE_SLAB.get(),

                CALCITE_TILE_SLAB.get(), CALCITE_BRICK_SLAB.get(),
                AMBER_BEJEWELED_CALCITE_BRICK_SLAB.get(), AQUAMARINE_BEJEWELED_CALCITE_BRICK_SLAB.get(),
                ENSTATITE_BEJEWELED_CALCITE_BRICK_SLAB.get(), GARNET_BEJEWELED_CALCITE_BRICK_SLAB.get(),
                JADE_BEJEWELED_CALCITE_BRICK_SLAB.get(), KUNZITE_BEJEWELED_CALCITE_BRICK_SLAB.get(),
                LARIMAR_BEJEWELED_CALCITE_BRICK_SLAB.get(), MILKY_QUARTZ_BEJEWELED_CALCITE_BRICK_SLAB.get(),
                MOONSTONE_BEJEWELED_CALCITE_BRICK_SLAB.get(), ONYX_BEJEWELED_CALCITE_BRICK_SLAB.get(),
                PERIDOT_BEJEWELED_CALCITE_BRICK_SLAB.get(), ROSE_QUARTZ_BEJEWELED_CALCITE_BRICK_SLAB.get(),
                SAPPHIRE_BEJEWELED_CALCITE_BRICK_SLAB.get(), SMOKY_QUARTZ_BEJEWELED_CALCITE_BRICK_SLAB.get(),
                TAAFFEITE_BEJEWELED_CALCITE_BRICK_SLAB.get(), TOPAZ_BEJEWELED_CALCITE_BRICK_SLAB.get(),
                AMETHYST_BEJEWELED_CALCITE_BRICK_SLAB.get(), DIAMOND_BEJEWELED_CALCITE_BRICK_SLAB.get(), EMERALD_BEJEWELED_CALCITE_BRICK_SLAB.get(), QUARTZ_BEJEWELED_CALCITE_BRICK_SLAB.get()
        );

        this.tag(BlockTags.WALLS).add(
                AMBER_TILE_WALL.get(), AQUAMARINE_TILE_WALL.get(),
                ENSTATITE_TILE_WALL.get(), GARNET_TILE_WALL.get(),
                JADE_TILE_WALL.get(), KUNZITE_TILE_WALL.get(),
                LARIMAR_TILE_WALL.get(), MILKY_QUARTZ_TILE_WALL.get(),
                MOONSTONE_TILE_WALL.get(), ONYX_TILE_WALL.get(),
                PERIDOT_TILE_WALL.get(), ROSE_QUARTZ_TILE_WALL.get(),
                SAPPHIRE_TILE_WALL.get(), SMOKY_QUARTZ_TILE_WALL.get(),
                TAAFFEITE_TILE_WALL.get(), TOPAZ_TILE_WALL.get(),
                AMETHYST_TILE_WALL.get(), DIAMOND_TILE_WALL.get(), EMERALD_TILE_WALL.get(), QUARTZ_TILE_WALL.get(),

                CALCITE_TILE_WALL.get(), CALCITE_BRICK_WALL.get(),
                AMBER_BEJEWELED_CALCITE_BRICK_WALL.get(), AQUAMARINE_BEJEWELED_CALCITE_BRICK_WALL.get(),
                ENSTATITE_BEJEWELED_CALCITE_BRICK_WALL.get(), GARNET_BEJEWELED_CALCITE_BRICK_WALL.get(),
                JADE_BEJEWELED_CALCITE_BRICK_WALL.get(), KUNZITE_BEJEWELED_CALCITE_BRICK_WALL.get(),
                LARIMAR_BEJEWELED_CALCITE_BRICK_WALL.get(), MILKY_QUARTZ_BEJEWELED_CALCITE_BRICK_WALL.get(),
                MOONSTONE_BEJEWELED_CALCITE_BRICK_WALL.get(), ONYX_BEJEWELED_CALCITE_BRICK_WALL.get(),
                PERIDOT_BEJEWELED_CALCITE_BRICK_WALL.get(), ROSE_QUARTZ_BEJEWELED_CALCITE_BRICK_WALL.get(),
                SAPPHIRE_BEJEWELED_CALCITE_BRICK_WALL.get(), SMOKY_QUARTZ_BEJEWELED_CALCITE_BRICK_WALL.get(),
                TAAFFEITE_BEJEWELED_CALCITE_BRICK_WALL.get(), TOPAZ_BEJEWELED_CALCITE_BRICK_WALL.get(),
                AMETHYST_BEJEWELED_CALCITE_BRICK_WALL.get(), DIAMOND_BEJEWELED_CALCITE_BRICK_WALL.get(), EMERALD_BEJEWELED_CALCITE_BRICK_WALL.get(), QUARTZ_BEJEWELED_CALCITE_BRICK_WALL.get()
        );

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
                BEJEWELED_ORE.get(), DEEPSLATE_BEJEWELED_ORE.get(),

                CARVED_SANDSTONE_CONCERNED.get(), CARVED_SANDSTONE_DISAPPOINTED.get(),  CARVED_SANDSTONE_FISHEYE.get(),
                CARVED_SANDSTONE_GRIN.get(), CARVED_SANDSTONE_JOYOUS.get(), CARVED_SANDSTONE_LAZYBONES.get(),
                CARVED_SANDSTONE_NOSE.get(), CARVED_SANDSTONE_OPEN.get(), CARVED_SANDSTONE_SPIRAL.get(),

                RED_CARVED_SANDSTONE_CLOSED.get(), RED_CARVED_SANDSTONE_BOLD_AND_BRASH.get(), RED_CARVED_SANDSTONE_EXCITED.get(),
                RED_CARVED_SANDSTONE_FROWN.get(), RED_CARVED_SANDSTONE_LIPS.get(), RED_CARVED_SANDSTONE_HAPPY.get(),
                RED_CARVED_SANDSTONE_MESSAGE.get(), RED_CARVED_SANDSTONE_SAD.get(), RED_CARVED_SANDSTONE_TOUCH.get(),

                AMBER_STAND.get(), AQUAMARINE_STAND.get(),
                ENSTATITE_STAND.get(), GARNET_STAND.get(),
                JADE_STAND.get(), KUNZITE_STAND.get(),
                LARIMAR_STAND.get(), MILKY_QUARTZ_STAND.get(),
                MOONSTONE_STAND.get(), ONYX_STAND.get(),
                PERIDOT_STAND.get(), ROSE_QUARTZ_STAND.get(),
                SAPPHIRE_STAND.get(), SMOKY_QUARTZ_STAND.get(),
                TAAFFEITE_STAND.get(), TOPAZ_STAND.get(),
                AMETHYST_STAND.get(), DIAMOND_STAND.get(), EMERALD_STAND.get(), QUARTZ_STAND.get(),

                POLISHED_AMBER.get(), POLISHED_AQUAMARINE.get(),
                POLISHED_ENSTATITE.get(), POLISHED_GARNET.get(),
                POLISHED_JADE.get(), POLISHED_KUNZITE.get(),
                POLISHED_LARIMAR.get(), POLISHED_MILKY_QUARTZ.get(),
                POLISHED_MOONSTONE.get(), POLISHED_ONYX.get(),
                POLISHED_PERIDOT.get(), POLISHED_ROSE_QUARTZ.get(),
                POLISHED_SAPPHIRE.get(), POLISHED_SMOKY_QUARTZ.get(),
                POLISHED_TAAFFEITE.get(), POLISHED_TOPAZ.get(),

                AMBER_BLOCK.get(), AQUAMARINE_BLOCK.get(),
                ENSTATITE_BLOCK.get(), GARNET_BLOCK.get(),
                JADE_BLOCK.get(), KUNZITE_BLOCK.get(),
                LARIMAR_BLOCK.get(), MILKY_QUARTZ_BLOCK.get(),
                MOONSTONE_BLOCK.get(), ONYX_BLOCK.get(),
                PERIDOT_BLOCK.get(), ROSE_QUARTZ_BLOCK.get(),
                SAPPHIRE_BLOCK.get(), SMOKY_QUARTZ_BLOCK.get(),
                TAAFFEITE_BLOCK.get(), TOPAZ_BLOCK.get(),

                AMBER_TILES.get(), AQUAMARINE_TILES.get(),
                ENSTATITE_TILES.get(), GARNET_TILES.get(),
                JADE_TILES.get(), KUNZITE_TILES.get(),
                LARIMAR_TILES.get(), MILKY_QUARTZ_TILES.get(),
                MOONSTONE_TILES.get(), ONYX_TILES.get(),
                PERIDOT_TILES.get(), ROSE_QUARTZ_TILES.get(),
                SAPPHIRE_TILES.get(), SMOKY_QUARTZ_TILES.get(),
                TAAFFEITE_TILES.get(), TOPAZ_TILES.get(),
                AMETHYST_TILES.get(), DIAMOND_TILES.get(), EMERALD_TILES.get(), QUARTZ_TILES.get(),

                CALCITE_TILES.get(), CALCITE_BRICKS.get(),
                AMBER_BEJEWELED_CALCITE_BRICKS.get(), AQUAMARINE_BEJEWELED_CALCITE_BRICKS.get(),
                ENSTATITE_BEJEWELED_CALCITE_BRICKS.get(), GARNET_BEJEWELED_CALCITE_BRICKS.get(),
                JADE_BEJEWELED_CALCITE_BRICKS.get(), KUNZITE_BEJEWELED_CALCITE_BRICKS.get(),
                LARIMAR_BEJEWELED_CALCITE_BRICKS.get(), MILKY_QUARTZ_BEJEWELED_CALCITE_BRICKS.get(),
                MOONSTONE_BEJEWELED_CALCITE_BRICKS.get(), ONYX_BEJEWELED_CALCITE_BRICKS.get(),
                PERIDOT_BEJEWELED_CALCITE_BRICKS.get(), ROSE_QUARTZ_BEJEWELED_CALCITE_BRICKS.get(),
                SAPPHIRE_BEJEWELED_CALCITE_BRICKS.get(), SMOKY_QUARTZ_BEJEWELED_CALCITE_BRICKS.get(),
                TAAFFEITE_BEJEWELED_CALCITE_BRICKS.get(), TOPAZ_BEJEWELED_CALCITE_BRICKS.get(),
                AMETHYST_BEJEWELED_CALCITE_BRICKS.get(), DIAMOND_BEJEWELED_CALCITE_BRICKS.get(), EMERALD_BEJEWELED_CALCITE_BRICKS.get(), QUARTZ_BEJEWELED_CALCITE_BRICKS.get(),


                AMBER_TILE_STAIRS.get(), AQUAMARINE_TILE_STAIRS.get(),
                ENSTATITE_TILE_STAIRS.get(), GARNET_TILE_STAIRS.get(),
                JADE_TILE_STAIRS.get(), KUNZITE_TILE_STAIRS.get(),
                LARIMAR_TILE_STAIRS.get(), MILKY_QUARTZ_TILE_STAIRS.get(),
                MOONSTONE_TILE_STAIRS.get(), ONYX_TILE_STAIRS.get(),
                PERIDOT_TILE_STAIRS.get(), ROSE_QUARTZ_TILE_STAIRS.get(),
                SAPPHIRE_TILE_STAIRS.get(), SMOKY_QUARTZ_TILE_STAIRS.get(),
                TAAFFEITE_TILE_STAIRS.get(), TOPAZ_TILE_STAIRS.get(),
                AMETHYST_TILE_STAIRS.get(), DIAMOND_TILE_STAIRS.get(), EMERALD_TILE_STAIRS.get(), QUARTZ_TILE_STAIRS.get(),

                CALCITE_TILE_STAIRS.get(), CALCITE_BRICK_STAIRS.get(),
                AMBER_BEJEWELED_CALCITE_BRICK_STAIRS.get(), AQUAMARINE_BEJEWELED_CALCITE_BRICK_STAIRS.get(),
                ENSTATITE_BEJEWELED_CALCITE_BRICK_STAIRS.get(), GARNET_BEJEWELED_CALCITE_BRICK_STAIRS.get(),
                JADE_BEJEWELED_CALCITE_BRICK_STAIRS.get(), KUNZITE_BEJEWELED_CALCITE_BRICK_STAIRS.get(),
                LARIMAR_BEJEWELED_CALCITE_BRICK_STAIRS.get(), MILKY_QUARTZ_BEJEWELED_CALCITE_BRICK_STAIRS.get(),
                MOONSTONE_BEJEWELED_CALCITE_BRICK_STAIRS.get(), ONYX_BEJEWELED_CALCITE_BRICK_STAIRS.get(),
                PERIDOT_BEJEWELED_CALCITE_BRICK_STAIRS.get(), ROSE_QUARTZ_BEJEWELED_CALCITE_BRICK_STAIRS.get(),
                SAPPHIRE_BEJEWELED_CALCITE_BRICK_STAIRS.get(), SMOKY_QUARTZ_BEJEWELED_CALCITE_BRICK_STAIRS.get(),
                TAAFFEITE_BEJEWELED_CALCITE_BRICK_STAIRS.get(), TOPAZ_BEJEWELED_CALCITE_BRICK_STAIRS.get(),
                AMETHYST_BEJEWELED_CALCITE_BRICK_STAIRS.get(), DIAMOND_BEJEWELED_CALCITE_BRICK_STAIRS.get(), EMERALD_BEJEWELED_CALCITE_BRICK_STAIRS.get(), QUARTZ_BEJEWELED_CALCITE_BRICK_STAIRS.get(),

                AMBER_TILE_SLAB.get(), AQUAMARINE_TILE_SLAB.get(),
                ENSTATITE_TILE_SLAB.get(), GARNET_TILE_SLAB.get(),
                JADE_TILE_SLAB.get(), KUNZITE_TILE_SLAB.get(),
                LARIMAR_TILE_SLAB.get(), MILKY_QUARTZ_TILE_SLAB.get(),
                MOONSTONE_TILE_SLAB.get(), ONYX_TILE_SLAB.get(),
                PERIDOT_TILE_SLAB.get(), ROSE_QUARTZ_TILE_SLAB.get(),
                SAPPHIRE_TILE_SLAB.get(), SMOKY_QUARTZ_TILE_SLAB.get(),
                TAAFFEITE_TILE_SLAB.get(), TOPAZ_TILE_SLAB.get(),
                AMETHYST_TILE_SLAB.get(), DIAMOND_TILE_SLAB.get(), EMERALD_TILE_SLAB.get(), QUARTZ_TILE_SLAB.get(),

                CALCITE_TILE_SLAB.get(), CALCITE_BRICK_SLAB.get(),
                AMBER_BEJEWELED_CALCITE_BRICK_SLAB.get(), AQUAMARINE_BEJEWELED_CALCITE_BRICK_SLAB.get(),
                ENSTATITE_BEJEWELED_CALCITE_BRICK_SLAB.get(), GARNET_BEJEWELED_CALCITE_BRICK_SLAB.get(),
                JADE_BEJEWELED_CALCITE_BRICK_SLAB.get(), KUNZITE_BEJEWELED_CALCITE_BRICK_SLAB.get(),
                LARIMAR_BEJEWELED_CALCITE_BRICK_SLAB.get(), MILKY_QUARTZ_BEJEWELED_CALCITE_BRICK_SLAB.get(),
                MOONSTONE_BEJEWELED_CALCITE_BRICK_SLAB.get(), ONYX_BEJEWELED_CALCITE_BRICK_SLAB.get(),
                PERIDOT_BEJEWELED_CALCITE_BRICK_SLAB.get(), ROSE_QUARTZ_BEJEWELED_CALCITE_BRICK_SLAB.get(),
                SAPPHIRE_BEJEWELED_CALCITE_BRICK_SLAB.get(), SMOKY_QUARTZ_BEJEWELED_CALCITE_BRICK_SLAB.get(),
                TAAFFEITE_BEJEWELED_CALCITE_BRICK_SLAB.get(), TOPAZ_BEJEWELED_CALCITE_BRICK_SLAB.get(),
                AMETHYST_BEJEWELED_CALCITE_BRICK_SLAB.get(), DIAMOND_BEJEWELED_CALCITE_BRICK_SLAB.get(), EMERALD_BEJEWELED_CALCITE_BRICK_SLAB.get(), QUARTZ_BEJEWELED_CALCITE_BRICK_SLAB.get(),

                AMBER_TILE_WALL.get(), AQUAMARINE_TILE_WALL.get(),
                ENSTATITE_TILE_WALL.get(), GARNET_TILE_WALL.get(),
                JADE_TILE_WALL.get(), KUNZITE_TILE_WALL.get(),
                LARIMAR_TILE_WALL.get(), MILKY_QUARTZ_TILE_WALL.get(),
                MOONSTONE_TILE_WALL.get(), ONYX_TILE_WALL.get(),
                PERIDOT_TILE_WALL.get(), ROSE_QUARTZ_TILE_WALL.get(),
                SAPPHIRE_TILE_WALL.get(), SMOKY_QUARTZ_TILE_WALL.get(),
                TAAFFEITE_TILE_WALL.get(), TOPAZ_TILE_WALL.get(),
                AMETHYST_TILE_WALL.get(), DIAMOND_TILE_WALL.get(), EMERALD_TILE_WALL.get(), QUARTZ_TILE_WALL.get(),

                CALCITE_TILE_WALL.get(), CALCITE_BRICK_WALL.get(),
                AMBER_BEJEWELED_CALCITE_BRICK_WALL.get(), AQUAMARINE_BEJEWELED_CALCITE_BRICK_WALL.get(),
                ENSTATITE_BEJEWELED_CALCITE_BRICK_WALL.get(), GARNET_BEJEWELED_CALCITE_BRICK_WALL.get(),
                JADE_BEJEWELED_CALCITE_BRICK_WALL.get(), KUNZITE_BEJEWELED_CALCITE_BRICK_WALL.get(),
                LARIMAR_BEJEWELED_CALCITE_BRICK_WALL.get(), MILKY_QUARTZ_BEJEWELED_CALCITE_BRICK_WALL.get(),
                MOONSTONE_BEJEWELED_CALCITE_BRICK_WALL.get(), ONYX_BEJEWELED_CALCITE_BRICK_WALL.get(),
                PERIDOT_BEJEWELED_CALCITE_BRICK_WALL.get(), ROSE_QUARTZ_BEJEWELED_CALCITE_BRICK_WALL.get(),
                SAPPHIRE_BEJEWELED_CALCITE_BRICK_WALL.get(), SMOKY_QUARTZ_BEJEWELED_CALCITE_BRICK_WALL.get(),
                TAAFFEITE_BEJEWELED_CALCITE_BRICK_WALL.get(), TOPAZ_BEJEWELED_CALCITE_BRICK_WALL.get(),
                AMETHYST_BEJEWELED_CALCITE_BRICK_WALL.get(), DIAMOND_BEJEWELED_CALCITE_BRICK_WALL.get(), EMERALD_BEJEWELED_CALCITE_BRICK_WALL.get(), QUARTZ_BEJEWELED_CALCITE_BRICK_WALL.get()
        );

        this.tag(BlockTags.MINEABLE_WITH_AXE).add(
                GREEN_PINEAPPLE.get(),
                GREEN_PINEAPPLE_SCALE_BLOCK.get(),
                SPOTTED_PINEAPPLE.get(),
                SPOTTED_PINEAPPLE_SCALE_BLOCK.get(),
                PINEAPPLE.get(),
                PINEAPPLE_SCALE_BLOCK.get(),
                PINEAPPLE_STEM.get(),
                ATTACHED_PINEAPPLE_STEM.get(),
                OAK_PAPER_LANTERN.get(),
                SPRUCE_PAPER_LANTERN.get(),
                BIRCH_PAPER_LANTERN.get(),
                JUNGLE_PAPER_LANTERN.get(),
                ACACIA_PAPER_LANTERN.get(),
                DARK_OAK_PAPER_LANTERN.get(),
                WARPED_PAPER_LANTERN.get(),
                CRIMSON_PAPER_LANTERN.get(),
                MANGROVE_PAPER_LANTERN.get(),
                CHERRY_PAPER_LANTERN.get(),
                BAMBOO_PAPER_LANTERN.get()
        );

        this.tag(BlockTags.MINEABLE_WITH_HOE).add(
                SKINNED_PINEAPPLE.get(),
                PINEAPPLE_FLESH_BLOCK.get()
        );

        this.tag(BlockTags.CROPS).add(
                PINEAPPLE_STEM.get(),
                ATTACHED_PINEAPPLE_STEM.get()
        );

        this.tag(BlockTags.MAINTAINS_FARMLAND).add(
                PINEAPPLE_STEM.get(),
                ATTACHED_PINEAPPLE_STEM.get()
        );

        this.tag(BlockTags.SWORD_EFFICIENT).add(
                GREEN_PINEAPPLE.get(),
                GREEN_PINEAPPLE_SCALE_BLOCK.get(),
                SPOTTED_PINEAPPLE.get(),
                SPOTTED_PINEAPPLE_SCALE_BLOCK.get(),
                PINEAPPLE.get(),
                PINEAPPLE_SCALE_BLOCK.get(),
                SKINNED_PINEAPPLE.get(),
                PINEAPPLE_FLESH_BLOCK.get()
        );

        this.tag(BlockTags.ENDERMAN_HOLDABLE).add(
                GREEN_PINEAPPLE.get(),
                GREEN_PINEAPPLE_SCALE_BLOCK.get(),
                SPOTTED_PINEAPPLE.get(),
                SPOTTED_PINEAPPLE_SCALE_BLOCK.get(),
                PINEAPPLE.get(),
                PINEAPPLE_SCALE_BLOCK.get(),
                SKINNED_PINEAPPLE.get(),
                PINEAPPLE_FLESH_BLOCK.get()
        );

        this.tag(BlockTags.NEEDS_STONE_TOOL);

        this.tag(BlockTags.NEEDS_IRON_TOOL).add(
                DEEPSLATE_BEJEWELED_ORE.get(), BEJEWELED_ORE.get(),
                DIAMOND_TILES.get(), EMERALD_TILES.get()
        );

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL);

        this.tag(BlockTags.BEACON_BASE_BLOCKS);

        this.tag(BlockTags.SMALL_FLOWERS).add(
                WHITE_HIBISCUS.get(), RED_HIBISCUS.get(), ORANGE_HIBISCUS.get(), PURPLE_HIBISCUS.get(), PINK_HIBISCUS.get(),
                WHITE_CALLA.get(), BLACK_CALLA.get(), ORANGE_CALLA.get(), YELLOW_CALLA.get(),
                ORANGE_BROMELIAD.get(), YELLOW_BROMELIAD.get(), PURPLE_BROMELIAD.get(), PINK_BROMELIAD.get(),
                WHITE_ORCHID.get(), ORANGE_ORCHID.get(), YELLOW_ORCHID.get(), PINK_ORCHID.get(),
                LACELEAF.get(),
                TORCH_GINGER.get()
        );

        this.tag(BlockTags.TALL_FLOWERS).add(
                TALL_WHITE_HIBISCUS.get(), TALL_RED_HIBISCUS.get(), TALL_ORANGE_HIBISCUS.get(), TALL_PURPLE_HIBISCUS.get(), TALL_PINK_HIBISCUS.get(),
                BIRD_OF_PARADISE.get(), CANNA_LILY.get(), TALL_LACELEAF.get()
        );

        this.tag(BlockTags.SAPLINGS).add(
                GRAPEFRUIT_SAPLING.get(),
                LEMON_SAPLING.get(),
                LIME_SAPLING.get(),
                MANGO_SAPLING.get(),
                ORANGE_SAPLING.get()
        );

        this.tag(BlockTags.LEAVES).add(
                GRAPEFRUIT_LEAVES.get(),
                LEMON_LEAVES.get(),
                LIME_LEAVES.get(),
                MANGO_LEAVES.get(),
                ORANGE_LEAVES.get(),
                FLOWERING_GRAPEFRUIT_LEAVES.get(),
                FLOWERING_LEMON_LEAVES.get(),
                FLOWERING_LIME_LEAVES.get(),
                FLOWERING_MANGO_LEAVES.get(),
                FLOWERING_ORANGE_LEAVES.get(),
                FRUITFUL_GRAPEFRUIT_LEAVES.get(),
                FRUITFUL_LEMON_LEAVES.get(),
                FRUITFUL_LIME_LEAVES.get(),
                FRUITFUL_MANGO_LEAVES.get(),
                FRUITFUL_ORANGE_LEAVES.get()
        );

        // forge tags
        this.tag(Tags.Blocks.ORES).add(
                BEJEWELED_ORE.get(),
                DEEPSLATE_BEJEWELED_ORE.get()
        );

        this.tag(Tags.Blocks.ORES_IN_GROUND_STONE).add(BEJEWELED_ORE.get());

        this.tag(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE).add(DEEPSLATE_BEJEWELED_ORE.get());

        this.tag(Tags.Blocks.ORE_RATES_DENSE).add(
                BEJEWELED_ORE.get(),
                DEEPSLATE_BEJEWELED_ORE.get()
        );

        this.tag(Tags.Blocks.STORAGE_BLOCKS).add(
                AMBER_BLOCK.get(), AQUAMARINE_BLOCK.get(),
                ENSTATITE_BLOCK.get(), GARNET_BLOCK.get(),
                JADE_BLOCK.get(), KUNZITE_BLOCK.get(),
                LARIMAR_BLOCK.get(), MILKY_QUARTZ_BLOCK.get(),
                MOONSTONE_BLOCK.get(), ONYX_BLOCK.get(),
                PERIDOT_BLOCK.get(), ROSE_QUARTZ_BLOCK.get(),
                SAPPHIRE_BLOCK.get(), SMOKY_QUARTZ_BLOCK.get(),
                TAAFFEITE_BLOCK.get(), TOPAZ_BLOCK.get()
        );

        this.tag(Tags.Blocks.SANDSTONE).add(
                CARVED_SANDSTONE_CONCERNED.get(), CARVED_SANDSTONE_DISAPPOINTED.get(),  CARVED_SANDSTONE_FISHEYE.get(),
                CARVED_SANDSTONE_GRIN.get(), CARVED_SANDSTONE_JOYOUS.get(), CARVED_SANDSTONE_LAZYBONES.get(),
                CARVED_SANDSTONE_NOSE.get(), CARVED_SANDSTONE_OPEN.get(), CARVED_SANDSTONE_SPIRAL.get(),

                RED_CARVED_SANDSTONE_CLOSED.get(), RED_CARVED_SANDSTONE_BOLD_AND_BRASH.get(), RED_CARVED_SANDSTONE_EXCITED.get(),
                RED_CARVED_SANDSTONE_FROWN.get(), RED_CARVED_SANDSTONE_LIPS.get(), RED_CARVED_SANDSTONE_HAPPY.get(),
                RED_CARVED_SANDSTONE_MESSAGE.get(), RED_CARVED_SANDSTONE_SAD.get(), RED_CARVED_SANDSTONE_TOUCH.get()
        );

        // vintage vibes tags
        this.tag(VVBlockTags.BEJEWELED_ORES).add(BEJEWELED_ORE.get(), DEEPSLATE_BEJEWELED_ORE.get());

        this.tag(VVBlockTags.MINEABLE_WITH_OBSIDIAN_TOOL)
                .addTag(BlockTags.MINEABLE_WITH_PICKAXE)
                .addTag(BlockTags.MINEABLE_WITH_AXE)
                .addTag(BlockTags.MINEABLE_WITH_SHOVEL)
                .addTag(BlockTags.MINEABLE_WITH_HOE);

        this.tag(VVBlockTags.PINEAPPLES).add(
                GREEN_PINEAPPLE.get(),
                SPOTTED_PINEAPPLE.get(),
                PINEAPPLE.get(),
                GREEN_PINEAPPLE_SCALE_BLOCK.get(),
                SPOTTED_PINEAPPLE_SCALE_BLOCK.get(),
                PINEAPPLE_SCALE_BLOCK.get(),
                SKINNED_PINEAPPLE.get(),
                PINEAPPLE_FLESH_BLOCK.get()
        );

        this.tag(VVBlockTags.SKINNED_PINEAPPLES).add(
                SKINNED_PINEAPPLE.get(),
                PINEAPPLE_FLESH_BLOCK.get()
        );

        this.tag(VVBlockTags.FLOWERING_LEAVES).add(
                FLOWERING_GRAPEFRUIT_LEAVES.get(),
                FLOWERING_LEMON_LEAVES.get(),
                FLOWERING_LIME_LEAVES.get(),
                FLOWERING_MANGO_LEAVES.get(),
                FLOWERING_ORANGE_LEAVES.get()
        );

        this.tag(VVBlockTags.BEES_POLLINATE).addTag(VVBlockTags.FLOWERING_LEAVES);

        // vintage vibes forge tags
        this.tag(VVBlockTags.ORES_BEJEWELED).addTag(VVBlockTags.BEJEWELED_ORES);

        this.tag(VVBlockTags.STORAGE_BLOCKS_AMBER).add(AMBER_BLOCK.get());
        this.tag(VVBlockTags.STORAGE_BLOCKS_AQUAMARINE).add(AQUAMARINE_BLOCK.get());
        this.tag(VVBlockTags.STORAGE_BLOCKS_ENSTATITE).add(ENSTATITE_BLOCK.get());
        this.tag(VVBlockTags.STORAGE_BLOCKS_GARNET).add(GARNET_BLOCK.get());
        this.tag(VVBlockTags.STORAGE_BLOCKS_JADE).add(JADE_BLOCK.get());
        this.tag(VVBlockTags.STORAGE_BLOCKS_KUNZITE).add(KUNZITE_BLOCK.get());
        this.tag(VVBlockTags.STORAGE_BLOCKS_LARIMAR).add(LARIMAR_BLOCK.get());
        this.tag(VVBlockTags.STORAGE_BLOCKS_MILKY_QUARTZ).add(MILKY_QUARTZ_BLOCK.get());
        this.tag(VVBlockTags.STORAGE_BLOCKS_MOONSTONE).add(MOONSTONE_BLOCK.get());
        this.tag(VVBlockTags.STORAGE_BLOCKS_ONYX).add(ONYX_BLOCK.get());
        this.tag(VVBlockTags.STORAGE_BLOCKS_PERIDOT).add(PERIDOT_BLOCK.get());
        this.tag(VVBlockTags.STORAGE_BLOCKS_ROSE_QUARTZ).add(ROSE_QUARTZ_BLOCK.get());
        this.tag(VVBlockTags.STORAGE_BLOCKS_SAPPHIRE).add(SAPPHIRE_BLOCK.get());
        this.tag(VVBlockTags.STORAGE_BLOCKS_SMOKY_QUARTZ).add(SMOKY_QUARTZ_BLOCK.get());
        this.tag(VVBlockTags.STORAGE_BLOCKS_TAAFFEITE).add(TAAFFEITE_BLOCK.get());
        this.tag(VVBlockTags.STORAGE_BLOCKS_TOPAZ).add(TOPAZ_BLOCK.get());
    }

    @Override
    public String getName() {
        return VintageVibes.MOD_ID + " Block Tags";
    }
}
