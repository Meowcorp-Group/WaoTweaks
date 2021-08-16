package online.meowcorp.waotweaks.voidorite;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class VoidoriteToolMaterial implements ToolMaterial {
    public static final VoidoriteToolMaterial INSTANCE = new VoidoriteToolMaterial();

    @Override
    public int getDurability() {
        return 4056;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 20.0F;
    }

    @Override
    public float getAttackDamage() {
        return 0.0F;
    }

    @Override
    public int getMiningLevel() {
        return 5;
    }

    @Override
    public int getEnchantability() {
        return 17;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Voidorite.VOIDORITE_INGOT);
    }

}
