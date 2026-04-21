
package ca.modmonster.playerupgrades.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import ca.modmonster.playerupgrades.itemgroup.PlayerUpgradesTabItemGroup;
import ca.modmonster.playerupgrades.PlayerupgradesModElements;

@PlayerupgradesModElements.ModElement.Tag
public class IronSpeedUpgradeItem extends PlayerupgradesModElements.ModElement {
	@ObjectHolder("playerupgrades:iron_speed_upgrade")
	public static final Item block = null;
	public IronSpeedUpgradeItem(PlayerupgradesModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(PlayerUpgradesTabItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("iron_speed_upgrade");
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
