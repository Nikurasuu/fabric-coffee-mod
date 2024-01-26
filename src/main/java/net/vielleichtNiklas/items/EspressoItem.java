package net.vielleichtNiklas.items;

import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.Stats;
import net.minecraft.world.World;
import net.vielleichtNiklas.effects.ModStatusEffects;

public class EspressoItem extends DrinkableItem {

    public EspressoItem(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        super.finishUsing(stack, world, user);
        if (user instanceof ServerPlayerEntity serverPlayerEntity) {
            Criteria.CONSUME_ITEM.trigger(serverPlayerEntity, stack);
            serverPlayerEntity.addStatusEffect(new StatusEffectInstance(ModStatusEffects.CAFFEINE, 1800, 1));
            serverPlayerEntity.incrementStat(Stats.USED.getOrCreateStat(this));
        }
        return new ItemStack(ModItems.ESPRESSO_CUP);
    }

}