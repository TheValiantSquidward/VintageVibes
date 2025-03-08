package net.thevaliantsquidward.vintagevibes.entity.client;// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.ai.control.BodyRotationControl;
import net.thevaliantsquidward.vintagevibes.entity.animations.ModAnimationDefinitions;
import net.thevaliantsquidward.vintagevibes.entity.custom.ButterflyEntity;
import net.thevaliantsquidward.vintagevibes.goal.ButterflyBodyHelper;
import org.jetbrains.annotations.NotNull;


public class ButterflyModel<T extends Entity> extends HierarchicalModel<T> {
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

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(-0.5F, 23.5F, 0.0F));

		PartDefinition body = root.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 13).addBox(-0.5F, -0.25F, -2.75F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.25F, -0.25F));

		PartDefinition antenna = body.addOrReplaceChild("antenna", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.25F, -2.75F));

		PartDefinition l_wing = body.addOrReplaceChild("l_wing", CubeListBuilder.create().texOffs(-4, 0).addBox(0.0F, 0.0F, -8.0F, 12.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, -0.25F, 0.25F));

		PartDefinition r_wing = body.addOrReplaceChild("r_wing", CubeListBuilder.create().texOffs(-4, 0).mirror().addBox(-12.0F, 0.0F, -8.0F, 12.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-0.5F, -0.25F, 0.25F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);


		this.animate(((ButterflyEntity) entity).flyingAnimationState, ModAnimationDefinitions.fly, ageInTicks, 1f);
		this.animate(((ButterflyEntity) entity).idleAnimationState, ModAnimationDefinitions.land_idle, ageInTicks, 1f);
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