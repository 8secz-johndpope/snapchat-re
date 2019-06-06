package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: rxr */
public final class rxr implements hxn {
    private Map<fth, hxo> a = null;

    public final Map<fth, hxo> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(rxp.TRAVEL_MODE_ENABLED, new hxo("travel_mode", hxr.FEATURE_SETTING));
            builder.put(rxp.DATA_SAVER_EXPIRATION_MILLIS, new hxo("data_saver_expiration_millis", hxr.FEATURE_SETTING));
            builder.put(rxp.LAST_DATA_SAVER_MODE_INTRO_PROMPT_MILLIS, new hxo("last_data_saver_mode_intro_prompt_millis", hxr.FEATURE_SETTING));
            this.a = builder.build();
        }
        return this.a;
    }
}
