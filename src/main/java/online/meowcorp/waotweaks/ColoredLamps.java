package online.meowcorp.waotweaks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.property.Properties;
import net.minecraft.block.RedstoneLampBlock;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.function.ToIntFunction;

public class ColoredLamps {

    private static ToIntFunction<BlockState> createLightLevelFromLitBlockState(int litLevel) {
        return (state) -> {
            return (Boolean)state.get(Properties.LIT) ? litLevel : 0;
        };
    }

    public static final Block COLORED_LAMP1 = new RedstoneLampBlock(
            FabricBlockSettings.of(Material.REDSTONE_LAMP)
            .luminance(createLightLevelFromLitBlockState(15))
            .strength(0.3F)
            .sounds(BlockSoundGroup.GLASS)
    );

    public static final Block COLORED_LAMP2 = new RedstoneLampBlock(
            FabricBlockSettings.of(Material.REDSTONE_LAMP)
                    .luminance(createLightLevelFromLitBlockState(15))
                    .strength(0.3F)
                    .sounds(BlockSoundGroup.GLASS)
    );

    public static final Block COLORED_LAMP3 = new RedstoneLampBlock(
            FabricBlockSettings.of(Material.REDSTONE_LAMP)
                    .luminance(createLightLevelFromLitBlockState(15))
                    .strength(0.3F)
                    .sounds(BlockSoundGroup.GLASS)
    );

    public static final Block COLORED_LAMP4 = new RedstoneLampBlock(
            FabricBlockSettings.of(Material.REDSTONE_LAMP)
                    .luminance(createLightLevelFromLitBlockState(15))
                    .strength(0.3F)
                    .sounds(BlockSoundGroup.GLASS)
    );

    public static final Block COLORED_LAMP5 = new RedstoneLampBlock(
            FabricBlockSettings.of(Material.REDSTONE_LAMP)
                    .luminance(createLightLevelFromLitBlockState(15))
                    .strength(0.3F)
                    .sounds(BlockSoundGroup.GLASS)
    );

    public static final Block COLORED_LAMP6 = new RedstoneLampBlock(
            FabricBlockSettings.of(Material.REDSTONE_LAMP)
                    .luminance(createLightLevelFromLitBlockState(15))
                    .strength(0.3F)
                    .sounds(BlockSoundGroup.GLASS)
    );

    public static final Block COLORED_LAMP7 = new RedstoneLampBlock(
            FabricBlockSettings.of(Material.REDSTONE_LAMP)
                    .luminance(createLightLevelFromLitBlockState(15))
                    .strength(0.3F)
                    .sounds(BlockSoundGroup.GLASS)
    );

    public static final Block COLORED_LAMP8 = new RedstoneLampBlock(
            FabricBlockSettings.of(Material.REDSTONE_LAMP)
                    .luminance(createLightLevelFromLitBlockState(15))
                    .strength(0.3F)
                    .sounds(BlockSoundGroup.GLASS)
    );

    public static final Block COLORED_LAMP9 = new RedstoneLampBlock(
            FabricBlockSettings.of(Material.REDSTONE_LAMP)
                    .luminance(createLightLevelFromLitBlockState(15))
                    .strength(0.3F)
                    .sounds(BlockSoundGroup.GLASS)
    );

    public static final Block COLORED_LAMP10 = new RedstoneLampBlock(
            FabricBlockSettings.of(Material.REDSTONE_LAMP)
                    .luminance(createLightLevelFromLitBlockState(15))
                    .strength(0.3F)
                    .sounds(BlockSoundGroup.GLASS)
    );

    public static final Block COLORED_LAMP11 = new RedstoneLampBlock(
            FabricBlockSettings.of(Material.REDSTONE_LAMP)
                    .luminance(createLightLevelFromLitBlockState(15))
                    .strength(0.3F)
                    .sounds(BlockSoundGroup.GLASS)
    );

    public static final Block COLORED_LAMP12 = new RedstoneLampBlock(
            FabricBlockSettings.of(Material.REDSTONE_LAMP)
                    .luminance(createLightLevelFromLitBlockState(15))
                    .strength(0.3F)
                    .sounds(BlockSoundGroup.GLASS)
    );

    public static final Block COLORED_LAMP13 = new RedstoneLampBlock(
            FabricBlockSettings.of(Material.REDSTONE_LAMP)
                    .luminance(createLightLevelFromLitBlockState(15))
                    .strength(0.3F)
                    .sounds(BlockSoundGroup.GLASS)
    );

    public static final Block COLORED_LAMP14 = new RedstoneLampBlock(
            FabricBlockSettings.of(Material.REDSTONE_LAMP)
                    .luminance(createLightLevelFromLitBlockState(15))
                    .strength(0.3F)
                    .sounds(BlockSoundGroup.GLASS)
    );

