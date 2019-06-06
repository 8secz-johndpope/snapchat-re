package defpackage;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: zfl */
public final class zfl extends ThreadPoolExecutor {
    public volatile int a;
    public final String b;
    private final AtomicInteger c = new AtomicInteger(0);

    public zfl(String str, int i) {
        akcr.b(str, "name");
        super(i, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), new zff(str, 10));
        this.b = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final void afterExecute(Runnable runnable, Throwable th) {
        in.a();
        this.c.decrementAndGet();
    }

    /* Access modifiers changed, original: protected|final */
    public final void beforeExecute(Thread thread, Runnable runnable) {
        in.a(this.b);
        this.a = Math.max(this.a, this.c.getAndIncrement());
    }
}
