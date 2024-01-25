package net.vielleichtNiklas.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.vielleichtNiklas.blocks.ModBlocks;
import net.vielleichtNiklas.food.ModFoodComponents;

public class ModItems {
    public static final Item ROASTED_COFFEE_BEANS = new Item(new FabricItemSettings().food(ModFoodComponents.ROASTED_BEANS));
    public static final Item COFFEE_BEANS = new AliasedBlockItem(ModBlocks.COFFEE_CROP_BLOCK, new FabricItemSettings().food(ModFoodComponents.BEANS));
    public static final Item GROUND_COFFEE = new Item(new FabricItemSettings().maxCount(16));

    public static final Item ESPRESSO_CUP = new Item(new FabricItemSettings().maxCount(1));
    public static final Item ESPRESSO = new EspressoItem(new FabricItemSettings().maxCount(1).food(ModFoodComponents.ESPRESSO));

    public static final Item COFFEE_CUP = new Item(new FabricItemSettings().maxCount(1));
    public static final Item BLACK_COFFEE = new CoffeeCupItem(new FabricItemSettings().maxCount(1).food(ModFoodComponents.BLACK_COFFEE));
    public static final Item CAPPUCCINO = new CoffeeCupItem(new FabricItemSettings().maxCount(1).food(ModFoodComponents.CAPPUCCINO));

    public static final Item PAPER_CUP = new Item(new FabricItemSettings().maxCount(16));
    public static final Item BLACK_COFFEE_TO_GO = new ToGoItem(new FabricItemSettings().maxCount(1).food(ModFoodComponents.BLACK_COFFEE));
    public static final Item CAPPUCCINO_TO_GO = new ToGoItem(new FabricItemSettings().maxCount(1).food(ModFoodComponents.CAPPUCCINO));

    public static void registerItems() {
        Registry.register(Registries.ITEM, new Identifier("coffeemod", "roasted_coffee_beans"), ROASTED_COFFEE_BEANS);
        Registry.register(Registries.ITEM, new Identifier("coffeemod", "coffee_beans"), COFFEE_BEANS);
        Registry.register(Registries.ITEM, new Identifier("coffeemod", "ground_coffee"), GROUND_COFFEE);

        Registry.register(Registries.ITEM, new Identifier("coffeemod", "espresso_cup"), ESPRESSO_CUP);
        Registry.register(Registries.ITEM, new Identifier("coffeemod", "espresso"), ESPRESSO);

        Registry.register(Registries.ITEM, new Identifier("coffeemod", "coffee_cup"), COFFEE_CUP);
        Registry.register(Registries.ITEM, new Identifier("coffeemod", "black_coffee"), BLACK_COFFEE);
        Registry.register(Registries.ITEM, new Identifier("coffeemod", "cappuccino"), CAPPUCCINO);

        Registry.register(Registries.ITEM, new Identifier("coffeemod", "paper_cup"), PAPER_CUP);
        Registry.register(Registries.ITEM, new Identifier("coffeemod", "black_coffee_to_go"), BLACK_COFFEE_TO_GO);
        Registry.register(Registries.ITEM, new Identifier("coffeemod", "cappuccino_to_go"), CAPPUCCINO_TO_GO);
    }
}