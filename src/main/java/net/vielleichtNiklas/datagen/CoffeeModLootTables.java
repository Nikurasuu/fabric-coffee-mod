package net.vielleichtNiklas.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.predicate.StatePredicate;
import net.vielleichtNiklas.blocks.CoffeeCropBlock;
import net.vielleichtNiklas.blocks.ModBlocks;
import net.vielleichtNiklas.items.ModItems;

public class CoffeeModLootTables extends FabricBlockLootTableProvider {
    public CoffeeModLootTables(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.COFFEE_CROP_BLOCK, drops(ModItems.COFFEE_BEANS));

        BlockStatePropertyLootCondition.Builder builder = BlockStatePropertyLootCondition.builder(ModBlocks.COFFEE_CROP_BLOCK).properties(StatePredicate.Builder.create()
            .exactMatch(CoffeeCropBlock.AGE, 4));
        // FIXME: This is a bit of a hack, but it works
        // cropDrops is meant to be used with a loot item and seperate seed item
        // but we want to drop the same item for both, just some more of it
        addDrop(ModBlocks.COFFEE_CROP_BLOCK, cropDrops(ModBlocks.COFFEE_CROP_BLOCK, ModItems.COFFEE_BEANS, ModItems.COFFEE_BEANS, builder));
    }
}
