package flamingcherry.witherite;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.CountPlacementModifier;
import net.minecraft.world.gen.decorator.HeightRangePlacementModifier;
import net.minecraft.world.gen.decorator.SquarePlacementModifier;
import net.minecraft.world.gen.feature.*;

public class GenRegistry {
    private static final String ID = Witherite.MOD_ID;
    private static final ItemGroup GROUP = Witherite.WITHERITE_GROUP;
    private static final Block WITHERITE_DEPOSIT = BlockRegistry.WITHERITE_DEPOSIT;

    private static final ConfiguredFeature<?,?> WITHERITE_FEATURE = Feature.ORE.configure(
            new OreFeatureConfig(
                    OreConfiguredFeatures.NETHERRACK,
                    WITHERITE_DEPOSIT.getDefaultState(),
                    2
            )
    );

    public static final PlacedFeature WITHERITE_DEPOSIT_PLACED = WITHERITE_FEATURE.withPlacement(
            CountPlacementModifier.of(3),
            SquarePlacementModifier.of(),
            HeightRangePlacementModifier.uniform(YOffset.aboveBottom(1), YOffset.fixed(12))
    );

    public static void register() {
        Registry.register(
                BuiltinRegistries.CONFIGURED_FEATURE,
                id("witherite_ore"),
                WITHERITE_FEATURE
        );
        Registry.register(
                BuiltinRegistries.PLACED_FEATURE,
                id("witherite_ore"),
                WITHERITE_DEPOSIT_PLACED
        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInTheNether(),
                GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(
                        Registry.PLACED_FEATURE_KEY,
                        id("witherite_ore")
                )
        );
    }

    public static Identifier id(String value) {
        return new Identifier(ID,value);
    }
}
