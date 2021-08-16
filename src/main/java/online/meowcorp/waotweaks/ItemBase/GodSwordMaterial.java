package online.meowcorp.waotweaks.ItemBase;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class GodSwordMaterial implements ToolMaterial {

    public static final GodSwordMaterial INSTANCE = new GodSwordMaterial();

    @Override
    public int getDurability() {
        return 2147483647;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 2147483647.0F;
    }

    @Override
    public float getAttackDamage() {
        return 0.0F;
    }

    @Override
    public int getMiningLevel() {
        return 2147483647;
    }

    @Override
    public int getEnchantability() {
        return 2147483647;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.GOLD_INGOT);
    }

}
