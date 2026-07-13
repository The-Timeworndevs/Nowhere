package net.tws.nowhere.common;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tws.nowhere.Nowhere;
import net.tws.nowhere.common.block_entities.MeanBedBlockEntity;

import java.util.function.Supplier;

public class NWBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, Nowhere.MODID);

    public static final Supplier<BlockEntityType<MeanBedBlockEntity>> MEAN_BED_BE = BLOCK_ENTITIES.register("mean_bed_be", ()-> BlockEntityType.Builder.of(MeanBedBlockEntity::new, NWBlocks.YELLOW_MEAN_BED.get()).build(null));
}
