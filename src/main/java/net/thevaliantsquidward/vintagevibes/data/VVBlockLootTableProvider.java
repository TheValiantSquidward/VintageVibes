package net.thevaliantsquidward.vintagevibes.data;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoublePlantBlock;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.storage.loot.LootTable;
import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Set;

import static net.thevaliantsquidward.vintagevibes.registry.VVBlocks.*;

public class VVBlockLootTableProvider extends BlockLootSubProvider {

    private final Set<Block> knownBlocks = new HashSet<>();

    private static final float[] LEAVES_SAPLING_CHANCES = new float[] {0.05F, 0.0625F, 0.083333336F, 0.1F};

    public VVBlockLootTableProvider() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void add(@NotNull Block block, LootTable.@NotNull Builder builder) {
        super.add(block, builder);
        this.knownBlocks.add(block);
    }

    @Override
    protected void generate() {

        this.add(GRAPEFRUIT_LEAVES.get(), (block) -> createLeavesDrops(block, GRAPEFRUIT_SAPLING.get(), LEAVES_SAPLING_CHANCES));
        this.add(FLOWERING_GRAPEFRUIT_LEAVES.get(), (block) -> createLeavesDrops(block, GRAPEFRUIT_SAPLING.get(), LEAVES_SAPLING_CHANCES));
        this.add(FRUITFUL_GRAPEFRUIT_LEAVES.get(), (block) -> createLeavesDrops(block, GRAPEFRUIT_SAPLING.get(), LEAVES_SAPLING_CHANCES));

        this.add(LEMON_LEAVES.get(), (block) -> createLeavesDrops(block, LEMON_SAPLING.get(), LEAVES_SAPLING_CHANCES));
        this.add(FLOWERING_LEMON_LEAVES.get(), (block) -> createLeavesDrops(block, LEMON_SAPLING.get(), LEAVES_SAPLING_CHANCES));
        this.add(FRUITFUL_LEMON_LEAVES.get(), (block) -> createLeavesDrops(block, LEMON_SAPLING.get(), LEAVES_SAPLING_CHANCES));

        this.add(LIME_LEAVES.get(), (block) -> createLeavesDrops(block, LIME_SAPLING.get(), LEAVES_SAPLING_CHANCES));
        this.add(FLOWERING_LIME_LEAVES.get(), (block) -> createLeavesDrops(block, LIME_SAPLING.get(), LEAVES_SAPLING_CHANCES));
        this.add(FRUITFUL_LIME_LEAVES.get(), (block) -> createLeavesDrops(block, LIME_SAPLING.get(), LEAVES_SAPLING_CHANCES));

        this.add(MANGO_LEAVES.get(), (block) -> createLeavesDrops(block, LIME_SAPLING.get(), LEAVES_SAPLING_CHANCES));
        this.add(FLOWERING_MANGO_LEAVES.get(), (block) -> createLeavesDrops(block, LIME_SAPLING.get(), LEAVES_SAPLING_CHANCES));
        this.add(FRUITFUL_MANGO_LEAVES.get(), (block) -> createLeavesDrops(block, LIME_SAPLING.get(), LEAVES_SAPLING_CHANCES));

        this.add(ORANGE_LEAVES.get(), (block) -> createLeavesDrops(block, ORANGE_SAPLING.get(), LEAVES_SAPLING_CHANCES));
        this.add(FLOWERING_ORANGE_LEAVES.get(), (block) -> createLeavesDrops(block, ORANGE_SAPLING.get(), LEAVES_SAPLING_CHANCES));
        this.add(FRUITFUL_ORANGE_LEAVES.get(), (block) -> createLeavesDrops(block, ORANGE_SAPLING.get(), LEAVES_SAPLING_CHANCES));

        this.dropSelf(PINK_HIBISCUS.get());
        this.dropPottedContents(POTTED_PINK_HIBISCUS.get());

        this.dropSelf(PURPLE_HIBISCUS.get());
        this.dropPottedContents(POTTED_PURPLE_HIBISCUS.get());

        this.dropSelf(ORANGE_HIBISCUS.get());
        this.dropPottedContents(POTTED_ORANGE_HIBISCUS.get());

        this.dropSelf(RED_HIBISCUS.get());
        this.dropPottedContents(POTTED_RED_HIBISCUS.get());

        this.dropSelf(WHITE_HIBISCUS.get());
        this.dropPottedContents(POTTED_WHITE_HIBISCUS.get());

        this.dropSelf(BLACK_CALLA.get());
        this.dropPottedContents(POTTED_BLACK_CALLA.get());

        this.dropSelf(ORANGE_CALLA.get());
        this.dropPottedContents(POTTED_ORANGE_CALLA.get());

        this.dropSelf(YELLOW_CALLA.get());
        this.dropPottedContents(POTTED_YELLOW_CALLA.get());

        this.dropSelf(WHITE_CALLA.get());
        this.dropPottedContents(POTTED_WHITE_CALLA.get());

        this.dropSelf(ORANGE_ORCHID.get());
        this.dropPottedContents(POTTED_ORANGE_ORCHID.get());

        this.dropSelf(PINK_ORCHID.get());
        this.dropPottedContents(POTTED_PINK_ORCHID.get());

        this.dropSelf(YELLOW_ORCHID.get());
        this.dropPottedContents(POTTED_YELLOW_ORCHID.get());

        this.dropSelf(WHITE_ORCHID.get());
        this.dropPottedContents(POTTED_WHITE_ORCHID.get());

        this.dropSelf(ORANGE_BROMELIAD.get());
        this.dropPottedContents(POTTED_ORANGE_BROMELIAD.get());

        this.dropSelf(PINK_BROMELIAD.get());
        this.dropPottedContents(POTTED_PINK_BROMELIAD.get());

        this.dropSelf(PURPLE_BROMELIAD.get());
        this.dropPottedContents(POTTED_PURPLE_BROMELIAD.get());

        this.dropSelf(YELLOW_BROMELIAD.get());
        this.dropPottedContents(POTTED_YELLOW_BROMELIAD.get());

        this.dropSelf(LACELEAF.get());
        this.dropPottedContents(POTTED_LACELEAF.get());

        this.dropSelf(TORCH_GINGER.get());
        this.dropPottedContents(POTTED_TORCH_GINGER.get());

        this.dropSelf(GREEN_FLOWERING_GRASS.get());
        this.dropPottedContents(POTTED_GREEN_FLOWERING_GRASS.get());

        this.dropSelf(PINK_FLOWERING_GRASS.get());
        this.dropPottedContents(POTTED_PINK_FLOWERING_GRASS.get());

        this.tallFlower(TALL_LACELEAF.get());
        this.tallFlower(BIRD_OF_PARADISE.get());
        this.tallFlower(CANNA_LILY.get());
        this.tallFlower(TALL_PINK_HIBISCUS.get());
        this.tallFlower(TALL_PURPLE_HIBISCUS.get());
        this.tallFlower(TALL_ORANGE_HIBISCUS.get());
        this.tallFlower(TALL_RED_HIBISCUS.get());
        this.tallFlower(TALL_WHITE_HIBISCUS.get());

        this.dropSelf(ORANGE_HIBISCUS_CARPET.get());
        this.dropSelf(PINK_HIBISCUS_CARPET.get());
        this.dropSelf(PURPLE_HIBISCUS_CARPET.get());
        this.dropSelf(RED_HIBISCUS_CARPET.get());
        this.dropSelf(WHITE_HIBISCUS_CARPET.get());

        this.dropSelf(AMBER_STAND.get());
        this.dropSelf(AQUAMARINE_STAND.get());
        this.dropSelf(ENSTATITE_STAND.get());
        this.dropSelf(GARNET_STAND.get());
        this.dropSelf(JADE_STAND.get());
        this.dropSelf(KUNZITE_STAND.get());
        this.dropSelf(LARIMAR_STAND.get());
        this.dropSelf(MILKY_QUARTZ_STAND.get());
        this.dropSelf(MOONSTONE_STAND.get());
        this.dropSelf(ONYX_STAND.get());
        this.dropSelf(PERIDOT_STAND.get());
        this.dropSelf(ROSE_QUARTZ_STAND.get());
        this.dropSelf(SAPPHIRE_STAND.get());
        this.dropSelf(SMOKY_QUARTZ_STAND.get());
        this.dropSelf(TAAFFEITE_STAND.get());
        this.dropSelf(TOPAZ_STAND.get());
        this.dropSelf(AMETHYST_STAND.get());
        this.dropSelf(DIAMOND_STAND.get());
        this.dropSelf(EMERALD_STAND.get());
        this.dropSelf(QUARTZ_STAND.get());

        this.dropSelf(POLISHED_AMBER.get());
        this.dropSelf(POLISHED_AQUAMARINE.get());
        this.dropSelf(POLISHED_ENSTATITE.get());
        this.dropSelf(POLISHED_GARNET.get());
        this.dropSelf(POLISHED_JADE.get());
        this.dropSelf(POLISHED_KUNZITE.get());
        this.dropSelf(POLISHED_LARIMAR.get());
        this.dropSelf(POLISHED_MILKY_QUARTZ.get());
        this.dropSelf(POLISHED_MOONSTONE.get());
        this.dropSelf(POLISHED_ONYX.get());
        this.dropSelf(POLISHED_PERIDOT.get());
        this.dropSelf(POLISHED_ROSE_QUARTZ.get());
        this.dropSelf(POLISHED_SAPPHIRE.get());
        this.dropSelf(POLISHED_SMOKY_QUARTZ.get());
        this.dropSelf(POLISHED_TAAFFEITE.get());
        this.dropSelf(POLISHED_TOPAZ.get());

        this.dropSelf(AMBER_BLOCK.get());
        this.dropSelf(AQUAMARINE_BLOCK.get());
        this.dropSelf(ENSTATITE_BLOCK.get());
        this.dropSelf(GARNET_BLOCK.get());
        this.dropSelf(JADE_BLOCK.get());
        this.dropSelf(KUNZITE_BLOCK.get());
        this.dropSelf(LARIMAR_BLOCK.get());
        this.dropSelf(MILKY_QUARTZ_BLOCK.get());
        this.dropSelf(MOONSTONE_BLOCK.get());
        this.dropSelf(ONYX_BLOCK.get());
        this.dropSelf(PERIDOT_BLOCK.get());
        this.dropSelf(ROSE_QUARTZ_BLOCK.get());
        this.dropSelf(SAPPHIRE_BLOCK.get());
        this.dropSelf(SMOKY_QUARTZ_BLOCK.get());
        this.dropSelf(TAAFFEITE_BLOCK.get());
        this.dropSelf(TOPAZ_BLOCK.get());

        this.dropSelf(AMBER_TILES.get());
        this.dropSelf(AMBER_TILE_STAIRS.get());
        this.add(AMBER_TILE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(AMBER_TILE_WALL.get());

        this.dropSelf(AQUAMARINE_TILES.get());
        this.dropSelf(AQUAMARINE_TILE_STAIRS.get());
        this.add(AQUAMARINE_TILE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(AQUAMARINE_TILE_WALL.get());

        this.dropSelf(ENSTATITE_TILES.get());
        this.dropSelf(ENSTATITE_TILE_STAIRS.get());
        this.add(ENSTATITE_TILE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ENSTATITE_TILE_WALL.get());

        this.dropSelf(GARNET_TILES.get());
        this.dropSelf(GARNET_TILE_STAIRS.get());
        this.add(GARNET_TILE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(GARNET_TILE_WALL.get());

        this.dropSelf(JADE_TILES.get());
        this.dropSelf(JADE_TILE_STAIRS.get());
        this.add(JADE_TILE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(JADE_TILE_WALL.get());

        this.dropSelf(KUNZITE_TILES.get());
        this.dropSelf(KUNZITE_TILE_STAIRS.get());
        this.add(KUNZITE_TILE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(KUNZITE_TILE_WALL.get());

        this.dropSelf(LARIMAR_TILES.get());
        this.dropSelf(LARIMAR_TILE_STAIRS.get());
        this.add(LARIMAR_TILE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(LARIMAR_TILE_WALL.get());

        this.dropSelf(MILKY_QUARTZ_TILES.get());
        this.dropSelf(MILKY_QUARTZ_TILE_STAIRS.get());
        this.add(MILKY_QUARTZ_TILE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(MILKY_QUARTZ_TILE_WALL.get());

        this.dropSelf(MOONSTONE_TILES.get());
        this.dropSelf(MOONSTONE_TILE_STAIRS.get());
        this.add(MOONSTONE_TILE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(MOONSTONE_TILE_WALL.get());

        this.dropSelf(ONYX_TILES.get());
        this.dropSelf(ONYX_TILE_STAIRS.get());
        this.add(ONYX_TILE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ONYX_TILE_WALL.get());

        this.dropSelf(PERIDOT_TILES.get());
        this.dropSelf(PERIDOT_TILE_STAIRS.get());
        this.add(PERIDOT_TILE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(PERIDOT_TILE_WALL.get());

        this.dropSelf(ROSE_QUARTZ_TILES.get());
        this.dropSelf(ROSE_QUARTZ_TILE_STAIRS.get());
        this.add(ROSE_QUARTZ_TILE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ROSE_QUARTZ_TILE_WALL.get());

        this.dropSelf(SAPPHIRE_TILES.get());
        this.dropSelf(SAPPHIRE_TILE_STAIRS.get());
        this.add(SAPPHIRE_TILE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(SAPPHIRE_TILE_WALL.get());

        this.dropSelf(SMOKY_QUARTZ_TILES.get());
        this.dropSelf(SMOKY_QUARTZ_TILE_STAIRS.get());
        this.add(SMOKY_QUARTZ_TILE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(SMOKY_QUARTZ_TILE_WALL.get());

        this.dropSelf(TAAFFEITE_TILES.get());
        this.dropSelf(TAAFFEITE_TILE_STAIRS.get());
        this.add(TAAFFEITE_TILE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(TAAFFEITE_TILE_WALL.get());

        this.dropSelf(TOPAZ_TILES.get());
        this.dropSelf(TOPAZ_TILE_STAIRS.get());
        this.add(TOPAZ_TILE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(TOPAZ_TILE_WALL.get());

        this.dropSelf(AMETHYST_TILES.get());
        this.dropSelf(AMETHYST_TILE_STAIRS.get());
        this.add(AMETHYST_TILE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(AMETHYST_TILE_WALL.get());

        this.dropSelf(DIAMOND_TILES.get());
        this.dropSelf(DIAMOND_TILE_STAIRS.get());
        this.add(DIAMOND_TILE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(DIAMOND_TILE_WALL.get());

        this.dropSelf(EMERALD_TILES.get());
        this.dropSelf(EMERALD_TILE_STAIRS.get());
        this.add(EMERALD_TILE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(EMERALD_TILE_WALL.get());

        this.dropSelf(QUARTZ_TILES.get());
        this.dropSelf(QUARTZ_TILE_STAIRS.get());
        this.add(QUARTZ_TILE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(QUARTZ_TILE_WALL.get());

        this.dropSelf(CALCITE_TILES.get());
        this.dropSelf(CALCITE_TILE_STAIRS.get());
        this.add(CALCITE_TILE_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(CALCITE_TILE_WALL.get());

        this.dropSelf(STARRY_AMBER_CALCITE_TILES.get());
        this.dropSelf(STARRY_AQUAMARINE_CALCITE_TILES.get());
        this.dropSelf(STARRY_ENSTATITE_CALCITE_TILES.get());
        this.dropSelf(STARRY_GARNET_CALCITE_TILES.get());
        this.dropSelf(STARRY_JADE_CALCITE_TILES.get());
        this.dropSelf(STARRY_KUNZITE_CALCITE_TILES.get());
        this.dropSelf(STARRY_LARIMAR_CALCITE_TILES.get());
        this.dropSelf(STARRY_MILKY_QUARTZ_CALCITE_TILES.get());
        this.dropSelf(STARRY_MOONSTONE_CALCITE_TILES.get());
        this.dropSelf(STARRY_ONYX_CALCITE_TILES.get());
        this.dropSelf(STARRY_PERIDOT_CALCITE_TILES.get());
        this.dropSelf(STARRY_ROSE_QUARTZ_CALCITE_TILES.get());
        this.dropSelf(STARRY_SAPPHIRE_CALCITE_TILES.get());
        this.dropSelf(STARRY_SMOKY_QUARTZ_CALCITE_TILES.get());
        this.dropSelf(STARRY_TAAFFEITE_CALCITE_TILES.get());
        this.dropSelf(STARRY_TOPAZ_CALCITE_TILES.get());
        this.dropSelf(STARRY_AMETHYST_CALCITE_TILES.get());
        this.dropSelf(STARRY_DIAMOND_CALCITE_TILES.get());
        this.dropSelf(STARRY_EMERALD_CALCITE_TILES.get());
        this.dropSelf(STARRY_QUARTZ_CALCITE_TILES.get());

        this.dropSelf(CALCITE_BRICKS.get());
        this.dropSelf(CALCITE_BRICK_STAIRS.get());
        this.add(CALCITE_BRICK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(CALCITE_BRICK_WALL.get());

        this.dropSelf(AMBER_BEJEWELED_CALCITE_BRICKS.get());
        this.dropSelf(AMBER_BEJEWELED_CALCITE_BRICK_STAIRS.get());
        this.add(AMBER_BEJEWELED_CALCITE_BRICK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(AMBER_BEJEWELED_CALCITE_BRICK_WALL.get());

        this.dropSelf(AQUAMARINE_BEJEWELED_CALCITE_BRICKS.get());
        this.dropSelf(AQUAMARINE_BEJEWELED_CALCITE_BRICK_STAIRS.get());
        this.add(AQUAMARINE_BEJEWELED_CALCITE_BRICK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(AQUAMARINE_BEJEWELED_CALCITE_BRICK_WALL.get());

        this.dropSelf(ENSTATITE_BEJEWELED_CALCITE_BRICKS.get());
        this.dropSelf(ENSTATITE_BEJEWELED_CALCITE_BRICK_STAIRS.get());
        this.add(ENSTATITE_BEJEWELED_CALCITE_BRICK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ENSTATITE_BEJEWELED_CALCITE_BRICK_WALL.get());

        this.dropSelf(GARNET_BEJEWELED_CALCITE_BRICKS.get());
        this.dropSelf(GARNET_BEJEWELED_CALCITE_BRICK_STAIRS.get());
        this.add(GARNET_BEJEWELED_CALCITE_BRICK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(GARNET_BEJEWELED_CALCITE_BRICK_WALL.get());

        this.dropSelf(JADE_BEJEWELED_CALCITE_BRICKS.get());
        this.dropSelf(JADE_BEJEWELED_CALCITE_BRICK_STAIRS.get());
        this.add(JADE_BEJEWELED_CALCITE_BRICK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(JADE_BEJEWELED_CALCITE_BRICK_WALL.get());

        this.dropSelf(KUNZITE_BEJEWELED_CALCITE_BRICKS.get());
        this.dropSelf(KUNZITE_BEJEWELED_CALCITE_BRICK_STAIRS.get());
        this.add(KUNZITE_BEJEWELED_CALCITE_BRICK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(KUNZITE_BEJEWELED_CALCITE_BRICK_WALL.get());

        this.dropSelf(LARIMAR_BEJEWELED_CALCITE_BRICKS.get());
        this.dropSelf(LARIMAR_BEJEWELED_CALCITE_BRICK_STAIRS.get());
        this.add(LARIMAR_BEJEWELED_CALCITE_BRICK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(LARIMAR_BEJEWELED_CALCITE_BRICK_WALL.get());

        this.dropSelf(MILKY_QUARTZ_BEJEWELED_CALCITE_BRICKS.get());
        this.dropSelf(MILKY_QUARTZ_BEJEWELED_CALCITE_BRICK_STAIRS.get());
        this.add(MILKY_QUARTZ_BEJEWELED_CALCITE_BRICK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(MILKY_QUARTZ_BEJEWELED_CALCITE_BRICK_WALL.get());

        this.dropSelf(MOONSTONE_BEJEWELED_CALCITE_BRICKS.get());
        this.dropSelf(MOONSTONE_BEJEWELED_CALCITE_BRICK_STAIRS.get());
        this.add(MOONSTONE_BEJEWELED_CALCITE_BRICK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(MOONSTONE_BEJEWELED_CALCITE_BRICK_WALL.get());

        this.dropSelf(ONYX_BEJEWELED_CALCITE_BRICKS.get());
        this.dropSelf(ONYX_BEJEWELED_CALCITE_BRICK_STAIRS.get());
        this.add(ONYX_BEJEWELED_CALCITE_BRICK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ONYX_BEJEWELED_CALCITE_BRICK_WALL.get());

        this.dropSelf(PERIDOT_BEJEWELED_CALCITE_BRICKS.get());
        this.dropSelf(PERIDOT_BEJEWELED_CALCITE_BRICK_STAIRS.get());
        this.add(PERIDOT_BEJEWELED_CALCITE_BRICK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(PERIDOT_BEJEWELED_CALCITE_BRICK_WALL.get());

        this.dropSelf(ROSE_QUARTZ_BEJEWELED_CALCITE_BRICKS.get());
        this.dropSelf(ROSE_QUARTZ_BEJEWELED_CALCITE_BRICK_STAIRS.get());
        this.add(ROSE_QUARTZ_BEJEWELED_CALCITE_BRICK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(ROSE_QUARTZ_BEJEWELED_CALCITE_BRICK_WALL.get());

        this.dropSelf(SAPPHIRE_BEJEWELED_CALCITE_BRICKS.get());
        this.dropSelf(SAPPHIRE_BEJEWELED_CALCITE_BRICK_STAIRS.get());
        this.add(SAPPHIRE_BEJEWELED_CALCITE_BRICK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(SAPPHIRE_BEJEWELED_CALCITE_BRICK_WALL.get());

        this.dropSelf(SMOKY_QUARTZ_BEJEWELED_CALCITE_BRICKS.get());
        this.dropSelf(SMOKY_QUARTZ_BEJEWELED_CALCITE_BRICK_STAIRS.get());
        this.add(SMOKY_QUARTZ_BEJEWELED_CALCITE_BRICK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(SMOKY_QUARTZ_BEJEWELED_CALCITE_BRICK_WALL.get());

        this.dropSelf(TAAFFEITE_BEJEWELED_CALCITE_BRICKS.get());
        this.dropSelf(TAAFFEITE_BEJEWELED_CALCITE_BRICK_STAIRS.get());
        this.add(TAAFFEITE_BEJEWELED_CALCITE_BRICK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(TAAFFEITE_BEJEWELED_CALCITE_BRICK_WALL.get());

        this.dropSelf(TOPAZ_BEJEWELED_CALCITE_BRICKS.get());
        this.dropSelf(TOPAZ_BEJEWELED_CALCITE_BRICK_STAIRS.get());
        this.add(TOPAZ_BEJEWELED_CALCITE_BRICK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(TOPAZ_BEJEWELED_CALCITE_BRICK_WALL.get());

        this.dropSelf(AMETHYST_BEJEWELED_CALCITE_BRICKS.get());
        this.dropSelf(AMETHYST_BEJEWELED_CALCITE_BRICK_STAIRS.get());
        this.add(AMETHYST_BEJEWELED_CALCITE_BRICK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(AMETHYST_BEJEWELED_CALCITE_BRICK_WALL.get());

        this.dropSelf(DIAMOND_BEJEWELED_CALCITE_BRICKS.get());
        this.dropSelf(DIAMOND_BEJEWELED_CALCITE_BRICK_STAIRS.get());
        this.add(DIAMOND_BEJEWELED_CALCITE_BRICK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(DIAMOND_BEJEWELED_CALCITE_BRICK_WALL.get());

        this.dropSelf(EMERALD_BEJEWELED_CALCITE_BRICKS.get());
        this.dropSelf(EMERALD_BEJEWELED_CALCITE_BRICK_STAIRS.get());
        this.add(EMERALD_BEJEWELED_CALCITE_BRICK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(EMERALD_BEJEWELED_CALCITE_BRICK_WALL.get());

        this.dropSelf(QUARTZ_BEJEWELED_CALCITE_BRICKS.get());
        this.dropSelf(QUARTZ_BEJEWELED_CALCITE_BRICK_STAIRS.get());
        this.add(QUARTZ_BEJEWELED_CALCITE_BRICK_SLAB.get(), this::createSlabItemTable);
        this.dropSelf(QUARTZ_BEJEWELED_CALCITE_BRICK_WALL.get());

        this.dropSelf(BANDED_BEJEWELED_LAMP.get());
        this.dropSelf(DIAMANTE_BEJEWELED_LAMP.get());
        this.dropSelf(FLORAL_BEJEWELED_LAMP.get());
        this.dropSelf(HONEYCOMB_BEJEWELED_LAMP.get());

        this.dropSelf(OAK_PAPER_LANTERN.get());
        this.dropSelf(SPRUCE_PAPER_LANTERN.get());
        this.dropSelf(BIRCH_PAPER_LANTERN.get());
        this.dropSelf(JUNGLE_PAPER_LANTERN.get());
        this.dropSelf(ACACIA_PAPER_LANTERN.get());
        this.dropSelf(DARK_OAK_PAPER_LANTERN.get());
        this.dropSelf(WARPED_PAPER_LANTERN.get());
        this.dropSelf(CRIMSON_PAPER_LANTERN.get());
        this.dropSelf(MANGROVE_PAPER_LANTERN.get());
        this.dropSelf(CHERRY_PAPER_LANTERN.get());
        this.dropSelf(BAMBOO_PAPER_LANTERN.get());

        this.dropSelf(CARVED_SANDSTONE_CONCERNED.get());
        this.dropSelf(CARVED_SANDSTONE_DISAPPOINTED.get());
        this.dropSelf(CARVED_SANDSTONE_FISHEYE.get());
        this.dropSelf(CARVED_SANDSTONE_GRIN.get());
        this.dropSelf(CARVED_SANDSTONE_JOYOUS.get());
        this.dropSelf(CARVED_SANDSTONE_LAZYBONES.get());
        this.dropSelf(CARVED_SANDSTONE_NOSE.get());
        this.dropSelf(CARVED_SANDSTONE_OPEN.get());
        this.dropSelf(CARVED_SANDSTONE_SPIRAL.get());

        this.dropSelf(RED_CARVED_SANDSTONE_BOLD_AND_BRASH.get());
        this.dropSelf(RED_CARVED_SANDSTONE_CLOSED.get());
        this.dropSelf(RED_CARVED_SANDSTONE_EXCITED.get());
        this.dropSelf(RED_CARVED_SANDSTONE_FROWN.get());
        this.dropSelf(RED_CARVED_SANDSTONE_HAPPY.get());
        this.dropSelf(RED_CARVED_SANDSTONE_LIPS.get());
        this.dropSelf(RED_CARVED_SANDSTONE_SAD.get());
        this.dropSelf(RED_CARVED_SANDSTONE_TOUCH.get());
        this.dropSelf(RED_CARVED_SANDSTONE_MESSAGE.get());

        this.dropSelf(PINEAPPLE_SCALE_BLOCK.get());
        this.add(PINEAPPLE_CROWN.get(), createShearsOnlyDrop(PINEAPPLE_CROWN.get()));
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return knownBlocks;
    }

    private void tallFlower(Block block) {
        this.add(block, b -> createSinglePropConditionTable(b, DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));
    }
}
