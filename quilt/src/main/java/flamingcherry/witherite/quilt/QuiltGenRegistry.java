package flamingcherry.witherite.quilt;

import flamingcherry.witherite.common.Blocks;
import flamingcherry.witherite.common.WitheriteCommon;
import net.minecraft.block.Block;
import net.minecraft.util.Holder;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.CountPlacementModifier;
import net.minecraft.world.gen.decorator.HeightRangePlacementModifier;
import net.minecraft.world.gen.decorator.InSquarePlacementModifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.util.ConfiguredFeatureUtil;
import net.minecraft.world.gen.feature.util.PlacedFeatureUtil;

public class QuiltGenRegistry {
    private static final Block WITHERITE_DEPOSIT = Blocks.WITHERITE_DEPOSIT;

    private static final Holder<ConfiguredFeature<OreFeatureConfig,?>> WITHERITE_FEATURE = ConfiguredFeatureUtil.register(WitheriteCommon.id("witherite_ore").toString(), Feature.ORE,
            new OreFeatureConfig(
                    OreConfiguredFeatures.NETHERRACK,
                    WITHERITE_DEPOSIT.getDefaultState(),
                    1
            )
    );
    public static Holder<PlacedFeature> WITHERITE_DEPOSIT_FEATURE = PlacedFeatureUtil.register(WitheriteCommon.id("witherite_ore").toString(),WITHERITE_FEATURE,
            CountPlacementModifier.create(2),
            InSquarePlacementModifier.getInstance(),
            HeightRangePlacementModifier.createUniform(YOffset.fixed(1), YOffset.fixed(12))
    );

    public static void register() {
        WitheriteCommon.logger.warn("Currently, QSL doesn't have a Biome API, so ore generation is disabled.");
        /*/
        BiomeModifications.addFeature(
                BiomeSelectors.foundInTheNether(),
                GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(
                        Registry.PLACED_FEATURE_KEY,
                        WitheriteCommon.id("witherite_ore")
                )
        );
        //*/
    }
}
