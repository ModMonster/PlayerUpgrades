
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ca.modmonster.playerupgrades.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import ca.modmonster.playerupgrades.block.PlayerUpgraderBlock;
import ca.modmonster.playerupgrades.PlayerupgradesMod;

public class PlayerupgradesModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, PlayerupgradesMod.MODID);
	public static final RegistryObject<Block> PLAYER_UPGRADER = REGISTRY.register("player_upgrader", () -> new PlayerUpgraderBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
