package net.thevaliantsquidward.vintagevibes.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thevaliantsquidward.vintagevibes.VintageVibes;
import net.thevaliantsquidward.vintagevibes.entity.VVEntities;
import net.thevaliantsquidward.vintagevibes.sound.VVSounds;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class VVItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, VintageVibes.MOD_ID);
    public static List<RegistryObject<? extends Item>> AUTO_TRANSLATE = new ArrayList<>();

    // gems
    public static final RegistryObject<Item> AQUAMARINE = registerItem("aquamarine", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AMBER = registerItem("amber", () -> new Item(new Item.Properties()));
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

    // rough gems
    public static final RegistryObject<Item> ROUGH_AQUAMARINE = registerItem("rough_aquamarine", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROUGH_AMBER = registerItem("rough_amber", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROUGH_ENSTATITE = registerItem("rough_enstatite", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROUGH_GARNET = registerItem("rough_garnet", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROUGH_JADE = registerItem("rough_jade", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROUGH_KUNZITE = registerItem("rough_kunzite", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROUGH_LARIMAR = registerItem("rough_larimar", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROUGH_MILKY_QUARTZ = registerItem("rough_milky_quartz", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROUGH_MOONSTONE = registerItem("rough_moonstone", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROUGH_ONYX = registerItem("rough_onyx", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROUGH_PERIDOT = registerItem("rough_peridot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROUGH_ROSE_QUARTZ = registerItem("rough_rose_quartz", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROUGH_SAPPHIRE = registerItem("rough_sapphire", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROUGH_SMOKY_QUARTZ = registerItem("rough_smoky_quartz", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROUGH_TAAFFEITE = registerItem("rough_taaffeite", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROUGH_TOPAZ = registerItem("rough_topaz", () -> new Item(new Item.Properties()));

    // pineapple
    public static final RegistryObject<Item> PINEAPPLE_SLICE = registerItem("pineapple_slice", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.3F).build())));
    public static final RegistryObject<Item> PINEAPPLE_SEEDS = registerItem("pineapple_seeds", () -> new Item(new Item.Properties()));

    // discs
    public static final RegistryObject<Item> VIBE_DISC = registerItemNoLang("vibe_disc", () -> new RecordItem(6, VVSounds.VIBE_DISC, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1360));

    // evil beasts of evil origins
    public static final RegistryObject<Item> BUTTERFLY_SPAWN_EGG = registerSpawnEggItem("butterfly", VVEntities.BUTTERFLY, 0xb8510d, 0x270d07);

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