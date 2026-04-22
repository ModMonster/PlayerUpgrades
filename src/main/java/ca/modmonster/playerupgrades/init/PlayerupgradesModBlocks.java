/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ca.modmonster.playerupgrades.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import java.util.function.Function;

import ca.modmonster.playerupgrades.block.PlayerUpgraderBlock;
import ca.modmonster.playerupgrades.PlayerupgradesMod;

public class PlayerupgradesModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(PlayerupgradesMod.MODID);
	public static final DeferredBlock<Block> PLAYER_UPGRADER;
	static {
		PLAYER_UPGRADER = register("player_upgrader", PlayerUpgraderBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}