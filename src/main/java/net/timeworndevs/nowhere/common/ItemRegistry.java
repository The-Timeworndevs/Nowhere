package net.timeworndevs.nowhere.common;

import net.timeworndevs.nowhere.Main;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemRegistry {

    //Registry
    public static final DeferredRegister.Items ITEM_REGISTRIES = DeferredRegister.createItems(Main.MODID);

    //Items
    public static final DeferredItem<Item> EXAMPLE_ITEM = ITEM_REGISTRIES.registerSimpleItem("example_item", new Item.Properties());
}
