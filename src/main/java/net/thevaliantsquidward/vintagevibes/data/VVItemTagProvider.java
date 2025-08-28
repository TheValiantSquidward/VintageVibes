package net.thevaliantsquidward.vintagevibes.data;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.thevaliantsquidward.vintagevibes.VintageVibes;
import net.thevaliantsquidward.vintagevibes.registry.tags.VVItemTags;

import java.util.concurrent.CompletableFuture;

import static net.thevaliantsquidward.vintagevibes.registry.VVItems.*;

public class VVItemTagProvider extends ItemTagsProvider {

    public VVItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> provider, CompletableFuture<TagLookup<Block>> lookup, ExistingFileHelper helper) {
        super(output, provider, lookup, VintageVibes.MOD_ID, helper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        this.copy(BlockTags.SLABS, ItemTags.SLABS);
        this.copy(BlockTags.STAIRS, ItemTags.STAIRS);
        this.copy(BlockTags.WALLS, ItemTags.WALLS);
        this.copy(BlockTags.SMALL_FLOWERS, ItemTags.SMALL_FLOWERS);
        this.copy(BlockTags.TALL_FLOWERS, ItemTags.TALL_FLOWERS);
        this.copy(BlockTags.LEAVES, ItemTags.LEAVES);
        this.copy(BlockTags.SAPLINGS, ItemTags.SAPLINGS);

        this.tag(VVItemTags.GEMS_AMBER).add(
                AMBER.get()
        );
        this.tag(VVItemTags.GEMS_AQUAMARINE).add(
                AQUAMARINE.get()
        );
        this.tag(VVItemTags.GEMS_ENSTATITE).add(
                ENSTATITE.get()
        );
        this.tag(VVItemTags.GEMS_GARNET).add(
                GARNET.get()
        );
        this.tag(VVItemTags.GEMS_JADE).add(
                JADE.get()
        );
        this.tag(VVItemTags.GEMS_KUNZITE).add(
                KUNZITE.get()
        );
        this.tag(VVItemTags.GEMS_LARIMAR).add(
                LARIMAR.get()
        );
        this.tag(VVItemTags.GEMS_MILKY_QUARTZ).add(
                MILKY_QUARTZ.get()
        );
        this.tag(VVItemTags.GEMS_MOONSTONE).add(
                MOONSTONE.get()
        );
        this.tag(VVItemTags.GEMS_ONYX).add(
                ONYX.get()
        );
        this.tag(VVItemTags.GEMS_PERIDOT).add(
                PERIDOT.get()
        );
        this.tag(VVItemTags.GEMS_ROSE_QUARTZ).add(
                ROSE_QUARTZ.get()
        );
        this.tag(VVItemTags.GEMS_SAPPHIRE).add(
                SAPPHIRE.get()
        );
        this.tag(VVItemTags.GEMS_SMOKY_QUARTZ).add(
                SMOKY_QUARTZ.get()
        );
        this.tag(VVItemTags.GEMS_TAAFFEITE).add(
                TAAFFEITE.get()
        );
        this.tag(VVItemTags.GEMS_TOPAZ).add(
                TOPAZ.get()
        );

        this.tag(VVItemTags.GEMS)
                .addTag(VVItemTags.GEMS_AMBER)
                .addTag(VVItemTags.GEMS_AQUAMARINE)
                .addTag(VVItemTags.GEMS_ENSTATITE)
                .addTag(VVItemTags.GEMS_GARNET)
                .addTag(VVItemTags.GEMS_JADE)
                .addTag(VVItemTags.GEMS_KUNZITE)
                .addTag(VVItemTags.GEMS_LARIMAR)
                .addTag(VVItemTags.GEMS_MILKY_QUARTZ)
                .addTag(VVItemTags.GEMS_MOONSTONE)
                .addTag(VVItemTags.GEMS_ONYX)
                .addTag(VVItemTags.GEMS_PERIDOT)
                .addTag(VVItemTags.GEMS_ROSE_QUARTZ)
                .addTag(VVItemTags.GEMS_SAPPHIRE)
                .addTag(VVItemTags.GEMS_SMOKY_QUARTZ)
                .addTag(VVItemTags.GEMS_TAAFFEITE)
                .addTag(VVItemTags.GEMS_TOPAZ);

        this.tag(Tags.Items.GEMS).addTag(VVItemTags.GEMS);

        this.tag(ItemTags.MUSIC_DISCS).add(VIBE_DISC.get());

        this.tag(ItemTags.SWORDS).add(OBSIDIAN_BLADE.get());
        this.tag(ItemTags.PICKAXES).add(OBSIDIAN_TOOL.get());
        this.tag(ItemTags.SHOVELS).add(OBSIDIAN_TOOL.get());
        this.tag(ItemTags.AXES).add(OBSIDIAN_TOOL.get());
        this.tag(ItemTags.HOES).add(OBSIDIAN_TOOL.get());

        this.tag(Tags.Items.ARMORS_HELMETS).add(
                CELESTIAL_MASK.get(),
                DEITY_MASK.get(),
                FESTIVE_MASK.get(),
                FROND_MASK.get(),
                MONSOON_MASK.get(),
                PETRIFIED_MASK.get(),
                SPIRIT_MASK.get(),
                SUNRISE_MASK.get(),
                TIDAL_MASK.get(),
                VOLCANIC_MASK.get()
        );

        this.tag(VVItemTags.SEEDS_PINEAPPLE).add(PINEAPPLE_SEEDS.get());
        this.tag(Tags.Items.SEEDS).addTag(VVItemTags.SEEDS_PINEAPPLE);

    }
}
