package net.thevaliantsquidward.vintagevibes.registry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thevaliantsquidward.vintagevibes.VintageVibes;

public class VVSoundEvents {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, VintageVibes.MOD_ID);

    public static final RegistryObject<SoundEvent> VIBE_DISC = registerSoundEvents("vibe_disc");
    public static final RegistryObject<SoundEvent> SPEAR_CHARGE = registerSoundEvents("spear_charge");

    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        return SOUNDS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(VintageVibes.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) { SOUNDS.register(eventBus); }
}