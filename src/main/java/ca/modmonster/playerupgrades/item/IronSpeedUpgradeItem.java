
package ca.modmonster.playerupgrades.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import ca.modmonster.playerupgrades.init.PlayerupgradesModTabs;

public class IronSpeedUpgradeItem extends Item {
	public IronSpeedUpgradeItem() {
		super(new Item.Properties().tab(PlayerupgradesModTabs.TAB_PLAYER_UPGRADES_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}
}
