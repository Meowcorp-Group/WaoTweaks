package net.meowcorp.waotweaks.voidorite;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.heightprovider.UniformHeightProvider;

public class VoidoriteOreGen {
    //Generate Voidorite Ore in THE_END
    public static final ConfiguredFeature<?, ?> ORE_VOIDORITE_END = Feature.ORE
            .configure(new OreFeatureConfig(
                    new BlockMatchRuleTest(Blocks.END_STONE),
                    Voidorite.VOIDORITE_ORE.getDefaultState(), 4))
            .range(new RangeDecoratorConfig(
                    UniformHeightProvider.create(YOffset.fixed(0), YOffset.fixed(40))))
            .spreadHorizontally()
            .repeat(1);

    public static void register() {
        //Generate Voidorite Ore in THE_END
        RegistryKey<ConfiguredFeature<?, ?>> oreVoidoriteEnd = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier("waotweaks", "ore_voidorite_end"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreVoidoriteEnd.getValue(), ORE_VOIDORITE_END);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreVoidoriteEnd);
    }
}