package net.thevaliantsquidward.vintagevibes.data;

import com.mojang.datafixers.util.Pair;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.properties.*;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.client.model.generators.ModelProvider;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thevaliantsquidward.vintagevibes.VintageVibes;

import java.util.function.Function;

import static net.thevaliantsquidward.vintagevibes.registry.VVBlocks.*;

public class VVBlockstateProvider extends BlockStateProvider {

    public VVBlockstateProvider(GatherDataEvent event) {
        super(event.getGenerator().getPackOutput(), VintageVibes.MOD_ID, event.getExistingFileHelper());
    }

    @Override
    protected void registerStatesAndModels() {
        this.cubeAllBlock(BEJEWELED_ORE);
        this.cubeAllBlock(DEEPSLATE_BEJEWELED_ORE);

        this.cubeAllBlock(AMBER_BLOCK);
        this.cubeAllBlock(AQUAMARINE_BLOCK);
        this.cubeAllBlock(ENSTATITE_BLOCK);
        this.cubeAllBlock(GARNET_BLOCK);
        this.cubeAllBlock(KUNZITE_BLOCK);
        this.cubeAllBlock(LARIMAR_BLOCK);
        this.cubeAllBlock(MILKY_QUARTZ_BLOCK);
        this.cubeAllBlock(MOONSTONE_BLOCK);
        this.cubeAllBlock(ONYX_BLOCK);
        this.cubeAllBlock(PERIDOT_BLOCK);
        this.cubeAllBlock(ROSE_QUARTZ_BLOCK);
        this.cubeAllBlock(SAPPHIRE_BLOCK);
        this.cubeAllBlock(SMOKY_QUARTZ_BLOCK);
        this.cubeAllBlock(TAAFFEITE_BLOCK);
        this.cubeAllBlock(TOPAZ_BLOCK);
        this.cubeAllBlock(JADE_BLOCK);

        this.cubeAllBlock(POLISHED_AMBER);
        this.cubeAllBlock(POLISHED_AQUAMARINE);
        this.cubeAllBlock(POLISHED_ENSTATITE);
        this.cubeAllBlock(POLISHED_GARNET);
        this.cubeAllBlock(POLISHED_KUNZITE);
        this.cubeAllBlock(POLISHED_LARIMAR);
        this.cubeAllBlock(POLISHED_MILKY_QUARTZ);
        this.cubeAllBlock(POLISHED_MOONSTONE);
        this.cubeAllBlock(POLISHED_ONYX);
        this.cubeAllBlock(POLISHED_PERIDOT);
        this.cubeAllBlock(POLISHED_ROSE_QUARTZ);
        this.cubeAllBlock(POLISHED_SAPPHIRE);
        this.cubeAllBlock(POLISHED_SMOKY_QUARTZ);
        this.cubeAllBlock(POLISHED_TAAFFEITE);
        this.cubeAllBlock(POLISHED_TOPAZ);
        this.cubeAllBlock(POLISHED_JADE);

        this.cubeAllBlock(AMBER_TILES);
        this.stairs(AMBER_TILE_STAIRS, this.blockTexture(AMBER_TILES.get()));
        this.slab(AMBER_TILE_SLAB, this.blockTexture(AMBER_TILES.get()));
        this.wall(AMBER_TILE_WALL, this.blockTexture(AMBER_TILES.get()));

        this.cubeAllBlock(AQUAMARINE_TILES);
        this.stairs(AQUAMARINE_TILE_STAIRS, this.blockTexture(AQUAMARINE_TILES.get()));
        this.slab(AQUAMARINE_TILE_SLAB, this.blockTexture(AQUAMARINE_TILES.get()));
        this.wall(AQUAMARINE_TILE_WALL, this.blockTexture(AQUAMARINE_TILES.get()));

        this.cubeAllBlock(ENSTATITE_TILES);
        this.stairs(ENSTATITE_TILE_STAIRS, this.blockTexture(ENSTATITE_TILES.get()));
        this.slab(ENSTATITE_TILE_SLAB, this.blockTexture(ENSTATITE_TILES.get()));
        this.wall(ENSTATITE_TILE_WALL, this.blockTexture(ENSTATITE_TILES.get()));

        this.cubeAllBlock(GARNET_TILES);
        this.stairs(GARNET_TILE_STAIRS, this.blockTexture(GARNET_TILES.get()));
        this.slab(GARNET_TILE_SLAB, this.blockTexture(GARNET_TILES.get()));
        this.wall(GARNET_TILE_WALL, this.blockTexture(GARNET_TILES.get()));

        this.cubeAllBlock(JADE_TILES);
        this.stairs(JADE_TILE_STAIRS, this.blockTexture(JADE_TILES.get()));
        this.slab(JADE_TILE_SLAB, this.blockTexture(JADE_TILES.get()));
        this.wall(JADE_TILE_WALL, this.blockTexture(JADE_TILES.get()));

        this.cubeAllBlock(KUNZITE_TILES);
        this.stairs(KUNZITE_TILE_STAIRS, this.blockTexture(KUNZITE_TILES.get()));
        this.slab(KUNZITE_TILE_SLAB, this.blockTexture(KUNZITE_TILES.get()));
        this.wall(KUNZITE_TILE_WALL, this.blockTexture(KUNZITE_TILES.get()));

        this.cubeAllBlock(LARIMAR_TILES);
        this.stairs(LARIMAR_TILE_STAIRS, this.blockTexture(LARIMAR_TILES.get()));
        this.slab(LARIMAR_TILE_SLAB, this.blockTexture(LARIMAR_TILES.get()));
        this.wall(LARIMAR_TILE_WALL, this.blockTexture(LARIMAR_TILES.get()));

        this.cubeAllBlock(MILKY_QUARTZ_TILES);
        this.stairs(MILKY_QUARTZ_TILE_STAIRS, this.blockTexture(MILKY_QUARTZ_TILES.get()));
        this.slab(MILKY_QUARTZ_TILE_SLAB, this.blockTexture(MILKY_QUARTZ_TILES.get()));
        this.wall(MILKY_QUARTZ_TILE_WALL, this.blockTexture(MILKY_QUARTZ_TILES.get()));

        this.cubeAllBlock(MOONSTONE_TILES);
        this.stairs(MOONSTONE_TILE_STAIRS, this.blockTexture(MOONSTONE_TILES.get()));
        this.slab(MOONSTONE_TILE_SLAB, this.blockTexture(MOONSTONE_TILES.get()));
        this.wall(MOONSTONE_TILE_WALL, this.blockTexture(MOONSTONE_TILES.get()));

        this.cubeAllBlock(ONYX_TILES);
        this.stairs(ONYX_TILE_STAIRS, this.blockTexture(ONYX_TILES.get()));
        this.slab(ONYX_TILE_SLAB, this.blockTexture(ONYX_TILES.get()));
        this.wall(ONYX_TILE_WALL, this.blockTexture(ONYX_TILES.get()));

        this.cubeAllBlock(PERIDOT_TILES);
        this.stairs(PERIDOT_TILE_STAIRS, this.blockTexture(PERIDOT_TILES.get()));
        this.slab(PERIDOT_TILE_SLAB, this.blockTexture(PERIDOT_TILES.get()));
        this.wall(PERIDOT_TILE_WALL, this.blockTexture(PERIDOT_TILES.get()));

        this.cubeAllBlock(ROSE_QUARTZ_TILES);
        this.stairs(ROSE_QUARTZ_TILE_STAIRS, this.blockTexture(ROSE_QUARTZ_TILES.get()));
        this.slab(ROSE_QUARTZ_TILE_SLAB, this.blockTexture(ROSE_QUARTZ_TILES.get()));
        this.wall(ROSE_QUARTZ_TILE_WALL, this.blockTexture(ROSE_QUARTZ_TILES.get()));

        this.cubeAllBlock(SAPPHIRE_TILES);
        this.stairs(SAPPHIRE_TILE_STAIRS, this.blockTexture(SAPPHIRE_TILES.get()));
        this.slab(SAPPHIRE_TILE_SLAB, this.blockTexture(SAPPHIRE_TILES.get()));
        this.wall(SAPPHIRE_TILE_WALL, this.blockTexture(SAPPHIRE_TILES.get()));

        this.cubeAllBlock(SMOKY_QUARTZ_TILES);
        this.stairs(SMOKY_QUARTZ_TILE_STAIRS, this.blockTexture(SMOKY_QUARTZ_TILES.get()));
        this.slab(SMOKY_QUARTZ_TILE_SLAB, this.blockTexture(SMOKY_QUARTZ_TILES.get()));
        this.wall(SMOKY_QUARTZ_TILE_WALL, this.blockTexture(SMOKY_QUARTZ_TILES.get()));

        this.cubeAllBlock(TAAFFEITE_TILES);
        this.stairs(TAAFFEITE_TILE_STAIRS, this.blockTexture(TAAFFEITE_TILES.get()));
        this.slab(TAAFFEITE_TILE_SLAB, this.blockTexture(TAAFFEITE_TILES.get()));
        this.wall(TAAFFEITE_TILE_WALL, this.blockTexture(TAAFFEITE_TILES.get()));

        this.cubeAllBlock(TOPAZ_TILES);
        this.stairs(TOPAZ_TILE_STAIRS, this.blockTexture(TOPAZ_TILES.get()));
        this.slab(TOPAZ_TILE_SLAB, this.blockTexture(TOPAZ_TILES.get()));
        this.wall(TOPAZ_TILE_WALL, this.blockTexture(TOPAZ_TILES.get()));

        this.cubeAllBlock(AMETHYST_TILES);
        this.stairs(AMETHYST_TILE_STAIRS, this.blockTexture(AMETHYST_TILES.get()));
        this.slab(AMETHYST_TILE_SLAB, this.blockTexture(AMETHYST_TILES.get()));
        this.wall(AMETHYST_TILE_WALL, this.blockTexture(AMETHYST_TILES.get()));

        this.cubeAllBlock(DIAMOND_TILES);
        this.stairs(DIAMOND_TILE_STAIRS, this.blockTexture(DIAMOND_TILES.get()));
        this.slab(DIAMOND_TILE_SLAB, this.blockTexture(DIAMOND_TILES.get()));
        this.wall(DIAMOND_TILE_WALL, this.blockTexture(DIAMOND_TILES.get()));

        this.cubeAllBlock(EMERALD_TILES);
        this.stairs(EMERALD_TILE_STAIRS, this.blockTexture(EMERALD_TILES.get()));
        this.slab(EMERALD_TILE_SLAB, this.blockTexture(EMERALD_TILES.get()));
        this.wall(EMERALD_TILE_WALL, this.blockTexture(EMERALD_TILES.get()));

        this.cubeAllBlock(QUARTZ_TILES);
        this.stairs(QUARTZ_TILE_STAIRS, this.blockTexture(QUARTZ_TILES.get()));
        this.slab(QUARTZ_TILE_SLAB, this.blockTexture(QUARTZ_TILES.get()));
        this.wall(QUARTZ_TILE_WALL, this.blockTexture(QUARTZ_TILES.get()));

        this.cubeAllBlock(CALCITE_TILES);
        this.stairs(CALCITE_TILE_STAIRS, this.blockTexture(CALCITE_TILES.get()));
        this.slab(CALCITE_TILE_SLAB, this.blockTexture(CALCITE_TILES.get()));
        this.wall(CALCITE_TILE_WALL, this.blockTexture(CALCITE_TILES.get()));

        this.cubeAllBlock(CALCITE_BRICKS);
        this.stairs(CALCITE_BRICK_STAIRS, this.blockTexture(CALCITE_BRICKS.get()));
        this.slab(CALCITE_BRICK_SLAB, this.blockTexture(CALCITE_BRICKS.get()));
        this.wall(CALCITE_BRICK_WALL, this.blockTexture(CALCITE_BRICKS.get()));

        this.cubeAllBlock(AMBER_BEJEWELED_CALCITE_BRICKS);
        this.stairs(AMBER_BEJEWELED_CALCITE_BRICK_STAIRS, this.blockTexture(AMBER_BEJEWELED_CALCITE_BRICKS.get()));
        this.slab(AMBER_BEJEWELED_CALCITE_BRICK_SLAB, this.blockTexture(AMBER_BEJEWELED_CALCITE_BRICKS.get()));
        this.wall(AMBER_BEJEWELED_CALCITE_BRICK_WALL, this.blockTexture(AMBER_BEJEWELED_CALCITE_BRICKS.get()));

        this.cubeAllBlock(AQUAMARINE_BEJEWELED_CALCITE_BRICKS);
        this.stairs(AQUAMARINE_BEJEWELED_CALCITE_BRICK_STAIRS, this.blockTexture(AQUAMARINE_BEJEWELED_CALCITE_BRICKS.get()));
        this.slab(AQUAMARINE_BEJEWELED_CALCITE_BRICK_SLAB, this.blockTexture(AQUAMARINE_BEJEWELED_CALCITE_BRICKS.get()));
        this.wall(AQUAMARINE_BEJEWELED_CALCITE_BRICK_WALL, this.blockTexture(AQUAMARINE_BEJEWELED_CALCITE_BRICKS.get()));

        this.cubeAllBlock(ENSTATITE_BEJEWELED_CALCITE_BRICKS);
        this.stairs(ENSTATITE_BEJEWELED_CALCITE_BRICK_STAIRS, this.blockTexture(ENSTATITE_BEJEWELED_CALCITE_BRICKS.get()));
        this.slab(ENSTATITE_BEJEWELED_CALCITE_BRICK_SLAB, this.blockTexture(ENSTATITE_BEJEWELED_CALCITE_BRICKS.get()));
        this.wall(ENSTATITE_BEJEWELED_CALCITE_BRICK_WALL, this.blockTexture(ENSTATITE_BEJEWELED_CALCITE_BRICKS.get()));

        this.cubeAllBlock(GARNET_BEJEWELED_CALCITE_BRICKS);
        this.stairs(GARNET_BEJEWELED_CALCITE_BRICK_STAIRS, this.blockTexture(GARNET_BEJEWELED_CALCITE_BRICKS.get()));
        this.slab(GARNET_BEJEWELED_CALCITE_BRICK_SLAB, this.blockTexture(GARNET_BEJEWELED_CALCITE_BRICKS.get()));
        this.wall(GARNET_BEJEWELED_CALCITE_BRICK_WALL, this.blockTexture(GARNET_BEJEWELED_CALCITE_BRICKS.get()));

        this.cubeAllBlock(JADE_BEJEWELED_CALCITE_BRICKS);
        this.stairs(JADE_BEJEWELED_CALCITE_BRICK_STAIRS, this.blockTexture(JADE_BEJEWELED_CALCITE_BRICKS.get()));
        this.slab(JADE_BEJEWELED_CALCITE_BRICK_SLAB, this.blockTexture(JADE_BEJEWELED_CALCITE_BRICKS.get()));
        this.wall(JADE_BEJEWELED_CALCITE_BRICK_WALL, this.blockTexture(JADE_BEJEWELED_CALCITE_BRICKS.get()));

        this.cubeAllBlock(KUNZITE_BEJEWELED_CALCITE_BRICKS);
        this.stairs(KUNZITE_BEJEWELED_CALCITE_BRICK_STAIRS, this.blockTexture(KUNZITE_BEJEWELED_CALCITE_BRICKS.get()));
        this.slab(KUNZITE_BEJEWELED_CALCITE_BRICK_SLAB, this.blockTexture(KUNZITE_BEJEWELED_CALCITE_BRICKS.get()));
        this.wall(KUNZITE_BEJEWELED_CALCITE_BRICK_WALL, this.blockTexture(KUNZITE_BEJEWELED_CALCITE_BRICKS.get()));

        this.cubeAllBlock(LARIMAR_BEJEWELED_CALCITE_BRICKS);
        this.stairs(LARIMAR_BEJEWELED_CALCITE_BRICK_STAIRS, this.blockTexture(LARIMAR_BEJEWELED_CALCITE_BRICKS.get()));
        this.slab(LARIMAR_BEJEWELED_CALCITE_BRICK_SLAB, this.blockTexture(LARIMAR_BEJEWELED_CALCITE_BRICKS.get()));
        this.wall(LARIMAR_BEJEWELED_CALCITE_BRICK_WALL, this.blockTexture(LARIMAR_BEJEWELED_CALCITE_BRICKS.get()));

        this.cubeAllBlock(MILKY_QUARTZ_BEJEWELED_CALCITE_BRICKS);
        this.stairs(MILKY_QUARTZ_BEJEWELED_CALCITE_BRICK_STAIRS, this.blockTexture(MILKY_QUARTZ_BEJEWELED_CALCITE_BRICKS.get()));
        this.slab(MILKY_QUARTZ_BEJEWELED_CALCITE_BRICK_SLAB, this.blockTexture(MILKY_QUARTZ_BEJEWELED_CALCITE_BRICKS.get()));
        this.wall(MILKY_QUARTZ_BEJEWELED_CALCITE_BRICK_WALL, this.blockTexture(MILKY_QUARTZ_BEJEWELED_CALCITE_BRICKS.get()));

        this.cubeAllBlock(MOONSTONE_BEJEWELED_CALCITE_BRICKS);
        this.stairs(MOONSTONE_BEJEWELED_CALCITE_BRICK_STAIRS, this.blockTexture(MOONSTONE_BEJEWELED_CALCITE_BRICKS.get()));
        this.slab(MOONSTONE_BEJEWELED_CALCITE_BRICK_SLAB, this.blockTexture(MOONSTONE_BEJEWELED_CALCITE_BRICKS.get()));
        this.wall(MOONSTONE_BEJEWELED_CALCITE_BRICK_WALL, this.blockTexture(MOONSTONE_BEJEWELED_CALCITE_BRICKS.get()));

        this.cubeAllBlock(ONYX_BEJEWELED_CALCITE_BRICKS);
        this.stairs(ONYX_BEJEWELED_CALCITE_BRICK_STAIRS, this.blockTexture(ONYX_BEJEWELED_CALCITE_BRICKS.get()));
        this.slab(ONYX_BEJEWELED_CALCITE_BRICK_SLAB, this.blockTexture(ONYX_BEJEWELED_CALCITE_BRICKS.get()));
        this.wall(ONYX_BEJEWELED_CALCITE_BRICK_WALL, this.blockTexture(ONYX_BEJEWELED_CALCITE_BRICKS.get()));

        this.cubeAllBlock(PERIDOT_BEJEWELED_CALCITE_BRICKS);
        this.stairs(PERIDOT_BEJEWELED_CALCITE_BRICK_STAIRS, this.blockTexture(PERIDOT_BEJEWELED_CALCITE_BRICKS.get()));
        this.slab(PERIDOT_BEJEWELED_CALCITE_BRICK_SLAB, this.blockTexture(PERIDOT_BEJEWELED_CALCITE_BRICKS.get()));
        this.wall(PERIDOT_BEJEWELED_CALCITE_BRICK_WALL, this.blockTexture(PERIDOT_BEJEWELED_CALCITE_BRICKS.get()));

        this.cubeAllBlock(ROSE_QUARTZ_BEJEWELED_CALCITE_BRICKS);
        this.stairs(ROSE_QUARTZ_BEJEWELED_CALCITE_BRICK_STAIRS, this.blockTexture(ROSE_QUARTZ_BEJEWELED_CALCITE_BRICKS.get()));
        this.slab(ROSE_QUARTZ_BEJEWELED_CALCITE_BRICK_SLAB, this.blockTexture(ROSE_QUARTZ_BEJEWELED_CALCITE_BRICKS.get()));
        this.wall(ROSE_QUARTZ_BEJEWELED_CALCITE_BRICK_WALL, this.blockTexture(ROSE_QUARTZ_BEJEWELED_CALCITE_BRICKS.get()));

        this.cubeAllBlock(SAPPHIRE_BEJEWELED_CALCITE_BRICKS);
        this.stairs(SAPPHIRE_BEJEWELED_CALCITE_BRICK_STAIRS, this.blockTexture(SAPPHIRE_BEJEWELED_CALCITE_BRICKS.get()));
        this.slab(SAPPHIRE_BEJEWELED_CALCITE_BRICK_SLAB, this.blockTexture(SAPPHIRE_BEJEWELED_CALCITE_BRICKS.get()));
        this.wall(SAPPHIRE_BEJEWELED_CALCITE_BRICK_WALL, this.blockTexture(SAPPHIRE_BEJEWELED_CALCITE_BRICKS.get()));

        this.cubeAllBlock(SMOKY_QUARTZ_BEJEWELED_CALCITE_BRICKS);
        this.stairs(SMOKY_QUARTZ_BEJEWELED_CALCITE_BRICK_STAIRS, this.blockTexture(SMOKY_QUARTZ_BEJEWELED_CALCITE_BRICKS.get()));
        this.slab(SMOKY_QUARTZ_BEJEWELED_CALCITE_BRICK_SLAB, this.blockTexture(SMOKY_QUARTZ_BEJEWELED_CALCITE_BRICKS.get()));
        this.wall(SMOKY_QUARTZ_BEJEWELED_CALCITE_BRICK_WALL, this.blockTexture(SMOKY_QUARTZ_BEJEWELED_CALCITE_BRICKS.get()));

        this.cubeAllBlock(TAAFFEITE_BEJEWELED_CALCITE_BRICKS);
        this.stairs(TAAFFEITE_BEJEWELED_CALCITE_BRICK_STAIRS, this.blockTexture(TAAFFEITE_BEJEWELED_CALCITE_BRICKS.get()));
        this.slab(TAAFFEITE_BEJEWELED_CALCITE_BRICK_SLAB, this.blockTexture(TAAFFEITE_BEJEWELED_CALCITE_BRICKS.get()));
        this.wall(TAAFFEITE_BEJEWELED_CALCITE_BRICK_WALL, this.blockTexture(TAAFFEITE_BEJEWELED_CALCITE_BRICKS.get()));

        this.cubeAllBlock(TOPAZ_BEJEWELED_CALCITE_BRICKS);
        this.stairs(TOPAZ_BEJEWELED_CALCITE_BRICK_STAIRS, this.blockTexture(TOPAZ_BEJEWELED_CALCITE_BRICKS.get()));
        this.slab(TOPAZ_BEJEWELED_CALCITE_BRICK_SLAB, this.blockTexture(TOPAZ_BEJEWELED_CALCITE_BRICKS.get()));
        this.wall(TOPAZ_BEJEWELED_CALCITE_BRICK_WALL, this.blockTexture(TOPAZ_BEJEWELED_CALCITE_BRICKS.get()));

        this.cubeAllBlock(AMETHYST_BEJEWELED_CALCITE_BRICKS);
        this.stairs(AMETHYST_BEJEWELED_CALCITE_BRICK_STAIRS, this.blockTexture(AMETHYST_BEJEWELED_CALCITE_BRICKS.get()));
        this.slab(AMETHYST_BEJEWELED_CALCITE_BRICK_SLAB, this.blockTexture(AMETHYST_BEJEWELED_CALCITE_BRICKS.get()));
        this.wall(AMETHYST_BEJEWELED_CALCITE_BRICK_WALL, this.blockTexture(AMETHYST_BEJEWELED_CALCITE_BRICKS.get()));

        this.cubeAllBlock(DIAMOND_BEJEWELED_CALCITE_BRICKS);
        this.stairs(DIAMOND_BEJEWELED_CALCITE_BRICK_STAIRS, this.blockTexture(DIAMOND_BEJEWELED_CALCITE_BRICKS.get()));
        this.slab(DIAMOND_BEJEWELED_CALCITE_BRICK_SLAB, this.blockTexture(DIAMOND_BEJEWELED_CALCITE_BRICKS.get()));
        this.wall(DIAMOND_BEJEWELED_CALCITE_BRICK_WALL, this.blockTexture(DIAMOND_BEJEWELED_CALCITE_BRICKS.get()));

        this.cubeAllBlock(EMERALD_BEJEWELED_CALCITE_BRICKS);
        this.stairs(EMERALD_BEJEWELED_CALCITE_BRICK_STAIRS, this.blockTexture(EMERALD_BEJEWELED_CALCITE_BRICKS.get()));
        this.slab(EMERALD_BEJEWELED_CALCITE_BRICK_SLAB, this.blockTexture(EMERALD_BEJEWELED_CALCITE_BRICKS.get()));
        this.wall(EMERALD_BEJEWELED_CALCITE_BRICK_WALL, this.blockTexture(EMERALD_BEJEWELED_CALCITE_BRICKS.get()));

        this.cubeAllBlock(QUARTZ_BEJEWELED_CALCITE_BRICKS);
        this.stairs(QUARTZ_BEJEWELED_CALCITE_BRICK_STAIRS, this.blockTexture(QUARTZ_BEJEWELED_CALCITE_BRICKS.get()));
        this.slab(QUARTZ_BEJEWELED_CALCITE_BRICK_SLAB, this.blockTexture(QUARTZ_BEJEWELED_CALCITE_BRICKS.get()));
        this.wall(QUARTZ_BEJEWELED_CALCITE_BRICK_WALL, this.blockTexture(QUARTZ_BEJEWELED_CALCITE_BRICKS.get()));

        this.pottedPlant(PINK_HIBISCUS, POTTED_PINK_HIBISCUS);
        this.pottedPlant(PURPLE_HIBISCUS, POTTED_PURPLE_HIBISCUS);
        this.pottedPlant(ORANGE_HIBISCUS, POTTED_ORANGE_HIBISCUS);
        this.pottedPlant(RED_HIBISCUS, POTTED_RED_HIBISCUS);
        this.pottedPlant(WHITE_HIBISCUS, POTTED_WHITE_HIBISCUS);

        this.pottedPlant(BLACK_CALLA, POTTED_BLACK_CALLA);
        this.pottedPlant(ORANGE_CALLA, POTTED_ORANGE_CALLA);
        this.pottedPlant(YELLOW_CALLA, POTTED_YELLOW_CALLA);
        this.pottedPlant(WHITE_CALLA, POTTED_WHITE_CALLA);

        this.pottedPlant(ORANGE_ORCHID, POTTED_ORANGE_ORCHID);
        this.pottedPlant(PINK_ORCHID, POTTED_PINK_ORCHID);
        this.pottedPlant(WHITE_ORCHID, POTTED_WHITE_ORCHID);
        this.pottedPlant(YELLOW_ORCHID, POTTED_YELLOW_ORCHID);

        this.pottedPlant(ORANGE_BROMELIAD, POTTED_ORANGE_BROMELIAD);
        this.pottedPlant(PINK_BROMELIAD, POTTED_PINK_BROMELIAD);
        this.pottedPlant(PURPLE_BROMELIAD, POTTED_PURPLE_BROMELIAD);
        this.pottedPlant(YELLOW_BROMELIAD, POTTED_YELLOW_BROMELIAD);

        this.pottedPlant(LACELEAF, POTTED_LACELEAF);

        this.pottedPlant(TORCH_GINGER, POTTED_TORCH_GINGER);

        this.pottedPlant(GREEN_FLOWERING_GRASS, POTTED_GREEN_FLOWERING_GRASS);
        this.pottedPlant(PINK_FLOWERING_GRASS, POTTED_PINK_FLOWERING_GRASS);

        this.pottedPlant(PINEAPPLE_CROWN, POTTED_PINEAPPLE_CROWN);

        this.tallPlant(TALL_PINK_HIBISCUS);
        this.tallPlant(TALL_PURPLE_HIBISCUS);
        this.tallPlant(TALL_ORANGE_HIBISCUS);
        this.tallPlant(TALL_RED_HIBISCUS);
        this.tallPlant(TALL_WHITE_HIBISCUS);

        this.tallPlant(BIRD_OF_PARADISE);

        this.tallPlant(CANNA_LILY);

        this.tallPlant(TALL_LACELEAF);

        this.cubeAllBlock(CRACKED_CALCITE_BRICKS);
        this.cubeAllBlock(CRACKED_CALCITE_TILES);

        this.pottedPlant(GRAPEFRUIT_SAPLING, POTTED_GRAPEFRUIT_SAPLING);
        this.pottedPlant(LEMON_SAPLING, POTTED_LEMON_SAPLING);
        this.pottedPlant(LIME_SAPLING, POTTED_LIME_SAPLING);
        this.pottedPlant(MANGO_SAPLING, POTTED_MANGO_SAPLING);
        this.pottedPlant(ORANGE_SAPLING, POTTED_ORANGE_SAPLING);

        this.leaves(GRAPEFRUIT_LEAVES);
        this.leaves(LEMON_LEAVES);
        this.leaves(LIME_LEAVES);
        this.leaves(MANGO_LEAVES);
        this.leaves(ORANGE_LEAVES);

        this.leaves(FLOWERING_GRAPEFRUIT_LEAVES);
        this.leaves(FLOWERING_LEMON_LEAVES);
        this.leaves(FLOWERING_LIME_LEAVES);
        this.leaves(FLOWERING_MANGO_LEAVES);
        this.leaves(FLOWERING_ORANGE_LEAVES);

        this.leaves(FRUITFUL_GRAPEFRUIT_LEAVES);
        this.leaves(FRUITFUL_LEMON_LEAVES);
        this.leaves(FRUITFUL_LIME_LEAVES);
        this.leaves(FRUITFUL_MANGO_LEAVES);
        this.leaves(FRUITFUL_ORANGE_LEAVES);

//        this.skull(GOLDEN_HEAD);
    }

