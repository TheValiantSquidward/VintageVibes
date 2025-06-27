package net.thevaliantsquidward.vintagevibes.data;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.ConditionalRecipe;
import net.minecraftforge.common.crafting.conditions.ICondition;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.thevaliantsquidward.vintagevibes.VintageVibes;
import net.thevaliantsquidward.vintagevibes.registry.VVItems;

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

        generateRecipes(consumer, AMBER_TILES_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, AMBER_TILES.get(), POLISHED_AMBER.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, AMBER_TILE_SLAB.get(), AMBER_TILES.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, AMBER_TILE_STAIRS.get(), AMBER_TILES.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, AMBER_TILE_WALL.get(), AMBER_TILES.get());

        generateRecipes(consumer, AQUAMARINE_TILES_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, AQUAMARINE_TILES.get(), POLISHED_AQUAMARINE.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, AQUAMARINE_TILE_SLAB.get(), AQUAMARINE_TILES.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, AQUAMARINE_TILE_STAIRS.get(), AQUAMARINE_TILES.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, AQUAMARINE_TILE_WALL.get(), AQUAMARINE_TILES.get());

        generateRecipes(consumer, ENSTATITE_TILES_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, ENSTATITE_TILES.get(), POLISHED_ENSTATITE.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, ENSTATITE_TILE_SLAB.get(), ENSTATITE_TILES.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, ENSTATITE_TILE_STAIRS.get(), ENSTATITE_TILES.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, ENSTATITE_TILE_WALL.get(), ENSTATITE_TILES.get());

        generateRecipes(consumer, GARNET_TILES_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, GARNET_TILES.get(), POLISHED_GARNET.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, GARNET_TILE_SLAB.get(), GARNET_TILES.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, GARNET_TILE_STAIRS.get(), GARNET_TILES.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, GARNET_TILE_WALL.get(), GARNET_TILES.get());

        generateRecipes(consumer, JADE_TILES_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, JADE_TILES.get(), POLISHED_JADE.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, JADE_TILE_SLAB.get(), JADE_TILES.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, JADE_TILE_STAIRS.get(), JADE_TILES.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, JADE_TILE_WALL.get(), JADE_TILES.get());

        generateRecipes(consumer, KUNZITE_TILES_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, KUNZITE_TILES.get(), POLISHED_KUNZITE.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, KUNZITE_TILE_SLAB.get(), KUNZITE_TILES.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, KUNZITE_TILE_STAIRS.get(), KUNZITE_TILES.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, KUNZITE_TILE_WALL.get(), KUNZITE_TILES.get());

        generateRecipes(consumer, LARIMAR_TILES_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, LARIMAR_TILES.get(), POLISHED_LARIMAR.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, LARIMAR_TILE_SLAB.get(), LARIMAR_TILES.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, LARIMAR_TILE_STAIRS.get(), LARIMAR_TILES.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, LARIMAR_TILE_WALL.get(), LARIMAR_TILES.get());

        generateRecipes(consumer, MILKY_QUARTZ_TILES_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, MILKY_QUARTZ_TILES.get(), POLISHED_MILKY_QUARTZ.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, MILKY_QUARTZ_TILE_SLAB.get(), MILKY_QUARTZ_TILES.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, MILKY_QUARTZ_TILE_STAIRS.get(), MILKY_QUARTZ_TILES.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, MILKY_QUARTZ_TILE_WALL.get(), MILKY_QUARTZ_TILES.get());

        generateRecipes(consumer, MOONSTONE_TILES_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, MOONSTONE_TILES.get(), POLISHED_MOONSTONE.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, MOONSTONE_TILE_SLAB.get(), MOONSTONE_TILES.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, MOONSTONE_TILE_STAIRS.get(), MOONSTONE_TILES.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, MOONSTONE_TILE_WALL.get(), MOONSTONE_TILES.get());

        generateRecipes(consumer, ONYX_TILES_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, ONYX_TILES.get(), POLISHED_ONYX.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, ONYX_TILE_SLAB.get(), ONYX_TILES.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, ONYX_TILE_STAIRS.get(), ONYX_TILES.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, ONYX_TILE_WALL.get(), ONYX_TILES.get());

        generateRecipes(consumer, PERIDOT_TILES_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, PERIDOT_TILES.get(), POLISHED_PERIDOT.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, PERIDOT_TILE_SLAB.get(), PERIDOT_TILES.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, PERIDOT_TILE_STAIRS.get(), PERIDOT_TILES.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, PERIDOT_TILE_WALL.get(), PERIDOT_TILES.get());

        generateRecipes(consumer, ROSE_QUARTZ_TILES_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, ROSE_QUARTZ_TILES.get(), POLISHED_ROSE_QUARTZ.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, ROSE_QUARTZ_TILE_SLAB.get(), ROSE_QUARTZ_TILES.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, ROSE_QUARTZ_TILE_STAIRS.get(), ROSE_QUARTZ_TILES.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, ROSE_QUARTZ_TILE_WALL.get(), ROSE_QUARTZ_TILES.get());

        generateRecipes(consumer, SAPPHIRE_TILES_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, SAPPHIRE_TILES.get(), POLISHED_SAPPHIRE.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, SAPPHIRE_TILE_SLAB.get(), SAPPHIRE_TILES.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, SAPPHIRE_TILE_STAIRS.get(), SAPPHIRE_TILES.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, SAPPHIRE_TILE_WALL.get(), SAPPHIRE_TILES.get());

        generateRecipes(consumer, SMOKY_QUARTZ_TILES_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, SMOKY_QUARTZ_TILES.get(), POLISHED_SMOKY_QUARTZ.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, SMOKY_QUARTZ_TILE_SLAB.get(), SMOKY_QUARTZ_TILES.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, SMOKY_QUARTZ_TILE_STAIRS.get(), SMOKY_QUARTZ_TILES.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, SMOKY_QUARTZ_TILE_WALL.get(), SMOKY_QUARTZ_TILES.get());

        generateRecipes(consumer, TAAFFEITE_TILES_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, TAAFFEITE_TILES.get(), POLISHED_TAAFFEITE.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, TAAFFEITE_TILE_SLAB.get(), TAAFFEITE_TILES.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, TAAFFEITE_TILE_STAIRS.get(), TAAFFEITE_TILES.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, TAAFFEITE_TILE_WALL.get(), TAAFFEITE_TILES.get());

        generateRecipes(consumer, TOPAZ_TILES_FAMILY);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, TOPAZ_TILES.get(), POLISHED_TOPAZ.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, TOPAZ_TILE_SLAB.get(), TOPAZ_TILES.get(), 2);
        stonecutterRecipe(consumer, BUILDING_BLOCKS, TOPAZ_TILE_STAIRS.get(), TOPAZ_TILES.get());
        stonecutterRecipe(consumer, BUILDING_BLOCKS, TOPAZ_TILE_WALL.get(), TOPAZ_TILES.get());
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
