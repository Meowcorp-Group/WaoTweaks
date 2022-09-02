package net.meowcorp.waotweaks.potions;

import net.meowcorp.waotweaks.mixin.BrewingRecipeRegistryInvoker;
import net.minecraft.item.Items;
import net.minecraft.potion.Potions;

public class PotsRecipe {
    static {
        BrewingRecipeRegistryInvoker.invokeRegisterPotionRecipe(Potions.AWKWARD, Items.CHORUS_FRUIT, Pots.LEVITATION);
    }
}
