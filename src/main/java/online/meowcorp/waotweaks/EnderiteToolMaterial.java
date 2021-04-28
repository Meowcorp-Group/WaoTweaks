package online.meowcorp.waotweaks;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class EnderiteToolMaterial implements ToolMaterial {
    public static final EnderiteToolMaterial INSTANCE = new EnderiteToolMaterial();

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
        return Ingredient.ofItems(WaoTweaks.ENDERITE_INGOT);
    }

}
