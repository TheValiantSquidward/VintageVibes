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
        registerWaxables();
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
    }

    public static void registerWaxables() {
        ImmutableBiMap.Builder<Block, Block> builder = ImmutableBiMap.builder();
        HoneycombItem.WAXABLES.get().forEach(builder::put);
        builder.put(VVBlocks.GREEN_PINEAPPLE.get(), VVBlocks.WAXED_GREEN_PINEAPPLE.get());
        builder.put(VVBlocks.GREEN_PINEAPPLE_SCALE_BLOCK.get(), VVBlocks.WAXED_GREEN_PINEAPPLE_SCALE_BLOCK.get());
        builder.put(VVBlocks.SPOTTED_PINEAPPLE.get(), VVBlocks.WAXED_SPOTTED_PINEAPPLE.get());
        builder.put(VVBlocks.SPOTTED_PINEAPPLE_SCALE_BLOCK.get(), VVBlocks.WAXED_SPOTTED_PINEAPPLE_SCALE_BLOCK.get());
        builder.put(VVBlocks.PINEAPPLE.get(), VVBlocks.WAXED_PINEAPPLE.get());
        builder.put(VVBlocks.PINEAPPLE_SCALE_BLOCK.get(), VVBlocks.WAXED_PINEAPPLE_SCALE_BLOCK.get());
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