    // item
    private void itemModel(RegistryObject<Block> block) {
        this.itemModels().withExistingParent(getItemName(block.get()), this.blockTexture(block.get()));
    }

    private void generatedItem(ItemLike item, TextureFolder folder) {
        String name = getItemName(item);
        this.itemModels().withExistingParent(name, "item/generated").texture("layer0", this.modLoc(folder.format(name)));
    }

    private void cubeAllBlock(RegistryObject<Block> block) {
        this.simpleBlock(block.get());
        this.itemModel(block);
    }

    // block
    private void stairs(RegistryObject<Block> stairs, ResourceLocation texture) {
        this.stairsBlock((StairBlock) stairs.get(), texture);
        this.itemModel(stairs);
    }

    private void slab(RegistryObject<Block> slab, ResourceLocation texture) {
        this.slabBlock((SlabBlock) slab.get(), texture, texture);
        this.itemModel(slab);
    }

    private void wall(RegistryObject<Block> wall, ResourceLocation texture) {
        this.wallBlock((WallBlock) wall.get(), texture);
        this.itemModels().wallInventory(getItemName(wall.get()), texture);
    }

    private void simpleCross(RegistryObject<Block> block) {
        this.simpleBlock(block.get(), this.models().cross(getItemName(block.get()), this.blockTexture(block.get())).renderType("cutout"));
    }

