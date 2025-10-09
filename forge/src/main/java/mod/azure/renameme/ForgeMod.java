package mod.azure.renameme;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod.EventBusSubscriber
@Mod(CommonMod.MOD_ID)
public final class ForgeMod {

	public ForgeMod(FMLJavaModLoadingContext loadingContext) {
		IEventBus modEventBus = loadingContext.getModEventBus();
    }
}
