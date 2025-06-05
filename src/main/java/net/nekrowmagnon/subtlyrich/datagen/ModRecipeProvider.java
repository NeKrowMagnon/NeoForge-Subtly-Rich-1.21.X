package net.nekrowmagnon.subtlyrich.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.nekrowmagnon.subtlyrich.block.ModBlocks;
import net.nekrowmagnon.subtlyrich.item.ModItems;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, Blocks.SOUL_SAND)
                .pattern("WS")
                .pattern("SW")
                .define('W', ModItems.WITHERING_SCULK_REMNANT.get())
                .define('S', Blocks.SAND)
                .unlockedBy("has_withering_sculk_remnant", has(ModItems.WITHERING_SCULK_REMNANT)).save(recipeOutput);




        stairBuilder(ModBlocks.SHULK_STAIRS.get(), Ingredient.of(ModBlocks.SHULK_PLANKS)).group("shulk")
                .unlockedBy("has_shulk", has(ModBlocks.SHULK_PLANKS)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SHULK_SLAB.get(), ModBlocks.SHULK_PLANKS.get());

        buttonBuilder(ModBlocks.SHULK_BUTTON.get(), Ingredient.of(ModBlocks.SHULK_PLANKS.get())).group("shulk")
                .unlockedBy("has_shulk", has(ModBlocks.SHULK_PLANKS.get())).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.SHULK_PRESSURE_PLATE.get(), ModBlocks.SHULK_PLANKS.get());

        fenceBuilder(ModBlocks.SHULK_FENCE.get(), Ingredient.of(ModBlocks.SHULK_PLANKS.get())).group("shulk")
                .unlockedBy("has_shulk", has(ModBlocks.SHULK_PLANKS.get())).save(recipeOutput);
        fenceGateBuilder(ModBlocks.SHULK_FENCE_GATE.get(), Ingredient.of(ModBlocks.SHULK_PLANKS.get())).group("shulk")
                .unlockedBy("has_shulk", has(ModBlocks.SHULK_PLANKS.get())).save(recipeOutput);
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SHULK_WALL.get(), ModBlocks.SHULK_PLANKS.get());

        doorBuilder(ModBlocks.SHULK_DOOR.get(), Ingredient.of(ModBlocks.SHULK_PLANKS.get())).group("shulk")
                .unlockedBy("has_shulk", has(ModBlocks.SHULK_PLANKS.get())).save(recipeOutput);
        trapdoorBuilder(ModBlocks.SHULK_TRAPDOOR.get(), Ingredient.of(ModBlocks.SHULK_PLANKS.get())).group("shulk")
                .unlockedBy("has_shulk", has(ModBlocks.SHULK_PLANKS.get())).save(recipeOutput);
    }
}
