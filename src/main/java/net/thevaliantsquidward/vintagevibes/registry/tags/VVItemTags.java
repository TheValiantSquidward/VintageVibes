package net.thevaliantsquidward.vintagevibes.registry.tags;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.thevaliantsquidward.vintagevibes.VintageVibes;

public class VVItemTags {

    // VV tags
    public static final TagKey<Item> GEMS  = modItemTag("gems");

    // VV forge tags
    public static final TagKey<Item> GEMS_AMBER  = forgeItemTag("gems/amber");
    public static final TagKey<Item> GEMS_AQUAMARINE  = forgeItemTag("gems/aquamarine");
    public static final TagKey<Item> GEMS_ENSTATITE  = forgeItemTag("gems/enstatite");
    public static final TagKey<Item> GEMS_GARNET  = forgeItemTag("gems/garnet");
    public static final TagKey<Item> GEMS_JADE  = forgeItemTag("gems/jade");
    public static final TagKey<Item> GEMS_KUNZITE  = forgeItemTag("gems/kunzite");
    public static final TagKey<Item> GEMS_LARIMAR  = forgeItemTag("gems/larimar");
    public static final TagKey<Item> GEMS_MILKY_QUARTZ  = forgeItemTag("gems/milky_quartz");
    public static final TagKey<Item> GEMS_MOONSTONE  = forgeItemTag("gems/moonstone");
    public static final TagKey<Item> GEMS_ONYX  = forgeItemTag("gems/onyx");
    public static final TagKey<Item> GEMS_PERIDOT  = forgeItemTag("gems/peridot");
    public static final TagKey<Item> GEMS_ROSE_QUARTZ  = forgeItemTag("gems/rose_quartz");
    public static final TagKey<Item> GEMS_SAPPHIRE  = forgeItemTag("gems/sapphire");
    public static final TagKey<Item> GEMS_SMOKY_QUARTZ  = forgeItemTag("gems/smoky_quartz");
    public static final TagKey<Item> GEMS_TAAFFEITE  = forgeItemTag("gems/taaffeite");
    public static final TagKey<Item> GEMS_TOPAZ  = forgeItemTag("gems/topaz");

    public static final TagKey<Item> SEEDS_PINEAPPLE  = forgeItemTag("seeds/pineapple");

    private static TagKey<Item> modItemTag(String name) {
        return itemTag(VintageVibes.MOD_ID, name);
    }

    private static TagKey<Item> forgeItemTag(String name) {
        return itemTag("forge", name);
    }

    public static TagKey<Item> itemTag(String modid, String name) {
        return TagKey.create(Registries.ITEM, new ResourceLocation(modid, name));
    }
}
