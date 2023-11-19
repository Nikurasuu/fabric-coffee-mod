package net.vielleichtNiklas.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final CoffeeCropBlock COFFEE_CROP_BLOCK = new CoffeeCropBlock(AbstractBlock.Settings.create().nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));

    public static void registerBlocks() {
        Registry.register(Registries.BLOCK, new Identifier("coffeemod", "coffee_crop_block"), COFFEE_CROP_BLOCK);
    }
}
