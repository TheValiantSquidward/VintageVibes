package net.thevaliantsquidward.vintagevibes.client.models.skull;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public abstract class VVSkullModelBase extends SkullModelBase {

    public ModelPart head;

    public VVSkullModelBase(ModelPart root) {
        this.head = root.getChild("head");
    }

    @Override
    public void setupAnim(float animation, float yRot, float xRot) {
        this.head.yRot = yRot * ((float) Math.PI / 180F);
        this.head.xRot = xRot * ((float) Math.PI / 180F);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        poseStack.pushPose();
        this.head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        poseStack.popPose();
    }

    public abstract float headRenderScale();
    public abstract float headRenderHeight();
}