package net.thevaliantsquidward.vintagevibes.events;

import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.SpawnPlacementRegisterEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.thevaliantsquidward.vintagevibes.VintageVibes;
import net.thevaliantsquidward.vintagevibes.entities.*;

import static net.thevaliantsquidward.vintagevibes.registry.VVEntities.*;

@Mod.EventBusSubscriber(modid = VintageVibes.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class VVMobEvents {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(BUTTERFLY.get(), Butterfly.createAttributes().build());
    }

    @SubscribeEvent
    public static void registerSpawnPlacements(SpawnPlacementRegisterEvent event) {
        event.register(BUTTERFLY.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Butterfly::canSpawn, SpawnPlacementRegisterEvent.Operation.OR);
    }
}
