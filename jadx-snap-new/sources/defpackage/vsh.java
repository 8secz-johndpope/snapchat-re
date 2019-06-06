package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: vsh */
public final class vsh implements hww {
    private Map<fth, hxh> a = null;

    public final Map<fth, hxh> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            String str = "enabled";
            builder.put(vsg.TWEAK_ENABLE_CREATOR_PROFILE, new hxh("IMPALA_LENS_CREATOR_PROFILES_ANDROID", str, true));
            builder.put(vsg.LENS_EXPLORER_NATIVE_ENABLED, new hxh("LENS_MUSHROOM_NATIVE_LENS_EXPLORER", str, true));
            this.a = builder.build();
        }
        return this.a;
    }
}
