package net.tws.nowhere.common.items;


import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;
import net.tws.nowhere.common.tags.NWItemTags;

public class NWToolTiers {

    public static final Tier PARCHED_WOODEN = new SimpleTier(BlockTags.INCORRECT_FOR_WOODEN_TOOL,90, 2.0F, 0.0F, 15, () -> Ingredient.of(NWItemTags.PARCHED_WOODS));
    public static final Tier SCRAP = new SimpleTier(BlockTags.INCORRECT_FOR_STONE_TOOL,200, 4.0F, 1.0F, 5, () -> Ingredient.of(NWItemTags.FERROUS_SCRAP));
    public static final Tier FERROUS_ALLOY = new SimpleTier(BlockTags.INCORRECT_FOR_IRON_TOOL,300, 6.0F, 2.0F, 14, () -> Ingredient.of(NWItemTags.FERROUS_ALLOY));

}
