package net.thevaliantsquidward.vintagevibes.entities.ai.goals;

import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.thevaliantsquidward.vintagevibes.entities.Butterfly;

public class ButterflyLookAroundGoal extends RandomLookAroundGoal {

    private final Butterfly butterfly;

    public ButterflyLookAroundGoal(Butterfly butterfly) {
        super(butterfly);
        this.butterfly = butterfly;
    }

    @Override
    public boolean canUse() {
        return butterfly.onGround() && super.canUse();
    }

    @Override
    public boolean canContinueToUse() {
        return butterfly.onGround() && super.canContinueToUse();
    }
}