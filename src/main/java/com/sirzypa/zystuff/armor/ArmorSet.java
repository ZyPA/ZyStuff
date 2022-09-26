package com.sirzypa.zystuff.armor;

import com.sirzypa.zystuff.item.ModItems;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;

public class ArmorSet {
    public ArmorSet(String name, ArmorMaterial pMaterial, ArmorItem.Properties pProperties) {
        ModItems.ITEMS.register(name + "_helmet", () -> new ArmorItem(pMaterial, EquipmentSlot.HEAD, pProperties));
        ModItems.ITEMS.register(name + "_chestplate", () -> new ArmorItem(pMaterial, EquipmentSlot.CHEST, pProperties));
        ModItems.ITEMS.register(name + "_leggings", () -> new ArmorItem(pMaterial, EquipmentSlot.LEGS, pProperties));
        ModItems.ITEMS.register(name + "_boots", () -> new ArmorItem(pMaterial, EquipmentSlot.FEET, pProperties));
    }
}
