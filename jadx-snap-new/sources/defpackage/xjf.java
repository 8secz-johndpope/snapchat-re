package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: xjf */
public final class xjf implements wnh {
    private Map<fth, String> a = null;

    public final Map<fth, String> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(xjd.MALIBU_CAMERA_ENABLED, "camera-config-provider.malibu-enabled");
            builder.put(xjd.MEMORIES_DECODE_HEVC_MAIN_LEVEL51, "camera-config-provider.memories-decode-hevc-main-level51");
            this.a = builder.build();
        }
        return this.a;
    }
}
