package net.vielleichtNiklas.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class GermanLangProvider extends FabricLanguageProvider {
    public GermanLangProvider(FabricDataOutput dataOutput) {
        super(dataOutput, "de_de");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add("item.coffeemod.roasted_coffee_beans", "Geröstete Kaffeebohnen");
        translationBuilder.add("item.coffeemod.coffee_beans", "Kaffeebohnen");
        translationBuilder.add("item.coffeemod.ground_coffee", "Gemahlener Kaffee");

        translationBuilder.add("item.coffeemod.espresso_cup", "Espressotasse");
        translationBuilder.add("item.coffeemod.coffee_cup", "Kaffeetasse");
        translationBuilder.add("item.coffeemod.espresso", "Espresso");
        translationBuilder.add("item.coffeemod.black_coffee", "Schwarzer Kaffee");
        translationBuilder.add("item.coffeemod.cappuccino", "Cappuccino");

        translationBuilder.add("item.coffeemod.paper_cup", "Pappbecher");
        translationBuilder.add("item.coffeemod.espresso_to_go", "Espresso zum Mitnehmen");
        translationBuilder.add("item.coffeemod.black_coffee_to_go", "Schwarzer Kaffee zum Mitnehmen");
        translationBuilder.add("item.coffeemod.cappuccino_to_go", "Cappuccino zum Mitnehmen");
    }
}
