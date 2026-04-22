/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ca.modmonster.playerupgrades.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.items.wrapper.SidedInvWrapper;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import ca.modmonster.playerupgrades.block.entity.PlayerUpgraderBlockEntity;
import ca.modmonster.playerupgrades.PlayerupgradesMod;

@EventBusSubscriber
public class PlayerupgradesModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, PlayerupgradesMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<PlayerUpgraderBlockEntity>> PLAYER_UPGRADER = register("player_upgrader", PlayerupgradesModBlocks.PLAYER_UPGRADER, PlayerUpgraderBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static <T extends BlockEntity> DeferredHolder<BlockEntityType<?>, BlockEntityType<T>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<T> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, PLAYER_UPGRADER.get(), SidedInvWrapper::new);
	}
}