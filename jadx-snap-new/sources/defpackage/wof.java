package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: wof */
public final class wof implements hww {
    private Map<fth, hxh> a = null;

    public final Map<fth, hxh> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(woe.SETTINGS_V2, new hxh("SETTINGS_ANDROID_V2", "ENABLE", true));
            this.a = builder.build();
        }
        return this.a;
    }
}
