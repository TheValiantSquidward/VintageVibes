package net.thevaliantsquidward.vintagevibes.registry;

import com.mojang.datafixers.util.Pair;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.flag.FeatureFlag;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thevaliantsquidward.vintagevibes.VintageVibes;
import net.thevaliantsquidward.vintagevibes.blocks.*;
import net.thevaliantsquidward.vintagevibes.blocks.interfaces.FruitLeaves;
import net.thevaliantsquidward.vintagevibes.blocks.interfaces.RipeningPineapple;
import net.thevaliantsquidward.vintagevibes.blocks.trees.*;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class VVBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, VintageVibes.MOD_ID);
    public static List<RegistryObject<? extends Block>> AUTO_TRANSLATE = new ArrayList<>();

    // block properties
    public static final BlockBehaviour.Properties GEM_STAND_PROPERTIES = BlockBehaviour.Properties.of().strength(0.5F, 1.0F).noOcclusion().sound(SoundType.AMETHYST_CLUSTER).instrument(NoteBlockInstrument.HARP).lightLevel((state) -> 5);
    public static final BlockBehaviour.Properties GEM_BLOCK_PROPERTIES = BlockBehaviour.Properties.of().strength(1.5F, 2.0F).requiresCorrectToolForDrops().sound(SoundType.AMETHYST).instrument(NoteBlockInstrument.HARP);
    public static final BlockBehaviour.Properties CALCITE_BLOCK_PROPERTIES = BlockBehaviour.Properties.of().strength(0.75F).requiresCorrectToolForDrops().sound(SoundType.CALCITE).instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.TERRACOTTA_WHITE);
    public static final BlockBehaviour.Properties CARVED_SANDSTONE_PROPERTIES = BlockBehaviour.Properties.of().mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(0.8F);
    public static final BlockBehaviour.Properties PINEAPPLE_PROPERTIES = BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).instrument(NoteBlockInstrument.BANJO).sound(SoundType.WOOD).strength(1.5F, 2.0F);
    public static final BlockBehaviour.Properties PINEAPPLE_FLESH_PROPERTIES = BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).instrument(NoteBlockInstrument.BANJO).sound(SoundType.CORAL_BLOCK).strength(1.5F, 2.0F);
    public static final BlockBehaviour.Properties BEJEWELED_LAMP_PROPERTIES = BlockBehaviour.Properties.of().strength(1.5F, 2.0F).requiresCorrectToolForDrops().sound(SoundType.AMETHYST).instrument(NoteBlockInstrument.HARP).lightLevel((state) -> 15);

    // bejeweled ore
    public static final RegistryObject<Block> BEJEWELED_ORE = registerBlock("bejeweled_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of().strength(3.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).instrument(NoteBlockInstrument.HARP).mapColor(MapColor.STONE), UniformInt.of(2, 4)));
    public static final RegistryObject<Block> DEEPSLATE_BEJEWELED_ORE = registerBlock("deepslate_bejeweled_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of().strength(4.5F, 3.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.DEEPSLATE), UniformInt.of(2, 4)));

    // crystal stands
    public static final RegistryObject<Block> AMBER_STAND = registerBlockNoLang("amber_stand", () -> new CrystalDisplayBlock(GEM_STAND_PROPERTIES.mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final RegistryObject<Block> AQUAMARINE_STAND = registerBlockNoLang("aquamarine_stand", () -> new CrystalDisplayBlock(GEM_STAND_PROPERTIES.mapColor(MapColor.COLOR_CYAN)));
    public static final RegistryObject<Block> ENSTATITE_STAND = registerBlockNoLang("enstatite_stand", () -> new CrystalDisplayBlock(GEM_STAND_PROPERTIES.mapColor(MapColor.TERRACOTTA_BROWN)));
    public static final RegistryObject<Block> GARNET_STAND = registerBlockNoLang("garnet_stand", () -> new CrystalDisplayBlock(GEM_STAND_PROPERTIES.mapColor(MapColor.TERRACOTTA_RED)));
    public static final RegistryObject<Block> JADE_STAND = registerBlockNoLang("jade_stand", () -> new CrystalDisplayBlock(GEM_STAND_PROPERTIES.mapColor(MapColor.TERRACOTTA_LIGHT_GREEN)));
    public static final RegistryObject<Block> KUNZITE_STAND = registerBlockNoLang("kunzite_stand", () -> new CrystalDisplayBlock(GEM_STAND_PROPERTIES.mapColor(MapColor.COLOR_PURPLE)));
    public static final RegistryObject<Block> LARIMAR_STAND = registerBlockNoLang("larimar_stand", () -> new CrystalDisplayBlock(GEM_STAND_PROPERTIES.mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final RegistryObject<Block> MILKY_QUARTZ_STAND = registerBlockNoLang("milky_quartz_stand", () -> new CrystalDisplayBlock(GEM_STAND_PROPERTIES.mapColor(MapColor.SNOW)));
    public static final RegistryObject<Block> MOONSTONE_STAND = registerBlockNoLang("moonstone_stand", () -> new CrystalDisplayBlock(GEM_STAND_PROPERTIES.mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final RegistryObject<Block> ONYX_STAND = registerBlockNoLang("onyx_stand", () -> new CrystalDisplayBlock(GEM_STAND_PROPERTIES.mapColor(MapColor.COLOR_BLACK)));
    public static final RegistryObject<Block> PERIDOT_STAND = registerBlockNoLang("peridot_stand", () -> new CrystalDisplayBlock(GEM_STAND_PROPERTIES.mapColor(MapColor.TERRACOTTA_GREEN)));
    public static final RegistryObject<Block> ROSE_QUARTZ_STAND = registerBlockNoLang("rose_quartz_stand", () -> new CrystalDisplayBlock(GEM_STAND_PROPERTIES.mapColor(MapColor.COLOR_PINK)));
    public static final RegistryObject<Block> SAPPHIRE_STAND = registerBlockNoLang("sapphire_stand", () -> new CrystalDisplayBlock(GEM_STAND_PROPERTIES.mapColor(MapColor.COLOR_BLUE)));
    public static final RegistryObject<Block> SMOKY_QUARTZ_STAND = registerBlockNoLang("smoky_quartz_stand", () -> new CrystalDisplayBlock(GEM_STAND_PROPERTIES.mapColor(MapColor.TERRACOTTA_BROWN)));
    public static final RegistryObject<Block> TAAFFEITE_STAND = registerBlockNoLang("taaffeite_stand", () -> new CrystalDisplayBlock(GEM_STAND_PROPERTIES.mapColor(MapColor.COLOR_MAGENTA)));
    public static final RegistryObject<Block> TOPAZ_STAND = registerBlockNoLang("topaz_stand", () -> new CrystalDisplayBlock(GEM_STAND_PROPERTIES.mapColor(MapColor.COLOR_YELLOW)));
    public static final RegistryObject<Block> AMETHYST_STAND = registerBlockNoLang("amethyst_stand", () -> new CrystalDisplayBlock(GEM_STAND_PROPERTIES.mapColor(MapColor.COLOR_PURPLE)));
    public static final RegistryObject<Block> DIAMOND_STAND = registerBlockNoLang("diamond_stand", () -> new CrystalDisplayBlock(GEM_STAND_PROPERTIES.mapColor(MapColor.DIAMOND)));
    public static final RegistryObject<Block> EMERALD_STAND = registerBlockNoLang("emerald_stand", () -> new CrystalDisplayBlock(GEM_STAND_PROPERTIES.mapColor(MapColor.EMERALD)));
    public static final RegistryObject<Block> QUARTZ_STAND = registerBlockNoLang("quartz_stand", () -> new CrystalDisplayBlock(GEM_STAND_PROPERTIES.mapColor(MapColor.QUARTZ)));

    // polished gem blocks
    public static final RegistryObject<Block> POLISHED_AMBER = registerBlock("polished_amber", () -> new Block(GEM_BLOCK_PROPERTIES.mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final RegistryObject<Block> POLISHED_AQUAMARINE = registerBlock("polished_aquamarine", () -> new Block(GEM_BLOCK_PROPERTIES.mapColor(MapColor.COLOR_CYAN)));
    public static final RegistryObject<Block> POLISHED_ENSTATITE = registerBlock("polished_enstatite", () -> new Block(GEM_BLOCK_PROPERTIES.mapColor(MapColor.TERRACOTTA_BROWN)));
    public static final RegistryObject<Block> POLISHED_GARNET = registerBlock("polished_garnet", () -> new Block(GEM_BLOCK_PROPERTIES.mapColor(MapColor.TERRACOTTA_RED)));
    public static final RegistryObject<Block> POLISHED_JADE = registerBlock("polished_jade", () -> new Block(GEM_BLOCK_PROPERTIES.mapColor(MapColor.TERRACOTTA_LIGHT_GREEN)));
    public static final RegistryObject<Block> POLISHED_KUNZITE = registerBlock("polished_kunzite", () -> new Block(GEM_BLOCK_PROPERTIES.mapColor(MapColor.COLOR_PURPLE)));
    public static final RegistryObject<Block> POLISHED_LARIMAR = registerBlock("polished_larimar", () -> new Block(GEM_BLOCK_PROPERTIES.mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final RegistryObject<Block> POLISHED_MILKY_QUARTZ = registerBlock("polished_milky_quartz", () -> new Block(GEM_BLOCK_PROPERTIES.mapColor(MapColor.SNOW)));
    public static final RegistryObject<Block> POLISHED_MOONSTONE = registerBlock("polished_moonstone", () -> new Block(GEM_BLOCK_PROPERTIES.mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final RegistryObject<Block> POLISHED_ONYX = registerBlock("polished_onyx", () -> new Block(GEM_BLOCK_PROPERTIES.mapColor(MapColor.COLOR_BLACK)));
    public static final RegistryObject<Block> POLISHED_PERIDOT = registerBlock("polished_peridot", () -> new Block(GEM_BLOCK_PROPERTIES.mapColor(MapColor.TERRACOTTA_GREEN)));
    public static final RegistryObject<Block> POLISHED_ROSE_QUARTZ = registerBlock("polished_rose_quartz", () -> new Block(GEM_BLOCK_PROPERTIES.mapColor(MapColor.COLOR_PINK)));
    public static final RegistryObject<Block> POLISHED_SAPPHIRE = registerBlock("polished_sapphire", () -> new Block(GEM_BLOCK_PROPERTIES.mapColor(MapColor.COLOR_BLUE)));
    public static final RegistryObject<Block> POLISHED_SMOKY_QUARTZ = registerBlock("polished_smoky_quartz", () -> new Block(GEM_BLOCK_PROPERTIES.mapColor(MapColor.TERRACOTTA_BROWN)));
    public static final RegistryObject<Block> POLISHED_TAAFFEITE = registerBlock("polished_taaffeite", () -> new Block(GEM_BLOCK_PROPERTIES.mapColor(MapColor.COLOR_MAGENTA)));
    public static final RegistryObject<Block> POLISHED_TOPAZ = registerBlock("polished_topaz", () -> new Block(GEM_BLOCK_PROPERTIES.mapColor(MapColor.COLOR_YELLOW)));

    // gem blocks
    public static final RegistryObject<Block> AMBER_BLOCK = registerBlockNoLang("amber_block", () -> new Block(GEM_BLOCK_PROPERTIES.mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final RegistryObject<Block> AQUAMARINE_BLOCK = registerBlockNoLang("aquamarine_block", () -> new Block(GEM_BLOCK_PROPERTIES.mapColor(MapColor.COLOR_CYAN)));
    public static final RegistryObject<Block> ENSTATITE_BLOCK = registerBlockNoLang("enstatite_block", () -> new Block(GEM_BLOCK_PROPERTIES.mapColor(MapColor.TERRACOTTA_BROWN)));
    public static final RegistryObject<Block> GARNET_BLOCK = registerBlockNoLang("garnet_block", () -> new Block(GEM_BLOCK_PROPERTIES.mapColor(MapColor.TERRACOTTA_RED)));
    public static final RegistryObject<Block> JADE_BLOCK = registerBlockNoLang("jade_block", () -> new Block(GEM_BLOCK_PROPERTIES.mapColor(MapColor.TERRACOTTA_LIGHT_GREEN)));
    public static final RegistryObject<Block> KUNZITE_BLOCK = registerBlockNoLang("kunzite_block", () -> new Block(GEM_BLOCK_PROPERTIES.mapColor(MapColor.COLOR_PURPLE)));
    public static final RegistryObject<Block> LARIMAR_BLOCK = registerBlockNoLang("larimar_block", () -> new Block(GEM_BLOCK_PROPERTIES.mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final RegistryObject<Block> MILKY_QUARTZ_BLOCK = registerBlockNoLang("milky_quartz_block", () -> new Block(GEM_BLOCK_PROPERTIES.mapColor(MapColor.SNOW)));
    public static final RegistryObject<Block> MOONSTONE_BLOCK = registerBlockNoLang("moonstone_block", () -> new Block(GEM_BLOCK_PROPERTIES.mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final RegistryObject<Block> ONYX_BLOCK = registerBlockNoLang("onyx_block", () -> new Block(GEM_BLOCK_PROPERTIES.mapColor(MapColor.COLOR_BLACK)));
    public static final RegistryObject<Block> PERIDOT_BLOCK = registerBlockNoLang("peridot_block", () -> new Block(GEM_BLOCK_PROPERTIES.mapColor(MapColor.TERRACOTTA_GREEN)));
    public static final RegistryObject<Block> ROSE_QUARTZ_BLOCK = registerBlockNoLang("rose_quartz_block", () -> new Block(GEM_BLOCK_PROPERTIES.mapColor(MapColor.COLOR_PINK)));
    public static final RegistryObject<Block> SAPPHIRE_BLOCK = registerBlockNoLang("sapphire_block", () -> new Block(GEM_BLOCK_PROPERTIES.mapColor(MapColor.COLOR_BLUE)));
    public static final RegistryObject<Block> SMOKY_QUARTZ_BLOCK = registerBlockNoLang("smoky_quartz_block", () -> new Block(GEM_BLOCK_PROPERTIES.mapColor(MapColor.TERRACOTTA_BROWN)));
    public static final RegistryObject<Block> TAAFFEITE_BLOCK = registerBlockNoLang("taaffeite_block", () -> new Block(GEM_BLOCK_PROPERTIES.mapColor(MapColor.COLOR_MAGENTA)));
    public static final RegistryObject<Block> TOPAZ_BLOCK = registerBlockNoLang("topaz_block", () -> new Block(GEM_BLOCK_PROPERTIES.mapColor(MapColor.COLOR_YELLOW)));

    // gem tiles
    public static final RegistryObject<Block> AMBER_TILES = registerBlock("amber_tiles", () -> new Block(GEM_BLOCK_PROPERTIES.mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final RegistryObject<Block> AMBER_TILE_STAIRS = registerBlock("amber_tile_stairs", () -> new StairBlock(() -> AMBER_TILES.get().defaultBlockState(), GEM_BLOCK_PROPERTIES.mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final RegistryObject<Block> AMBER_TILE_SLAB = registerBlock("amber_tile_slab", () -> new SlabBlock(GEM_BLOCK_PROPERTIES.mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final RegistryObject<Block> AMBER_TILE_WALL = registerBlock("amber_tile_wall", () -> new WallBlock(GEM_BLOCK_PROPERTIES.mapColor(MapColor.TERRACOTTA_ORANGE)));

    public static final RegistryObject<Block> AQUAMARINE_TILES = registerBlock("aquamarine_tiles", () -> new Block(GEM_BLOCK_PROPERTIES.mapColor(MapColor.COLOR_CYAN)));
    public static final RegistryObject<Block> AQUAMARINE_TILE_STAIRS = registerBlock("aquamarine_tile_stairs", () -> new StairBlock(() -> AQUAMARINE_TILES.get().defaultBlockState(), GEM_BLOCK_PROPERTIES.mapColor(MapColor.COLOR_CYAN)));
    public static final RegistryObject<Block> AQUAMARINE_TILE_SLAB = registerBlock("aquamarine_tile_slab", () -> new SlabBlock(GEM_BLOCK_PROPERTIES.mapColor(MapColor.COLOR_CYAN)));
    public static final RegistryObject<Block> AQUAMARINE_TILE_WALL = registerBlock("aquamarine_tile_wall", () -> new WallBlock(GEM_BLOCK_PROPERTIES.mapColor(MapColor.COLOR_CYAN)));

    public static final RegistryObject<Block> ENSTATITE_TILES = registerBlock("enstatite_tiles", () -> new Block(GEM_BLOCK_PROPERTIES.mapColor(MapColor.TERRACOTTA_BROWN)));
    public static final RegistryObject<Block> ENSTATITE_TILE_STAIRS = registerBlock("enstatite_tile_stairs", () -> new StairBlock(() -> ENSTATITE_TILES.get().defaultBlockState(), GEM_BLOCK_PROPERTIES.mapColor(MapColor.TERRACOTTA_BROWN)));
    public static final RegistryObject<Block> ENSTATITE_TILE_SLAB = registerBlock("enstatite_tile_slab", () -> new SlabBlock(GEM_BLOCK_PROPERTIES.mapColor(MapColor.TERRACOTTA_BROWN)));
    public static final RegistryObject<Block> ENSTATITE_TILE_WALL = registerBlock("enstatite_tile_wall", () -> new WallBlock(GEM_BLOCK_PROPERTIES.mapColor(MapColor.TERRACOTTA_BROWN)));

    public static final RegistryObject<Block> GARNET_TILES = registerBlock("garnet_tiles", () -> new Block(GEM_BLOCK_PROPERTIES.mapColor(MapColor.TERRACOTTA_RED)));
    public static final RegistryObject<Block> GARNET_TILE_STAIRS = registerBlock("garnet_tile_stairs", () -> new StairBlock(() -> GARNET_TILES.get().defaultBlockState(), GEM_BLOCK_PROPERTIES.mapColor(MapColor.TERRACOTTA_RED)));
    public static final RegistryObject<Block> GARNET_TILE_SLAB = registerBlock("garnet_tile_slab", () -> new SlabBlock(GEM_BLOCK_PROPERTIES.mapColor(MapColor.TERRACOTTA_RED)));
    public static final RegistryObject<Block> GARNET_TILE_WALL = registerBlock("garnet_tile_wall", () -> new WallBlock(GEM_BLOCK_PROPERTIES.mapColor(MapColor.TERRACOTTA_RED)));

    public static final RegistryObject<Block> JADE_TILES = registerBlock("jade_tiles", () -> new Block(GEM_BLOCK_PROPERTIES.mapColor(MapColor.TERRACOTTA_LIGHT_GREEN)));
    public static final RegistryObject<Block> JADE_TILE_STAIRS = registerBlock("jade_tile_stairs", () -> new StairBlock(() -> JADE_TILES.get().defaultBlockState(), GEM_BLOCK_PROPERTIES.mapColor(MapColor.TERRACOTTA_LIGHT_GREEN)));
    public static final RegistryObject<Block> JADE_TILE_SLAB = registerBlock("jade_tile_slab", () -> new SlabBlock(GEM_BLOCK_PROPERTIES.mapColor(MapColor.TERRACOTTA_LIGHT_GREEN)));
    public static final RegistryObject<Block> JADE_TILE_WALL = registerBlock("jade_tile_wall", () -> new WallBlock(GEM_BLOCK_PROPERTIES.mapColor(MapColor.TERRACOTTA_LIGHT_GREEN)));

    public static final RegistryObject<Block> KUNZITE_TILES = registerBlock("kunzite_tiles", () -> new Block(GEM_BLOCK_PROPERTIES.mapColor(MapColor.COLOR_PURPLE)));
    public static final RegistryObject<Block> KUNZITE_TILE_STAIRS = registerBlock("kunzite_tile_stairs", () -> new StairBlock(() -> KUNZITE_TILES.get().defaultBlockState(), GEM_BLOCK_PROPERTIES.mapColor(MapColor.COLOR_PURPLE)));
    public static final RegistryObject<Block> KUNZITE_TILE_SLAB = registerBlock("kunzite_tile_slab", () -> new SlabBlock(GEM_BLOCK_PROPERTIES.mapColor(MapColor.COLOR_PURPLE)));
    public static final RegistryObject<Block> KUNZITE_TILE_WALL = registerBlock("kunzite_tile_wall", () -> new WallBlock(GEM_BLOCK_PROPERTIES.mapColor(MapColor.COLOR_PURPLE)));

    public static final RegistryObject<Block> LARIMAR_TILES = registerBlock("larimar_tiles", () -> new Block(GEM_BLOCK_PROPERTIES.mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final RegistryObject<Block> LARIMAR_TILE_STAIRS = registerBlock("larimar_tile_stairs", () -> new StairBlock(() -> LARIMAR_TILES.get().defaultBlockState(), GEM_BLOCK_PROPERTIES.mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final RegistryObject<Block> LARIMAR_TILE_SLAB = registerBlock("larimar_tile_slab", () -> new SlabBlock(GEM_BLOCK_PROPERTIES.mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final RegistryObject<Block> LARIMAR_TILE_WALL = registerBlock("larimar_tile_wall", () -> new WallBlock(GEM_BLOCK_PROPERTIES.mapColor(MapColor.COLOR_LIGHT_BLUE)));

    public static final RegistryObject<Block> MILKY_QUARTZ_TILES = registerBlock("milky_quartz_tiles", () -> new Block(GEM_BLOCK_PROPERTIES.mapColor(MapColor.SNOW)));
    public static final RegistryObject<Block> MILKY_QUARTZ_TILE_STAIRS = registerBlock("milky_quartz_tile_stairs", () -> new StairBlock(() -> MILKY_QUARTZ_TILES.get().defaultBlockState(), GEM_BLOCK_PROPERTIES.mapColor(MapColor.SNOW)));
    public static final RegistryObject<Block> MILKY_QUARTZ_TILE_SLAB = registerBlock("milky_quartz_tile_slab", () -> new SlabBlock(GEM_BLOCK_PROPERTIES.mapColor(MapColor.SNOW)));
    public static final RegistryObject<Block> MILKY_QUARTZ_TILE_WALL = registerBlock("milky_quartz_tile_wall", () -> new WallBlock(GEM_BLOCK_PROPERTIES.mapColor(MapColor.SNOW)));

    public static final RegistryObject<Block> MOONSTONE_TILES = registerBlock("moonstone_tiles", () -> new Block(GEM_BLOCK_PROPERTIES.mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final RegistryObject<Block> MOONSTONE_TILE_STAIRS = registerBlock("moonstone_tile_stairs", () -> new StairBlock(() -> MOONSTONE_TILES.get().defaultBlockState(), GEM_BLOCK_PROPERTIES.mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final RegistryObject<Block> MOONSTONE_TILE_SLAB = registerBlock("moonstone_tile_slab", () -> new SlabBlock(GEM_BLOCK_PROPERTIES.mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final RegistryObject<Block> MOONSTONE_TILE_WALL = registerBlock("moonstone_tile_wall", () -> new WallBlock(GEM_BLOCK_PROPERTIES.mapColor(MapColor.COLOR_LIGHT_BLUE)));

    public static final RegistryObject<Block> ONYX_TILES = registerBlock("onyx_tiles", () -> new Block(GEM_BLOCK_PROPERTIES.mapColor(MapColor.COLOR_BLACK)));
    public static final RegistryObject<Block> ONYX_TILE_STAIRS = registerBlock("onyx_tile_stairs", () -> new StairBlock(() -> ONYX_TILES.get().defaultBlockState(), GEM_BLOCK_PROPERTIES.mapColor(MapColor.COLOR_BLACK)));
    public static final RegistryObject<Block> ONYX_TILE_SLAB = registerBlock("onyx_tile_slab", () -> new SlabBlock(GEM_BLOCK_PROPERTIES.mapColor(MapColor.COLOR_BLACK)));
    public static final RegistryObject<Block> ONYX_TILE_WALL = registerBlock("onyx_tile_wall", () -> new WallBlock(GEM_BLOCK_PROPERTIES.mapColor(MapColor.COLOR_BLACK)));

    public static final RegistryObject<Block> PERIDOT_TILES = registerBlock("peridot_tiles", () -> new Block(GEM_BLOCK_PROPERTIES.mapColor(MapColor.TERRACOTTA_GREEN)));
    public static final RegistryObject<Block> PERIDOT_TILE_STAIRS = registerBlock("peridot_tile_stairs", () -> new StairBlock(() -> PERIDOT_TILES.get().defaultBlockState(), GEM_BLOCK_PROPERTIES.mapColor(MapColor.TERRACOTTA_GREEN)));
    public static final RegistryObject<Block> PERIDOT_TILE_SLAB = registerBlock("peridot_tile_slab", () -> new SlabBlock(GEM_BLOCK_PROPERTIES.mapColor(MapColor.TERRACOTTA_GREEN)));
    public static final RegistryObject<Block> PERIDOT_TILE_WALL = registerBlock("peridot_tile_wall", () -> new WallBlock(GEM_BLOCK_PROPERTIES.mapColor(MapColor.TERRACOTTA_GREEN)));

    public static final RegistryObject<Block> ROSE_QUARTZ_TILES = registerBlock("rose_quartz_tiles", () -> new Block(GEM_BLOCK_PROPERTIES.mapColor(MapColor.COLOR_PINK)));
    public static final RegistryObject<Block> ROSE_QUARTZ_TILE_STAIRS = registerBlock("rose_quartz_tile_stairs", () -> new StairBlock(() -> ROSE_QUARTZ_TILES.get().defaultBlockState(), GEM_BLOCK_PROPERTIES.mapColor(MapColor.COLOR_PINK)));
    public static final RegistryObject<Block> ROSE_QUARTZ_TILE_SLAB = registerBlock("rose_quartz_tile_slab", () -> new SlabBlock(GEM_BLOCK_PROPERTIES.mapColor(MapColor.COLOR_PINK)));
    public static final RegistryObject<Block> ROSE_QUARTZ_TILE_WALL = registerBlock("rose_quartz_tile_wall", () -> new WallBlock(GEM_BLOCK_PROPERTIES.mapColor(MapColor.COLOR_PINK)));

    public static final RegistryObject<Block> SAPPHIRE_TILES = registerBlock("sapphire_tiles", () -> new Block(GEM_BLOCK_PROPERTIES.mapColor(MapColor.COLOR_BLUE)));
    public static final RegistryObject<Block> SAPPHIRE_TILE_STAIRS = registerBlock("sapphire_tile_stairs", () -> new StairBlock(() -> SAPPHIRE_TILES.get().defaultBlockState(), GEM_BLOCK_PROPERTIES.mapColor(MapColor.COLOR_BLUE)));
    public static final RegistryObject<Block> SAPPHIRE_TILE_SLAB = registerBlock("sapphire_tile_slab", () -> new SlabBlock(GEM_BLOCK_PROPERTIES.mapColor(MapColor.COLOR_BLUE)));
    public static final RegistryObject<Block> SAPPHIRE_TILE_WALL = registerBlock("sapphire_tile_wall", () -> new WallBlock(GEM_BLOCK_PROPERTIES.mapColor(MapColor.COLOR_BLUE)));

    public static final RegistryObject<Block> SMOKY_QUARTZ_TILES = registerBlock("smoky_quartz_tiles", () -> new Block(GEM_BLOCK_PROPERTIES.mapColor(MapColor.TERRACOTTA_BROWN)));
    public static final RegistryObject<Block> SMOKY_QUARTZ_TILE_STAIRS = registerBlock("smoky_quartz_tile_stairs", () -> new StairBlock(() -> SMOKY_QUARTZ_TILES.get().defaultBlockState(), GEM_BLOCK_PROPERTIES.mapColor(MapColor.TERRACOTTA_BROWN)));
    public static final RegistryObject<Block> SMOKY_QUARTZ_TILE_SLAB = registerBlock("smoky_quartz_tile_slab", () -> new SlabBlock(GEM_BLOCK_PROPERTIES.mapColor(MapColor.TERRACOTTA_BROWN)));
    public static final RegistryObject<Block> SMOKY_QUARTZ_TILE_WALL = registerBlock("smoky_quartz_tile_wall", () -> new WallBlock(GEM_BLOCK_PROPERTIES.mapColor(MapColor.TERRACOTTA_BROWN)));

    public static final RegistryObject<Block> TAAFFEITE_TILES = registerBlock("taaffeite_tiles", () -> new Block(GEM_BLOCK_PROPERTIES.mapColor(MapColor.COLOR_MAGENTA)));
    public static final RegistryObject<Block> TAAFFEITE_TILE_STAIRS = registerBlock("taaffeite_tile_stairs", () -> new StairBlock(() -> TAAFFEITE_TILES.get().defaultBlockState(), GEM_BLOCK_PROPERTIES.mapColor(MapColor.COLOR_MAGENTA)));
    public static final RegistryObject<Block> TAAFFEITE_TILE_SLAB = registerBlock("taaffeite_tile_slab", () -> new SlabBlock(GEM_BLOCK_PROPERTIES.mapColor(MapColor.COLOR_MAGENTA)));
    public static final RegistryObject<Block> TAAFFEITE_TILE_WALL = registerBlock("taaffeite_tile_wall", () -> new WallBlock(GEM_BLOCK_PROPERTIES.mapColor(MapColor.COLOR_MAGENTA)));

    public static final RegistryObject<Block> TOPAZ_TILES = registerBlock("topaz_tiles", () -> new Block(GEM_BLOCK_PROPERTIES.mapColor(MapColor.COLOR_YELLOW)));
    public static final RegistryObject<Block> TOPAZ_TILE_STAIRS = registerBlock("topaz_tile_stairs", () -> new StairBlock(() -> TOPAZ_TILES.get().defaultBlockState(), GEM_BLOCK_PROPERTIES.mapColor(MapColor.COLOR_YELLOW)));
    public static final RegistryObject<Block> TOPAZ_TILE_SLAB = registerBlock("topaz_tile_slab", () -> new SlabBlock(GEM_BLOCK_PROPERTIES.mapColor(MapColor.COLOR_YELLOW)));
    public static final RegistryObject<Block> TOPAZ_TILE_WALL = registerBlock("topaz_tile_wall", () -> new WallBlock(GEM_BLOCK_PROPERTIES.mapColor(MapColor.COLOR_YELLOW)));

    // vanilla gem blocks
    public static final RegistryObject<Block> AMETHYST_TILES = registerBlock("amethyst_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> AMETHYST_TILE_STAIRS = registerBlock("amethyst_tile_stairs", () -> new StairBlock(() -> AMETHYST_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(VVBlocks.AMETHYST_TILES.get())));
    public static final RegistryObject<Block> AMETHYST_TILE_SLAB = registerBlock("amethyst_tile_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(VVBlocks.AMETHYST_TILES.get())));
    public static final RegistryObject<Block> AMETHYST_TILE_WALL = registerBlock("amethyst_tile_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(VVBlocks.AMETHYST_TILES.get())));

    public static final RegistryObject<Block> DIAMOND_TILES = registerBlock("diamond_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DIAMOND_TILE_STAIRS = registerBlock("diamond_tile_stairs", () -> new StairBlock(() -> DIAMOND_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(VVBlocks.DIAMOND_TILES.get())));
    public static final RegistryObject<Block> DIAMOND_TILE_SLAB = registerBlock("diamond_tile_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(VVBlocks.DIAMOND_TILES.get())));
    public static final RegistryObject<Block> DIAMOND_TILE_WALL = registerBlock("diamond_tile_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(VVBlocks.DIAMOND_TILES.get())));

    public static final RegistryObject<Block> EMERALD_TILES = registerBlock("emerald_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> EMERALD_TILE_STAIRS = registerBlock("emerald_tile_stairs", () -> new StairBlock(() -> EMERALD_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(VVBlocks.EMERALD_TILES.get())));
    public static final RegistryObject<Block> EMERALD_TILE_SLAB = registerBlock("emerald_tile_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(VVBlocks.EMERALD_TILES.get())));
    public static final RegistryObject<Block> EMERALD_TILE_WALL = registerBlock("emerald_tile_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(VVBlocks.EMERALD_TILES.get())));

    public static final RegistryObject<Block> QUARTZ_TILES = registerBlock("quartz_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> QUARTZ_TILE_STAIRS = registerBlock("quartz_tile_stairs", () -> new StairBlock(() -> QUARTZ_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(VVBlocks.QUARTZ_TILES.get())));
    public static final RegistryObject<Block> QUARTZ_TILE_SLAB = registerBlock("quartz_tile_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(VVBlocks.QUARTZ_TILES.get())));
    public static final RegistryObject<Block> QUARTZ_TILE_WALL = registerBlock("quartz_tile_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(VVBlocks.QUARTZ_TILES.get())));

    // calcite tiles
    public static final RegistryObject<Block> CALCITE_TILES = registerBlock("calcite_tiles", () -> new Block(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> CALCITE_TILE_STAIRS = registerBlock("calcite_tile_stairs", () -> new StairBlock(() -> CALCITE_TILES.get().defaultBlockState(), CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> CALCITE_TILE_SLAB = registerBlock("calcite_tile_slab", () -> new SlabBlock(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> CALCITE_TILE_WALL = registerBlock("calcite_tile_wall", () -> new WallBlock(CALCITE_BLOCK_PROPERTIES));

    public static final RegistryObject<Block> STARRY_AMBER_CALCITE_TILES = registerBlock("starry_amber_calcite_tiles", () -> new Block(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> STARRY_AQUAMARINE_CALCITE_TILES = registerBlock("starry_aquamarine_calcite_tiles", () -> new Block(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> STARRY_ENSTATITE_CALCITE_TILES = registerBlock("starry_enstatite_calcite_tiles", () -> new Block(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> STARRY_GARNET_CALCITE_TILES = registerBlock("starry_garnet_calcite_tiles", () -> new Block(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> STARRY_JADE_CALCITE_TILES = registerBlock("starry_jade_calcite_tiles", () -> new Block(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> STARRY_KUNZITE_CALCITE_TILES = registerBlock("starry_kunzite_calcite_tiles", () -> new Block(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> STARRY_LARIMAR_CALCITE_TILES = registerBlock("starry_larimar_calcite_tiles", () -> new Block(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> STARRY_MILKY_QUARTZ_CALCITE_TILES = registerBlock("starry_milky_quartz_calcite_tiles", () -> new Block(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> STARRY_MOONSTONE_CALCITE_TILES = registerBlock("starry_moonstone_calcite_tiles", () -> new Block(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> STARRY_ONYX_CALCITE_TILES = registerBlock("starry_onyx_calcite_tiles", () -> new Block(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> STARRY_PERIDOT_CALCITE_TILES = registerBlock("starry_peridot_calcite_tiles", () -> new Block(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> STARRY_ROSE_QUARTZ_CALCITE_TILES = registerBlock("starry_rose_quartz_calcite_tiles", () -> new Block(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> STARRY_SAPPHIRE_CALCITE_TILES = registerBlock("starry_sapphire_calcite_tiles", () -> new Block(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> STARRY_SMOKY_QUARTZ_CALCITE_TILES = registerBlock("starry_smoky_quartz_calcite_tiles", () -> new Block(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> STARRY_TAAFFEITE_CALCITE_TILES = registerBlock("starry_taaffeite_calcite_tiles", () -> new Block(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> STARRY_TOPAZ_CALCITE_TILES = registerBlock("starry_topaz_calcite_tiles", () -> new Block(CALCITE_BLOCK_PROPERTIES));

    public static final RegistryObject<Block> STARRY_AMETHYST_CALCITE_TILES = registerBlock("starry_amethyst_calcite_tiles", () -> new Block(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> STARRY_DIAMOND_CALCITE_TILES = registerBlock("starry_diamond_calcite_tiles", () -> new Block(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> STARRY_EMERALD_CALCITE_TILES = registerBlock("starry_emerald_calcite_tiles", () -> new Block(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> STARRY_QUARTZ_CALCITE_TILES = registerBlock("starry_quartz_calcite_tiles", () -> new Block(CALCITE_BLOCK_PROPERTIES));

    // calcite bricks
    public static final RegistryObject<Block> CALCITE_BRICKS = registerBlock("calcite_bricks", () -> new Block(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> CALCITE_BRICK_STAIRS = registerBlock("calcite_brick_stairs", () -> new StairBlock(() -> CALCITE_BRICKS.get().defaultBlockState(), CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> CALCITE_BRICK_SLAB = registerBlock("calcite_brick_slab", () -> new SlabBlock(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> CALCITE_BRICK_WALL = registerBlock("calcite_brick_wall", () -> new WallBlock(CALCITE_BLOCK_PROPERTIES));

    public static final RegistryObject<Block> AMBER_BEJEWELED_CALCITE_BRICKS = registerBlock("amber_bejeweled_calcite_bricks", () -> new Block(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> AMBER_BEJEWELED_CALCITE_BRICK_STAIRS = registerBlock("amber_bejeweled_calcite_brick_stairs", () -> new StairBlock(() -> AMBER_BEJEWELED_CALCITE_BRICKS.get().defaultBlockState(), CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> AMBER_BEJEWELED_CALCITE_BRICK_SLAB = registerBlock("amber_bejeweled_calcite_brick_slab", () -> new SlabBlock(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> AMBER_BEJEWELED_CALCITE_BRICK_WALL = registerBlock("amber_bejeweled_calcite_brick_wall", () -> new WallBlock(CALCITE_BLOCK_PROPERTIES));

    public static final RegistryObject<Block> AQUAMARINE_BEJEWELED_CALCITE_BRICKS = registerBlock("aquamarine_bejeweled_calcite_bricks", () -> new Block(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> AQUAMARINE_BEJEWELED_CALCITE_BRICK_STAIRS = registerBlock("aquamarine_bejeweled_calcite_brick_stairs", () -> new StairBlock(() -> AQUAMARINE_BEJEWELED_CALCITE_BRICKS.get().defaultBlockState(), CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> AQUAMARINE_BEJEWELED_CALCITE_BRICK_SLAB = registerBlock("aquamarine_bejeweled_calcite_brick_slab", () -> new SlabBlock(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> AQUAMARINE_BEJEWELED_CALCITE_BRICK_WALL = registerBlock("aquamarine_bejeweled_calcite_brick_wall", () -> new WallBlock(CALCITE_BLOCK_PROPERTIES));

    public static final RegistryObject<Block> ENSTATITE_BEJEWELED_CALCITE_BRICKS = registerBlock("enstatite_bejeweled_calcite_bricks", () -> new Block(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> ENSTATITE_BEJEWELED_CALCITE_BRICK_STAIRS = registerBlock("enstatite_bejeweled_calcite_brick_stairs", () -> new StairBlock(() -> ENSTATITE_BEJEWELED_CALCITE_BRICKS.get().defaultBlockState(), CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> ENSTATITE_BEJEWELED_CALCITE_BRICK_SLAB = registerBlock("enstatite_bejeweled_calcite_brick_slab", () -> new SlabBlock(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> ENSTATITE_BEJEWELED_CALCITE_BRICK_WALL = registerBlock("enstatite_bejeweled_calcite_brick_wall", () -> new WallBlock(CALCITE_BLOCK_PROPERTIES));

    public static final RegistryObject<Block> GARNET_BEJEWELED_CALCITE_BRICKS = registerBlock("garnet_bejeweled_calcite_bricks", () -> new Block(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> GARNET_BEJEWELED_CALCITE_BRICK_STAIRS = registerBlock("garnet_bejeweled_calcite_brick_stairs", () -> new StairBlock(() -> GARNET_BEJEWELED_CALCITE_BRICKS.get().defaultBlockState(), CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> GARNET_BEJEWELED_CALCITE_BRICK_SLAB = registerBlock("garnet_bejeweled_calcite_brick_slab", () -> new SlabBlock(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> GARNET_BEJEWELED_CALCITE_BRICK_WALL = registerBlock("garnet_bejeweled_calcite_brick_wall", () -> new WallBlock(CALCITE_BLOCK_PROPERTIES));

    public static final RegistryObject<Block> JADE_BEJEWELED_CALCITE_BRICKS = registerBlock("jade_bejeweled_calcite_bricks", () -> new Block(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> JADE_BEJEWELED_CALCITE_BRICK_STAIRS = registerBlock("jade_bejeweled_calcite_brick_stairs", () -> new StairBlock(() -> JADE_BEJEWELED_CALCITE_BRICKS.get().defaultBlockState(), CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> JADE_BEJEWELED_CALCITE_BRICK_SLAB = registerBlock("jade_bejeweled_calcite_brick_slab", () -> new SlabBlock(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> JADE_BEJEWELED_CALCITE_BRICK_WALL = registerBlock("jade_bejeweled_calcite_brick_wall", () -> new WallBlock(CALCITE_BLOCK_PROPERTIES));

    public static final RegistryObject<Block> KUNZITE_BEJEWELED_CALCITE_BRICKS = registerBlock("kunzite_bejeweled_calcite_bricks", () -> new Block(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> KUNZITE_BEJEWELED_CALCITE_BRICK_STAIRS = registerBlock("kunzite_bejeweled_calcite_brick_stairs", () -> new StairBlock(() -> KUNZITE_BEJEWELED_CALCITE_BRICKS.get().defaultBlockState(), CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> KUNZITE_BEJEWELED_CALCITE_BRICK_SLAB = registerBlock("kunzite_bejeweled_calcite_brick_slab", () -> new SlabBlock(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> KUNZITE_BEJEWELED_CALCITE_BRICK_WALL = registerBlock("kunzite_bejeweled_calcite_brick_wall", () -> new WallBlock(CALCITE_BLOCK_PROPERTIES));

    public static final RegistryObject<Block> LARIMAR_BEJEWELED_CALCITE_BRICKS = registerBlock("larimar_bejeweled_calcite_bricks", () -> new Block(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> LARIMAR_BEJEWELED_CALCITE_BRICK_STAIRS = registerBlock("larimar_bejeweled_calcite_brick_stairs", () -> new StairBlock(() -> LARIMAR_BEJEWELED_CALCITE_BRICKS.get().defaultBlockState(), CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> LARIMAR_BEJEWELED_CALCITE_BRICK_SLAB = registerBlock("larimar_bejeweled_calcite_brick_slab", () -> new SlabBlock(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> LARIMAR_BEJEWELED_CALCITE_BRICK_WALL = registerBlock("larimar_bejeweled_calcite_brick_wall", () -> new WallBlock(CALCITE_BLOCK_PROPERTIES));

    public static final RegistryObject<Block> MILKY_QUARTZ_BEJEWELED_CALCITE_BRICKS = registerBlock("milky_quartz_bejeweled_calcite_bricks", () -> new Block(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> MILKY_QUARTZ_BEJEWELED_CALCITE_BRICK_STAIRS = registerBlock("milky_quartz_bejeweled_calcite_brick_stairs", () -> new StairBlock(() -> MILKY_QUARTZ_BEJEWELED_CALCITE_BRICKS.get().defaultBlockState(), CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> MILKY_QUARTZ_BEJEWELED_CALCITE_BRICK_SLAB = registerBlock("milky_quartz_bejeweled_calcite_brick_slab", () -> new SlabBlock(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> MILKY_QUARTZ_BEJEWELED_CALCITE_BRICK_WALL = registerBlock("milky_quartz_bejeweled_calcite_brick_wall", () -> new WallBlock(CALCITE_BLOCK_PROPERTIES));

    public static final RegistryObject<Block> MOONSTONE_BEJEWELED_CALCITE_BRICKS = registerBlock("moonstone_bejeweled_calcite_bricks", () -> new Block(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> MOONSTONE_BEJEWELED_CALCITE_BRICK_STAIRS = registerBlock("moonstone_bejeweled_calcite_brick_stairs", () -> new StairBlock(() -> MOONSTONE_BEJEWELED_CALCITE_BRICKS.get().defaultBlockState(), CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> MOONSTONE_BEJEWELED_CALCITE_BRICK_SLAB = registerBlock("moonstone_bejeweled_calcite_brick_slab", () -> new SlabBlock(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> MOONSTONE_BEJEWELED_CALCITE_BRICK_WALL = registerBlock("moonstone_bejeweled_calcite_brick_wall", () -> new WallBlock(CALCITE_BLOCK_PROPERTIES));

    public static final RegistryObject<Block> ONYX_BEJEWELED_CALCITE_BRICKS = registerBlock("onyx_bejeweled_calcite_bricks", () -> new Block(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> ONYX_BEJEWELED_CALCITE_BRICK_STAIRS = registerBlock("onyx_bejeweled_calcite_brick_stairs", () -> new StairBlock(() -> ONYX_BEJEWELED_CALCITE_BRICKS.get().defaultBlockState(), CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> ONYX_BEJEWELED_CALCITE_BRICK_SLAB = registerBlock("onyx_bejeweled_calcite_brick_slab", () -> new SlabBlock(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> ONYX_BEJEWELED_CALCITE_BRICK_WALL = registerBlock("onyx_bejeweled_calcite_brick_wall", () -> new WallBlock(CALCITE_BLOCK_PROPERTIES));

    public static final RegistryObject<Block> PERIDOT_BEJEWELED_CALCITE_BRICKS = registerBlock("peridot_bejeweled_calcite_bricks", () -> new Block(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> PERIDOT_BEJEWELED_CALCITE_BRICK_STAIRS = registerBlock("peridot_bejeweled_calcite_brick_stairs", () -> new StairBlock(() -> PERIDOT_BEJEWELED_CALCITE_BRICKS.get().defaultBlockState(), CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> PERIDOT_BEJEWELED_CALCITE_BRICK_SLAB = registerBlock("peridot_bejeweled_calcite_brick_slab", () -> new SlabBlock(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> PERIDOT_BEJEWELED_CALCITE_BRICK_WALL = registerBlock("peridot_bejeweled_calcite_brick_wall", () -> new WallBlock(CALCITE_BLOCK_PROPERTIES));

    public static final RegistryObject<Block> ROSE_QUARTZ_BEJEWELED_CALCITE_BRICKS = registerBlock("rose_quartz_bejeweled_calcite_bricks", () -> new Block(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> ROSE_QUARTZ_BEJEWELED_CALCITE_BRICK_STAIRS = registerBlock("rose_quartz_bejeweled_calcite_brick_stairs", () -> new StairBlock(() -> ROSE_QUARTZ_BEJEWELED_CALCITE_BRICKS.get().defaultBlockState(), CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> ROSE_QUARTZ_BEJEWELED_CALCITE_BRICK_SLAB = registerBlock("rose_quartz_bejeweled_calcite_brick_slab", () -> new SlabBlock(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> ROSE_QUARTZ_BEJEWELED_CALCITE_BRICK_WALL = registerBlock("rose_quartz_bejeweled_calcite_brick_wall", () -> new WallBlock(CALCITE_BLOCK_PROPERTIES));

    public static final RegistryObject<Block> SAPPHIRE_BEJEWELED_CALCITE_BRICKS = registerBlock("sapphire_bejeweled_calcite_bricks", () -> new Block(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> SAPPHIRE_BEJEWELED_CALCITE_BRICK_STAIRS = registerBlock("sapphire_bejeweled_calcite_brick_stairs", () -> new StairBlock(() -> SAPPHIRE_BEJEWELED_CALCITE_BRICKS.get().defaultBlockState(), CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> SAPPHIRE_BEJEWELED_CALCITE_BRICK_SLAB = registerBlock("sapphire_bejeweled_calcite_brick_slab", () -> new SlabBlock(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> SAPPHIRE_BEJEWELED_CALCITE_BRICK_WALL = registerBlock("sapphire_bejeweled_calcite_brick_wall", () -> new WallBlock(CALCITE_BLOCK_PROPERTIES));

    public static final RegistryObject<Block> SMOKY_QUARTZ_BEJEWELED_CALCITE_BRICKS = registerBlock("smoky_quartz_bejeweled_calcite_bricks", () -> new Block(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> SMOKY_QUARTZ_BEJEWELED_CALCITE_BRICK_STAIRS = registerBlock("smoky_quartz_bejeweled_calcite_brick_stairs", () -> new StairBlock(() -> SMOKY_QUARTZ_BEJEWELED_CALCITE_BRICKS.get().defaultBlockState(), CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> SMOKY_QUARTZ_BEJEWELED_CALCITE_BRICK_SLAB = registerBlock("smoky_quartz_bejeweled_calcite_brick_slab", () -> new SlabBlock(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> SMOKY_QUARTZ_BEJEWELED_CALCITE_BRICK_WALL = registerBlock("smoky_quartz_bejeweled_calcite_brick_wall", () -> new WallBlock(CALCITE_BLOCK_PROPERTIES));

    public static final RegistryObject<Block> TAAFFEITE_BEJEWELED_CALCITE_BRICKS = registerBlock("taaffeite_bejeweled_calcite_bricks", () -> new Block(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> TAAFFEITE_BEJEWELED_CALCITE_BRICK_STAIRS = registerBlock("taaffeite_bejeweled_calcite_brick_stairs", () -> new StairBlock(() -> TAAFFEITE_BEJEWELED_CALCITE_BRICKS.get().defaultBlockState(), CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> TAAFFEITE_BEJEWELED_CALCITE_BRICK_SLAB = registerBlock("taaffeite_bejeweled_calcite_brick_slab", () -> new SlabBlock(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> TAAFFEITE_BEJEWELED_CALCITE_BRICK_WALL = registerBlock("taaffeite_bejeweled_calcite_brick_wall", () -> new WallBlock(CALCITE_BLOCK_PROPERTIES));

    public static final RegistryObject<Block> TOPAZ_BEJEWELED_CALCITE_BRICKS = registerBlock("topaz_bejeweled_calcite_bricks", () -> new Block(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> TOPAZ_BEJEWELED_CALCITE_BRICK_STAIRS = registerBlock("topaz_bejeweled_calcite_brick_stairs", () -> new StairBlock(() -> TOPAZ_BEJEWELED_CALCITE_BRICKS.get().defaultBlockState(), CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> TOPAZ_BEJEWELED_CALCITE_BRICK_SLAB = registerBlock("topaz_bejeweled_calcite_brick_slab", () -> new SlabBlock(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> TOPAZ_BEJEWELED_CALCITE_BRICK_WALL = registerBlock("topaz_bejeweled_calcite_brick_wall", () -> new WallBlock(CALCITE_BLOCK_PROPERTIES));

    public static final RegistryObject<Block> AMETHYST_BEJEWELED_CALCITE_BRICKS = registerBlock("amethyst_bejeweled_calcite_bricks", () -> new Block(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> AMETHYST_BEJEWELED_CALCITE_BRICK_STAIRS = registerBlock("amethyst_bejeweled_calcite_brick_stairs", () -> new StairBlock(() -> AMETHYST_BEJEWELED_CALCITE_BRICKS.get().defaultBlockState(), CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> AMETHYST_BEJEWELED_CALCITE_BRICK_SLAB = registerBlock("amethyst_bejeweled_calcite_brick_slab", () -> new SlabBlock(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> AMETHYST_BEJEWELED_CALCITE_BRICK_WALL = registerBlock("amethyst_bejeweled_calcite_brick_wall", () -> new WallBlock(CALCITE_BLOCK_PROPERTIES));

    public static final RegistryObject<Block> DIAMOND_BEJEWELED_CALCITE_BRICKS = registerBlock("diamond_bejeweled_calcite_bricks", () -> new Block(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> DIAMOND_BEJEWELED_CALCITE_BRICK_STAIRS = registerBlock("diamond_bejeweled_calcite_brick_stairs", () -> new StairBlock(() -> DIAMOND_BEJEWELED_CALCITE_BRICKS.get().defaultBlockState(), CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> DIAMOND_BEJEWELED_CALCITE_BRICK_SLAB = registerBlock("diamond_bejeweled_calcite_brick_slab", () -> new SlabBlock(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> DIAMOND_BEJEWELED_CALCITE_BRICK_WALL = registerBlock("diamond_bejeweled_calcite_brick_wall", () -> new WallBlock(CALCITE_BLOCK_PROPERTIES));

    public static final RegistryObject<Block> EMERALD_BEJEWELED_CALCITE_BRICKS = registerBlock("emerald_bejeweled_calcite_bricks", () -> new Block(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> EMERALD_BEJEWELED_CALCITE_BRICK_STAIRS = registerBlock("emerald_bejeweled_calcite_brick_stairs", () -> new StairBlock(() -> EMERALD_BEJEWELED_CALCITE_BRICKS.get().defaultBlockState(), CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> EMERALD_BEJEWELED_CALCITE_BRICK_SLAB = registerBlock("emerald_bejeweled_calcite_brick_slab", () -> new SlabBlock(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> EMERALD_BEJEWELED_CALCITE_BRICK_WALL = registerBlock("emerald_bejeweled_calcite_brick_wall", () -> new WallBlock(CALCITE_BLOCK_PROPERTIES));

    public static final RegistryObject<Block> QUARTZ_BEJEWELED_CALCITE_BRICKS = registerBlock("quartz_bejeweled_calcite_bricks", () -> new Block(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> QUARTZ_BEJEWELED_CALCITE_BRICK_STAIRS = registerBlock("quartz_bejeweled_calcite_brick_stairs", () -> new StairBlock(() -> QUARTZ_BEJEWELED_CALCITE_BRICKS.get().defaultBlockState(), CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> QUARTZ_BEJEWELED_CALCITE_BRICK_SLAB = registerBlock("quartz_bejeweled_calcite_brick_slab", () -> new SlabBlock(CALCITE_BLOCK_PROPERTIES));
    public static final RegistryObject<Block> QUARTZ_BEJEWELED_CALCITE_BRICK_WALL = registerBlock("quartz_bejeweled_calcite_brick_wall", () -> new WallBlock(CALCITE_BLOCK_PROPERTIES));

    //bejeweled lamps
    public static final RegistryObject<Block> BANDED_BEJEWELED_LAMP = registerBlock("banded_bejeweled_lamp", () -> new VVDirectionalBlock(BEJEWELED_LAMP_PROPERTIES.mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final RegistryObject<Block> DIAMANTE_BEJEWELED_LAMP = registerBlock("diamante_bejeweled_lamp", () -> new VVDirectionalBlock(BEJEWELED_LAMP_PROPERTIES.mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final RegistryObject<Block> FLORAL_BEJEWELED_LAMP = registerBlock("floral_bejeweled_lamp", () -> new VVDirectionalBlock(BEJEWELED_LAMP_PROPERTIES.mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final RegistryObject<Block> HONEYCOMB_BEJEWELED_LAMP = registerBlock("honeycomb_bejeweled_lamp", () -> new VVDirectionalBlock(BEJEWELED_LAMP_PROPERTIES.mapColor(MapColor.TERRACOTTA_BLACK)));

    // paper lanterns
    public static final RegistryObject<Block> OAK_PAPER_LANTERN = registerBlock("oak_paper_lantern", () -> new VVDirectionalBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(0.5F).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> SPRUCE_PAPER_LANTERN = registerBlock("spruce_paper_lantern", () -> new VVDirectionalBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).strength(0.5F).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BIRCH_PAPER_LANTERN = registerBlock("birch_paper_lantern", () -> new VVDirectionalBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS).strength(0.5F).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> JUNGLE_PAPER_LANTERN = registerBlock("jungle_paper_lantern", () -> new VVDirectionalBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS).strength(0.5F).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> ACACIA_PAPER_LANTERN = registerBlock("acacia_paper_lantern", () -> new VVDirectionalBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS).strength(0.5F).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> DARK_OAK_PAPER_LANTERN = registerBlock("dark_oak_paper_lantern", () -> new VVDirectionalBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS).strength(0.5F).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> WARPED_PAPER_LANTERN = registerBlock("warped_paper_lantern", () -> new VVDirectionalBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS).strength(0.5F).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CRIMSON_PAPER_LANTERN = registerBlock("crimson_paper_lantern", () -> new VVDirectionalBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS).strength(0.5F).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> MANGROVE_PAPER_LANTERN = registerBlock("mangrove_paper_lantern", () -> new VVDirectionalBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS).strength(0.5F).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> CHERRY_PAPER_LANTERN = registerBlock("cherry_paper_lantern", () -> new VVDirectionalBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).strength(0.5F).lightLevel((state) -> 15)));
    public static final RegistryObject<Block> BAMBOO_PAPER_LANTERN = registerBlock("bamboo_paper_lantern", () -> new VVDirectionalBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS).strength(0.5F).lightLevel((state) -> 15)));

    // carved sandstone
    public static final RegistryObject<Block> CARVED_SANDSTONE_CONCERNED = registerTooltipBlockNoLang("carved_sandstone_concerned", () -> new Block(CARVED_SANDSTONE_PROPERTIES));
    public static final RegistryObject<Block> CARVED_SANDSTONE_DISAPPOINTED = registerTooltipBlockNoLang("carved_sandstone_disappointed", () -> new Block(CARVED_SANDSTONE_PROPERTIES));
    public static final RegistryObject<Block> CARVED_SANDSTONE_FISHEYE = registerTooltipBlockNoLang("carved_sandstone_fisheye", () -> new Block(CARVED_SANDSTONE_PROPERTIES));
    public static final RegistryObject<Block> CARVED_SANDSTONE_GRIN = registerTooltipBlockNoLang("carved_sandstone_grin", () -> new Block(CARVED_SANDSTONE_PROPERTIES));
    public static final RegistryObject<Block> CARVED_SANDSTONE_JOYOUS = registerTooltipBlockNoLang("carved_sandstone_joyous", () -> new Block(CARVED_SANDSTONE_PROPERTIES));
    public static final RegistryObject<Block> CARVED_SANDSTONE_LAZYBONES = registerTooltipBlockNoLang("carved_sandstone_lazybones", () -> new Block(CARVED_SANDSTONE_PROPERTIES));
    public static final RegistryObject<Block> CARVED_SANDSTONE_NOSE = registerTooltipBlockNoLang("carved_sandstone_nose", () -> new Block(CARVED_SANDSTONE_PROPERTIES));
    public static final RegistryObject<Block> CARVED_SANDSTONE_OPEN = registerTooltipBlockNoLang("carved_sandstone_open", () -> new Block(CARVED_SANDSTONE_PROPERTIES));
    public static final RegistryObject<Block> CARVED_SANDSTONE_SPIRAL = registerTooltipBlockNoLang("carved_sandstone_spiral", () -> new Block(CARVED_SANDSTONE_PROPERTIES));

    public static final RegistryObject<Block> RED_CARVED_SANDSTONE_BOLD_AND_BRASH = registerTooltipBlockNoLang("red_carved_sandstone_bold_and_brash", () -> new Block(CARVED_SANDSTONE_PROPERTIES));
    public static final RegistryObject<Block> RED_CARVED_SANDSTONE_CLOSED = registerTooltipBlockNoLang("red_carved_sandstone_closed", () -> new Block(CARVED_SANDSTONE_PROPERTIES));
    public static final RegistryObject<Block> RED_CARVED_SANDSTONE_EXCITED = registerTooltipBlockNoLang("red_carved_sandstone_excited", () -> new Block(CARVED_SANDSTONE_PROPERTIES));
    public static final RegistryObject<Block> RED_CARVED_SANDSTONE_FROWN = registerTooltipBlockNoLang("red_carved_sandstone_frown", () -> new Block(CARVED_SANDSTONE_PROPERTIES));
    public static final RegistryObject<Block> RED_CARVED_SANDSTONE_HAPPY = registerTooltipBlockNoLang("red_carved_sandstone_happy", () -> new Block(CARVED_SANDSTONE_PROPERTIES));
    public static final RegistryObject<Block> RED_CARVED_SANDSTONE_LIPS = registerTooltipBlockNoLang("red_carved_sandstone_lips", () -> new Block(CARVED_SANDSTONE_PROPERTIES));
    public static final RegistryObject<Block> RED_CARVED_SANDSTONE_SAD = registerTooltipBlockNoLang("red_carved_sandstone_sad", () -> new Block(CARVED_SANDSTONE_PROPERTIES));
    public static final RegistryObject<Block> RED_CARVED_SANDSTONE_TOUCH = registerTooltipBlockNoLang("red_carved_sandstone_touch", () -> new Block(CARVED_SANDSTONE_PROPERTIES));
    public static final RegistryObject<Block> RED_CARVED_SANDSTONE_MESSAGE = registerTooltipBlockNoLang("red_carved_sandstone_message", () -> new Block(CARVED_SANDSTONE_PROPERTIES));

    // pineapple
    public static final RegistryObject<Block> GREEN_PINEAPPLE = registerBlock("green_pineapple", () -> new PineappleBlock(RipeningPineapple.RipenState.GREEN, PINEAPPLE_PROPERTIES));
    public static final RegistryObject<Block> GREEN_PINEAPPLE_SCALE_BLOCK = registerBlock("green_pineapple_scale_block", () -> new PineappleBlock(RipeningPineapple.RipenState.GREEN, PINEAPPLE_PROPERTIES));
    public static final RegistryObject<Block> SPOTTED_PINEAPPLE = registerBlock("spotted_pineapple", () -> new PineappleBlock(RipeningPineapple.RipenState.SPOTTED, PINEAPPLE_PROPERTIES));
    public static final RegistryObject<Block> SPOTTED_PINEAPPLE_SCALE_BLOCK = registerBlock("spotted_pineapple_scale_block", () -> new PineappleBlock(RipeningPineapple.RipenState.SPOTTED, PINEAPPLE_PROPERTIES));
    public static final RegistryObject<Block> PINEAPPLE = registerBlock("pineapple", () -> new PineappleBlock(RipeningPineapple.RipenState.YELLOW, PINEAPPLE_PROPERTIES));
    public static final RegistryObject<Block> PINEAPPLE_SCALE_BLOCK = registerBlock("pineapple_scale_block", () -> new PineappleBlock(RipeningPineapple.RipenState.YELLOW, PINEAPPLE_PROPERTIES));

    public static final RegistryObject<Block> SKINNED_PINEAPPLE = registerBlock("skinned_pineapple", () -> new VVDirectionalBlock(PINEAPPLE_FLESH_PROPERTIES));
    public static final RegistryObject<Block> PINEAPPLE_FLESH_BLOCK = registerBlock("pineapple_flesh_block", () -> new VVDirectionalBlock(PINEAPPLE_FLESH_PROPERTIES));

    public static final RegistryObject<Block> PINEAPPLE_CROWN = registerBlock("pineapple_crown", () -> new PineappleCrownBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).instabreak().sound(SoundType.SMALL_DRIPLEAF).pushReaction(PushReaction.DESTROY).noOcclusion().noCollission()));
    public static final RegistryObject<Block> POTTED_PINEAPPLE_CROWN = registerBlockWithoutItemNoLang("potted_pineapple_crown", () -> new FlowerPotBlock(VVBlocks.PINEAPPLE_CROWN.get(), registerFlowerPot()));

    public static final RegistryObject<Block> PINEAPPLE_STEM = registerBlockWithoutItemNoLang("pineapple_stem", () -> new PineappleStemBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.CROP).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> ATTACHED_PINEAPPLE_STEM = registerBlockWithoutItemNoLang("attached_pineapple_stem", () -> new AttachedPineappleStemBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.CROP).pushReaction(PushReaction.DESTROY)));

    // flowers
    public static final RegistryObject<Block> PINK_HIBISCUS = registerBlock("pink_hibiscus", () -> new VVFlowerBlock(() -> MobEffects.ABSORPTION, 8, VVBlockProperties.flower(MapColor.COLOR_PINK)));
    public static final RegistryObject<Block> POTTED_PINK_HIBISCUS = registerBlockWithoutItemNoLang("potted_pink_hibiscus", () -> new FlowerPotBlock(VVBlocks.PINK_HIBISCUS.get(), registerFlowerPot()));

    public static final RegistryObject<Block> PURPLE_HIBISCUS = registerBlock("purple_hibiscus", () -> new VVFlowerBlock(() -> MobEffects.ABSORPTION, 8, VVBlockProperties.flower(MapColor.COLOR_PURPLE)));
    public static final RegistryObject<Block> POTTED_PURPLE_HIBISCUS = registerBlockWithoutItemNoLang("potted_purple_hibiscus", () -> new FlowerPotBlock(VVBlocks.PURPLE_HIBISCUS.get(), registerFlowerPot()));

    public static final RegistryObject<Block> ORANGE_HIBISCUS = registerBlock("orange_hibiscus", () -> new VVFlowerBlock(() -> MobEffects.ABSORPTION, 8, VVBlockProperties.flower(MapColor.COLOR_ORANGE)));
    public static final RegistryObject<Block> POTTED_ORANGE_HIBISCUS = registerBlockWithoutItemNoLang("potted_orange_hibiscus", () -> new FlowerPotBlock(VVBlocks.ORANGE_HIBISCUS.get(), registerFlowerPot()));

    public static final RegistryObject<Block> RED_HIBISCUS = registerBlock("red_hibiscus", () -> new VVFlowerBlock(() -> MobEffects.ABSORPTION, 8, VVBlockProperties.flower(MapColor.COLOR_RED)));
    public static final RegistryObject<Block> POTTED_RED_HIBISCUS = registerBlockWithoutItemNoLang("potted_red_hibiscus", () -> new FlowerPotBlock(VVBlocks.RED_HIBISCUS.get(), registerFlowerPot()));

    public static final RegistryObject<Block> WHITE_HIBISCUS = registerBlock("white_hibiscus", () -> new VVFlowerBlock(() -> MobEffects.ABSORPTION, 8, VVBlockProperties.flower(MapColor.SNOW)));
    public static final RegistryObject<Block> POTTED_WHITE_HIBISCUS = registerBlockWithoutItemNoLang("potted_white_hibiscus", () -> new FlowerPotBlock(VVBlocks.WHITE_HIBISCUS.get(), registerFlowerPot()));

    public static final RegistryObject<Block> BLACK_CALLA = registerBlock("black_calla", () -> new VVFlowerBlock(() -> MobEffects.ABSORPTION, 8, VVBlockProperties.flower(MapColor.COLOR_BLACK)));
    public static final RegistryObject<Block> POTTED_BLACK_CALLA = registerBlockWithoutItemNoLang("potted_black_calla", () -> new FlowerPotBlock(VVBlocks.BLACK_CALLA.get(), registerFlowerPot()));

    public static final RegistryObject<Block> ORANGE_CALLA = registerBlock("orange_calla", () -> new VVFlowerBlock(() -> MobEffects.ABSORPTION, 8, VVBlockProperties.flower(MapColor.COLOR_ORANGE)));
    public static final RegistryObject<Block> POTTED_ORANGE_CALLA = registerBlockWithoutItemNoLang("potted_orange_calla", () -> new FlowerPotBlock(VVBlocks.ORANGE_CALLA.get(), registerFlowerPot()));

    public static final RegistryObject<Block> YELLOW_CALLA = registerBlock("yellow_calla", () -> new VVFlowerBlock(() -> MobEffects.ABSORPTION, 8, VVBlockProperties.flower(MapColor.COLOR_YELLOW)));
    public static final RegistryObject<Block> POTTED_YELLOW_CALLA = registerBlockWithoutItemNoLang("potted_yellow_calla", () -> new FlowerPotBlock(VVBlocks.YELLOW_CALLA.get(), registerFlowerPot()));

    public static final RegistryObject<Block> WHITE_CALLA = registerBlock("white_calla", () -> new VVFlowerBlock(() -> MobEffects.ABSORPTION, 8, VVBlockProperties.flower(MapColor.SNOW)));
    public static final RegistryObject<Block> POTTED_WHITE_CALLA = registerBlockWithoutItemNoLang("potted_white_calla", () -> new FlowerPotBlock(VVBlocks.WHITE_CALLA.get(), registerFlowerPot()));

    public static final RegistryObject<Block> ORANGE_ORCHID = registerBlock("orange_orchid", () -> new VVFlowerBlock(() -> MobEffects.ABSORPTION, 8, VVBlockProperties.flower(MapColor.COLOR_ORANGE)));
    public static final RegistryObject<Block> POTTED_ORANGE_ORCHID = registerBlockWithoutItemNoLang("potted_orange_orchid", () -> new FlowerPotBlock(VVBlocks.ORANGE_ORCHID.get(), registerFlowerPot()));

    public static final RegistryObject<Block> PINK_ORCHID = registerBlock("pink_orchid", () -> new VVFlowerBlock(() -> MobEffects.ABSORPTION, 8, VVBlockProperties.flower(MapColor.COLOR_PINK)));
    public static final RegistryObject<Block> POTTED_PINK_ORCHID = registerBlockWithoutItemNoLang("potted_pink_orchid", () -> new FlowerPotBlock(VVBlocks.PINK_ORCHID.get(), registerFlowerPot()));

    public static final RegistryObject<Block> WHITE_ORCHID = registerBlock("white_orchid", () -> new VVFlowerBlock(() -> MobEffects.ABSORPTION, 8, VVBlockProperties.flower(MapColor.SNOW)));
    public static final RegistryObject<Block> POTTED_WHITE_ORCHID = registerBlockWithoutItemNoLang("potted_white_orchid", () -> new FlowerPotBlock(VVBlocks.WHITE_ORCHID.get(), registerFlowerPot()));

    public static final RegistryObject<Block> YELLOW_ORCHID = registerBlock("yellow_orchid", () -> new VVFlowerBlock(() -> MobEffects.ABSORPTION, 8, VVBlockProperties.flower(MapColor.COLOR_YELLOW)));
    public static final RegistryObject<Block> POTTED_YELLOW_ORCHID = registerBlockWithoutItemNoLang("potted_yellow_orchid", () -> new FlowerPotBlock(VVBlocks.YELLOW_ORCHID.get(), registerFlowerPot()));

    public static final RegistryObject<Block> ORANGE_BROMELIAD = registerBlock("orange_bromeliad", () -> new BromeliadFlower(() -> MobEffects.ABSORPTION, 8, VVBlockProperties.flower(MapColor.COLOR_ORANGE)));
    public static final RegistryObject<Block> POTTED_ORANGE_BROMELIAD = registerBlockWithoutItemNoLang("potted_orange_bromelia", () -> new FlowerPotBlock(VVBlocks.ORANGE_BROMELIAD.get(), registerFlowerPot()));

    public static final RegistryObject<Block> PINK_BROMELIAD = registerBlock("pink_bromeliad", () -> new BromeliadFlower(() -> MobEffects.ABSORPTION, 8, VVBlockProperties.flower(MapColor.COLOR_PINK)));
    public static final RegistryObject<Block> POTTED_PINK_BROMELIAD = registerBlockWithoutItemNoLang("potted_pink_bromelia", () -> new FlowerPotBlock(VVBlocks.PINK_BROMELIAD.get(), registerFlowerPot()));

    public static final RegistryObject<Block> PURPLE_BROMELIAD = registerBlock("purple_bromeliad", () -> new BromeliadFlower(() -> MobEffects.ABSORPTION, 8, VVBlockProperties.flower(MapColor.COLOR_PURPLE)));
    public static final RegistryObject<Block> POTTED_PURPLE_BROMELIAD = registerBlockWithoutItemNoLang("potted_purple_bromelia", () -> new FlowerPotBlock(VVBlocks.PURPLE_BROMELIAD.get(), registerFlowerPot()));

    public static final RegistryObject<Block> YELLOW_BROMELIAD = registerBlock("yellow_bromeliad", () -> new BromeliadFlower(() -> MobEffects.ABSORPTION, 8, VVBlockProperties.flower(MapColor.COLOR_YELLOW)));
    public static final RegistryObject<Block> POTTED_YELLOW_BROMELIAD = registerBlockWithoutItemNoLang("potted_yellow_bromelia", () -> new FlowerPotBlock(VVBlocks.YELLOW_BROMELIAD.get(), registerFlowerPot()));

    public static final RegistryObject<Block> LACELEAF = registerBlock("laceleaf", () -> new VVFlowerBlock(() -> MobEffects.CONFUSION, 8, VVBlockProperties.flower(MapColor.COLOR_RED)));
    public static final RegistryObject<Block> POTTED_LACELEAF = registerBlockWithoutItemNoLang("potted_laceleaf", () -> new FlowerPotBlock(VVBlocks.LACELEAF.get(), registerFlowerPot()));

    public static final RegistryObject<Block> TORCH_GINGER = registerBlock("torch_ginger", () -> new VVFlowerBlock(() -> MobEffects.GLOWING, 8, VVBlockProperties.flower(MapColor.COLOR_MAGENTA)));
    public static final RegistryObject<Block> POTTED_TORCH_GINGER = registerBlockWithoutItemNoLang("potted_torch_ginger", () -> new FlowerPotBlock(VVBlocks.TORCH_GINGER.get(), registerFlowerPot()));

    public static final RegistryObject<Block> GREEN_FLOWERING_GRASS = registerBlock("green_flowering_grass", () -> new VVFlowerBlock(() -> MobEffects.POISON, 8, VVBlockProperties.flower(MapColor.PLANT)));
    public static final RegistryObject<Block> POTTED_GREEN_FLOWERING_GRASS = registerBlockWithoutItemNoLang("potted_green_flowering_grass", () -> new FlowerPotBlock(GREEN_FLOWERING_GRASS.get(), registerFlowerPot()));

    public static final RegistryObject<Block> PINK_FLOWERING_GRASS = registerBlock("pink_flowering_grass", () -> new VVFlowerBlock(() -> MobEffects.POISON, 8, VVBlockProperties.flower(MapColor.COLOR_PINK)));
    public static final RegistryObject<Block> POTTED_PINK_FLOWERING_GRASS = registerBlockWithoutItemNoLang("potted_pink_flowering_grass", () -> new FlowerPotBlock(PINK_FLOWERING_GRASS.get(), registerFlowerPot()));

    // tall plants
    public static final RegistryObject<Block> TALL_LACELEAF = registerBlock("tall_laceleaf", () -> new DoublePlantBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noOcclusion()));

    public static final RegistryObject<Block> BIRD_OF_PARADISE = registerBlock("bird_of_paradise", () -> new DoublePlantBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noOcclusion()));

    public static final RegistryObject<Block> CANNA_LILY = registerBlock("canna_lily", () -> new DoublePlantBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noOcclusion()));

    public static final RegistryObject<Block> TALL_PINK_HIBISCUS = registerBlock("tall_pink_hibiscus", () -> new DoublePlantBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noOcclusion()));
    public static final RegistryObject<Block> TALL_PURPLE_HIBISCUS = registerBlock("tall_purple_hibiscus", () -> new DoublePlantBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noOcclusion()));
    public static final RegistryObject<Block> TALL_ORANGE_HIBISCUS = registerBlock("tall_orange_hibiscus", () -> new DoublePlantBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noOcclusion()));
    public static final RegistryObject<Block> TALL_RED_HIBISCUS = registerBlock("tall_red_hibiscus", () -> new DoublePlantBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noOcclusion()));
    public static final RegistryObject<Block> TALL_WHITE_HIBISCUS = registerBlock("tall_white_hibiscus", () -> new DoublePlantBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noOcclusion()));

    // hibiscus carpets
    public static final RegistryObject<Block> ORANGE_HIBISCUS_CARPET = registerBlock("orange_hibiscus_carpet", () -> new PlantCarpetBlock(BlockBehaviour.Properties.copy(Blocks.GLOW_LICHEN).noOcclusion()));
    public static final RegistryObject<Block> PINK_HIBISCUS_CARPET = registerBlock("pink_hibiscus_carpet", () -> new PlantCarpetBlock(BlockBehaviour.Properties.copy(Blocks.GLOW_LICHEN).noOcclusion()));
    public static final RegistryObject<Block> PURPLE_HIBISCUS_CARPET = registerBlock("purple_hibiscus_carpet", () -> new PlantCarpetBlock(BlockBehaviour.Properties.copy(Blocks.GLOW_LICHEN).noOcclusion()));
    public static final RegistryObject<Block> RED_HIBISCUS_CARPET = registerBlock("red_hibiscus_carpet", () -> new PlantCarpetBlock(BlockBehaviour.Properties.copy(Blocks.GLOW_LICHEN).noOcclusion()));
    public static final RegistryObject<Block> WHITE_HIBISCUS_CARPET = registerBlock("white_hibiscus_carpet", () -> new PlantCarpetBlock(BlockBehaviour.Properties.copy(Blocks.GLOW_LICHEN).noOcclusion()));

    public static final RegistryObject<Block> AMPHORA_BLANK = registerAmphora("amphora_blank",
            () -> new AmphoraBlock(BlockBehaviour.Properties.copy(Blocks.DECORATED_POT).noOcclusion().sound(SoundType.DECORATED_POT)));
    public static final RegistryObject<Block> AMPHORA_MEDUSA = registerAmphora("amphora_medusa",
            () -> new AmphoraBlock(BlockBehaviour.Properties.copy(Blocks.DECORATED_POT).noOcclusion().sound(SoundType.DECORATED_POT)));
    public static final RegistryObject<Block> AMPHORA_CHIMERA = registerAmphora("amphora_chimera",
            () -> new AmphoraBlock(BlockBehaviour.Properties.copy(Blocks.DECORATED_POT).noOcclusion().sound(SoundType.DECORATED_POT)));
    public static final RegistryObject<Block> AMPHORA_SIREN = registerAmphora("amphora_siren",
            () -> new AmphoraBlock(BlockBehaviour.Properties.copy(Blocks.DECORATED_POT).noOcclusion().sound(SoundType.DECORATED_POT)));
    public static final RegistryObject<Block> AMPHORA_SERPENT = registerAmphora("amphora_serpent",
            () -> new AmphoraBlock(BlockBehaviour.Properties.copy(Blocks.DECORATED_POT).noOcclusion().sound(SoundType.DECORATED_POT)));
    public static final RegistryObject<Block> AMPHORA_RIDGES = registerAmphora("amphora_ridges",
            () -> new AmphoraBlock(BlockBehaviour.Properties.copy(Blocks.DECORATED_POT).noOcclusion().sound(SoundType.DECORATED_POT)));
    public static final RegistryObject<Block> AMPHORA_STRIPED = registerAmphora("amphora_striped",
            () -> new AmphoraBlock(BlockBehaviour.Properties.copy(Blocks.DECORATED_POT).noOcclusion().sound(SoundType.DECORATED_POT)));
    public static final RegistryObject<Block> AMPHORA_TIDES = registerAmphora("amphora_tides",
            () -> new AmphoraBlock(BlockBehaviour.Properties.copy(Blocks.DECORATED_POT).noOcclusion().sound(SoundType.DECORATED_POT)));
    public static final RegistryObject<Block> AMPHORA_WAVY = registerAmphora("amphora_wavy",
            () -> new AmphoraBlock(BlockBehaviour.Properties.copy(Blocks.DECORATED_POT).noOcclusion().sound(SoundType.DECORATED_POT)));
    public static final RegistryObject<Block> AMPHORA_SEGMENTED = registerAmphora("amphora_segmented",
            () -> new AmphoraBlock(BlockBehaviour.Properties.copy(Blocks.DECORATED_POT).noOcclusion().sound(SoundType.DECORATED_POT)));
    public static final RegistryObject<Block> AMPHORA_ZIGZAG = registerAmphora("amphora_zigzag",
            () -> new AmphoraBlock(BlockBehaviour.Properties.copy(Blocks.DECORATED_POT).noOcclusion().sound(SoundType.DECORATED_POT)));
    public static final RegistryObject<Block> AMPHORA_SPROUTS = registerAmphora("amphora_sprouts",
            () -> new AmphoraBlock(BlockBehaviour.Properties.copy(Blocks.DECORATED_POT).noOcclusion().sound(SoundType.DECORATED_POT)));
    public static final RegistryObject<Block> AMPHORA_PEGASUS = registerAmphora("amphora_pegasus",
            () -> new AmphoraBlock(BlockBehaviour.Properties.copy(Blocks.DECORATED_POT).noOcclusion().sound(SoundType.DECORATED_POT)));
    public static final RegistryObject<Block> AMPHORA_HARPY = registerAmphora("amphora_harpy",
            () -> new AmphoraBlock(BlockBehaviour.Properties.copy(Blocks.DECORATED_POT).noOcclusion().sound(SoundType.DECORATED_POT)));

    public static final RegistryObject<Block> CHISELED_CALCITE = registerBlock("chiseled_calcite", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CALCITE)));
    public static final RegistryObject<Block> CRACKED_CALCITE_BRICKS = registerBlock("cracked_calcite_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CALCITE)));
    public static final RegistryObject<Block> CRACKED_CALCITE_TILES = registerBlock("cracked_calcite_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CALCITE)));
    public static final RegistryObject<Block> CALCITE_PILLAR = registerBlock("calcite_pillar", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CALCITE)));

    public static final RegistryObject<Block> DISPLAY_CASE = registerBlock("display_case", () -> new DisplayCaseBlock(BlockBehaviour.Properties.of().strength(2.0F, 6.0F).requiresCorrectToolForDrops().noOcclusion().sound(SoundType.GLASS)));

    public static final Pair<RegistryObject<Block>, RegistryObject<Block>> GOLDEN_HEAD = registerSkullTrinket("golden_head", VVSkullBlock.Types.GOLDEN_HEAD);

    // fruit trees
    public static final RegistryObject<Block> GRAPEFRUIT_SAPLING = registerBlock("grapefruit_sapling", () -> new SaplingBlock(new GrapefruitTreeGrower(), VVBlockProperties.sapling(MapColor.PLANT, SoundType.CHERRY_SAPLING)));
    public static final RegistryObject<Block> POTTED_GRAPEFRUIT_SAPLING = registerBlockWithoutItemNoLang("potted_grapefruit_sapling", () -> new FlowerPotBlock(GRAPEFRUIT_SAPLING.get(), registerFlowerPot()));

    public static final RegistryObject<Block> GRAPEFRUIT_LEAVES = registerBlock("grapefruit_leaves", () -> new GrowingLeavesBlock(VVBlockProperties.leaves(MapColor.PLANT, SoundType.AZALEA_LEAVES), FruitLeaves.FruitState.FRUITLESS));
    public static final RegistryObject<Block> FLOWERING_GRAPEFRUIT_LEAVES = registerBlock("flowering_grapefruit_leaves", () -> new GrowingLeavesBlock(VVBlockProperties.leaves(MapColor.PLANT, SoundType.AZALEA_LEAVES), FruitLeaves.FruitState.FLOWERING));
    public static final RegistryObject<Block> FRUITFUL_GRAPEFRUIT_LEAVES = registerBlock("fruitful_grapefruit_leaves", () -> new FruitfulLeavesBlock(VVBlockProperties.leaves(MapColor.PLANT, SoundType.AZALEA_LEAVES), VVItems.GRAPEFRUIT, VVBlocks.GRAPEFRUIT_LEAVES));

    public static final RegistryObject<Block> LEMON_SAPLING = registerBlock("lemon_sapling", () -> new SaplingBlock(new LemonTreeGrower(), VVBlockProperties.sapling(MapColor.PLANT, SoundType.CHERRY_SAPLING)));
    public static final RegistryObject<Block> POTTED_LEMON_SAPLING = registerBlockWithoutItemNoLang("potted_lemon_sapling", () -> new FlowerPotBlock(LEMON_SAPLING.get(), registerFlowerPot()));

    public static final RegistryObject<Block> LEMON_LEAVES = registerBlock("lemon_leaves", () -> new GrowingLeavesBlock(VVBlockProperties.leaves(MapColor.PLANT, SoundType.AZALEA_LEAVES), FruitLeaves.FruitState.FRUITLESS));
    public static final RegistryObject<Block> FLOWERING_LEMON_LEAVES = registerBlock("flowering_lemon_leaves", () -> new GrowingLeavesBlock(VVBlockProperties.leaves(MapColor.PLANT, SoundType.AZALEA_LEAVES), FruitLeaves.FruitState.FLOWERING));
    public static final RegistryObject<Block> FRUITFUL_LEMON_LEAVES = registerBlock("fruitful_lemon_leaves", () -> new FruitfulLeavesBlock(VVBlockProperties.leaves(MapColor.PLANT, SoundType.AZALEA_LEAVES), VVItems.LEMON, VVBlocks.LEMON_LEAVES));

    public static final RegistryObject<Block> LIME_SAPLING = registerBlock("lime_sapling", () -> new SaplingBlock(new LimeTreeGrower(), VVBlockProperties.sapling(MapColor.PLANT, SoundType.CHERRY_SAPLING)));
    public static final RegistryObject<Block> POTTED_LIME_SAPLING = registerBlockWithoutItemNoLang("potted_lime_sapling", () -> new FlowerPotBlock(LIME_SAPLING.get(), registerFlowerPot()));

    public static final RegistryObject<Block> LIME_LEAVES = registerBlock("lime_leaves", () -> new GrowingLeavesBlock(VVBlockProperties.leaves(MapColor.PLANT, SoundType.AZALEA_LEAVES), FruitLeaves.FruitState.FRUITLESS));
    public static final RegistryObject<Block> FLOWERING_LIME_LEAVES = registerBlock("flowering_lime_leaves", () -> new GrowingLeavesBlock(VVBlockProperties.leaves(MapColor.PLANT, SoundType.AZALEA_LEAVES), FruitLeaves.FruitState.FLOWERING));
    public static final RegistryObject<Block> FRUITFUL_LIME_LEAVES = registerBlock("fruitful_lime_leaves", () -> new FruitfulLeavesBlock(VVBlockProperties.leaves(MapColor.PLANT, SoundType.AZALEA_LEAVES), VVItems.LIME, VVBlocks.LIME_LEAVES));

    public static final RegistryObject<Block> MANGO_SAPLING = registerBlock("mango_sapling", () -> new SaplingBlock(new MangoTreeGrower(), VVBlockProperties.sapling(MapColor.PLANT, SoundType.CHERRY_SAPLING)));
    public static final RegistryObject<Block> POTTED_MANGO_SAPLING = registerBlockWithoutItemNoLang("potted_mango_sapling", () -> new FlowerPotBlock(MANGO_SAPLING.get(), registerFlowerPot()));

    public static final RegistryObject<Block> MANGO_LEAVES = registerBlock("mango_leaves", () -> new GrowingLeavesBlock(VVBlockProperties.leaves(MapColor.PLANT, SoundType.AZALEA_LEAVES), FruitLeaves.FruitState.FRUITLESS));
    public static final RegistryObject<Block> FLOWERING_MANGO_LEAVES = registerBlock("flowering_mango_leaves", () -> new GrowingLeavesBlock(VVBlockProperties.leaves(MapColor.PLANT, SoundType.AZALEA_LEAVES), FruitLeaves.FruitState.FLOWERING));
    public static final RegistryObject<Block> FRUITFUL_MANGO_LEAVES = registerBlock("fruitful_mango_leaves", () -> new FruitfulLeavesBlock(VVBlockProperties.leaves(MapColor.PLANT, SoundType.AZALEA_LEAVES), VVItems.MANGO, VVBlocks.MANGO_LEAVES));

    public static final RegistryObject<Block> ORANGE_SAPLING = registerBlock("orange_sapling", () -> new SaplingBlock(new OrangeTreeGrower(), VVBlockProperties.sapling(MapColor.PLANT, SoundType.CHERRY_SAPLING)));
    public static final RegistryObject<Block> POTTED_ORANGE_SAPLING = registerBlockWithoutItemNoLang("potted_orange_sapling", () -> new FlowerPotBlock(ORANGE_SAPLING.get(), registerFlowerPot()));

    public static final RegistryObject<Block> ORANGE_LEAVES = registerBlock("orange_leaves", () -> new GrowingLeavesBlock(VVBlockProperties.leaves(MapColor.PLANT, SoundType.AZALEA_LEAVES), FruitLeaves.FruitState.FRUITLESS));
    public static final RegistryObject<Block> FLOWERING_ORANGE_LEAVES = registerBlock("flowering_orange_leaves", () -> new GrowingLeavesBlock(VVBlockProperties.leaves(MapColor.PLANT, SoundType.AZALEA_LEAVES), FruitLeaves.FruitState.FLOWERING));
    public static final RegistryObject<Block> FRUITFUL_ORANGE_LEAVES = registerBlock("fruitful_orange_leaves", () -> new FruitfulLeavesBlock(VVBlockProperties.leaves(MapColor.PLANT, SoundType.AZALEA_LEAVES), VVItems.ORANGE, VVBlocks.ORANGE_LEAVES));

    private static <B extends Block> RegistryObject<B> registerBlock(String name, Supplier<? extends B> supplier) {
        RegistryObject<B> block = BLOCKS.register(name, supplier);
        VVItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
        AUTO_TRANSLATE.add(block);
        return block;
    }

    private static <B extends Block> RegistryObject<B> registerBlockNoLang(String name, Supplier<? extends B> supplier) {
        RegistryObject<B> block = BLOCKS.register(name, supplier);
        VVItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
        return block;
    }

    private static <B extends Block> RegistryObject<B> registerBlockWithoutItemNoLang(String name, Supplier<B> block) {
        return BLOCKS.register(name, block);
    }

    public static <B extends Block> RegistryObject<B> registerTooltipBlockNoLang(String name, Supplier<? extends B> supplier) {
        RegistryObject<B> block = BLOCKS.register(name, supplier);
        VVItems.ITEMS.register(name, () -> new NondescriptTooltipBlockItem(block.get(), new Item.Properties()));
        return block;
    }

    public static Pair<RegistryObject<Block>, RegistryObject<Block>> registerSkullTrinket(String name, VVSkullBlock.Types type) {
        RegistryObject<Block> skull = registerBlockWithoutItemNoLang(name, () -> new VVSkullBlock(type, VVBlockProperties.SKULL));
        RegistryObject<Block> wallSkull = registerBlockWithoutItemNoLang("wall_" + name, () -> new VVWallSkullBlock(type, VVBlockProperties.SKULL.lootFrom(skull)));
        AUTO_TRANSLATE.add(skull);
        return Pair.of(skull, wallSkull);
    }


    public static <B extends Block> RegistryObject<B> registerAmphora(String name, Supplier<? extends B> supplier) {
        RegistryObject<B> block = BLOCKS.register(name, supplier);
        VVItems.ITEMS.register(name, () -> new AmphoraBlockItem(block.get(), new Item.Properties()));
        return block;
    }

    public static BlockBehaviour.Properties registerFlowerPot(FeatureFlag... featureFlags) {
        BlockBehaviour.Properties properties = BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY);
        if (featureFlags.length > 0) {
            properties = properties.requiredFeatures(featureFlags);
        }
        return properties;
    }
}
