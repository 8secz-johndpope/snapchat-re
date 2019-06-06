package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: sp */
public final class sp implements so {
    final Handler a = new Handler(Looper.getMainLooper());
    volatile Thread b;
    private final Executor c = new 1();
    private final ThreadFactory d = new 2();
    private final ExecutorService e = Executors.newSingleThreadExecutor(this.d);

    /* renamed from: sp$1 */
    class 1 implements Executor {
        1() {
        }

        public final void execute(Runnable runnable) {
            sp.this.a.post(runnable);
        }
    }

    /* renamed from: sp$2 */
    class 2 implements ThreadFactory {
        private int a = 0;

        2() {
        }

        public final Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            StringBuilder stringBuilder = new StringBuilder("WorkManager-WorkManagerTaskExecutor-thread-");
            stringBuilder.append(this.a);
            newThread.setName(stringBuilder.toString());
            this.a++;
            sp.this.b = newThread;
            return newThread;
        }
    }

    public final Executor a() {
        return this.c;
    }

    public final void a(Runnable runnable) {
        this.e.execute(runnable);
    }

    public final Thread b() {
        return this.b;
    }

    public final Executor c() {
        return this.e;
    }
}
