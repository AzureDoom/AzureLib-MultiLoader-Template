package mod.azure.renameme;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

@Mod(CommonMod.MOD_ID)
public final class NeoForgeMod {

    public static NeoForgeMod instance;
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.createItems(CommonMod.MOD_ID);
    public static final Supplier<Item> AK47 = ITEMS.register("ak47", () -> new AK47Item(new Item.Properties()));

    public NeoForgeMod(IEventBus modEventBus) {
        instance = this;
        ITEMS.register(modEventBus);
    }


}
