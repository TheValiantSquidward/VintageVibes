package net.thevaliantsquidward.vintagevibes.mixins;

import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.network.protocol.game.ClientboundEntityEventPacket;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.thevaliantsquidward.vintagevibes.registry.VVItems;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@OnlyIn(Dist.CLIENT)
@Mixin(ClientPacketListener.class)
public class ClientPacketListenerMixin {

    @Shadow
    private ClientLevel level;

    @Shadow
    @Final
    private Minecraft minecraft;

    @Inject(method = "handleEntityEvent", at = @At(value = "RETURN"))
    public void handleEntityEvent(ClientboundEntityEventPacket packet, CallbackInfo ci) {
        Entity entity = packet.getEntity(this.level);
        if (entity != null) {
            if (packet.getEventId() == 117) {
                if (entity == this.minecraft.player) {
                    this.minecraft.gameRenderer.displayItemActivation(VVItems.RUBY_SLIPPER.get().getDefaultInstance());
                }
            } else {
                entity.handleEntityEvent(packet.getEventId());
            }
        }
    }
}
