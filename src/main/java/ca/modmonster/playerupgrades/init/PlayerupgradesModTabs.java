
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ca.modmonster.playerupgrades.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class PlayerupgradesModTabs {
	public static CreativeModeTab TAB_PLAYER_UPGRADES_TAB;

	public static void load() {
		TAB_PLAYER_UPGRADES_TAB = new CreativeModeTab("tabplayer_upgrades_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PlayerupgradesModBlocks.PLAYER_UPGRADER.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
