package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.ConditionVariable;

@zzabh
public final class zzog {
    private final Object mLock = new Object();
    private volatile boolean zzarf = false;
    private final ConditionVariable zzbkw = new ConditionVariable();
    private SharedPreferences zzbkx = null;
    private Context zzbky;

    /* JADX WARNING: Missing block: B:25:0x0033, code skipped:
            return;
     */
    public final void initialize(android.content.Context r4) {
        /*
        r3 = this;
        r0 = r3.zzarf;
        if (r0 == 0) goto L_0x0005;
    L_0x0004:
        return;
    L_0x0005:
        r0 = r3.mLock;
        monitor-enter(r0);
        r1 = r3.zzarf;	 Catch:{ all -> 0x0051 }
        if (r1 == 0) goto L_0x000e;
    L_0x000c:
        monitor-exit(r0);	 Catch:{ all -> 0x0051 }
        return;
    L_0x000e:
        r1 = r4.getApplicationContext();	 Catch:{ all -> 0x0051 }
        if (r1 != 0) goto L_0x0016;
    L_0x0014:
        r1 = r4;
        goto L_0x001a;
    L_0x0016:
        r1 = r4.getApplicationContext();	 Catch:{ all -> 0x0051 }
    L_0x001a:
        r3.zzbky = r1;	 Catch:{ all -> 0x0051 }
        r1 = com.google.android.gms.common.zzs.getRemoteContext(r4);	 Catch:{ all -> 0x004a }
        if (r1 != 0) goto L_0x002b;
    L_0x0022:
        if (r4 == 0) goto L_0x002b;
    L_0x0024:
        r1 = r4.getApplicationContext();	 Catch:{ all -> 0x004a }
        if (r1 != 0) goto L_0x002b;
    L_0x002a:
        r1 = r4;
    L_0x002b:
        if (r1 != 0) goto L_0x0034;
    L_0x002d:
        r4 = r3.zzbkw;	 Catch:{ all -> 0x0051 }
        r4.open();	 Catch:{ all -> 0x0051 }
        monitor-exit(r0);	 Catch:{ all -> 0x0051 }
        return;
    L_0x0034:
        com.google.android.gms.internal.zzlc.zzim();	 Catch:{ all -> 0x004a }
        r4 = "google_ads_flags";
        r2 = 0;
        r4 = r1.getSharedPreferences(r4, r2);	 Catch:{ all -> 0x004a }
        r3.zzbkx = r4;	 Catch:{ all -> 0x004a }
        r4 = 1;
        r3.zzarf = r4;	 Catch:{ all -> 0x004a }
        r4 = r3.zzbkw;	 Catch:{ all -> 0x0051 }
        r4.open();	 Catch:{ all -> 0x0051 }
        monitor-exit(r0);	 Catch:{ all -> 0x0051 }
        return;
    L_0x004a:
        r4 = move-exception;
        r1 = r3.zzbkw;	 Catch:{ all -> 0x0051 }
        r1.open();	 Catch:{ all -> 0x0051 }
        throw r4;	 Catch:{ all -> 0x0051 }
    L_0x0051:
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0051 }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzog.initialize(android.content.Context):void");
    }

    public final <T> T zzd(zzny<T> zzny) {
        if (this.zzbkw.block(5000)) {
            if (!this.zzarf || this.zzbkx == null) {
                synchronized (this.mLock) {
                    if (this.zzarf) {
                        if (this.zzbkx == null) {
                        }
                    }
                    Object zzje = zzny.zzje();
                    return zzje;
                }
            }
            return zzakg.zza(this.zzbky, new zzoh(this, zzny));
        }
        throw new IllegalStateException("Flags.initialize() was not called!");
    }
}
