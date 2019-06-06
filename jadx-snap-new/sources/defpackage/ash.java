package defpackage;

import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: ash */
final class ash {
    private final ExecutorService a;

    public ash(ExecutorService executorService) {
        this.a = executorService;
    }

    /* Access modifiers changed, original: final */
    public final <T> T a(Callable<T> callable) {
        String str = "CrashlyticsCore";
        try {
            return Looper.getMainLooper() == Looper.myLooper() ? this.a.submit(callable).get(4, TimeUnit.SECONDS) : this.a.submit(callable).get();
        } catch (RejectedExecutionException unused) {
            aiqj.a().a(str, "Executor is shut down because we're handling a fatal crash.");
            return null;
        } catch (Exception e) {
            aiqj.a().c(str, "Failed to execute task.", e);
            return null;
        }
    }

    /* Access modifiers changed, original: final */
    public final Future<?> a(final Runnable runnable) {
        try {
            return this.a.submit(new Runnable() {
                public final void run() {
                    try {
                        runnable.run();
                    } catch (Exception e) {
                        aiqj.a().c("CrashlyticsCore", "Failed to execute task.", e);
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
            aiqj.a().a("CrashlyticsCore", "Executor is shut down because we're handling a fatal crash.");
            return null;
        }
    }

    /* Access modifiers changed, original: final */
    public final <T> Future<T> b(final Callable<T> callable) {
        try {
            return this.a.submit(new Callable<T>() {
                public final T call() {
                    try {
                        return callable.call();
                    } catch (Exception e) {
                        aiqj.a().c("CrashlyticsCore", "Failed to execute task.", e);
                        return null;
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
            aiqj.a().a("CrashlyticsCore", "Executor is shut down because we're handling a fatal crash.");
            return null;
        }
    }
}
