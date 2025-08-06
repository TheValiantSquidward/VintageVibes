package net.thevaliantsquidward.vintagevibes.registry;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class VVItemProperties {

    public static final Rarity TRINKET = Rarity.create("vintagevibes:trinket", style -> style.withColor(15971101));
    public static final Item.Properties TRINKET_PROPERTIES = new Item.Properties().rarity(VVItemProperties.TRINKET);

}
