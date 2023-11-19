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
    	.icon(() -> new ItemStack(ModItems.ROASTED_COFFEE_BEAN))
    	.displayName(Text.translatable("Coffee Mod"))
            .entries((context, entries) -> {
    		entries.add(ModItems.ROASTED_COFFEE_BEAN);
			entries.add(ModItems.COFFEE_BEAN);
    	})
    	.build();


    public static void registerItemGroups(){
        Registry.register(Registries.ITEM_GROUP, new Identifier("coffeemod", "coffee_mod_item_group"), ITEM_GROUP);
    }
}
