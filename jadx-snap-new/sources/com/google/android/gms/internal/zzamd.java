package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbt;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@zzabh
public class zzamd<T> implements zzalt<T> {
    private final Object mLock = new Object();
    private T mValue;
    private boolean zzcjn;
    private Throwable zzdka;
    private boolean zzdkb;
    private final zzalu zzdkc = new zzalu();

    private final boolean zzsh() {
        return this.zzdka != null || this.zzdkb;
    }

    public boolean cancel(boolean z) {
        if (!z) {
            return false;
        }
        synchronized (this.mLock) {
            if (zzsh()) {
                return false;
            }
            this.zzcjn = true;
            this.zzdkb = true;
            this.mLock.notifyAll();
            this.zzdkc.zzsf();
            return true;
        }
    }

    public T get() {
        Object obj;
        synchronized (this.mLock) {
            if (!zzsh()) {
                try {
                    this.mLock.wait();
                } catch (InterruptedException e) {
                    throw e;
                }
            }
            if (this.zzdka != null) {
                throw new ExecutionException(this.zzdka);
            } else if (this.zzcjn) {
                throw new CancellationException("SettableFuture was cancelled.");
            } else {
                obj = this.mValue;
            }
        }
        return obj;
    }

    public T get(long j, TimeUnit timeUnit) {
        Object obj;
        synchronized (this.mLock) {
            if (!zzsh()) {
                try {
                    j = timeUnit.toMillis(j);
                    if (j != 0) {
                        this.mLock.wait(j);
                    }
                } catch (InterruptedException e) {
                    throw e;
                }
            }
            if (this.zzdka != null) {
                throw new ExecutionException(this.zzdka);
            } else if (!this.zzdkb) {
                throw new TimeoutException("SettableFuture timed out.");
            } else if (this.zzcjn) {
                throw new CancellationException("SettableFuture was cancelled.");
            } else {
                obj = this.mValue;
            }
        }
        return obj;
    }

    public boolean isCancelled() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzcjn;
        }
        return z;
    }

    public boolean isDone() {
        boolean zzsh;
        synchronized (this.mLock) {
            zzsh = zzsh();
        }
        return zzsh;
    }

    public final void set(T t) {
        synchronized (this.mLock) {
            if (this.zzcjn) {
            } else if (zzsh()) {
                zzbt.zzep().zza(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture.set");
            } else {
                this.zzdkb = true;
                this.mValue = t;
                this.mLock.notifyAll();
                this.zzdkc.zzsf();
            }
        }
    }

    public final void setException(Throwable th) {
        synchronized (this.mLock) {
            if (this.zzcjn) {
            } else if (zzsh()) {
                zzbt.zzep().zza(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture.setException");
            } else {
                this.zzdka = th;
                this.mLock.notifyAll();
                this.zzdkc.zzsf();
            }
        }
    }

    public final void zza(Runnable runnable, Executor executor) {
        this.zzdkc.zza(runnable, executor);
    }
}
