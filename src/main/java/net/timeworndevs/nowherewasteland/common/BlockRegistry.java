package net.timeworndevs.nowherewasteland.common;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.timeworndevs.nowherewasteland.Main;

public class BlockRegistry {

    public static final DeferredRegister.Blocks BLOCK_REGISTRIES = DeferredRegister.createBlocks(Main.MODID);

    public static final DeferredBlock<Block> EXAMPLE_BLOCK = BLOCK_REGISTRIES.registerSimpleBlock("dust", BlockBehaviour.Properties.of().sound(SoundType.SAND).strength(0.5f, 0.5f).mapColor(MapColor.SAND));

    public static final DeferredItem<BlockItem> EXAMPLE_BLOCK_ITEM = ItemRegistry.ITEM_REGISTRIES.registerSimpleBlockItem("example_block", EXAMPLE_BLOCK);

}
