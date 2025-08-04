package net.timeworndevs.nowhere.common;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.StandingAndWallBlockItem;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.PushReaction;
import net.timeworndevs.nowhere.Main;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BlockRegistry {

    //Registry
    public static final DeferredRegister.Blocks BLOCK_REGISTRIES = DeferredRegister.createBlocks(Main.MODID);

    //Blocks
    public static final DeferredBlock<Block> PARCHED_LOG = BLOCK_REGISTRIES.register("parched_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_ORANGE).sound(SoundType.STEM).strength(2.5F, 3.5F)));
    public static final DeferredBlock<Block> STRIPPED_PARCHED_LOG = BLOCK_REGISTRIES.register("stripped_parched_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_ORANGE).sound(SoundType.STEM).strength(2.5F, 3.5F)));
    public static final DeferredBlock<Block> PARCHED_PLANKS = BLOCK_REGISTRIES.registerSimpleBlock("parched_planks", BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_ORANGE).sound(SoundType.NETHER_WOOD).strength(2.5F, 3.5F));
    public static final DeferredBlock<Block> PARCHED_DOOR = BLOCK_REGISTRIES.register("parched_door", () -> new DoorBlock(BlockSetType.CRIMSON, BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_ORANGE).sound(SoundType.NETHER_WOOD).strength(2.5F,3.5F)));
    public static final DeferredBlock<Block> DUST_BLOCK = BLOCK_REGISTRIES.register("dust_block", () -> new FallingBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SAND).sound(SoundType.SOUL_SAND).strength(0.5F, 0.5F)) {
        @Override
        protected MapCodec<? extends FallingBlock> codec() {
            return null;
        }
    });
    public static final DeferredBlock<Block> PACKED_DUST_BLOCK = BLOCK_REGISTRIES.registerSimpleBlock("packed_dust_block", BlockBehaviour.Properties.of().mapColor(MapColor.SAND).sound(SoundType.SOUL_SOIL).strength(0.5F,0.5F));
    public static final DeferredBlock<Block> DUSTY_BITUMEN = BLOCK_REGISTRIES.registerSimpleBlock("dusty_bitumen", BlockBehaviour.Properties.of().mapColor(MapColor.SAND).sound(SoundType.SOUL_SOIL).strength(0.5F,0.5F));
    public static final DeferredBlock<Block> DUSTSTONE = BLOCK_REGISTRIES.registerSimpleBlock("duststone", BlockBehaviour.Properties.of().mapColor(MapColor.SAND).sound(SoundType.DRIPSTONE_BLOCK).strength(0.8F,0.8F));
    public static final DeferredBlock<Block> DUSTSTONE_BRICKS = BLOCK_REGISTRIES.registerSimpleBlock("duststone_bricks", BlockBehaviour.Properties.of().mapColor(MapColor.SAND).sound(SoundType.DRIPSTONE_BLOCK).strength(0.8F,0.8F));
    public static final DeferredBlock<Block> FERROUS_ALLOY_BLOCK = BLOCK_REGISTRIES.registerSimpleBlock("ferrous_alloy_block", BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).sound(SoundType.HEAVY_CORE).strength(5F,6F));
    public static final DeferredBlock<Block> FERROUS_ALLOY_DOOR = BLOCK_REGISTRIES.register("ferrous_alloy_door", () -> new DoorBlock(BlockSetType.IRON, BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).sound(SoundType.HEAVY_CORE).strength(5F,6F)));
    public static final DeferredBlock<Block> SALT_CRUST = BLOCK_REGISTRIES.registerSimpleBlock("salt_crust", BlockBehaviour.Properties.of().mapColor(MapColor.SAND).sound(SoundType.CALCITE).strength(0.5F,0.5F));
    public static final DeferredBlock<Block> BITUMEN_BLOCK = BLOCK_REGISTRIES.register("bitumen_block", () -> new SoulSandBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).sound(SoundType.HONEY_BLOCK).strength(0.5F,0.5F).speedFactor(0.4F)));
    public static final DeferredBlock<Block> MAKESHIFT_TORCH = BLOCK_REGISTRIES.register("makeshift_torch", () -> new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.of().mapColor(MapColor.FIRE).sound(SoundType.NETHER_WOOD).instabreak().pushReaction(PushReaction.DESTROY).lightLevel((level) -> {return 12;})));
    public static final DeferredBlock<Block> WALL_MAKESHIFT_TORCH = BLOCK_REGISTRIES.register("makeshift_wall_torch", () -> new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.of().mapColor(MapColor.FIRE).sound(SoundType.NETHER_WOOD).instabreak().pushReaction(PushReaction.DESTROY).lightLevel((level) -> {return 12;})));

    //BlockItems
    public static final DeferredItem<BlockItem> PARCHED_LOG_BLOCK_ITEM = ItemRegistry.ITEM_REGISTRIES.registerSimpleBlockItem("parched_log", PARCHED_LOG);
    public static final DeferredItem<BlockItem> STRIPPED_PARCHED_LOG_BLOCK_ITEM = ItemRegistry.ITEM_REGISTRIES.registerSimpleBlockItem("stripped_parched_log", STRIPPED_PARCHED_LOG);
    public static final DeferredItem<BlockItem> PARCHED_PLANKS_BLOCK_ITEM = ItemRegistry.ITEM_REGISTRIES.registerSimpleBlockItem("parched_planks", PARCHED_PLANKS);
    public static final DeferredItem<BlockItem> PARCHED_DOOR_BLOCK_ITEM = ItemRegistry.ITEM_REGISTRIES.registerSimpleBlockItem("parched_door", PARCHED_DOOR);
    public static final DeferredItem<BlockItem> DUST_BLOCK_ITEM = ItemRegistry.ITEM_REGISTRIES.registerSimpleBlockItem("dust_block", DUST_BLOCK);
    public static final DeferredItem<BlockItem> DUSTY_BITUMEN_BLOCK_ITEM = ItemRegistry.ITEM_REGISTRIES.registerSimpleBlockItem("dusty_bitumen", DUSTY_BITUMEN);
    public static final DeferredItem<BlockItem> PACKED_DUST_BLOCK_ITEM = ItemRegistry.ITEM_REGISTRIES.registerSimpleBlockItem("packed_dust_block", PACKED_DUST_BLOCK);
    public static final DeferredItem<BlockItem> DUSTSTONE_BLOCK_ITEM = ItemRegistry.ITEM_REGISTRIES.registerSimpleBlockItem("duststone", DUSTSTONE);
    public static final DeferredItem<BlockItem> DUSTSTONE_BRICKS_BLOCK_ITEM = ItemRegistry.ITEM_REGISTRIES.registerSimpleBlockItem("duststone_bricks", DUSTSTONE_BRICKS);
    public static final DeferredItem<BlockItem> FERROUS_ALLOY_BLOCK_ITEM = ItemRegistry.ITEM_REGISTRIES.registerSimpleBlockItem("ferrous_alloy_block", FERROUS_ALLOY_BLOCK);
    public static final DeferredItem<BlockItem> FERROUS_ALLOY_DOOR_BLOCK_ITEM = ItemRegistry.ITEM_REGISTRIES.registerSimpleBlockItem("ferrous_alloy_door", FERROUS_ALLOY_DOOR);
    public static final DeferredItem<BlockItem> SALT_CRUST_BLOCK_ITEM = ItemRegistry.ITEM_REGISTRIES.registerSimpleBlockItem("salt_crust", SALT_CRUST);
    public static final DeferredItem<BlockItem> BITUMEN_BLOCK_ITEM = ItemRegistry.ITEM_REGISTRIES.registerSimpleBlockItem("bitumen_block", BITUMEN_BLOCK);
    public static final DeferredItem<BlockItem> MAKESHIFT_TORCH_BLOCK_ITEM = ItemRegistry.ITEM_REGISTRIES.register("makeshift_torch", (torch) -> new StandingAndWallBlockItem(MAKESHIFT_TORCH.get(), WALL_MAKESHIFT_TORCH.get(), new Item.Properties(), Direction.DOWN));

}