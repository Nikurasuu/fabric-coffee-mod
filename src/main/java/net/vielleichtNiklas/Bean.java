package net.vielleichtNiklas;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class Bean extends Item {
    public Bean(Settings settings) {
        super(settings.food(Bean.FOOD_COMPONENT).maxCount(128));
    }

    public static final FoodComponent FOOD_COMPONENT = (new FoodComponent.Builder()).hunger(2).saturationModifier(0.1F).build();

    /* @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        playerEntity.playSound(SoundEvents.ENTITY_ENDERMAN_DEATH, 1.0F, 1.0F);
        return TypedActionResult.success(playerEntity.getStackInHand(hand));
    } */
}