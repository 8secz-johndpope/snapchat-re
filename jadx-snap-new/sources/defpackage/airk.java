package defpackage;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: airk */
public final class airk {
    public static final ThreadFactory a(final String str) {
        final AtomicLong atomicLong = new AtomicLong(1);
        return new ThreadFactory() {
            public final Thread newThread(final Runnable runnable) {
                Thread newThread = Executors.defaultThreadFactory().newThread(new aire() {
                    public final void a() {
                        runnable.run();
                    }
                });
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(atomicLong.getAndIncrement());
                newThread.setName(stringBuilder.toString());
                return newThread;
            }
        };
    }

    public static final void a(String str, ExecutorService executorService) {
        airk.a(str, executorService, TimeUnit.SECONDS);
    }

    private static void a(final String str, final ExecutorService executorService, final TimeUnit timeUnit) {
        Runtime.getRuntime().addShutdownHook(new Thread(new aire() {
            private /* synthetic */ long c = 2;

            public final void a() {
                String str = "Fabric";
                try {
                    aiqr a = aiqj.a();
                    StringBuilder stringBuilder = new StringBuilder("Executing shutdown hook for ");
                    stringBuilder.append(str);
                    a.a(str, stringBuilder.toString());
                    executorService.shutdown();
                    if (!executorService.awaitTermination(this.c, timeUnit)) {
                        a = aiqj.a();
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(str);
                        stringBuilder.append(" did not shut down in the allocated time. Requesting immediate shutdown.");
                        a.a(str, stringBuilder.toString());
                        executorService.shutdownNow();
                    }
                } catch (InterruptedException unused) {
                    aiqj.a().a(str, String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new Object[]{str}));
                    executorService.shutdownNow();
                }
            }
        }, "Crashlytics Shutdown Hook for ".concat(String.valueOf(str))));
    }
}
