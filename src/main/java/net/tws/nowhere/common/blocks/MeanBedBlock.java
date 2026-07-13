package net.tws.nowhere.common.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BedPart;
import net.tws.nowhere.common.block_entities.MeanBedBlockEntity;

public class MeanBedBlock extends BedBlock {
    private final DyeColor color;

    public MeanBedBlock(DyeColor color, Properties properties) {
        super(color, properties);
        this.color = color;
        this.registerDefaultState(this.stateDefinition.any().setValue(PART, BedPart.FOOT).setValue(OCCUPIED, Boolean.valueOf(false)));

    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new MeanBedBlockEntity(pos, state);
    }
}
