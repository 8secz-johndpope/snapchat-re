package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbt;

@zzabh
public final class zzake {
    private Object mLock = new Object();
    private long zzdhr;
    private long zzdhs = Long.MIN_VALUE;

    public zzake(long j) {
        this.zzdhr = j;
    }

    public final boolean tryAcquire() {
        synchronized (this.mLock) {
            long elapsedRealtime = zzbt.zzes().elapsedRealtime();
            if (this.zzdhs + this.zzdhr > elapsedRealtime) {
                return false;
            }
            this.zzdhs = elapsedRealtime;
            return true;
        }
    }
}
