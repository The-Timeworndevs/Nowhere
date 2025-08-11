package net.timeworndevs.nowhere.common;

import net.minecraft.core.component.DataComponents;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.*;
import net.timeworndevs.nowhere.Main;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.timeworndevs.nowhere.common.items.NowhereTiers;

public class ItemRegistry {

    //Registry
    public static final DeferredRegister.Items ITEM_REGISTRIES = DeferredRegister.createItems(Main.MODID);


    //Items
    public static final DeferredItem<Item> FERROUS_SCRAP = ITEM_REGISTRIES.registerSimpleItem("ferrous_scrap", new Item.Properties());
    public static final DeferredItem<Item> SCRAP_SWORD = ITEM_REGISTRIES.registerSimpleItem("scrap_sword", new Item.Properties().attributes(SwordItem.createAttributes(NowhereTiers.SCRAP, 3, -2.4F)));
    public static final DeferredItem<Item> SCRAP_SHOVEL = ITEM_REGISTRIES.registerSimpleItem("scrap_shovel", new Item.Properties().attributes(ShovelItem.createAttributes(NowhereTiers.SCRAP, 1.5F, -3.0F)).component(DataComponents.TOOL, NowhereTiers.SCRAP.createToolProperties(BlockTags.MINEABLE_WITH_SHOVEL)));
    public static final DeferredItem<Item> SCRAP_PICKAXE = ITEM_REGISTRIES.registerSimpleItem("scrap_pickaxe", new Item.Properties().attributes(PickaxeItem.createAttributes(NowhereTiers.SCRAP, 1.0F, -2.8F)).component(DataComponents.TOOL, NowhereTiers.SCRAP.createToolProperties(BlockTags.MINEABLE_WITH_PICKAXE)));
    public static final DeferredItem<Item> SCRAP_AXE = ITEM_REGISTRIES.registerSimpleItem("scrap_axe", new Item.Properties().attributes(AxeItem.createAttributes(NowhereTiers.SCRAP, 7.0F, -3.2F)).component(DataComponents.TOOL, NowhereTiers.SCRAP.createToolProperties(BlockTags.MINEABLE_WITH_AXE)));
    public static final DeferredItem<Item> SCRAP_HOE = ITEM_REGISTRIES.registerSimpleItem("scrap_hoe", new Item.Properties().attributes(HoeItem.createAttributes(NowhereTiers.SCRAP, -1.0F, -2.0F)).component(DataComponents.TOOL, NowhereTiers.SCRAP.createToolProperties(BlockTags.MINEABLE_WITH_HOE)));
    public static final DeferredItem<Item> FERROUS_ALLOY_INGOT = ITEM_REGISTRIES.registerSimpleItem("ferrous_alloy_ingot", new Item.Properties());
    public static final DeferredItem<Item> FERROUS_ALLOY_NUGGET = ITEM_REGISTRIES.registerSimpleItem("ferrous_alloy_nugget", new Item.Properties());
    public static final DeferredItem<Item> BITUMEN_BALL = ITEM_REGISTRIES.registerSimpleItem("bitumen_ball", new Item.Properties());
    public static final DeferredItem<Item> SALT_PILE = ITEM_REGISTRIES.registerSimpleItem("salt_pile", new Item.Properties());

}
