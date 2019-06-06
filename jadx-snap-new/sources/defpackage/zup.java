package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: zup */
public final class zup implements hww {
    private Map<fth, hxh> a = null;

    public final Map<fth, hxh> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            String str = "ENABLED";
            String str2 = "MUSHROOM_LIBJPEG_IMAGE_ENCODING_BY_NETWORK";
            builder.put(zun.LIBJPEG_IMAGE_ENCODING_BY_NETWORK_ENABLED, new hxh(str2, str, true));
            builder.put(zun.LIBJPEG_IMAGE_ENCODING_USE_UPLOAD_BANDWIDTH, new hxh(str2, "USE_UPLOAD_BANDWIDTH", true));
            builder.put(zun.LIBJPEG_IMAGE_ENCODING_MID_QUALITY_MIN_BITPS, new hxh(str2, "MID_QUALITY_MIN_BITPS", true));
            builder.put(zun.LIBJPEG_IMAGE_ENCODING_HIGH_QUALITY_MIN_BITPS, new hxh(str2, "HIGH_QUALITY_MIN_BITPS", true));
            builder.put(zun.LIBJPEG_IMAGE_ENCODING_MID_RESOLUTION_MIN_BITPS, new hxh(str2, "MID_RESOLUTION_MIN_BITPS", true));
            builder.put(zun.LIBJPEG_IMAGE_ENCODING_HIGH_RESOLUTION_MIN_BITPS, new hxh(str2, "HIGH_RESOLUTION_MIN_BITPS", true));
            str2 = "LIBJPEG_IMAGE_ENCODING_BY_SOURCE";
            builder.put(zun.LIBJPEG_IMAGE_ENCODING_BY_SOURCE_ENABLED, new hxh(str2, str, true));
            builder.put(zun.LIBJPEG_IMAGE_ENCODING_BY_SOURCE_QUALITY, new hxh(str2, "QUALITY", true));
            builder.put(zun.LIBJPEG_IMAGE_ENCODING_BY_SOURCE_RESOLUTION, new hxh(str2, "RESOLUTION", true));
            builder.put(zun.USE_BOLT_FOR_UPLOAD, new hxh("BOLT_UPLOAD_MUSHROOM_INTEGRATION", "use_bolt_for_upload", true));
            builder.put(zun.MDP_PERSIST_UPLOAD_STATE_ANDROID, new hxh("MDP_PERSIST_UPLOAD_STATE_ANDROID", str, true));
            this.a = builder.build();
        }
        return this.a;
    }
}
