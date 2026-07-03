package net.tws.nowhere;

import net.tws.nowhere.common.*;
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

        NeoForge.EVENT_BUS.register(this);

        //modContainer.registerConfig(ModConfig.Type.COMMON, NWConfig.SPEC);
    }


    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }

    /*
    @EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
    */
}
