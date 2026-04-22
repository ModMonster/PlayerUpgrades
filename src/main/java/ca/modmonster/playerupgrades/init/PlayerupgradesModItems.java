/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ca.modmonster.playerupgrades.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import ca.modmonster.playerupgrades.item.*;
import ca.modmonster.playerupgrades.PlayerupgradesMod;

public class PlayerupgradesModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(PlayerupgradesMod.MODID);
	public static final DeferredItem<Item> PLAYER_UPGRADER;
	public static final DeferredItem<Item> IRON_HEALTH_UPGRADE;
	public static final DeferredItem<Item> IRON_CASE;
	public static final DeferredItem<Item> IRON_SPEED_UPGRADE;
	public static final DeferredItem<Item> IRON_HASTE_UPGRADE;
	public static final DeferredItem<Item> IRON_STRENGTH_UPGRADE;
	public static final DeferredItem<Item> IRON_JUMP_BOOST_UPGRADE;
	public static final DeferredItem<Item> DIAMOND_CASE;
	public static final DeferredItem<Item> DIAMOND_HEALTH_UPGRADE;
	public static final DeferredItem<Item> DIAMOND_SPEED_UPGRADE;
	public static final DeferredItem<Item> DIAMOND_HASTE_UPGRADE;
	public static final DeferredItem<Item> DIAMOND_STRENGTH_UPGRADE;
	public static final DeferredItem<Item> DIAMOND_JUMP_BOOST_UPGRADE;
	public static final DeferredItem<Item> NETHER_CASE;
	public static final DeferredItem<Item> FLY_UPGRADE;
	public static final DeferredItem<Item> FIRE_RESISTANCE_UPGRADE;
	public static final DeferredItem<Item> WATER_BREATHING_UPGRADE;
	public static final DeferredItem<Item> STARRY_INGOT;
	static {
		PLAYER_UPGRADER = block(PlayerupgradesModBlocks.PLAYER_UPGRADER);
		IRON_HEALTH_UPGRADE = REGISTRY.register("iron_health_upgrade", IronHealthUpgradeItem::new);
		IRON_CASE = REGISTRY.register("iron_case", IronCaseItem::new);
		IRON_SPEED_UPGRADE = REGISTRY.register("iron_speed_upgrade", IronSpeedUpgradeItem::new);
		IRON_HASTE_UPGRADE = REGISTRY.register("iron_haste_upgrade", IronHasteUpgradeItem::new);
		IRON_STRENGTH_UPGRADE = REGISTRY.register("iron_strength_upgrade", IronStrengthUpgradeItem::new);
		IRON_JUMP_BOOST_UPGRADE = REGISTRY.register("iron_jump_boost_upgrade", IronJumpBoostUpgradeItem::new);
		DIAMOND_CASE = REGISTRY.register("diamond_case", DiamondCaseItem::new);
		DIAMOND_HEALTH_UPGRADE = REGISTRY.register("diamond_health_upgrade", DiamondHealthUpgradeItem::new);
		DIAMOND_SPEED_UPGRADE = REGISTRY.register("diamond_speed_upgrade", DiamondSpeedUpgradeItem::new);
		DIAMOND_HASTE_UPGRADE = REGISTRY.register("diamond_haste_upgrade", DiamondHasteUpgradeItem::new);
		DIAMOND_STRENGTH_UPGRADE = REGISTRY.register("diamond_strength_upgrade", DiamondStrengthUpgradeItem::new);
		DIAMOND_JUMP_BOOST_UPGRADE = REGISTRY.register("diamond_jump_boost_upgrade", DiamondJumpBoostUpgradeItem::new);
		NETHER_CASE = REGISTRY.register("nether_case", NetherCaseItem::new);
		FLY_UPGRADE = REGISTRY.register("fly_upgrade", FlyUpgradeItem::new);
		FIRE_RESISTANCE_UPGRADE = REGISTRY.register("fire_resistance_upgrade", FireResistanceUpgradeItem::new);
		WATER_BREATHING_UPGRADE = REGISTRY.register("water_breathing_upgrade", WaterBreathingUpgradeItem::new);
		STARRY_INGOT = REGISTRY.register("starry_ingot", StarryIngotItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}