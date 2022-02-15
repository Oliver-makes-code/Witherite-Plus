package flamingcherry.witherite.common;

import flamingcherry.witherite.common.items.*;
import flamingcherry.witherite.common.material.EnrWitheriteToolMaterial;
import flamingcherry.witherite.common.material.WitheriteToolMaterial;
import net.minecraft.block.Block;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ItemRegistry {
    private static final ItemGroup GROUP = WitheriteCommon.WITHERITE_GROUP;
    private static final Block WITHERITE_DEPOSIT = BlockRegistry.WITHERITE_DEPOSIT;
    private static final Block WITHERITE_BLOCK = BlockRegistry.WITHERITE_BLOCK;
    private static final Block ENR_WITHERITE_BLOCK = BlockRegistry.ENR_WITHERITE_BLOCK;
    private static final ArmorMaterial WITHERITE_MATERIAL = MaterialRegistry.WITHERITE_MATERIAL;
    private static final ArmorMaterial ENRICHED_WITHERITE_MATERIAL = MaterialRegistry.ENRICHED_WITHERITE_MATERIAL;

    // Items
    public static final Item RAW_WITHERITE = new Item(new Item.Settings().group(GROUP));
    public static final Item ORGANIC_WITHERITE = new Item(new Item.Settings().group(GROUP));
    public static final Item REFINED_WITHERITE = new Item(new Item.Settings().group(GROUP).fireproof());
    public static final Item WITHERITE_INGOT = new Item(new Item.Settings().group(GROUP).fireproof());
    public static final Item WITHERITE_NUGGET = new Item(new Item.Settings().group(GROUP).fireproof());
    public static final Item PIECE_OF_DAMAGED_NETHER_STAR = new Item(new Item.Settings()
            .group(GROUP).rarity(Rarity.UNCOMMON));
    public static final Item DAMAGED_NETHER_STAR = new Item(new Item.Settings()
            .group(GROUP).rarity(Rarity.UNCOMMON));
    public static final Item ENR_WITHERITE_POWDER = new Item(new Item.Settings()
            .group(GROUP).fireproof().rarity(Rarity.UNCOMMON));
    public static final Item ENR_WITHERITE_INGOT = new Item(new Item.Settings()
            .group(GROUP).fireproof().rarity(Rarity.UNCOMMON));
    public static final Item ENR_WITHERITE_NUGGET = new Item(new Item.Settings()
            .group(GROUP).fireproof().rarity(Rarity.UNCOMMON));

    // Tool Items
    public static ToolItem WITHERITE_SHOVEL = new WitheriteShovel
            (WitheriteToolMaterial.INSTANCE, 2, -3.0F, new Item.Settings()
                    .group(WitheriteCommon.WITHERITE_GROUP)
                    .fireproof());

    public static ToolItem WITHERITE_SWORD = new WitheriteSword
            (WitheriteToolMaterial.INSTANCE, 5, -1.0F, new Item.Settings()
                    .group(WitheriteCommon.WITHERITE_GROUP)
                    .fireproof());

    public static ToolItem WITHERITE_PICKAXE = new WitheritePickaxe
            (WitheriteToolMaterial.INSTANCE, 3, -2.0F, new Item.Settings()
                    .group(WitheriteCommon.WITHERITE_GROUP)
                    .fireproof());

    public static ToolItem WITHERITE_AXE = new WitheriteAxe
            (WitheriteToolMaterial.INSTANCE, 6, -2.5F, new Item.Settings()
                    .group(WitheriteCommon.WITHERITE_GROUP)
                    .fireproof());

    public static ToolItem WITHERITE_HOE = new WitheriteHoe
            (WitheriteToolMaterial.INSTANCE, 2, -0.50F, new Item.Settings()
                    .group(WitheriteCommon.WITHERITE_GROUP)
                    .fireproof());

    public static ToolItem ENR_WITHERITE_SHOVEL = new WitheriteShovel
            (WitheriteToolMaterial.INSTANCE, 3, -2.50F, new Item.Settings()
                    .group(WitheriteCommon.WITHERITE_GROUP)
                    .rarity(Rarity.UNCOMMON)
                    .fireproof());

    public static ToolItem ENR_WITHERITE_SWORD = new WitheriteSword
            (WitheriteToolMaterial.INSTANCE, 7, -0.80F, new Item.Settings()
                    .group(WitheriteCommon.WITHERITE_GROUP)
                    .rarity(Rarity.UNCOMMON)
                    .fireproof());

    public static ToolItem ENR_WITHERITE_PICKAXE = new EnrWitheritePickaxe
            (EnrWitheriteToolMaterial.INSTANCE, 5, -1.9F, new Item.Settings()
                    .group(WitheriteCommon.WITHERITE_GROUP)
                    .rarity(Rarity.UNCOMMON)
                    .fireproof());

    public static ToolItem ENR_WITHERITE_AXE = new EnrWitheriteAxe
            (WitheriteToolMaterial.INSTANCE, 8, -2.1F, new Item.Settings()
                    .group(WitheriteCommon.WITHERITE_GROUP)
                    .rarity(Rarity.UNCOMMON)
                    .fireproof());

    public static ToolItem ENR_WITHERITE_HOE = new WitheriteHoe
            (WitheriteToolMaterial.INSTANCE, 3, -0.50F, new Item.Settings()
                    .group(WitheriteCommon.WITHERITE_GROUP)
                    .rarity(Rarity.UNCOMMON)
                    .fireproof());

    // Armor Items
    public static final Item WITHERITE_HELMET = new ArmorItem
            (WITHERITE_MATERIAL, EquipmentSlot.HEAD, new Item.Settings()
                    .group(GROUP)
                    .fireproof());

    public static final Item WITHERITE_CHESTPLATE = new ArmorItem
            (WITHERITE_MATERIAL, EquipmentSlot.CHEST, new Item.Settings()
                    .group(GROUP)
                    .fireproof());

    public static final Item WITHERITE_LEGGINGS = new ArmorItem
            (WITHERITE_MATERIAL, EquipmentSlot.LEGS, new Item.Settings()
                    .group(GROUP)
                    .fireproof());

    public static final Item WITHERITE_BOOTS = new ArmorItem
            (WITHERITE_MATERIAL, EquipmentSlot.FEET, new Item.Settings()
                    .group(GROUP)
                    .fireproof());
    public static final Item ENRICHED_WITHERITE_HELMET = new ArmorItem
            (ENRICHED_WITHERITE_MATERIAL, EquipmentSlot.HEAD, new Item.Settings()
                    .group(GROUP)
                    .fireproof());

    public static final Item ENRICHED_WITHERITE_CHESTPLATE = new ArmorItem
            (ENRICHED_WITHERITE_MATERIAL, EquipmentSlot.CHEST, new Item.Settings()
                    .group(GROUP)
                    .fireproof());

    public static final Item ENRICHED_WITHERITE_LEGGINGS = new ArmorItem
            (ENRICHED_WITHERITE_MATERIAL, EquipmentSlot.LEGS, new Item.Settings()
                    .group(GROUP)
                    .fireproof());

    public static final Item ENRICHED_WITHERITE_BOOTS = new ArmorItem
            (ENRICHED_WITHERITE_MATERIAL, EquipmentSlot.FEET, new Item.Settings()
                    .group(GROUP)
                    .fireproof());

    // Shears Items
    public static ShearsItem WITHERITE_SHEARS = new WitheriteShears
            (new Item.Settings()
                    .maxDamage(820)
                    .group(WitheriteCommon.WITHERITE_GROUP)
                    .fireproof());

    public static ShearsItem ENR_WITHERITE_SHEARS = new EnrWitheriteShears
            (new Item.Settings()
                    .maxDamage(2021)
                    .group(WitheriteCommon.WITHERITE_GROUP)
                    .rarity(Rarity.UNCOMMON)
                    .fireproof());

    // Flint and Steel Items
    public static FlintAndSteelItem WITHERITE_FLINT_AND_STEEL = new WitheriteFlintAndSteel
            (new Item.Settings()
                    .maxDamage(730)
                    .group(WitheriteCommon.WITHERITE_GROUP)
                    .fireproof());

    public static FlintAndSteelItem ENR_WITHERITE_FLINT_AND_STEEL = new EnrWitheriteFlintAndSteel
            (new Item.Settings()
                    .maxDamage(1933)
                    .group(WitheriteCommon.WITHERITE_GROUP)
                    .rarity(Rarity.UNCOMMON)
                    .fireproof());

    // Block Items
    public static final BlockItem WITHERITE_DEPOSIT_ITEM = new BlockItem
            (WITHERITE_DEPOSIT, new Item.Settings().group(GROUP));

    public static final BlockItem WITHERITE_BLOCK_ITEM = new BlockItem
            (WITHERITE_BLOCK, new Item.Settings().group(GROUP));

    public static final BlockItem ENR_WITHERITE_BLOCK_ITEM = new BlockItem
            (ENR_WITHERITE_BLOCK, new Item.Settings().group(GROUP));


    public static void register() {
        // Register Items
        Registry.register(Registry.ITEM, WitheriteCommon.id("raw_witherite"), RAW_WITHERITE);
        Registry.register(Registry.ITEM, WitheriteCommon.id("organic_witherite"), ORGANIC_WITHERITE);
        Registry.register(Registry.ITEM, WitheriteCommon.id("refined_witherite"), REFINED_WITHERITE);
        Registry.register(Registry.ITEM, WitheriteCommon.id("witherite_ingot"), WITHERITE_INGOT);
        Registry.register(Registry.ITEM, WitheriteCommon.id("witherite_nugget"), WITHERITE_NUGGET);
        Registry.register(Registry.ITEM, WitheriteCommon.id("piece_of_damaged_nether_star"), PIECE_OF_DAMAGED_NETHER_STAR);
        Registry.register(Registry.ITEM, WitheriteCommon.id("damaged_nether_star"), DAMAGED_NETHER_STAR);
        Registry.register(Registry.ITEM, WitheriteCommon.id("enriched_witherite_powder"), ENR_WITHERITE_POWDER);
        Registry.register(Registry.ITEM, WitheriteCommon.id("enriched_witherite_ingot"), ENR_WITHERITE_INGOT);
        Registry.register(Registry.ITEM, WitheriteCommon.id("enriched_witherite_nugget"), ENR_WITHERITE_NUGGET);

        // Register Tool Items
        Registry.register(Registry.ITEM, WitheriteCommon.id("witherite_axe"), WITHERITE_AXE);
        Registry.register(Registry.ITEM, WitheriteCommon.id("witherite_pickaxe"), WITHERITE_PICKAXE);
        Registry.register(Registry.ITEM, WitheriteCommon.id("witherite_hoe"), WITHERITE_HOE);
        Registry.register(Registry.ITEM, WitheriteCommon.id("witherite_sword"), WITHERITE_SWORD);
        Registry.register(Registry.ITEM, WitheriteCommon.id("witherite_shovel"), WITHERITE_SHOVEL);
        Registry.register(Registry.ITEM, WitheriteCommon.id("enriched_witherite_axe"), ENR_WITHERITE_AXE);
        Registry.register(Registry.ITEM, WitheriteCommon.id("enriched_witherite_pickaxe"), ENR_WITHERITE_PICKAXE);
        Registry.register(Registry.ITEM, WitheriteCommon.id("enriched_witherite_hoe"), ENR_WITHERITE_HOE);
        Registry.register(Registry.ITEM, WitheriteCommon.id("enriched_witherite_sword"), ENR_WITHERITE_SWORD);
        Registry.register(Registry.ITEM, WitheriteCommon.id("enriched_witherite_shovel"), ENR_WITHERITE_SHOVEL);

        // Register Armor Items
        Registry.register(Registry.ITEM, WitheriteCommon.id("witherite_helmet"), WITHERITE_HELMET);
        Registry.register(Registry.ITEM, WitheriteCommon.id("witherite_chestplate"), WITHERITE_CHESTPLATE);
        Registry.register(Registry.ITEM, WitheriteCommon.id("witherite_leggings"), WITHERITE_LEGGINGS);
        Registry.register(Registry.ITEM, WitheriteCommon.id("witherite_boots"), WITHERITE_BOOTS);
        //Registry.register(Registry.ITEM, WitheriteCommon.id("enriched_witherite_helmet"), ENRICHED_WITHERITE_HELMET);
        //Registry.register(Registry.ITEM, WitheriteCommon.id("enriched_witherite_chestplate"), ENRICHED_WITHERITE_CHESTPLATE);
        //Registry.register(Registry.ITEM, WitheriteCommon.id("enriched_witherite_leggings"), ENRICHED_WITHERITE_LEGGINGS);
        //Registry.register(Registry.ITEM, WitheriteCommon.id("enriched_witherite_boots"), ENRICHED_WITHERITE_BOOTS);

        // Register Shears Items
        Registry.register(Registry.ITEM, WitheriteCommon.id("witherite_shears"), WITHERITE_SHEARS);
        Registry.register(Registry.ITEM, WitheriteCommon.id("enriched_witherite_shears"), ENR_WITHERITE_SHEARS);

        // Register Flint and Steel Items
        Registry.register(Registry.ITEM, WitheriteCommon.id("witherite_flint_and_steel"), WITHERITE_FLINT_AND_STEEL);
        Registry.register(Registry.ITEM, WitheriteCommon.id("enriched_witherite_flint_and_steel"), ENR_WITHERITE_FLINT_AND_STEEL);

        // Register Block Items
        Registry.register(Registry.ITEM, WitheriteCommon.id("witherite_deposit"), WITHERITE_DEPOSIT_ITEM);
        Registry.register(Registry.ITEM, WitheriteCommon.id("witherite_block"), WITHERITE_BLOCK_ITEM);
        Registry.register(Registry.ITEM, WitheriteCommon.id("enriched_witherite_block"), ENR_WITHERITE_BLOCK_ITEM);
    }
}
