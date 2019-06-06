package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbt;

final class zzahk {
    private final Object mLock;
    private volatile int zzddw;
    private volatile long zzddx;

    private zzahk() {
        this.mLock = new Object();
        this.zzddw = zzahl.zzddy;
        this.zzddx = 0;
    }

    /* JADX WARNING: Missing block: B:11:0x001f, code skipped:
            return;
     */
    private final void zzd(int r5, int r6) {
        /*
        r4 = this;
        r4.zzqf();
        r0 = com.google.android.gms.ads.internal.zzbt.zzes();
        r0 = r0.currentTimeMillis();
        r2 = r4.mLock;
        monitor-enter(r2);
        r3 = r4.zzddw;	 Catch:{ all -> 0x0020 }
        if (r3 == r5) goto L_0x0014;
    L_0x0012:
        monitor-exit(r2);	 Catch:{ all -> 0x0020 }
        return;
    L_0x0014:
        r4.zzddw = r6;	 Catch:{ all -> 0x0020 }
        r5 = r4.zzddw;	 Catch:{ all -> 0x0020 }
        r6 = com.google.android.gms.internal.zzahl.zzdea;	 Catch:{ all -> 0x0020 }
        if (r5 != r6) goto L_0x001e;
    L_0x001c:
        r4.zzddx = r0;	 Catch:{ all -> 0x0020 }
    L_0x001e:
        monitor-exit(r2);	 Catch:{ all -> 0x0020 }
        return;
    L_0x0020:
        r5 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0020 }
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzahk.zzd(int, int):void");
    }

    private final void zzqf() {
        long currentTimeMillis = zzbt.zzes().currentTimeMillis();
        synchronized (this.mLock) {
            if (this.zzddw == zzahl.zzdea) {
                if (this.zzddx + ((Long) zzlc.zzio().zzd(zzoi.zzbvs)).longValue() <= currentTimeMillis) {
                    this.zzddw = zzahl.zzddy;
                }
            }
        }
    }

    public final boolean zzpx() {
        zzqf();
        return this.zzddw == zzahl.zzddz;
    }

    public final boolean zzpy() {
        zzqf();
        return this.zzddw == zzahl.zzdea;
    }

    public final void zzpz() {
        zzd(zzahl.zzddz, zzahl.zzdea);
    }

    public final void zzz(boolean z) {
        int i;
        int i2;
        if (z) {
            i = zzahl.zzddy;
            i2 = zzahl.zzddz;
        } else {
            i = zzahl.zzddz;
            i2 = zzahl.zzddy;
        }
        zzd(i, i2);
    }
}
