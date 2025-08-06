package net.thevaliantsquidward.vintagevibes.registry;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class VVFoodValues {

    public static final FoodProperties COPPER_APPLE = (new FoodProperties.Builder())
            .nutrition(4).saturationMod(0.3F)
            .effect(() -> new MobEffectInstance(MobEffects.POISON, 300, 2), 0.75F)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 600, 1), 0.5F)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 1), 0.5F)
            .build();

}
