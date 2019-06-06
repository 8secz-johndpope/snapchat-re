package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.gmsg.zzt;
import com.google.android.gms.internal.zzaof;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

final class zzau implements zzt<zzaof> {
    private /* synthetic */ CountDownLatch zzanq;

    zzau(CountDownLatch countDownLatch) {
        this.zzanq = countDownLatch;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzaof zzaof = (zzaof) obj;
        this.zzanq.countDown();
        zzaof.getView().setVisibility(0);
    }
}
