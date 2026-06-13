package net.tws.nowhere.common.blocks;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.tws.nowhere.NWMain;

public final class NowhereBlockTags {

    public static final TagKey<Block> INCORRECT_FOR_SCRAP_TOOLS = create("incorrect_for_scrap_tools");
    public static final TagKey<Block> INCORRECT_FOR_FERROUS_ALLOY_TOOLS = create("incorrect_for_ferrous_alloy_tools");

    public NowhereBlockTags() {

    }

    public static TagKey<Block> create(String name) {
        return TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(NWMain.MODID, name));
    }

    public static TagKey<Block> create(ResourceLocation name) {
        return TagKey.create(Registries.BLOCK, name);
    }
}
