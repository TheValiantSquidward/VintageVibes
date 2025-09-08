package net.thevaliantsquidward.vintagevibes.registry;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;
import net.thevaliantsquidward.vintagevibes.VintageVibes;

public class VVModelLayers {

    public static final ModelLayerLocation BUTTERFLY = main("butterfly");
    public static final ModelLayerLocation BIG_MASK = main("big_mask");
    public static final ModelLayerLocation GOLDEN_HEAD = main("golden_head");
    public static final ModelLayerLocation ELONGATED_SKULL = main("elongated_skull");

    private static ModelLayerLocation register(String id, String name) {
        return new ModelLayerLocation(new ResourceLocation(VintageVibes.MOD_ID, id), name);
    }

    private static ModelLayerLocation main(String id) {
        return register(id, "main");
    }
}