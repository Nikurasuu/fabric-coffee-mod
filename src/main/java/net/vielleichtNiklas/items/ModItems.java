package net.vielleichtNiklas.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.vielleichtNiklas.blocks.ModBlocks;

public class ModItems {
    public static final Item ROASTED_COFFEE_BEAN = new Item(new FabricItemSettings().food(Bean.ROASTED_FOOD_COMPONENT));
    public static final Item COFFEE_BEAN = new AliasedBlockItem(ModBlocks.COFFEE_CROP_BLOCK, new FabricItemSettings().food(Bean.FOOD_COMPONENT));

    public static void registerItems() {
        Registry.register(Registries.ITEM, new Identifier("coffeemod", "roasted_coffee_bean"), ROASTED_COFFEE_BEAN);
        Registry.register(Registries.ITEM, new Identifier("coffeemod", "coffee_bean"), COFFEE_BEAN);
    }
}