package net.thevaliantsquidward.vintagevibes.registry;

import com.google.gson.JsonObject;
import net.minecraft.advancements.critereon.AbstractCriterionTriggerInstance;
import net.minecraft.advancements.critereon.ContextAwarePredicate;
import net.minecraft.advancements.critereon.DeserializationContext;
import net.minecraft.advancements.critereon.SimpleCriterionTrigger;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.thevaliantsquidward.vintagevibes.VintageVibes;

public class VVCriteriaTriggers extends SimpleCriterionTrigger<VVCriteriaTriggers.TriggerInstance> {

    private final ResourceLocation CRITERIA;

    public VVCriteriaTriggers(String name) {
        CRITERIA = new ResourceLocation(VintageVibes.MOD_ID, name);
    }

    @Override
    public ResourceLocation getId() {
        return CRITERIA;
    }

    public void trigger(ServerPlayer player) {
        this.trigger(player, conditions -> true);
    }

    @Override
    protected TriggerInstance createInstance(JsonObject object, ContextAwarePredicate predicate, DeserializationContext context) {
        return new VVCriteriaTriggers.TriggerInstance(CRITERIA, predicate);
    }

    public static class TriggerInstance extends AbstractCriterionTriggerInstance {
        public TriggerInstance(ResourceLocation id, ContextAwarePredicate predicate) {
            super(id, predicate);
        }
    }
}