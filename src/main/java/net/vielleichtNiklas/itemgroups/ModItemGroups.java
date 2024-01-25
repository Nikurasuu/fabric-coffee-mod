package net.vielleichtNiklas.itemgroups;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.vielleichtNiklas.items.ModItems;

public class ModItemGroups {
    private static final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
    	.icon(() -> new ItemStack(ModItems.ROASTED_COFFEE_BEANS))
    	.displayName(Text.translatable("Coffee Mod"))
            .entries((context, entries) -> {
    		entries.add(ModItems.ROASTED_COFFEE_BEANS);
			entries.add(ModItems.COFFEE_BEANS);
			entries.add(ModItems.GROUND_COFFEE);

			entries.add(ModItems.ESPRESSO_CUP);
			entries.add(ModItems.ESPRESSO);

			entries.add(ModItems.COFFEE_CUP);
			entries.add(ModItems.BLACK_COFFEE);
			entries.add(ModItems.CAPPUCCINO);

			entries.add(ModItems.PAPER_CUP);
			entries.add(ModItems.BLACK_COFFEE_TO_GO);
			entries.add(ModItems.CAPPUCCINO_TO_GO);
    	})
    	.build();


    public static void registerItemGroups(){
        Registry.register(Registries.ITEM_GROUP, new Identifier("coffeemod", "coffee_mod_item_group"), ITEM_GROUP);
    }
}
