package com.sirzypa.zystuff.armor;

import com.sirzypa.zystuff.item.ModItems;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraftforge.registries.RegistryObject;

public class ArmorSet {
    RegistryObject<ArmorItem> HEAD;
    RegistryObject<ArmorItem> CHEST;
    RegistryObject<ArmorItem> LEGS;
    RegistryObject<ArmorItem> FEET;

    public ArmorSet(String name, ArmorMaterial pMaterial, ArmorItem.Properties pProperties) {
        this.HEAD = ModItems.ITEMS.register(name + "_helmet", () -> new ArmorItem(pMaterial, EquipmentSlot.HEAD, pProperties));
        this.CHEST = ModItems.ITEMS.register(name + "_chestplate", () -> new ArmorItem(pMaterial, EquipmentSlot.CHEST, pProperties));
        this.LEGS = ModItems.ITEMS.register(name + "_leggings", () -> new ArmorItem(pMaterial, EquipmentSlot.LEGS, pProperties));
        this.FEET = ModItems.ITEMS.register(name + "_boots", () -> new ArmorItem(pMaterial, EquipmentSlot.FEET, pProperties));
    }

    public RegistryObject<ArmorItem> getHead() { return HEAD; }

    public RegistryObject<ArmorItem> getChest() {
        return CHEST;
    }

    public RegistryObject<ArmorItem> getLegs() {
        return LEGS;
    }

    public RegistryObject<ArmorItem> getFeet() {
        return FEET;
    }
}
