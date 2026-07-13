package net.tws.nowhere.common.items;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.inventory.CraftingMenu;
import net.minecraft.world.item.ToolMaterial;
import net.tws.nowhere.common.blocks.tags.NWItemTags;

public class NWToolMaterials {

    public static final ToolMaterial PARCHED_WOODEN = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 90, 2.0F, 0.0F, 15, NWItemTags.PARCHED_WOODS);
    public static final ToolMaterial FERROUS_SCRAP = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, 200, 4.0F, 1.0F, 5, NWItemTags.FERROUS_SCRAP);
    public static final ToolMaterial FERROUS_ALLOY = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 300, 6.0F, 2.0F, 14, NWItemTags.FERROUS_ALLOY);

}
