package net.thevaliantsquidward.vintagevibes.client.models.armor;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
@SuppressWarnings("FieldCanBeLocal, unused")
public class MaskModel extends HumanoidModel {

	public MaskModel(ModelPart root) {
		super(root);
	}

	public static LayerDefinition createArmorLayer() {
		MeshDefinition meshdefinition = HumanoidModel.createMesh(new CubeDeformation(0.0F), 0.0F);
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.getChild("head");
		PartDefinition body = partdefinition.getChild("body");
		PartDefinition leftLeg = partdefinition.getChild("left_leg");
		PartDefinition rightLeg = partdefinition.getChild("right_leg");
		PartDefinition leftArm = partdefinition.getChild("left_arm");
		PartDefinition rightArm = partdefinition.getChild("right_arm");

		head.addOrReplaceChild("mask", CubeListBuilder.create()
				.texOffs(42, 18).addBox(-3.5F, -8.0F, -10.0F, 9.0F, 16.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(8, 43).addBox(-5.5F, -11.0F, -10.25F, 13.0F, 21.0F, 0.0F, new CubeDeformation(0.05F))
				.texOffs(34, 36).addBox(-6.5F, -14.0F, -9.0F, 15.0F, 28.0F, 0.0F, new CubeDeformation(0.05F)), PartPose.offset(-1.0F, 0.0F, 4.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}
}