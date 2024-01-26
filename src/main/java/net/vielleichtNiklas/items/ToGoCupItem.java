package net.vielleichtNiklas.items;

import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.Stats;
import net.minecraft.world.World;
import net.vielleichtNiklas.effects.ModStatusEffects;

public class ToGoCupItem extends DrinkableItem {

    public ToGoCupItem(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        super.finishUsing(stack, world, user);
        if (user instanceof ServerPlayerEntity serverPlayerEntity) {
            Criteria.CONSUME_ITEM.trigger(serverPlayerEntity, stack);
            serverPlayerEntity.addStatusEffect(new StatusEffectInstance(ModStatusEffects.CAFFEINE, 3600, 0));
            serverPlayerEntity.incrementStat(Stats.USED.getOrCreateStat(this));
        }
        return ItemStack.EMPTY;
    }

}