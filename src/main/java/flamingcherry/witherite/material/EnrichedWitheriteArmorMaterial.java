package flamingcherry.witherite.material;

import flamingcherry.witherite.ItemRegistry;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;

public class EnrichedWitheriteArmorMaterial implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[] {20, 21, 19, 18};
    private static final int[] PROTECTION_VALUES = new int[] {6, 12, 10, 7};

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
        return Ingredient.ofItems(ItemRegistry.ENR_WITHERITE_INGOT);
    }

    @Override
    public String getName() {
        return "enriched_witherite";
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
