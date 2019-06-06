package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.gmsg.zzt;
import com.google.android.gms.internal.zzaky;
import com.google.android.gms.internal.zzaof;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

final class zzav implements zzt<zzaof> {
    private /* synthetic */ CountDownLatch zzanq;

    zzav(CountDownLatch countDownLatch) {
        this.zzanq = countDownLatch;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzaof zzaof = (zzaof) obj;
        zzaky.zzcz("Adapter returned an ad, but assets substitution failed");
        this.zzanq.countDown();
        zzaof.destroy();
    }
}
