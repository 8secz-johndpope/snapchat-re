package com.google.android.gms.common;

import android.content.Context;

final class zzg {
    private static final Object zzfrb = new Object();
    private static Context zzfrc;

    /* JADX WARNING: Missing block: B:12:0x0019, code skipped:
            return;
     */
    static synchronized void zzch(android.content.Context r2) {
        /*
        r0 = com.google.android.gms.common.zzg.class;
        monitor-enter(r0);
        r1 = zzfrc;	 Catch:{ all -> 0x001a }
        if (r1 != 0) goto L_0x0011;
    L_0x0007:
        if (r2 == 0) goto L_0x0018;
    L_0x0009:
        r2 = r2.getApplicationContext();	 Catch:{ all -> 0x001a }
        zzfrc = r2;	 Catch:{ all -> 0x001a }
        monitor-exit(r0);
        return;
    L_0x0011:
        r2 = "GoogleCertificates";
        r1 = "GoogleCertificates has been initialized already";
        android.util.Log.w(r2, r1);	 Catch:{ all -> 0x001a }
    L_0x0018:
        monitor-exit(r0);
        return;
    L_0x001a:
        r2 = move-exception;
        monitor-exit(r0);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.zzg.zzch(android.content.Context):void");
    }
}
