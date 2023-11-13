package net.vielleichtNiklas;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class Bean extends Item {
    public Bean(Settings settings) {
        super(settings.food(Bean.FOOD_COMPONENT));
    }

    public static final FoodComponent FOOD_COMPONENT = (new FoodComponent.Builder()).hunger(2).saturationModifier(0.1F).build();
}