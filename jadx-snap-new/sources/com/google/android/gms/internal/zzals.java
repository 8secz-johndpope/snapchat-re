package com.google.android.gms.internal;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

@zzabh
final class zzals<T> implements zzalt<T> {
    private final T value;
    private final zzalu zzdjo = new zzalu();

    zzals(T t) {
        this.value = t;
        this.zzdjo.zzsf();
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final T get() {
        return this.value;
    }

    public final T get(long j, TimeUnit timeUnit) {
        return this.value;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }

    public final void zza(Runnable runnable, Executor executor) {
        this.zzdjo.zza(runnable, executor);
    }
}
