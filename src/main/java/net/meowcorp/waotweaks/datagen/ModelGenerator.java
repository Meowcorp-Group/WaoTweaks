package net.meowcorp.waotweaks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.meowcorp.waotweaks.mixin.BlockStateModelGeneratorInvoker;
import net.meowcorp.waotweaks.voidorite.Voidorite;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.Locale;

public class ModelGenerator extends FabricModelProvider {
    public ModelGenerator(FabricDataGenerator generator) {
        super(generator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        for (DyeColor color : DyeColor.values()) {
            ((BlockStateModelGeneratorInvoker) blockStateModelGenerator).invokeRegisterRedstoneLamp(Registry.BLOCK.get(
                    new Identifier("waotweaks", color.name().toLowerCase(Locale.ROOT) + "_colored_lamp")));
        }

        blockStateModelGenerator.registerSimpleCubeAll(Voidorite.VOIDORITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(Voidorite.VOIDORITE_ORE);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
