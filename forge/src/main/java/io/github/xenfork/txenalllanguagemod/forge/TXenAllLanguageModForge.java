package io.github.xenfork.txenalllanguagemod.forge;

import dev.architectury.platform.forge.EventBuses;
import io.github.xenfork.txenalllanguagemod.TXenAllLanguageMod;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(TXenAllLanguageMod.MOD_ID)
public class TXenAllLanguageModForge {
    public TXenAllLanguageModForge() {
		// Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(TXenAllLanguageMod.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
            TXenAllLanguageMod.init();
    }
}