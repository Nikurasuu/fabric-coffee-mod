package net.vielleichtNiklas.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class GermanLangProvider extends FabricLanguageProvider {
    public GermanLangProvider(FabricDataOutput dataOutput) {
        super(dataOutput, "de_de");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add("item.coffeemod.roasted_coffee_bean", "Geröstete Kaffeebohne");
        translationBuilder.add("item.coffeemod.coffee_bean", "Kaffeebohne");
    }
    
}
