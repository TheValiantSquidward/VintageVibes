package net.thevaliantsquidward.vintagevibes.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.thevaliantsquidward.vintagevibes.entity.animations.ButterflyAnimations;
import net.thevaliantsquidward.vintagevibes.entity.custom.ButterflyEntity;

public class ButterflyModel<T extends ButterflyEntity> extends HierarchicalModel<T> {

	private final ModelPart root;
	private final ModelPart body;
	private final ModelPart antenna;
	private final ModelPart l_wing;
	private final ModelPart r_wing;

	public ButterflyModel(ModelPart root) {
		this.root = root.getChild("root");
		this.body = this.root.getChild("body");
		this.antenna = this.body.getChild("antenna");
		this.l_wing = this.body.getChild("l_wing");
		this.r_wing = this.body.getChild("r_wing");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(-0.5F, 23.5F, 1.0F));
		PartDefinition body = root.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, -0.25F, -2.75F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.25F, -0.25F));
		PartDefinition antenna = body.addOrReplaceChild("antenna", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.25F, -2.75F));
		PartDefinition l_wing = body.addOrReplaceChild("l_wing", CubeListBuilder.create().texOffs(-4, 0).addBox(0.0F, 0.0F, -8.0F, 12.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, -0.25F, 0.25F));
		PartDefinition r_wing = body.addOrReplaceChild("r_wing", CubeListBuilder.create().texOffs(-4, 0).mirror().addBox(-12.0F, 0.0F, -8.0F, 12.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-0.5F, -0.25F, 0.25F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(ButterflyEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.animate(entity.flyingAnimationState, ButterflyAnimations.FLIGHT_OF_THE_BEAST, ageInTicks, 1F);
		this.animate(entity.idleAnimationState, ButterflyAnimations.IDLE, ageInTicks, 1F);
	}


	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return root;
	}
}