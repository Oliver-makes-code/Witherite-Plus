package flamingcherry.witherite.fabric;

import flamingcherry.witherite.common.Blocks;
import flamingcherry.witherite.common.WitheriteCommon;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Block;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.CountPlacementModifier;
import net.minecraft.world.gen.decorator.HeightRangePlacementModifier;
import net.minecraft.world.gen.decorator.InSquarePlacementModifier;
import net.minecraft.world.gen.feature.*;

public class FabricGenRegistry {
    private static final Block WITHERITE_DEPOSIT = Blocks.WITHERITE_DEPOSIT;

    private static final ConfiguredFeature<?,?> WITHERITE_FEATURE = Feature.ORE.configure(
            new OreFeatureConfig(
                    OreConfiguredFeatures.NETHERRACK,
                    WITHERITE_DEPOSIT.getDefaultState(),
                    2
            )
    );

    public static final PlacedFeature WITHERITE_DEPOSIT_PLACED = WITHERITE_FEATURE.withPlacement(
            CountPlacementModifier.create(3),
            InSquarePlacementModifier.getInstance(),
            HeightRangePlacementModifier.createUniform(YOffset.aboveBottom(1), YOffset.fixed(12))
    );

    public static void register() {
        Registry.register(
                BuiltinRegistries.CONFIGURED_FEATURE,
                WitheriteCommon.id("witherite_ore"),
                WITHERITE_FEATURE
        );
        Registry.register(
                BuiltinRegistries.PLACED_FEATURE,
                WitheriteCommon.id("witherite_ore"),
                WITHERITE_DEPOSIT_PLACED
        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInTheNether(),
                GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(
                        Registry.PLACED_FEATURE_KEY,
                        WitheriteCommon.id("witherite_ore")
                )
        );
    }
}
