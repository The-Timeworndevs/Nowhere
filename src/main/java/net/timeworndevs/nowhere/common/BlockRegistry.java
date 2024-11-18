package net.timeworndevs.nowhere.common;

import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.SoundType;
import net.timeworndevs.nowhere.Main;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BlockRegistry {

    //Registry
    public static final DeferredRegister.Blocks BLOCK_REGISTRIES = DeferredRegister.createBlocks(Main.MODID);

    //Blocks
    public static final DeferredBlock<Block> DUST_BLOCK = BLOCK_REGISTRIES.registerSimpleBlock("dust_block", BlockBehaviour.Properties.of().mapColor(MapColor.SAND).sound(SoundType.SAND).strength(0.5F,0.5F));
    public static final DeferredBlock<Block> PACKED_DUST_BLOCK = BLOCK_REGISTRIES.registerSimpleBlock("packed_dust_block", BlockBehaviour.Properties.of().mapColor(MapColor.SAND).sound(SoundType.GRAVEL).strength(0.5F,0.5F));

    //BlockItems
    public static final DeferredItem<BlockItem> DUST_BLOCK_ITEM = ItemRegistry.ITEM_REGISTRIES.registerSimpleBlockItem("dust_block", DUST_BLOCK);
    public static final DeferredItem<BlockItem> PACKED_DUST_BLOCK_ITEM = ItemRegistry.ITEM_REGISTRIES.registerSimpleBlockItem("packed_dust_block", PACKED_DUST_BLOCK);

}
