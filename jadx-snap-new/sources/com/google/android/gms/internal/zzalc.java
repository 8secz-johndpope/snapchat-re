package com.google.android.gms.internal;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

@zzabh
public abstract class zzalc extends AbstractExecutorService implements ExecutorService {
    /* Access modifiers changed, original: protected|final */
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new zzalw(runnable, t);
    }

    /* Access modifiers changed, original: protected|final */
    public final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new zzalw(callable);
    }

    public /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (zzalt) super.submit(runnable, obj);
    }
}
