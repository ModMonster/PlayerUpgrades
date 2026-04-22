package ca.modmonster.playerupgrades.item;

import net.minecraft.world.item.ItemUseAnimation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class IronStrengthUpgradeItem extends Item {
	public IronStrengthUpgradeItem(Item.Properties properties) {
		super(properties);
	}

	@Override
	public ItemUseAnimation getUseAnimation(ItemStack itemstack) {
		return ItemUseAnimation.EAT;
	}
}