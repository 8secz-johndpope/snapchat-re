package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: zuq */
public final class zuq implements wnh {
    private Map<fth, String> a = null;

    public final Map<fth, String> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(zun.DEFAULT_UPLOAD_LIBJPEG_IMAGE_ENCODING_QUALITY, "camera-config-provider.jpeg-encoding-quality-libjpeg");
            builder.put(zun.LIBJPEG_IMAGE_ENCODING_LOW_QUALITY, "camera-config-provider.libjpeg-image-encoding-low-quality");
            builder.put(zun.LIBJPEG_IMAGE_ENCODING_MID_QUALITY, "camera-config-provider.libjpeg-image-encoding-mid-quality");
            builder.put(zun.LIBJPEG_IMAGE_ENCODING_HIGH_QUALITY, "camera-config-provider.libjpeg-image-encoding-high-quality");
            builder.put(zun.LIBJPEG_IMAGE_ENCODING_LOW_RESOLUTION, "camera-config-provider.libjpeg-image-encoding-low-resolution");
            builder.put(zun.LIBJPEG_IMAGE_ENCODING_MID_RESOLUTION, "camera-config-provider.libjpeg-image-encoding-mid-resolution");
            builder.put(zun.LIBJPEG_IMAGE_ENCODING_HIGH_RESOLUTION, "camera-config-provider.libjpeg-image-encoding-high-resolution");
            builder.put(zun.LIBJPEG_IMAGE_ENCODING_BY_NETWORK_ENABLED, "camera-config-provider.mushroom-network-aware-image-encoding-enabled");
            builder.put(zun.LIBJPEG_IMAGE_ENCODING_USE_UPLOAD_BANDWIDTH, "camera-config-provider.mushroom-network-aware-image-encoding-use-upload-bandwidth");
            builder.put(zun.LIBJPEG_IMAGE_ENCODING_MID_QUALITY_MIN_BITPS, "camera-config-provider.mushroom-network-aware-image-encoding-mid-quality-min-bitps");
            builder.put(zun.LIBJPEG_IMAGE_ENCODING_HIGH_QUALITY_MIN_BITPS, "camera-config-provider.mushroom-network-aware-image-encoding-high-quality-min-bitps");
            builder.put(zun.LIBJPEG_IMAGE_ENCODING_MID_RESOLUTION_MIN_BITPS, "camera-config-provider.mushroom-network-aware-image-encoding-mid-resolution-min-bitps");
            builder.put(zun.LIBJPEG_IMAGE_ENCODING_HIGH_RESOLUTION_MIN_BITPS, "camera-config-provider.mushroom-network-aware-image-encoding-high-resolution-min-bitps");
            this.a = builder.build();
        }
        return this.a;
    }
}
