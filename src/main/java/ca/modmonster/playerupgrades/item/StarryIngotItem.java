package ca.modmonster.playerupgrades.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemUseAnimation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class StarryIngotItem extends Item {
	public StarryIngotItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE));
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