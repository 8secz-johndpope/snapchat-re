package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: rhb */
public final class rhb implements hxn {
    private Map<fth, hxo> a = null;

    public final Map<fth, hxo> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(rgz.HAS_SEEN_SNAPPABLES_PRIVACY_ALERT, new hxo("snappables_seen_privacy_alert", hxr.FEATURE_SETTING));
            builder.put(rgz.HAS_SEEN_SEND_TO_QUICK_ADD_DIALOG, new hxo("send_to_quick_add_seen_dialog", hxr.FEATURE_SETTING));
            this.a = builder.build();
        }
        return this.a;
    }
}
