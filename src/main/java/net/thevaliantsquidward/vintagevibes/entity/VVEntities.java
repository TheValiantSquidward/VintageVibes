package net.thevaliantsquidward.vintagevibes.entity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thevaliantsquidward.vintagevibes.VintageVibes;
import net.thevaliantsquidward.vintagevibes.entity.custom.ButterflyEntity;

public class VVEntities {

    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, VintageVibes.MOD_ID);

    public static final RegistryObject<EntityType<ButterflyEntity>> BUTTERFLY = ENTITIES.register("butterfly", () -> EntityType.Builder.of(ButterflyEntity::new, MobCategory.AMBIENT).sized(0.3f, 0.3f).build(new ResourceLocation(VintageVibes.MOD_ID, "butterfly").toString()));
}
