package flamingcherry.witherite.material;

import flamingcherry.witherite.Register;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class WitheriteToolMaterial implements ToolMaterial {

    public static final WitheriteToolMaterial INSTANCE = new WitheriteToolMaterial();

    @Override
    public int getDurability() {
        return 3000;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 9.5F;
    }

    @Override
    public float getAttackDamage() {
        return 5.0F;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 16;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Register.WITHERITE);
    }
}
