
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ca.modmonster.playerupgrades.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import ca.modmonster.playerupgrades.item.WaterBreathingUpgradeItem;
import ca.modmonster.playerupgrades.item.StarryIngotItem;
import ca.modmonster.playerupgrades.item.NetherCaseItem;
import ca.modmonster.playerupgrades.item.IronStrengthUpgradeItem;
import ca.modmonster.playerupgrades.item.IronSpeedUpgradeItem;
import ca.modmonster.playerupgrades.item.IronJumpBoostUpgradeItem;
import ca.modmonster.playerupgrades.item.IronHealthUpgradeItem;
import ca.modmonster.playerupgrades.item.IronHasteUpgradeItem;
import ca.modmonster.playerupgrades.item.IronCaseItem;
import ca.modmonster.playerupgrades.item.FlyUpgradeItem;
import ca.modmonster.playerupgrades.item.FireResistanceUpgradeItem;
import ca.modmonster.playerupgrades.item.DiamondStrengthUpgradeItem;
import ca.modmonster.playerupgrades.item.DiamondSpeedUpgradeItem;
import ca.modmonster.playerupgrades.item.DiamondJumpBoostUpgradeItem;
import ca.modmonster.playerupgrades.item.DiamondHealthUpgradeItem;
import ca.modmonster.playerupgrades.item.DiamondHasteUpgradeItem;
import ca.modmonster.playerupgrades.item.DiamondCaseItem;
import ca.modmonster.playerupgrades.PlayerupgradesMod;

public class PlayerupgradesModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PlayerupgradesMod.MODID);
	public static final RegistryObject<Item> PLAYER_UPGRADER = block(PlayerupgradesModBlocks.PLAYER_UPGRADER, PlayerupgradesModTabs.TAB_PLAYER_UPGRADES_TAB);
	public static final RegistryObject<Item> IRON_CASE = REGISTRY.register("iron_case", () -> new IronCaseItem());
	public static final RegistryObject<Item> IRON_HEALTH_UPGRADE = REGISTRY.register("iron_health_upgrade", () -> new IronHealthUpgradeItem());
	public static final RegistryObject<Item> IRON_SPEED_UPGRADE = REGISTRY.register("iron_speed_upgrade", () -> new IronSpeedUpgradeItem());
	public static final RegistryObject<Item> IRON_HASTE_UPGRADE = REGISTRY.register("iron_haste_upgrade", () -> new IronHasteUpgradeItem());
	public static final RegistryObject<Item> IRON_STRENGTH_UPGRADE = REGISTRY.register("iron_strength_upgrade", () -> new IronStrengthUpgradeItem());
	public static final RegistryObject<Item> IRON_JUMP_BOOST_UPGRADE = REGISTRY.register("iron_jump_boost_upgrade", () -> new IronJumpBoostUpgradeItem());
	public static final RegistryObject<Item> DIAMOND_CASE = REGISTRY.register("diamond_case", () -> new DiamondCaseItem());
	public static final RegistryObject<Item> DIAMOND_HEALTH_UPGRADE = REGISTRY.register("diamond_health_upgrade", () -> new DiamondHealthUpgradeItem());
	public static final RegistryObject<Item> DIAMOND_SPEED_UPGRADE = REGISTRY.register("diamond_speed_upgrade", () -> new DiamondSpeedUpgradeItem());
	public static final RegistryObject<Item> DIAMOND_HASTE_UPGRADE = REGISTRY.register("diamond_haste_upgrade", () -> new DiamondHasteUpgradeItem());
	public static final RegistryObject<Item> DIAMOND_STRENGTH_UPGRADE = REGISTRY.register("diamond_strength_upgrade", () -> new DiamondStrengthUpgradeItem());
	public static final RegistryObject<Item> DIAMOND_JUMP_BOOST_UPGRADE = REGISTRY.register("diamond_jump_boost_upgrade", () -> new DiamondJumpBoostUpgradeItem());
	public static final RegistryObject<Item> NETHER_CASE = REGISTRY.register("nether_case", () -> new NetherCaseItem());
	public static final RegistryObject<Item> FLY_UPGRADE = REGISTRY.register("fly_upgrade", () -> new FlyUpgradeItem());
	public static final RegistryObject<Item> FIRE_RESISTANCE_UPGRADE = REGISTRY.register("fire_resistance_upgrade", () -> new FireResistanceUpgradeItem());
	public static final RegistryObject<Item> WATER_BREATHING_UPGRADE = REGISTRY.register("water_breathing_upgrade", () -> new WaterBreathingUpgradeItem());
	public static final RegistryObject<Item> STARRY_INGOT = REGISTRY.register("starry_ingot", () -> new StarryIngotItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
