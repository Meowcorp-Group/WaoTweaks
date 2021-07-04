package online.meowcorp.waotweaks;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.*;
import net.minecraft.util.Rarity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.heightprovider.UniformHeightProvider;

import static net.minecraft.world.gen.feature.Feature.ORE;

public class WaoTweaks implements ModInitializer {

    /*
         ITEM GROUPS
                        */

    //Item Group RESOURCES
    public static final ItemGroup RESOURCES = FabricItemGroupBuilder.build(
        new Identifier("waotweaks", "resources"),
        () -> new ItemStack(WaoTweaks.ENDERITE_INGOT)
    );

    //Item Group TOOLS
    public static final ItemGroup TOOLS = FabricItemGroupBuilder.build(
        new Identifier("waotweaks", "tools"),
        () -> new ItemStack(WaoTweaks.ENDERITE_PICKAXE)
    );

    //Item Group ARMORS
    public static final ItemGroup ARMOR = FabricItemGroupBuilder.build(
        new Identifier("waotweaks", "armor"),
        () -> new ItemStack(RegisterEnderiteArmor.ENDERITE_CHESTPLATE)
    );

    //Item Group FOODS
    public static final ItemGroup FOODS = FabricItemGroupBuilder.build(
        new Identifier("waotweaks", "foods"),
        () -> new ItemStack(WaoTweaks.STEAK_SANDWICH)
    );

    /*
        ENDERITE MATERIALS
                              */

    //Enderite Ingot
    public static final Item ENDERITE_INGOT = new Item(
        new Item
        .Settings().fireproof()
        .group(WaoTweaks.RESOURCES)
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
        .group(WaoTweaks.RESOURCES)
    );
    