    public static final Block COLORED_LAMP15 = new RedstoneLampBlock(
            FabricBlockSettings.of(Material.REDSTONE_LAMP)
                    .luminance(createLightLevelFromLitBlockState(15))
                    .strength(0.3F)
                    .sounds(BlockSoundGroup.GLASS)
    );

    public static void register() {
        Registry.register(Registry.BLOCK, new Identifier("waotweaks", "white_colored_lamp"), COLORED_LAMP1);
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "white_colored_lamp"),
                new BlockItem(COLORED_LAMP1, new FabricItemSettings().group(ItemGroup.REDSTONE)));

        Registry.register(Registry.BLOCK, new Identifier("waotweaks", "orange_colored_lamp"), COLORED_LAMP2);
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "orange_colored_lamp"),
                new BlockItem(COLORED_LAMP2, new FabricItemSettings().group(ItemGroup.REDSTONE)));

        Registry.register(Registry.BLOCK, new Identifier("waotweaks", "magenta_colored_lamp"), COLORED_LAMP3);
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "magenta_colored_lamp"),
                new BlockItem(COLORED_LAMP3, new FabricItemSettings().group(ItemGroup.REDSTONE)));

        Registry.register(Registry.BLOCK, new Identifier("waotweaks", "light_blue_colored_lamp"), COLORED_LAMP4);
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "light_blue_colored_lamp"),
                new BlockItem(COLORED_LAMP4, new FabricItemSettings().group(ItemGroup.REDSTONE)));

        Registry.register(Registry.BLOCK, new Identifier("waotweaks", "yellow_colored_lamp"), COLORED_LAMP5);
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "yellow_colored_lamp"),
                new BlockItem(COLORED_LAMP5, new FabricItemSettings().group(ItemGroup.REDSTONE)));

        Registry.register(Registry.BLOCK, new Identifier("waotweaks", "lime_colored_lamp"), COLORED_LAMP6);
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "lime_colored_lamp"),
                new BlockItem(COLORED_LAMP6, new FabricItemSettings().group(ItemGroup.REDSTONE)));

        Registry.register(Registry.BLOCK, new Identifier("waotweaks", "pink_colored_lamp"), COLORED_LAMP7);
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "pink_colored_lamp"),
                new BlockItem(COLORED_LAMP7, new FabricItemSettings().group(ItemGroup.REDSTONE)));

        Registry.register(Registry.BLOCK, new Identifier("waotweaks", "gray_colored_lamp"), COLORED_LAMP8);
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "gray_colored_lamp"),
                new BlockItem(COLORED_LAMP8, new FabricItemSettings().group(ItemGroup.REDSTONE)));

        Registry.register(Registry.BLOCK, new Identifier("waotweaks", "light_gray_colored_lamp"), COLORED_LAMP9);
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "light_gray_colored_lamp"),
                new BlockItem(COLORED_LAMP9, new FabricItemSettings().group(ItemGroup.REDSTONE)));

        Registry.register(Registry.BLOCK, new Identifier("waotweaks", "cyan_colored_lamp"), COLORED_LAMP10);
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "cyan_colored_lamp"),
                new BlockItem(COLORED_LAMP10, new FabricItemSettings().group(ItemGroup.REDSTONE)));

        Registry.register(Registry.BLOCK, new Identifier("waotweaks", "purple_colored_lamp"), COLORED_LAMP11);
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "purple_colored_lamp"),
                new BlockItem(COLORED_LAMP11, new FabricItemSettings().group(ItemGroup.REDSTONE)));

        Registry.register(Registry.BLOCK, new Identifier("waotweaks", "blue_colored_lamp"), COLORED_LAMP12);
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "blue_colored_lamp"),
                new BlockItem(COLORED_LAMP12, new FabricItemSettings().group(ItemGroup.REDSTONE)));

        Registry.register(Registry.BLOCK, new Identifier("waotweaks", "brown_colored_lamp"), COLORED_LAMP13);
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "brown_colored_lamp"),
                new BlockItem(COLORED_LAMP13, new FabricItemSettings().group(ItemGroup.REDSTONE)));

        Registry.register(Registry.BLOCK, new Identifier("waotweaks", "green_colored_lamp"), COLORED_LAMP14);
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "green_colored_lamp"),
                new BlockItem(COLORED_LAMP14, new FabricItemSettings().group(ItemGroup.REDSTONE)));

        Registry.register(Registry.BLOCK, new Identifier("waotweaks", "red_colored_lamp"), COLORED_LAMP15);
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "red_colored_lamp"),
                new BlockItem(COLORED_LAMP15, new FabricItemSettings().group(ItemGroup.REDSTONE)));

    }
}
