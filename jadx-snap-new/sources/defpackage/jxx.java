package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: jxx */
public final class jxx implements hww {
    private Map<fth, hxh> a = null;

    public final Map<fth, hxh> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            String str = "ENABLED";
            builder.put(jxw.MDP_IMAGELOAD_PREDOWNLOAD_ENABLED, new hxh("MDP_IMAGELOAD_PREDOWNLOAD", str, true));
            builder.put(jxw.IMAGE_LOADING_CUSTOM_DOWNSAMPLER_ENABLED, new hxh("ANDROID_IMAGE_LOADING_DOWNSAMPLER", "CUSTOM_DOWNSAMPLER_ENABLED", true));
            builder.put(jxw.ENABLE_GLIDE_V4, new hxh("MDP_IMAGELOAD_GLIDE4", str, true));
            this.a = builder.build();
        }
        return this.a;
    }
}
