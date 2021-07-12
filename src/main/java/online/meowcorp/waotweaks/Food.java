package online.meowcorp.waotweaks;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class Food {

    /*
        FOODS
                */

    //Steak Sandwich
    public static final Item STEAK_SANDWICH = new Item(
            new Item
                    .Settings()
                    .group(WaoTweaks.FOOD)
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
                    .group(WaoTweaks.FOOD)
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
                    .group(WaoTweaks.FOOD)
    );

    //Golden Red Mushroom
    public static final Item GOLDEN_RED_MUSHROOM = new Item(
            new Item
                    .Settings()
                    .group(WaoTweaks.FOOD)
    );

    //Golden Mushroom Stew
    public static final Item GOLDEN_MUSHROOM_STEW = new Item(
            new Item
                    .Settings()
                    .group(WaoTweaks.FOOD)
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
                    .group(WaoTweaks.FOOD)
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
                    .group(WaoTweaks.FOOD)
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
                    .group(WaoTweaks.FOOD)
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
    public static final Item ENCHANTED_GOLDEN_SANDWICH = new ItemGlint(
            new Item
                    .Settings()
                    .group(WaoTweaks.FOOD)
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

    public static void register() {

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

    }
}
