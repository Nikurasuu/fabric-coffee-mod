package net.vielleichtNiklas;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CoffeeMod implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("modid");

    public static final Bean ROASTED_COFFEE_BEAN = new Bean(new FabricItemSettings());
	public static final Bean COFFEE_BEAN = new Bean(new FabricItemSettings());

	private static final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
    	.icon(() -> new ItemStack(ROASTED_COFFEE_BEAN))
    	.displayName(Text.translatable("Coffee Mod"))
            .entries((context, entries) -> {
    		entries.add(ROASTED_COFFEE_BEAN);
			entries.add(COFFEE_BEAN);
    	})
    	.build();

	@Override
	public void onInitialize() {
		
		Registry.register(Registries.ITEM, new Identifier("coffeemod", "roasted_coffee_bean"), ROASTED_COFFEE_BEAN);
		Registry.register(Registries.ITEM, new Identifier("coffeemod", "coffee_bean"), COFFEE_BEAN);

		Registry.register(Registries.ITEM_GROUP, new Identifier("coffeemod", "coffee_nod"), ITEM_GROUP);

	}
}