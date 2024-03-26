package mod.azure.renameme;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;

public final class FabricLibMod implements ModInitializer {

    @Override
    public void onInitialize() {
        Registry.register(BuiltInRegistries.ITEM, CommonMod.modResource("ak47"), new AK47Item(new Item.Properties()));
    }
}