    private void leaves(RegistryObject<Block> leaves) {
        this.simpleBlock(leaves.get(), this.models().withExistingParent(getItemName(leaves.get()), "block/leaves").texture("all", this.blockTexture(leaves.get())));
        this.itemModel(leaves);
    }

    private void tallPlant(RegistryObject<Block> flower) {
        String name = getItemName(flower.get());
        Function<String, ModelFile> model = s -> this.models().cross(name + "_" + s, this.modLoc("block/" + name + "_" + s)).renderType("cutout");

        this.itemModels().withExistingParent(name, "item/generated").texture("layer0", this.modLoc("block/" + name + "_top"));
        this.getVariantBuilder(flower.get())
                .partialState().with(DoublePlantBlock.HALF, DoubleBlockHalf.UPPER).addModels(new ConfiguredModel(model.apply("top")))
                .partialState().with(DoublePlantBlock.HALF, DoubleBlockHalf.LOWER).addModels(new ConfiguredModel(model.apply("bottom")));
    }

    private void pot(RegistryObject<Block> pot, ResourceLocation texture) {
        ModelFile model = this.models().withExistingParent(getBlockName(pot.get()), "block/flower_pot_cross").texture("plant", texture).renderType("cutout");
        this.simpleBlock(pot.get(), model);
    }

