package net.meowcorp.waotweaks.voidorite;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;

import java.util.Arrays;

public class VoidoriteOreGen {
    // Generate Voidorite Ore in THE_END
    public static ConfiguredFeature<?, ?> ORE_VOIDORITE_END_CONFIGURED = new ConfiguredFeature(
            Feature.ORE,
            new OreFeatureConfig(
                    new BlockMatchRuleTest(Blocks.END_STONE),
                    Voidorite.VOIDORITE_ORE.getDefaultState(),
                    4
            )
    );

    public static PlacedFeature ORE_VOIDORITE_END_PLACED = new PlacedFeature(
            RegistryEntry.of(ORE_VOIDORITE_END_CONFIGURED),
            Arrays.asList(
                    CountPlacementModifier.of(1),
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(40))
            )
    );

    public static void register() {
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier("waotweaks", "ore_voidorite_end"), ORE_VOIDORITE_END_CONFIGURED);
        Registry.register(BuiltinRegistries.PLACED_FEATURE,
                new Identifier("waotweaks", "ore_voidorite_end"), ORE_VOIDORITE_END_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier("waotweaks", "ore_voidorite_end"))
        );
    }
}