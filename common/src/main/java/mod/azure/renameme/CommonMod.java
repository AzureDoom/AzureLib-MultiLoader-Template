package mod.azure.renameme;

import net.minecraft.resources.Identifier;

public class CommonMod {
    public static final String MOD_ID = "renameme";

    public static Identifier modResource(String name) {
        return Identifier.fromNamespaceAndPath(MOD_ID, name);
    }
}
