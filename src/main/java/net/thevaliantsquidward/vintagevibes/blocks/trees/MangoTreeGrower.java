package net.thevaliantsquidward.vintagevibes.blocks.trees;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static net.thevaliantsquidward.vintagevibes.VintageVibes.modPrefix;

public class MangoTreeGrower extends AbstractTreeGrower {
    @Nullable
    @Override
    protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(@NotNull RandomSource randomSource, boolean beehive) {
        return beehive ? ResourceKey.create(Registries.CONFIGURED_FEATURE, modPrefix("trees/mango_bees_005")) : ResourceKey.create(Registries.CONFIGURED_FEATURE, modPrefix("trees/mango"));
    }
}
