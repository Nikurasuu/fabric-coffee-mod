package net.vielleichtNiklas.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.vielleichtNiklas.blocks.CoffeeCropBlock;
import net.vielleichtNiklas.blocks.ModBlocks;
import net.vielleichtNiklas.items.ModItems;

public class CoffeeModModels extends FabricModelProvider {
    public CoffeeModModels(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCrop(ModBlocks.COFFEE_CROP_BLOCK, CoffeeCropBlock.AGE, 0,1,2,3,4);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.ROASTED_COFFEE_BEANS, Models.GENERATED);
        itemModelGenerator.register(ModItems.GROUND_COFFEE, Models.GENERATED);

        // TODO: Add textures for these items
        itemModelGenerator.register(ModItems.ESPRESSO_CUP, Models.GENERATED);
        itemModelGenerator.register(ModItems.ESPRESSO, Models.GENERATED);

        itemModelGenerator.register(ModItems.COFFEE_CUP, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLACK_COFFEE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CAPPUCCINO, Models.GENERATED);

        itemModelGenerator.register(ModItems.PAPER_CUP, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLACK_COFFEE_TO_GO, Models.GENERATED);
        itemModelGenerator.register(ModItems.CAPPUCCINO_TO_GO, Models.GENERATED);
    }
}