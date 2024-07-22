package github.gavinhardison.jakobitestmod.list;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class FoodList {
    public static final FoodComponent RYE_BREAD_COMPONENT = new FoodComponent.Builder()
            .nutrition(6)
            .saturationModifier(0.3F)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,20 * 60, 0), 0.75F)
            .build();
}
