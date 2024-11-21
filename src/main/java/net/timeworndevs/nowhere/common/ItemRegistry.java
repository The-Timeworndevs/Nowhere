package net.timeworndevs.nowhere.common;

import net.timeworndevs.nowhere.Main;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemRegistry {

    //Registry
    public static final DeferredRegister.Items ITEM_REGISTRIES = DeferredRegister.createItems(Main.MODID);

    //Items
    public static final DeferredItem<Item> ALLOY_INGOT = ITEM_REGISTRIES.registerSimpleItem("alloy_ingot", new Item.Properties());
    public static final DeferredItem<Item> ALLOY_NUGGET = ITEM_REGISTRIES.registerSimpleItem("alloy_nugget", new Item.Properties());
}
