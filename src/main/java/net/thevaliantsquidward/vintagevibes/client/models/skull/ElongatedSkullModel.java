package net.thevaliantsquidward.vintagevibes.client.models.skull;

import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class ElongatedSkullModel extends VVSkullModelBase {

    public ElongatedSkullModel(ModelPart root) {
        super(root);
    }

    public static LayerDefinition createSkullLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition root = meshdefinition.getRoot();

        root.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -5.0F, 8.0F, 8.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(0, 18).addBox(-4.0F, -8.0F, -5.0F, 8.0F, 8.0F, 10.0F, new CubeDeformation(0.4F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Override
    public float headRenderScale() {
        return 1;
    }

    @Override
    public float headRenderHeight() {
        return 0;
    }
}
