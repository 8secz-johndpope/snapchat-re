package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: wre */
public final class wre implements hxn {
    private Map<fth, hxo> a = null;

    public final Map<fth, hxo> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(wrc.S2R_ELIGIBILITY_IN_PROD, new hxo("s2r_eligibility_in_prod", hxr.FEATURE_SETTING));
            builder.put(wrc.S2R_ENABLED, new hxo("s2r_enabled", hxr.FEATURE_SETTING));
            builder.put(wrc.IN_SETTING_REPORT_OUTAGE_BANNER_KEY, new hxo("in_setting_report_outage_banner_key", hxr.FEATURE_SETTING));
            this.a = builder.build();
        }
        return this.a;
    }
}
