package defpackage;

import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.SnapDb;

/* renamed from: wni */
public final class wni {
    final tnd a;
    final wnj b;
    private final tng c;
    private final DbClient d;

    public wni(wnj wnj, tnd tnd, tng tng, SnapDb snapDb) {
        this.b = wnj;
        this.a = tnd;
        this.c = tng;
        this.d = snapDb.getDbClient(ftf.a.callsite("ServerConfiguration"));
    }

    private defpackage.tnj.a a(defpackage.tnj.a r7, java.lang.Iterable<java.util.Map.Entry<java.lang.String, ?>> r8) {
        /*
        r6 = this;
        r8 = r8.iterator();
    L_0x0004:
        r0 = r8.hasNext();
        if (r0 == 0) goto L_0x00d2;
    L_0x000a:
        r0 = r8.next();
        r0 = (java.util.Map.Entry) r0;
        r1 = r6.b;
        r2 = r0.getKey();
        r2 = (java.lang.String) r2;
        r1 = r1.a;
        r1 = r1.get(r2);
        r1 = (defpackage.fth) r1;
        r0 = r0.getValue();
        if (r1 == 0) goto L_0x0004;
    L_0x0026:
        r2 = r1.a();	 Catch:{ Exception -> 0x00b5 }
        r2 = r2.b;	 Catch:{ Exception -> 0x00b5 }
        r3 = 0;
        if (r0 != 0) goto L_0x0031;
    L_0x002f:
        r2 = r3;
        goto L_0x0092;
    L_0x0031:
        r4 = defpackage.wni.1.a;	 Catch:{ Exception -> 0x00b5 }
        r5 = r2.ordinal();	 Catch:{ Exception -> 0x00b5 }
        r4 = r4[r5];	 Catch:{ Exception -> 0x00b5 }
        switch(r4) {
            case 1: goto L_0x0074;
            case 2: goto L_0x0068;
            case 3: goto L_0x005c;
            case 4: goto L_0x0050;
            case 5: goto L_0x0044;
            case 6: goto L_0x003f;
            default: goto L_0x003c;
        };	 Catch:{ Exception -> 0x00b5 }
    L_0x003c:
        r7 = new java.lang.UnsupportedOperationException;	 Catch:{ Exception -> 0x00b5 }
        goto L_0x00a7;
    L_0x003f:
        r2 = r0.toString();	 Catch:{ Exception -> 0x00b5 }
        goto L_0x0092;
    L_0x0044:
        r2 = r0;
        r2 = (java.lang.Number) r2;	 Catch:{ Exception -> 0x00b5 }
        r2 = r2.doubleValue();	 Catch:{ Exception -> 0x00b5 }
        r2 = java.lang.Double.valueOf(r2);	 Catch:{ Exception -> 0x00b5 }
        goto L_0x0092;
    L_0x0050:
        r2 = r0;
        r2 = (java.lang.Number) r2;	 Catch:{ Exception -> 0x00b5 }
        r2 = r2.floatValue();	 Catch:{ Exception -> 0x00b5 }
        r2 = java.lang.Float.valueOf(r2);	 Catch:{ Exception -> 0x00b5 }
        goto L_0x0092;
    L_0x005c:
        r2 = r0;
        r2 = (java.lang.Number) r2;	 Catch:{ Exception -> 0x00b5 }
        r2 = r2.longValue();	 Catch:{ Exception -> 0x00b5 }
        r2 = java.lang.Long.valueOf(r2);	 Catch:{ Exception -> 0x00b5 }
        goto L_0x0092;
    L_0x0068:
        r2 = r0;
        r2 = (java.lang.Number) r2;	 Catch:{ Exception -> 0x00b5 }
        r2 = r2.intValue();	 Catch:{ Exception -> 0x00b5 }
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ Exception -> 0x00b5 }
        goto L_0x0092;
    L_0x0074:
        r2 = r0 instanceof java.lang.Number;	 Catch:{ Exception -> 0x00b5 }
        if (r2 == 0) goto L_0x008d;
    L_0x0078:
        r2 = r0;
        r2 = (java.lang.Number) r2;	 Catch:{ Exception -> 0x00b5 }
        r2 = r2.intValue();	 Catch:{ Exception -> 0x00b5 }
        if (r2 == 0) goto L_0x002f;
    L_0x0081:
        r3 = 1;
        if (r2 == r3) goto L_0x008a;
    L_0x0084:
        r3 = 2;
        if (r2 != r3) goto L_0x0097;
    L_0x0087:
        r2 = java.lang.Boolean.FALSE;	 Catch:{ Exception -> 0x00b5 }
        goto L_0x0092;
    L_0x008a:
        r2 = java.lang.Boolean.TRUE;	 Catch:{ Exception -> 0x00b5 }
        goto L_0x0092;
    L_0x008d:
        r2 = r0 instanceof java.lang.Boolean;	 Catch:{ Exception -> 0x00b5 }
        if (r2 == 0) goto L_0x0097;
    L_0x0091:
        r2 = r0;
    L_0x0092:
        r7.a(r1, r2);	 Catch:{ Exception -> 0x00b5 }
        goto L_0x0004;
    L_0x0097:
        r7 = new java.lang.IllegalArgumentException;	 Catch:{ Exception -> 0x00b5 }
        r8 = "Cannot find boolean value for ";
        r2 = java.lang.String.valueOf(r0);	 Catch:{ Exception -> 0x00b5 }
        r8 = r8.concat(r2);	 Catch:{ Exception -> 0x00b5 }
        r7.<init>(r8);	 Catch:{ Exception -> 0x00b5 }
        throw r7;	 Catch:{ Exception -> 0x00b5 }
    L_0x00a7:
        r8 = "Unknown type: ";
        r2 = java.lang.String.valueOf(r2);	 Catch:{ Exception -> 0x00b5 }
        r8 = r8.concat(r2);	 Catch:{ Exception -> 0x00b5 }
        r7.<init>(r8);	 Catch:{ Exception -> 0x00b5 }
        throw r7;	 Catch:{ Exception -> 0x00b5 }
    L_0x00b5:
        r7 = move-exception;
        r8 = new java.lang.IllegalStateException;
        r2 = new java.lang.StringBuilder;
        r3 = "Invalid value ";
        r2.<init>(r3);
        r2.append(r0);
        r0 = " for key ";
        r2.append(r0);
        r2.append(r1);
        r0 = r2.toString();
        r8.<init>(r0, r7);
        throw r8;
    L_0x00d2:
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wni.a(tnj$a, java.lang.Iterable):tnj$a");
    }

    public final ajcx a(aglb aglb) {
        Iterable concat = Iterables.concat(Maps.transformValues(aglb.d, -$$Lambda$wni$DBRQGLBXgxGXOHN2iJSsodjbbNM.INSTANCE).entrySet(), Maps.transformValues(aglb.b, -$$Lambda$wni$QiAWvobOxm_kVLSaqw0Gm2NQmVk.INSTANCE).entrySet(), Maps.transformValues(aglb.c, -$$Lambda$wni$4MDlPWUwKHBm9o3MwClmKza50mg.INSTANCE).entrySet(), Maps.transformValues(aglb.a, -$$Lambda$wni$hwg9VliEE0UBKp9bW5uB2N1DUdA.INSTANCE).entrySet());
        return this.d.runInTransactionCompat("ServerConfiguration:updateServerConfigs", new -$$Lambda$wni$ahociuAgkwrtKzyGvMzM2hfu8L4(this, concat));
    }
}
