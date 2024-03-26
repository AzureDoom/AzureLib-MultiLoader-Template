package mod.azure.renameme;

import mod.azure.azurelib.common.api.client.model.GeoModel;
import net.minecraft.resources.ResourceLocation;

public class AK47Model extends GeoModel<AK47Item> {

    private static final String ITEM_NAME = "ak47";

    private static final ResourceLocation MODEL_LOCATION = CommonMod.modResource("geo/" + ITEM_NAME + ".geo.json");

    private static final ResourceLocation TEXTURE_LOCATION = CommonMod.modResource("textures/" + ITEM_NAME + ".png");

    private static final ResourceLocation ANIMATION_LOCATION = CommonMod.modResource(
            "animations/" + ITEM_NAME + ".png");

    @Override
    public ResourceLocation getModelResource(AK47Item item) {
        return MODEL_LOCATION;
    }

    @Override
    public ResourceLocation getTextureResource(AK47Item item) {
        return TEXTURE_LOCATION;
    }

    @Override
    public ResourceLocation getAnimationResource(AK47Item item) {
        return ANIMATION_LOCATION;
    }
}
