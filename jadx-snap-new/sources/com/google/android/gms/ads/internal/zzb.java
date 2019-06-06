package com.google.android.gms.ads.internal;

import android.os.Debug;
import com.google.android.gms.internal.zzaky;
import com.google.android.gms.internal.zzlc;
import com.google.android.gms.internal.zzoi;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;

final class zzb extends TimerTask {
    private /* synthetic */ CountDownLatch zzanq;
    private /* synthetic */ Timer zzanr;
    private /* synthetic */ zza zzans;

    zzb(zza zza, CountDownLatch countDownLatch, Timer timer) {
        this.zzans = zza;
        this.zzanq = countDownLatch;
        this.zzanr = timer;
    }

    public final void run() {
        if (((long) ((Integer) zzlc.zzio().zzd(zzoi.zzbta)).intValue()) != this.zzanq.getCount()) {
            zzaky.zzby("Stopping method tracing");
            Debug.stopMethodTracing();
            if (this.zzanq.getCount() == 0) {
                this.zzanr.cancel();
                return;
            }
        }
        String concat = String.valueOf(this.zzans.zzanm.zzaiq.getPackageName()).concat("_adsTrace_");
        try {
            zzaky.zzby("Starting method tracing");
            this.zzanq.countDown();
            long currentTimeMillis = zzbt.zzes().currentTimeMillis();
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(concat).length() + 20);
            stringBuilder.append(concat);
            stringBuilder.append(currentTimeMillis);
            Debug.startMethodTracing(stringBuilder.toString(), ((Integer) zzlc.zzio().zzd(zzoi.zzbtb)).intValue());
        } catch (Exception e) {
            zzaky.zzc("Exception occurred while starting method tracing.", e);
        }
    }
}
