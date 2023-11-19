package net.vielleichtNiklas.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class EnglishLangProvider extends FabricLanguageProvider {

    public EnglishLangProvider(FabricDataOutput dataOutput) {
        super(dataOutput, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add("item.coffeemod.roasted_coffee_bean", "Roasted Coffee Bean");
        translationBuilder.add("item.coffeemod.coffee_bean", "Coffee Bean");
    }
    
}
