package com.sirzypa.zystuff.armor;

import com.sirzypa.zystuff.ZyStuff;
import com.sirzypa.zystuff.item.ModCreativeModeTab;
import com.sirzypa.zystuff.item.ModItems;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

public class ModArmors extends ModItems {

    // Add modded armor to the item registry

    public static final RegistryObject<ArmorItem> COPPER_HELMET = ITEMS.register(
            "copper_helmet",
            () -> new ArmorItem(
                    ModArmorMaterials.COPPER,
                    EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.ARMORS_TAB)
            ));

    public static final RegistryObject<ArmorItem> COPPER_CHESTPLATE = ITEMS.register(
            "copper_chestplate",
            () -> new ArmorItem(
                    ModArmorMaterials.COPPER,
                    EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.ARMORS_TAB)
            ));

    public static final RegistryObject<ArmorItem> COPPER_LEGGINGS = ITEMS.register(
            "copper_leggings",
            () -> new ArmorItem(
                    ModArmorMaterials.COPPER,
                    EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.ARMORS_TAB)
            ));

    public static final RegistryObject<ArmorItem> COPPER_BOOTS = ITEMS.register(
            "copper_boots",
            () -> new ArmorItem(
                    ModArmorMaterials.COPPER,
                    EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.ARMORS_TAB)
            ));

    // Initialize the class

    public static void Init() { ZyStuff.LOGGER.info("Modded armor has been initialized!"); }
}
