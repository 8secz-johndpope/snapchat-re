package com.google.android.gms.internal;

import java.util.concurrent.Future;

final /* synthetic */ class zzaln implements Runnable {
    private final Future zzdjj;

    zzaln(Future future) {
        this.zzdjj = future;
    }

    public final void run() {
        Future future = this.zzdjj;
        if (!future.isDone()) {
            future.cancel(true);
        }
    }
}
