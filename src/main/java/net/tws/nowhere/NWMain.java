package net.tws.nowhere;

import net.tws.nowhere.common.NWBlocks;
import net.tws.nowhere.common.NWItems;
import net.tws.nowhere.common.NWTabs;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;


@Mod(NWMain.MODID)
public class NWMain {

    public static final String MODID = "nowhere";

    private static final Logger LOGGER = LogUtils.getLogger();

    public NWMain(IEventBus modEventBus, ModContainer modContainer) {

        NWBlocks.BLOCKS.register(modEventBus);

        NWBlocks.setupBlockEntities();

        NWItems.ITEM_REGISTRIES.register(modEventBus);

        NWTabs.GROUP_REGISTRIES.register(modEventBus);

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
