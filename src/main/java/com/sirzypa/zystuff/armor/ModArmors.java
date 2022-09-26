package com.sirzypa.zystuff.armor;

import com.sirzypa.zystuff.ZyStuff;
import com.sirzypa.zystuff.item.ModCreativeModeTab;
import com.sirzypa.zystuff.item.ModItems;
import net.minecraft.world.item.Item;

public class ModArmors extends ModItems {

    // Add modded armor

    public static final ArmorSet COPPER_ARMOR = new ArmorSet("copper", ModArmorMaterials.COPPER, new Item.Properties().tab(ModCreativeModeTab.ARMORS_TAB));

    // Initializes the class.

    public static void init() { ZyStuff.LOGGER.info("Modded armor has been initialized!"); }
}
