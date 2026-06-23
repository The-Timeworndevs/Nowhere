package net.tws.nowhere.common.blocks.tags;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.tws.nowhere.Nowhere;

public final class NowhereBlockTags {

    public static final TagKey<Block> NOWHERE_SOILS = create("nowhere_soils");

    public NowhereBlockTags() {

    }

    public static TagKey<Block> create(String name) {
        return TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Nowhere.MODID, name));
    }

    public static TagKey<Block> create(ResourceLocation name) {
        return TagKey.create(Registries.BLOCK, name);
    }
}
