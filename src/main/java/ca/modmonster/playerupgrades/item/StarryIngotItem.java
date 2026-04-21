
package ca.modmonster.playerupgrades.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import ca.modmonster.playerupgrades.init.PlayerupgradesModTabs;

public class StarryIngotItem extends Item {
	public StarryIngotItem() {
		super(new Item.Properties().tab(PlayerupgradesModTabs.TAB_PLAYER_UPGRADES_TAB).stacksTo(64).rarity(Rarity.RARE));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
