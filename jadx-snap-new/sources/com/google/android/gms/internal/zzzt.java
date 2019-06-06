package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzar;
import java.util.concurrent.CountDownLatch;

final class zzzt implements Runnable {
    private /* synthetic */ CountDownLatch zzanq;
    private /* synthetic */ zzzs zzcoq;

    zzzt(zzzs zzzs, CountDownLatch countDownLatch) {
        this.zzcoq = zzzs;
        this.zzanq = countDownLatch;
    }

    public final void run() {
        synchronized (this.zzcoq.zzcoe) {
            this.zzcoq.zzcop = zzar.zza(this.zzcoq.zzcct, this.zzcoq.zzcoo, this.zzanq);
        }
    }
}
