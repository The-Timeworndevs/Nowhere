package net.tws.nowhere.common;

import net.minecraft.core.component.DataComponents;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.tws.nowhere.Nowhere;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tws.nowhere.common.items.NWTiers;

public class NWItems {

    //Registry
    public static final DeferredRegister.Items ITEM_REGISTRIES = DeferredRegister.createItems(Nowhere.MODID);

    //Items

    //Tools and Weapons

    //Parched Wood
    public static final DeferredItem<Item> PARCHED_WOODEN_SWORD = ITEM_REGISTRIES.registerSimpleItem("parched_wooden_sword", new Item.Properties().attributes(SwordItem.createAttributes(NWTiers.PARCHED_WOOD, 3, -2.4F)));
    public static final DeferredItem<Item> PARCHED_WOODEN_SHOVEL = ITEM_REGISTRIES.registerSimpleItem("parched_wooden_shovel", new Item.Properties().attributes(ShovelItem.createAttributes(NWTiers.PARCHED_WOOD, 1.5F, -3.0F)).component(DataComponents.TOOL, NWTiers.PARCHED_WOOD.createToolProperties(BlockTags.MINEABLE_WITH_PICKAXE)).component(DataComponents.MAX_STACK_SIZE, 1).component(DataComponents.MAX_DAMAGE, 131).component(DataComponents.DAMAGE, 0));
    public static final DeferredItem<Item> PARCHED_WOODEN_PICKAXE = ITEM_REGISTRIES.registerSimpleItem("parched_wooden_pickaxe", new Item.Properties().attributes(PickaxeItem.createAttributes(NWTiers.PARCHED_WOOD, 1.0F, -2.8F)).component(DataComponents.TOOL, NWTiers.PARCHED_WOOD.createToolProperties(BlockTags.MINEABLE_WITH_PICKAXE)).component(DataComponents.MAX_STACK_SIZE, 1).component(DataComponents.MAX_DAMAGE, 131).component(DataComponents.DAMAGE, 0));
    public static final DeferredItem<Item> PARCHED_WOODEN_AXE = ITEM_REGISTRIES.registerSimpleItem("parched_wooden_axe", new Item.Properties().attributes(AxeItem.createAttributes(NWTiers.PARCHED_WOOD, 7.0F, -3.2F)).component(DataComponents.TOOL, NWTiers.PARCHED_WOOD.createToolProperties(BlockTags.MINEABLE_WITH_AXE)).component(DataComponents.MAX_STACK_SIZE, 1).component(DataComponents.MAX_DAMAGE, 131).component(DataComponents.DAMAGE, 0));
    public static final DeferredItem<Item> PARCHED_WOODEN_HOE = ITEM_REGISTRIES.registerSimpleItem("parched_wooden_hoe", new Item.Properties().attributes(HoeItem.createAttributes(NWTiers.PARCHED_WOOD, -1.0F, -2.0F)).component(DataComponents.TOOL, NWTiers.PARCHED_WOOD.createToolProperties(BlockTags.MINEABLE_WITH_HOE)).component(DataComponents.MAX_STACK_SIZE, 1).component(DataComponents.MAX_DAMAGE, 131).component(DataComponents.DAMAGE, 0));

    //Scrap
    public static final DeferredItem<Item> SCRAP_SWORD = ITEM_REGISTRIES.registerSimpleItem("scrap_sword", new Item.Properties().attributes(SwordItem.createAttributes(NWTiers.SCRAP, 3, -2.4F)));
    public static final DeferredItem<Item> SCRAP_SHOVEL = ITEM_REGISTRIES.registerSimpleItem("scrap_shovel", new Item.Properties().attributes(ShovelItem.createAttributes(NWTiers.SCRAP, 1.5F, -3.0F)).component(DataComponents.TOOL, NWTiers.SCRAP.createToolProperties(BlockTags.MINEABLE_WITH_PICKAXE)).component(DataComponents.MAX_STACK_SIZE, 1).component(DataComponents.MAX_DAMAGE, 131).component(DataComponents.DAMAGE, 0));
    public static final DeferredItem<Item> SCRAP_PICKAXE = ITEM_REGISTRIES.registerSimpleItem("scrap_pickaxe", new Item.Properties().attributes(PickaxeItem.createAttributes(NWTiers.SCRAP, 1.0F, -2.8F)).component(DataComponents.TOOL, NWTiers.SCRAP.createToolProperties(BlockTags.MINEABLE_WITH_PICKAXE)).component(DataComponents.MAX_STACK_SIZE, 1).component(DataComponents.MAX_DAMAGE, 131).component(DataComponents.DAMAGE, 0));
    public static final DeferredItem<Item> SCRAP_AXE = ITEM_REGISTRIES.registerSimpleItem("scrap_axe", new Item.Properties().attributes(AxeItem.createAttributes(NWTiers.SCRAP, 7.0F, -3.2F)).component(DataComponents.TOOL, NWTiers.SCRAP.createToolProperties(BlockTags.MINEABLE_WITH_AXE)).component(DataComponents.MAX_STACK_SIZE, 1).component(DataComponents.MAX_DAMAGE, 131).component(DataComponents.DAMAGE, 0));
    public static final DeferredItem<Item> SCRAP_HOE = ITEM_REGISTRIES.registerSimpleItem("scrap_hoe", new Item.Properties().attributes(HoeItem.createAttributes(NWTiers.SCRAP, -1.0F, -2.0F)).component(DataComponents.TOOL, NWTiers.SCRAP.createToolProperties(BlockTags.MINEABLE_WITH_HOE)).component(DataComponents.MAX_STACK_SIZE, 1).component(DataComponents.MAX_DAMAGE, 131).component(DataComponents.DAMAGE, 0));

