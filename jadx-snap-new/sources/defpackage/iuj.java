package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: iuj */
public final class iuj implements hxn {
    private Map<fth, hxo> a = null;

    public final Map<fth, hxo> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(iui.TOS_VERSION_6_ACCEPTED, new hxo("tos_version_6_accepted", hxr.CLIENT_PROPERTY));
            builder.put(iui.TOS_VERSION_7_ACCEPTED, new hxo("tos_version_7_accepted", hxr.CLIENT_PROPERTY));
            builder.put(iui.SEEN_PRIVACY_POLICY_GDPR, new hxo("seen_privacy_policy_gdpr", hxr.FEATURE_SETTING));
            builder.put(iui.SHOW_PRIVACY_POLICY_GDPR, new hxo("show_privacy_policy_gdpr", hxr.FEATURE_SETTING));
            this.a = builder.build();
        }
        return this.a;
    }
}
