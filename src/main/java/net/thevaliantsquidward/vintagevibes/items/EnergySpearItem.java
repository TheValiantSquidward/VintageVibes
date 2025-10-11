package net.thevaliantsquidward.vintagevibes.items;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Vanishable;
import net.minecraft.world.level.Level;
import net.thevaliantsquidward.vintagevibes.registry.VVSoundEvents;

public class EnergySpearItem extends TrinketItem {

    public EnergySpearItem(Properties p_43381_) {
        super(p_43381_);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        level.playSound((Player)null, player.getX(), player.getY(), player.getZ(), VVSoundEvents.SPEAR_CHARGE.get(), SoundSource.NEUTRAL, 1.0F, 1.0F);
        return super.use(level, player, hand);
    }



}
