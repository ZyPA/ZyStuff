package com.sirzypa.zystuff.tool;

import com.sirzypa.zystuff.ZyStuff;
import com.sirzypa.zystuff.item.ModCreativeModeTab;
import com.sirzypa.zystuff.item.ModItems;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.RegistryObject;

public class ModTools extends ModItems {

    public static final RegistryObject<SwordItem> COPPER_SWORD = ITEMS.register(
            "copper_sword",
            () -> new SwordItem(
                    ModToolTiers.COPPER,
                    3,
                    -2.4F,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB)));

    public static final RegistryObject<PickaxeItem> COPPER_PICKAXE = ITEMS.register(
            "copper_pickaxe",
            () -> new PickaxeItem(
                    ModToolTiers.COPPER,
                    1,
                    -2.8F,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB)));

    public static final RegistryObject<AxeItem> COPPER_AXE = ITEMS.register(
            "copper_axe",
            () -> new AxeItem(
                    ModToolTiers.COPPER,
                    6.0F,
                    -3.1F,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB)));

    public static final RegistryObject<ShovelItem> COPPER_SHOVEL = ITEMS.register(
            "copper_shovel",
            () -> new ShovelItem(
                    ModToolTiers.COPPER,
                    1.5F,
                    -3.0F,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB)));

    public static final RegistryObject<HoeItem> COPPER_HOE = ITEMS.register(
            "copper_hoe",
            () -> new HoeItem(
                    ModToolTiers.COPPER,
                    -2,
                    -1.0F,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB)));

    public static void Init() { ZyStuff.LOGGER.info("Modded tools has been initialized!"); }
}
