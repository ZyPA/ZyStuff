package com.sirzypa.zystuff.tool;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

public enum ModToolTiers implements Tier {
    COPPER(
        2,
        225,
        5.0F,
        1.5F,
        12,
        Ingredient.of(Items.COPPER_INGOT)
    );

    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final Ingredient repairIngredient;

    ModToolTiers(int pLevel, int pUses, float pSpeed, float pDamage, int pEnchantmentValue, Ingredient pRepairIngredient) {
        this.level = pLevel;
        this.uses = pUses;
        this.speed = pSpeed;
        this.damage = pDamage;
        this.enchantmentValue = pEnchantmentValue;
        this.repairIngredient = pRepairIngredient;
    }

    public int getUses() {
        return this.uses;
    }

    public float getSpeed() {
        return this.speed;
    }

    public float getAttackDamageBonus() {
        return this.damage;
    }

    public int getLevel() {
        return this.level;
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @NotNull
    public Ingredient getRepairIngredient() {
        return this.repairIngredient;
    }
}
