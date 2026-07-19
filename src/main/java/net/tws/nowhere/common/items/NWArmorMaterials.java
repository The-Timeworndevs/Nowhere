package net.tws.nowhere.common.items;

import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.tws.nowhere.Nowhere;
import net.tws.nowhere.common.init.NWItems;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class NWArmorMaterials {


    //Ferrous Scrap Set?

    //Ferrous Alloy set
    public static final Holder<ArmorMaterial> FERROUS_ALLOY = register("ferrous_alloy", Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
        attribute.put(ArmorItem.Type.BOOTS, 2);
        attribute.put(ArmorItem.Type.LEGGINGS, 5);
        attribute.put(ArmorItem.Type.CHESTPLATE, 6);
        attribute.put(ArmorItem.Type.HELMET, 2);
        attribute.put(ArmorItem.Type.BODY, 5);
    }), 9, 0, 0, NWItems.FERROUS_ALLOY_INGOT, SoundEvents.ARMOR_EQUIP_IRON);

    //Thank you KaupenJoe!
    private static Holder<ArmorMaterial> register(String name, EnumMap<ArmorItem.Type, Integer> typeProtection, int enchantability, float toughness, float knockbackResistance, Supplier<Item> ingredientItem, Holder<SoundEvent> sound) {
        ResourceLocation location = ResourceLocation.fromNamespaceAndPath(Nowhere.MODID, name);
        //Holder<SoundEvent> equipSound = SoundEvents.ARMOR_EQUIP_NETHERITE;
        Supplier<Ingredient> ingredient = () -> Ingredient.of(ingredientItem.get());
        List<ArmorMaterial.Layer> layers = List.of(new ArmorMaterial.Layer(location));

        EnumMap<ArmorItem.Type, Integer> typeMap = new EnumMap<>(ArmorItem.Type.class);
        for (ArmorItem.Type type : ArmorItem.Type.values()) {
            typeMap.put(type, typeProtection.get(type));
        }

        return Registry.registerForHolder(BuiltInRegistries.ARMOR_MATERIAL, location,
                new ArmorMaterial(typeProtection, enchantability, sound, ingredient, layers, toughness, knockbackResistance));
    }
}
