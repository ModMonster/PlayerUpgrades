
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ca.modmonster.playerupgrades.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import ca.modmonster.playerupgrades.PlayerupgradesMod;

public class PlayerupgradesModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PlayerupgradesMod.MODID);
	public static final RegistryObject<CreativeModeTab> PLAYER_UPGRADES_TAB = REGISTRY.register("player_upgrades_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.playerupgrades.player_upgrades_tab")).icon(() -> new ItemStack(PlayerupgradesModBlocks.PLAYER_UPGRADER.get())).displayItems((parameters, tabData) -> {
				tabData.accept(PlayerupgradesModBlocks.PLAYER_UPGRADER.get().asItem());
				tabData.accept(PlayerupgradesModItems.IRON_HEALTH_UPGRADE.get());
				tabData.accept(PlayerupgradesModItems.IRON_CASE.get());
				tabData.accept(PlayerupgradesModItems.IRON_SPEED_UPGRADE.get());
				tabData.accept(PlayerupgradesModItems.IRON_HASTE_UPGRADE.get());
				tabData.accept(PlayerupgradesModItems.IRON_STRENGTH_UPGRADE.get());
				tabData.accept(PlayerupgradesModItems.IRON_JUMP_BOOST_UPGRADE.get());
				tabData.accept(PlayerupgradesModItems.DIAMOND_CASE.get());
				tabData.accept(PlayerupgradesModItems.DIAMOND_HEALTH_UPGRADE.get());
				tabData.accept(PlayerupgradesModItems.DIAMOND_SPEED_UPGRADE.get());
				tabData.accept(PlayerupgradesModItems.DIAMOND_HASTE_UPGRADE.get());
				tabData.accept(PlayerupgradesModItems.DIAMOND_STRENGTH_UPGRADE.get());
				tabData.accept(PlayerupgradesModItems.DIAMOND_JUMP_BOOST_UPGRADE.get());
				tabData.accept(PlayerupgradesModItems.NETHER_CASE.get());
				tabData.accept(PlayerupgradesModItems.FLY_UPGRADE.get());
				tabData.accept(PlayerupgradesModItems.FIRE_RESISTANCE_UPGRADE.get());
				tabData.accept(PlayerupgradesModItems.WATER_BREATHING_UPGRADE.get());
				tabData.accept(PlayerupgradesModItems.STARRY_INGOT.get());
			}).build());
}
