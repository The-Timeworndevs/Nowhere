package net.tws.nowhere.render;

import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.resources.model.Material;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.tws.nowhere.Nowhere;

import java.util.Arrays;
import java.util.Comparator;

public class NWSheets extends Sheets {
    public static final ResourceLocation NW_BED_SHEET = ResourceLocation.fromNamespaceAndPath(Nowhere.MODID, "textures/atlas/beds.png");

    public static final Material[] NW_BED_TEXTURES = Arrays.stream(DyeColor.values())
            .sorted(Comparator.comparingInt(DyeColor::getId))
            .map(dyeColor -> new Material(BED_SHEET, ResourceLocation.fromNamespaceAndPath(Nowhere.MODID, "entity/bed/" + dyeColor.getName())))
            .toArray(Material[]::new);
}
