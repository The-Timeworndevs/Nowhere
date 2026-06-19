package net.tws.nowhere.common.menus;

import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.CraftingMenu;
import net.tws.nowhere.common.NWBlocks;

public class ParchedCraftingMenu extends CraftingMenu {

    public ParchedCraftingMenu(int containerId, Inventory playerInventory) {
        super(containerId, playerInventory);
    }


}
