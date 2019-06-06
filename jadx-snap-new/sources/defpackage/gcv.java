package defpackage;

import java.util.Set;

/* renamed from: gcv */
public final class gcv {
    static final Set<String> a = ajzt.a((Object[]) new String[]{"ms-staging.sc-jpl.com", "ms.sc-jpl.com", "am-staging.sc-jpl.com", "am-prod.sc-jpl.com", "ps-lb.sc-jpl.com", "st.sc-jpl.com", "st-lb.sc-jpl.com", "loc.sc-jpl.com", "loc-staging.sc-jpl.com", "weather.sc-jpl.com", "loca.sc-jpl.com", "loca-staging.sc-jpl.com"});
    static final Set<String> b;
    static final Set<String> c = ajzt.a((Object[]) new String[]{"api.snapchat.com", "api.sc-gw.com", "gateway.snapchat.com", "gateway.sc-gw.com", "sc-gw-dev.snapchat.com", "sc-gw-dev.com"});
    static final Set<String> d = ajzt.a((Object[]) new String[]{"snapchat.com", "snapads.com", "sc-jpl.com", "sc-jpl.net", "sc-cdn.net", "sc-prod.net", "sc-gw.com", "sc-gw-dev.com"});
    static final Set<String> e = ajzt.a((Object[]) new String[]{utp.a, "mvm.snapchat.com", "se.snapchat.com", "sks.snapchat.com", "auth.snapchat.com", "snapchat-payments-gateway.snapchat.com", "storage.googleapis.com", "geofilter.storage.googleapis.com", "lens-storage.storage.googleapis.com", "goog.sc-cdn.net", "gcdn-st.sc-cdn.net", "gcs.sc-cdn.net", "s.sc-cdn.net", "bolt-gcdn.sc-cdn.net"});

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0059  */
    static {
        /*
        r0 = "ms-staging.sc-jpl.com";
        r1 = "ms.sc-jpl.com";
        r2 = "am-staging.sc-jpl.com";
        r3 = "am-prod.sc-jpl.com";
        r4 = "ps-lb.sc-jpl.com";
        r5 = "st.sc-jpl.com";
        r6 = "st-lb.sc-jpl.com";
        r7 = "loc.sc-jpl.com";
        r8 = "loc-staging.sc-jpl.com";
        r9 = "weather.sc-jpl.com";
        r10 = "loca.sc-jpl.com";
        r11 = "loca-staging.sc-jpl.com";
        r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11};
        r0 = defpackage.ajzt.a(r0);
        a = r0;
        r0 = "ms.sc-jpl-internal.com";
        defpackage.ajzs.a(r0);
        r0 = 2;
        r0 = new java.lang.String[r0];
        r1 = "https://app.snapchat.com";
        r1 = android.net.Uri.parse(r1);
        r2 = "null cannot be cast to non-null type java.lang.String";
        r3 = "(this as java.lang.String).toLowerCase()";
        r4 = 0;
        if (r1 == 0) goto L_0x004d;
    L_0x0037:
        r1 = r1.getHost();
        if (r1 == 0) goto L_0x004d;
    L_0x003d:
        if (r1 == 0) goto L_0x0047;
    L_0x003f:
        r1 = r1.toLowerCase();
        defpackage.akcr.a(r1, r3);
        goto L_0x004e;
    L_0x0047:
        r0 = new ajxt;
        r0.<init>(r2);
        throw r0;
    L_0x004d:
        r1 = r4;
    L_0x004e:
        r5 = 0;
        r0[r5] = r1;
        r1 = "https://auth.snapchat.com";
        r1 = android.net.Uri.parse(r1);
        if (r1 == 0) goto L_0x006f;
    L_0x0059:
        r1 = r1.getHost();
        if (r1 == 0) goto L_0x006f;
    L_0x005f:
        if (r1 == 0) goto L_0x0069;
    L_0x0061:
        r4 = r1.toLowerCase();
        defpackage.akcr.a(r4, r3);
        goto L_0x006f;
    L_0x0069:
        r0 = new ajxt;
        r0.<init>(r2);
        throw r0;
    L_0x006f:
        r1 = 1;
        r0[r1] = r4;
        r0 = defpackage.ajzt.a(r0);
        b = r0;
        r1 = "api.snapchat.com";
        r2 = "api.sc-gw.com";
        r3 = "gateway.snapchat.com";
        r4 = "gateway.sc-gw.com";
        r5 = "sc-gw-dev.snapchat.com";
        r6 = "sc-gw-dev.com";
        r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6};
        r0 = defpackage.ajzt.a(r0);
        c = r0;
        r1 = "snapchat.com";
        r2 = "snapads.com";
        r3 = "sc-jpl.com";
        r4 = "sc-jpl.net";
        r5 = "sc-cdn.net";
        r6 = "sc-prod.net";
        r7 = "sc-gw.com";
        r8 = "sc-gw-dev.com";
        r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8};
        r0 = defpackage.ajzt.a(r0);
        d = r0;
        r1 = "app.snapchat.com";
        r2 = "mvm.snapchat.com";
        r3 = "se.snapchat.com";
        r4 = "sks.snapchat.com";
        r5 = "auth.snapchat.com";
        r6 = "snapchat-payments-gateway.snapchat.com";
        r7 = "storage.googleapis.com";
        r8 = "geofilter.storage.googleapis.com";
        r9 = "lens-storage.storage.googleapis.com";
        r10 = "goog.sc-cdn.net";
        r11 = "gcdn-st.sc-cdn.net";
        r12 = "gcs.sc-cdn.net";
        r13 = "s.sc-cdn.net";
        r14 = "bolt-gcdn.sc-cdn.net";
        r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14};
        r0 = defpackage.ajzt.a(r0);
        e = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gcv.<clinit>():void");
    }
}
