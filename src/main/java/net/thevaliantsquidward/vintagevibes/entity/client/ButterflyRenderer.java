package net.thevaliantsquidward.vintagevibes.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.Parrot;
import net.thevaliantsquidward.vintagevibes.VintageVibes;
import net.thevaliantsquidward.vintagevibes.entity.custom.ButterflyEntity;

public class ButterflyRenderer extends MobRenderer<ButterflyEntity, ButterflyModel<ButterflyEntity>> {
    public ButterflyRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new ButterflyModel<>(pContext.bakeLayer(ModModelLayers.BUTTERFLY_LAYER)), -1f);
    }
    private static final ResourceLocation MONARCH = new ResourceLocation(VintageVibes.MOD_ID, "textures/entity/monarch.png");
    private static final ResourceLocation BLUE_BANDED_SWALLOWTAIL = new ResourceLocation(VintageVibes.MOD_ID, "textures/entity/blue_banded_swallowtail.png");
    private static final ResourceLocation BLUE_MORPHO = new ResourceLocation(VintageVibes.MOD_ID, "textures/entity/blue_morpho.png");
    private static final ResourceLocation CABBAGE = new ResourceLocation(VintageVibes.MOD_ID, "textures/entity/cabbage.png");
    private static final ResourceLocation CLOUDED_YELLOW = new ResourceLocation(VintageVibes.MOD_ID, "textures/entity/clouded_yellow.png");
    private static final ResourceLocation GLASSWING = new ResourceLocation(VintageVibes.MOD_ID, "textures/entity/glasswing.png");
    private static final ResourceLocation MALACHITE = new ResourceLocation(VintageVibes.MOD_ID, "textures/entity/malachite.png");
    private static final ResourceLocation MEXICAN_SHOEMAKER = new ResourceLocation(VintageVibes.MOD_ID, "textures/entity/mexican_shoemaker.png");
    private static final ResourceLocation MOURNING_CLOAK = new ResourceLocation(VintageVibes.MOD_ID, "textures/entity/mourning_cloak.png");
    private static final ResourceLocation PURPLE_EMPEROR = new ResourceLocation(VintageVibes.MOD_ID, "textures/entity/purple_emperor.png");
    private static final ResourceLocation TIGER_LONGWING = new ResourceLocation(VintageVibes.MOD_ID, "textures/entity/tiger_longwing.png");
    private static final ResourceLocation TIGER_SWALLOWTAIL = new ResourceLocation(VintageVibes.MOD_ID, "textures/entity/tiger_swallowtail.png");
    private static final ResourceLocation ZEBRA = new ResourceLocation(VintageVibes.MOD_ID, "textures/entity/zebra.png");


    public ResourceLocation getTextureLocation(ButterflyEntity entity) {
        return switch (entity.getVariant()) {
            case 1 -> BLUE_BANDED_SWALLOWTAIL;
            case 2 -> BLUE_MORPHO;
            case 3 -> CABBAGE;
            case 4 -> CLOUDED_YELLOW;
            case 5 -> GLASSWING;
            case 6 -> MALACHITE;
            case 7 -> MEXICAN_SHOEMAKER;
            case 8 -> MOURNING_CLOAK;
            case 9 -> PURPLE_EMPEROR;
            case 10 -> TIGER_LONGWING;
            case 11 -> TIGER_SWALLOWTAIL;
            case 12 -> ZEBRA;
            default -> MONARCH;
        };
    }

    @Override
    public void render(ButterflyEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {


        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}