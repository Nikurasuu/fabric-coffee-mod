package net.vielleichtNiklas.datagen;

import java.util.List;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.vielleichtNiklas.items.ModItems;
import net.minecraft.item.Items;

public class CoffeeModRecipes extends FabricRecipeProvider {
    private static final List<ItemConvertible> COFFEE_SMELTABLES = List.of(ModItems.COFFEE_BEANS);

    public CoffeeModRecipes(FabricDataOutput generator) {
        super(generator);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerSmelting(exporter, COFFEE_SMELTABLES, RecipeCategory.FOOD, ModItems.ROASTED_COFFEE_BEANS, 0.7f, 100, "roasted_coffee_bean_smelting");
        offerBlasting(exporter, COFFEE_SMELTABLES, RecipeCategory.FOOD, ModItems.ROASTED_COFFEE_BEANS, 0.5f, 35, "roasted_coffee_bean_blasting");
        
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.GROUND_COFFEE)
            .input(ModItems.ROASTED_COFFEE_BEANS)
            .criterion(FabricRecipeProvider.hasItem(ModItems.ROASTED_COFFEE_BEANS), FabricRecipeProvider.conditionsFromItem(ModItems.ROASTED_COFFEE_BEANS))
            .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.ESPRESSO_CUP)
                .input(Items.WHITE_DYE)
                .input(Items.BRICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.ROASTED_COFFEE_BEANS), FabricRecipeProvider.conditionsFromItem(ModItems.ROASTED_COFFEE_BEANS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.COFFEE_CUP).pattern("bib").pattern(" b ")
                .input('b' , Items.BRICK)
                .input('i', Items.WHITE_DYE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.COFFEE_CUP), FabricRecipeProvider.conditionsFromItem(ModItems.COFFEE_CUP))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.PAPER_CUP).pattern("p p").pattern(" p ")
                .input('p', Items.PAPER)
                .criterion(FabricRecipeProvider.hasItem(ModItems.PAPER_CUP), FabricRecipeProvider.conditionsFromItem(ModItems.PAPER_CUP))
                .offerTo(exporter);

    }
}
