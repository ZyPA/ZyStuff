package com.sirzypa.zystuff.armor;

import com.sirzypa.zystuff.ZyStuff;
import com.sirzypa.zystuff.item.ModCreativeModeTab;
import com.sirzypa.zystuff.item.ModItems;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

public class ModArmors {
    public static final RegistryObject<ArmorItem> COPPER_HELMET = ModItems.ITEMS.register(
            "copper_helmet",
            () -> new ArmorItem(
                    ModArmorMaterials.COPPER,
                    EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.ITEMS_TAB)
            ));

    public static final RegistryObject<ArmorItem> COPPER_CHESTPLATE = ModItems.ITEMS.register(
            "copper_chestplate",
            () -> new ArmorItem(
                    ModArmorMaterials.COPPER,
                    EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.ITEMS_TAB)
            ));

    public static final RegistryObject<ArmorItem> COPPER_LEGGINGS = ModItems.ITEMS.register(
            "copper_leggings",
            () -> new ArmorItem(
                    ModArmorMaterials.COPPER,
                    EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.ITEMS_TAB)
            ));

    public static final RegistryObject<ArmorItem> COPPER_BOOTS = ModItems.ITEMS.register(
            "copper_boots",
            () -> new ArmorItem(
                    ModArmorMaterials.COPPER,
                    EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.ITEMS_TAB)
            ));


    public static void initArmors() { ZyStuff.LOGGER.info("Modded armor has been initialized!"); }
}
