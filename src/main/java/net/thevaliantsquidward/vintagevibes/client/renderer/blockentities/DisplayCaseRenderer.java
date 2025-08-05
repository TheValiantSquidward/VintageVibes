package net.thevaliantsquidward.vintagevibes.client.renderer.blockentities;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import net.thevaliantsquidward.vintagevibes.blocks.DisplayCaseBlock;
import net.thevaliantsquidward.vintagevibes.blocks.blockentity.DisplayCaseBlockEntity;
import org.jetbrains.annotations.NotNull;

public class DisplayCaseRenderer implements BlockEntityRenderer<DisplayCaseBlockEntity> {

    private final ItemRenderer itemRenderer;

    public DisplayCaseRenderer(BlockEntityRendererProvider.Context pContext) {
        this.itemRenderer = pContext.getItemRenderer();
    }

    @Override
    public void render(DisplayCaseBlockEntity blockEntity, float partialTicks, @NotNull PoseStack poseStack, @NotNull MultiBufferSource buffer, int packedLight, int packedOverlay) {
        ItemStack displayItem = blockEntity.getDisplayItem();
        if (displayItem.isEmpty()) return;

        poseStack.pushPose();
        poseStack.translate(0.5F, 0.295F, 0.5F);
        poseStack.scale(1.25F, 1.25F, 1.25F);

        float yRot = blockEntity.getBlockState().getValue(DisplayCaseBlock.FACING).getClockWise().toYRot();
        poseStack.mulPose(Axis.YP.rotationDegrees(-yRot));
        poseStack.mulPose(Axis.XP.rotationDegrees(90F));
        poseStack.mulPose(Axis.ZP.rotationDegrees(90F));

        int xRotDegrees = -60;
        poseStack.translate(0.0F, -0.1F, 0.0F);
        poseStack.mulPose(Axis.XP.rotationDegrees(xRotDegrees));
        if (displayItem.getItem() instanceof BlockItem blockItem) {
            boolean flatTexture = !itemRenderer.getItemModelShaper().getItemModel(blockItem).isGui3d();
            if (flatTexture) {
                poseStack.mulPose(Axis.YP.rotationDegrees(-180));
            }
        } else {
            poseStack.mulPose(Axis.YP.rotationDegrees(-180));
        }
        this.itemRenderer.renderStatic(displayItem, ItemDisplayContext.GROUND, packedLight, OverlayTexture.NO_OVERLAY, poseStack, buffer, blockEntity.getLevel(), blockEntity.saveWithId().getId());

        poseStack.popPose();
    }
}
