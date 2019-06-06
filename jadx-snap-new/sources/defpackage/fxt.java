package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: fxt */
public final class fxt implements hww {
    private Map<fth, hxh> a = null;

    public final Map<fth, hxh> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(fxs.FINISH_ACTIVITY_ON_BACK, new hxh("finish_activity_on_back", "enabled", true));
            String str = "ENABLED";
            builder.put(fxs.NO_ANIMATION_MODE, new hxh("LOW_END_DEVICE_NO_ANIMATION_AB", str, true));
            String str2 = "DECK_PAGE_PURGE_CLIENT";
            builder.put(fxs.DECK_PAGE_BACKGROUND_PURGE_TIMEOUT_MIN, new hxh(str2, "BACKGROUND_PURGE_TIMEOUT_MIN", true));
            builder.put(fxs.DECK_PAGE_BACKGROUND_PURGE_PAGE_TYPES, new hxh(str2, "BACKGROUND_PURGE_PAGE_TYPES", true));
            builder.put(fxs.DECK_APP_STATE_MANAGEMENT, new hxh("DECK_APP_STATE_MANAGEMENT", str, true));
            builder.put(fxs.V_ELEVEN_MODE, new hxh("V11_Android", str, true));
            builder.put(fxs.INSETS_DETECTOR_V2, new hxh("INSETS_DETECTOR_V2", str, true));
            this.a = builder.build();
        }
        return this.a;
    }
}
