package com.google.android.gms.internal;

import java.util.concurrent.Executor;

final /* synthetic */ class zzalv implements Runnable {
    private final Runnable zzaot;
    private final Executor zzdjs;

    zzalv(Executor executor, Runnable runnable) {
        this.zzdjs = executor;
        this.zzaot = runnable;
    }

    public final void run() {
        this.zzdjs.execute(this.zzaot);
    }
}
