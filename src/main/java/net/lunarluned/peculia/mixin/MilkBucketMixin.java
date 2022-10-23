package net.lunarluned.peculia.mixin;


import net.lunarluned.peculia.Peculia;
import net.lunarluned.peculia.mixin.util.accessor.MobEffectInstanceAccessor;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.MilkBucketItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.util.ArrayList;
import java.util.List;

@Mixin(MilkBucketItem.class)
public class MilkBucketMixin {

    @Redirect(at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/LivingEntity;removeAllEffects()Z"), method = "finishUsingItem")

    private boolean milkRework(LivingEntity livingEntity)
    {
        //this is filler bc i havent made the config for it yet dont smite me //
        if (Peculia.getConfig().mobs.vanillaMobsConfig.ghastConfig.stat_increase)  {
            List<MobEffectInstance> effects = new ArrayList<>(livingEntity.getActiveEffects());
            MobEffectInstance effect = effects.get(livingEntity.level.random.nextInt(effects.size() - 1));
            ((MobEffectInstanceAccessor) effect).setDuration((int) (effect.getDuration() * 0.8));

        } else {
            livingEntity.removeAllEffects();
        }
        return false;
    }
}
