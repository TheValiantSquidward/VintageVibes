package net.thevaliantsquidward.vintagevibes.data;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
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

    }
}
