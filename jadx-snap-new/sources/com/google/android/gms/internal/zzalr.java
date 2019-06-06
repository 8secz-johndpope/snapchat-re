package com.google.android.gms.internal;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

@zzabh
final class zzalr<T> implements zzalt<T> {
    private final Throwable cause;
    private final zzalu zzdjo = new zzalu();

    zzalr(Throwable th) {
        this.cause = th;
        this.zzdjo.zzsf();
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final T get() {
        throw new ExecutionException(this.cause);
    }

    public final T get(long j, TimeUnit timeUnit) {
        throw new ExecutionException(this.cause);
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
