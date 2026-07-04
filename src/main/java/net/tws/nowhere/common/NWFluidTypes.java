package net.tws.nowhere.common;

import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.tws.nowhere.Nowhere;
import org.joml.Vector3f;

public class NWFluidTypes {

    public static final ResourceLocation STILL_ULTRASALINE_WATER_LOCATION = ResourceLocation.fromNamespaceAndPath(Nowhere.MODID, "block/ultrasaline_water_still");
    public static final ResourceLocation FLOWING_ULTRASALINE_WATER_LOCATION = ResourceLocation.fromNamespaceAndPath(Nowhere.MODID, "block/ultrasaline_water_flowing");

    public static final DeferredRegister<FluidType> FLUID_TYPES = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, Nowhere.MODID);

    public static final DeferredHolder<FluidType, NWBaseFluidTypes> ULTRASALINE_WATER_TYPE = FLUID_TYPES.register("ultrasaline_water", () -> new NWBaseFluidTypes(
            STILL_ULTRASALINE_WATER_LOCATION,
            FLOWING_ULTRASALINE_WATER_LOCATION,
            0xffbc9f7f ,
            new Vector3f(163f / 255f, 135f/ 255f, 104f / 255f ),
            FluidType.Properties.create().canSwim(true).canDrown(true).density(3000).viscosity(6000).canConvertToSource(true)
    ));

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}
