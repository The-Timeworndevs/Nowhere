package net.tws.nowhere.common.init;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.tws.nowhere.Nowhere;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tws.nowhere.common.items.NWArmorMaterials;
import net.tws.nowhere.common.items.NWToolTiers;

public class NWItems {

    //Registry
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Nowhere.MODID);

    //Items

    //Tools and Weapons

    //Buckets


    public static final DeferredItem<BucketItem> ULTRASALINE_WATER_BUCKET = ITEMS.register("ultrasaline_water_bucket", ()-> new BucketItem(NWFluids.SOURCE_ULTRASALINE_WATER.get(), new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET)));

    //Parched Wood
    public static final DeferredItem<SwordItem> PARCHED_WOODEN_SWORD = ITEMS.register("parched_wooden_sword", () -> new SwordItem(NWToolTiers.PARCHED_WOODEN, new Item.Properties().attributes(SwordItem.createAttributes(NWToolTiers.PARCHED_WOODEN, 3, -2.4F)).stacksTo(1)));
    public static final DeferredItem<ShovelItem> PARCHED_WOODEN_SHOVEL = ITEMS.register("parched_wooden_shovel", () -> new ShovelItem(NWToolTiers.PARCHED_WOODEN, new Item.Properties().attributes(ShovelItem.createAttributes(NWToolTiers.PARCHED_WOODEN, 1.5F, -3.0F)).stacksTo(1)));
    public static final DeferredItem<PickaxeItem> PARCHED_WOODEN_PICKAXE = ITEMS.register("parched_wooden_pickaxe", ()-> new PickaxeItem(NWToolTiers.PARCHED_WOODEN, new Item.Properties().attributes(PickaxeItem.createAttributes(NWToolTiers.PARCHED_WOODEN, 1.0F, -2.8F)).stacksTo(1)));
    public static final DeferredItem<AxeItem> PARCHED_WOODEN_AXE = ITEMS.register("parched_wooden_axe", ()-> new AxeItem(NWToolTiers.PARCHED_WOODEN, new Item.Properties().attributes(AxeItem.createAttributes(NWToolTiers.PARCHED_WOODEN,6.0F, -3.2F)).stacksTo(1)));
    public static final DeferredItem<HoeItem> PARCHED_WOODEN_HOE = ITEMS.register("parched_wooden_hoe", ()-> new HoeItem(NWToolTiers.PARCHED_WOODEN, new Item.Properties().attributes(HoeItem.createAttributes(NWToolTiers.PARCHED_WOODEN, 0.0F, -3.0F)).stacksTo(1)));

    //Scrap
    public static final DeferredItem<SwordItem> SCRAP_SWORD = ITEMS.register("scrap_sword", () -> new SwordItem(NWToolTiers.SCRAP, new Item.Properties().attributes(SwordItem.createAttributes(NWToolTiers.SCRAP, 3, -2.4F)).stacksTo(1)));
    public static final DeferredItem<ShovelItem> SCRAP_SHOVEL = ITEMS.register("scrap_shovel", () -> new ShovelItem(NWToolTiers.SCRAP, new Item.Properties().attributes(ShovelItem.createAttributes(NWToolTiers.SCRAP, 1.5F, -3.0F)).stacksTo(1)));
    public static final DeferredItem<PickaxeItem> SCRAP_PICKAXE = ITEMS.register("scrap_pickaxe", ()-> new PickaxeItem(NWToolTiers.SCRAP, new Item.Properties().attributes(PickaxeItem.createAttributes(NWToolTiers.SCRAP, 1.0F, -2.8F)).stacksTo(1)));
    public static final DeferredItem<AxeItem> SCRAP_AXE = ITEMS.register("scrap_axe", ()-> new AxeItem(NWToolTiers.SCRAP, new Item.Properties().attributes(AxeItem.createAttributes(NWToolTiers.SCRAP,6.0F, -3.2F)).stacksTo(1)));
    public static final DeferredItem<HoeItem> SCRAP_HOE = ITEMS.register("scrap_hoe", ()-> new HoeItem(NWToolTiers.SCRAP, new Item.Properties().attributes(HoeItem.createAttributes(NWToolTiers.SCRAP, 0.0F, -3.0F)).stacksTo(1)));

    //Ferrous Alloy
    public static final DeferredItem<SwordItem> FERROUS_ALLOY_SWORD = ITEMS.register("ferrous_alloy_sword", () -> new SwordItem(NWToolTiers.FERROUS_ALLOY, new Item.Properties().attributes(SwordItem.createAttributes(NWToolTiers.FERROUS_ALLOY, 3, -2.4F)).stacksTo(1)));
    public static final DeferredItem<ShovelItem> FERROUS_ALLOY_SHOVEL = ITEMS.register("ferrous_alloy_shovel", () -> new ShovelItem(NWToolTiers.FERROUS_ALLOY, new Item.Properties().attributes(ShovelItem.createAttributes(NWToolTiers.FERROUS_ALLOY, 1.5F, -3.0F)).stacksTo(1)));
    public static final DeferredItem<PickaxeItem> FERROUS_ALLOY_PICKAXE = ITEMS.register("ferrous_alloy_pickaxe", ()-> new PickaxeItem(NWToolTiers.FERROUS_ALLOY, new Item.Properties().attributes(PickaxeItem.createAttributes(NWToolTiers.FERROUS_ALLOY, 1.0F, -2.8F)).stacksTo(1)));
    public static final DeferredItem<AxeItem> FERROUS_ALLOY_AXE = ITEMS.register("ferrous_alloy_axe", ()-> new AxeItem(NWToolTiers.FERROUS_ALLOY, new Item.Properties().attributes(AxeItem.createAttributes(NWToolTiers.FERROUS_ALLOY,6.0F, -3.2F)).stacksTo(1)));
    public static final DeferredItem<HoeItem> FERROUS_ALLOY_HOE = ITEMS.register("ferrous_alloy_hoe", ()-> new HoeItem(NWToolTiers.FERROUS_ALLOY, new Item.Properties().attributes(HoeItem.createAttributes(NWToolTiers.FERROUS_ALLOY, 0.0F, -3.0F)).stacksTo(1)));

    //Armor

    //Ferrous Alloy

    public static final DeferredItem<ArmorItem> FERROUS_ALLOY_HELMET = ITEMS.register("ferrous_alloy_helmet", () -> new ArmorItem(NWArmorMaterials.FERROUS_ALLOY, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(17))));
    public static final DeferredItem<ArmorItem> FERROUS_ALLOY_CHESTPLATE = ITEMS.register("ferrous_alloy_chestplate", () -> new ArmorItem(NWArmorMaterials.FERROUS_ALLOY, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(17))));
    public static final DeferredItem<ArmorItem> FERROUS_ALLOY_LEGGINGS = ITEMS.register("ferrous_alloy_leggings", () -> new ArmorItem(NWArmorMaterials.FERROUS_ALLOY, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(17))));
    public static final DeferredItem<ArmorItem> FERROUS_ALLOY_BOOTS = ITEMS.register("ferrous_alloy_boots", () -> new ArmorItem(NWArmorMaterials.FERROUS_ALLOY, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(17))));

    //Materials
    public static final DeferredItem<Item> FERROUS_SCRAP = ITEMS.registerSimpleItem("ferrous_scrap", new Item.Properties());
    public static final DeferredItem<Item> FERROUS_ALLOY_NUGGET = ITEMS.registerSimpleItem("ferrous_alloy_nugget", new Item.Properties());
    public static final DeferredItem<Item> FERROUS_ALLOY_INGOT = ITEMS.registerSimpleItem("ferrous_alloy_ingot", new Item.Properties());
    public static final DeferredItem<Item> PARCHED_STICK = ITEMS.registerSimpleItem("parched_stick", new Item.Properties());
    public static final DeferredItem<Item> BITUMEN_BALL = ITEMS.registerSimpleItem("bitumen_ball", new Item.Properties());
    public static final DeferredItem<Item> SALT_PILE = ITEMS.registerSimpleItem("salt_pile", new Item.Properties());
    public static final DeferredItem<Item> DESERT_ROOT = ITEMS.registerSimpleItem("desert_root", new Item.Properties().food( new FoodProperties.Builder().nutrition(4).saturationModifier(0.5f).build()));
    public static final DeferredItem<Item> PLANT_FIBER = ITEMS.registerSimpleItem("plant_fiber", new Item.Properties());
    public static final DeferredItem<Item> COARSE_FABRIC = ITEMS.registerSimpleItem("coarse_fabric", new Item.Properties());

    //Misc

    public static final DeferredItem<Item> DUSTY_JOURNAL = ITEMS.registerSimpleItem("dusty_journal", new Item.Properties());

}
