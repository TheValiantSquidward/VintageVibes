package net.thevaliantsquidward.vintagevibes.registry;

import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableBiMap;
import net.minecraft.world.item.HoneycombItem;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraft.world.level.block.FireBlock;

public class VVCompat {

    public static void registerCompat() {
        registerCompostables();
        registerFlammables();
//        registerWaxables();
    }

    public static void registerCompostables() {
        registerCompostable(VVBlocks.GREEN_PINEAPPLE.get(), 0.65F);
        registerCompostable(VVBlocks.GREEN_PINEAPPLE_SCALE_BLOCK.get(), 0.65F);
        registerCompostable(VVBlocks.SPOTTED_PINEAPPLE.get(), 0.65F);
        registerCompostable(VVBlocks.SPOTTED_PINEAPPLE_SCALE_BLOCK.get(), 0.65F);
        registerCompostable(VVBlocks.PINEAPPLE.get(), 0.65F);
        registerCompostable(VVBlocks.PINEAPPLE_SCALE_BLOCK.get(), 0.65F);
        registerCompostable(VVBlocks.SKINNED_PINEAPPLE.get(), 0.65F);
        registerCompostable(VVBlocks.PINEAPPLE_FLESH_BLOCK.get(), 0.65F);
        registerCompostable(VVBlocks.PINEAPPLE_CROWN.get(), 0.3F);
        registerCompostable(VVItems.PINEAPPLE_SLICE.get(), 0.5F);
        registerCompostable(VVItems.PINEAPPLE_CHUNKS.get(), 0.25F);

        registerCompostable(VVBlocks.WHITE_HIBISCUS.get(), 0.65F);
        registerCompostable(VVBlocks.RED_HIBISCUS.get(), 0.65F);
        registerCompostable(VVBlocks.ORANGE_HIBISCUS.get(), 0.65F);
        registerCompostable(VVBlocks.PURPLE_HIBISCUS.get(), 0.65F);
        registerCompostable(VVBlocks.PINK_HIBISCUS.get(), 0.65F);
        registerCompostable(VVBlocks.TALL_WHITE_HIBISCUS.get(), 0.65F);
        registerCompostable(VVBlocks.TALL_RED_HIBISCUS.get(), 0.65F);
        registerCompostable(VVBlocks.TALL_ORANGE_HIBISCUS.get(), 0.65F);
        registerCompostable(VVBlocks.TALL_PURPLE_HIBISCUS.get(), 0.65F);
        registerCompostable(VVBlocks.TALL_PINK_HIBISCUS.get(), 0.65F);

        registerCompostable(VVBlocks.WHITE_HIBISCUS_CARPET.get(), 0.3F);
        registerCompostable(VVBlocks.RED_HIBISCUS_CARPET.get(), 0.3F);
        registerCompostable(VVBlocks.ORANGE_HIBISCUS_CARPET.get(), 0.3F);
        registerCompostable(VVBlocks.PURPLE_HIBISCUS_CARPET.get(), 0.3F);
        registerCompostable(VVBlocks.PINK_HIBISCUS_CARPET.get(), 0.3F);

        registerCompostable(VVBlocks.WHITE_CALLA.get(), 0.65F);
        registerCompostable(VVBlocks.BLACK_CALLA.get(), 0.65F);
        registerCompostable(VVBlocks.ORANGE_CALLA.get(), 0.65F);
        registerCompostable(VVBlocks.YELLOW_CALLA.get(), 0.65F);
        registerCompostable(VVBlocks.ORANGE_BROMELIAD.get(), 0.65F);
        registerCompostable(VVBlocks.YELLOW_BROMELIAD.get(), 0.65F);
        registerCompostable(VVBlocks.PURPLE_BROMELIAD.get(), 0.65F);
        registerCompostable(VVBlocks.PINK_BROMELIAD.get(), 0.65F);
        registerCompostable(VVBlocks.WHITE_ORCHID.get(), 0.65F);
        registerCompostable(VVBlocks.ORANGE_ORCHID.get(), 0.65F);
        registerCompostable(VVBlocks.YELLOW_ORCHID.get(), 0.65F);
        registerCompostable(VVBlocks.PINK_ORCHID.get(), 0.65F);
        registerCompostable(VVBlocks.BIRD_OF_PARADISE.get(), 0.65F);
        registerCompostable(VVBlocks.CANNA_LILY.get(), 0.65F);
        registerCompostable(VVBlocks.LACELEAF.get(), 0.65F);
        registerCompostable(VVBlocks.TALL_LACELEAF.get(), 0.65F);
        registerCompostable(VVBlocks.TORCH_GINGER.get(), 0.65F);

        registerCompostable(VVBlocks.GRAPEFRUIT_SAPLING.get(), 0.3F);
        registerCompostable(VVBlocks.LEMON_SAPLING.get(), 0.3F);
        registerCompostable(VVBlocks.LIME_SAPLING.get(), 0.3F);
        registerCompostable(VVBlocks.MANGO_SAPLING.get(), 0.3F);
        registerCompostable(VVBlocks.ORANGE_SAPLING.get(), 0.3F);

        registerCompostable(VVBlocks.GRAPEFRUIT_LEAVES.get(), 0.3F);
        registerCompostable(VVBlocks.LEMON_LEAVES.get(), 0.3F);
        registerCompostable(VVBlocks.LIME_LEAVES.get(), 0.3F);
        registerCompostable(VVBlocks.MANGO_LEAVES.get(), 0.3F);
        registerCompostable(VVBlocks.ORANGE_LEAVES.get(), 0.3F);

        registerCompostable(VVBlocks.FLOWERING_GRAPEFRUIT_LEAVES.get(), 0.3F);
        registerCompostable(VVBlocks.FLOWERING_LEMON_LEAVES.get(), 0.3F);
        registerCompostable(VVBlocks.FLOWERING_LIME_LEAVES.get(), 0.3F);
        registerCompostable(VVBlocks.FLOWERING_MANGO_LEAVES.get(), 0.3F);
        registerCompostable(VVBlocks.FLOWERING_ORANGE_LEAVES.get(), 0.3F);

        registerCompostable(VVBlocks.FRUITFUL_GRAPEFRUIT_LEAVES.get(), 0.3F);
        registerCompostable(VVBlocks.FRUITFUL_LEMON_LEAVES.get(), 0.3F);
        registerCompostable(VVBlocks.FRUITFUL_LIME_LEAVES.get(), 0.3F);
        registerCompostable(VVBlocks.FRUITFUL_MANGO_LEAVES.get(), 0.3F);
        registerCompostable(VVBlocks.FRUITFUL_ORANGE_LEAVES.get(), 0.3F);

    }

