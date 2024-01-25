package net.vielleichtNiklas.food;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent BEANS = (new FoodComponent.Builder()).hunger(1).saturationModifier(0.1F).build();
    public static final FoodComponent ROASTED_BEANS = (new FoodComponent.Builder()).hunger(2).saturationModifier(0.3F).build();

    public static final FoodComponent ESPRESSO = (new FoodComponent.Builder()).hunger(1).saturationModifier(0.1F).build();
    public static final FoodComponent BLACK_COFFEE = (new FoodComponent.Builder()).hunger(2).saturationModifier(0.3F).build();
    public static final FoodComponent CAPPUCCINO = (new FoodComponent.Builder()).hunger(4).saturationModifier(0.5F).build();
}