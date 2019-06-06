package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: gvu */
public final class gvu implements evf {
    private Map<fth, String> a = null;

    public final Map<fth, String> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(gvt.COF_FEED_REFRESH_INTERVAL_IN_MS, "df_client_feed_refresh_interval_in_ms");
            this.a = builder.build();
        }
        return this.a;
    }
}
