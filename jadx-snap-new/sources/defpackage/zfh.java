package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: zfh */
public class zfh extends AbstractExecutorService implements zgc {
    public final idd a;
    public final AtomicReference<ScheduledExecutorService> b;
    public final AtomicReference<aipn<zfq>> c;

    public zfh(idd idd, ScheduledExecutorService scheduledExecutorService, AtomicReference<aipn<zfq>> atomicReference) {
        this.a = idd;
        this.b = new AtomicReference(scheduledExecutorService);
        this.c = atomicReference;
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        return false;
    }

    public void execute(Runnable runnable) {
        ExecutorService executorService = (ExecutorService) this.b.get();
        if (executorService != null) {
            idd idd = this.a;
            AtomicReference atomicReference = this.c;
            if (!(runnable instanceof zfs)) {
                runnable = new zfs(runnable, idd, atomicReference, (zgg) zfs.a.get());
            }
            executorService.execute(runnable);
        }
    }

    public boolean isShutdown() {
        return this.b.get() == null;
    }

    public boolean isTerminated() {
        return false;
    }

    /* Access modifiers changed, original: protected */
    public <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new zft(Executors.callable(runnable, t));
    }

    /* Access modifiers changed, original: protected */
    public <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new zft(callable);
    }

    public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return ((ScheduledExecutorService) this.b.get()).schedule(runnable, j, timeUnit);
    }

    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        return ((ScheduledExecutorService) this.b.get()).schedule(callable, j, timeUnit);
    }

    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return ((ScheduledExecutorService) this.b.get()).scheduleAtFixedRate(runnable, j, j2, timeUnit);
    }

    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return ((ScheduledExecutorService) this.b.get()).scheduleWithFixedDelay(runnable, j, j2, timeUnit);
    }

    public void shutdown() {
        this.b.getAndSet(null);
    }

    public List<Runnable> shutdownNow() {
        return Collections.emptyList();
    }
}
