package net.tws.nowhere.common.tags;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.tws.nowhere.Nowhere;

public final class NWBlockTags {

    public static final TagKey<Block> NOWHERE_SOILS = create("nowhere_soils");

    public NWBlockTags() {

    }

    public static TagKey<Block> create(String name) {
        return TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Nowhere.MODID, name));
    }

    public static TagKey<Block> create(ResourceLocation name) {
        return TagKey.create(Registries.BLOCK, name);
    }
}
