package net.tws.nowhere.common.blocks;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Fluids;

public class NWFluids extends Fluids {



    private static <T extends Fluid> T register(String key, T fluid) {
        return (T)(Registry.register(BuiltInRegistries.FLUID, key, fluid));
    }
}
