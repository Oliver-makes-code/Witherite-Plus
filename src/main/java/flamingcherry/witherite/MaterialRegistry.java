package flamingcherry.witherite;

import flamingcherry.witherite.material.WitheriteArmorMaterial;
import net.minecraft.item.ArmorMaterial;

public class MaterialRegistry {
    public static final ArmorMaterial WITHERITE_MATERIAL = new WitheriteArmorMaterial();
    public static final ArmorMaterial ENRICHED_WITHERITE_MATERIAL = new WitheriteArmorMaterial();

    public static void register() {}
}
