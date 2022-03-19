package flamingcherry.witherite.forge;

import flamingcherry.witherite.common.Blocks;
import flamingcherry.witherite.common.WitheriteCommon;
import net.minecraft.block.Block;
import net.minecraft.util.Holder;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.CountPlacementModifier;
import net.minecraft.world.gen.decorator.HeightRangePlacementModifier;
import net.minecraft.world.gen.decorator.InSquarePlacementModifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.util.ConfiguredFeatureUtil;
import net.minecraft.world.gen.feature.util.PlacedFeatureUtil;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class ForgeGenRegistry {
    private static final Block WITHERITE_DEPOSIT = Blocks.WITHERITE_DEPOSIT;

    private static Holder<ConfiguredFeature<OreFeatureConfig,?>> WITHERITE_FEATURE;

    public static Holder<PlacedFeature> WITHERITE_DEPOSIT_PLACED;

    public static void registerOre() {
        WITHERITE_FEATURE = ConfiguredFeatureUtil.register("witherite_ore", Feature.ORE,
                new OreFeatureConfig(
                        OreConfiguredFeatures.NETHERRACK,
                        WITHERITE_DEPOSIT.getDefaultState(),
                        1
                )
        );
        WITHERITE_DEPOSIT_PLACED = PlacedFeatureUtil.register("witherite_ore",WITHERITE_FEATURE,
                CountPlacementModifier.create(2),
                InSquarePlacementModifier.getInstance(),
                HeightRangePlacementModifier.createUniform(YOffset.fixed(1), YOffset.fixed(12))
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
