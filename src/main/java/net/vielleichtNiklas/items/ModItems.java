package net.vielleichtNiklas.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.vielleichtNiklas.blocks.ModBlocks;

public class ModItems {
    public static final Item ROASTED_COFFEE_BEANS = new Item(new FabricItemSettings().food(Bean.ROASTED_FOOD_COMPONENT));
    public static final Item COFFEE_BEANS = new AliasedBlockItem(ModBlocks.COFFEE_CROP_BLOCK, new FabricItemSettings().food(Bean.FOOD_COMPONENT));
    public static final Item GROUND_COFFEE = new Item(new FabricItemSettings());
    public static final Item ESPRESSO_CUP = new Item(new FabricItemSettings());
    public static final Item COFFEE_CUP = new Item(new FabricItemSettings());
    public static final Item ESPRESSO = new Item(new FabricItemSettings());
    public static final Item BLACK_COFFEE = new Item(new FabricItemSettings());
    public static final Item CAPPUCCINO = new Item(new FabricItemSettings());

    public static void registerItems() {
        Registry.register(Registries.ITEM, new Identifier("coffeemod", "roasted_coffee_beans"), ROASTED_COFFEE_BEANS);
        Registry.register(Registries.ITEM, new Identifier("coffeemod", "coffee_beans"), COFFEE_BEANS);
        Registry.register(Registries.ITEM, new Identifier("coffeemod", "ground_coffee"), GROUND_COFFEE);
        Registry.register(Registries.ITEM, new Identifier("coffeemod", "espresso_cup"), ESPRESSO_CUP);
        Registry.register(Registries.ITEM, new Identifier("coffeemod", "coffee_cup"), COFFEE_CUP);
        Registry.register(Registries.ITEM, new Identifier("coffeemod", "espresso"), ESPRESSO);
        Registry.register(Registries.ITEM, new Identifier("coffeemod", "black_coffee"), BLACK_COFFEE);
        Registry.register(Registries.ITEM, new Identifier("coffeemod", "cappuccino"), CAPPUCCINO);
    }
}