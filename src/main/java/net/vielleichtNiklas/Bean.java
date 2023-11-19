package net.vielleichtNiklas;

import net.minecraft.item.FoodComponent;

public class Bean {
    public static final FoodComponent FOOD_COMPONENT = (new FoodComponent.Builder()).hunger(1).saturationModifier(0.1F).build();
    public static final FoodComponent ROASTED_FOOD_COMPONENT = (new FoodComponent.Builder()).hunger(2).saturationModifier(0.3F).build();
}