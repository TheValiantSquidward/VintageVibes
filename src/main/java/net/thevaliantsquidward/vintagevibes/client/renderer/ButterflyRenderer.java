package net.thevaliantsquidward.vintagevibes.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.thevaliantsquidward.vintagevibes.VintageVibes;
import net.thevaliantsquidward.vintagevibes.client.models.entity.ButterflyModel;
import net.thevaliantsquidward.vintagevibes.registry.VVModelLayers;
import net.thevaliantsquidward.vintagevibes.entities.Butterfly;

public class ButterflyRenderer extends MobRenderer<Butterfly, ButterflyModel<Butterfly>> {

    public ButterflyRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new ButterflyModel<>(pContext.bakeLayer(VVModelLayers.BUTTERFLY_LAYER)), 0.2f);
    }

    private static final ResourceLocation MONARCH = new ResourceLocation(VintageVibes.MOD_ID, "textures/entity/butterfly/monarch.png");
    private static final ResourceLocation BLUE_BANDED_SWALLOWTAIL = new ResourceLocation(VintageVibes.MOD_ID, "textures/entity/butterfly/blue_banded_swallowtail.png");
    private static final ResourceLocation BLUE_MORPHO = new ResourceLocation(VintageVibes.MOD_ID, "textures/entity/butterfly/blue_morpho.png");
    private static final ResourceLocation CABBAGE = new ResourceLocation(VintageVibes.MOD_ID, "textures/entity/butterfly/cabbage.png");
    private static final ResourceLocation CLOUDED_YELLOW = new ResourceLocation(VintageVibes.MOD_ID, "textures/entity/butterfly/clouded_yellow.png");
    private static final ResourceLocation GLASSWING = new ResourceLocation(VintageVibes.MOD_ID, "textures/entity/butterfly/glasswing.png");
    private static final ResourceLocation MALACHITE = new ResourceLocation(VintageVibes.MOD_ID, "textures/entity/butterfly/malachite.png");
    private static final ResourceLocation MEXICAN_SHOEMAKER = new ResourceLocation(VintageVibes.MOD_ID, "textures/entity/butterfly/mexican_shoemaker.png");
    private static final ResourceLocation MOURNING_CLOAK = new ResourceLocation(VintageVibes.MOD_ID, "textures/entity/butterfly/mourning_cloak.png");
    private static final ResourceLocation PURPLE_EMPEROR = new ResourceLocation(VintageVibes.MOD_ID, "textures/entity/butterfly/purple_emperor.png");
    private static final ResourceLocation GULF_FRITILLARY = new ResourceLocation(VintageVibes.MOD_ID, "textures/entity/butterfly/gulf_fritillary.png");
    private static final ResourceLocation TIGER_SWALLOWTAIL = new ResourceLocation(VintageVibes.MOD_ID, "textures/entity/butterfly/tiger_swallowtail.png");
    private static final ResourceLocation ZEBRA = new ResourceLocation(VintageVibes.MOD_ID, "textures/entity/butterfly/zebra.png");
    private static final ResourceLocation COMMON_BLUE = new ResourceLocation(VintageVibes.MOD_ID, "textures/entity/butterfly/common_blue.png");
    private static final ResourceLocation ATALA = new ResourceLocation(VintageVibes.MOD_ID, "textures/entity/butterfly/atala.png");
    private static final ResourceLocation RED_ADMIRAL = new ResourceLocation(VintageVibes.MOD_ID, "textures/entity/butterfly/red_admiral.png");
    private static final ResourceLocation QUEEN_ALEXANDRA_BIRDWING = new ResourceLocation(VintageVibes.MOD_ID, "textures/entity/butterfly/queen_alexandra_birdwing.png");
    private static final ResourceLocation RUSTY_TIP_PAGE = new ResourceLocation(VintageVibes.MOD_ID, "textures/entity/butterfly/rusty_tip_page.png");
    private static final ResourceLocation TAILED_JAY = new ResourceLocation(VintageVibes.MOD_ID, "textures/entity/butterfly/tailed_jay.png");
    private static final ResourceLocation EMERALD_SWALLOWTAIL = new ResourceLocation(VintageVibes.MOD_ID, "textures/entity/butterfly/emerald_swallowtail.png");
    private static final ResourceLocation GREAT_EGGFLY = new ResourceLocation(VintageVibes.MOD_ID, "textures/entity/butterfly/great_eggfly.png");
    private static final ResourceLocation PINK_ROSE = new ResourceLocation(VintageVibes.MOD_ID, "textures/entity/butterfly/pink_rose.png");
    private static final ResourceLocation ONE_SPOTTED_PREPONA = new ResourceLocation(VintageVibes.MOD_ID, "textures/entity/butterfly/one_spotted_prepona.png");
    private static final ResourceLocation GIANT_GLASSWING = new ResourceLocation(VintageVibes.MOD_ID, "textures/entity/butterfly/giant_glasswing.png");

    @Override
    public ResourceLocation getTextureLocation(Butterfly butter) {
        return switch (butter.getVariant()) {
            case 1 -> BLUE_BANDED_SWALLOWTAIL;
            case 2 -> BLUE_MORPHO;
            case 3 -> CABBAGE;
            case 4 -> CLOUDED_YELLOW;
            case 5 -> GLASSWING;
            case 6 -> MALACHITE;
            case 7 -> MEXICAN_SHOEMAKER;
            case 8 -> MOURNING_CLOAK;
            case 9 -> PURPLE_EMPEROR;
            case 10 -> GULF_FRITILLARY;
            case 11 -> TIGER_SWALLOWTAIL;
            case 12 -> ZEBRA;
            case 13 -> COMMON_BLUE;
            case 14 -> ATALA;
            case 15 -> RED_ADMIRAL;
            case 16 -> QUEEN_ALEXANDRA_BIRDWING;
            case 17 -> RUSTY_TIP_PAGE;
            case 18 -> TAILED_JAY;
            case 19 -> EMERALD_SWALLOWTAIL;
            case 20 -> GREAT_EGGFLY;
            case 21 -> PINK_ROSE;
            case 22 -> ONE_SPOTTED_PREPONA;
            case 23 -> GIANT_GLASSWING;

            default -> MONARCH;
        };
    }

    @Override
    public void render(Butterfly pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}