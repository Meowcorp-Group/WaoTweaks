package online.meowcorp.waotweaks.potions;

import net.minecraft.item.Items;
import net.minecraft.potion.Potions;
import online.meowcorp.waotweaks.mixin.BrewingRecipeRegistryInvoker;

public class PotsRecipe {
    static {
        BrewingRecipeRegistryInvoker.invokeRegisterPotionRecipe(Potions.AWKWARD, Items.CHORUS_FRUIT, Pots.LEVITATION);
    }
}
