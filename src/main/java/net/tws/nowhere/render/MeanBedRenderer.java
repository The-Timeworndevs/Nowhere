package net.tws.nowhere.render;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BedRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.resources.model.Material;
import net.minecraft.world.level.block.entity.BedBlockEntity;

public class MeanBedRenderer extends BedRenderer {
    public MeanBedRenderer(BlockEntityRendererProvider.Context context) {
        super(context);
    }

    @Override
    public void render(BedBlockEntity blockEntity, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, int packedLight, int packedOverlay) {
        Material material = NWSheets.NW_BED_TEXTURES[blockEntity.getColor().getId()];
        super.render(blockEntity, partialTick, poseStack, bufferSource, packedLight, packedOverlay);
    }
}
