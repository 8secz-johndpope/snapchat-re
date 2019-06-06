package defpackage;

import com.snap.core.db.api.SnapDb;

/* renamed from: wzy */
public final class wzy implements gqh {
    private final SnapDb a;
    private final ihh b;

    public wzy(SnapDb snapDb, ihh ihh) {
        akcr.b(snapDb, "snapDb");
        akcr.b(ihh, "clock");
        this.a = snapDb;
        this.b = ihh;
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0043  */
    public final java.lang.String a(java.lang.String r7) {
        /*
        r6 = this;
        r0 = "original";
        defpackage.akcr.b(r7, r0);
        r0 = r6.b;
        r0 = r0.a();
        r2 = java.util.concurrent.TimeUnit.SECONDS;
        r3 = 10;
        r2 = r2.toMillis(r3);
        r2 = r0 - r2;
        r4 = new akeb;
        r4.<init>(r2, r0);
        r0 = r6.a;
        r0 = r0.getTransactionTracker();
        r0 = r0.getBiggestBlocker(r4);
        if (r0 == 0) goto L_0x0032;
    L_0x0026:
        r1 = r0.getRunningRange();
        if (r1 == 0) goto L_0x0032;
    L_0x002c:
        r2 = r1.b;
        r4 = r1.a;
        r2 = r2 - r4;
        goto L_0x0034;
    L_0x0032:
        r2 = 0;
    L_0x0034:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1.append(r7);
        r7 = " largest transaction: ";
        r1.append(r7);
        if (r0 == 0) goto L_0x0048;
    L_0x0043:
        r7 = r0.getTag();
        goto L_0x0049;
    L_0x0048:
        r7 = 0;
    L_0x0049:
        r1.append(r7);
        r7 = 32;
        r1.append(r7);
        r1.append(r2);
        r7 = "ms";
        r1.append(r7);
        r7 = r1.toString();
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wzy.a(java.lang.String):java.lang.String");
    }
}
