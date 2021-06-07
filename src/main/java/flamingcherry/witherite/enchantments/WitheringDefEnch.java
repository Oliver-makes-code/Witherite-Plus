package flamingcherry.witherite.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class WitheringDefEnch extends Enchantment {

    public WitheringDefEnch() {
        super(Rarity.VERY_RARE, EnchantmentTarget.ARMOR, new EquipmentSlot[] {EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET});
    }

    @Override
    public int getMinPower(int level) {
        return 30;
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }

    @Override
    public void onUserDamaged(LivingEntity user, Entity attacker, int level) {
        if (attacker instanceof LivingEntity) {
            ((LivingEntity) attacker).addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 20 * 2 * level, level - 1));
        }
        super.onUserDamaged(user, attacker, level);
    }
}
