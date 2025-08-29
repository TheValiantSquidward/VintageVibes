package net.thevaliantsquidward.vintagevibes.entities.ai.navigation;

import net.minecraft.util.Mth;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.phys.Vec3;
import net.thevaliantsquidward.vintagevibes.entities.Butterfly;

public class ButterflyMoveController extends MoveControl {

        private final Butterfly butterfly;

        public ButterflyMoveController(Butterfly butterfly) {
            super(butterfly);
            this.butterfly = butterfly;
        }

        public void tick() {
            if (this.operation == MoveControl.Operation.MOVE_TO) {
                Vec3 vector3d = new Vec3(this.wantedX - butterfly.getX(), this.wantedY - butterfly.getY(), this.wantedZ - butterfly.getZ());
                double d0 = vector3d.length();
                double width = butterfly.getBoundingBox().getSize();
                Vec3 vector3d1 = vector3d.scale(this.speedModifier * 0.05D / d0);
                butterfly.setDeltaMovement(butterfly.getDeltaMovement().add(vector3d1).scale(0.95D).add(0, -0.01, 0));
                if (d0 < width) {
                    this.operation = Operation.WAIT;
                } else if (d0 >= width) {
                    float yaw = -((float) Mth.atan2(vector3d1.x, vector3d1.z)) * (180F / (float) Math.PI);
                    butterfly.setYRot(Mth.approachDegrees(butterfly.getYRot(), yaw, 8));
                }
            }
        }
    }