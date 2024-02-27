package mod.azure.renameme;

import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.IEventBus;
import mod.azure.renameme.CommonMod;

@Mod.EventBusSubscriber
@Mod(CommonMod.MOD_ID)
public final class NeoForgeMod {

    public static NeoForgeMod instance;

    public NeoForgeMod(IEventBus modEventBus) {
        instance = this;
    }
}
