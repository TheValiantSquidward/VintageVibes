package net.thevaliantsquidward.vintagevibes.utils;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.common.Mod;
import net.thevaliantsquidward.vintagevibes.VintageVibes;
import net.thevaliantsquidward.vintagevibes.client.renderer.items.VVArmorRenderProperties;

@OnlyIn(Dist.CLIENT)
@Mod.EventBusSubscriber(modid = VintageVibes.MOD_ID, value = Dist.CLIENT)
public class ClientProxy extends CommonProxy {

    public void init() {
    }

    public void clientInit() {
    }

    @Override
    public Object getArmorRenderProperties() {
        return new VVArmorRenderProperties();
    }
}
