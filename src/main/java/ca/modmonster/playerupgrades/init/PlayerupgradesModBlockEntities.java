
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ca.modmonster.playerupgrades.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import ca.modmonster.playerupgrades.block.entity.PlayerUpgraderBlockEntity;
import ca.modmonster.playerupgrades.PlayerupgradesMod;

public class PlayerupgradesModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, PlayerupgradesMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> PLAYER_UPGRADER = register("player_upgrader", PlayerupgradesModBlocks.PLAYER_UPGRADER, PlayerUpgraderBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
