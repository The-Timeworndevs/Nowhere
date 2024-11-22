package net.timeworndevs.nowhere.common;

import net.timeworndevs.nowhere.Main;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class GroupRegistry {

    //Registry
    public static final DeferredRegister<CreativeModeTab> GROUP_REGISTRIES = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Main.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> NOWHERE_BLOCKS_TAB = GROUP_REGISTRIES.register("nowhere_blocks", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.nowhere.blocks"))
            .icon(() -> BlockRegistry.DUST_BLOCK_ITEM.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(BlockRegistry.DUST_BLOCK_ITEM.get());
                output.accept(BlockRegistry.DUSTY_BITUEMN_BLOCK_ITEM.get());
                output.accept(BlockRegistry.PACKED_DUST_BLOCK_ITEM.get());
                output.accept(BlockRegistry.DUSTSTONE_BLOCK_ITEM.get());
                output.accept(BlockRegistry.DUSTSTONE_BRICKS_BLOCK_ITEM.get());
                output.accept(BlockRegistry.FERROUS_ALLOY_BLOCK_ITEM.get());
                output.accept(BlockRegistry.SALT_CRUST_BLOCK_ITEM.get());
            }).build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> NOWHERE_MATERIALS_TAB = GROUP_REGISTRIES.register("nowhere_materials", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.nowhere.materials"))
            .icon(() -> ItemRegistry.FERROUS_ALLOY_INGOT.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(ItemRegistry.FERROUS_SCRAP.get());
                output.accept(ItemRegistry.FERROUS_ALLOY_INGOT.get());
                output.accept(ItemRegistry.FERROUS_ALLOY_NUGGET.get());
                output.accept(ItemRegistry.BITUMEN_BALL.get());
                output.accept(ItemRegistry.SALT_PILE.get());
            }).build());

}
