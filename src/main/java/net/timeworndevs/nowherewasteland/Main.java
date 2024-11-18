package net.timeworndevs.nowherewasteland;

import net.timeworndevs.nowherewasteland.common.BlockRegistry;
import net.timeworndevs.nowherewasteland.common.ItemRegistry;
import net.timeworndevs.nowherewasteland.common.TabRegistry;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.client.Minecraft;
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

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(Main.MODID)
public class Main
{

    public static final String MODID = "nowherewasteland";

    private static final Logger LOGGER = LogUtils.getLogger();







    //public static final DeferredItem<Item> EXAMPLE_ITEM = ITEMS.registerSimpleItem("example_item", new Item.Properties());

    // Creates a creative tab with the id "examplemod:example_tab" for the example item, that is placed after the combat tab



    public Main(IEventBus modEventBus, ModContainer modContainer)
    {


        BlockRegistry.BLOCK_REGISTRIES.register(modEventBus);
        ItemRegistry.ITEM_REGISTRIES.register(modEventBus);


        TabRegistry.CREATIVE_MODE_TABS.register(modEventBus);


         NeoForge.EVENT_BUS.register(this);

        //modEventBus.addListener(this::addCreative);

        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }


    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
