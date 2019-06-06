package com.google.android.gms.internal;

import java.util.concurrent.Future;

final /* synthetic */ class zzti implements Runnable {
    private final zzamd zzcdk;
    private final Future zzcdl;

    zzti(zzamd zzamd, Future future) {
        this.zzcdk = zzamd;
        this.zzcdl = future;
    }

    public final void run() {
        zzamd zzamd = this.zzcdk;
        Future future = this.zzcdl;
        if (zzamd.isCancelled()) {
            future.cancel(true);
        }
    }
}
