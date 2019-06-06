package defpackage;

import android.os.Process;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy.Builder;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: aca */
public final class aca implements ExecutorService {
    public static final long a = TimeUnit.SECONDS.toMillis(10);
    private static volatile int b;
    private final ExecutorService c;

    /* renamed from: aca$a */
    public static final class a implements ThreadFactory {
        final b a;
        final boolean b;
        private final String c;
        private int d;

        public a(String str, b bVar, boolean z) {
            this.c = str;
            this.a = bVar;
            this.b = z;
        }

        public final synchronized Thread newThread(Runnable runnable) {
            1 1;
            StringBuilder stringBuilder = new StringBuilder("glide-");
            stringBuilder.append(this.c);
            stringBuilder.append("-thread-");
            stringBuilder.append(this.d);
            1 = new Thread(runnable, stringBuilder.toString()) {
                public final void run() {
                    Process.setThreadPriority(9);
                    if (a.this.b) {
                        StrictMode.setThreadPolicy(new Builder().detectNetwork().penaltyDeath().build());
                    }
                    try {
                        super.run();
                    } catch (Throwable th) {
                        a.this.a.a(th);
                    }
                }
            };
            this.d++;
            return 1;
        }
    }

    /* renamed from: aca$b */
    public interface b {
        public static final b a = new 2();
        public static final b b = a;

        /* renamed from: aca$b$1 */
        class 1 implements b {
            1() {
            }

            public final void a(Throwable th) {
            }
        }

        /* renamed from: aca$b$2 */
        class 2 implements b {
            2() {
            }

            public final void a(Throwable th) {
                String str = "GlideExecutor";
                if (Log.isLoggable(str, 6)) {
                    Log.e(str, "Request threw uncaught throwable", th);
                }
            }
        }

        /* renamed from: aca$b$3 */
        class 3 implements b {
            3() {
            }

            public final void a(Throwable th) {
                throw new RuntimeException("Request threw uncaught throwable", th);
            }
        }

        static {
            1 1 = new 1();
            3 3 = new 3();
        }

        void a(Throwable th);
    }

    public aca(ExecutorService executorService) {
        this.c = executorService;
    }

    public static aca a() {
        return aca.a(aca.b() >= 4 ? 2 : 1, b.b);
    }

    private static aca a(int i, b bVar) {
        return new aca(new ThreadPoolExecutor(0, i, a, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a("animation", bVar, true)));
    }

    public static int b() {
        if (b == 0) {
            b = Math.min(4, acb.a());
        }
        return b;
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.c.awaitTermination(j, timeUnit);
    }

    public final void execute(Runnable runnable) {
        this.c.execute(runnable);
    }

    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.c.invokeAll(collection);
    }

    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return this.c.invokeAll(collection, j, timeUnit);
    }

    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return this.c.invokeAny(collection);
    }

    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return this.c.invokeAny(collection, j, timeUnit);
    }

    public final boolean isShutdown() {
        return this.c.isShutdown();
    }

    public final boolean isTerminated() {
        return this.c.isTerminated();
    }

    public final void shutdown() {
        this.c.shutdown();
    }

    public final List<Runnable> shutdownNow() {
        return this.c.shutdownNow();
    }

    public final Future<?> submit(Runnable runnable) {
        return this.c.submit(runnable);
    }

    public final <T> Future<T> submit(Runnable runnable, T t) {
        return this.c.submit(runnable, t);
    }

    public final <T> Future<T> submit(Callable<T> callable) {
        return this.c.submit(callable);
    }

    public final String toString() {
        return this.c.toString();
    }
}
