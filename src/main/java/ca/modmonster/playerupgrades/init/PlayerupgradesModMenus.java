
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package ca.modmonster.playerupgrades.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import ca.modmonster.playerupgrades.world.inventory.PlayerUpgraderGuiMenu;
import ca.modmonster.playerupgrades.PlayerupgradesMod;

public class PlayerupgradesModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, PlayerupgradesMod.MODID);
	public static final RegistryObject<MenuType<PlayerUpgraderGuiMenu>> PLAYER_UPGRADER_GUI = REGISTRY.register("player_upgrader_gui", () -> IForgeMenuType.create(PlayerUpgraderGuiMenu::new));
}
