package online.meowcorp.waotweaks;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class EnderiteArmor {
    public static final ArmorMaterial ENDERITE_ARMOR_MATERIAL = new EnderiteArmorMaterial();
    
    public static final Item ENDERITE_HELMET = new ArmorItem(ENDERITE_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().fireproof().group(WaoTweaks.ENDERITE));
    public static final Item ENDERITE_CHESTPLATE = new ArmorItem(ENDERITE_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().fireproof().group(WaoTweaks.ENDERITE));
    public static final Item ENDERITE_LEGGINGS = new ArmorItem(ENDERITE_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().fireproof().group(WaoTweaks.ENDERITE));
    public static final Item ENDERITE_BOOTS = new ArmorItem(ENDERITE_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().fireproof().group(WaoTweaks.ENDERITE));

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "enderite_helmet"), ENDERITE_HELMET);
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "enderite_chestplate"), ENDERITE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "enderite_leggings"), ENDERITE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("waotweaks", "enderite_boots"), ENDERITE_BOOTS);
    }
}
