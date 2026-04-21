
package com.modmonster.playerupgrades.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import com.modmonster.playerupgrades.itemgroup.PlayerUpgradesTabItemGroup;
import com.modmonster.playerupgrades.PlayerupgradesModElements;

@PlayerupgradesModElements.ModElement.Tag
public class IronStrengthUpgradeItem extends PlayerupgradesModElements.ModElement {
	@ObjectHolder("playerupgrades:iron_strength_upgrade")
	public static final Item block = null;
	public IronStrengthUpgradeItem(PlayerupgradesModElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(PlayerUpgradesTabItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("iron_strength_upgrade");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
