package net.tws.nowhere.common;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.material.PushReaction;
import net.tws.nowhere.Nowhere;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tws.nowhere.common.blocks.NWBlockSetTypes;
import net.tws.nowhere.common.blocks.NWWoodTypes;
import net.tws.nowhere.common.blocks.ParchedCraftingTableBlock;

public class NWBlocks {

    //Registry
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Nowhere.MODID);


    //Blocks
    //Natural Blocks
    public static final DeferredBlock<Block> PARCHED_LOG = BLOCKS.register("parched_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_ORANGE).sound(SoundType.STEM).strength(2.5F, 3.5F)));
    public static final DeferredBlock<Block> DUST = BLOCKS.register("dust", () -> new FallingBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SAND).sound(SoundType.SOUL_SAND).strength(0.5F, 0.5F)) {
        @Override
        protected MapCodec<? extends FallingBlock> codec() {
            return null;
        }
    });
    public static final DeferredBlock<Block> PACKED_DUST = BLOCKS.registerSimpleBlock("packed_dust", BlockBehaviour.Properties.of().mapColor(MapColor.SAND).sound(SoundType.SOUL_SOIL).strength(0.5F,0.5F));
    public static final DeferredBlock<Block> DUSTY_BITUMEN = BLOCKS.registerSimpleBlock("dusty_bitumen", BlockBehaviour.Properties.of().mapColor(MapColor.SAND).sound(SoundType.SOUL_SOIL).strength(0.5F,0.5F));
    public static final DeferredBlock<Block> DUSTSTONE = BLOCKS.registerSimpleBlock("duststone", BlockBehaviour.Properties.of().mapColor(MapColor.SAND).sound(SoundType.BASALT).strength(0.8F,0.8F).requiresCorrectToolForDrops());

    public static final DeferredBlock<Block> FERROUS_SCRAP_HEAP = BLOCKS.registerSimpleBlock("ferrous_scrap_heap", BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_ORANGE).sound(SoundType.ANCIENT_DEBRIS).strength(5F,6F).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> DUSTY_FERROUS_SCRAP = BLOCKS.registerSimpleBlock("dusty_ferrous_scrap", BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_ORANGE).sound(SoundType.ANCIENT_DEBRIS).strength(5F,6F).requiresCorrectToolForDrops());

    public static final DeferredBlock<Block> DESERT_ROOTS = BLOCKS.register("desert_roots", ()-> new BushBlock(BlockBehaviour.Properties.of().mapColor(MapColor.GOLD).sound(SoundType.COBWEB).instabreak().noOcclusion().noCollission()) {
        @Override
        protected MapCodec<? extends BushBlock> codec() {
            return null;
        }
    });
    //public static final DeferredBlock<Block> STILL_ULTRASALINE_WATER = BLOCKS.register("still_altrasaline_water",()-> new LiquidBlock());

    //Building Blocks
    public static final DeferredBlock<Block> PARCHED_WOOD = BLOCKS.register("parched_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_ORANGE).sound(SoundType.STEM).strength(2.5F, 3.5F)));
    public static final DeferredBlock<Block> STRIPPED_PARCHED_LOG = BLOCKS.register("stripped_parched_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_ORANGE).sound(SoundType.STEM).strength(2.5F, 3.5F)));
    public static final DeferredBlock<Block> STRIPPED_PARCHED_WOOD = BLOCKS.register("stripped_parched_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_ORANGE).sound(SoundType.STEM).strength(2.5F, 3.5F)));
    public static final DeferredBlock<Block> PARCHED_PLANKS = BLOCKS.registerSimpleBlock("parched_planks", BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_ORANGE).sound(SoundType.NETHER_WOOD).strength(2.5F, 3.5F));
    public static final DeferredBlock<Block> PARCHED_STAIRS = BLOCKS.register("parched_stairs", ()-> new StairBlock(PARCHED_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_ORANGE).sound(SoundType.NETHER_WOOD).strength(2.5F, 3.5F)));
    public static final DeferredBlock<Block> PARCHED_SLAB = BLOCKS.register("parched_slab", ()-> new SlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_ORANGE).sound(SoundType.NETHER_WOOD).strength(2.5F, 3.5F)));
    public static final DeferredBlock<Block> PARCHED_FENCE = BLOCKS.register("parched_fence", ()-> new FenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_ORANGE).sound(SoundType.NETHER_WOOD).strength(2.5F, 3.5F)));
    public static final DeferredBlock<Block> PARCHED_FENCE_GATE = BLOCKS.register("parched_fence_gate", ()-> new FenceGateBlock(NWWoodTypes.PARCHED, BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_ORANGE).sound(SoundType.NETHER_WOOD).strength(2.5F, 3.5F)));
    public static final DeferredBlock<Block> PARCHED_DOOR = BLOCKS.register("parched_door", () -> new DoorBlock(NWBlockSetTypes.PARCHED, BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_ORANGE).sound(SoundType.NETHER_WOOD).strength(2.5F,3.5F).noOcclusion()));
    public static final DeferredBlock<Block> PARCHED_TRAPDOOR = BLOCKS.register("parched_trapdoor", () -> new TrapDoorBlock(NWBlockSetTypes.PARCHED, BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_ORANGE).sound(SoundType.NETHER_WOOD).strength(2.5F,3.5F).noOcclusion()));
    public static final DeferredBlock<Block> PARCHED_PRESSURE_PLATE = BLOCKS.register("parched_pressure_plate", ()-> new PressurePlateBlock(NWBlockSetTypes.PARCHED, BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_ORANGE).sound(SoundType.NETHER_WOOD).strength(0.5F).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> PARCHED_BUTTON = BLOCKS.register("parched_button", ()-> new ButtonBlock(NWBlockSetTypes.PARCHED, 30, BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_ORANGE).sound(SoundType.NETHER_WOOD).strength(0.5F).pushReaction(PushReaction.DESTROY)));

    public static final DeferredBlock<Block> COBBLED_DUSTSTONE = BLOCKS.registerSimpleBlock("cobbled_duststone", BlockBehaviour.Properties.of().mapColor(MapColor.SAND).sound(SoundType.BASALT).strength(0.8F,0.8F).requiresCorrectToolForDrops());

    //Duststone Set
    public static final DeferredBlock<Block> DUSTSTONE_BRICKS = BLOCKS.registerSimpleBlock("duststone_bricks", BlockBehaviour.Properties.of().mapColor(MapColor.SAND).sound(SoundType.BASALT).strength(0.8F,0.8F).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> DUSTSTONE_BRICKS_STAIRS = BLOCKS.register("duststone_bricks_stairs", ()-> new StairBlock(DUSTSTONE.get().defaultBlockState(),BlockBehaviour.Properties.of().mapColor(MapColor.SAND).sound(SoundType.BASALT).strength(0.8F,0.8F).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> DUSTSTONE_BRICKS_SLAB = BLOCKS.register("duststone_bricks_slab", ()-> new SlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SAND).sound(SoundType.BASALT).strength(0.8F,0.8F).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> DUSTSTONE_BRICKS_WALL = BLOCKS.register("duststone_bricks_wall", ()-> new WallBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SAND).sound(SoundType.BASALT).strength(0.8F,0.8F).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> FERROUS_ALLOY_CHAIN = BLOCKS.register("ferrous_alloy_chain", ()-> new ChainBlock(BlockBehaviour.Properties.of().forceSolidOn().requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.CHAIN).noOcclusion()));

    //Resources
    public static final DeferredBlock<Block> FERROUS_SCRAP_BLOCK = BLOCKS.registerSimpleBlock("ferrous_scrap_block", BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_ORANGE).sound(SoundType.HEAVY_CORE).strength(5F,6F).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> FERROUS_ALLOY_BLOCK = BLOCKS.registerSimpleBlock("ferrous_alloy_block", BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).sound(SoundType.HEAVY_CORE).strength(5F,6F).requiresCorrectToolForDrops());
    public static final DeferredBlock<Block> SALT_CRUST = BLOCKS.registerSimpleBlock("salt_crust", BlockBehaviour.Properties.of().mapColor(MapColor.SAND).sound(SoundType.CALCITE).strength(0.5F,0.5F));
    public static final DeferredBlock<Block> BITUMEN_BLOCK = BLOCKS.register("bitumen_block", () -> new SoulSandBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).sound(SoundType.HONEY_BLOCK).strength(0.5F,0.5F).speedFactor(0.4F)));

    //Functional Blocks
    public static final DeferredBlock<Block> MAKESHIFT_TORCH = BLOCKS.register("makeshift_torch", () -> new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.of().mapColor(MapColor.FIRE).sound(SoundType.NETHER_WOOD).instabreak().pushReaction(PushReaction.DESTROY).lightLevel((level) -> {return 12;}).noCollission().noOcclusion()));
    public static final DeferredBlock<Block> WALL_MAKESHIFT_TORCH = BLOCKS.register("makeshift_wall_torch", () -> new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.of().mapColor(MapColor.FIRE).sound(SoundType.NETHER_WOOD).instabreak().pushReaction(PushReaction.DESTROY).lightLevel((level) -> {return 12;}).noCollission().noOcclusion()));
    public static final DeferredBlock<Block> FERROUS_ALLOY_DOOR = BLOCKS.register("ferrous_alloy_door", () -> new DoorBlock(NWBlockSetTypes.FERROUS, BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).sound(SoundType.HEAVY_CORE).strength(5F,6F).requiresCorrectToolForDrops().noOcclusion()));
    public static final DeferredBlock<Block> FERROUS_ALLOY_TRAPDOOR = BLOCKS.register("ferrous_alloy_trapdoor", () -> new TrapDoorBlock(NWBlockSetTypes.FERROUS, BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).sound(SoundType.HEAVY_CORE).strength(5F,6F).requiresCorrectToolForDrops().noOcclusion()));

    public static final DeferredBlock<Block> PARCHED_SIGN = BLOCKS.register("parched_sign", ()-> new StandingSignBlock(NWWoodTypes.PARCHED, BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_ORANGE).sound(SoundType.NETHER_WOOD).forceSolidOn().noCollission().strength(1.0F)));
    public static final DeferredBlock<Block> WALL_PARCHED_SIGN = BLOCKS.register("wall_parched_sign", ()-> new WallSignBlock(NWWoodTypes.PARCHED, BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_ORANGE).sound(SoundType.NETHER_WOOD).forceSolidOn().noCollission().strength(1.0F)));
    public static final DeferredBlock<Block> PARCHED_HANGING_SIGN = BLOCKS.register("parched_hanging_sign", ()-> new CeilingHangingSignBlock(NWWoodTypes.PARCHED, BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_ORANGE).sound(SoundType.NETHER_WOOD).forceSolidOn().noCollission().strength(1.0F)));
    public static final DeferredBlock<Block> WALL_PARCHED_HANGING_SIGN = BLOCKS.register("wall_parched_hanging_sign", ()-> new WallHangingSignBlock(NWWoodTypes.PARCHED, BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_ORANGE).sound(SoundType.NETHER_WOOD_HANGING_SIGN).forceSolidOn().noCollission().strength(1.0F)));

    public static final DeferredBlock<Block> PARCHED_CRAFTING_TABLE = BLOCKS.register("parched_crafting_table", ()-> new ParchedCraftingTableBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_ORANGE).sound(SoundType.NETHER_WOOD).strength(2.5F, 3.5F)));
    public static final DeferredBlock<Block> MAKESHIFT_FURNACE = BLOCKS.register("makeshift_furnace", ()-> new FurnaceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SAND).sound(SoundType.BASALT).strength(0.8F,0.8F).requiresCorrectToolForDrops()));

    //BlockItems

    //Natural Blocks
    public static final DeferredItem<BlockItem> PARCHED_LOG_ITEM = NWItems.ITEM_REGISTRIES.registerSimpleBlockItem("parched_log", PARCHED_LOG);
    public static final DeferredItem<BlockItem> DUST_ITEM = NWItems.ITEM_REGISTRIES.registerSimpleBlockItem("dust", DUST);
    public static final DeferredItem<BlockItem> DUSTY_BITUMEN_ITEM = NWItems.ITEM_REGISTRIES.registerSimpleBlockItem("dusty_bitumen", DUSTY_BITUMEN);
    public static final DeferredItem<BlockItem> PACKED_DUST_ITEM = NWItems.ITEM_REGISTRIES.registerSimpleBlockItem("packed_dust", PACKED_DUST);
    public static final DeferredItem<BlockItem> SALT_CRUST_ITEM = NWItems.ITEM_REGISTRIES.registerSimpleBlockItem("salt_crust", SALT_CRUST);
    public static final DeferredItem<BlockItem> DUSTSTONE_ITEM = NWItems.ITEM_REGISTRIES.registerSimpleBlockItem("duststone", DUSTSTONE);
    public static final DeferredItem<BlockItem> FERROUS_SCRAP_HEAP_ITEM = NWItems.ITEM_REGISTRIES.registerSimpleBlockItem("ferrous_scrap_heap", FERROUS_SCRAP_HEAP);
    public static final DeferredItem<BlockItem> DUSTY_FERROUS_SCRAP_ITEM = NWItems.ITEM_REGISTRIES.registerSimpleBlockItem("dusty_ferrous_scrap", DUSTY_FERROUS_SCRAP);
    public static final DeferredItem<BlockItem> DESERT_ROOTS_ITEM = NWItems.ITEM_REGISTRIES.registerSimpleBlockItem("desert_roots", DESERT_ROOTS);

    //Building Blocks

    //Parched Set
    public static final DeferredItem<BlockItem> PARCHED_WOOD_ITEM = NWItems.ITEM_REGISTRIES.registerSimpleBlockItem("parched_wood", PARCHED_WOOD);
    public static final DeferredItem<BlockItem> STRIPPED_PARCHED_LOG_ITEM = NWItems.ITEM_REGISTRIES.registerSimpleBlockItem("stripped_parched_log", STRIPPED_PARCHED_LOG);
    public static final DeferredItem<BlockItem> STRIPPED_PARCHED_WOOD_ITEM = NWItems.ITEM_REGISTRIES.registerSimpleBlockItem("stripped_parched_wood", STRIPPED_PARCHED_WOOD);
    public static final DeferredItem<BlockItem> PARCHED_PLANKS_ITEM = NWItems.ITEM_REGISTRIES.registerSimpleBlockItem("parched_planks", PARCHED_PLANKS);
    public static final DeferredItem<BlockItem> PARCHED_STAIRS_ITEM = NWItems.ITEM_REGISTRIES.registerSimpleBlockItem("parched_stairs", PARCHED_STAIRS);
    public static final DeferredItem<BlockItem> PARCHED_SLAB_ITEM = NWItems.ITEM_REGISTRIES.registerSimpleBlockItem("parched_slab", PARCHED_SLAB);
    public static final DeferredItem<BlockItem> PARCHED_FENCE_ITEM = NWItems.ITEM_REGISTRIES.registerSimpleBlockItem("parched_fence", PARCHED_FENCE);
    public static final DeferredItem<BlockItem> PARCHED_FENCE_GATE_ITEM = NWItems.ITEM_REGISTRIES.registerSimpleBlockItem("parched_fence_gate", PARCHED_FENCE_GATE);
    public static final DeferredItem<BlockItem> PARCHED_PRESSURE_PLATE_ITEM = NWItems.ITEM_REGISTRIES.registerSimpleBlockItem("parched_pressure_plate", PARCHED_PRESSURE_PLATE);
    public static final DeferredItem<BlockItem> PARCHED_BUTTON_ITEM = NWItems.ITEM_REGISTRIES.registerSimpleBlockItem("parched_button", PARCHED_BUTTON);

    //Duststone Set
    public static final DeferredItem<BlockItem> DUSTSTONE_BRICKS_ITEM = NWItems.ITEM_REGISTRIES.registerSimpleBlockItem("duststone_bricks", DUSTSTONE_BRICKS);
    public static final DeferredItem<BlockItem> DUSTSTONE_BRICKS_STAIRS_ITEM = NWItems.ITEM_REGISTRIES.registerSimpleBlockItem("duststone_bricks_stairs", DUSTSTONE_BRICKS_STAIRS);
    public static final DeferredItem<BlockItem> DUSTSTONE_BRICKS_SLAB_ITEM = NWItems.ITEM_REGISTRIES.registerSimpleBlockItem("duststone_bricks_slab", DUSTSTONE_BRICKS_SLAB);
    public static final DeferredItem<BlockItem> DUSTSTONE_BRICKS_WALL_ITEM = NWItems.ITEM_REGISTRIES.registerSimpleBlockItem("duststone_bricks_wall", DUSTSTONE_BRICKS_WALL);
    public static final DeferredItem<BlockItem> COBBLED_DUSTSTONE_ITEM = NWItems.ITEM_REGISTRIES.registerSimpleBlockItem("cobbled_duststone", COBBLED_DUSTSTONE);

    public static final DeferredItem<BlockItem> FERROUS_ALLOY_CHAIN_ITEM = NWItems.ITEM_REGISTRIES.registerSimpleBlockItem("ferrous_alloy_chain", FERROUS_ALLOY_CHAIN);

    //Resources
    public static final DeferredItem<BlockItem> FERROUS_SCRAP_BLOCK_ITEM = NWItems.ITEM_REGISTRIES.registerSimpleBlockItem("ferrous_scrap_block", FERROUS_SCRAP_BLOCK);
    public static final DeferredItem<BlockItem> FERROUS_ALLOY_BLOCK_ITEM = NWItems.ITEM_REGISTRIES.registerSimpleBlockItem("ferrous_alloy_block", FERROUS_ALLOY_BLOCK);
    public static final DeferredItem<BlockItem> BITUMEN_ITEM = NWItems.ITEM_REGISTRIES.registerSimpleBlockItem("bitumen_block", BITUMEN_BLOCK);

    //Functional Blocks
    public static final DeferredItem<BlockItem> PARCHED_DOOR_ITEM = NWItems.ITEM_REGISTRIES.registerSimpleBlockItem("parched_door", PARCHED_DOOR);
    public static final DeferredItem<BlockItem> PARCHED_TRAPDOOR_ITEM = NWItems.ITEM_REGISTRIES.registerSimpleBlockItem("parched_trapdoor", PARCHED_TRAPDOOR);
    public static final DeferredItem<BlockItem> FERROUS_ALLOY_DOOR_ITEM = NWItems.ITEM_REGISTRIES.registerSimpleBlockItem("ferrous_alloy_door", FERROUS_ALLOY_DOOR);
    public static final DeferredItem<BlockItem> FERROUS_ALLOY_TRAPDOOR_ITEM = NWItems.ITEM_REGISTRIES.registerSimpleBlockItem("ferrous_alloy_trapdoor", FERROUS_ALLOY_TRAPDOOR);
    public static final DeferredItem<BlockItem> MAKESHIFT_TORCH_ITEM = NWItems.ITEM_REGISTRIES.register("makeshift_torch", (torch) -> new StandingAndWallBlockItem(MAKESHIFT_TORCH.get(), WALL_MAKESHIFT_TORCH.get(), new Item.Properties(), Direction.DOWN));

    public static final DeferredItem<BlockItem> PARCHED_SIGN_ITEM = NWItems.ITEM_REGISTRIES.register("parched_sign", (sign) -> new SignItem(new Item.Properties().stacksTo(16), PARCHED_SIGN.get(), WALL_PARCHED_SIGN.get()));
    public static final DeferredItem<BlockItem> PARCHED_HANGING_SIGN_ITEM = NWItems.ITEM_REGISTRIES.register("parched_hanging_sign", (hangingSign) -> new HangingSignItem(PARCHED_HANGING_SIGN.get(), WALL_PARCHED_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final DeferredItem<BlockItem> PARCHED_CRAFTING_TABLE_ITEM = NWItems.ITEM_REGISTRIES.registerSimpleBlockItem("parched_crafting_table", PARCHED_CRAFTING_TABLE);
    public static final DeferredItem<BlockItem> MAKESHIFT_FURNACE_ITEM = NWItems.ITEM_REGISTRIES.registerSimpleBlockItem("makeshift_furnace", MAKESHIFT_FURNACE);

}