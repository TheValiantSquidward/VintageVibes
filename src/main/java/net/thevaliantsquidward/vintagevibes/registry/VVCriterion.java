package net.thevaliantsquidward.vintagevibes.registry;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraftforge.fml.common.Mod;
import net.thevaliantsquidward.vintagevibes.VintageVibes;

@Mod.EventBusSubscriber(modid = VintageVibes.MOD_ID)
public class VVCriterion {

    public static final VVCriteriaTriggers USE_RUBY_SLIPPER = CriteriaTriggers.register(new VVCriteriaTriggers("use_ruby_slipper"));

}
