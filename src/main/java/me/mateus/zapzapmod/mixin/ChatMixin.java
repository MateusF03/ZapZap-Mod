package me.mateus.zapzapmod.mixin;

import me.mateus.zapzapmod.ZapZapMod;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.hud.ChatHud;
import net.minecraft.client.sound.PositionedSoundInstance;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ChatHud.class)
public class ChatMixin {
	@Inject(at = @At("HEAD"), method = "addMessage(Lnet/minecraft/text/Text;)V")
	private void init(CallbackInfo info) {
		MinecraftClient.getInstance().getSoundManager().play(PositionedSoundInstance.master(ZapZapMod.ZAP_WHISTLE_EVENT, 1f));
	}
}
