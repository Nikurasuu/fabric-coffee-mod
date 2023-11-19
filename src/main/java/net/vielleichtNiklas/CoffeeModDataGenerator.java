package net.vielleichtNiklas;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.predicate.StatePredicate;

//TODO: Move classes to seperate files
public class CoffeeModDataGenerator implements DataGeneratorEntrypoint{

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        FabricDataGenerator.Pack pack = generator.createPack();
        pack.addProvider(EnglishLangProvider::new);
        pack.addProvider(GermanLangProvider::new);
        pack.addProvider(CoffeeModLootTables::new);
        pack.addProvider(CoffeeModModels::new);
    }

    private static class CoffeeModModels extends FabricModelProvider {
        private CoffeeModModels(FabricDataOutput dataGenerator) {
            super(dataGenerator);
        }

        @Override
        public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
            blockStateModelGenerator.registerCrop(CoffeeMod.COFFEE_CROP_BLOCK, CoffeeCropBlock.AGE, 0,1,2,3);
        }
    
        @Override
        public void generateItemModels(ItemModelGenerator itemModelGenerator) {
            itemModelGenerator.register(CoffeeMod.ROASTED_COFFEE_BEAN, Models.GENERATED);
        }
    }

    private static class CoffeeModLootTables extends FabricBlockLootTableProvider {
        public CoffeeModLootTables(FabricDataOutput dataGenerator) {
            super(dataGenerator);
        }

        @Override
        public void generate() {
            addDrop(CoffeeMod.COFFEE_CROP_BLOCK, drops(CoffeeMod.COFFEE_BEAN));

            BlockStatePropertyLootCondition.Builder builder = BlockStatePropertyLootCondition.builder(CoffeeMod.COFFEE_CROP_BLOCK).properties(StatePredicate.Builder.create()
                .exactMatch(CoffeeCropBlock.AGE, 3));
            // FIXME: This is a bit of a hack, but it works
            // cropDrops is meant to be used with a loot item and seperate seed item
            // but we want to drop the same item for both, just some more of it
            addDrop(CoffeeMod.COFFEE_CROP_BLOCK, cropDrops(CoffeeMod.COFFEE_CROP_BLOCK, CoffeeMod.COFFEE_BEAN, CoffeeMod.COFFEE_BEAN, builder));
        }
    }

    private static class EnglishLangProvider extends FabricLanguageProvider {
        private EnglishLangProvider(FabricDataOutput dataGenerator) {
            super(dataGenerator, "en_us");
        }
    
        @Override
        public void generateTranslations(TranslationBuilder translationBuilder) {
            translationBuilder.add("item.coffeemod.roasted_coffee_bean", "Roasted Coffee Bean");
            translationBuilder.add("item.coffeemod.coffee_bean", "Coffee Bean");
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
            translationBuilder.add("item.coffeemod.coffee_bean", "Kaffeebohne");
            translationBuilder.add("itemGroup.coffeemod.coffee_nod", "Kaffee Mod");
        }
    }
    
}
