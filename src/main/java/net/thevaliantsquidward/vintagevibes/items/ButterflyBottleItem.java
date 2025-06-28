package net.thevaliantsquidward.vintagevibes.items;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.CommonComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.thevaliantsquidward.vintagevibes.entities.Butterfly;
import net.thevaliantsquidward.vintagevibes.registry.VVEntities;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;

import static net.minecraft.commands.arguments.ResourceArgument.getEntityType;

public class ButterflyBottleItem extends BucketItem {

    private final Supplier<? extends EntityType<?>> entityType;
    private final Item item1;
    private final boolean hasTooltip;

    public ButterflyBottleItem(Supplier<EntityType<?>> entityType, Item item, boolean hasTooltip, Properties properties) {
        this(entityType, Fluids.EMPTY, item, hasTooltip, properties);
    }

    public ButterflyBottleItem(Supplier<EntityType<?>> entityType, Fluid fluid, Item item, boolean hasTooltip, Properties properties) {
        super(fluid, properties);
        this.entityType = entityType;
        this.item1 = item;
        this.hasTooltip = hasTooltip;
    }

    public InteractionResult useOn(UseOnContext context) {
        Level world = context.getLevel();
        Player player = context.getPlayer();

        if (!world.isClientSide) {
            ItemStack itemstack = context.getItemInHand();
            BlockPos blockpos = context.getClickedPos();
            Direction direction = context.getClickedFace();
            BlockState blockstate = world.getBlockState(blockpos);

            BlockPos blockpos1;
            if (blockstate.getCollisionShape(world, blockpos).isEmpty()) {
                blockpos1 = blockpos;
            } else {
                blockpos1 = blockpos.relative(direction);
            }
            Supplier<? extends EntityType<?>> type = entityType;
            Entity entityType = type.get().spawn((ServerLevel) world, itemstack, player, blockpos1, MobSpawnType.BUCKET, true, !Objects.equals(blockpos, blockpos1) && direction == Direction.UP);
            if (entityType != null) {
                if (player != null && !player.getAbilities().instabuild) {
                    itemstack.shrink(1);
                    if (context.getItemInHand().isEmpty()) {
                        player.setItemInHand(context.getHand(), new ItemStack(item1));
                    }
                    else {
                        player.addItem(new ItemStack(item1));
                    }
                }
                world.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.BOTTLE_FILL_DRAGONBREATH, SoundSource.NEUTRAL, 0.5F, 1.0F);
            }
        }
        return InteractionResult.SUCCESS;
    }

    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, TooltipFlag flagIn) {

        if (getEntityType() == VVEntities.BUTTERFLY.get()) {
            CompoundTag compoundnbt = stack.getTag();
            if (compoundnbt != null && compoundnbt.contains("Variant", 3)) {
                int i = compoundnbt.getInt("Variant");
                String s = "entity.vintagevibes.butterfly.variant_" + Butterfly.getVariantName(i);
                tooltip.add((Component.translatable(s)).withStyle(ChatFormatting.GRAY).withStyle(ChatFormatting.ITALIC));
            }
        }
    }

    protected EntityType<?> getEntityType() {
        return entityType.get();
    }
}