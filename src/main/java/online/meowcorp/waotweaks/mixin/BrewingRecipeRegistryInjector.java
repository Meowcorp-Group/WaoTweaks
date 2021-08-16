package online.meowcorp.waotweaks.mixin;

import net.minecraft.item.Items;
import net.minecraft.potion.Potions;
import net.minecraft.recipe.BrewingRecipeRegistry;
import online.meowcorp.waotweaks.potions.Pots;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BrewingRecipeRegistry.class)
public class BrewingRecipeRegistryInjector implements BrewingRecipeRegistryInvoker {
    @Inject(at = @At("HEAD"), method = "registerDefaults")
    private static void registerDefaults(CallbackInfo info) {
        //Levitation
        BrewingRecipeRegistryInvoker.invokeRegisterPotionRecipe(Potions.AWKWARD, Items.CHORUS_FRUIT, Pots.LEVITATION);

        //Long Levitation
        BrewingRecipeRegistryInvoker.invokeRegisterPotionRecipe(Pots.LEVITATION, Items.REDSTONE, Pots.LONG_LEVITATION);

        //Strong Levitation
        BrewingRecipeRegistryInvoker.invokeRegisterPotionRecipe(Pots.LEVITATION, Items.GLOWSTONE_DUST, Pots.STRONG_LEVITATION);
    }
}
