package net.thevaliantsquidward.vintagevibes.registry.tags;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.thevaliantsquidward.vintagevibes.VintageVibes;

public class VVBlockTags {

    public static final TagKey<Block> BEJEWELED_ORES = modBlockTag("bejeweled_ores");

    public static final TagKey<Block> ORES_BEJEWELED = forgeBlockTag("ores/bejeweled");

    public static final TagKey<Block> STORAGE_BLOCKS_AMBER  = forgeBlockTag("storage_blocks/amber");
    public static final TagKey<Block> STORAGE_BLOCKS_AQUAMARINE  = forgeBlockTag("storage_blocks/aquamarine");
    public static final TagKey<Block> STORAGE_BLOCKS_ENSTATITE  = forgeBlockTag("storage_blocks/enstatite");
    public static final TagKey<Block> STORAGE_BLOCKS_GARNET  = forgeBlockTag("storage_blocks/garnet");
    public static final TagKey<Block> STORAGE_BLOCKS_JADE  = forgeBlockTag("storage_blocks/jade");
    public static final TagKey<Block> STORAGE_BLOCKS_KUNZITE  = forgeBlockTag("storage_blocks/kunzite");
    public static final TagKey<Block> STORAGE_BLOCKS_LARIMAR  = forgeBlockTag("storage_blocks/larimar");
    public static final TagKey<Block> STORAGE_BLOCKS_MILKY_QUARTZ  = forgeBlockTag("storage_blocks/milky_quartz");
    public static final TagKey<Block> STORAGE_BLOCKS_MOONSTONE  = forgeBlockTag("storage_blocks/moonstone");
    public static final TagKey<Block> STORAGE_BLOCKS_ONYX  = forgeBlockTag("storage_blocks/onyx");
    public static final TagKey<Block> STORAGE_BLOCKS_PERIDOT  = forgeBlockTag("storage_blocks/peridot");
    public static final TagKey<Block> STORAGE_BLOCKS_ROSE_QUARTZ  = forgeBlockTag("storage_blocks/rose_quartz");
    public static final TagKey<Block> STORAGE_BLOCKS_SAPPHIRE  = forgeBlockTag("storage_blocks/sapphire");
    public static final TagKey<Block> STORAGE_BLOCKS_SMOKY_QUARTZ  = forgeBlockTag("storage_blocks/smoky_quartz");
    public static final TagKey<Block> STORAGE_BLOCKS_TAAFFEITE  = forgeBlockTag("storage_blocks/taaffeite");
    public static final TagKey<Block> STORAGE_BLOCKS_TOPAZ  = forgeBlockTag("storage_blocks/topaz");

    public static final TagKey<Block> MINEABLE_WITH_OBSIDIAN_TOOL = modBlockTag("mineable/obsidian_tool");

    public static TagKey<Block> blockTag(String modid, String name) {
        return TagKey.create(Registries.BLOCK, new ResourceLocation(modid, name));
    }

    private static TagKey<Block> forgeBlockTag(String name) {
        return blockTag("forge", name);
    }

    private static TagKey<Block> modBlockTag(String name) {
        return blockTag(VintageVibes.MOD_ID, name);
    }
}
