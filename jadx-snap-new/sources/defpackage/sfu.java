package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: sfu */
public final class sfu implements hww {
    private Map<fth, hxh> a = null;

    public final Map<fth, hxh> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(sft.DISABLE_NOTIFICATION_AUTO_BUNDLING, new hxh("ANDROID_MUSHROOM_GROUP_NOTIFICATIONS", "ENABLED", true));
            this.a = builder.build();
        }
        return this.a;
    }
}
