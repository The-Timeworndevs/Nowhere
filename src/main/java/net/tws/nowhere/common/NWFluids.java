package net.tws.nowhere.common;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tws.nowhere.Nowhere;

public class NWFluids {

    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(Registries.FLUID, Nowhere.MODID);

    public static final DeferredHolder<Fluid, BaseFlowingFluid.Source> SOURCE_ULTRASALINE_WATER = FLUIDS.register("source_ultrasaline_water", ()-> new BaseFlowingFluid.Source(NWFluids.ULTRASALINE_WATER_PROPERTIES));
    public static final DeferredHolder<Fluid, BaseFlowingFluid.Flowing> FLOWING_ULTRASALINE_WATER = FLUIDS.register("flowing_ultrasaline_water", ()-> new BaseFlowingFluid.Flowing(NWFluids.ULTRASALINE_WATER_PROPERTIES));

    public static final BaseFlowingFluid.Properties ULTRASALINE_WATER_PROPERTIES = new BaseFlowingFluid.Properties(NWFluidTypes.ULTRASALINE_WATER_TYPE, SOURCE_ULTRASALINE_WATER, FLOWING_ULTRASALINE_WATER).slopeFindDistance(1).levelDecreasePerBlock(1).block(NWBlocks.ULTRASALINE_WATER);

    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }

}
