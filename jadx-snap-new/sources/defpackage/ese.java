package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: ese */
public final class ese implements hww {
    private Map<fth, hxh> a = null;

    public final Map<fth, hxh> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(esd.ENABLE_FRIEND_CHARMS, new hxh("PX_CHARMS_AND_SAVED_MEDIA_ANDROID", "friend_charms_enabled", true));
            builder.put(esd.ENABLE_GROUP_CHARMS, new hxh("PX_UP_CHARMS_ANDROID", "ENABLE_GROUP_CHARMS", true));
            this.a = builder.build();
        }
        return this.a;
    }
}
