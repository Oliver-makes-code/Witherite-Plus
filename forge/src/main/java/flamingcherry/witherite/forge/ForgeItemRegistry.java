package flamingcherry.witherite.forge;

import flamingcherry.witherite.common.WitheriteCommon;
import net.minecraft.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import flamingcherry.witherite.common.Items;

public class ForgeItemRegistry {
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, WitheriteCommon.MODID);

    public static <I extends Item>RegistryObject<I> register(String name, I item) {
        return ITEMS.register(name,() -> item);
    }

    public static void register() {
        Items.register();

        // Register Items
        register("raw_witherite", Items.RAW_WITHERITE);
        register("organic_witherite", Items.ORGANIC_WITHERITE);
        register("refined_witherite", Items.REFINED_WITHERITE);
        register("witherite_ingot", Items.WITHERITE_INGOT);
        register("witherite_nugget", Items.WITHERITE_NUGGET);
        register("piece_of_damaged_nether_star", Items.PIECE_OF_DAMAGED_NETHER_STAR);
        register("damaged_nether_star", Items.DAMAGED_NETHER_STAR);
        register("enriched_witherite_powder", Items.ENR_WITHERITE_POWDER);
        register("enriched_witherite_ingot", Items.ENR_WITHERITE_INGOT);
        register("enriched_witherite_nugget", Items.ENR_WITHERITE_NUGGET);

        // Register Tool Items
        register("witherite_axe", Items.WITHERITE_AXE);
        register("witherite_pickaxe", Items.WITHERITE_PICKAXE);
        register("witherite_hoe", Items.WITHERITE_HOE);
        register("witherite_sword", Items.WITHERITE_SWORD);
        register("witherite_shovel", Items.WITHERITE_SHOVEL);
        register("enriched_witherite_axe", Items.ENR_WITHERITE_AXE);
        register("enriched_witherite_pickaxe", Items.ENR_WITHERITE_PICKAXE);
        register("enriched_witherite_hoe", Items.ENR_WITHERITE_HOE);
        register("enriched_witherite_sword", Items.ENR_WITHERITE_SWORD);
        register("enriched_witherite_shovel", Items.ENR_WITHERITE_SHOVEL);

        // Register Armor Items
        register("witherite_helmet", Items.WITHERITE_HELMET);
        register("witherite_chestplate", Items.WITHERITE_CHESTPLATE);
        register("witherite_leggings", Items.WITHERITE_LEGGINGS);
        register("witherite_boots", Items.WITHERITE_BOOTS);
        //register("enriched_witherite_helmet", Items.ENRICHED_WITHERITE_HELMET);
        //register("enriched_witherite_chestplate", Items.ENRICHED_WITHERITE_CHESTPLATE);
        //register("enriched_witherite_leggings", Items.ENRICHED_WITHERITE_LEGGINGS);
        //register("enriched_witherite_boots", Items.ENRICHED_WITHERITE_BOOTS);

        // Register Shears Items
        register("witherite_shears", Items.WITHERITE_SHEARS);
        register("enriched_witherite_shears", Items.ENR_WITHERITE_SHEARS);

        // Register Flint and Steel Items
        register("witherite_flint_and_steel", Items.WITHERITE_FLINT_AND_STEEL);
        register("enriched_witherite_flint_and_steel", Items.ENR_WITHERITE_FLINT_AND_STEEL);
    }
}
