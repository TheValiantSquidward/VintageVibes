package net.thevaliantsquidward.vintagevibes.registry;

import com.google.common.collect.Sets;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thevaliantsquidward.vintagevibes.VintageVibes;
import net.thevaliantsquidward.vintagevibes.blocks.*;
import net.thevaliantsquidward.vintagevibes.blocks.blockentity.*;

import java.util.Set;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = VintageVibes.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class VVBlockEntityTypes {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, VintageVibes.MOD_ID);

    public static final RegistryObject<BlockEntityType<DisplayCaseBlockEntity>> DISPLAY_CASE = registerBlockEntity("display_case", DisplayCaseBlockEntity::new, DisplayCaseBlock.class);

    public static Block[] collectBlocks(Class<?> blockClass) {
        return ForgeRegistries.BLOCKS.getValues().stream().filter(blockClass::isInstance).toArray(Block[]::new);
    }

    public static <T extends BlockEntity> RegistryObject<BlockEntityType<T>> registerBlockEntity(String name, BlockEntityType.BlockEntitySupplier<? extends T> blockEntity, Supplier<Set<Block>> validBlocks) {
        return BLOCK_ENTITIES.register(name, () -> new BlockEntityType<>(blockEntity, validBlocks.get(), null));
    }

    public static <T extends BlockEntity> RegistryObject<BlockEntityType<T>> registerBlockEntity(String name, BlockEntityType.BlockEntitySupplier<? extends T> blockEntity, Class<? extends Block> blockClass) {
        return BLOCK_ENTITIES.register(name, () -> new BlockEntityType<>(blockEntity, Sets.newHashSet(collectBlocks(blockClass)), null));
    }
}
