package flamingcherry.witherite.common.material;

import flamingcherry.witherite.common.ItemRegistry;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class WitheriteToolMaterial implements ToolMaterial {

    public static final WitheriteToolMaterial INSTANCE = new WitheriteToolMaterial();

    @Override
    public int getDurability() {
        return 2630;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 11.5F;
    }

    @Override
    public float getAttackDamage() {
        return 5.0F;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public int getEnchantability() {
        return 16;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ItemRegistry.WITHERITE_INGOT);
    }
}
