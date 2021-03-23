package me.mateus.zapzapmod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ZapZapMod implements ModInitializer {

	public static final Identifier ZAP_WHISTLE_ID = new Identifier("zapzapmod:zap_whistle");
	public static SoundEvent ZAP_WHISTLE_EVENT = new SoundEvent(ZAP_WHISTLE_ID);

	@Override
	public void onInitialize() {
		Registry.register(Registry.SOUND_EVENT, ZAP_WHISTLE_ID, ZAP_WHISTLE_EVENT);
	}
}
