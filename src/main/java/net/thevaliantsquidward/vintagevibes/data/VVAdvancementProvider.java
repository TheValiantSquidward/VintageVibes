package net.thevaliantsquidward.vintagevibes.data;

import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.FrameType;
import net.minecraft.advancements.RequirementsStrategy;
import net.minecraft.advancements.critereon.*;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeAdvancementProvider;
import net.minecraftforge.common.data.ForgeAdvancementProvider.AdvancementGenerator;
import net.thevaliantsquidward.vintagevibes.VintageVibes;
import net.thevaliantsquidward.vintagevibes.registry.VVBlocks;
import net.thevaliantsquidward.vintagevibes.registry.VVItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class VVAdvancementProvider implements AdvancementGenerator {

    public static ForgeAdvancementProvider register(PackOutput output, CompletableFuture<Provider> provider, ExistingFileHelper helper) {
        return new ForgeAdvancementProvider(output, provider, helper, List.of(new VVAdvancementProvider()));
    }

    @SuppressWarnings("unused")
    @Override
    public void generate(Provider provider, Consumer<Advancement> consumer, ExistingFileHelper helper) {

        Advancement root = Advancement.Builder.advancement()
                .display(VVBlocks.PINK_HIBISCUS.get(),
                        Component.translatable("advancement.vintagevibes.root"),
                        Component.translatable("advancement.vintagevibes.root.desc"),
                        new ResourceLocation(VintageVibes.MOD_ID, "textures/block/carved_sandstone_lazy_bones.png"),
                        FrameType.TASK, false, false, false)
                .addCriterion("root", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.CRAFTING_TABLE))
                .save(consumer, new ResourceLocation(VintageVibes.MOD_ID, "root"), helper);

        Advancement pineappleSlice = Advancement.Builder.advancement()
                .parent(root)
                .display(VVItems.PINEAPPLE_SLICE.get(),
                        Component.translatable("advancement.vintagevibes.pineapple_slice"),
                        Component.translatable("advancement.vintagevibes.pineapple_slice.desc"),
                        null,
                        FrameType.TASK, true, true, false)
                .addCriterion("pineapple_slice", InventoryChangeTrigger.TriggerInstance.hasItems(VVItems.PINEAPPLE_SLICE.get()))
                .save(consumer, new ResourceLocation(VintageVibes.MOD_ID, "pineapple_slice"), helper);

        Advancement allMasks = Advancement.Builder.advancement()
                .parent(root)
                .display(VVItems.FESTIVE_MASK.get(),
                        Component.translatable("advancement.vintagevibes.all_masks"),
                        Component.translatable("advancement.vintagevibes.all_masks.desc"),
                        null,
                        FrameType.CHALLENGE, true, true, true)
                .requirements(RequirementsStrategy.AND)
                    .addCriterion("celestial_mask", InventoryChangeTrigger.TriggerInstance.hasItems(VVItems.CELESTIAL_MASK.get()))
                    .addCriterion("deity_mask", InventoryChangeTrigger.TriggerInstance.hasItems(VVItems.DEITY_MASK.get()))
                    .addCriterion("festive_mask", InventoryChangeTrigger.TriggerInstance.hasItems(VVItems.FESTIVE_MASK.get()))
                    .addCriterion("frond_mask", InventoryChangeTrigger.TriggerInstance.hasItems(VVItems.FROND_MASK.get()))
                    .addCriterion("monsoon_mask", InventoryChangeTrigger.TriggerInstance.hasItems(VVItems.MONSOON_MASK.get()))
                    .addCriterion("petrified_mask", InventoryChangeTrigger.TriggerInstance.hasItems(VVItems.PETRIFIED_MASK.get()))
                    .addCriterion("spirit_mask", InventoryChangeTrigger.TriggerInstance.hasItems(VVItems.SPIRIT_MASK.get()))
                    .addCriterion("sunrise_mask", InventoryChangeTrigger.TriggerInstance.hasItems(VVItems.SUNRISE_MASK.get()))
                    .addCriterion("tidal_mask", InventoryChangeTrigger.TriggerInstance.hasItems(VVItems.TIDAL_MASK.get()))
                    .addCriterion("volcanic_mask", InventoryChangeTrigger.TriggerInstance.hasItems(VVItems.VOLCANIC_MASK.get()))
                .save(consumer, new ResourceLocation(VintageVibes.MOD_ID, "all_masks"), helper);

        Advancement allGems = Advancement.Builder.advancement()
                .parent(root)
                .display(VVItems.KUNZITE.get(),
                        Component.translatable("advancement.vintagevibes.all_gems"),
                        Component.translatable("advancement.vintagevibes.all_gems.desc"),
                        null,
                        FrameType.TASK, true, true, false)
                .requirements(RequirementsStrategy.AND)
                    .addCriterion("amber", InventoryChangeTrigger.TriggerInstance.hasItems(VVItems.AMBER.get()))
                    .addCriterion("aquamarine", InventoryChangeTrigger.TriggerInstance.hasItems(VVItems.AQUAMARINE.get()))
                    .addCriterion("enstatite", InventoryChangeTrigger.TriggerInstance.hasItems(VVItems.ENSTATITE.get()))
                    .addCriterion("garnet", InventoryChangeTrigger.TriggerInstance.hasItems(VVItems.GARNET.get()))
                    .addCriterion("jade", InventoryChangeTrigger.TriggerInstance.hasItems(VVItems.JADE.get()))
                    .addCriterion("kunzite", InventoryChangeTrigger.TriggerInstance.hasItems(VVItems.KUNZITE.get()))
                    .addCriterion("larimar", InventoryChangeTrigger.TriggerInstance.hasItems(VVItems.LARIMAR.get()))
                    .addCriterion("milky_quartz", InventoryChangeTrigger.TriggerInstance.hasItems(VVItems.MILKY_QUARTZ.get()))
                    .addCriterion("moonstone", InventoryChangeTrigger.TriggerInstance.hasItems(VVItems.MOONSTONE.get()))
                    .addCriterion("onyx", InventoryChangeTrigger.TriggerInstance.hasItems(VVItems.ONYX.get()))
                    .addCriterion("peridot", InventoryChangeTrigger.TriggerInstance.hasItems(VVItems.PERIDOT.get()))
                    .addCriterion("rose_quartz", InventoryChangeTrigger.TriggerInstance.hasItems(VVItems.ROSE_QUARTZ.get()))
                    .addCriterion("sapphire", InventoryChangeTrigger.TriggerInstance.hasItems(VVItems.SAPPHIRE.get()))
                    .addCriterion("smoky_quartz", InventoryChangeTrigger.TriggerInstance.hasItems(VVItems.SMOKY_QUARTZ.get()))
                    .addCriterion("taaffeite", InventoryChangeTrigger.TriggerInstance.hasItems(VVItems.TAAFFEITE.get()))
                    .addCriterion("topaz", InventoryChangeTrigger.TriggerInstance.hasItems(VVItems.TOPAZ.get()))
                .save(consumer, new ResourceLocation(VintageVibes.MOD_ID, "all_gems"), helper);

        Advancement bottleButterfly = Advancement.Builder.advancement()
                .parent(root)
                .display(VVItems.BUTTERFLY_BOTTLE.get(),
                        Component.translatable("advancement.vintagevibes.bottle_butterfly"),
                        Component.translatable("advancement.vintagevibes.bottle_butterfly.desc"),
                        null,
                        FrameType.TASK, true, true, false)
                .addCriterion("bottle_butterfly", InventoryChangeTrigger.TriggerInstance.hasItems(VVItems.BUTTERFLY_BOTTLE.get()))
                .save(consumer, new ResourceLocation(VintageVibes.MOD_ID, "bottle_butterfly"), helper);
    }
}
