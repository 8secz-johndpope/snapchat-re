package com.google.android.gms.internal;

import java.util.concurrent.Future;

final /* synthetic */ class zzalq implements Runnable {
    private final Future zzcdl;
    private final zzalt zzdjn;

    zzalq(zzalt zzalt, Future future) {
        this.zzdjn = zzalt;
        this.zzcdl = future;
    }

    public final void run() {
        zzalt zzalt = this.zzdjn;
        Future future = this.zzcdl;
        if (zzalt.isCancelled()) {
            future.cancel(true);
        }
    }
}
