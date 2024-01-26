package net.vielleichtNiklas.effects;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModStatusEffects {
    public static final CaffeineStatusEffect CAFFEINE = new CaffeineStatusEffect();

    public static void registerStatusEffects() {
        Registry.register(Registries.STATUS_EFFECT, new Identifier("coffeemod", "caffeine"), CAFFEINE);
    }
}
