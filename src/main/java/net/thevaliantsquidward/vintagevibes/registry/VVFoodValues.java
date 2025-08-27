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

    public static final FoodProperties PINEAPPLE_SLICE = (new FoodProperties.Builder())
            .nutrition(4).saturationMod(0.2F)
            .build();

    public static final FoodProperties PINEAPPLE_CHUNKS = (new FoodProperties.Builder())
            .nutrition(2).saturationMod(0.2F)
            .fast()
            .build();

    public static final FoodProperties GRAPEFRUIT = (new FoodProperties.Builder())
            .nutrition(4).saturationMod(0.2F)
            .build();

    public static final FoodProperties LEMON = (new FoodProperties.Builder())
            .nutrition(4).saturationMod(0.2F)
            .build();

    public static final FoodProperties LIME = (new FoodProperties.Builder())
            .nutrition(4).saturationMod(0.2F)
            .build();

    public static final FoodProperties MANGO = (new FoodProperties.Builder())
            .nutrition(4).saturationMod(0.2F)
            .build();

    public static final FoodProperties ORANGE = (new FoodProperties.Builder())
            .nutrition(4).saturationMod(0.2F)
            .build();

}
