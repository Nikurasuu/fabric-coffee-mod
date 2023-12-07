package net.vielleichtNiklas.datagen;

import java.util.List;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.vielleichtNiklas.items.ModItems;

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
    }
}
