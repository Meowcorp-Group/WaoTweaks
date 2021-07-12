package online.meowcorp.waotweaks;

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

public class EnderiteOreGen {
    //Generate Enderite Ore in THE_END
    public static final ConfiguredFeature<?, ?> ORE_ENDERITE_END = Feature.ORE
            .configure(new OreFeatureConfig(
                    new BlockMatchRuleTest(Blocks.END_STONE),
                    Enderite.ENDERITE_ORE.getDefaultState(), 4))
            .range(new RangeDecoratorConfig(
                    UniformHeightProvider.create(YOffset.fixed(0), YOffset.fixed(40))))
            .spreadHorizontally()
            .repeat(1);

    public static void register() {
        //Generate Enderite Ore in THE_END
        RegistryKey<ConfiguredFeature<?, ?>> oreEnderiteEnd = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
                new Identifier("waotweaks", "ore_enderite_end"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreEnderiteEnd.getValue(), ORE_ENDERITE_END);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreEnderiteEnd);
    }
}