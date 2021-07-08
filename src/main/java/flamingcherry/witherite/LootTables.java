package flamingcherry.witherite;

import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.loot.condition.*;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class LootTables {
    // Entities loot tables
    private static final Identifier WITHER_SKELETON = new Identifier("minecraft", "entities/wither_skeleton");
    private static final Identifier WITHER = new Identifier("minecraft", "entities/wither");

    // Chests loot tables
    private static final Identifier NETHER_BRIDGE = new Identifier("minecraft", "chests/nether_bridge");

    public static void register() {
        // Register event
        LootTableLoadingCallback.EVENT.register(((resourceManager, manager, id, supplier, setter) -> {
            // Modify Wither Skeleton loot table
            if (WITHER_SKELETON.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .withEntry(ItemEntry.builder(ItemRegistry.ORGANIC_WITHERITE).build())
                        .withCondition((KilledByPlayerLootCondition.builder().build()))
                        .withCondition(RandomChanceWithLootingLootCondition.builder(0.020f, 0.01f).build());
                supplier.withPool(poolBuilder.build());
                // Modify Wither  loot table
            } else if (WITHER.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .withEntry(ItemEntry.builder(ItemRegistry.DAMAGED_NETHER_STAR).build())
                        .withCondition((KilledByPlayerLootCondition.builder().build()))
                        .withCondition(RandomChanceWithLootingLootCondition.builder(0.070f, 0.06f).build());
                supplier.withPool(poolBuilder.build());
                // Modify Nether Bridge loot table
            } else if (NETHER_BRIDGE.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(UniformLootNumberProvider.create(0.0f, 1.0f))
                        .withEntry(ItemEntry.builder(ItemRegistry.PIECE_OF_DAMAGED_NETHER_STAR).weight(30).build());
                supplier.withPool(poolBuilder.build());
            }
        }));
    }
}
