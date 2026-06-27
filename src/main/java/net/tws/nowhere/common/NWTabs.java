package net.tws.nowhere.common;

import net.tws.nowhere.Nowhere;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class NWTabs {

    //Registry
    public static final DeferredRegister<CreativeModeTab> GROUP_REGISTRIES = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Nowhere.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> NOWHERE_BLOCKS_TAB = GROUP_REGISTRIES.register("nowhere_blocks", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.nowhere.blocks"))
            .icon(() -> NWBlocks.DUSTSTONE_BRICKS_ITEM.get().getDefaultInstance())
            .displayItems((parameters, output) -> {

                //Parched Set
                output.accept(NWBlocks.PARCHED_LOG_ITEM.get());
                output.accept(NWBlocks.PARCHED_WOOD_ITEM.get());
                output.accept(NWBlocks.STRIPPED_PARCHED_LOG_ITEM.get());
                output.accept(NWBlocks.STRIPPED_PARCHED_WOOD_ITEM.get());
                output.accept(NWBlocks.PARCHED_PLANKS_ITEM.get());
                output.accept(NWBlocks.PARCHED_STAIRS_ITEM.get());
                output.accept(NWBlocks.PARCHED_SLAB_ITEM.get());
                output.accept(NWBlocks.PARCHED_FENCE_ITEM.get());
                output.accept(NWBlocks.PARCHED_FENCE_GATE_ITEM.get());
                output.accept(NWBlocks.PARCHED_DOOR_ITEM.get());
                output.accept(NWBlocks.PARCHED_TRAPDOOR_ITEM.get());
                output.accept(NWBlocks.PARCHED_PRESSURE_PLATE_ITEM.get());
                output.accept(NWBlocks.PARCHED_BUTTON_ITEM.get());

                //Duststone Set
                output.accept(NWBlocks.DUSTSTONE_ITEM.get());
                output.accept(NWBlocks.DUSTSTONE_STAIRS_ITEM.get());
                output.accept(NWBlocks.DUSTSTONE_SLAB_ITEM.get());
                output.accept(NWBlocks.DUSTSTONE_PRESSURE_PLATE_ITEM.get());
                output.accept(NWBlocks.DUSTSTONE_BUTTON_ITEM.get());

                output.accept(NWBlocks.COBBLED_DUSTSTONE_ITEM.get());
                output.accept(NWBlocks.COBBLED_DUSTSTONE_STAIRS_ITEM.get());
                output.accept(NWBlocks.COBBLED_DUSTSTONE_SLAB_ITEM.get());
                output.accept(NWBlocks.COBBLED_DUSTSTONE_WALL_ITEM.get());

                output.accept(NWBlocks.DUSTSTONE_BRICKS_ITEM.get());
                output.accept(NWBlocks.DUSTSTONE_BRICKS_STAIRS_ITEM.get());
                output.accept(NWBlocks.DUSTSTONE_BRICKS_SLAB_ITEM.get());
                output.accept(NWBlocks.DUSTSTONE_BRICKS_WALL_ITEM.get());

                output.accept(NWBlocks.FERROUS_SCRAP_BLOCK_ITEM.get());
                output.accept(NWBlocks.FERROUS_ALLOY_BLOCK_ITEM.get());
                output.accept(NWBlocks.FERROUS_ALLOY_DOOR_ITEM.get());
                output.accept(NWBlocks.FERROUS_ALLOY_TRAPDOOR_ITEM.get());
                output.accept(NWBlocks.FERROUS_ALLOY_CHAIN_ITEM.get());
            }).build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> NOWHERE_NATURAL_TAB = GROUP_REGISTRIES.register("nowhere_natural_blocks", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.nowhere.natural"))
            .icon(() -> NWBlocks.DUST_ITEM.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(NWBlocks.DUST_ITEM.get());
                output.accept(NWBlocks.PACKED_DUST_ITEM.get());
                output.accept(NWBlocks.DUSTSTONE_ITEM.get());
                output.accept(NWBlocks.DUSTY_BITUMEN_ITEM.get());
                output.accept(NWBlocks.BITUMEN_ITEM.get());
                output.accept(NWBlocks.SALT_CRUST_ITEM.get());
                output.accept(NWBlocks.FERROUS_SCRAP_HEAP_ITEM.get());
                output.accept(NWBlocks.DUSTY_FERROUS_SCRAP_ITEM.get());
                output.accept(NWBlocks.DESERT_ROOTS_ITEM.get());
            }).build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> NOWHERE_FUNCTIONAL_TAB = GROUP_REGISTRIES.register("nowhere_functional_blocks", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.nowhere.functional"))
            .icon(() -> NWBlocks.MAKESHIFT_TORCH_ITEM.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(NWBlocks.MAKESHIFT_TORCH_ITEM.get());
                output.accept(NWBlocks.PARCHED_SIGN_ITEM.get());
                output.accept(NWBlocks.PARCHED_HANGING_SIGN_ITEM.get());
                output.accept(NWBlocks.PARCHED_CRAFTING_TABLE_ITEM.get());
                output.accept(NWBlocks.MAKESHIFT_FURNACE_ITEM.get());
            }).build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> NOWHERE_TOOLS_TAB = GROUP_REGISTRIES.register("nowhere_tools", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.nowhere.tools"))
            .icon(() -> NWItems.SCRAP_PICKAXE.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                //Parched Wood
                output.accept(NWItems.PARCHED_WOODEN_SHOVEL);
                output.accept(NWItems.PARCHED_WOODEN_PICKAXE);
                output.accept(NWItems.PARCHED_WOODEN_AXE);
                output.accept(NWItems.PARCHED_WOODEN_HOE);

                //Scrap
                output.accept(NWItems.SCRAP_SHOVEL);
                output.accept(NWItems.SCRAP_PICKAXE);
                output.accept(NWItems.SCRAP_AXE);
                output.accept(NWItems.SCRAP_HOE);

                //Ferrous Alloy
                output.accept(NWItems.FERROUS_ALLOY_SHOVEL);
                output.accept(NWItems.FERROUS_ALLOY_PICKAXE);
                output.accept(NWItems.FERROUS_ALLOY_AXE);
                output.accept(NWItems.FERROUS_ALLOY_HOE);

            }).build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> NOWHERE_COMBAT_TAB = GROUP_REGISTRIES.register("nowhere_combat", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.nowhere.combat"))
            .icon(() -> NWItems.SCRAP_SWORD.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(NWItems.PARCHED_WOODEN_SWORD);
                output.accept(NWItems.SCRAP_SWORD);
                output.accept(NWItems.FERROUS_ALLOY_SWORD);
                output.accept(NWItems.FERROUS_ALLOY_HELMET);
                output.accept(NWItems.FERROUS_ALLOY_CHESTPLATE);
                output.accept(NWItems.FERROUS_ALLOY_LEGGINGS);
                output.accept(NWItems.FERROUS_ALLOY_BOOTS);
            }).build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> NOWHERE_MATERIALS_TAB = GROUP_REGISTRIES.register("nowhere_materials", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.nowhere.materials"))
            .icon(() -> NWItems.FERROUS_ALLOY_INGOT.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(NWItems.FERROUS_SCRAP.get());
                output.accept(NWItems.FERROUS_ALLOY_NUGGET.get());
                output.accept(NWItems.FERROUS_ALLOY_INGOT.get());
                output.accept(NWItems.PARCHED_STICK.get());
                output.accept(NWItems.BITUMEN_BALL.get());
                output.accept(NWItems.SALT_PILE.get());
            }).build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> NOWHERE_FOOD_TAB = GROUP_REGISTRIES.register("nowhere_food", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.nowhere.food"))
            .icon(() -> NWItems.DESERT_ROOT.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(NWItems.DESERT_ROOT);
            }).build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> NOWHERE_MISC_TAB = GROUP_REGISTRIES.register("nowhere_misc", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.nowhere.misc"))
            .icon(() -> NWItems.DUSTY_JOURNAL.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
            }).build());

}
