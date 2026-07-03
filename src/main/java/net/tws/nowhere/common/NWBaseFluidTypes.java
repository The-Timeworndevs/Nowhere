package net.tws.nowhere.common;

import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.fluids.FluidType;
import org.joml.Vector3f;

public class NWBaseFluidTypes extends FluidType {
    private final ResourceLocation stillTexture;
    private final ResourceLocation flowingTexture;
    private final int tintColor;
    private final Vector3f fogColor;

    public NWBaseFluidTypes(final ResourceLocation stillTexture, final ResourceLocation flowingTexture, final int tintColor , final Vector3f fogColor, final Properties properties){
        super(properties);
        this.stillTexture = stillTexture;
        this.flowingTexture = flowingTexture;
        this.tintColor = tintColor;
        this.fogColor = fogColor;
    }

    public ResourceLocation getStillTexture() {
        return stillTexture;
    }

    public ResourceLocation getFlowingTexture() {
        return flowingTexture;
    }

    public int getTintColor() {
        return tintColor;
    }

    public Vector3f getFogColor() {
        return fogColor;
    }
}
