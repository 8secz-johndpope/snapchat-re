package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: ciq */
public final class ciq implements evf {
    private Map<fth, String> a = null;

    public final Map<fth, String> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(cip.USER_AD_ID_TTL_MS, "user_ad_id_ttl_millis");
            builder.put(cip.RAW_USER_DATA_TTL_MS, "raw_user_ad_data_ttl_millis");
            this.a = builder.build();
        }
        return this.a;
    }
}
