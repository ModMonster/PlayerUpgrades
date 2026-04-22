package ca.modmonster.playerupgrades.item;

import net.minecraft.world.item.ItemUseAnimation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class NetherCaseItem extends Item {
	public NetherCaseItem(Item.Properties properties) {
		super(properties);
	}

	@Override
	public ItemUseAnimation getUseAnimation(ItemStack itemstack) {
		return ItemUseAnimation.EAT;
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}