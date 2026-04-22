package ca.modmonster.playerupgrades.procedures;

import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.common.extensions.ILevelExtension;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.AdvancementHolder;

import ca.modmonster.playerupgrades.network.PlayerupgradesModVariables;
import ca.modmonster.playerupgrades.init.PlayerupgradesModItems;

public class ApplyUpgradesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player) {
			_player.getAbilities().mayfly = false;
			_player.onUpdateAbilities();
		}
		if (entity instanceof LivingEntity _entity)
			_entity.removeAllEffects();
		if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).getItem() == PlayerupgradesModItems.IRON_HEALTH_UPGRADE.get()) {
			PlayerupgradesModVariables.MapVariables.get(world).healthCount = PlayerupgradesModVariables.MapVariables.get(world).healthCount + 1;
			PlayerupgradesModVariables.MapVariables.get(world).markSyncDirty();
		} else if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).getItem() == PlayerupgradesModItems.DIAMOND_HEALTH_UPGRADE.get()) {
			if (entity instanceof ServerPlayer _player) {
				AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("playerupgrades:diamond_upgrade_apply_advancement"));
				if (_adv != null) {
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
			PlayerupgradesModVariables.MapVariables.get(world).healthCount = PlayerupgradesModVariables.MapVariables.get(world).healthCount + 2;
			PlayerupgradesModVariables.MapVariables.get(world).markSyncDirty();
		}
		if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).copy()).getItem() == PlayerupgradesModItems.IRON_HEALTH_UPGRADE.get()) {
			PlayerupgradesModVariables.MapVariables.get(world).healthCount = PlayerupgradesModVariables.MapVariables.get(world).healthCount + 1;
			PlayerupgradesModVariables.MapVariables.get(world).markSyncDirty();
		} else if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).copy()).getItem() == PlayerupgradesModItems.DIAMOND_HEALTH_UPGRADE.get()) {
			if (entity instanceof ServerPlayer _player) {
				AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("playerupgrades:diamond_upgrade_apply_advancement"));
				if (_adv != null) {
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
			PlayerupgradesModVariables.MapVariables.get(world).healthCount = PlayerupgradesModVariables.MapVariables.get(world).healthCount + 2;
			PlayerupgradesModVariables.MapVariables.get(world).markSyncDirty();
		}
		if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 2).copy()).getItem() == PlayerupgradesModItems.IRON_HEALTH_UPGRADE.get()) {
			PlayerupgradesModVariables.MapVariables.get(world).healthCount = PlayerupgradesModVariables.MapVariables.get(world).healthCount + 1;
			PlayerupgradesModVariables.MapVariables.get(world).markSyncDirty();
		} else if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 2).copy()).getItem() == PlayerupgradesModItems.DIAMOND_HEALTH_UPGRADE.get()) {
			if (entity instanceof ServerPlayer _player) {
				AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("playerupgrades:diamond_upgrade_apply_advancement"));
				if (_adv != null) {
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
			PlayerupgradesModVariables.MapVariables.get(world).healthCount = PlayerupgradesModVariables.MapVariables.get(world).healthCount + 2;
			PlayerupgradesModVariables.MapVariables.get(world).markSyncDirty();
		}
		if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 3).copy()).getItem() == PlayerupgradesModItems.IRON_HEALTH_UPGRADE.get()) {
			PlayerupgradesModVariables.MapVariables.get(world).healthCount = PlayerupgradesModVariables.MapVariables.get(world).healthCount + 1;
			PlayerupgradesModVariables.MapVariables.get(world).markSyncDirty();
		} else if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 3).copy()).getItem() == PlayerupgradesModItems.DIAMOND_HEALTH_UPGRADE.get()) {
			if (entity instanceof ServerPlayer _player) {
				AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("playerupgrades:diamond_upgrade_apply_advancement"));
				if (_adv != null) {
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
			PlayerupgradesModVariables.MapVariables.get(world).healthCount = PlayerupgradesModVariables.MapVariables.get(world).healthCount + 2;
			PlayerupgradesModVariables.MapVariables.get(world).markSyncDirty();
		}
		if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 4).copy()).getItem() == PlayerupgradesModItems.IRON_HEALTH_UPGRADE.get()) {
			PlayerupgradesModVariables.MapVariables.get(world).healthCount = PlayerupgradesModVariables.MapVariables.get(world).healthCount + 1;
			PlayerupgradesModVariables.MapVariables.get(world).markSyncDirty();
		} else if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 4).copy()).getItem() == PlayerupgradesModItems.DIAMOND_HEALTH_UPGRADE.get()) {
			if (entity instanceof ServerPlayer _player) {
				AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("playerupgrades:diamond_upgrade_apply_advancement"));
				if (_adv != null) {
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
			PlayerupgradesModVariables.MapVariables.get(world).healthCount = PlayerupgradesModVariables.MapVariables.get(world).healthCount + 2;
			PlayerupgradesModVariables.MapVariables.get(world).markSyncDirty();
		}
		if (PlayerupgradesModVariables.MapVariables.get(world).healthCount > 0) {
			if (entity instanceof ServerPlayer _player) {
				AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("playerupgrades:upgrade_applied_advancement"));
				if (_adv != null) {
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 1000000, (int) (PlayerupgradesModVariables.MapVariables.get(world).healthCount - 1), true, false));
		}
		PlayerupgradesModVariables.MapVariables.get(world).healthCount = 0;
		PlayerupgradesModVariables.MapVariables.get(world).markSyncDirty();
		if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).getItem() == PlayerupgradesModItems.IRON_SPEED_UPGRADE.get()) {
			PlayerupgradesModVariables.MapVariables.get(world).speedCount = PlayerupgradesModVariables.MapVariables.get(world).speedCount + 1;
			PlayerupgradesModVariables.MapVariables.get(world).markSyncDirty();
		} else if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).getItem() == PlayerupgradesModItems.DIAMOND_SPEED_UPGRADE.get()) {
			if (entity instanceof ServerPlayer _player) {
				AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("playerupgrades:diamond_upgrade_apply_advancement"));
				if (_adv != null) {
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
			PlayerupgradesModVariables.MapVariables.get(world).speedCount = PlayerupgradesModVariables.MapVariables.get(world).speedCount + 2;
			PlayerupgradesModVariables.MapVariables.get(world).markSyncDirty();
		}
		if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).copy()).getItem() == PlayerupgradesModItems.IRON_SPEED_UPGRADE.get()) {
			PlayerupgradesModVariables.MapVariables.get(world).speedCount = PlayerupgradesModVariables.MapVariables.get(world).speedCount + 1;
			PlayerupgradesModVariables.MapVariables.get(world).markSyncDirty();
		} else if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).copy()).getItem() == PlayerupgradesModItems.DIAMOND_SPEED_UPGRADE.get()) {
			if (entity instanceof ServerPlayer _player) {
				AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("playerupgrades:diamond_upgrade_apply_advancement"));
				if (_adv != null) {
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
			PlayerupgradesModVariables.MapVariables.get(world).speedCount = PlayerupgradesModVariables.MapVariables.get(world).speedCount + 2;
			PlayerupgradesModVariables.MapVariables.get(world).markSyncDirty();
		}
		if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 2).copy()).getItem() == PlayerupgradesModItems.IRON_SPEED_UPGRADE.get()) {
			PlayerupgradesModVariables.MapVariables.get(world).speedCount = PlayerupgradesModVariables.MapVariables.get(world).speedCount + 1;
			PlayerupgradesModVariables.MapVariables.get(world).markSyncDirty();
		} else if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 2).copy()).getItem() == PlayerupgradesModItems.DIAMOND_SPEED_UPGRADE.get()) {
			if (entity instanceof ServerPlayer _player) {
				AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("playerupgrades:diamond_upgrade_apply_advancement"));
				if (_adv != null) {
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
			PlayerupgradesModVariables.MapVariables.get(world).speedCount = PlayerupgradesModVariables.MapVariables.get(world).speedCount + 2;
			PlayerupgradesModVariables.MapVariables.get(world).markSyncDirty();
		}
		if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 3).copy()).getItem() == PlayerupgradesModItems.IRON_SPEED_UPGRADE.get()) {
			PlayerupgradesModVariables.MapVariables.get(world).speedCount = PlayerupgradesModVariables.MapVariables.get(world).speedCount + 1;
			PlayerupgradesModVariables.MapVariables.get(world).markSyncDirty();
		} else if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 3).copy()).getItem() == PlayerupgradesModItems.DIAMOND_SPEED_UPGRADE.get()) {
			if (entity instanceof ServerPlayer _player) {
				AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("playerupgrades:diamond_upgrade_apply_advancement"));
				if (_adv != null) {
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
			PlayerupgradesModVariables.MapVariables.get(world).speedCount = PlayerupgradesModVariables.MapVariables.get(world).speedCount + 2;
			PlayerupgradesModVariables.MapVariables.get(world).markSyncDirty();
		}
		if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 4).copy()).getItem() == PlayerupgradesModItems.IRON_SPEED_UPGRADE.get()) {
			PlayerupgradesModVariables.MapVariables.get(world).speedCount = PlayerupgradesModVariables.MapVariables.get(world).speedCount + 1;
			PlayerupgradesModVariables.MapVariables.get(world).markSyncDirty();
		} else if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 4).copy()).getItem() == PlayerupgradesModItems.DIAMOND_SPEED_UPGRADE.get()) {
			if (entity instanceof ServerPlayer _player) {
				AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("playerupgrades:diamond_upgrade_apply_advancement"));
				if (_adv != null) {
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
			PlayerupgradesModVariables.MapVariables.get(world).speedCount = PlayerupgradesModVariables.MapVariables.get(world).speedCount + 2;
			PlayerupgradesModVariables.MapVariables.get(world).markSyncDirty();
		}
		if (PlayerupgradesModVariables.MapVariables.get(world).speedCount > 0) {
			if (entity instanceof ServerPlayer _player) {
				AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("playerupgrades:upgrade_applied_advancement"));
				if (_adv != null) {
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1000000, (int) (PlayerupgradesModVariables.MapVariables.get(world).speedCount - 1), true, false));
		}
		PlayerupgradesModVariables.MapVariables.get(world).speedCount = 0;
		PlayerupgradesModVariables.MapVariables.get(world).markSyncDirty();
		if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).getItem() == PlayerupgradesModItems.IRON_HASTE_UPGRADE.get()) {
			PlayerupgradesModVariables.MapVariables.get(world).hasteCount = PlayerupgradesModVariables.MapVariables.get(world).hasteCount + 1;
			PlayerupgradesModVariables.MapVariables.get(world).markSyncDirty();
		} else if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).getItem() == PlayerupgradesModItems.DIAMOND_HASTE_UPGRADE.get()) {
			if (entity instanceof ServerPlayer _player) {
				AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("playerupgrades:diamond_upgrade_apply_advancement"));
				if (_adv != null) {
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
			PlayerupgradesModVariables.MapVariables.get(world).hasteCount = PlayerupgradesModVariables.MapVariables.get(world).hasteCount + 2;
			PlayerupgradesModVariables.MapVariables.get(world).markSyncDirty();
		}
		if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).copy()).getItem() == PlayerupgradesModItems.IRON_HASTE_UPGRADE.get()) {
			PlayerupgradesModVariables.MapVariables.get(world).hasteCount = PlayerupgradesModVariables.MapVariables.get(world).hasteCount + 1;
			PlayerupgradesModVariables.MapVariables.get(world).markSyncDirty();
		} else if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).copy()).getItem() == PlayerupgradesModItems.DIAMOND_HASTE_UPGRADE.get()) {
			if (entity instanceof ServerPlayer _player) {
				AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("playerupgrades:diamond_upgrade_apply_advancement"));
				if (_adv != null) {
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
			PlayerupgradesModVariables.MapVariables.get(world).hasteCount = PlayerupgradesModVariables.MapVariables.get(world).hasteCount + 2;
			PlayerupgradesModVariables.MapVariables.get(world).markSyncDirty();
		}
		if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 2).copy()).getItem() == PlayerupgradesModItems.IRON_HASTE_UPGRADE.get()) {
			PlayerupgradesModVariables.MapVariables.get(world).hasteCount = PlayerupgradesModVariables.MapVariables.get(world).hasteCount + 1;
			PlayerupgradesModVariables.MapVariables.get(world).markSyncDirty();
		} else if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 2).copy()).getItem() == PlayerupgradesModItems.DIAMOND_HASTE_UPGRADE.get()) {
			if (entity instanceof ServerPlayer _player) {
				AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("playerupgrades:diamond_upgrade_apply_advancement"));
				if (_adv != null) {
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
			PlayerupgradesModVariables.MapVariables.get(world).hasteCount = PlayerupgradesModVariables.MapVariables.get(world).hasteCount + 2;
			PlayerupgradesModVariables.MapVariables.get(world).markSyncDirty();
		}
		if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 3).copy()).getItem() == PlayerupgradesModItems.IRON_HASTE_UPGRADE.get()) {
			PlayerupgradesModVariables.MapVariables.get(world).hasteCount = PlayerupgradesModVariables.MapVariables.get(world).hasteCount + 1;
			PlayerupgradesModVariables.MapVariables.get(world).markSyncDirty();
		} else if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 3).copy()).getItem() == PlayerupgradesModItems.DIAMOND_HASTE_UPGRADE.get()) {
			if (entity instanceof ServerPlayer _player) {
				AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("playerupgrades:diamond_upgrade_apply_advancement"));
				if (_adv != null) {
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
			PlayerupgradesModVariables.MapVariables.get(world).hasteCount = PlayerupgradesModVariables.MapVariables.get(world).hasteCount + 2;
			PlayerupgradesModVariables.MapVariables.get(world).markSyncDirty();
		}
		if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 4).copy()).getItem() == PlayerupgradesModItems.IRON_HASTE_UPGRADE.get()) {
			PlayerupgradesModVariables.MapVariables.get(world).hasteCount = PlayerupgradesModVariables.MapVariables.get(world).hasteCount + 1;
			PlayerupgradesModVariables.MapVariables.get(world).markSyncDirty();
		} else if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 4).copy()).getItem() == PlayerupgradesModItems.DIAMOND_HASTE_UPGRADE.get()) {
			if (entity instanceof ServerPlayer _player) {
				AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("playerupgrades:diamond_upgrade_apply_advancement"));
				if (_adv != null) {
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
			PlayerupgradesModVariables.MapVariables.get(world).hasteCount = PlayerupgradesModVariables.MapVariables.get(world).hasteCount + 2;
			PlayerupgradesModVariables.MapVariables.get(world).markSyncDirty();
		}
		if (PlayerupgradesModVariables.MapVariables.get(world).hasteCount > 0) {
			if (entity instanceof ServerPlayer _player) {
				AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("playerupgrades:upgrade_applied_advancement"));
				if (_adv != null) {
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 1000000, (int) (PlayerupgradesModVariables.MapVariables.get(world).hasteCount - 1), true, false));
		}
		PlayerupgradesModVariables.MapVariables.get(world).hasteCount = 0;
		PlayerupgradesModVariables.MapVariables.get(world).markSyncDirty();
		if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).getItem() == PlayerupgradesModItems.IRON_STRENGTH_UPGRADE.get()) {
			PlayerupgradesModVariables.MapVariables.get(world).strengthCount = PlayerupgradesModVariables.MapVariables.get(world).strengthCount + 1;
			PlayerupgradesModVariables.MapVariables.get(world).markSyncDirty();
		} else if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).getItem() == PlayerupgradesModItems.DIAMOND_STRENGTH_UPGRADE.get()) {
			PlayerupgradesModVariables.MapVariables.get(world).strengthCount = PlayerupgradesModVariables.MapVariables.get(world).strengthCount + 2;
			PlayerupgradesModVariables.MapVariables.get(world).markSyncDirty();
		}
		if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).copy()).getItem() == PlayerupgradesModItems.IRON_STRENGTH_UPGRADE.get()) {
			PlayerupgradesModVariables.MapVariables.get(world).strengthCount = PlayerupgradesModVariables.MapVariables.get(world).strengthCount + 1;
			PlayerupgradesModVariables.MapVariables.get(world).markSyncDirty();
		} else if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).copy()).getItem() == PlayerupgradesModItems.DIAMOND_STRENGTH_UPGRADE.get()) {
			PlayerupgradesModVariables.MapVariables.get(world).strengthCount = PlayerupgradesModVariables.MapVariables.get(world).strengthCount + 2;
			PlayerupgradesModVariables.MapVariables.get(world).markSyncDirty();
		}
		if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 2).copy()).getItem() == PlayerupgradesModItems.IRON_STRENGTH_UPGRADE.get()) {
			PlayerupgradesModVariables.MapVariables.get(world).strengthCount = PlayerupgradesModVariables.MapVariables.get(world).strengthCount + 1;
			PlayerupgradesModVariables.MapVariables.get(world).markSyncDirty();
		} else if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 2).copy()).getItem() == PlayerupgradesModItems.DIAMOND_STRENGTH_UPGRADE.get()) {
			PlayerupgradesModVariables.MapVariables.get(world).strengthCount = PlayerupgradesModVariables.MapVariables.get(world).strengthCount + 2;
			PlayerupgradesModVariables.MapVariables.get(world).markSyncDirty();
		}
		if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 3).copy()).getItem() == PlayerupgradesModItems.IRON_STRENGTH_UPGRADE.get()) {
			PlayerupgradesModVariables.MapVariables.get(world).strengthCount = PlayerupgradesModVariables.MapVariables.get(world).strengthCount + 1;
			PlayerupgradesModVariables.MapVariables.get(world).markSyncDirty();
		} else if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 3).copy()).getItem() == PlayerupgradesModItems.DIAMOND_STRENGTH_UPGRADE.get()) {
			PlayerupgradesModVariables.MapVariables.get(world).strengthCount = PlayerupgradesModVariables.MapVariables.get(world).strengthCount + 2;
			PlayerupgradesModVariables.MapVariables.get(world).markSyncDirty();
		}
		if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 4).copy()).getItem() == PlayerupgradesModItems.IRON_STRENGTH_UPGRADE.get()) {
			PlayerupgradesModVariables.MapVariables.get(world).strengthCount = PlayerupgradesModVariables.MapVariables.get(world).strengthCount + 1;
			PlayerupgradesModVariables.MapVariables.get(world).markSyncDirty();
		} else if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 4).copy()).getItem() == PlayerupgradesModItems.DIAMOND_STRENGTH_UPGRADE.get()) {
			PlayerupgradesModVariables.MapVariables.get(world).strengthCount = PlayerupgradesModVariables.MapVariables.get(world).strengthCount + 2;
			PlayerupgradesModVariables.MapVariables.get(world).markSyncDirty();
		}
		if (PlayerupgradesModVariables.MapVariables.get(world).strengthCount > 0) {
			if (entity instanceof ServerPlayer _player) {
				AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("playerupgrades:upgrade_applied_advancement"));
				if (_adv != null) {
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1000000, (int) (PlayerupgradesModVariables.MapVariables.get(world).strengthCount - 1), true, false));
		}
		PlayerupgradesModVariables.MapVariables.get(world).strengthCount = 0;
		PlayerupgradesModVariables.MapVariables.get(world).markSyncDirty();
		if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).getItem() == PlayerupgradesModItems.IRON_JUMP_BOOST_UPGRADE.get()) {
			PlayerupgradesModVariables.MapVariables.get(world).jumpBoostCount = PlayerupgradesModVariables.MapVariables.get(world).jumpBoostCount + 1;
			PlayerupgradesModVariables.MapVariables.get(world).markSyncDirty();
		} else if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).getItem() == PlayerupgradesModItems.DIAMOND_JUMP_BOOST_UPGRADE.get()) {
			if (entity instanceof ServerPlayer _player) {
				AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("playerupgrades:diamond_upgrade_apply_advancement"));
				if (_adv != null) {
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
			PlayerupgradesModVariables.MapVariables.get(world).jumpBoostCount = PlayerupgradesModVariables.MapVariables.get(world).jumpBoostCount + 2;
			PlayerupgradesModVariables.MapVariables.get(world).markSyncDirty();
		}
		if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).copy()).getItem() == PlayerupgradesModItems.IRON_JUMP_BOOST_UPGRADE.get()) {
			PlayerupgradesModVariables.MapVariables.get(world).jumpBoostCount = PlayerupgradesModVariables.MapVariables.get(world).jumpBoostCount + 1;
			PlayerupgradesModVariables.MapVariables.get(world).markSyncDirty();
		} else if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).copy()).getItem() == PlayerupgradesModItems.DIAMOND_JUMP_BOOST_UPGRADE.get()) {
			if (entity instanceof ServerPlayer _player) {
				AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("playerupgrades:diamond_upgrade_apply_advancement"));
				if (_adv != null) {
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
			PlayerupgradesModVariables.MapVariables.get(world).jumpBoostCount = PlayerupgradesModVariables.MapVariables.get(world).jumpBoostCount + 2;
			PlayerupgradesModVariables.MapVariables.get(world).markSyncDirty();
		}
		if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 2).copy()).getItem() == PlayerupgradesModItems.IRON_JUMP_BOOST_UPGRADE.get()) {
			PlayerupgradesModVariables.MapVariables.get(world).jumpBoostCount = PlayerupgradesModVariables.MapVariables.get(world).jumpBoostCount + 1;
			PlayerupgradesModVariables.MapVariables.get(world).markSyncDirty();
		} else if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 2).copy()).getItem() == PlayerupgradesModItems.DIAMOND_JUMP_BOOST_UPGRADE.get()) {
			if (entity instanceof ServerPlayer _player) {
				AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("playerupgrades:diamond_upgrade_apply_advancement"));
				if (_adv != null) {
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
			PlayerupgradesModVariables.MapVariables.get(world).jumpBoostCount = PlayerupgradesModVariables.MapVariables.get(world).jumpBoostCount + 2;
			PlayerupgradesModVariables.MapVariables.get(world).markSyncDirty();
		}
		if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 3).copy()).getItem() == PlayerupgradesModItems.IRON_JUMP_BOOST_UPGRADE.get()) {
			PlayerupgradesModVariables.MapVariables.get(world).jumpBoostCount = PlayerupgradesModVariables.MapVariables.get(world).jumpBoostCount + 1;
			PlayerupgradesModVariables.MapVariables.get(world).markSyncDirty();
		} else if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 3).copy()).getItem() == PlayerupgradesModItems.DIAMOND_JUMP_BOOST_UPGRADE.get()) {
			if (entity instanceof ServerPlayer _player) {
				AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("playerupgrades:diamond_upgrade_apply_advancement"));
				if (_adv != null) {
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
			PlayerupgradesModVariables.MapVariables.get(world).jumpBoostCount = PlayerupgradesModVariables.MapVariables.get(world).jumpBoostCount + 2;
			PlayerupgradesModVariables.MapVariables.get(world).markSyncDirty();
		}
		if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 4).copy()).getItem() == PlayerupgradesModItems.IRON_JUMP_BOOST_UPGRADE.get()) {
			PlayerupgradesModVariables.MapVariables.get(world).jumpBoostCount = PlayerupgradesModVariables.MapVariables.get(world).jumpBoostCount + 1;
			PlayerupgradesModVariables.MapVariables.get(world).markSyncDirty();
		} else if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 4).copy()).getItem() == PlayerupgradesModItems.DIAMOND_JUMP_BOOST_UPGRADE.get()) {
			if (entity instanceof ServerPlayer _player) {
				AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("playerupgrades:diamond_upgrade_apply_advancement"));
				if (_adv != null) {
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
			PlayerupgradesModVariables.MapVariables.get(world).jumpBoostCount = PlayerupgradesModVariables.MapVariables.get(world).jumpBoostCount + 2;
			PlayerupgradesModVariables.MapVariables.get(world).markSyncDirty();
		}
		if (PlayerupgradesModVariables.MapVariables.get(world).jumpBoostCount > 0) {
			if (entity instanceof ServerPlayer _player) {
				AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("playerupgrades:upgrade_applied_advancement"));
				if (_adv != null) {
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 1000000, (int) (PlayerupgradesModVariables.MapVariables.get(world).jumpBoostCount - 1), true, false));
		}
		PlayerupgradesModVariables.MapVariables.get(world).jumpBoostCount = 0;
		PlayerupgradesModVariables.MapVariables.get(world).markSyncDirty();
		if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).getItem() == PlayerupgradesModItems.FLY_UPGRADE.get()) {
			if (entity instanceof ServerPlayer _player) {
				AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("playerupgrades:fly_apply"));
				if (_adv != null) {
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
			if (entity instanceof Player _player) {
				_player.getAbilities().mayfly = true;
				_player.onUpdateAbilities();
			}
		} else if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).getItem() == PlayerupgradesModItems.FIRE_RESISTANCE_UPGRADE.get()) {
			if (entity instanceof ServerPlayer _player) {
				AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("playerupgrades:fire_resistance_apply"));
				if (_adv != null) {
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1000000, 0, true, false));
		} else if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).getItem() == PlayerupgradesModItems.WATER_BREATHING_UPGRADE.get()) {
			if (entity instanceof ServerPlayer _player) {
				AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("playerupgrades:water_breathing_apply"));
				if (_adv != null) {
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 1000000, 0, true, false));
		} else if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).copy()).getItem() == PlayerupgradesModItems.FLY_UPGRADE.get()) {
			if (entity instanceof ServerPlayer _player) {
				AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("playerupgrades:fly_apply"));
				if (_adv != null) {
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
			if (entity instanceof Player _player) {
				_player.getAbilities().mayfly = true;
				_player.onUpdateAbilities();
			}
		} else if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).copy()).getItem() == PlayerupgradesModItems.FIRE_RESISTANCE_UPGRADE.get()) {
			if (entity instanceof ServerPlayer _player) {
				AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("playerupgrades:fire_resistance_apply"));
				if (_adv != null) {
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1000000, 0, true, false));
		} else if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).copy()).getItem() == PlayerupgradesModItems.WATER_BREATHING_UPGRADE.get()) {
			if (entity instanceof ServerPlayer _player) {
				AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("playerupgrades:water_breathing_apply"));
				if (_adv != null) {
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 1000000, 0, true, false));
		} else if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 2).copy()).getItem() == PlayerupgradesModItems.FLY_UPGRADE.get()) {
			if (entity instanceof ServerPlayer _player) {
				AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("playerupgrades:fly_apply"));
				if (_adv != null) {
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
			if (entity instanceof Player _player) {
				_player.getAbilities().mayfly = true;
				_player.onUpdateAbilities();
			}
		} else if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 2).copy()).getItem() == PlayerupgradesModItems.FIRE_RESISTANCE_UPGRADE.get()) {
			if (entity instanceof ServerPlayer _player) {
				AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("playerupgrades:fire_resistance_apply"));
				if (_adv != null) {
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1000000, 0, true, false));
		} else if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 2).copy()).getItem() == PlayerupgradesModItems.WATER_BREATHING_UPGRADE.get()) {
			if (entity instanceof ServerPlayer _player) {
				AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("playerupgrades:water_breathing_apply"));
				if (_adv != null) {
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 1000000, 0, true, false));
		} else if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 3).copy()).getItem() == PlayerupgradesModItems.FLY_UPGRADE.get()) {
			if (entity instanceof ServerPlayer _player) {
				AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("playerupgrades:fly_apply"));
				if (_adv != null) {
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
			if (entity instanceof Player _player) {
				_player.getAbilities().mayfly = true;
				_player.onUpdateAbilities();
			}
		} else if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 3).copy()).getItem() == PlayerupgradesModItems.FIRE_RESISTANCE_UPGRADE.get()) {
			if (entity instanceof ServerPlayer _player) {
				AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("playerupgrades:fire_resistance_apply"));
				if (_adv != null) {
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1000000, 0, true, false));
		} else if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 3).copy()).getItem() == PlayerupgradesModItems.WATER_BREATHING_UPGRADE.get()) {
			if (entity instanceof ServerPlayer _player) {
				AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("playerupgrades:water_breathing_apply"));
				if (_adv != null) {
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 1000000, 0, true, false));
		} else if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 4).copy()).getItem() == PlayerupgradesModItems.FLY_UPGRADE.get()) {
			if (entity instanceof ServerPlayer _player) {
				AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("playerupgrades:fly_apply"));
				if (_adv != null) {
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
			if (entity instanceof Player _player) {
				_player.getAbilities().mayfly = true;
				_player.onUpdateAbilities();
			}
		} else if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 4).copy()).getItem() == PlayerupgradesModItems.FIRE_RESISTANCE_UPGRADE.get()) {
			if (entity instanceof ServerPlayer _player) {
				AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("playerupgrades:fire_resistance_apply"));
				if (_adv != null) {
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1000000, 0, true, false));
		} else if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 4).copy()).getItem() == PlayerupgradesModItems.WATER_BREATHING_UPGRADE.get()) {
			if (entity instanceof ServerPlayer _player) {
				AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("playerupgrades:water_breathing_apply"));
				if (_adv != null) {
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 1000000, 0, true, false));
		}
	}

	private static ItemStack itemFromBlockInventory(LevelAccessor world, BlockPos pos, int slot) {
		if (world instanceof ILevelExtension ext) {
			IItemHandler itemHandler = ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
			if (itemHandler != null)
				return itemHandler.getStackInSlot(slot);
		}
		return ItemStack.EMPTY;
	}
}