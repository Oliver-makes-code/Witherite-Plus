package flamingcherry.witherite.common.material;

import flamingcherry.witherite.common.Items;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;

public class WitheriteArmorMaterial implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[] {19, 22, 18, 17};
    private static final int[] PROTECTION_VALUES = new int[] {4, 10, 8, 5};

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * 35;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 20;
    }

    @Override
    public SoundEvent getEquipSound() {
        return null;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.WITHERITE_INGOT);
    }

    @Override
    public String getName() {
        return "witherite";
    }

    @Override
    public float getToughness() {
        return 4.0F;
    }

    @Override
    public float getKnockbackResistance() {
        return 10.0F;
    }
}
