package flamingcherry.witherite.material;

import flamingcherry.witherite.ItemRegistry;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class EnrWitheriteToolMaterial implements ToolMaterial {

    public static final EnrWitheriteToolMaterial INSTANCE = new EnrWitheriteToolMaterial();

    @Override
    public int getDurability() {
        return 4530;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 21.4F;
    }

    @Override
    public float getAttackDamage() {
        return 6.0F;
    }

    @Override
    public int getMiningLevel() {
        return 5;
    }

    @Override
    public int getEnchantability() {
        return 16;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ItemRegistry.ENR_WITHERITE_INGOT);
    }
}
