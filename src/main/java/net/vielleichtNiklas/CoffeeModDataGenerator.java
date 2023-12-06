package net.vielleichtNiklas;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.vielleichtNiklas.datagen.CoffeeModLootTables;
import net.vielleichtNiklas.datagen.CoffeeModModels;
import net.vielleichtNiklas.datagen.CoffeeModRecipes;
import net.vielleichtNiklas.datagen.EnglishLangProvider;
import net.vielleichtNiklas.datagen.GermanLangProvider;

public class CoffeeModDataGenerator implements DataGeneratorEntrypoint{

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        FabricDataGenerator.Pack pack = generator.createPack();
        pack.addProvider(EnglishLangProvider::new);
        pack.addProvider(GermanLangProvider::new);
        pack.addProvider(CoffeeModLootTables::new);
        pack.addProvider(CoffeeModModels::new);
        pack.addProvider(CoffeeModRecipes::new);
    }
}
