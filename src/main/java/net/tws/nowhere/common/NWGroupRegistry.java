package net.tws.nowhere.common;

import net.tws.nowhere.NWMain;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class NWGroupRegistry {

    //Registry
    public static final DeferredRegister<CreativeModeTab> GROUP_REGISTRIES = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NWMain.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> NOWHERE_BLOCKS_TAB = GROUP_REGISTRIES.register("nowhere_blocks", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.nowhere.blocks"))
            .icon(() -> NWBlockRegistry.DUSTSTONE_BRICKS_BLOCK_ITEM.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(NWBlockRegistry.PARCHED_LOG_BLOCK_ITEM.get());
                output.accept(NWBlockRegistry.STRIPPED_PARCHED_LOG_BLOCK_ITEM.get());
                output.accept(NWBlockRegistry.PARCHED_PLANKS_BLOCK_ITEM.get());
                output.accept(NWBlockRegistry.DUSTSTONE_BLOCK_ITEM.get());
                output.accept(NWBlockRegistry.DUSTSTONE_BRICKS_BLOCK_ITEM.get());
                output.accept(NWBlockRegistry.FERROUS_SCRAP_BLOCK_ITEM.get());
                output.accept(NWBlockRegistry.FERROUS_ALLOY_BLOCK_ITEM.get());
            }).build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> NOWHERE_NATURAL_TAB = GROUP_REGISTRIES.register("nowhere_natural_blocks", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.nowhere.natural"))
            .icon(() -> NWBlockRegistry.DUST_BLOCK_ITEM.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(NWBlockRegistry.DUST_BLOCK_ITEM.get());
                output.accept(NWBlockRegistry.DUSTY_BITUMEN_BLOCK_ITEM.get());
                output.accept(NWBlockRegistry.BITUMEN_BLOCK_ITEM.get());
                output.accept(NWBlockRegistry.PACKED_DUST_BLOCK_ITEM.get());
                output.accept(NWBlockRegistry.SALT_CRUST_BLOCK_ITEM.get());
            }).build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> NOWHERE_FUNCTIONAL_TAB = GROUP_REGISTRIES.register("nowhere_functional_blocks", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.nowhere.functional"))
            .icon(() -> NWBlockRegistry.MAKESHIFT_TORCH_BLOCK_ITEM.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(NWBlockRegistry.MAKESHIFT_TORCH_BLOCK_ITEM.get());
                output.accept(NWBlockRegistry.PARCHED_DOOR_BLOCK_ITEM.get());
                output.accept(NWBlockRegistry.FERROUS_ALLOY_DOOR_BLOCK_ITEM);
            }).build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> NOWHERE_TOOLS_TAB = GROUP_REGISTRIES.register("nowhere_tools", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.nowhere.tools"))
            .icon(() -> NWItemRegistry.SCRAP_PICKAXE.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(NWItemRegistry.SCRAP_SHOVEL);
                output.accept(NWItemRegistry.SCRAP_PICKAXE);
                output.accept(NWItemRegistry.SCRAP_AXE);
                output.accept(NWItemRegistry.SCRAP_HOE);
            }).build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> NOWHERE_COMBAT_TAB = GROUP_REGISTRIES.register("nowhere_combat", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.nowhere.combat"))
            .icon(() -> NWItemRegistry.SCRAP_SWORD.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(NWItemRegistry.SCRAP_SWORD);
            }).build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> NOWHERE_MATERIALS_TAB = GROUP_REGISTRIES.register("nowhere_materials", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.nowhere.materials"))
            .icon(() -> NWItemRegistry.FERROUS_ALLOY_INGOT.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(NWItemRegistry.FERROUS_SCRAP.get());
                output.accept(NWItemRegistry.FERROUS_ALLOY_INGOT.get());
                output.accept(NWItemRegistry.FERROUS_ALLOY_NUGGET.get());
                output.accept(NWItemRegistry.BITUMEN_BALL.get());
                output.accept(NWItemRegistry.SALT_PILE.get());
            }).build());

}
