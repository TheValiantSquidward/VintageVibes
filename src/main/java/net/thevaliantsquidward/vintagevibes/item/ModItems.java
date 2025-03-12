package net.thevaliantsquidward.vintagevibes.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thevaliantsquidward.vintagevibes.VintageVibes;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, VintageVibes.MOD_ID);

    public static final RegistryObject<Item> AQUAMARINE = ITEMS.register
            ("aquamarine", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AMBER = ITEMS.register
            ("amber", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ENSTATITE = ITEMS.register
            ("enstatite", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GARNET = ITEMS.register
            ("garnet", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JADE = ITEMS.register
            ("jade", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KUNZITE = ITEMS.register
            ("kunzite", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LARIMAR = ITEMS.register
            ("larimar", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MILKY_QUARTZ = ITEMS.register
            ("milky_quartz", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MOONSTONE = ITEMS.register
            ("moonstone", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ONYX = ITEMS.register
            ("onyx", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PERIDOT = ITEMS.register
            ("peridot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROSE_QUARTZ = ITEMS.register
            ("rose_quartz", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register
            ("sapphire", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SMOKY_QUARTZ = ITEMS.register
            ("smoky_quartz", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TAAFFEITE = ITEMS.register
            ("taaffeite", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TOPAZ = ITEMS.register
            ("topaz", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ROUGH_AQUAMARINE = ITEMS.register
            ("rough_aquamarine", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROUGH_AMBER = ITEMS.register
            ("rough_amber", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROUGH_ENSTATITE = ITEMS.register
            ("rough_enstatite", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROUGH_GARNET = ITEMS.register
            ("rough_garnet", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROUGH_JADE = ITEMS.register
            ("rough_jade", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROUGH_KUNZITE = ITEMS.register
            ("rough_kunzite", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROUGH_LARIMAR = ITEMS.register
            ("rough_larimar", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROUGH_MILKY_QUARTZ = ITEMS.register
            ("rough_milky_quartz", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROUGH_MOONSTONE = ITEMS.register
            ("rough_moonstone", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROUGH_ONYX = ITEMS.register
            ("rough_onyx", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROUGH_PERIDOT = ITEMS.register
            ("rough_peridot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROUGH_ROSE_QUARTZ = ITEMS.register
            ("rough_rose_quartz", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROUGH_SAPPHIRE = ITEMS.register
            ("rough_sapphire", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROUGH_SMOKY_QUARTZ = ITEMS.register
            ("rough_smoky_quartz", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROUGH_TAAFFEITE = ITEMS.register
            ("rough_taaffeite", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROUGH_TOPAZ = ITEMS.register
            ("rough_topaz", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PINEAPPLE_SLICE = ITEMS.register
            ("pineapple_slice", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.3F).build())));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}