    private void pottedPlant(RegistryObject<Block> plant, RegistryObject<Block> pot) {
        this.pot(pot, this.blockTexture(plant.get()));
        this.simpleCross(plant);
        this.generatedItem(plant.get(), TextureFolder.BLOCK);
    }

    private void skull(Pair<RegistryObject<Block>, RegistryObject<Block>> skull) {
        getVariantBuilder(skull.getFirst().get()).forAllStatesExcept(blockstate -> ConfiguredModel.builder().modelFile(models().getExistingFile(new ResourceLocation(ModelProvider.BLOCK_FOLDER + "/" + "skull"))).build(), SkullBlock.ROTATION);
        getVariantBuilder(skull.getSecond().get()).forAllStatesExcept(blockstate -> ConfiguredModel.builder().modelFile(models().getExistingFile(new ResourceLocation(ModelProvider.BLOCK_FOLDER + "/" + "skull"))).build(), WallSkullBlock.FACING);
    }

    // utils
    private static String getItemName(ItemLike item) {
        return ForgeRegistries.ITEMS.getKey(item.asItem()).getPath();
    }

    private static String getBlockName(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block).getPath();
    }

    private enum TextureFolder {
        ITEM, BLOCK;
        public String format(String itemName) {
            return this.name().toLowerCase() + '/' + itemName;
        }
    }
}