    //Enderite Scrap
    public static final Item ENDERITE_SCRAP = new Item(
        new Item
        .Settings().fireproof()
        .group(WaoTweaks.RESOURCES)
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

    //NINETEEN DOLLAR FORTNITE CARD
    public static final Item FORTNITE_CARD = new Item(
        new Item
        .Settings().fireproof()
        .maxCount(1)
        .group(WaoTweaks.RESOURCES)
        .rarity(Rarity.UNCOMMON)
    );



    /*
    Old oregen code that doesn't work anymore

    private static ConfiguredFeature<?, ?> ORE_ENDERITE_END = Feature.ORE
    .configure(new OreFeatureConfig(
        new BlockMatchRuleTest(Blocks.END_STONE), // base block is endstone in the end biomes
        WaoTweaks.ENDERITE_ORE.getDefaultState(),
        4))
    .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
        0,
        0,
        40))
    .spreadHorizontally()
    .repeat(1));
     */

    //Generate Enderite Ore in THE_END
    public static final ConfiguredFeature<?, ?> ORE_ENDERITE_END = Feature.ORE
            .configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.END_STONE), WaoTweaks.ENDERITE_ORE.getDefaultState(), 4))
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(UniformHeightProvider.create(YOffset.fixed(0), YOffset.fixed(40))))).spreadHorizontally().repeat(1);


    /*
        ENDERITE TOOLS
                         */

    //Enderite Sword
    public static ToolItem ENDERITE_SWORD = new SwordItem(
        EnderiteToolMaterial.INSTANCE, 9, -2.4F, new Item.Settings().fireproof().group(WaoTweaks.TOOLS));

    //Enderite Pickaxe
    public static ToolItem ENDERITE_PICKAXE = new PickaxeBase(
        EnderiteToolMaterial.INSTANCE, 6, -2.8F, new Item.Settings().fireproof().group(WaoTweaks.TOOLS));

    //Enderite Axe
    public static ToolItem ENDERITE_AXE = new AxeBase(
        EnderiteToolMaterial.INSTANCE, 11, -3, new Item.Settings().fireproof().group(WaoTweaks.TOOLS));

    //Enderite Shovel
    public static ToolItem ENDERITE_SHOVEL = new ShovelItem(
        EnderiteToolMaterial.INSTANCE, 6.5F, -3, new Item.Settings().fireproof().group(WaoTweaks.TOOLS));

    //Enderite Hoe
    public static ToolItem ENDERITE_HOE = new HoeBase(
        EnderiteToolMaterial.INSTANCE, 0, 1, new Item.Settings().fireproof().group(WaoTweaks.TOOLS));

    /*
        ENDERITE ARMOR
                         */

    //All Enderite Armor in the "RegisterEnderiteArmor" class

    /*
        FOODS
                */
    
    //Steak Sandwich
    public static final Item STEAK_SANDWICH = new Item(
        new Item
        .Settings()
        .group(WaoTweaks.FOODS)
        .food(
            new FoodComponent
            .Builder()
            .hunger(14)
            .saturationModifier(1.28F)
            .build()
            )
    );

    //Carrot-Steak Sandwich
    public static final Item CARROT_STEAK_SANDWICH = new Item(
        new Item
        .Settings()
        .group(WaoTweaks.FOODS)
        .food(
            new FoodComponent
            .Builder()
            .hunger(15)
            .saturationModifier(1.26F)
            .build()
        )
    );

    //Golden Brown Mushroom
    public static final Item GOLDEN_BROWN_MUSHROOM = new Item(
        new Item
        .Settings()
        .group(WaoTweaks.FOODS)
    );

    //Golden Red Mushroom
    public static final Item GOLDEN_RED_MUSHROOM = new Item(
        new Item
        .Settings()
        .group(WaoTweaks.FOODS)
    );

    //Golden Mushroom Stew
    public static final Item GOLDEN_MUSHROOM_STEW = new Item(
        new Item
        .Settings()
        .group(WaoTweaks.FOODS)
        .maxCount(1)
        .food(
            new FoodComponent
            .Builder()
            .hunger(8)
            .saturationModifier(0.93F)
            .build()
        )
    );

    //Golden Bread
    public static final Item GOLDEN_BREAD = new Item(
        new Item
        .Settings()
        .group(WaoTweaks.FOODS)
        .food(
            new FoodComponent
            .Builder()
            .hunger(8)
            .saturationModifier(0.93F)
            .build()
        )
    );

    //Golden Steak
    public static final Item GOLDEN_STEAK = new Item(
        new Item
        .Settings()
        .group(WaoTweaks.FOODS)
        .food(
            new FoodComponent
            .Builder()
            .hunger(10)
            .saturationModifier(0.75F)
            .meat()
            .build()
        )
    );

    //Golden Sandwich
    public static final Item GOLDEN_SANDWICH = new Item(
        new Item
        .Settings()
        .group(WaoTweaks.FOODS)
        .rarity(Rarity.RARE)
        .food(
            new FoodComponent
            .Builder()
            .hunger(14)
            .saturationModifier(1.42F)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,20*15, 1), 1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20*3, 1), 1F)
            .build()
        )
    );

    //Enchanted Golden Sandwich
    public static final Item ENCHANTED_GOLDEN_SANDWICH = new EnchantedGoldenSandwichGlint(
        new Item
        .Settings()
        .group(WaoTweaks.FOODS)
        .rarity(Rarity.EPIC)
        .food(
            new FoodComponent
            .Builder()
            .hunger(20)
            .saturationModifier(1F)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 20*30, 1), 1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20*5, 2), 1F)
            .build()
        )

    );



    @Override
    public void onInitialize() {

        //Enderite Ingot
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "enderite_ingot"), ENDERITE_INGOT);

        //Enderite Block
        Registry.register(Registry.BLOCK, new Identifier("waotweaks", "enderite_block"), ENDERITE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "enderite_block"), new BlockItem(ENDERITE_BLOCK, new FabricItemSettings().fireproof().group(WaoTweaks.RESOURCES)));

        //Enderite Dust
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "enderite_dust"), ENDERITE_DUST);

        //Enderite Scrap
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "enderite_scrap"), ENDERITE_SCRAP);

        //Enderite Ore
        Registry.register(Registry.BLOCK, new Identifier("waotweaks", "enderite_ore"), ENDERITE_ORE);
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "enderite_ore"), new BlockItem(ENDERITE_ORE, new FabricItemSettings().fireproof().group(WaoTweaks.RESOURCES)));

        //NINETEEN DOLLAR FORTNITE CARD
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "fortnite_card"), FORTNITE_CARD);



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



        //Register all Enderite Armor
        RegisterEnderiteArmor.register();



        //Steak Sandwich
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "steak_sandwich"), STEAK_SANDWICH);

        //Carrot-Steak Sandwich
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "carrot_steak_sandwich"), CARROT_STEAK_SANDWICH);

        //Golden Brown Mushroom
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "golden_brown_mushroom"), GOLDEN_BROWN_MUSHROOM);

        //Golden Red Mushroom
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "golden_red_mushroom"), GOLDEN_RED_MUSHROOM);

        //Golden Mushroom Stew
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "golden_mushroom_stew"), GOLDEN_MUSHROOM_STEW);

        //Golden Bread
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "golden_bread"), GOLDEN_BREAD);

        //Golden Steak
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "golden_steak"), GOLDEN_STEAK);

        //Golden Sandwich
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "golden_sandwich"), GOLDEN_SANDWICH);

        //Enchanted Golden Sandwich
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "enchanted_golden_sandwich"), ENCHANTED_GOLDEN_SANDWICH);


        
        //Generate Enderite Ore in THE_END
        RegistryKey<ConfiguredFeature<?, ?>> oreEnderiteEnd = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
        new Identifier("waotweaks", "ore_enderite_end"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreEnderiteEnd.getValue(), ORE_ENDERITE_END);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreEnderiteEnd);

        
    }

}