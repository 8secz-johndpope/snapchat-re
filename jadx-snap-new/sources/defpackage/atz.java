package defpackage;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: atz */
public final class atz<V> implements RunnableFuture<V>, ScheduledFuture<V> {
    private final Handler a;
    private final FutureTask<V> b;

    public atz(Handler handler, Runnable runnable, V v) {
        this.a = handler;
        this.b = new FutureTask(runnable, v);
    }

    public atz(Handler handler, Callable<V> callable) {
        this.a = handler;
        this.b = new FutureTask(callable);
    }

    public final boolean cancel(boolean z) {
        return this.b.cancel(z);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final V get() {
        return this.b.get();
    }

    public final V get(long j, TimeUnit timeUnit) {
        return this.b.get(j, timeUnit);
    }

    public final long getDelay(TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final boolean isCancelled() {
        return this.b.isCancelled();
    }

    public final boolean isDone() {
        return this.b.isDone();
    }

    public final void run() {
        this.b.run();
    }
}
