package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.common.collect.Lists;
import com.mapbox.services.android.telemetry.constants.TelemetryConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: zyn */
public final class zyn extends zym {
    private static final Long h;
    private static final Boolean i = Boolean.FALSE;
    private static final List<String> j = new ArrayList();
    private static final List<zyq> k;
    private static final Map<aavd, List<String>> l;
    private static final Double m = Double.valueOf(0.0d);
    private static final Long n = Long.valueOf(1000);
    private static final Long o;

    static {
        Long valueOf = Long.valueOf(15000);
        Long l = valueOf;
        Long l2 = valueOf;
        h = valueOf;
        Object[] objArr = new zyq[3];
        ImmutableMap build = new Builder().put(zyo.PROD, "https://sc-analytics.appspot.com/analytics/bz").put(zyo.STAGING, "https://staging2-dot-sc-analytics.appspot.com/analytics/bz").build();
        Long valueOf2 = Long.valueOf(10);
        Long valueOf3 = Long.valueOf(TelemetryConstants.FLUSH_DELAY_MS);
        Long l3 = valueOf3;
        Long l4 = valueOf3;
        Long valueOf4 = Long.valueOf(30000);
        Long l5 = valueOf4;
        Long l6 = valueOf4;
        Long l7 = valueOf4;
        valueOf4 = Long.valueOf(60000);
        Long l8 = valueOf4;
        Long l9 = valueOf4;
        Long l10 = valueOf4;
        valueOf4 = Long.valueOf(5000);
        Long l11 = valueOf4;
        Long l12 = valueOf4;
        Long l13 = valueOf4;
        Long l14 = valueOf4;
        Long l15 = valueOf4;
        Long l16 = valueOf4;
        Long valueOf5 = Long.valueOf(500);
        valueOf4 = Long.valueOf(0);
        Long l17 = valueOf4;
        Long l18 = valueOf4;
        Long l19 = valueOf4;
        Long l20 = valueOf4;
        Long l21 = valueOf4;
        Long l22 = valueOf4;
        Long l23 = valueOf4;
        Long l24 = valueOf4;
        Long l25 = valueOf4;
        Long l26 = valueOf4;
        Long l27 = valueOf4;
        Long l28 = valueOf4;
        zyp zyp = zyp.FORCE;
        Long valueOf6 = Long.valueOf(100);
        valueOf4 = Long.valueOf(20);
        Long l29 = valueOf4;
        Long l30 = valueOf4;
        Long l31 = valueOf4;
        Long l32 = valueOf4;
        Long l33 = valueOf4;
        Long l34 = valueOf4;
        Boolean bool = Boolean.FALSE;
        ArrayList arrayList = r4;
        ArrayList arrayList2 = new ArrayList();
        objArr[0] = new zyq("", build, valueOf2, l4, l7, l10, l15, l16, valueOf5, l25, l27, l24, l28, l23, zyp, valueOf6, l34, l33, bool, arrayList, l26);
        String str = "https://app-analytics.snapchat.com/analytics/bz";
        String str2 = "https://staging.app-analytics.snapchat.com/analytics/bz";
        ImmutableMap build2 = new Builder().put(zyo.PROD, str).put(zyo.STAGING, str2).build();
        Long valueOf7 = Long.valueOf(10);
        Long valueOf8 = Long.valueOf(500);
        zyp zyp2 = zyp.FORCE;
        Long valueOf9 = Long.valueOf(100);
        Boolean bool2 = Boolean.FALSE;
        ArrayList arrayList3 = r2;
        ArrayList arrayList4 = new ArrayList();
        objArr[1] = new zyq("shadow", build2, valueOf7, l3, l6, l9, l13, l14, valueOf8, l17, l19, l21, l22, l20, zyp2, valueOf9, l31, l32, bool2, arrayList3, l18);
        ImmutableMap build3 = new Builder().put(zyo.PROD, str).put(zyo.STAGING, str2).build();
        Long valueOf10 = Long.valueOf(30);
        Long valueOf11 = Long.valueOf(500);
        Long valueOf12 = Long.valueOf(Long.MAX_VALUE);
        Long valueOf13 = Long.valueOf(Long.MAX_VALUE);
        Long valueOf14 = Long.valueOf(Long.MAX_VALUE);
        Long valueOf15 = Long.valueOf(3600000);
        zyp zyp3 = zyp.NEVER;
        Long valueOf16 = Long.valueOf(100);
        Boolean bool3 = Boolean.FALSE;
        ArrayList arrayList5 = r3;
        ArrayList arrayList6 = new ArrayList();
        objArr[2] = new zyq("gce_best_effort", build3, valueOf10, l, l5, l8, l11, l12, valueOf11, valueOf12, l2, valueOf13, valueOf14, valueOf15, zyp3, valueOf16, l30, l29, bool3, arrayList5, Long.valueOf(2));
        k = Lists.newArrayList(objArr);
        String str3 = "";
        String str4 = "shadow";
        l = new Builder().put(aavd.BUSINESS, Lists.newArrayList(str4, str3)).put(aavd.BUSINESS_CRITICAL, Lists.newArrayList(str4, str3)).put(aavd.BEST_EFFORT, Lists.newArrayList("gce_best_effort")).put(aavd.OPS, Lists.newArrayList(str4)).put(aavd.TIER0, Lists.newArrayList(str4, str3)).build();
        o = valueOf3;
    }

    public zyn() {
        super(h, i, j, k, l, m, "local_v2", n, o);
    }
}
