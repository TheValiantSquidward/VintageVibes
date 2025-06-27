package net.thevaliantsquidward.vintagevibes.utils;

import net.minecraftforge.fml.common.Mod;
import net.thevaliantsquidward.vintagevibes.VintageVibes;

@Mod.EventBusSubscriber(modid = VintageVibes.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonProxy {
    public void init() {
    }

    public void clientInit() {
    }

    public Object getArmorRenderProperties() {
        return null;
    }
}
