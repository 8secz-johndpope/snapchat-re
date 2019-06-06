package com.google.android.gms.internal;

import java.util.concurrent.Future;

final class zzadq implements Runnable {
    private /* synthetic */ Future zzcwh;

    zzadq(zzadn zzadn, Future future) {
        this.zzcwh = future;
    }

    public final void run() {
        if (!this.zzcwh.isDone()) {
            this.zzcwh.cancel(true);
        }
    }
}
