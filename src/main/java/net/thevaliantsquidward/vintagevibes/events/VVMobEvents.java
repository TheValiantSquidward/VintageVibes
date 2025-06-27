package net.thevaliantsquidward.vintagevibes.events;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.thevaliantsquidward.vintagevibes.VintageVibes;
import net.thevaliantsquidward.vintagevibes.registry.VVEntities;
import net.thevaliantsquidward.vintagevibes.entities.Butterfly;

@Mod.EventBusSubscriber(modid = VintageVibes.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class VVMobEvents {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(VVEntities.BUTTERFLY.get(), Butterfly.createAttributes().build());
    }
}
