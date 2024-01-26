package net.vielleichtNiklas;

import net.fabricmc.api.ModInitializer;
import net.vielleichtNiklas.blocks.ModBlocks;
import net.vielleichtNiklas.effects.ModStatusEffects;
import net.vielleichtNiklas.itemgroups.ModItemGroups;
import net.vielleichtNiklas.items.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CoffeeMod implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("CoffeeMod");

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing CoffeeMod");
		ModBlocks.registerBlocks();
		ModItems.registerItems();
		ModItemGroups.registerItemGroups();
		ModStatusEffects.registerStatusEffects();
		LOGGER.info("CoffeeMod initialized");
	}
}