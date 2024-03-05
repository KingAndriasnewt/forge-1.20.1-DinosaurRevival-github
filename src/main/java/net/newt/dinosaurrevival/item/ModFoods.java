package net.newt.dinosaurrevival.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties SMALL_MEAT = new FoodProperties.Builder().meat().nutrition(1)
            .saturationMod(1).build();

    public static final FoodProperties MEDIUM_MEAT = new FoodProperties.Builder().meat().nutrition(2)
            .saturationMod(1).build();

    public static final FoodProperties LARGE_MEAT = new FoodProperties.Builder().meat().nutrition(2)
            .saturationMod(2).build();

    public static final FoodProperties COOKED_SMALL_MEAT = new FoodProperties.Builder().meat().nutrition(4)
            .saturationMod(3).build();

    public static final FoodProperties COOKED_MEDIUM_MEAT = new FoodProperties.Builder().meat().nutrition(4)
            .saturationMod(3).build();

    public static final FoodProperties COOKED_LARGE_MEAT = new FoodProperties.Builder().nutrition(6).fast()
            .saturationMod(5).effect(() -> new MobEffectInstance(MobEffects.SATURATION, 1200), 0.5f).build();
}
