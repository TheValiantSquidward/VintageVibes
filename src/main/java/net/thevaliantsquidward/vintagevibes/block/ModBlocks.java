package net.thevaliantsquidward.vintagevibes.block;

import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thevaliantsquidward.vintagevibes.VintageVibes;
import net.thevaliantsquidward.vintagevibes.block.custom.CarvedSandstoneBlockItem;
import net.thevaliantsquidward.vintagevibes.block.custom.PlantCarpetBlock;
import net.thevaliantsquidward.vintagevibes.item.ModItems;

import java.util.function.Function;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            VintageVibes.MOD_ID);

    //gem blocks
    public static final RegistryObject<Block> AMBER_BLOCK = registerBlock("amber_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> AQUAMARINE_BLOCK = registerBlock("aquamarine_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ENSTATITE_BLOCK = registerBlock("enstatite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GARNET_BLOCK = registerBlock("garnet_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> JADE_BLOCK = registerBlock("jade_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> KUNZITE_BLOCK = registerBlock("kunzite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LARIMAR_BLOCK = registerBlock("larimar_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MILKY_QUARTZ_BLOCK = registerBlock("milky_quartz_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOONSTONE_BLOCK = registerBlock("moonstone_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ONYX_BLOCK = registerBlock("onyx_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PERIDOT_BLOCK = registerBlock("peridot_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ROSE_QUARTZ_BLOCK = registerBlock("rose_quartz_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SMOKY_QUARTZ_BLOCK = registerBlock("smoky_quartz_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TAAFFEITE_BLOCK = registerBlock("taaffeite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TOPAZ_BLOCK = registerBlock("topaz_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).requiresCorrectToolForDrops()));

    //rough gem blocks
    public static final RegistryObject<Block> ROUGH_AMBER_BLOCK = registerBlock("rough_amber_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ROUGH_AQUAMARINE_BLOCK = registerBlock("rough_aquamarine_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ROUGH_ENSTATITE_BLOCK = registerBlock("rough_enstatite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ROUGH_GARNET_BLOCK = registerBlock("rough_garnet_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ROUGH_JADE_BLOCK = registerBlock("rough_jade_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ROUGH_KUNZITE_BLOCK = registerBlock("rough_kunzite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ROUGH_LARIMAR_BLOCK = registerBlock("rough_larimar_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ROUGH_MILKY_QUARTZ_BLOCK = registerBlock("rough_milky_quartz_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ROUGH_MOONSTONE_BLOCK = registerBlock("rough_moonstone_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ROUGH_ONYX_BLOCK = registerBlock("rough_onyx_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ROUGH_PERIDOT_BLOCK = registerBlock("rough_peridot_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ROUGH_ROSE_QUARTZ_BLOCK = registerBlock("rough_rose_quartz_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ROUGH_SAPPHIRE_BLOCK = registerBlock("rough_sapphire_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ROUGH_SMOKY_QUARTZ_BLOCK = registerBlock("rough_smoky_quartz_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ROUGH_TAAFFEITE_BLOCK = registerBlock("rough_taaffeite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ROUGH_TOPAZ_BLOCK = registerBlock("rough_topaz_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).requiresCorrectToolForDrops()));

    //gem tiles
    public static final RegistryObject<Block> AQUAMARINE_TILES = registerBlock("aquamarine_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> AMBER_TILES = registerBlock("amber_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ENSTATITE_TILES = registerBlock("enstatite_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GARNET_TILES = registerBlock("garnet_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> JADE_TILES = registerBlock("jade_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> KUNZITE_TILES = registerBlock("kunzite_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LARIMAR_TILES = registerBlock("larimar_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MILKY_QUARTZ_TILES = registerBlock("milky_quartz_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOONSTONE_TILES = registerBlock("moonstone_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ONYX_TILES = registerBlock("onyx_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PERIDOT_TILES = registerBlock("peridot_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ROSE_QUARTZ_TILES = registerBlock("rose_quartz_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SAPPHIRE_TILES = registerBlock("sapphire_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SMOKY_QUARTZ_TILES = registerBlock("smoky_quartz_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TAAFFEITE_TILES = registerBlock("taaffeite_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TOPAZ_TILES = registerBlock("topaz_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> PINEAPPLE = registerBlock("pineapple",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MELON)));

    public static final RegistryObject<Block> CARVED_SANDSTONE_CONCERNED = registerSandstoneBlock("carved_sandstone_concerned",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_SANDSTONE).strength(0.8F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CARVED_SANDSTONE_DISAPPOINTED = registerSandstoneBlock("carved_sandstone_disappointed",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_SANDSTONE).strength(0.8F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CARVED_SANDSTONE_FISHEYE = registerSandstoneBlock("carved_sandstone_fisheye",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_SANDSTONE).strength(0.8F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CARVED_SANDSTONE_GRIN = registerSandstoneBlock("carved_sandstone_grin",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_SANDSTONE).strength(0.8F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CARVED_SANDSTONE_JOYOUS = registerSandstoneBlock("carved_sandstone_joyous",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_SANDSTONE).strength(0.8F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CARVED_SANDSTONE_LAZYBONES = registerSandstoneBlock("carved_sandstone_lazybones",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_SANDSTONE).strength(0.8F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CARVED_SANDSTONE_NOSE = registerSandstoneBlock("carved_sandstone_nose",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_SANDSTONE).strength(0.8F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CARVED_SANDSTONE_OPEN = registerSandstoneBlock("carved_sandstone_open",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_SANDSTONE).strength(0.8F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RED_CARVED_SANDSTONE_BOLD_AND_BRASH = registerSandstoneBlock("red_carved_sandstone_bold_and_brash",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_SANDSTONE).strength(0.8F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RED_CARVED_SANDSTONE_CLOSED = registerSandstoneBlock("red_carved_sandstone_closed",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_SANDSTONE).strength(0.8F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RED_CARVED_SANDSTONE_EXCITED = registerSandstoneBlock("red_carved_sandstone_excited",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_SANDSTONE).strength(0.8F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RED_CARVED_SANDSTONE_FROWN = registerSandstoneBlock("red_carved_sandstone_frown",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_SANDSTONE).strength(0.8F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RED_CARVED_SANDSTONE_HAPPY = registerSandstoneBlock("red_carved_sandstone_happy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_SANDSTONE).strength(0.8F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RED_CARVED_SANDSTONE_LIPS = registerSandstoneBlock("red_carved_sandstone_lips",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_SANDSTONE).strength(0.8F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RED_CARVED_SANDSTONE_SAD = registerSandstoneBlock("red_carved_sandstone_sad",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_SANDSTONE).strength(0.8F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RED_CARVED_SANDSTONE_TOUCH = registerSandstoneBlock("red_carved_sandstone_touch",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_SANDSTONE).strength(0.8F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> PINK_HIBISCUS = registerBlock("pink_hibiscus",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 8, BlockBehaviour.Properties.copy(Blocks.DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_PINK_HIBISCUS = registerBlockWithoutBlockItem("potted_pink_hibiscus",
            () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, ModBlocks.PINK_HIBISCUS, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));

    public static final RegistryObject<Block> ORANGE_HIBISCUS = registerBlock("orange_hibiscus",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 8, BlockBehaviour.Properties.copy(Blocks.DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_ORANGE_HIBISCUS = registerBlockWithoutBlockItem("potted_orange_hibiscus",
            () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, ModBlocks.ORANGE_HIBISCUS, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));

    public static final RegistryObject<Block> PURPLE_HIBISCUS = registerBlock("purple_hibiscus",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 8, BlockBehaviour.Properties.copy(Blocks.DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_PURPLE_HIBISCUS = registerBlockWithoutBlockItem("potted_purple_hibiscus",
            () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, ModBlocks.PURPLE_HIBISCUS, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));

    public static final RegistryObject<Block> WHITE_HIBISCUS = registerBlock("white_hibiscus",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 8, BlockBehaviour.Properties.copy(Blocks.DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_WHITE_HIBISCUS = registerBlockWithoutBlockItem("potted_white_hibiscus",
            () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, ModBlocks.WHITE_HIBISCUS, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));

    public static final RegistryObject<Block> BLACK_CALLA = registerBlock("black_calla",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 8, BlockBehaviour.Properties.copy(Blocks.DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_BLACK_CALLA = registerBlockWithoutBlockItem("potted_black_calla",
            () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, ModBlocks.BLACK_CALLA, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));

    public static final RegistryObject<Block> ORANGE_CALLA = registerBlock("orange_calla",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 8, BlockBehaviour.Properties.copy(Blocks.DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_ORANGE_CALLA = registerBlockWithoutBlockItem("potted_orange_calla",
            () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, ModBlocks.ORANGE_CALLA, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));

    public static final RegistryObject<Block> YELLOW_CALLA = registerBlock("yellow_calla",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 8, BlockBehaviour.Properties.copy(Blocks.DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_YELLOW_CALLA = registerBlockWithoutBlockItem("potted_yellow_calla",
            () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, ModBlocks.YELLOW_CALLA, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> WHITE_CALLA = registerBlock("white_calla",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 8, BlockBehaviour.Properties.copy(Blocks.DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_WHITE_CALLA = registerBlockWithoutBlockItem("potted_white_calla",
            () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, ModBlocks.WHITE_CALLA, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));

    public static final RegistryObject<Block> BIRD_OF_PARADISE = registerBlock("bird_of_paradise",
            () -> new DoublePlantBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noOcclusion()));
    public static final RegistryObject<Block> CANNA_LILY = registerBlock("canna_lily",
            () -> new DoublePlantBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noOcclusion()));


    public static final RegistryObject<Block> ORANGE_HIBISCUS_CARPET = registerBlock("orange_hibiscus_carpet",
            () -> new PlantCarpetBlock(BlockBehaviour.Properties.copy(Blocks.GLOW_LICHEN).noOcclusion()));
    public static final RegistryObject<Block> PINK_HIBISCUS_CARPET = registerBlock("pink_hibiscus_carpet",
            () -> new PlantCarpetBlock(BlockBehaviour.Properties.copy(Blocks.GLOW_LICHEN).noOcclusion()));
    public static final RegistryObject<Block> PURPLE_HIBISCUS_CARPET = registerBlock("purple_hibiscus_carpet",
            () -> new PlantCarpetBlock(BlockBehaviour.Properties.copy(Blocks.GLOW_LICHEN).noOcclusion()));
    public static final RegistryObject<Block> WHITE_HIBISCUS_CARPET = registerBlock("white_hibiscus_carpet",
            () -> new PlantCarpetBlock(BlockBehaviour.Properties.copy(Blocks.GLOW_LICHEN).noOcclusion()));


    public static final RegistryObject<Block> ORANGE_BROMELIA = registerBlock("orange_bromelia",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 8, BlockBehaviour.Properties.copy(Blocks.DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_ORANGE_BROMELIA = registerBlockWithoutBlockItem("potted_orange_bromelia",
            () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, ModBlocks.ORANGE_BROMELIA, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));

    public static final RegistryObject<Block> PINK_BROMELIA = registerBlock("pink_bromelia",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 8, BlockBehaviour.Properties.copy(Blocks.DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_PINK_BROMELIA = registerBlockWithoutBlockItem("potted_pink_bromelia",
            () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, ModBlocks.PINK_BROMELIA, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));

    public static final RegistryObject<Block> YELLOW_BROMELIA = registerBlock("yellow_bromelia",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 8, BlockBehaviour.Properties.copy(Blocks.DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_YELLOW_BROMELIA = registerBlockWithoutBlockItem("potted_yellow_bromelia",
            () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, ModBlocks.YELLOW_BROMELIA, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));


    public static final RegistryObject<Block> LACELEAF = registerBlock("laceleaf",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 8, BlockBehaviour.Properties.copy(Blocks.DANDELION).noOcclusion()));
    public static final RegistryObject<Block> POTTED_LACELEAF = registerBlockWithoutBlockItem("potted_laceleaf",
            () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, ModBlocks.LACELEAF, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));
    public static final RegistryObject<Block> TALL_LACELEAF = registerBlock("tall_laceleaf",
            () -> new DoublePlantBlock(BlockBehaviour.Properties.copy(Blocks.ROSE_BUSH).noOcclusion()));


    public static <B extends Block> RegistryObject<B> registerBlock(String name, Supplier<? extends B> supplier) {
        RegistryObject<B> block = BLOCKS.register(name, supplier);
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
        return block;
    }

    public static <B extends Block> RegistryObject<B> registerSandstoneBlock(String name, Supplier<? extends B> supplier) {
        RegistryObject<B> block = BLOCKS.register(name, supplier);
        ModItems.ITEMS.register(name, () -> new CarvedSandstoneBlockItem(block.get(), new Item.Properties()));
        return block;
    }

    private static <T extends Block> Supplier<T> create(String key, Supplier<T> block, Function<Supplier<T>, Item> item) {
        Supplier<T> entry = create(key, block);
        ModItems.ITEMS.register(key, () -> item.apply(entry));
        return entry;
    }

    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    private static <T extends Block> Supplier<T> create(String key, Supplier<T> block, CreativeModeTab tab) {
        return create(key, block, entry -> new BlockItem(entry.get(), new Item.Properties()));
    }



    private static <T extends Block> Supplier<T> create(String key, Supplier<T> block) {
        return BLOCKS.register(key, block);
    }
}
