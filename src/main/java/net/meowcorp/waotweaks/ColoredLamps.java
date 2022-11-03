package net.meowcorp.waotweaks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.property.Properties;
import net.minecraft.block.RedstoneLampBlock;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.Locale;
import java.util.function.ToIntFunction;

public class ColoredLamps {

    private static ToIntFunction<BlockState> createLightLevelFromLitBlockState(int litLevel) {
        return (state) -> {
            return (Boolean)state.get(Properties.LIT) ? litLevel : 0;
        };
    }

    public static void register() {
        for (DyeColor color : DyeColor.values()) {
            Block COLORED_LAMP = new RedstoneLampBlock(
                    FabricBlockSettings.of(Material.REDSTONE_LAMP)
                            .luminance(createLightLevelFromLitBlockState(15))
                            .strength(0.3F)
                            .sounds(BlockSoundGroup.GLASS)
            );
            Registry.register(Registry.BLOCK,
                    new Identifier("waotweaks", color.name().toLowerCase(Locale.ROOT) + "_colored_lamp"),
                    COLORED_LAMP);
            Registry.register(Registry.ITEM,
                    new Identifier("waotweaks", color.name().toLowerCase(Locale.ROOT) + "_colored_lamp"),
                    new BlockItem(COLORED_LAMP, new FabricItemSettings().group(WaoTweaks.LAMPS)));
        }
    }
}
