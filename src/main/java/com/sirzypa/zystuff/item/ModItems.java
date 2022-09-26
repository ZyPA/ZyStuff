package com.sirzypa.zystuff.item;

import com.sirzypa.zystuff.ZyStuff;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ZyStuff.MOD_ID);

    public static final RegistryObject<Item> TINY_CHARCOAL = ITEMS.register("tiny_charcoal",
            () -> new ModFuelItem(new Item.Properties().tab(ModCreativeModeTab.ITEMS_TAB), 200));

    public static final RegistryObject<Item> TINY_COAL = ITEMS.register("tiny_coal",
            () -> new ModFuelItem(new Item.Properties().tab(ModCreativeModeTab.ITEMS_TAB), 200));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
