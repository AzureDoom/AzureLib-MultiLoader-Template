package mod.azure.renameme;

import mod.azure.azurelib.common.api.client.renderer.GeoItemRenderer;

public class AK47ItemRenderer extends GeoItemRenderer<AK47Item> {
    public AK47ItemRenderer() {
        super(new AK47Model());
    }
}