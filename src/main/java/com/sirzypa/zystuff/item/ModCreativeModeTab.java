package com.sirzypa.zystuff.item;

import com.sirzypa.zystuff.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ModCreativeModeTab {
    public static final CreativeModeTab ITEMS_TAB = new CreativeModeTab("items_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TINY_COAL.get());
        }
    };

    public static final CreativeModeTab BLOCKS_TAB = new CreativeModeTab("blocks_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.CHARCOAL_BLOCK.get());
        }
    };

    public static final CreativeModeTab TOOLS_TAB = new CreativeModeTab("tools_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.AIR);
        }
    };

    public static final CreativeModeTab ARMORS_TAB = new CreativeModeTab("armors_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.AIR);
        }
    };
}
