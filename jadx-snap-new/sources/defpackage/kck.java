package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: kck */
public final class kck implements hww {
    private Map<fth, hxh> a = null;

    public final Map<fth, hxh> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(kcj.SNAP_PRO_COMPOSER_MANAGEMENT_ENABLED, new hxh("COMPOSER_MANAGEMENT_AB_ANDROID", "ENABLED", true));
            String str = "enabled";
            builder.put(kcj.SNAP_PRO_PUBLISHER_PROFILE_ENABLED, new hxh("IMPALA_PUBLISHER_PROFILES_ANDROID", str, true));
            builder.put(kcj.LENS_PROFILE_ENABLED, new hxh("IMPALA_LENS_CREATOR_PROFILES_ANDROID", str, true));
            builder.put(kcj.FRIENDSHIP_PROFILE_PUBLIC_PROFILE_ENTRY_POINT_ENABLED, new hxh("IMPALA_FRIENDSHIP_PROFILE_ENTRY_POINT_ANDROID", str, true));
            this.a = builder.build();
        }
        return this.a;
    }
}
