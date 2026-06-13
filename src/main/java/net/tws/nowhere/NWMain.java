package net.tws.nowhere;

import net.tws.nowhere.common.NWBlockRegistry;
import net.tws.nowhere.common.NWGroupRegistry;
import net.tws.nowhere.common.NWItemRegistry;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;


@Mod(NWMain.MODID)
public class NWMain {

    public static final String MODID = "nowhere";

    private static final Logger LOGGER = LogUtils.getLogger();

    public NWMain(IEventBus modEventBus, ModContainer modContainer) {

        NWBlockRegistry.BLOCK_REGISTRIES.register(modEventBus);

        NWItemRegistry.ITEM_REGISTRIES.register(modEventBus);

        NWGroupRegistry.GROUP_REGISTRIES.register(modEventBus);

        NeoForge.EVENT_BUS.register(this);

        modContainer.registerConfig(ModConfig.Type.COMMON, NWConfig.SPEC);
    }


    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }


    @EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
