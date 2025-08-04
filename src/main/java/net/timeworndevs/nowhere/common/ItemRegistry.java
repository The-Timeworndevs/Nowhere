package net.timeworndevs.nowhere.common;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.PickaxeItem;
import net.timeworndevs.nowhere.Main;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.timeworndevs.nowhere.common.items.NowhereTiers;

public class ItemRegistry {

    //Registry
    public static final DeferredRegister.Items ITEM_REGISTRIES = DeferredRegister.createItems(Main.MODID);

    //Items
    public static final DeferredItem<Item> FERROUS_SCRAP = ITEM_REGISTRIES.registerSimpleItem("ferrous_scrap", new Item.Properties());
    public static final DeferredItem<Item> FERROUS_SCRAP = ITEM_REGISTRIES.registerItem("ferrous_scrap", new PickaxeItem(NowhereTiers.SCRAP, new Item.Properties()));
    public static final DeferredItem<Item> FERROUS_ALLOY_INGOT = ITEM_REGISTRIES.registerSimpleItem("ferrous_alloy_ingot", new Item.Properties());
    public static final DeferredItem<Item> FERROUS_ALLOY_NUGGET = ITEM_REGISTRIES.registerSimpleItem("ferrous_alloy_nugget", new Item.Properties());
    public static final DeferredItem<Item> BITUMEN_BALL = ITEM_REGISTRIES.registerSimpleItem("bitumen_ball", new Item.Properties());
    public static final DeferredItem<Item> SALT_PILE = ITEM_REGISTRIES.registerSimpleItem("salt_pile", new Item.Properties());

}
