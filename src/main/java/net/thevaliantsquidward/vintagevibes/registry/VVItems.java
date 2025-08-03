package net.thevaliantsquidward.vintagevibes.registry;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thevaliantsquidward.vintagevibes.VintageVibes;
import net.thevaliantsquidward.vintagevibes.items.ButterflyBottleItem;
import net.thevaliantsquidward.vintagevibes.items.MaskItem;
import net.thevaliantsquidward.vintagevibes.items.TrinketItem;
import net.thevaliantsquidward.vintagevibes.registry.enums.VVArmorMaterials;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class VVItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, VintageVibes.MOD_ID);
    public static List<RegistryObject<? extends Item>> AUTO_TRANSLATE = new ArrayList<>();

    // gems
    public static final RegistryObject<Item> AMBER = registerItem("amber", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AQUAMARINE = registerItem("aquamarine", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ENSTATITE = registerItem("enstatite", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GARNET = registerItem("garnet", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JADE = registerItem("jade", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KUNZITE = registerItem("kunzite", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LARIMAR = registerItem("larimar", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MILKY_QUARTZ = registerItem("milky_quartz", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MOONSTONE = registerItem("moonstone", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ONYX = registerItem("onyx", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PERIDOT = registerItem("peridot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROSE_QUARTZ = registerItem("rose_quartz", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE = registerItem("sapphire", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SMOKY_QUARTZ = registerItem("smoky_quartz", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TAAFFEITE = registerItem("taaffeite", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TOPAZ = registerItem("topaz", () -> new Item(new Item.Properties()));

    // pineapple
    public static final RegistryObject<Item> PINEAPPLE_SLICE = registerItem("pineapple_slice", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.3F).build())));
    public static final RegistryObject<Item> PINEAPPLE_SEEDS = registerItem("pineapple_seeds", () -> new ItemNameBlockItem(VVBlocks.PINEAPPLE_STEM.get(), new Item.Properties()) {
        @Override
        public void registerBlocks(Map<Block, Item> blockItemMap, Item item) {
            super.registerBlocks(blockItemMap, item);
            blockItemMap.put(VVBlocks.PINEAPPLE_STEM.get(), item);
        }
        @Override
        public void removeFromBlockToItemMap(Map<Block, Item> blockItemMap, Item item) {
            super.removeFromBlockToItemMap(blockItemMap, item);
            blockItemMap.remove(VVBlocks.PINEAPPLE_STEM.get());
        }
    });

    // discs
    public static final RegistryObject<Item> VIBE_DISC = registerItemNoLang("vibe_disc", () -> new RecordItem(6, VVSoundEvents.VIBE_DISC, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1360));

    // evil beasts of evil origins
    public static final RegistryObject<Item> BUTTERFLY_SPAWN_EGG = registerSpawnEggItem("butterfly", VVEntities.BUTTERFLY, 0xb8510d, 0x270d07);
    public static final RegistryObject<Item> BUTTERFLY_BOTTLE = registerItem("butterfly_bottle", () -> new ButterflyBottleItem(VVEntities.BUTTERFLY::get, Items.GLASS_BOTTLE, false, new Item.Properties().stacksTo(1)));

    //trinkets
    public static final RegistryObject<Item> AMBERIZED_CRITTER = registerItem("amberized_critter", () -> new TrinketItem(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> ANTIQUE_KEY = registerItem("antique_key", () -> new TrinketItem(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> BEJEWELED_BROOCH = registerItem("bejeweled_brooch", () -> new TrinketItem(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> CHIPPED_RING = registerItem("chipped_ring", () -> new TrinketItem(new Item.Properties()));
    public static final RegistryObject<Item> CITRINE_DIAMOND = registerItem("citrine_diamond", () -> new TrinketItem(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> COPPER_APPLE = registerItem("copper_apple", () -> new TrinketItem(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> CORAL_BEADS = registerItem("coral_beads", () -> new TrinketItem(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> CROWNED_INSECT = registerItem("crowned_insect", () -> new TrinketItem(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> ENCHANTED_TOME = registerItem("enchanted_tome", () -> new TrinketItem(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> GLIMMERING_SKULL = registerItem("glimmering_skull", () -> new TrinketItem(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> GOLDEN_HEAD = registerItem("golden_head", () -> new TrinketItem(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> LUXURIOUS_BOWL = registerItem("luxurious_bowl", () -> new TrinketItem(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> MERCHANTS_AMULET = registerItemNoLang("merchants_amulet", () -> new TrinketItem(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> OBSIDIAN_BLADE = registerItem("obsidian_blade", () -> new TrinketItem(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> OBSIDIAN_TOOL = registerItem("obsidian_tool", () -> new TrinketItem(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> OCEANIC_PENDANT = registerItem("oceanic_pendant", () -> new TrinketItem(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> ONYX_FIGURINE = registerItem("onyx_figurine", () -> new TrinketItem(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> RUSTED_SPEARHEAD = registerItem("rusted_spearhead", () -> new TrinketItem(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> TONGUE_STONE = registerItem("tongue_stone", () -> new TrinketItem(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> SHATTERED_DAGGER = registerItem("shattered_dagger", () -> new TrinketItem(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> SIRENS_PEARL = registerItemNoLang("sirens_pearl", () -> new TrinketItem(new Item.Properties().rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> CELESTIAL_MASK = registerItem("celestial_mask", ()-> new MaskItem(VVArmorMaterials.MASK, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> DEITY_MASK = registerItem("deity_mask", ()-> new MaskItem(VVArmorMaterials.MASK, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> FESTIVE_MASK = registerItem("festive_mask", ()-> new MaskItem(VVArmorMaterials.MASK, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> FROND_MASK = registerItem("frond_mask", ()-> new MaskItem(VVArmorMaterials.MASK, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> MONSOON_MASK = registerItem("monsoon_mask", ()-> new MaskItem(VVArmorMaterials.MASK, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> PETRIFIED_MASK = registerItem("petrified_mask", ()-> new MaskItem(VVArmorMaterials.MASK, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> SPIRIT_MASK = registerItem("spirit_mask", ()-> new MaskItem(VVArmorMaterials.MASK, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> SUNRISE_MASK = registerItem("sunrise_mask", ()-> new MaskItem(VVArmorMaterials.MASK, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> TIDAL_MASK = registerItem("tidal_mask", ()-> new MaskItem(VVArmorMaterials.MASK, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> VOLCANIC_MASK = registerItem("volcanic_mask", ()-> new MaskItem(VVArmorMaterials.MASK, ArmorItem.Type.HELMET, new Item.Properties()));

    private static <I extends Item> RegistryObject<I> registerItem(String name, Supplier<? extends I> supplier) {
        RegistryObject<I> item = ITEMS.register(name, supplier);
        AUTO_TRANSLATE.add(item);
        return item;
    }

    private static <I extends Item> RegistryObject<I> registerItemNoLang(String name, Supplier<? extends I> supplier) {
        RegistryObject<I> item = ITEMS.register(name, supplier);
        return item;
    }

    private static RegistryObject<Item> registerSpawnEggItem(String name, RegistryObject type, int baseColor, int spotColor) {
        return registerItem(name + "_spawn_egg", () -> new ForgeSpawnEggItem(type, baseColor, spotColor, new Item.Properties()));
    }
}