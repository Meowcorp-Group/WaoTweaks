package net.meowcorp.waotweaks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.meowcorp.waotweaks.WaoTweaks;
import net.meowcorp.waotweaks.voidorite.Voidorite;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;
import net.minecraft.state.property.Properties;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.Locale;

public class ModelGenerator extends FabricModelProvider {
    public ModelGenerator(FabricDataGenerator generator) {
        super(generator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator generator) {
        generator.registerSimpleCubeAll(Voidorite.VOIDORITE_BLOCK);
        generator.registerSimpleCubeAll(Voidorite.VOIDORITE_ORE);

        for (DyeColor color : DyeColor.values()) {
            Block lampBlock = Registry.BLOCK.get(new Identifier(WaoTweaks.MODID, color.name().toLowerCase(Locale.ROOT) + "_colored_lamp"));
            Identifier genericModelOff = new Identifier(WaoTweaks.MODID, "block/colored_lamp");
            Identifier genericModelOn = new Identifier(WaoTweaks.MODID, "block/colored_lamp_on");
            Identifier modelOff = new Identifier(WaoTweaks.MODID, "block/" + color.name().toLowerCase(Locale.ROOT) + "_colored_lamp");
            Identifier modelOn = new Identifier(WaoTweaks.MODID, "block/" + color.name().toLowerCase(Locale.ROOT) + "_colored_lamp_on");

            Models.CUBE_ALL.upload(lampBlock, TextureMap.all(genericModelOff), generator.modelCollector);
            Models.CUBE_ALL.upload(lampBlock, "_on", TextureMap.all(genericModelOn), generator.modelCollector);

            // create a model for each color
//            generator.modelCollector.accept(MultipartBlockStateSupplier.create());

            generator.blockStateCollector.accept(VariantsBlockStateSupplier.create(lampBlock)
                    .coordinate(generator.createBooleanModelMap(Properties.LIT, modelOn, modelOff)));
            generator.registerParentedItemModel(lampBlock, modelOn);


        }
    }

    @Override
    public void generateItemModels(ItemModelGenerator generator) {
    }
}
