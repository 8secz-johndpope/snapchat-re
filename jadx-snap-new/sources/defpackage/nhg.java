package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: nhg */
public final class nhg implements hxn {
    private Map<fth, hxo> a = null;

    public final Map<fth, hxo> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(nhf.LOGIN_KIT_PRIVACY_EXPLAINER_LAST_SEEN, new hxo("snap_kit_login_kit_privacy_explainer_last_seen_timestamp_millis", hxr.CLIENT_PROPERTY));
            this.a = builder.build();
        }
        return this.a;
    }
}
