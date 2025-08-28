package net.thevaliantsquidward.vintagevibes.events;

import net.minecraft.core.BlockPos;
import net.minecraft.core.SectionPos;
import net.minecraft.server.TickTask;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.TicketType;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.animal.Bee;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.thevaliantsquidward.vintagevibes.VintageVibes;
import net.thevaliantsquidward.vintagevibes.registry.VVCriterion;
import net.thevaliantsquidward.vintagevibes.registry.VVItems;

import java.util.Objects;
import java.util.Optional;

@Mod.EventBusSubscriber(modid = VintageVibes.MOD_ID)
public class VVServerEvents {
    
    @SubscribeEvent
    public static void onLivingDeath(LivingDeathEvent event) {
        LivingEntity entity = event.getEntity();

        if (!event.getSource().is(DamageTypeTags.BYPASSES_INVULNERABILITY)) {
            if (entity.getItemBySlot(EquipmentSlot.FEET).getItem() == VVItems.RUBY_SLIPPERS.get()) {
                entity.setHealth(1.0F);
                entity.clearFire();
                entity.fallDistance = 0F;
                entity.removeAllEffects();
                entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 100, 3));
                entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 60, 0));
                entity.getItemBySlot(EquipmentSlot.FEET).hurtAndBreak(600, entity, (livingEntity) -> livingEntity.broadcastBreakEvent(EquipmentSlot.FEET));
                entity.playSound(SoundEvents.ENDERMAN_TELEPORT, 1.0F, 1.0F);

                if (entity instanceof ServerPlayer && !entity.level().isClientSide()) {
                    ServerPlayer player = (ServerPlayer) entity;
                    ServerLevel spawn = Objects.requireNonNullElse(player.getServer().getLevel(player.getRespawnDimension()), player.getServer().overworld());
                    Vec3 spawnpoint = Optional.ofNullable(player.getRespawnPosition())
                            .flatMap(pos -> Player.findRespawnPositionAndUseSpawnBlock(spawn, pos, player.getRespawnAngle(), player.isRespawnForced(), true))
                            .orElseGet(() -> {
                                BlockPos worldSpawn = spawn.getSharedSpawnPos();
                                return new Vec3(worldSpawn.getX(), worldSpawn.getY(), worldSpawn.getZ());
                            });

                    TickTask teleport = new TickTask((entity.level().getServer().getTickCount()) + 1, () -> {
                        spawn.getChunkSource().addRegionTicket(TicketType.POST_TELEPORT, new ChunkPos(SectionPos.posToSectionCoord(spawnpoint.x), SectionPos.posToSectionCoord(spawnpoint.z)), 1, player.getId());
                        player.teleportTo(spawn, spawnpoint.x(), spawnpoint.y(), spawnpoint.z(), 5.0F, 5.0F);
                    });
                    entity.level().getServer().tell(teleport);
                    VVCriterion.USE_RUBY_SLIPPER.trigger(player);
                }
                event.setCanceled(true);
            }
        }
    }
}
