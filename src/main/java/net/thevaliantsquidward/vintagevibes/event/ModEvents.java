package net.thevaliantsquidward.vintagevibes.event;

import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.GrindstoneBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.thevaliantsquidward.vintagevibes.VintageVibes;

import java.util.ArrayList;


@Mod.EventBusSubscriber(modid = VintageVibes.MOD_ID)
public class ModEvents {

    @SubscribeEvent
    public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
        Player player = event.getEntity();
        Level level = event.getLevel();
        BlockPos pos = event.getPos();
        InteractionHand hand = event.getHand();
        BlockState blockState = level.getBlockState(pos);
        Block block = blockState.getBlock();
        RandomSource random = level.getRandom();
        ItemStack itemInHand = player.getItemInHand(hand);

     //   if (block instanceof GrindstoneBlock) {
     //       ArrayList<GrindingRecipe> recipes = new ArrayList<>(GrindingRecipe.getRecipes(level));
     //       for (GrindingRecipe polishingRecipe : recipes) {
     //           for (ItemStack ingredient : polishingRecipe.getIngredients().iterator().next().getItems()) {
     //               ItemStack result = polishingRecipe.result;
     //               int resultCount = polishingRecipe.getResultCount();
     //               int xpAmount = polishingRecipe.getExperience();
//
     //               if (itemInHand.is(ingredient.getItem())) {
     //                   event.setCanceled(true);
     //                   event.setCancellationResult(InteractionResult.FAIL);
     //                   ItemStack resultItem = result.copy();
     //                   if (player.isShiftKeyDown()) {
     //                       int ingredientCount = itemInHand.getCount();
     //                       shrinkIngredientAddResults(player, itemInHand, resultItem, resultCount, ingredientCount);
//
     //                       if (!(xpAmount == 0)) {
     //                           for (int i = 0; i <= ingredientCount; i++) {
     //                               int dropXp = random.nextInt(2);
     //                               if (dropXp < 1) {
     //                                   xpAmount = xpAmount + polishingRecipe.getExperience();
     //                               }
     //                           }
     //                           level.addFreshEntity(new ExperienceOrb(level, pos.getX(), pos.getY() + 1, pos.getZ(), xpAmount));
     //                       }
     //                   } else {
     //                       resultItem.setCount(resultCount);
     //                       shrinkIngredientAddResults(player, itemInHand, resultItem, resultCount, 1);
//
     //                       if (!(xpAmount == 0)) {
     //                           int canDropXp = random.nextInt(2);
//
     //                           if (canDropXp < 1) {
     //                               level.addFreshEntity(new ExperienceOrb(level, pos.getX(), pos.getY() + 1, pos.getZ(), xpAmount));
     //                           }
     //                       }
     //                   }
     //                   player.swing(hand);
     //                   Direction face = event.getFace();
     //                   if (face != null) {
     //                       ParticleUtils.spawnParticlesOnBlockFace(level, pos, ParticleTypes.CRIT, UniformInt.of(1, 4), face, () -> new Vec3(player.getLookAngle().x() + Mth.nextDouble(random, -0.5, 0.5), 0.8D, player.getLookAngle().z() + Mth.nextDouble(random, -0.5, 0.5)), 0.55D);
     //                       ParticleUtils.spawnParticlesOnBlockFace(level, pos, new ItemParticleOption(ParticleTypes.ITEM, itemInHand), UniformInt.of(1, 2), face, () -> new Vec3(Mth.nextDouble(random, -0.05D, 0.05D), 0, Mth.nextDouble(random, -0.05D, 0.05D)), 0.55D);
     //                   }
     //                   level.playSound(player, pos, SMSounds.POLISH_JADE.get(), SoundSource.BLOCKS, 0.5F, 0.0F);
     //               }
     //           }
     //       }
     //   }
    }

}
