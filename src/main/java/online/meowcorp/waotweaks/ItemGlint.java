package online.meowcorp.waotweaks;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemGlint extends Item {

    public ItemGlint(Item.Settings settings) {
        super(settings);
    }

    public boolean hasGlint(ItemStack stack) {
        return true;
    }

}
