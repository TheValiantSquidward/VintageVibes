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

    public static final RegistryObject<Item> GARNET = ITEMS.register
            ("garnet", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PERIDOT = ITEMS.register
            ("peridot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TOPAZ = ITEMS.register
            ("topaz", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ROUGH_GARNET = ITEMS.register
            ("rough_garnet", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROUGH_PERIDOT = ITEMS.register
            ("rough_peridot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROUGH_TOPAZ = ITEMS.register
            ("rough_topaz", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PINEAPPLE_SLICE = ITEMS.register
            ("pineapple_slice", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.3F).build())));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}