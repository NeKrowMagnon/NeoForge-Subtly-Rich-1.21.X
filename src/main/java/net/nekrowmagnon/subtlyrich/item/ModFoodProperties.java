package net.nekrowmagnon.subtlyrich.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties SHULKER_PALP = new FoodProperties.Builder().nutrition(5).saturationModifier(1f)
            .alwaysEdible().effect(() -> new MobEffectInstance(MobEffects.LEVITATION, 100), 1f).build();

}
