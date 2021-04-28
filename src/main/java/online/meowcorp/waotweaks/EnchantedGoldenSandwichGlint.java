package online.meowcorp.waotweaks;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class EnchantedGoldenSandwichGlint extends Item {

    public EnchantedGoldenSandwichGlint(Item.Settings settings) {
        super(settings);
    }

    public boolean hasGlint(ItemStack stack) {
        return true;
    }
    
}
