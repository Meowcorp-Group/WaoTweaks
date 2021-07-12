package online.meowcorp.waotweaks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Enderite {

        /*
            ENDERITE MATERIALS
                                  */

        //Enderite Ingot
        public static final Item ENDERITE_INGOT = new Item(
                new Item
                        .Settings().fireproof()
                        .group(WaoTweaks.ENDERITE)
        );

        //Enderite Block
        public static final Block ENDERITE_BLOCK = new Block(
                FabricBlockSettings
                        .of(Material.METAL)
                        .breakByHand(false)
                        .breakByTool(FabricToolTags.PICKAXES, 4)
                        .requiresTool()
                        .strength(50, 1200.0f)
        );

        //Enderite Dust
        public static final Item ENDERITE_DUST = new Item(
                new Item
                        .Settings().fireproof()
                        .group(WaoTweaks.ENDERITE)
        );

        //Enderite Scrap
        public static final Item ENDERITE_SCRAP = new Item(
                new Item
                        .Settings().fireproof()
                        .group(WaoTweaks.ENDERITE)
        );

        //Enderite Ore
        public static final Block ENDERITE_ORE = new Block(
                FabricBlockSettings
                        .of(Material.STONE)
                        .breakByHand(false)
                        .breakByTool(FabricToolTags.PICKAXES, 4)
                        .requiresTool()
                        .strength(30, 1200.0f)
        );

        /*
        ENDERITE TOOLS
                         */

        //Enderite Sword
        public static ToolItem ENDERITE_SWORD = new SwordItem(
                EnderiteToolMaterial.INSTANCE, 9, -2.4F, new Item.Settings().fireproof().group(WaoTweaks.ENDERITE));

        //Enderite Pickaxe
        public static ToolItem ENDERITE_PICKAXE = new PickaxeBase(
                EnderiteToolMaterial.INSTANCE, 6, -2.8F, new Item.Settings().fireproof().group(WaoTweaks.ENDERITE));

        //Enderite Axe
        public static ToolItem ENDERITE_AXE = new AxeBase(
                EnderiteToolMaterial.INSTANCE, 11, -3, new Item.Settings().fireproof().group(WaoTweaks.ENDERITE));

        //Enderite Shovel
        public static ToolItem ENDERITE_SHOVEL = new ShovelItem(
                EnderiteToolMaterial.INSTANCE, 6.5F, -3, new Item.Settings().fireproof().group(WaoTweaks.ENDERITE));

        //Enderite Hoe
        public static ToolItem ENDERITE_HOE = new HoeBase(
                EnderiteToolMaterial.INSTANCE, 0, 1, new Item.Settings().fireproof().group(WaoTweaks.ENDERITE));


    public static void register() {

        //Enderite Ingot
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "enderite_ingot"), ENDERITE_INGOT);

        //Enderite Block
        Registry.register(Registry.BLOCK, new Identifier("waotweaks", "enderite_block"), ENDERITE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "enderite_block"), new BlockItem(ENDERITE_BLOCK, new FabricItemSettings().fireproof().group(WaoTweaks.ENDERITE)));

        //Enderite Dust
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "enderite_dust"), ENDERITE_DUST);

        //Enderite Scrap
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "enderite_scrap"), ENDERITE_SCRAP);

        //Enderite Ore
        Registry.register(Registry.BLOCK, new Identifier("waotweaks", "enderite_ore"), ENDERITE_ORE);
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "enderite_ore"), new BlockItem(ENDERITE_ORE, new FabricItemSettings().fireproof().group(WaoTweaks.ENDERITE)));

        //Enderite Sword
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "enderite_sword"), ENDERITE_SWORD);

        //Enderite Pickaxe
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "enderite_pickaxe"), ENDERITE_PICKAXE);

        //Enderite Axe
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "enderite_axe"), ENDERITE_AXE);

        //Enderite Shovel
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "enderite_shovel"), ENDERITE_SHOVEL);

        //Enderite Hoe
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "enderite_hoe"), ENDERITE_HOE);
    }
}