    public static void registerFlammables() {
        registerFlammable(VVBlocks.WHITE_HIBISCUS.get(), 60, 100);
        registerFlammable(VVBlocks.RED_HIBISCUS.get(), 60, 100);
        registerFlammable(VVBlocks.ORANGE_HIBISCUS.get(), 60, 100);
        registerFlammable(VVBlocks.PURPLE_HIBISCUS.get(), 60, 100);
        registerFlammable(VVBlocks.PINK_HIBISCUS.get(), 60, 100);
        registerFlammable(VVBlocks.TALL_WHITE_HIBISCUS.get(), 60, 100);
        registerFlammable(VVBlocks.TALL_RED_HIBISCUS.get(), 60, 100);
        registerFlammable(VVBlocks.TALL_ORANGE_HIBISCUS.get(), 60, 100);
        registerFlammable(VVBlocks.TALL_PURPLE_HIBISCUS.get(), 60, 100);
        registerFlammable(VVBlocks.TALL_PINK_HIBISCUS.get(), 60, 100);

        registerFlammable(VVBlocks.WHITE_HIBISCUS_CARPET.get(), 60, 100);
        registerFlammable(VVBlocks.RED_HIBISCUS_CARPET.get(), 60, 100);
        registerFlammable(VVBlocks.ORANGE_HIBISCUS_CARPET.get(), 60, 100);
        registerFlammable(VVBlocks.PURPLE_HIBISCUS_CARPET.get(), 60, 100);
        registerFlammable(VVBlocks.PINK_HIBISCUS_CARPET.get(), 60, 100);

        registerFlammable(VVBlocks.PINEAPPLE_CROWN.get(), 60, 100);

        registerFlammable(VVBlocks.WHITE_CALLA.get(), 60, 100);
        registerFlammable(VVBlocks.BLACK_CALLA.get(), 60, 100);
        registerFlammable(VVBlocks.ORANGE_CALLA.get(), 60, 100);
        registerFlammable(VVBlocks.YELLOW_CALLA.get(), 60, 100);
        registerFlammable(VVBlocks.ORANGE_BROMELIAD.get(), 60, 100);
        registerFlammable(VVBlocks.YELLOW_BROMELIAD.get(), 60, 100);
        registerFlammable(VVBlocks.PURPLE_BROMELIAD.get(), 60, 100);
        registerFlammable(VVBlocks.PINK_BROMELIAD.get(), 60, 100);
        registerFlammable(VVBlocks.WHITE_ORCHID.get(), 60, 100);
        registerFlammable(VVBlocks.ORANGE_ORCHID.get(), 60, 100);
        registerFlammable(VVBlocks.YELLOW_ORCHID.get(), 60, 100);
        registerFlammable(VVBlocks.PINK_ORCHID.get(), 60, 100);
        registerFlammable(VVBlocks.BIRD_OF_PARADISE.get(), 60, 100);
        registerFlammable(VVBlocks.CANNA_LILY.get(), 60, 100);
        registerFlammable(VVBlocks.LACELEAF.get(), 60, 100);
        registerFlammable(VVBlocks.TALL_LACELEAF.get(), 60, 100);
        registerFlammable(VVBlocks.TORCH_GINGER.get(), 60, 100);

        registerFlammable(VVBlocks.GRAPEFRUIT_LEAVES.get(), 30, 60);
        registerFlammable(VVBlocks.LEMON_LEAVES.get(), 30, 60);
        registerFlammable(VVBlocks.LIME_LEAVES.get(), 30, 60);
        registerFlammable(VVBlocks.MANGO_LEAVES.get(), 30, 60);
        registerFlammable(VVBlocks.ORANGE_LEAVES.get(), 30, 60);

        registerFlammable(VVBlocks.FLOWERING_GRAPEFRUIT_LEAVES.get(), 30, 60);
        registerFlammable(VVBlocks.FLOWERING_LEMON_LEAVES.get(), 30, 60);
        registerFlammable(VVBlocks.FLOWERING_LIME_LEAVES.get(), 30, 60);
        registerFlammable(VVBlocks.FLOWERING_MANGO_LEAVES.get(), 30, 60);
        registerFlammable(VVBlocks.FLOWERING_ORANGE_LEAVES.get(), 30, 60);

        registerFlammable(VVBlocks.FRUITFUL_GRAPEFRUIT_LEAVES.get(), 30, 60);
        registerFlammable(VVBlocks.FRUITFUL_LEMON_LEAVES.get(), 30, 60);
        registerFlammable(VVBlocks.FRUITFUL_LIME_LEAVES.get(), 30, 60);
        registerFlammable(VVBlocks.FRUITFUL_MANGO_LEAVES.get(), 30, 60);
        registerFlammable(VVBlocks.FRUITFUL_ORANGE_LEAVES.get(), 30, 60);
    }

    public static void registerWaxables() {
        ImmutableBiMap.Builder<Block, Block> builder = ImmutableBiMap.builder();
        HoneycombItem.WAXABLES.get().forEach(builder::put);
        HoneycombItem.WAXABLES = Suppliers.memoize(builder::build);
    }

    public static void registerCompostable(ItemLike item, float chance) {
        ComposterBlock.COMPOSTABLES.put(item.asItem(), chance);
    }

    public static void registerFlammable(Block block, int igniteChance, int burnChance) {
        FireBlock fire = (FireBlock) Blocks.FIRE;
        fire.setFlammable(block, igniteChance, burnChance);
    }
}
