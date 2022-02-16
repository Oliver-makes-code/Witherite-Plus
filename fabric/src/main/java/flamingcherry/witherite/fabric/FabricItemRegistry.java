package flamingcherry.witherite.fabric;

import flamingcherry.witherite.common.WitheriteCommon;
import net.minecraft.util.registry.Registry;

import static flamingcherry.witherite.common.Items.*;

public class FabricItemRegistry {

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
        //Registry.register(Registry.ITEM, WitheriteCommon.id("witherproof_block"), WITHERPROOF_BLOCK_ITEM);
    }
}
