package net.tws.nowhere;

import com.mojang.blaze3d.shaders.FogShape;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Camera;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.FogRenderer;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.tws.nowhere.common.*;
import net.tws.nowhere.render.MeanBedRenderer;
import org.joml.Vector3f;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;


@Mod(Nowhere.MODID)
public class Nowhere {

    public static final String MODID = "nowhere";

    private static final Logger LOGGER = LogUtils.getLogger();

    public Nowhere(IEventBus modEventBus, ModContainer modContainer) {

        NWBlocks.BLOCKS.register(modEventBus);

        NWFluids.FLUIDS.register(modEventBus);

        NWFluidTypes.FLUID_TYPES.register(modEventBus);

        NWItems.ITEMS.register(modEventBus);

        NWTabs.GROUPS.register(modEventBus);

        NWBlockEntities.BLOCK_ENTITIES.register(modEventBus);

        NeoForge.EVENT_BUS.register(this);

        //modContainer.registerConfig(ModConfig.Type.COMMON, NWConfig.SPEC);
    }


    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }


    @EventBusSubscriber(modid = MODID, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            ItemBlockRenderTypes.setRenderLayer(NWFluids.FLOWING_ULTRASALINE_WATER.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(NWFluids.SOURCE_ULTRASALINE_WATER.get(), RenderType.translucent());
        }

        @SubscribeEvent
        public static void registerBlockEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
            event.registerBlockEntityRenderer(NWBlockEntities.MEAN_BED_BE.get(), MeanBedRenderer::new);
        }

        @SubscribeEvent
        public static void registerFluidExtensions(RegisterClientExtensionsEvent event){

            NWBaseFluidTypes ultrasaline_water = NWFluidTypes.ULTRASALINE_WATER_TYPE.get();

            event.registerFluidType(new IClientFluidTypeExtensions() {
                @Override
                public ResourceLocation getStillTexture() {
                    return ultrasaline_water.getStillTexture();
                }

                @Override
                public ResourceLocation getFlowingTexture() {
                    return ultrasaline_water.getFlowingTexture();
                }

                @Override
                public int getTintColor() {
                    return ultrasaline_water.getTintColor();
                }

                @Override
                public Vector3f modifyFogColor(Camera camera, float partialTick, ClientLevel level, int renderDistance, float darkenWorldAmount, Vector3f fluidFogColor) {
                    return ultrasaline_water.getFogColor();
                }

                @Override
                public void modifyFogRender(Camera camera, FogRenderer.FogMode mode, float renderDistance, float partialTick, float nearDistance, float farDistance, FogShape shape) {
                    RenderSystem.setShaderFogStart(3f);
                    RenderSystem.setShaderFogEnd(12f);
                }
            }, ultrasaline_water);
        }
    }
}
