package com.google.android.gms.internal;

import java.nio.charset.Charset;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class zzdtl<P> {
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private ConcurrentMap<String, List<zzdtm<P>>> zzmev = new ConcurrentHashMap();
    private zzdtm<P> zzmew;

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0070  */
    public final com.google.android.gms.internal.zzdtm<P> zza(P r6, com.google.android.gms.internal.zzdwp.zzb r7) {
        /*
        r5 = this;
        r0 = new com.google.android.gms.internal.zzdtm;
        r1 = com.google.android.gms.internal.zzdtc.zzmes;
        r2 = r7.zzbrr();
        r2 = r2.ordinal();
        r1 = r1[r2];
        r2 = 5;
        r3 = 1;
        if (r1 == r3) goto L_0x002f;
    L_0x0012:
        r4 = 2;
        if (r1 == r4) goto L_0x002f;
    L_0x0015:
        r4 = 3;
        if (r1 == r4) goto L_0x0026;
    L_0x0018:
        r2 = 4;
        if (r1 != r2) goto L_0x001e;
    L_0x001b:
        r1 = com.google.android.gms.internal.zzdtb.zzmer;
        goto L_0x0044;
    L_0x001e:
        r6 = new java.security.GeneralSecurityException;
        r7 = "unknown output prefix type";
        r6.<init>(r7);
        throw r6;
    L_0x0026:
        r1 = java.nio.ByteBuffer.allocate(r2);
        r1 = r1.put(r3);
        goto L_0x0038;
    L_0x002f:
        r1 = java.nio.ByteBuffer.allocate(r2);
        r2 = 0;
        r1 = r1.put(r2);
    L_0x0038:
        r2 = r7.zzbrq();
        r1 = r1.putInt(r2);
        r1 = r1.array();
    L_0x0044:
        r2 = r7.zzbrp();
        r7 = r7.zzbrr();
        r0.<init>(r6, r1, r2, r7);
        r6 = new java.util.ArrayList;
        r6.<init>();
        r6.add(r0);
        r7 = new java.lang.String;
        r1 = r0.zzboh();
        r2 = UTF_8;
        r7.<init>(r1, r2);
        r1 = r5.zzmev;
        r6 = java.util.Collections.unmodifiableList(r6);
        r6 = r1.put(r7, r6);
        r6 = (java.util.List) r6;
        if (r6 == 0) goto L_0x0084;
    L_0x0070:
        r1 = new java.util.ArrayList;
        r1.<init>();
        r1.addAll(r6);
        r1.add(r0);
        r6 = r5.zzmev;
        r1 = java.util.Collections.unmodifiableList(r1);
        r6.put(r7, r1);
    L_0x0084:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzdtl.zza(java.lang.Object, com.google.android.gms.internal.zzdwp$zzb):com.google.android.gms.internal.zzdtm");
    }

    /* Access modifiers changed, original: protected|final */
    public final void zza(zzdtm<P> zzdtm) {
        this.zzmew = zzdtm;
    }

    public final zzdtm<P> zzbof() {
        return this.zzmew;
    }
}
