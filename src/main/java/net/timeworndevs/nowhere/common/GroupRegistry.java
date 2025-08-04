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
            .icon(() -> BlockRegistry.DUSTSTONE_BRICKS_BLOCK_ITEM.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(BlockRegistry.PARCHED_LOG_BLOCK_ITEM.get());
                output.accept(BlockRegistry.STRIPPED_PARCHED_LOG_BLOCK_ITEM.get());
                output.accept(BlockRegistry.PARCHED_PLANKS_BLOCK_ITEM.get());
                output.accept(BlockRegistry.DUSTSTONE_BLOCK_ITEM.get());
                output.accept(BlockRegistry.DUSTSTONE_BRICKS_BLOCK_ITEM.get());
                output.accept(BlockRegistry.FERROUS_SCRAP_BLOCK_ITEM.get());
                output.accept(BlockRegistry.FERROUS_ALLOY_BLOCK_ITEM.get());
            }).build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> NOWHERE_NATURAL_TAB = GROUP_REGISTRIES.register("nowhere_natural_blocks", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.nowhere.natural"))
            .icon(() -> BlockRegistry.DUST_BLOCK_ITEM.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(BlockRegistry.DUST_BLOCK_ITEM.get());
                output.accept(BlockRegistry.DUSTY_BITUMEN_BLOCK_ITEM.get());
                output.accept(BlockRegistry.BITUMEN_BLOCK_ITEM.get());
                output.accept(BlockRegistry.PACKED_DUST_BLOCK_ITEM.get());
                output.accept(BlockRegistry.SALT_CRUST_BLOCK_ITEM.get());
            }).build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> NOWHERE_FUNCTIONAL_TAB = GROUP_REGISTRIES.register("nowhere_functional_blocks", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.nowhere.functional"))
            .icon(() -> BlockRegistry.MAKESHIFT_TORCH_BLOCK_ITEM.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(BlockRegistry.MAKESHIFT_TORCH_BLOCK_ITEM.get());
                output.accept(BlockRegistry.PARCHED_DOOR_BLOCK_ITEM.get());
                output.accept(BlockRegistry.FERROUS_ALLOY_DOOR_BLOCK_ITEM);
            }).build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> NOWHERE_TOOLS_TAB = GROUP_REGISTRIES.register("nowhere_tools", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.nowhere.tools"))
            .icon(() -> ItemRegistry.SCRAP_PICKAXE.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
            }).build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> NOWHERE_COMBAT_TAB = GROUP_REGISTRIES.register("nowhere_combat", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.nowhere.combat"))
            .icon(() -> ItemRegistry.FERROUS_SCRAP.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
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
