package net.tws.nowhere.common.tags;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.tws.nowhere.Nowhere;

public class NWItemTags {

    public static final TagKey<Item> PARCHED_WOODS = create("parched_woods");
    public static final TagKey<Item> FERROUS_SCRAP = create("ferrous_scrap");
    public static final TagKey<Item> FERROUS_ALLOY = create("ferrous_alloy");

    public NWItemTags() {

    }

    public static TagKey<Item> create(String name) {
        return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Nowhere.MODID, name));
    }

    public static TagKey<Block> create(ResourceLocation name) {
        return TagKey.create(Registries.BLOCK, name);
    }

}
