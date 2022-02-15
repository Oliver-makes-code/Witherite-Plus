package flamingcherry.witherite.forge;

import flamingcherry.witherite.common.Blocks;
import flamingcherry.witherite.common.WitheriteCommon;
import net.minecraft.block.Block;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.CountPlacementModifier;
import net.minecraft.world.gen.decorator.HeightRangePlacementModifier;
import net.minecraft.world.gen.decorator.InSquarePlacementModifier;
import net.minecraft.world.gen.feature.*;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class ForgeGenRegistry {
    private static final Block WITHERITE_DEPOSIT = Blocks.WITHERITE_DEPOSIT;

    private static final ConfiguredFeature<?,?> WITHERITE_FEATURE = Feature.ORE.configure(
            new OreFeatureConfig(
                    OreConfiguredFeatures.NETHERRACK,
                    WITHERITE_DEPOSIT.getDefaultState(),
                    4
            )
    );

    public static final PlacedFeature WITHERITE_DEPOSIT_PLACED = WITHERITE_FEATURE.withPlacement(
            CountPlacementModifier.create(4),
            InSquarePlacementModifier.getInstance(),
            HeightRangePlacementModifier.createUniform(YOffset.fixed(1), YOffset.fixed(12))
    );

    public static void registerOre() {
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
    }

    @Mod.EventBusSubscriber(modid = WitheriteCommon.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
    public static class Registers {
        @SubscribeEvent
        public static void biomeLoading(BiomeLoadingEvent event) {
            if (event.getCategory() != Biome.Category.NETHER) return;
            event.getGeneration().feature(GenerationStep.Feature.UNDERGROUND_ORES, WITHERITE_DEPOSIT_PLACED);
        }
    }
}
