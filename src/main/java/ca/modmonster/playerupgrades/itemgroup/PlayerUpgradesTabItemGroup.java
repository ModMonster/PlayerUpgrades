
package ca.modmonster.playerupgrades.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import ca.modmonster.playerupgrades.block.PlayerUpgraderBlock;
import ca.modmonster.playerupgrades.PlayerupgradesModElements;

@PlayerupgradesModElements.ModElement.Tag
public class PlayerUpgradesTabItemGroup extends PlayerupgradesModElements.ModElement {
	public PlayerUpgradesTabItemGroup(PlayerupgradesModElements instance) {
		super(instance, 20);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabplayer_upgrades_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(PlayerUpgraderBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
