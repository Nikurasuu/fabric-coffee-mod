package net.vielleichtNiklas;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class CoffeeModDataGenerator implements DataGeneratorEntrypoint{

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        FabricDataGenerator.Pack pack = generator.createPack();
        pack.addProvider(EnglishLangProvider::new);
        pack.addProvider(GermanLangProvider::new);
    }

    private static class EnglishLangProvider extends FabricLanguageProvider {
        private EnglishLangProvider(FabricDataOutput dataGenerator) {
            super(dataGenerator, "en_us");
        }
    
        @Override
        public void generateTranslations(TranslationBuilder translationBuilder) {
            translationBuilder.add("item.coffeemod.roasted_coffee_bean", "Roasted Coffee Bean");
            translationBuilder.add("itemGroup.coffeemod.coffee_nod", "Coffee Mod");
        }
    }

    private static class GermanLangProvider extends FabricLanguageProvider {
        private GermanLangProvider(FabricDataOutput dataGenerator) {
            super(dataGenerator, "de_de");
        }
    
        @Override
        public void generateTranslations(TranslationBuilder translationBuilder) {
            translationBuilder.add("item.coffeemod.roasted_coffee_bean", "Geröstete Kaffeebohne");
            translationBuilder.add("itemGroup.coffeemod.coffee_nod", "Kaffee Mod");
        }
    }
    
}
