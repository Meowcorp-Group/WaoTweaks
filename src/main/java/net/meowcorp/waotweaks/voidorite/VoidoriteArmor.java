package net.meowcorp.waotweaks.voidorite;

import net.meowcorp.waotweaks.WaoTweaks;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class VoidoriteArmor {
    public static final ArmorMaterial VOIDORITE_ARMOR_MATERIAL = new VoidoriteArmorMaterial();
    
    public static final Item VOIDORITE_HELMET = new ArmorItem(VOIDORITE_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().fireproof().group(WaoTweaks.VOIDORITE));
    public static final Item VOIDORITE_CHESTPLATE = new ArmorItem(VOIDORITE_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().fireproof().group(WaoTweaks.VOIDORITE));
    public static final Item VOIDORITE_LEGGINGS = new ArmorItem(VOIDORITE_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().fireproof().group(WaoTweaks.VOIDORITE));
    public static final Item VOIDORITE_BOOTS = new ArmorItem(VOIDORITE_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().fireproof().group(WaoTweaks.VOIDORITE));

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "voidorite_helmet"), VOIDORITE_HELMET);
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "voidorite_chestplate"), VOIDORITE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "voidorite_leggings"), VOIDORITE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "voidorite_boots"), VOIDORITE_BOOTS);
    }
}
