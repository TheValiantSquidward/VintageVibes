package net.thevaliantsquidward.vintagevibes.mixins.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.layers.CustomHeadLayer;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.SkullBlock;
import net.thevaliantsquidward.vintagevibes.blocks.VVSkullBlock;
import net.thevaliantsquidward.vintagevibes.client.models.skull.VVSkullModelBase;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Map;

@Mixin(CustomHeadLayer.class)
public abstract class CustomHeadLayerMixin {

    @Shadow
    @Final
    private Map<SkullBlock.Type, SkullModelBase> skullModels;

    @Inject(method = "render(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;ILnet/minecraft/world/entity/LivingEntity;FFFFFF)V", at = @At(value = "INVOKE", target = "Lcom/mojang/blaze3d/vertex/PoseStack;scale(FFF)V", ordinal = 2, shift = At.Shift.AFTER))
    private void renderSkulls(PoseStack poseStack, MultiBufferSource bufferSource, int packedLight, LivingEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, CallbackInfo ci) {
        Item skull = entity.getItemBySlot(EquipmentSlot.HEAD).getItem();
        if (skull instanceof BlockItem blockItem && blockItem.getBlock() instanceof VVSkullBlock skullBlock) {
            SkullBlock.Type type = skullBlock.getType();
            if (this.skullModels.get(type) instanceof VVSkullModelBase ancientSkullModel) {
                poseStack.scale(ancientSkullModel.headRenderScale(), ancientSkullModel.headRenderScale(), ancientSkullModel.headRenderScale());
                poseStack.translate(0, ancientSkullModel.headRenderHeight(), 0);
            }
        }
    }
}