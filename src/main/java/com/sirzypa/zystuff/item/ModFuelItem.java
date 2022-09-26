package com.sirzypa.zystuff.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import org.jetbrains.annotations.Nullable;

public class ModFuelItem extends Item {

    private final int BurnTime;

    public ModFuelItem(Properties pProperties, Integer pBurnTime) {
        super(pProperties);
        this.BurnTime = pBurnTime;
    }

    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return this.BurnTime;
    }
}
