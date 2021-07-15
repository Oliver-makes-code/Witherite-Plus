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
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.heightprovider.UniformHeightProvider;

public class GenRegistry {
    private static final String ID = Witherite.MOD_ID;
    private static final ItemGroup GROUP = Witherite.WITHERITE_GROUP;
    private static final Block WITHERITE_DEPOSIT = BlockRegistry.WITHERITE_DEPOSIT;

    // Configured Features
    private static final ConfiguredFeature<?, ?> WITHERITE_DEPOSIT_NETHER = Feature.ORE.configure(new OreFeatureConfig
            (OreFeatureConfig.Rules.BASE_STONE_NETHER, WITHERITE_DEPOSIT.getDefaultState(), 3))
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(UniformHeightProvider
                    .create(YOffset.aboveBottom(1), YOffset.fixed(12)))))
            .spreadHorizontally().repeat(2);

    public static void register() {
        // Register Configured Features
        RegistryKey<ConfiguredFeature<?, ?>> witheriteDeposit = RegistryKey
                .of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(ID, "witherite_deposit_nether"));

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, witheriteDeposit.getValue(), WITHERITE_DEPOSIT_NETHER);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, witheriteDeposit);
    }
}
