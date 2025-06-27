package net.thevaliantsquidward.vintagevibes.registry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thevaliantsquidward.vintagevibes.VintageVibes;
import net.thevaliantsquidward.vintagevibes.entities.Butterfly;

public class VVEntities {

    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, VintageVibes.MOD_ID);

    public static final RegistryObject<EntityType<Butterfly>> BUTTERFLY = ENTITIES.register(
            "butterfly", () ->
            EntityType.Builder.of(Butterfly::new, MobCategory.AMBIENT)
                    .sized(0.4F, 0.4F)
                    .clientTrackingRange(10)
                    .build(new ResourceLocation(VintageVibes.MOD_ID, "butterfly").toString())
    );
}
