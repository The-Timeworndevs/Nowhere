package net.tws.nowhere.common;

import net.minecraft.core.component.DataComponents;
import net.minecraft.tags.BlockTags;
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
    public static final DeferredItem<Item> PARCHED_WOODEN_SWORD = ITEMS.registerSimpleItem("parched_wooden_sword", new Item.Properties().attributes(SwordItem.createAttributes(NWToolTiers.PARCHED_WOOD, 3, -2.4F)));
    public static final DeferredItem<Item> PARCHED_WOODEN_SHOVEL = ITEMS.registerSimpleItem("parched_wooden_shovel", new Item.Properties().attributes(ShovelItem.createAttributes(NWToolTiers.PARCHED_WOOD, 1.5F, -3.0F)).component(DataComponents.TOOL, NWToolTiers.PARCHED_WOOD.createToolProperties(BlockTags.MINEABLE_WITH_PICKAXE)).component(DataComponents.MAX_STACK_SIZE, 1).component(DataComponents.MAX_DAMAGE, 131).component(DataComponents.DAMAGE, 0));
    public static final DeferredItem<Item> PARCHED_WOODEN_PICKAXE = ITEMS.registerSimpleItem("parched_wooden_pickaxe", new Item.Properties().attributes(PickaxeItem.createAttributes(NWToolTiers.PARCHED_WOOD, 1.0F, -2.8F)).component(DataComponents.TOOL, NWToolTiers.PARCHED_WOOD.createToolProperties(BlockTags.MINEABLE_WITH_PICKAXE)).component(DataComponents.MAX_STACK_SIZE, 1).component(DataComponents.MAX_DAMAGE, 131).component(DataComponents.DAMAGE, 0));
    public static final DeferredItem<Item> PARCHED_WOODEN_AXE = ITEMS.registerSimpleItem("parched_wooden_axe", new Item.Properties().attributes(AxeItem.createAttributes(NWToolTiers.PARCHED_WOOD, 7.0F, -3.2F)).component(DataComponents.TOOL, NWToolTiers.PARCHED_WOOD.createToolProperties(BlockTags.MINEABLE_WITH_AXE)).component(DataComponents.MAX_STACK_SIZE, 1).component(DataComponents.MAX_DAMAGE, 131).component(DataComponents.DAMAGE, 0));
    public static final DeferredItem<Item> PARCHED_WOODEN_HOE = ITEMS.registerSimpleItem("parched_wooden_hoe", new Item.Properties().attributes(HoeItem.createAttributes(NWToolTiers.PARCHED_WOOD, -1.0F, -2.0F)).component(DataComponents.TOOL, NWToolTiers.PARCHED_WOOD.createToolProperties(BlockTags.MINEABLE_WITH_HOE)).component(DataComponents.MAX_STACK_SIZE, 1).component(DataComponents.MAX_DAMAGE, 131).component(DataComponents.DAMAGE, 0));

    //Scrap
    public static final DeferredItem<Item> SCRAP_SWORD = ITEMS.registerSimpleItem("scrap_sword", new Item.Properties().attributes(SwordItem.createAttributes(NWToolTiers.SCRAP, 3, -2.4F)));
    public static final DeferredItem<Item> SCRAP_SHOVEL = ITEMS.registerSimpleItem("scrap_shovel", new Item.Properties().attributes(ShovelItem.createAttributes(NWToolTiers.SCRAP, 1.5F, -3.0F)).component(DataComponents.TOOL, NWToolTiers.SCRAP.createToolProperties(BlockTags.MINEABLE_WITH_PICKAXE)).component(DataComponents.MAX_STACK_SIZE, 1).component(DataComponents.MAX_DAMAGE, 131).component(DataComponents.DAMAGE, 0));
    public static final DeferredItem<Item> SCRAP_PICKAXE = ITEMS.registerSimpleItem("scrap_pickaxe", new Item.Properties().attributes(PickaxeItem.createAttributes(NWToolTiers.SCRAP, 1.0F, -2.8F)).component(DataComponents.TOOL, NWToolTiers.SCRAP.createToolProperties(BlockTags.MINEABLE_WITH_PICKAXE)).component(DataComponents.MAX_STACK_SIZE, 1).component(DataComponents.MAX_DAMAGE, 131).component(DataComponents.DAMAGE, 0));
    public static final DeferredItem<Item> SCRAP_AXE = ITEMS.registerSimpleItem("scrap_axe", new Item.Properties().attributes(AxeItem.createAttributes(NWToolTiers.SCRAP, 7.0F, -3.2F)).component(DataComponents.TOOL, NWToolTiers.SCRAP.createToolProperties(BlockTags.MINEABLE_WITH_AXE)).component(DataComponents.MAX_STACK_SIZE, 1).component(DataComponents.MAX_DAMAGE, 131).component(DataComponents.DAMAGE, 0));
    public static final DeferredItem<Item> SCRAP_HOE = ITEMS.registerSimpleItem("scrap_hoe", new Item.Properties().attributes(HoeItem.createAttributes(NWToolTiers.SCRAP, -1.0F, -2.0F)).component(DataComponents.TOOL, NWToolTiers.SCRAP.createToolProperties(BlockTags.MINEABLE_WITH_HOE)).component(DataComponents.MAX_STACK_SIZE, 1).component(DataComponents.MAX_DAMAGE, 131).component(DataComponents.DAMAGE, 0));

    //Ferrous Alloy
    public static final DeferredItem<Item> FERROUS_ALLOY_SWORD = ITEMS.registerSimpleItem("ferrous_alloy_sword", new Item.Properties().attributes(SwordItem.createAttributes(NWToolTiers.FERROUS, 3, -2.4F)));
    public static final DeferredItem<Item> FERROUS_ALLOY_SHOVEL = ITEMS.registerSimpleItem("ferrous_alloy_shovel", new Item.Properties().attributes(ShovelItem.createAttributes(NWToolTiers.FERROUS, 1.5F, -3.0F)).component(DataComponents.TOOL, NWToolTiers.FERROUS.createToolProperties(BlockTags.MINEABLE_WITH_PICKAXE)).component(DataComponents.MAX_STACK_SIZE, 1).component(DataComponents.MAX_DAMAGE, 131).component(DataComponents.DAMAGE, 0));
    public static final DeferredItem<Item> FERROUS_ALLOY_PICKAXE = ITEMS.registerSimpleItem("ferrous_alloy_pickaxe", new Item.Properties().attributes(PickaxeItem.createAttributes(NWToolTiers.FERROUS, 1.0F, -2.8F)).component(DataComponents.TOOL, NWToolTiers.FERROUS.createToolProperties(BlockTags.MINEABLE_WITH_PICKAXE)).component(DataComponents.MAX_STACK_SIZE, 1).component(DataComponents.MAX_DAMAGE, 131).component(DataComponents.DAMAGE, 0));
    public static final DeferredItem<Item> FERROUS_ALLOY_AXE = ITEMS.registerSimpleItem("ferrous_alloy_axe", new Item.Properties().attributes(AxeItem.createAttributes(NWToolTiers.FERROUS, 7.0F, -3.2F)).component(DataComponents.TOOL, NWToolTiers.FERROUS.createToolProperties(BlockTags.MINEABLE_WITH_AXE)).component(DataComponents.MAX_STACK_SIZE, 1).component(DataComponents.MAX_DAMAGE, 131).component(DataComponents.DAMAGE, 0));
    public static final DeferredItem<Item> FERROUS_ALLOY_HOE = ITEMS.registerSimpleItem("ferrous_alloy_hoe", new Item.Properties().attributes(HoeItem.createAttributes(NWToolTiers.FERROUS, -1.0F, -2.0F)).component(DataComponents.TOOL, NWToolTiers.FERROUS.createToolProperties(BlockTags.MINEABLE_WITH_HOE)).component(DataComponents.MAX_STACK_SIZE, 1).component(DataComponents.MAX_DAMAGE, 131).component(DataComponents.DAMAGE, 0));

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
    public static final DeferredItem<Item> DESERT_ROOT = ITEMS.registerSimpleItem("desert_root", new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationModifier(0.5f).build()));

    //Misc
    //public static final DeferredItem<Item> ULTRASALINE_WATER_BUCKET = ITEM_REGISTRIES.registerSimpleItem("ultrasaline_water_bucket", new BucketItem());
    public static final DeferredItem<Item> DUSTY_JOURNAL = ITEMS.registerSimpleItem("dusty_journal", new Item.Properties());

}
