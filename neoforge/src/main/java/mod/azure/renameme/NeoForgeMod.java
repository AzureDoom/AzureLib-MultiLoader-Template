package mod.azure.renameme;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

// Uncomment when you start registering things
//@Mod.EventBusSubscriber
@Mod(CommonMod.MOD_ID)
public final class NeoForgeMod {

    public static NeoForgeMod instance;

    public NeoForgeMod(IEventBus modEventBus) {
        instance = this;
    }
}
