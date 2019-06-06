package defpackage;

import android.os.Process;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: akj */
public final class akj extends ThreadPoolExecutor {
    private final AtomicInteger a;
    private final c b;

    /* renamed from: akj$c */
    public enum c {
        IGNORE;

        /* Access modifiers changed, original: protected */
        public void a(Throwable th) {
        }
    }

    /* renamed from: akj$a */
    public static class a implements ThreadFactory {
        private int a = 0;

        public final Thread newThread(Runnable runnable) {
            StringBuilder stringBuilder = new StringBuilder("fifo-pool-thread-");
            stringBuilder.append(this.a);
            1 1 = new Thread(runnable, stringBuilder.toString()) {
                public final void run() {
                    Process.setThreadPriority(10);
                    super.run();
                }
            };
            this.a++;
            return 1;
        }
    }

    /* renamed from: akj$b */
    static class b<T> extends FutureTask<T> implements Comparable<b<?>> {
        private final int a;
        private final int b;

        public b(Runnable runnable, T t, int i) {
            super(runnable, t);
            if (runnable instanceof akk) {
                this.a = ((akk) runnable).a();
                this.b = i;
                return;
            }
            throw new IllegalArgumentException("FifoPriorityThreadPoolExecutor must be given Runnables that implement Prioritized");
        }

        public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
            b bVar = (b) obj;
            int i = this.a - bVar.a;
            return i == 0 ? this.b - bVar.b : i;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.b == bVar.b && this.a == bVar.a) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return (this.a * 31) + this.b;
        }
    }

    public akj(int i) {
        this(i, c.LOG);
    }

    private akj(int i, int i2, TimeUnit timeUnit, ThreadFactory threadFactory, c cVar) {
        super(i, i2, 0, timeUnit, new PriorityBlockingQueue(), threadFactory);
        this.a = new AtomicInteger();
        this.b = cVar;
    }

    private akj(int i, c cVar) {
        this(i, i, TimeUnit.MILLISECONDS, new a(), cVar);
    }

    /* Access modifiers changed, original: protected|final */
    public final void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (th == null && (runnable instanceof Future)) {
            Future future = (Future) runnable;
            if (future.isDone() && !future.isCancelled()) {
                try {
                    future.get();
                } catch (InterruptedException e) {
                    this.b.a(e);
                } catch (ExecutionException e2) {
                    this.b.a(e2);
                }
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new b(runnable, t, this.a.getAndIncrement());
    }
}
