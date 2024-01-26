package net.vielleichtNiklas.effects;

import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class CaffeineStatusEffect extends StatusEffect {
    public CaffeineStatusEffect() {
        super( StatusEffectCategory.BENEFICIAL,0x98D982);
        this.addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, "91AEAA56-376B-4498-935B-2F7F68070635", 0.2, EntityAttributeModifier.Operation.MULTIPLY_TOTAL);
        this.addAttributeModifier(EntityAttributes.GENERIC_ATTACK_SPEED, "91AEAA56-376B-4498-935B-2F7F68070635", 0.2, EntityAttributeModifier.Operation.MULTIPLY_TOTAL);
    }
}
