package com.google.android.gms.internal;

import android.os.Process;
import com.google.android.gms.ads.internal.zzbt;
import java.util.concurrent.Callable;

final class zzaig implements Runnable {
    private /* synthetic */ Callable val$callable;
    private /* synthetic */ zzamd zzcde;

    zzaig(zzamd zzamd, Callable callable) {
        this.zzcde = zzamd;
        this.val$callable = callable;
    }

    public final void run() {
        try {
            Process.setThreadPriority(10);
            this.zzcde.set(this.val$callable.call());
        } catch (Exception e) {
            zzbt.zzep().zza(e, "AdThreadPool.submit");
            this.zzcde.setException(e);
        }
    }
}
