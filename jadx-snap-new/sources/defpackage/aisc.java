package defpackage;

import android.annotation.TargetApi;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: aisc */
public final class aisc extends ThreadPoolExecutor {
    public static final int a;
    public static final int b = ((c << 1) + 1);
    private static final int c;

    /* renamed from: aisc$a */
    public static final class a implements ThreadFactory {
        private final int a = 10;

        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(10);
            thread.setName("Queue");
            return thread;
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        c = availableProcessors;
        a = availableProcessors + 1;
    }

    public <T extends Runnable & airt & aisd & aisa> aisc(int i, int i2, TimeUnit timeUnit, airu<T> airu, ThreadFactory threadFactory) {
        super(i, i2, 1, timeUnit, airu, threadFactory);
        prestartAllCoreThreads();
    }

    /* Access modifiers changed, original: protected|final */
    public final void afterExecute(Runnable runnable, Throwable th) {
        aisd aisd = (aisd) runnable;
        aisd.a(true);
        aisd.a(th);
        ((airu) super.getQueue()).a();
        super.afterExecute(runnable, th);
    }

    @TargetApi(9)
    public final void execute(Runnable runnable) {
        if (aisb.b(runnable)) {
            super.execute(runnable);
        } else {
            super.execute(newTaskFor(runnable, null));
        }
    }

    public final /* bridge */ /* synthetic */ BlockingQueue getQueue() {
        return (airu) super.getQueue();
    }

    /* Access modifiers changed, original: protected|final */
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new airz(runnable, t);
    }

    /* Access modifiers changed, original: protected|final */
    public final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new airz(callable);
    }
}
