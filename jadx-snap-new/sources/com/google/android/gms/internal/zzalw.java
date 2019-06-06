package com.google.android.gms.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

@zzabh
final class zzalw<V> extends FutureTask<V> implements zzalt<V> {
    private final zzalu zzdjo = new zzalu();

    zzalw(Runnable runnable, V v) {
        super(runnable, v);
    }

    zzalw(Callable<V> callable) {
        super(callable);
    }

    /* Access modifiers changed, original: protected|final */
    public final void done() {
        this.zzdjo.zzsf();
    }

    public final void zza(Runnable runnable, Executor executor) {
        this.zzdjo.zza(runnable, executor);
    }
}
