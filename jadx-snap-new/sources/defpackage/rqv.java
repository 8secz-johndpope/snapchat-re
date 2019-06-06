package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: rqv */
public final class rqv implements hww {
    private Map<fth, hxh> a = null;

    public final Map<fth, hxh> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(rqu.IS_LOCK_SCREEN_EXPERIENCE_ENABLED, new hxh("Lock_Screen_Call_Experience", "ENABLED", true));
            this.a = builder.build();
        }
        return this.a;
    }
}
