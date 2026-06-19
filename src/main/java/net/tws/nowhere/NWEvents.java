package net.tws.nowhere;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.BlockEntityTypeAddBlocksEvent;
import net.tws.nowhere.common.NWBlocks;

@EventBusSubscriber(modid = NWMain.MODID)
public class NWEvents {

    @SubscribeEvent
    public static void setupBlockEntities(BlockEntityTypeAddBlocksEvent event) {
        event.modify(BlockEntityType.SIGN, NWBlocks.PARCHED_SIGN.get());
        event.modify(BlockEntityType.SIGN, NWBlocks.WALL_PARCHED_SIGN.get());
        event.modify(BlockEntityType.HANGING_SIGN, NWBlocks.PARCHED_HANGING_SIGN.get());
        event.modify(BlockEntityType.HANGING_SIGN, NWBlocks.WALL_PARCHED_HANGING_SIGN.get());
    }
}
