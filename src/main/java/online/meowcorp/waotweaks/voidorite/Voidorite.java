package online.meowcorp.waotweaks.voidorite;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import online.meowcorp.waotweaks.ItemBase.AxeBase;
import online.meowcorp.waotweaks.ItemBase.HoeBase;
import online.meowcorp.waotweaks.ItemBase.PickaxeBase;
import online.meowcorp.waotweaks.WaoTweaks;

public class Voidorite {

        /*
            VOIDORITE MATERIALS
                                  */

        //Voidorite Ingot
        public static final Item VOIDORITE_INGOT = new Item(
                new Item
                        .Settings().fireproof()
                        .group(WaoTweaks.VOIDORITE)
        );

        //Voidorite Block
        public static final Block VOIDORITE_BLOCK = new Block(
                FabricBlockSettings
                        .of(Material.METAL)
                        .breakByHand(false)
                        .breakByTool(FabricToolTags.PICKAXES, 4)
                        .requiresTool()
                        .strength(50, 1200.0f)
        );

        //Voidorite Dust
        public static final Item VOIDORITE_DUST = new Item(
                new Item
                        .Settings().fireproof()
                        .group(WaoTweaks.VOIDORITE)
        );

        //Voidorite Scrap
        public static final Item VOIDORITE_SCRAP = new Item(
                new Item
                        .Settings().fireproof()
                        .group(WaoTweaks.VOIDORITE)
        );

        //Voidorite Ore
        public static final Block VOIDORITE_ORE = new Block(
                FabricBlockSettings
                        .of(Material.STONE)
                        .breakByHand(false)
                        .breakByTool(FabricToolTags.PICKAXES, 4)
                        .requiresTool()
                        .strength(30, 1200.0f)
        );

        //Void Gem Ore
        public static final Block VOID_GEM_ORE = new Block(
                FabricBlockSettings
                        .of(Material.STONE)
                        .breakByHand(false)
                        .breakByTool(FabricToolTags.PICKAXES, 4)
                        .requiresTool()
                        .strength(30, 1200f)
        );

        /*
        VOIDORITE TOOLS
                         */

        //Voidorite Sword
        public static ToolItem VOIDORITE_SWORD = new SwordItem(
                VoidoriteToolMaterial.INSTANCE, 9, -2.4F, new Item.Settings().fireproof().group(WaoTweaks.VOIDORITE));

        //Voidorite Pickaxe
        public static ToolItem VOIDORITE_PICKAXE = new PickaxeBase(
                VoidoriteToolMaterial.INSTANCE, 6, -2.8F, new Item.Settings().fireproof().group(WaoTweaks.VOIDORITE));

        //Voidorite Axe
        public static ToolItem VOIDORITE_AXE = new AxeBase(
                VoidoriteToolMaterial.INSTANCE, 11, -3, new Item.Settings().fireproof().group(WaoTweaks.VOIDORITE));

        //Voidorite Shovel
        public static ToolItem VOIDORITE_SHOVEL = new ShovelItem(
                VoidoriteToolMaterial.INSTANCE, 6.5F, -3, new Item.Settings().fireproof().group(WaoTweaks.VOIDORITE));

        //Voidorite Hoe
        public static ToolItem VOIDORITE_HOE = new HoeBase(
                VoidoriteToolMaterial.INSTANCE, 0, 1, new Item.Settings().fireproof().group(WaoTweaks.VOIDORITE));


    public static void register() {

        //Voidorite Ingot
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "voidorite_ingot"), VOIDORITE_INGOT);

        //Voidorite Block
        Registry.register(Registry.BLOCK, new Identifier("waotweaks", "voidorite_block"), VOIDORITE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "voidorite_block"), new BlockItem(VOIDORITE_BLOCK, new FabricItemSettings().fireproof().group(WaoTweaks.VOIDORITE)));

        //Voidorite Dust
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "voidorite_dust"), VOIDORITE_DUST);

        //Voidorite Scrap
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "voidorite_scrap"), VOIDORITE_SCRAP);

        //Voidorite Ore
        Registry.register(Registry.BLOCK, new Identifier("waotweaks", "voidorite_ore"), VOIDORITE_ORE);
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "voidorite_ore"), new BlockItem(VOIDORITE_ORE, new FabricItemSettings().fireproof().group(WaoTweaks.VOIDORITE)));

        //Void Gem Ore
        Registry.register(Registry.BLOCK, new Identifier("waotweaks", "void_gem_ore"), VOID_GEM_ORE);
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "void_gem_ore"), new BlockItem(VOID_GEM_ORE, new FabricItemSettings().fireproof().group(WaoTweaks.VOIDORITE)));

        //Voidorite Sword
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "voidorite_sword"), VOIDORITE_SWORD);

        //Voidorite Pickaxe
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "voidorite_pickaxe"), VOIDORITE_PICKAXE);

        //Voidorite Axe
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "voidorite_axe"), VOIDORITE_AXE);

        //Voidorite Shovel
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "voidorite_shovel"), VOIDORITE_SHOVEL);

        //Voidorite Hoe
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "voidorite_hoe"), VOIDORITE_HOE);
    }
}
