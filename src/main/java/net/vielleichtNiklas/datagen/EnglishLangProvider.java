package net.vielleichtNiklas.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class EnglishLangProvider extends FabricLanguageProvider {

    public EnglishLangProvider(FabricDataOutput dataOutput) {
        super(dataOutput, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add("item.coffeemod.roasted_coffee_beans", "Roasted Coffee Beans");
        translationBuilder.add("item.coffeemod.coffee_beans", "Coffee Beans");
        translationBuilder.add("item.coffeemod.ground_coffee", "Ground Coffee");

        translationBuilder.add("item.coffeemod.espresso_cup", "Espresso Cup");
        translationBuilder.add("item.coffeemod.coffee_cup", "Coffee Cup");
        translationBuilder.add("item.coffeemod.espresso", "Espresso");
        translationBuilder.add("item.coffeemod.black_coffee", "Black Coffee");
        translationBuilder.add("item.coffeemod.cappuccino", "Cappuccino");

        translationBuilder.add("item.coffeemod.paper_cup", "Paper Cup");
        translationBuilder.add("item.coffeemod.espresso_to_go", "Espresso To Go");
        translationBuilder.add("item.coffeemod.black_coffee_to_go", "Black Coffee To Go");
        translationBuilder.add("item.coffeemod.cappuccino_to_go", "Cappuccino To Go");
    }
}
