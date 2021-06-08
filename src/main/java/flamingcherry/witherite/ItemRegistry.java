package flamingcherry.witherite;

import flamingcherry.witherite.blockitems.EnrWitheriteBlockItem;
import flamingcherry.witherite.blockitems.WitheriteBlockItem;
import flamingcherry.witherite.blockitems.WitheriteDepositItem;
import flamingcherry.witherite.items.*;
import flamingcherry.witherite.material.EnrWitheriteToolMaterial;
import flamingcherry.witherite.material.WitheriteToolMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ItemRegistry {
    private static final String ID = Witherite.MOD_ID;
    private static final ItemGroup GROUP = Witherite.WITHERITE_GROUP;
    private static final Block WITHERITE_DEPOSIT = BlockRegistry.WITHERITE_DEPOSIT;
    private static final Block WITHERITE_BLOCK = BlockRegistry.WITHERITE_BLOCK;
    private static final Block ENR_WITHERITE_BLOCK = BlockRegistry.ENR_WITHERITE_BLOCK;

    // Items
    public static final Item RAW_WITHERITE = new RawWitherite(new FabricItemSettings().group(GROUP));
    public static final Item ORGANIC_WITHERITE = new OrganicWitherite(new FabricItemSettings().group(GROUP));
    public static final Item REFINED_WITHERITE = new RefinedWitherite(new FabricItemSettings().group(GROUP).fireproof());
    public static final Item WITHERITE_INGOT = new WitheriteIngot(new Item.Settings().group(GROUP).fireproof());
    public static final Item WITHERITE_NUGGET = new WitheriteNugget(new Item.Settings().group(GROUP).fireproof());
    public static final Item PIECE_OF_DAMAGED_NETHER_STAR = new PieceOfDamagedNetherStar(new FabricItemSettings()
            .group(GROUP).rarity(Rarity.UNCOMMON));
    public static final Item DAMAGED_NETHER_STAR = new DamagedNetherStar(new FabricItemSettings()
            .group(GROUP).rarity(Rarity.UNCOMMON));
    public static final Item ENR_WITHERITE_POWDER = new EnrWitheritePowder(new FabricItemSettings()
            .group(GROUP).fireproof().rarity(Rarity.UNCOMMON));
    public static final Item ENR_WITHERITE_INGOT = new EnrWitheriteIngot(new FabricItemSettings()
            .group(GROUP).fireproof().rarity(Rarity.UNCOMMON));
    public static final Item ENR_WITHERITE_NUGGET = new EnrWitheriteNugget(new FabricItemSettings()
            .group(GROUP).fireproof().rarity(Rarity.UNCOMMON));

    // Tool Items
    public static ToolItem WITHERITE_SHOVEL = new WitheriteShovel
            (WitheriteToolMaterial.INSTANCE, 2, -3.0F, new Item.Settings()
                    .group(Witherite.WITHERITE_GROUP)
                    .fireproof());

    public static ToolItem WITHERITE_SWORD = new WitheriteSword
            (WitheriteToolMaterial.INSTANCE, 5, -1.0F, new Item.Settings()
                    .group(Witherite.WITHERITE_GROUP)
                    .fireproof());

    public static ToolItem WITHERITE_PICKAXE = new WitheritePickaxe
            (WitheriteToolMaterial.INSTANCE, 3, -2.0F, new Item.Settings()
                    .group(Witherite.WITHERITE_GROUP)
                    .fireproof());

    public static ToolItem WITHERITE_AXE = new WitheriteAxe
            (WitheriteToolMaterial.INSTANCE, 6, -2.5F, new Item.Settings()
                    .group(Witherite.WITHERITE_GROUP)
                    .fireproof());

    public static ToolItem WITHERITE_HOE = new WitheriteHoe
            (WitheriteToolMaterial.INSTANCE, 2, -0.50F, new Item.Settings()
                    .group(Witherite.WITHERITE_GROUP)
                    .fireproof());

    public static ToolItem ENR_WITHERITE_SHOVEL = new WitheriteShovel
            (WitheriteToolMaterial.INSTANCE, 3, -2.50F, new Item.Settings()
                    .group(Witherite.WITHERITE_GROUP)
                    .rarity(Rarity.UNCOMMON)
                    .fireproof());

    public static ToolItem ENR_WITHERITE_SWORD = new WitheriteSword
            (WitheriteToolMaterial.INSTANCE, 7, -0.80F, new Item.Settings()
                    .group(Witherite.WITHERITE_GROUP)
                    .rarity(Rarity.UNCOMMON)
                    .fireproof());

    public static ToolItem ENR_WITHERITE_PICKAXE = new EnrWitheritePickaxe
            (EnrWitheriteToolMaterial.INSTANCE, 5, -1.9F, new Item.Settings()
                    .group(Witherite.WITHERITE_GROUP)
                    .rarity(Rarity.UNCOMMON)
                    .fireproof());

    public static ToolItem ENR_WITHERITE_AXE = new EnrWitheriteAxe
            (WitheriteToolMaterial.INSTANCE, 8, -2.1F, new Item.Settings()
                    .group(Witherite.WITHERITE_GROUP)
                    .rarity(Rarity.UNCOMMON)
                    .fireproof());

    public static ToolItem ENR_WITHERITE_HOE = new WitheriteHoe
            (WitheriteToolMaterial.INSTANCE, 3, -0.50F, new Item.Settings()
                    .group(Witherite.WITHERITE_GROUP)
                    .rarity(Rarity.UNCOMMON)
                    .fireproof());

    // Shears Items
    public static ShearsItem WITHERITE_SHEARS = new WitheriteShears
            (new FabricItemSettings()
                    .maxDamage(820)
                    .group(Witherite.WITHERITE_GROUP)
                    .fireproof());

    public static ShearsItem ENR_WITHERITE_SHEARS = new EnrWitheriteShears
            (new FabricItemSettings()
                    .maxDamage(2021)
                    .group(Witherite.WITHERITE_GROUP)
                    .rarity(Rarity.UNCOMMON)
                    .fireproof());

    // Flint and Steel Items
    public static FlintAndSteelItem WITHERITE_FLINT_AND_STEEL = new WitheriteFlintAndSteel
            (new FabricItemSettings()
                    .maxDamage(730)
                    .group(Witherite.WITHERITE_GROUP)
                    .fireproof());

    public static FlintAndSteelItem ENR_WITHERITE_FLINT_AND_STEEL = new EnrWitheriteFlintAndSteel
            (new FabricItemSettings()
                    .maxDamage(1933)
                    .group(Witherite.WITHERITE_GROUP)
                    .rarity(Rarity.UNCOMMON)
                    .fireproof());

    // Block Items
    public static final BlockItem WITHERITE_DEPOSIT_ITEM = new WitheriteDepositItem
            (WITHERITE_DEPOSIT, new FabricItemSettings().group(GROUP));

    public static final BlockItem WITHERITE_BLOCK_ITEM = new WitheriteBlockItem
            (WITHERITE_BLOCK, new FabricItemSettings().group(GROUP));

    public static final BlockItem ENR_WITHERITE_BLOCK_ITEM = new EnrWitheriteBlockItem
            (ENR_WITHERITE_BLOCK, new FabricItemSettings().group(GROUP));


    public static void register() {
        // Register Items
        Registry.register(Registry.ITEM, new Identifier(ID, "raw_witherite"), RAW_WITHERITE);
        Registry.register(Registry.ITEM, new Identifier(ID, "organic_witherite"), ORGANIC_WITHERITE);
        Registry.register(Registry.ITEM, new Identifier(ID, "refined_witherite"), REFINED_WITHERITE);
        Registry.register(Registry.ITEM, new Identifier(ID, "witherite_ingot"), WITHERITE_INGOT);
        Registry.register(Registry.ITEM, new Identifier(ID, "witherite_nugget"), WITHERITE_NUGGET);
        Registry.register(Registry.ITEM, new Identifier(ID, "piece_of_damaged_nether_star"), PIECE_OF_DAMAGED_NETHER_STAR);
        Registry.register(Registry.ITEM, new Identifier(ID, "damaged_nether_star"), DAMAGED_NETHER_STAR);
        Registry.register(Registry.ITEM, new Identifier(ID, "enriched_witherite_powder"), ENR_WITHERITE_POWDER);
        Registry.register(Registry.ITEM, new Identifier(ID, "enriched_witherite_ingot"), ENR_WITHERITE_INGOT);
        Registry.register(Registry.ITEM, new Identifier(ID, "enriched_witherite_nugget"), ENR_WITHERITE_NUGGET);

        // Register Tool Items
        Registry.register(Registry.ITEM, new Identifier(ID, "witherite_axe"), WITHERITE_AXE);
        Registry.register(Registry.ITEM, new Identifier(ID, "witherite_pickaxe"), WITHERITE_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(ID, "witherite_hoe"), WITHERITE_HOE);
        Registry.register(Registry.ITEM, new Identifier(ID, "witherite_sword"), WITHERITE_SWORD);
        Registry.register(Registry.ITEM, new Identifier(ID, "witherite_shovel"), WITHERITE_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(ID, "enriched_witherite_axe"), ENR_WITHERITE_AXE);
        Registry.register(Registry.ITEM, new Identifier(ID, "enriched_witherite_pickaxe"), ENR_WITHERITE_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(ID, "enriched_witherite_hoe"), ENR_WITHERITE_HOE);
        Registry.register(Registry.ITEM, new Identifier(ID, "enriched_witherite_sword"), ENR_WITHERITE_SWORD);
        Registry.register(Registry.ITEM, new Identifier(ID, "enriched_witherite_shovel"), ENR_WITHERITE_SHOVEL);

        // Register Shears Items
        Registry.register(Registry.ITEM, new Identifier(ID, "witherite_shears"), WITHERITE_SHEARS);
        Registry.register(Registry.ITEM, new Identifier(ID, "enriched_witherite_shears"), ENR_WITHERITE_SHEARS);

        // Register Flint and Steel Items
        Registry.register(Registry.ITEM, new Identifier(ID, "witherite_flint_and_steel"), WITHERITE_FLINT_AND_STEEL);
        Registry.register(Registry.ITEM, new Identifier(ID, "enriched_witherite_flint_and_steel"), ENR_WITHERITE_FLINT_AND_STEEL);

        // Register Block Items
        Registry.register(Registry.ITEM, new Identifier(ID, "witherite_deposit"), WITHERITE_DEPOSIT_ITEM);
        Registry.register(Registry.ITEM, new Identifier(ID, "witherite_block"), WITHERITE_BLOCK_ITEM);
        Registry.register(Registry.ITEM, new Identifier(ID, "enriched_witherite_block"), ENR_WITHERITE_BLOCK_ITEM);
    }
}