    //Ferrous Alloy
    public static final DeferredItem<Item> FERROUS_ALLOY_SWORD = ITEM_REGISTRIES.registerSimpleItem("ferrous_alloy_sword", new Item.Properties().attributes(SwordItem.createAttributes(NWTiers.FERROUS, 3, -2.4F)));
    public static final DeferredItem<Item> FERROUS_ALLOY_SHOVEL = ITEM_REGISTRIES.registerSimpleItem("ferrous_alloy_shovel", new Item.Properties().attributes(ShovelItem.createAttributes(NWTiers.FERROUS, 1.5F, -3.0F)).component(DataComponents.TOOL, NWTiers.FERROUS.createToolProperties(BlockTags.MINEABLE_WITH_PICKAXE)).component(DataComponents.MAX_STACK_SIZE, 1).component(DataComponents.MAX_DAMAGE, 131).component(DataComponents.DAMAGE, 0));
    public static final DeferredItem<Item> FERROUS_ALLOY_PICKAXE = ITEM_REGISTRIES.registerSimpleItem("ferrous_alloy_pickaxe", new Item.Properties().attributes(PickaxeItem.createAttributes(NWTiers.FERROUS, 1.0F, -2.8F)).component(DataComponents.TOOL, NWTiers.FERROUS.createToolProperties(BlockTags.MINEABLE_WITH_PICKAXE)).component(DataComponents.MAX_STACK_SIZE, 1).component(DataComponents.MAX_DAMAGE, 131).component(DataComponents.DAMAGE, 0));
    public static final DeferredItem<Item> FERROUS_ALLOY_AXE = ITEM_REGISTRIES.registerSimpleItem("ferrous_alloy_axe", new Item.Properties().attributes(AxeItem.createAttributes(NWTiers.FERROUS, 7.0F, -3.2F)).component(DataComponents.TOOL, NWTiers.FERROUS.createToolProperties(BlockTags.MINEABLE_WITH_AXE)).component(DataComponents.MAX_STACK_SIZE, 1).component(DataComponents.MAX_DAMAGE, 131).component(DataComponents.DAMAGE, 0));
    public static final DeferredItem<Item> FERROUS_ALLOY_HOE = ITEM_REGISTRIES.registerSimpleItem("ferrous_alloy_hoe", new Item.Properties().attributes(HoeItem.createAttributes(NWTiers.FERROUS, -1.0F, -2.0F)).component(DataComponents.TOOL, NWTiers.FERROUS.createToolProperties(BlockTags.MINEABLE_WITH_HOE)).component(DataComponents.MAX_STACK_SIZE, 1).component(DataComponents.MAX_DAMAGE, 131).component(DataComponents.DAMAGE, 0));

    //Materials
    public static final DeferredItem<Item> FERROUS_SCRAP = ITEM_REGISTRIES.registerSimpleItem("ferrous_scrap", new Item.Properties());
    public static final DeferredItem<Item> FERROUS_ALLOY_NUGGET = ITEM_REGISTRIES.registerSimpleItem("ferrous_alloy_nugget", new Item.Properties());
    public static final DeferredItem<Item> FERROUS_ALLOY_INGOT = ITEM_REGISTRIES.registerSimpleItem("ferrous_alloy_ingot", new Item.Properties());
    public static final DeferredItem<Item> PARCHED_STICK = ITEM_REGISTRIES.registerSimpleItem("parched_stick", new Item.Properties());
    public static final DeferredItem<Item> BITUMEN_BALL = ITEM_REGISTRIES.registerSimpleItem("bitumen_ball", new Item.Properties());
    public static final DeferredItem<Item> SALT_PILE = ITEM_REGISTRIES.registerSimpleItem("salt_pile", new Item.Properties());
    public static final DeferredItem<Item> DESERT_ROOT = ITEM_REGISTRIES.registerSimpleItem("desert_root", new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationModifier(0.5f).build()));

    //Misc
    //public static final DeferredItem<Item> ULTRASALINE_WATER_BUCKET = ITEM_REGISTRIES.registerSimpleItem("ultrasaline_water_bucket", new BucketItem());
    public static final DeferredItem<Item> DUSTY_JOURNAL = ITEM_REGISTRIES.registerSimpleItem("dusty_journal", new Item.Properties());

}
