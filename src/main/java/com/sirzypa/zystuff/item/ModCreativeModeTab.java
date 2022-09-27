package com.sirzypa.zystuff.item;

import com.sirzypa.zystuff.armor.ModArmors;
import com.sirzypa.zystuff.block.ModBlocks;
import com.sirzypa.zystuff.tool.ModTools;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class ModCreativeModeTab {
    public static final CreativeModeTab ITEMS_TAB = new CreativeModeTab("items_tab") {
        @Override
        @NotNull
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TINY_COAL.get());
        }
    };

    public static final CreativeModeTab BLOCKS_TAB = new CreativeModeTab("blocks_tab") {
        @Override
        @NotNull
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.CHARCOAL_BLOCK.get());
        }
    };

    public static final CreativeModeTab TOOLS_TAB = new CreativeModeTab("tools_tab") {
        @Override
        @NotNull
        public ItemStack makeIcon() {
            return new ItemStack(ModTools.COPPER_AXE.get());
        }
    };

    public static final CreativeModeTab ARMORS_TAB = new CreativeModeTab("armors_tab") {
        @Override
        @NotNull
        public ItemStack makeIcon() { return new ItemStack(ModArmors.COPPER_ARMOR.getChest().get()); }
    };
}
