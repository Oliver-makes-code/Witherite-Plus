package flamingcherry.witherite;

import flamingcherry.witherite.enchantments.WitheringDefenseEnchantment;
import flamingcherry.witherite.enchantments.WitheringEnchantment;
import flamingcherry.witherite.items.*;
import flamingcherry.witherite.material.WitheriteToolMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.item.*;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Register {
    public static final Item WITHERITE = new flamingcherry.witherite.items.Witherite(new FabricItemSettings().group(Witherite.WITHERITE_GROUP).fireproof());
    public static final Item WITHERITE_INGOT = new WitheriteIngot(new Item.Settings().group(Witherite.WITHERITE_GROUP).fireproof());
    public static ToolItem WITHERITE_SHOVEL = new ShovelItem(WitheriteToolMaterial.INSTANCE, 2, -3.0F, new Item.Settings().group(Witherite.WITHERITE_GROUP).fireproof());
    public static ToolItem WITHERITE_SWORD = new SwordItem(WitheriteToolMaterial.INSTANCE, 5, -1.0F, new Item.Settings().group(Witherite.WITHERITE_GROUP).fireproof());
    public static ToolItem WITHERITE_PICKAXE = new WitheritePickaxe(WitheriteToolMaterial.INSTANCE, 3, -2.0F, new Item.Settings().group(Witherite.WITHERITE_GROUP).fireproof());
    public static ToolItem WITHERITE_AXE = new WitheriteAxe(WitheriteToolMaterial.INSTANCE, 6, -2.5F, new Item.Settings().group(Witherite.WITHERITE_GROUP).fireproof());
    public static ToolItem WITHERITE_HOE = new WitheriteHoe(WitheriteToolMaterial.INSTANCE, 2, -0.50F, new Item.Settings().group(Witherite.WITHERITE_GROUP).fireproof());
    public static ShearsItem WITHERITE_SHEARS = new WitheriteShears(new FabricItemSettings().maxDamage(1000).group(Witherite.WITHERITE_GROUP).fireproof());
    public static FlintAndSteelItem WITHERITE_FLINT_AND_STEEL = new WitheriteFlintAndSteel(new FabricItemSettings().maxDamage(856).group(Witherite.WITHERITE_GROUP).fireproof());
    public static final Tag<Item> SHEARS_ITEM = FabricToolTags.SHEARS;

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier(Witherite.MOD_ID, "witherite"), WITHERITE);
        Registry.register(Registry.ITEM, new Identifier(Witherite.MOD_ID, "witherite_ingot"), WITHERITE_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Witherite.MOD_ID, "witherite_axe"), WITHERITE_AXE);
        Registry.register(Registry.ITEM, new Identifier(Witherite.MOD_ID, "witherite_pickaxe"), WITHERITE_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Witherite.MOD_ID, "witherite_hoe"), WITHERITE_HOE);
        Registry.register(Registry.ITEM, new Identifier(Witherite.MOD_ID, "witherite_sword"), WITHERITE_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Witherite.MOD_ID, "witherite_shovel"), WITHERITE_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(Witherite.MOD_ID, "witherite_shears"), WITHERITE_SHEARS);
        Registry.register(Registry.ITEM, new Identifier(Witherite.MOD_ID, "witherite_flint_and_steel"), WITHERITE_FLINT_AND_STEEL);
        Registry.register(Registry.ENCHANTMENT, new Identifier(Witherite.MOD_ID, "withering"), new WitheringEnchantment());
        Registry.register(Registry.ENCHANTMENT, new Identifier(Witherite.MOD_ID, "withering_defense"), new WitheringDefenseEnchantment());
    }
}
