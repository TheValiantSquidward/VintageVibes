package net.thevaliantsquidward.vintagevibes.data;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.ConditionalRecipe;
import net.minecraftforge.common.crafting.conditions.ICondition;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.thevaliantsquidward.vintagevibes.VintageVibes;
import net.thevaliantsquidward.vintagevibes.registry.VVItems;
import net.thevaliantsquidward.vintagevibes.registry.tags.VVItemTags;

import java.util.function.Consumer;

import static net.minecraft.data.recipes.RecipeCategory.*;
import static net.thevaliantsquidward.vintagevibes.registry.VVBlockFamilies.*;
import static net.thevaliantsquidward.vintagevibes.registry.VVBlocks.*;

public class VVRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public VVRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        storageRecipes(consumer, MISC, VVItems.AMBER.get(), BUILDING_BLOCKS, AMBER_BLOCK.get());
        storageRecipes(consumer, MISC, VVItems.AQUAMARINE.get(), BUILDING_BLOCKS, AQUAMARINE_BLOCK.get());
        storageRecipes(consumer, MISC, VVItems.ENSTATITE.get(), BUILDING_BLOCKS, ENSTATITE_BLOCK.get());
        storageRecipes(consumer, MISC, VVItems.GARNET.get(), BUILDING_BLOCKS, GARNET_BLOCK.get());
        storageRecipes(consumer, MISC, VVItems.JADE.get(), BUILDING_BLOCKS, JADE_BLOCK.get());
        storageRecipes(consumer, MISC, VVItems.KUNZITE.get(), BUILDING_BLOCKS, KUNZITE_BLOCK.get());
        storageRecipes(consumer, MISC, VVItems.LARIMAR.get(), BUILDING_BLOCKS, LARIMAR_BLOCK.get());
        storageRecipes(consumer, MISC, VVItems.MILKY_QUARTZ.get(), BUILDING_BLOCKS, MILKY_QUARTZ_BLOCK.get());
        storageRecipes(consumer, MISC, VVItems.MOONSTONE.get(), BUILDING_BLOCKS, MOONSTONE_BLOCK.get());
        storageRecipes(consumer, MISC, VVItems.ONYX.get(), BUILDING_BLOCKS, ONYX_BLOCK.get());
        storageRecipes(consumer, MISC, VVItems.PERIDOT.get(), BUILDING_BLOCKS, PERIDOT_BLOCK.get());
        storageRecipes(consumer, MISC, VVItems.ROSE_QUARTZ.get(), BUILDING_BLOCKS, ROSE_QUARTZ_BLOCK.get());
        storageRecipes(consumer, MISC, VVItems.SAPPHIRE.get(), BUILDING_BLOCKS, SAPPHIRE_BLOCK.get());
        storageRecipes(consumer, MISC, VVItems.SMOKY_QUARTZ.get(), BUILDING_BLOCKS, SMOKY_QUARTZ_BLOCK.get());
        storageRecipes(consumer, MISC, VVItems.TAAFFEITE.get(), BUILDING_BLOCKS, TAAFFEITE_BLOCK.get());
        storageRecipes(consumer, MISC, VVItems.TOPAZ.get(), BUILDING_BLOCKS, TOPAZ_BLOCK.get());

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, POLISHED_AMBER.get(), 4).define('#', AMBER_BLOCK.get()).pattern("##").pattern("##").unlockedBy("has_amber", has(VVItemTags.GEMS_AMBER)).save(consumer);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, POLISHED_AMBER.get(), AMBER_BLOCK.get(), 4);

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, AMBER_TILES.get(), 4).define('#', POLISHED_AMBER.get()).pattern("##").pattern("##").unlockedBy("has_amber", has(VVItemTags.GEMS_AMBER)).save(consumer);
        generateRecipes(consumer, AMBER_TILES_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, AMBER_TILES.get(), POLISHED_AMBER.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, AMBER_TILE_SLAB.get(), AMBER_TILES.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, AMBER_TILE_STAIRS.get(), AMBER_TILES.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, AMBER_TILE_WALL.get(), AMBER_TILES.get());

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, POLISHED_AQUAMARINE.get(), 4).define('#', AQUAMARINE_BLOCK.get()).pattern("##").pattern("##").unlockedBy("has_aquamarine", has(VVItemTags.GEMS_AQUAMARINE)).save(consumer);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, POLISHED_AQUAMARINE.get(), AQUAMARINE_BLOCK.get(), 4);

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, AQUAMARINE_TILES.get(), 4).define('#', POLISHED_AQUAMARINE.get()).pattern("##").pattern("##").unlockedBy("has_aquamarine", has(VVItemTags.GEMS_AQUAMARINE)).save(consumer);
        generateRecipes(consumer, AQUAMARINE_TILES_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, AQUAMARINE_TILES.get(), POLISHED_AQUAMARINE.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, AQUAMARINE_TILE_SLAB.get(), AQUAMARINE_TILES.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, AQUAMARINE_TILE_STAIRS.get(), AQUAMARINE_TILES.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, AQUAMARINE_TILE_WALL.get(), AQUAMARINE_TILES.get());

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, POLISHED_ENSTATITE.get(), 4).define('#', ENSTATITE_BLOCK.get()).pattern("##").pattern("##").unlockedBy("has_enstatite", has(VVItemTags.GEMS_ENSTATITE)).save(consumer);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, POLISHED_ENSTATITE.get(), ENSTATITE_BLOCK.get(), 4);

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, ENSTATITE_TILES.get(), 4).define('#', POLISHED_ENSTATITE.get()).pattern("##").pattern("##").unlockedBy("has_enstatite", has(VVItemTags.GEMS_ENSTATITE)).save(consumer);
        generateRecipes(consumer, ENSTATITE_TILES_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, ENSTATITE_TILES.get(), POLISHED_ENSTATITE.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, ENSTATITE_TILE_SLAB.get(), ENSTATITE_TILES.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, ENSTATITE_TILE_STAIRS.get(), ENSTATITE_TILES.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, ENSTATITE_TILE_WALL.get(), ENSTATITE_TILES.get());

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, POLISHED_GARNET.get(), 4).define('#', GARNET_BLOCK.get()).pattern("##").pattern("##").unlockedBy("has_garnet", has(VVItemTags.GEMS_GARNET)).save(consumer);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, POLISHED_GARNET.get(), GARNET_BLOCK.get(), 4);

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, GARNET_TILES.get(), 4).define('#', POLISHED_GARNET.get()).pattern("##").pattern("##").unlockedBy("has_garnet", has(VVItemTags.GEMS_GARNET)).save(consumer);
        generateRecipes(consumer, GARNET_TILES_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, GARNET_TILES.get(), POLISHED_GARNET.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, GARNET_TILE_SLAB.get(), GARNET_TILES.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, GARNET_TILE_STAIRS.get(), GARNET_TILES.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, GARNET_TILE_WALL.get(), GARNET_TILES.get());

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, POLISHED_JADE.get(), 4).define('#', JADE_BLOCK.get()).pattern("##").pattern("##").unlockedBy("has_jade", has(VVItemTags.GEMS_JADE)).save(consumer);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, POLISHED_JADE.get(), JADE_BLOCK.get(), 4);

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, JADE_TILES.get(), 4).define('#', POLISHED_JADE.get()).pattern("##").pattern("##").unlockedBy("has_jade", has(VVItemTags.GEMS_JADE)).save(consumer);
        generateRecipes(consumer, JADE_TILES_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, JADE_TILES.get(), POLISHED_JADE.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, JADE_TILE_SLAB.get(), JADE_TILES.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, JADE_TILE_STAIRS.get(), JADE_TILES.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, JADE_TILE_WALL.get(), JADE_TILES.get());

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, POLISHED_KUNZITE.get(), 4).define('#', KUNZITE_BLOCK.get()).pattern("##").pattern("##").unlockedBy("has_kunzite", has(VVItemTags.GEMS_KUNZITE)).save(consumer);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, POLISHED_KUNZITE.get(), KUNZITE_BLOCK.get(), 4);

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, KUNZITE_TILES.get(), 4).define('#', POLISHED_KUNZITE.get()).pattern("##").pattern("##").unlockedBy("has_kunzite", has(VVItemTags.GEMS_KUNZITE)).save(consumer);
        generateRecipes(consumer, KUNZITE_TILES_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, KUNZITE_TILES.get(), POLISHED_KUNZITE.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, KUNZITE_TILE_SLAB.get(), KUNZITE_TILES.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, KUNZITE_TILE_STAIRS.get(), KUNZITE_TILES.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, KUNZITE_TILE_WALL.get(), KUNZITE_TILES.get());

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, POLISHED_LARIMAR.get(), 4).define('#', LARIMAR_BLOCK.get()).pattern("##").pattern("##").unlockedBy("has_larimar", has(VVItemTags.GEMS_LARIMAR)).save(consumer);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, POLISHED_LARIMAR.get(), LARIMAR_BLOCK.get(), 4);

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, LARIMAR_TILES.get(), 4).define('#', POLISHED_LARIMAR.get()).pattern("##").pattern("##").unlockedBy("has_larimar", has(VVItemTags.GEMS_LARIMAR)).save(consumer);
        generateRecipes(consumer, LARIMAR_TILES_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, LARIMAR_TILES.get(), POLISHED_LARIMAR.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, LARIMAR_TILE_SLAB.get(), LARIMAR_TILES.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, LARIMAR_TILE_STAIRS.get(), LARIMAR_TILES.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, LARIMAR_TILE_WALL.get(), LARIMAR_TILES.get());

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, POLISHED_MILKY_QUARTZ.get(), 4).define('#', MILKY_QUARTZ_BLOCK.get()).pattern("##").pattern("##").unlockedBy("has_milky_quartz", has(VVItemTags.GEMS_MILKY_QUARTZ)).save(consumer);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, POLISHED_MILKY_QUARTZ.get(), MILKY_QUARTZ_BLOCK.get(), 4);

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, MILKY_QUARTZ_TILES.get(), 4).define('#', POLISHED_MILKY_QUARTZ.get()).pattern("##").pattern("##").unlockedBy("has_milky_quartz", has(VVItemTags.GEMS_MILKY_QUARTZ)).save(consumer);
        generateRecipes(consumer, MILKY_QUARTZ_TILES_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, MILKY_QUARTZ_TILES.get(), POLISHED_MILKY_QUARTZ.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, MILKY_QUARTZ_TILE_SLAB.get(), MILKY_QUARTZ_TILES.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, MILKY_QUARTZ_TILE_STAIRS.get(), MILKY_QUARTZ_TILES.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, MILKY_QUARTZ_TILE_WALL.get(), MILKY_QUARTZ_TILES.get());

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, POLISHED_MOONSTONE.get(), 4).define('#', MOONSTONE_BLOCK.get()).pattern("##").pattern("##").unlockedBy("has_moonstone", has(VVItemTags.GEMS_MOONSTONE)).save(consumer);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, POLISHED_MOONSTONE.get(), MOONSTONE_BLOCK.get(), 4);

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, MOONSTONE_TILES.get(), 4).define('#', POLISHED_MOONSTONE.get()).pattern("##").pattern("##").unlockedBy("has_moonstone", has(VVItemTags.GEMS_MOONSTONE)).save(consumer);
        generateRecipes(consumer, MOONSTONE_TILES_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, MOONSTONE_TILES.get(), POLISHED_MOONSTONE.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, MOONSTONE_TILE_SLAB.get(), MOONSTONE_TILES.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, MOONSTONE_TILE_STAIRS.get(), MOONSTONE_TILES.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, MOONSTONE_TILE_WALL.get(), MOONSTONE_TILES.get());

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, POLISHED_ONYX.get(), 4).define('#', ONYX_BLOCK.get()).pattern("##").pattern("##").unlockedBy("has_onyx", has(VVItemTags.GEMS_ONYX)).save(consumer);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, POLISHED_ONYX.get(), ONYX_BLOCK.get(), 4);

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, ONYX_TILES.get(), 4).define('#', POLISHED_ONYX.get()).pattern("##").pattern("##").unlockedBy("has_onyx", has(VVItemTags.GEMS_ONYX)).save(consumer);
        generateRecipes(consumer, ONYX_TILES_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, ONYX_TILES.get(), POLISHED_ONYX.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, ONYX_TILE_SLAB.get(), ONYX_TILES.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, ONYX_TILE_STAIRS.get(), ONYX_TILES.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, ONYX_TILE_WALL.get(), ONYX_TILES.get());

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, POLISHED_PERIDOT.get(), 4).define('#', PERIDOT_BLOCK.get()).pattern("##").pattern("##").unlockedBy("has_peridot", has(VVItemTags.GEMS_PERIDOT)).save(consumer);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, POLISHED_PERIDOT.get(), PERIDOT_BLOCK.get(), 4);

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, PERIDOT_TILES.get(), 4).define('#', POLISHED_PERIDOT.get()).pattern("##").pattern("##").unlockedBy("has_peridot", has(VVItemTags.GEMS_PERIDOT)).save(consumer);
        generateRecipes(consumer, PERIDOT_TILES_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, PERIDOT_TILES.get(), POLISHED_PERIDOT.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, PERIDOT_TILE_SLAB.get(), PERIDOT_TILES.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, PERIDOT_TILE_STAIRS.get(), PERIDOT_TILES.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, PERIDOT_TILE_WALL.get(), PERIDOT_TILES.get());

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, POLISHED_ROSE_QUARTZ.get(), 4).define('#', ROSE_QUARTZ_BLOCK.get()).pattern("##").pattern("##").unlockedBy("has_rose_quartz", has(VVItemTags.GEMS_ROSE_QUARTZ)).save(consumer);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, POLISHED_ROSE_QUARTZ.get(), ROSE_QUARTZ_BLOCK.get(), 4);

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, ROSE_QUARTZ_TILES.get(), 4).define('#', POLISHED_ROSE_QUARTZ.get()).pattern("##").pattern("##").unlockedBy("has_rose_quartz", has(VVItemTags.GEMS_ROSE_QUARTZ)).save(consumer);
        generateRecipes(consumer, ROSE_QUARTZ_TILES_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, ROSE_QUARTZ_TILES.get(), POLISHED_ROSE_QUARTZ.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, ROSE_QUARTZ_TILE_SLAB.get(), ROSE_QUARTZ_TILES.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, ROSE_QUARTZ_TILE_STAIRS.get(), ROSE_QUARTZ_TILES.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, ROSE_QUARTZ_TILE_WALL.get(), ROSE_QUARTZ_TILES.get());

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, POLISHED_SAPPHIRE.get(), 4).define('#', SAPPHIRE_BLOCK.get()).pattern("##").pattern("##").unlockedBy("has_sapphire", has(VVItemTags.GEMS_SAPPHIRE)).save(consumer);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, POLISHED_SAPPHIRE.get(), SAPPHIRE_BLOCK.get(), 4);

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, SAPPHIRE_TILES.get(), 4).define('#', POLISHED_SAPPHIRE.get()).pattern("##").pattern("##").unlockedBy("has_sapphire", has(VVItemTags.GEMS_SAPPHIRE)).save(consumer);
        generateRecipes(consumer, SAPPHIRE_TILES_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, SAPPHIRE_TILES.get(), POLISHED_SAPPHIRE.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, SAPPHIRE_TILE_SLAB.get(), SAPPHIRE_TILES.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, SAPPHIRE_TILE_STAIRS.get(), SAPPHIRE_TILES.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, SAPPHIRE_TILE_WALL.get(), SAPPHIRE_TILES.get());

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, POLISHED_SMOKY_QUARTZ.get(), 4).define('#', SMOKY_QUARTZ_BLOCK.get()).pattern("##").pattern("##").unlockedBy("has_smoky_quartz", has(VVItemTags.GEMS_SMOKY_QUARTZ)).save(consumer);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, POLISHED_SMOKY_QUARTZ.get(), SMOKY_QUARTZ_BLOCK.get(), 4);

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, SMOKY_QUARTZ_TILES.get(), 4).define('#', POLISHED_SMOKY_QUARTZ.get()).pattern("##").pattern("##").unlockedBy("has_smoky_quartz", has(VVItemTags.GEMS_SMOKY_QUARTZ)).save(consumer);
        generateRecipes(consumer, SMOKY_QUARTZ_TILES_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, SMOKY_QUARTZ_TILES.get(), POLISHED_SMOKY_QUARTZ.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, SMOKY_QUARTZ_TILE_SLAB.get(), SMOKY_QUARTZ_TILES.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, SMOKY_QUARTZ_TILE_STAIRS.get(), SMOKY_QUARTZ_TILES.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, SMOKY_QUARTZ_TILE_WALL.get(), SMOKY_QUARTZ_TILES.get());

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, POLISHED_TAAFFEITE.get(), 4).define('#', TAAFFEITE_BLOCK.get()).pattern("##").pattern("##").unlockedBy("has_taaffeite", has(VVItemTags.GEMS_TAAFFEITE)).save(consumer);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, POLISHED_TAAFFEITE.get(), TAAFFEITE_BLOCK.get(), 4);

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, TAAFFEITE_TILES.get(), 4).define('#', POLISHED_TAAFFEITE.get()).pattern("##").pattern("##").unlockedBy("has_taaffeite", has(VVItemTags.GEMS_TAAFFEITE)).save(consumer);
        generateRecipes(consumer, TAAFFEITE_TILES_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, TAAFFEITE_TILES.get(), POLISHED_TAAFFEITE.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, TAAFFEITE_TILE_SLAB.get(), TAAFFEITE_TILES.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, TAAFFEITE_TILE_STAIRS.get(), TAAFFEITE_TILES.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, TAAFFEITE_TILE_WALL.get(), TAAFFEITE_TILES.get());

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, POLISHED_TOPAZ.get(), 4).define('#', TOPAZ_BLOCK.get()).pattern("##").pattern("##").unlockedBy("has_topaz", has(VVItemTags.GEMS_TOPAZ)).save(consumer);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, POLISHED_TOPAZ.get(), TOPAZ_BLOCK.get(), 4);

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, TOPAZ_TILES.get(), 4).define('#', POLISHED_TOPAZ.get()).pattern("##").pattern("##").unlockedBy("has_topaz", has(VVItemTags.GEMS_TOPAZ)).save(consumer);
        generateRecipes(consumer, TOPAZ_TILES_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, TOPAZ_TILES.get(), POLISHED_TOPAZ.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, TOPAZ_TILE_SLAB.get(), TOPAZ_TILES.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, TOPAZ_TILE_STAIRS.get(), TOPAZ_TILES.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, TOPAZ_TILE_WALL.get(), TOPAZ_TILES.get());

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, AMETHYST_TILES.get(), 4).define('#', Blocks.AMETHYST_BLOCK).pattern("##").pattern("##").unlockedBy("has_amethyst", has(Tags.Items.GEMS_AMETHYST)).save(consumer);
        generateRecipes(consumer, AMETHYST_TILES_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, AMETHYST_TILES.get(), Blocks.AMETHYST_BLOCK, 4);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, AMETHYST_TILE_SLAB.get(), AMETHYST_TILES.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, AMETHYST_TILE_STAIRS.get(), AMETHYST_TILES.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, AMETHYST_TILE_WALL.get(), AMETHYST_TILES.get());

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, DIAMOND_TILES.get(), 4).define('#', Blocks.DIAMOND_BLOCK).pattern("##").pattern("##").unlockedBy("has_diamond", has(Tags.Items.GEMS_DIAMOND)).save(consumer);
        generateRecipes(consumer, DIAMOND_TILES_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, DIAMOND_TILES.get(), Blocks.DIAMOND_BLOCK, 4);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, DIAMOND_TILE_SLAB.get(), DIAMOND_TILES.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, DIAMOND_TILE_STAIRS.get(), DIAMOND_TILES.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, DIAMOND_TILE_WALL.get(), DIAMOND_TILES.get());

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, EMERALD_TILES.get(), 4).define('#', Blocks.EMERALD_BLOCK).pattern("##").pattern("##").unlockedBy("has_emerald", has(Tags.Items.GEMS_EMERALD)).save(consumer);
        generateRecipes(consumer, EMERALD_TILES_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, EMERALD_TILES.get(), Blocks.EMERALD_BLOCK, 4);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, EMERALD_TILE_SLAB.get(), EMERALD_TILES.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, EMERALD_TILE_STAIRS.get(), EMERALD_TILES.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, EMERALD_TILE_WALL.get(), EMERALD_TILES.get());

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, QUARTZ_TILES.get(), 4).define('#', Blocks.QUARTZ_BLOCK).pattern("##").pattern("##").unlockedBy("has_quartz", has(Tags.Items.GEMS_QUARTZ)).save(consumer);
        generateRecipes(consumer, QUARTZ_TILES_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, QUARTZ_TILES.get(), Blocks.QUARTZ_BLOCK, 4);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, QUARTZ_TILE_SLAB.get(), QUARTZ_TILES.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, QUARTZ_TILE_STAIRS.get(), QUARTZ_TILES.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, QUARTZ_TILE_WALL.get(), QUARTZ_TILES.get());

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, CALCITE_TILES.get(), 4).define('#', Blocks.CALCITE).pattern("##").pattern("##").unlockedBy("has_calcite", has(Blocks.CALCITE)).save(consumer);
        generateRecipes(consumer, CALCITE_TILES_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, CALCITE_TILES.get(), Blocks.CALCITE);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, CALCITE_TILE_SLAB.get(), CALCITE_TILES.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, CALCITE_TILE_STAIRS.get(), CALCITE_TILES.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, CALCITE_TILE_WALL.get(), CALCITE_TILES.get());

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, STARRY_AMBER_CALCITE_TILES.get(), 8).define('#', CALCITE_TILES.get()).define('X', VVItemTags.GEMS_AMBER).pattern("###").pattern("#X#").pattern("###").unlockedBy("has_amber", has(VVItemTags.GEMS_AMBER)).save(consumer);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, STARRY_AQUAMARINE_CALCITE_TILES.get(), 8).define('#', CALCITE_TILES.get()).define('X', VVItemTags.GEMS_AQUAMARINE).pattern("###").pattern("#X#").pattern("###").unlockedBy("has_aquamarine", has(VVItemTags.GEMS_AQUAMARINE)).save(consumer);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, STARRY_ENSTATITE_CALCITE_TILES.get(), 8).define('#', CALCITE_TILES.get()).define('X', VVItemTags.GEMS_ENSTATITE).pattern("###").pattern("#X#").pattern("###").unlockedBy("has_enstatite", has(VVItemTags.GEMS_ENSTATITE)).save(consumer);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, STARRY_GARNET_CALCITE_TILES.get(), 8).define('#', CALCITE_TILES.get()).define('X', VVItemTags.GEMS_GARNET).pattern("###").pattern("#X#").pattern("###").unlockedBy("has_garnet", has(VVItemTags.GEMS_GARNET)).save(consumer);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, STARRY_JADE_CALCITE_TILES.get(), 8).define('#', CALCITE_TILES.get()).define('X', VVItemTags.GEMS_JADE).pattern("###").pattern("#X#").pattern("###").unlockedBy("has_jade", has(VVItemTags.GEMS_JADE)).save(consumer);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, STARRY_KUNZITE_CALCITE_TILES.get(), 8).define('#', CALCITE_TILES.get()).define('X', VVItemTags.GEMS_KUNZITE).pattern("###").pattern("#X#").pattern("###").unlockedBy("has_kunzite", has(VVItemTags.GEMS_KUNZITE)).save(consumer);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, STARRY_LARIMAR_CALCITE_TILES.get(), 8).define('#', CALCITE_TILES.get()).define('X', VVItemTags.GEMS_LARIMAR).pattern("###").pattern("#X#").pattern("###").unlockedBy("has_larimar", has(VVItemTags.GEMS_LARIMAR)).save(consumer);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, STARRY_MILKY_QUARTZ_CALCITE_TILES.get(), 8).define('#', CALCITE_TILES.get()).define('X', VVItemTags.GEMS_MILKY_QUARTZ).pattern("###").pattern("#X#").pattern("###").unlockedBy("has_milky_quartz", has(VVItemTags.GEMS_MILKY_QUARTZ)).save(consumer);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, STARRY_MOONSTONE_CALCITE_TILES.get(), 8).define('#', CALCITE_TILES.get()).define('X', VVItemTags.GEMS_MOONSTONE).pattern("###").pattern("#X#").pattern("###").unlockedBy("has_moonstone", has(VVItemTags.GEMS_MOONSTONE)).save(consumer);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, STARRY_ONYX_CALCITE_TILES.get(), 8).define('#', CALCITE_TILES.get()).define('X', VVItemTags.GEMS_ONYX).pattern("###").pattern("#X#").pattern("###").unlockedBy("has_onyx", has(VVItemTags.GEMS_ONYX)).save(consumer);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, STARRY_PERIDOT_CALCITE_TILES.get(), 8).define('#', CALCITE_TILES.get()).define('X', VVItemTags.GEMS_PERIDOT).pattern("###").pattern("#X#").pattern("###").unlockedBy("has_peridot", has(VVItemTags.GEMS_PERIDOT)).save(consumer);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, STARRY_ROSE_QUARTZ_CALCITE_TILES.get(), 8).define('#', CALCITE_TILES.get()).define('X', VVItemTags.GEMS_ROSE_QUARTZ).pattern("###").pattern("#X#").pattern("###").unlockedBy("has_rose_quartz", has(VVItemTags.GEMS_ROSE_QUARTZ)).save(consumer);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, STARRY_SAPPHIRE_CALCITE_TILES.get(), 8).define('#', CALCITE_TILES.get()).define('X', VVItemTags.GEMS_SAPPHIRE).pattern("###").pattern("#X#").pattern("###").unlockedBy("has_sapphire", has(VVItemTags.GEMS_SAPPHIRE)).save(consumer);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, STARRY_SMOKY_QUARTZ_CALCITE_TILES.get(), 8).define('#', CALCITE_TILES.get()).define('X', VVItemTags.GEMS_SMOKY_QUARTZ).pattern("###").pattern("#X#").pattern("###").unlockedBy("has_smoky_quartz", has(VVItemTags.GEMS_SMOKY_QUARTZ)).save(consumer);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, STARRY_TAAFFEITE_CALCITE_TILES.get(), 8).define('#', CALCITE_TILES.get()).define('X', VVItemTags.GEMS_TAAFFEITE).pattern("###").pattern("#X#").pattern("###").unlockedBy("has_taaffeite", has(VVItemTags.GEMS_TAAFFEITE)).save(consumer);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, STARRY_TOPAZ_CALCITE_TILES.get(), 8).define('#', CALCITE_TILES.get()).define('X', VVItemTags.GEMS_TOPAZ).pattern("###").pattern("#X#").pattern("###").unlockedBy("has_topaz", has(VVItemTags.GEMS_TOPAZ)).save(consumer);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, STARRY_AMETHYST_CALCITE_TILES.get(), 8).define('#', CALCITE_TILES.get()).define('X', Tags.Items.GEMS_AMETHYST).pattern("###").pattern("#X#").pattern("###").unlockedBy("has_amethyst", has(Tags.Items.GEMS_AMETHYST)).save(consumer);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, STARRY_DIAMOND_CALCITE_TILES.get(), 8).define('#', CALCITE_TILES.get()).define('X', Tags.Items.GEMS_DIAMOND).pattern("###").pattern("#X#").pattern("###").unlockedBy("has_diamond", has(Tags.Items.GEMS_DIAMOND)).save(consumer);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, STARRY_EMERALD_CALCITE_TILES.get(), 8).define('#', CALCITE_TILES.get()).define('X', Tags.Items.GEMS_EMERALD).pattern("###").pattern("#X#").pattern("###").unlockedBy("has_emerald", has(Tags.Items.GEMS_EMERALD)).save(consumer);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, STARRY_QUARTZ_CALCITE_TILES.get(), 8).define('#', CALCITE_TILES.get()).define('X', Tags.Items.GEMS_QUARTZ).pattern("###").pattern("#X#").pattern("###").unlockedBy("has_quartz", has(Tags.Items.GEMS_QUARTZ)).save(consumer);

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, CALCITE_BRICKS.get(), 4).define('#', CALCITE_TILES.get()).pattern("##").pattern("##").unlockedBy("has_calcite", has(Blocks.CALCITE)).save(consumer);
        generateRecipes(consumer, CALCITE_BRICKS_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, CALCITE_BRICKS.get(), Blocks.CALCITE);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, CALCITE_BRICKS.get(), CALCITE_TILES.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, CALCITE_BRICK_SLAB.get(), CALCITE_BRICKS.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, CALCITE_BRICK_STAIRS.get(), CALCITE_BRICKS.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, CALCITE_BRICK_WALL.get(), CALCITE_BRICKS.get());

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, AMBER_BEJEWELED_CALCITE_BRICKS.get(), 8).define('#', CALCITE_BRICKS.get()).define('X', VVItemTags.GEMS_AMBER).pattern("###").pattern("#X#").pattern("###").unlockedBy("has_amber", has(VVItemTags.GEMS_AMBER)).save(consumer);
        generateRecipes(consumer, AMBER_BEJEWELED_CALCITE_BRICKS_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, AMBER_BEJEWELED_CALCITE_BRICK_SLAB.get(), AMBER_BEJEWELED_CALCITE_BRICKS.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, AMBER_BEJEWELED_CALCITE_BRICK_STAIRS.get(), AMBER_BEJEWELED_CALCITE_BRICKS.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, AMBER_BEJEWELED_CALCITE_BRICK_WALL.get(), AMBER_BEJEWELED_CALCITE_BRICKS.get());

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, AQUAMARINE_BEJEWELED_CALCITE_BRICKS.get(), 8).define('#', CALCITE_BRICKS.get()).define('X', VVItemTags.GEMS_AQUAMARINE).pattern("###").pattern("#X#").pattern("###").unlockedBy("has_aquamarine", has(VVItemTags.GEMS_AQUAMARINE)).save(consumer);
        generateRecipes(consumer, AQUAMARINE_BEJEWELED_CALCITE_BRICKS_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, AQUAMARINE_BEJEWELED_CALCITE_BRICK_SLAB.get(), AQUAMARINE_BEJEWELED_CALCITE_BRICKS.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, AQUAMARINE_BEJEWELED_CALCITE_BRICK_STAIRS.get(), AQUAMARINE_BEJEWELED_CALCITE_BRICKS.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, AQUAMARINE_BEJEWELED_CALCITE_BRICK_WALL.get(), AQUAMARINE_BEJEWELED_CALCITE_BRICKS.get());

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, ENSTATITE_BEJEWELED_CALCITE_BRICKS.get(), 8).define('#', CALCITE_BRICKS.get()).define('X', VVItemTags.GEMS_ENSTATITE).pattern("###").pattern("#X#").pattern("###").unlockedBy("has_enstatite", has(VVItemTags.GEMS_ENSTATITE)).save(consumer);
        generateRecipes(consumer, ENSTATITE_BEJEWELED_CALCITE_BRICKS_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, ENSTATITE_BEJEWELED_CALCITE_BRICK_SLAB.get(), ENSTATITE_BEJEWELED_CALCITE_BRICKS.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, ENSTATITE_BEJEWELED_CALCITE_BRICK_STAIRS.get(), ENSTATITE_BEJEWELED_CALCITE_BRICKS.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, ENSTATITE_BEJEWELED_CALCITE_BRICK_WALL.get(), ENSTATITE_BEJEWELED_CALCITE_BRICKS.get());

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, GARNET_BEJEWELED_CALCITE_BRICKS.get(), 8).define('#', CALCITE_BRICKS.get()).define('X', VVItemTags.GEMS_GARNET).pattern("###").pattern("#X#").pattern("###").unlockedBy("has_garnet", has(VVItemTags.GEMS_GARNET)).save(consumer);
        generateRecipes(consumer, GARNET_BEJEWELED_CALCITE_BRICKS_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, GARNET_BEJEWELED_CALCITE_BRICK_SLAB.get(), GARNET_BEJEWELED_CALCITE_BRICKS.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, GARNET_BEJEWELED_CALCITE_BRICK_STAIRS.get(), GARNET_BEJEWELED_CALCITE_BRICKS.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, GARNET_BEJEWELED_CALCITE_BRICK_WALL.get(), GARNET_BEJEWELED_CALCITE_BRICKS.get());

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, JADE_BEJEWELED_CALCITE_BRICKS.get(), 8).define('#', CALCITE_BRICKS.get()).define('X', VVItemTags.GEMS_JADE).pattern("###").pattern("#X#").pattern("###").unlockedBy("has_jade", has(VVItemTags.GEMS_JADE)).save(consumer);
        generateRecipes(consumer, JADE_BEJEWELED_CALCITE_BRICKS_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, JADE_BEJEWELED_CALCITE_BRICK_SLAB.get(), JADE_BEJEWELED_CALCITE_BRICKS.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, JADE_BEJEWELED_CALCITE_BRICK_STAIRS.get(), JADE_BEJEWELED_CALCITE_BRICKS.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, JADE_BEJEWELED_CALCITE_BRICK_WALL.get(), JADE_BEJEWELED_CALCITE_BRICKS.get());

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, KUNZITE_BEJEWELED_CALCITE_BRICKS.get(), 8).define('#', CALCITE_BRICKS.get()).define('X', VVItemTags.GEMS_KUNZITE).pattern("###").pattern("#X#").pattern("###").unlockedBy("has_kunzite", has(VVItemTags.GEMS_KUNZITE)).save(consumer);
        generateRecipes(consumer, KUNZITE_BEJEWELED_CALCITE_BRICKS_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, KUNZITE_BEJEWELED_CALCITE_BRICK_SLAB.get(), KUNZITE_BEJEWELED_CALCITE_BRICKS.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, KUNZITE_BEJEWELED_CALCITE_BRICK_STAIRS.get(), KUNZITE_BEJEWELED_CALCITE_BRICKS.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, KUNZITE_BEJEWELED_CALCITE_BRICK_WALL.get(), KUNZITE_BEJEWELED_CALCITE_BRICKS.get());

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, LARIMAR_BEJEWELED_CALCITE_BRICKS.get(), 8).define('#', CALCITE_BRICKS.get()).define('X', VVItemTags.GEMS_LARIMAR).pattern("###").pattern("#X#").pattern("###").unlockedBy("has_larimar", has(VVItemTags.GEMS_LARIMAR)).save(consumer);
        generateRecipes(consumer, LARIMAR_BEJEWELED_CALCITE_BRICKS_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, LARIMAR_BEJEWELED_CALCITE_BRICK_SLAB.get(), LARIMAR_BEJEWELED_CALCITE_BRICKS.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, LARIMAR_BEJEWELED_CALCITE_BRICK_STAIRS.get(), LARIMAR_BEJEWELED_CALCITE_BRICKS.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, LARIMAR_BEJEWELED_CALCITE_BRICK_WALL.get(), LARIMAR_BEJEWELED_CALCITE_BRICKS.get());

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, MILKY_QUARTZ_BEJEWELED_CALCITE_BRICKS.get(), 8).define('#', CALCITE_BRICKS.get()).define('X', VVItemTags.GEMS_MILKY_QUARTZ).pattern("###").pattern("#X#").pattern("###").unlockedBy("has_milky_quartz", has(VVItemTags.GEMS_MILKY_QUARTZ)).save(consumer);
        generateRecipes(consumer, MILKY_QUARTZ_BEJEWELED_CALCITE_BRICKS_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, MILKY_QUARTZ_BEJEWELED_CALCITE_BRICK_SLAB.get(), MILKY_QUARTZ_BEJEWELED_CALCITE_BRICKS.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, MILKY_QUARTZ_BEJEWELED_CALCITE_BRICK_STAIRS.get(), MILKY_QUARTZ_BEJEWELED_CALCITE_BRICKS.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, MILKY_QUARTZ_BEJEWELED_CALCITE_BRICK_WALL.get(), MILKY_QUARTZ_BEJEWELED_CALCITE_BRICKS.get());

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, MOONSTONE_BEJEWELED_CALCITE_BRICKS.get(), 8).define('#', CALCITE_BRICKS.get()).define('X', VVItemTags.GEMS_MOONSTONE).pattern("###").pattern("#X#").pattern("###").unlockedBy("has_moonstone", has(VVItemTags.GEMS_MOONSTONE)).save(consumer);
        generateRecipes(consumer, MOONSTONE_BEJEWELED_CALCITE_BRICKS_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, MOONSTONE_BEJEWELED_CALCITE_BRICK_SLAB.get(), MOONSTONE_BEJEWELED_CALCITE_BRICKS.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, MOONSTONE_BEJEWELED_CALCITE_BRICK_STAIRS.get(), MOONSTONE_BEJEWELED_CALCITE_BRICKS.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, MOONSTONE_BEJEWELED_CALCITE_BRICK_WALL.get(), MOONSTONE_BEJEWELED_CALCITE_BRICKS.get());

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, ONYX_BEJEWELED_CALCITE_BRICKS.get(), 8).define('#', CALCITE_BRICKS.get()).define('X', VVItemTags.GEMS_ONYX).pattern("###").pattern("#X#").pattern("###").unlockedBy("has_onyx", has(VVItemTags.GEMS_ONYX)).save(consumer);
        generateRecipes(consumer, ONYX_BEJEWELED_CALCITE_BRICKS_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, ONYX_BEJEWELED_CALCITE_BRICK_SLAB.get(), ONYX_BEJEWELED_CALCITE_BRICKS.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, ONYX_BEJEWELED_CALCITE_BRICK_STAIRS.get(), ONYX_BEJEWELED_CALCITE_BRICKS.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, ONYX_BEJEWELED_CALCITE_BRICK_WALL.get(), ONYX_BEJEWELED_CALCITE_BRICKS.get());

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, PERIDOT_BEJEWELED_CALCITE_BRICKS.get(), 8).define('#', CALCITE_BRICKS.get()).define('X', VVItemTags.GEMS_PERIDOT).pattern("###").pattern("#X#").pattern("###").unlockedBy("has_peridot", has(VVItemTags.GEMS_PERIDOT)).save(consumer);
        generateRecipes(consumer, PERIDOT_BEJEWELED_CALCITE_BRICKS_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, PERIDOT_BEJEWELED_CALCITE_BRICK_SLAB.get(), PERIDOT_BEJEWELED_CALCITE_BRICKS.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, PERIDOT_BEJEWELED_CALCITE_BRICK_STAIRS.get(), PERIDOT_BEJEWELED_CALCITE_BRICKS.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, PERIDOT_BEJEWELED_CALCITE_BRICK_WALL.get(), PERIDOT_BEJEWELED_CALCITE_BRICKS.get());

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, ROSE_QUARTZ_BEJEWELED_CALCITE_BRICKS.get(), 8).define('#', CALCITE_BRICKS.get()).define('X', VVItemTags.GEMS_ROSE_QUARTZ).pattern("###").pattern("#X#").pattern("###").unlockedBy("has_rose_quartz", has(VVItemTags.GEMS_ROSE_QUARTZ)).save(consumer);
        generateRecipes(consumer, ROSE_QUARTZ_BEJEWELED_CALCITE_BRICKS_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, ROSE_QUARTZ_BEJEWELED_CALCITE_BRICK_SLAB.get(), ROSE_QUARTZ_BEJEWELED_CALCITE_BRICKS.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, ROSE_QUARTZ_BEJEWELED_CALCITE_BRICK_STAIRS.get(), ROSE_QUARTZ_BEJEWELED_CALCITE_BRICKS.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, ROSE_QUARTZ_BEJEWELED_CALCITE_BRICK_WALL.get(), ROSE_QUARTZ_BEJEWELED_CALCITE_BRICKS.get());

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, SAPPHIRE_BEJEWELED_CALCITE_BRICKS.get(), 8).define('#', CALCITE_BRICKS.get()).define('X', VVItemTags.GEMS_SAPPHIRE).pattern("###").pattern("#X#").pattern("###").unlockedBy("has_sapphire", has(VVItemTags.GEMS_SAPPHIRE)).save(consumer);
        generateRecipes(consumer, SAPPHIRE_BEJEWELED_CALCITE_BRICKS_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, SAPPHIRE_BEJEWELED_CALCITE_BRICK_SLAB.get(), SAPPHIRE_BEJEWELED_CALCITE_BRICKS.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, SAPPHIRE_BEJEWELED_CALCITE_BRICK_STAIRS.get(), SAPPHIRE_BEJEWELED_CALCITE_BRICKS.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, SAPPHIRE_BEJEWELED_CALCITE_BRICK_WALL.get(), SAPPHIRE_BEJEWELED_CALCITE_BRICKS.get());

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, SMOKY_QUARTZ_BEJEWELED_CALCITE_BRICKS.get(), 8).define('#', CALCITE_BRICKS.get()).define('X', VVItemTags.GEMS_SMOKY_QUARTZ).pattern("###").pattern("#X#").pattern("###").unlockedBy("has_smoky_quartz", has(VVItemTags.GEMS_SMOKY_QUARTZ)).save(consumer);
        generateRecipes(consumer, SMOKY_QUARTZ_BEJEWELED_CALCITE_BRICKS_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, SMOKY_QUARTZ_BEJEWELED_CALCITE_BRICK_SLAB.get(), SMOKY_QUARTZ_BEJEWELED_CALCITE_BRICKS.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, SMOKY_QUARTZ_BEJEWELED_CALCITE_BRICK_STAIRS.get(), SMOKY_QUARTZ_BEJEWELED_CALCITE_BRICKS.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, SMOKY_QUARTZ_BEJEWELED_CALCITE_BRICK_WALL.get(), SMOKY_QUARTZ_BEJEWELED_CALCITE_BRICKS.get());

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, TAAFFEITE_BEJEWELED_CALCITE_BRICKS.get(), 8).define('#', CALCITE_BRICKS.get()).define('X', VVItemTags.GEMS_TAAFFEITE).pattern("###").pattern("#X#").pattern("###").unlockedBy("has_taaffeite", has(VVItemTags.GEMS_TAAFFEITE)).save(consumer);
        generateRecipes(consumer, TAAFFEITE_BEJEWELED_CALCITE_BRICKS_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, TAAFFEITE_BEJEWELED_CALCITE_BRICK_SLAB.get(), TAAFFEITE_BEJEWELED_CALCITE_BRICKS.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, TAAFFEITE_BEJEWELED_CALCITE_BRICK_STAIRS.get(), TAAFFEITE_BEJEWELED_CALCITE_BRICKS.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, TAAFFEITE_BEJEWELED_CALCITE_BRICK_WALL.get(), TAAFFEITE_BEJEWELED_CALCITE_BRICKS.get());

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, TOPAZ_BEJEWELED_CALCITE_BRICKS.get(), 8).define('#', CALCITE_BRICKS.get()).define('X', VVItemTags.GEMS_TOPAZ).pattern("###").pattern("#X#").pattern("###").unlockedBy("has_topaz", has(VVItemTags.GEMS_TOPAZ)).save(consumer);
        generateRecipes(consumer, TOPAZ_BEJEWELED_CALCITE_BRICKS_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, TOPAZ_BEJEWELED_CALCITE_BRICK_SLAB.get(), TOPAZ_BEJEWELED_CALCITE_BRICKS.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, TOPAZ_BEJEWELED_CALCITE_BRICK_STAIRS.get(), TOPAZ_BEJEWELED_CALCITE_BRICKS.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, TOPAZ_BEJEWELED_CALCITE_BRICK_WALL.get(), TOPAZ_BEJEWELED_CALCITE_BRICKS.get());

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, AMETHYST_BEJEWELED_CALCITE_BRICKS.get(), 8).define('#', CALCITE_BRICKS.get()).define('X', Tags.Items.GEMS_AMETHYST).pattern("###").pattern("#X#").pattern("###").unlockedBy("has_amethyst", has(Tags.Items.GEMS_AMETHYST)).save(consumer);
        generateRecipes(consumer, AMETHYST_BEJEWELED_CALCITE_BRICKS_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, AMETHYST_BEJEWELED_CALCITE_BRICK_SLAB.get(), AMETHYST_BEJEWELED_CALCITE_BRICKS.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, AMETHYST_BEJEWELED_CALCITE_BRICK_STAIRS.get(), AMETHYST_BEJEWELED_CALCITE_BRICKS.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, AMETHYST_BEJEWELED_CALCITE_BRICK_WALL.get(), AMETHYST_BEJEWELED_CALCITE_BRICKS.get());

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, DIAMOND_BEJEWELED_CALCITE_BRICKS.get(), 8).define('#', CALCITE_BRICKS.get()).define('X', Tags.Items.GEMS_DIAMOND).pattern("###").pattern("#X#").pattern("###").unlockedBy("has_diamond", has(Tags.Items.GEMS_DIAMOND)).save(consumer);
        generateRecipes(consumer, DIAMOND_BEJEWELED_CALCITE_BRICKS_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, DIAMOND_BEJEWELED_CALCITE_BRICK_SLAB.get(), DIAMOND_BEJEWELED_CALCITE_BRICKS.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, DIAMOND_BEJEWELED_CALCITE_BRICK_STAIRS.get(), DIAMOND_BEJEWELED_CALCITE_BRICKS.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, DIAMOND_BEJEWELED_CALCITE_BRICK_WALL.get(), DIAMOND_BEJEWELED_CALCITE_BRICKS.get());

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, EMERALD_BEJEWELED_CALCITE_BRICKS.get(), 8).define('#', CALCITE_BRICKS.get()).define('X', Tags.Items.GEMS_EMERALD).pattern("###").pattern("#X#").pattern("###").unlockedBy("has_emerald", has(Tags.Items.GEMS_EMERALD)).save(consumer);
        generateRecipes(consumer, EMERALD_BEJEWELED_CALCITE_BRICKS_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, EMERALD_BEJEWELED_CALCITE_BRICK_SLAB.get(), EMERALD_BEJEWELED_CALCITE_BRICKS.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, EMERALD_BEJEWELED_CALCITE_BRICK_STAIRS.get(), EMERALD_BEJEWELED_CALCITE_BRICKS.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, EMERALD_BEJEWELED_CALCITE_BRICK_WALL.get(), EMERALD_BEJEWELED_CALCITE_BRICKS.get());

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, QUARTZ_BEJEWELED_CALCITE_BRICKS.get(), 8).define('#', CALCITE_BRICKS.get()).define('X', Tags.Items.GEMS_QUARTZ).pattern("###").pattern("#X#").pattern("###").unlockedBy("has_quartz", has(Tags.Items.GEMS_QUARTZ)).save(consumer);
        generateRecipes(consumer, QUARTZ_BEJEWELED_CALCITE_BRICKS_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, QUARTZ_BEJEWELED_CALCITE_BRICK_SLAB.get(), QUARTZ_BEJEWELED_CALCITE_BRICKS.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, QUARTZ_BEJEWELED_CALCITE_BRICK_STAIRS.get(), QUARTZ_BEJEWELED_CALCITE_BRICKS.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, QUARTZ_BEJEWELED_CALCITE_BRICK_WALL.get(), QUARTZ_BEJEWELED_CALCITE_BRICKS.get());

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, AMBER_STAND.get(), 1).define('#', ItemTags.WOODEN_SLABS).define('X', VVItemTags.GEMS_AMBER).pattern(" X ").pattern(" X ").pattern(" # ").unlockedBy("has_amber", has(VVItemTags.GEMS_AMBER)).save(consumer);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, AQUAMARINE_STAND.get(), 1).define('#', ItemTags.WOODEN_SLABS).define('X', VVItemTags.GEMS_AQUAMARINE).pattern(" X ").pattern(" X ").pattern(" # ").unlockedBy("has_amber", has(VVItemTags.GEMS_AQUAMARINE)).save(consumer);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, ENSTATITE_STAND.get(), 1).define('#', ItemTags.WOODEN_SLABS).define('X', VVItemTags.GEMS_ENSTATITE).pattern(" X ").pattern(" X ").pattern(" # ").unlockedBy("has_enstatite", has(VVItemTags.GEMS_ENSTATITE)).save(consumer);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, GARNET_STAND.get(), 1).define('#', ItemTags.WOODEN_SLABS).define('X', VVItemTags.GEMS_GARNET).pattern(" X ").pattern(" X ").pattern(" # ").unlockedBy("has_garnet", has(VVItemTags.GEMS_GARNET)).save(consumer);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, JADE_STAND.get(), 1).define('#', ItemTags.WOODEN_SLABS).define('X', VVItemTags.GEMS_JADE).pattern(" X ").pattern(" X ").pattern(" # ").unlockedBy("has_jade", has(VVItemTags.GEMS_JADE)).save(consumer);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, KUNZITE_STAND.get(), 1).define('#', ItemTags.WOODEN_SLABS).define('X', VVItemTags.GEMS_KUNZITE).pattern(" X ").pattern(" X ").pattern(" # ").unlockedBy("has_kunzite", has(VVItemTags.GEMS_KUNZITE)).save(consumer);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, LARIMAR_STAND.get(), 1).define('#', ItemTags.WOODEN_SLABS).define('X', VVItemTags.GEMS_LARIMAR).pattern(" X ").pattern(" X ").pattern(" # ").unlockedBy("has_larimar", has(VVItemTags.GEMS_LARIMAR)).save(consumer);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, MILKY_QUARTZ_STAND.get(), 1).define('#', ItemTags.WOODEN_SLABS).define('X', VVItemTags.GEMS_MILKY_QUARTZ).pattern(" X ").pattern(" X ").pattern(" # ").unlockedBy("has_milky_quartz", has(VVItemTags.GEMS_MILKY_QUARTZ)).save(consumer);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, MOONSTONE_STAND.get(), 1).define('#', ItemTags.WOODEN_SLABS).define('X', VVItemTags.GEMS_MOONSTONE).pattern(" X ").pattern(" X ").pattern(" # ").unlockedBy("has_moonstone", has(VVItemTags.GEMS_MOONSTONE)).save(consumer);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, ONYX_STAND.get(), 1).define('#', ItemTags.WOODEN_SLABS).define('X', VVItemTags.GEMS_ONYX).pattern(" X ").pattern(" X ").pattern(" # ").unlockedBy("has_onyx", has(VVItemTags.GEMS_ONYX)).save(consumer);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, PERIDOT_STAND.get(), 1).define('#', ItemTags.WOODEN_SLABS).define('X', VVItemTags.GEMS_PERIDOT).pattern(" X ").pattern(" X ").pattern(" # ").unlockedBy("has_peridot", has(VVItemTags.GEMS_PERIDOT)).save(consumer);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, ROSE_QUARTZ_STAND.get(), 1).define('#', ItemTags.WOODEN_SLABS).define('X', VVItemTags.GEMS_ROSE_QUARTZ).pattern(" X ").pattern(" X ").pattern(" # ").unlockedBy("has_rose_quartz", has(VVItemTags.GEMS_ROSE_QUARTZ)).save(consumer);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, SAPPHIRE_STAND.get(), 1).define('#', ItemTags.WOODEN_SLABS).define('X', VVItemTags.GEMS_SAPPHIRE).pattern(" X ").pattern(" X ").pattern(" # ").unlockedBy("has_sapphire", has(VVItemTags.GEMS_SAPPHIRE)).save(consumer);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, SMOKY_QUARTZ_STAND.get(), 1).define('#', ItemTags.WOODEN_SLABS).define('X', VVItemTags.GEMS_SMOKY_QUARTZ).pattern(" X ").pattern(" X ").pattern(" # ").unlockedBy("has_smoky_quartz", has(VVItemTags.GEMS_SMOKY_QUARTZ)).save(consumer);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, TAAFFEITE_STAND.get(), 1).define('#', ItemTags.WOODEN_SLABS).define('X', VVItemTags.GEMS_TAAFFEITE).pattern(" X ").pattern(" X ").pattern(" # ").unlockedBy("has_taaffeite", has(VVItemTags.GEMS_TAAFFEITE)).save(consumer);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, TOPAZ_STAND.get(), 1).define('#', ItemTags.WOODEN_SLABS).define('X', VVItemTags.GEMS_TOPAZ).pattern(" X ").pattern(" X ").pattern(" # ").unlockedBy("has_topaz", has(VVItemTags.GEMS_TOPAZ)).save(consumer);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, AMETHYST_STAND.get(), 1).define('#', ItemTags.WOODEN_SLABS).define('X', Tags.Items.GEMS_AMETHYST).pattern(" X ").pattern(" X ").pattern(" # ").unlockedBy("has_amethyst", has(Tags.Items.GEMS_AMETHYST)).save(consumer);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, DIAMOND_STAND.get(), 1).define('#', ItemTags.WOODEN_SLABS).define('X', Tags.Items.GEMS_DIAMOND).pattern(" X ").pattern(" X ").pattern(" # ").unlockedBy("has_diamond", has(Tags.Items.GEMS_DIAMOND)).save(consumer);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, EMERALD_STAND.get(), 1).define('#', ItemTags.WOODEN_SLABS).define('X', Tags.Items.GEMS_EMERALD).pattern(" X ").pattern(" X ").pattern(" # ").unlockedBy("has_emerald", has(Tags.Items.GEMS_EMERALD)).save(consumer);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, QUARTZ_STAND.get(), 1).define('#', ItemTags.WOODEN_SLABS).define('X', Tags.Items.GEMS_QUARTZ).pattern(" X ").pattern(" X ").pattern(" # ").unlockedBy("has_quartz", has(Tags.Items.GEMS_QUARTZ)).save(consumer);

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, GREEN_PINEAPPLE_SCALE_BLOCK.get(), 3).define('#', GREEN_PINEAPPLE.get()).pattern("##").pattern("##").unlockedBy("has_green_pineapple", has(GREEN_PINEAPPLE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, SPOTTED_PINEAPPLE_SCALE_BLOCK.get(), 3).define('#', SPOTTED_PINEAPPLE.get()).pattern("##").pattern("##").unlockedBy("has_spotted_pineapple", has(SPOTTED_PINEAPPLE.get())).save(consumer);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, PINEAPPLE_SCALE_BLOCK.get(), 3).define('#', PINEAPPLE.get()).pattern("##").pattern("##").unlockedBy("has_pineapple", has(PINEAPPLE.get())).save(consumer);

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, PINEAPPLE_FLESH_BLOCK.get(), 3).define('#', SKINNED_PINEAPPLE.get()).pattern("##").pattern("##").unlockedBy("has_pineapple", has(PINEAPPLE.get())).save(consumer);

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, SKINNED_PINEAPPLE.get(), 1).define('#', VVItems.PINEAPPLE_SLICE.get()).pattern("###").pattern("###").pattern("###").unlockedBy("has_pineapple_slice", has(VVItems.PINEAPPLE_SLICE.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(MISC, VVItems.PINEAPPLE_CHUNKS.get(), 2).requires(VVItems.PINEAPPLE_SLICE.get()).unlockedBy("has_pineapple_slice", has(VVItems.PINEAPPLE_SLICE.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(MISC, VVItems.PINEAPPLE_SEEDS.get()).requires(VVItems.PINEAPPLE_CHUNKS.get()).unlockedBy("has_pineapple_slice", has(VVItems.PINEAPPLE_SLICE.get())).save(consumer);

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, HONEYCOMB_BEJEWELED_LAMP.get(), 1).define('#', Items.HONEYCOMB).define('X', VVItemTags.GEMS).define('Y', Blocks.GLOWSTONE).pattern("#X#").pattern("XYX").pattern("#X#").unlockedBy("has_gems", has(VVItemTags.GEMS)).save(consumer);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, FLORAL_BEJEWELED_LAMP.get(), 1).define('#', ItemTags.FLOWERS).define('X', VVItemTags.GEMS).define('Y', Blocks.GLOWSTONE).pattern("#X#").pattern("XYX").pattern("#X#").unlockedBy("has_gems", has(VVItemTags.GEMS)).save(consumer);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, DIAMANTE_BEJEWELED_LAMP.get(), 1).define('#', Tags.Items.GLASS).define('X', VVItemTags.GEMS).define('Y', Blocks.GLOWSTONE).pattern("#X#").pattern("XYX").pattern("#X#").unlockedBy("has_gems", has(VVItemTags.GEMS)).save(consumer);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, BANDED_BEJEWELED_LAMP.get(), 1).define('#', Tags.Items.INGOTS_IRON).define('X', VVItemTags.GEMS).define('Y', Blocks.GLOWSTONE).pattern("#X#").pattern("XYX").pattern("#X#").unlockedBy("has_gems", has(VVItemTags.GEMS)).save(consumer);

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, OAK_PAPER_LANTERN.get(), 1).define('X', Blocks.OAK_PLANKS).define('#', Items.PAPER).define('Y', Blocks.TORCH).pattern("X#X").pattern("#Y#").pattern("X#X").unlockedBy("has_planks", has(ItemTags.PLANKS)).save(consumer);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, SPRUCE_PAPER_LANTERN.get(), 1).define('X', Blocks.SPRUCE_PLANKS).define('#', Items.PAPER).define('Y', Blocks.TORCH).pattern("X#X").pattern("#Y#").pattern("X#X").unlockedBy("has_planks", has(ItemTags.PLANKS)).save(consumer);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, BIRCH_PAPER_LANTERN.get(), 1).define('X', Blocks.BIRCH_PLANKS).define('#', Items.PAPER).define('Y', Blocks.TORCH).pattern("X#X").pattern("#Y#").pattern("X#X").unlockedBy("has_planks", has(ItemTags.PLANKS)).save(consumer);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, JUNGLE_PAPER_LANTERN.get(), 1).define('X', Blocks.JUNGLE_PLANKS).define('#', Items.PAPER).define('Y', Blocks.TORCH).pattern("X#X").pattern("#Y#").pattern("X#X").unlockedBy("has_planks", has(ItemTags.PLANKS)).save(consumer);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, ACACIA_PAPER_LANTERN.get(), 1).define('X', Blocks.ACACIA_PLANKS).define('#', Items.PAPER).define('Y', Blocks.TORCH).pattern("X#X").pattern("#Y#").pattern("X#X").unlockedBy("has_planks", has(ItemTags.PLANKS)).save(consumer);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, DARK_OAK_PAPER_LANTERN.get(), 1).define('X', Blocks.DARK_OAK_PLANKS).define('#', Items.PAPER).define('Y', Blocks.TORCH).pattern("X#X").pattern("#Y#").pattern("X#X").unlockedBy("has_planks", has(ItemTags.PLANKS)).save(consumer);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, WARPED_PAPER_LANTERN.get(), 1).define('X', Blocks.WARPED_PLANKS).define('#', Items.PAPER).define('Y', Blocks.TORCH).pattern("X#X").pattern("#Y#").pattern("X#X").unlockedBy("has_planks", has(ItemTags.PLANKS)).save(consumer);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, CRIMSON_PAPER_LANTERN.get(), 1).define('X', Blocks.CRIMSON_PLANKS).define('#', Items.PAPER).define('Y', Blocks.TORCH).pattern("X#X").pattern("#Y#").pattern("X#X").unlockedBy("has_planks", has(ItemTags.PLANKS)).save(consumer);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, MANGROVE_PAPER_LANTERN.get(), 1).define('X', Blocks.MANGROVE_PLANKS).define('#', Items.PAPER).define('Y', Blocks.TORCH).pattern("X#X").pattern("#Y#").pattern("X#X").unlockedBy("has_planks", has(ItemTags.PLANKS)).save(consumer);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, CHERRY_PAPER_LANTERN.get(), 1).define('X', Blocks.CHERRY_PLANKS).define('#', Items.PAPER).define('Y', Blocks.TORCH).pattern("X#X").pattern("#Y#").pattern("X#X").unlockedBy("has_planks", has(ItemTags.PLANKS)).save(consumer);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, BAMBOO_PAPER_LANTERN.get(), 1).define('X', Blocks.BAMBOO_PLANKS).define('#', Items.PAPER).define('Y', Blocks.TORCH).pattern("X#X").pattern("#Y#").pattern("X#X").unlockedBy("has_planks", has(ItemTags.PLANKS)).save(consumer);

        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, ORANGE_HIBISCUS_CARPET.get(), 3).define('#', ORANGE_HIBISCUS.get()).pattern("##").unlockedBy("has_orange_hibiscus", has(ORANGE_HIBISCUS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, RED_HIBISCUS_CARPET.get(), 3).define('#', RED_HIBISCUS.get()).pattern("##").unlockedBy("has_red_hibiscus", has(RED_HIBISCUS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, PURPLE_HIBISCUS_CARPET.get(), 3).define('#', PURPLE_HIBISCUS.get()).pattern("##").unlockedBy("has_purple_hibiscus", has(PURPLE_HIBISCUS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, PINK_HIBISCUS_CARPET.get(), 3).define('#', PINK_HIBISCUS.get()).pattern("##").unlockedBy("has_pink_hibiscus", has(PINK_HIBISCUS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(BUILDING_BLOCKS, WHITE_HIBISCUS_CARPET.get(), 3).define('#', WHITE_HIBISCUS.get()).pattern("##").unlockedBy("has_white_hibiscus", has(WHITE_HIBISCUS.get())).save(consumer);

    }

    public void storageRecipes(Consumer<FinishedRecipe> consumer, RecipeCategory itemCategory, ItemLike item, RecipeCategory storageCategory, ItemLike storage, String storageName, String storageGroup, String itemName, String itemGroup) {
        nineBlockStorageRecipes(consumer, itemCategory, item, storageCategory, storage, VintageVibes.MOD_ID + ":" + storageName, storageGroup, VintageVibes.MOD_ID + ":" + itemName, itemGroup);
    }
    public void storageRecipes(Consumer<FinishedRecipe> consumer, RecipeCategory itemCategory, ItemLike item, RecipeCategory storageCategory, ItemLike storage) {
        storageRecipes(consumer, itemCategory, item, storageCategory, storage, getSimpleRecipeName(storage), null, getSimpleRecipeName(item), null);
    }

    public void stonecutterRecipe(Consumer<FinishedRecipe> consumer, RecipeCategory category, ItemLike output, ItemLike input) {
        this.stonecutterRecipe(consumer, category, output, input, 1);
    }
    public void stonecutterRecipe(Consumer<FinishedRecipe> consumer, RecipeCategory category, ItemLike output, ItemLike input, int count) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(input), category, output, count).unlockedBy(getHasName(input), has(input)).save(consumer, this.getModConversionRecipeName(output, input) + "_stonecutting");
    }

    public ResourceLocation getModConversionRecipeName(ItemLike output, ItemLike input) {
        return new ResourceLocation(VintageVibes.MOD_ID, getConversionRecipeName(output, input));
    }

    private void wrap(RecipeBuilder builder, String name, Consumer<FinishedRecipe> consumer, ICondition... conditions) {
        wrap(builder, VintageVibes.MOD_ID, name, consumer, conditions);
    }

    private void wrap(RecipeBuilder builder, String modid, String name, Consumer<FinishedRecipe> consumer, ICondition... conditions) {
        ResourceLocation loc = new ResourceLocation(modid, name);
        ConditionalRecipe.Builder cond;
        if (conditions.length > 1) {
            cond = ConditionalRecipe.builder().addCondition(and(conditions));
        } else if (conditions.length == 1) {
            cond = ConditionalRecipe.builder().addCondition(conditions[0]);
        } else {
            cond = ConditionalRecipe.builder();
        }
        FinishedRecipe[] recipe = new FinishedRecipe[1];
        builder.save(f -> recipe[0] = f, loc);
        cond.addRecipe(recipe[0]).generateAdvancement().build(consumer, loc);
    }
}
