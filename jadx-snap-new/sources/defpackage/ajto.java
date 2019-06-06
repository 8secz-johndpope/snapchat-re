package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajto */
public final class ajto {
    static final Map<ScheduledThreadPoolExecutor, Object> a = new ConcurrentHashMap();
    private static boolean b;
    private static int c;
    private static AtomicReference<ScheduledExecutorService> d = new AtomicReference();

    /* renamed from: ajto$a */
    static final class a {
        boolean a;
        int b;

        a() {
        }
    }

    /* renamed from: ajto$b */
    static final class b implements Runnable {
        b() {
        }

        public final void run() {
            Iterator it = new ArrayList(ajto.a.keySet()).iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    ajto.a.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    static {
        Properties properties = System.getProperties();
        a aVar = new a();
        String str = "rx2.purge-enabled";
        if (properties.containsKey(str)) {
            aVar.a = Boolean.parseBoolean(properties.getProperty(str));
        } else {
            aVar.a = true;
        }
        if (aVar.a) {
            str = "rx2.purge-period-seconds";
            if (properties.containsKey(str)) {
                try {
                    aVar.b = Integer.parseInt(properties.getProperty(str));
                } catch (NumberFormatException unused) {
                }
                b = aVar.a;
                c = aVar.b;
                ajto.a();
            }
        }
        aVar.b = 1;
        b = aVar.a;
        c = aVar.b;
        ajto.a();
    }

    public static ScheduledExecutorService a(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        ajto.a(b, newScheduledThreadPool);
        return newScheduledThreadPool;
    }

    private static void a() {
        if (b) {
            while (true) {
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) d.get();
                if (scheduledExecutorService != null) {
                    break;
                }
                ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new ajtk("RxSchedulerPurge"));
                if (d.compareAndSet(scheduledExecutorService, newScheduledThreadPool)) {
                    b bVar = new b();
                    int i = c;
                    newScheduledThreadPool.scheduleAtFixedRate(bVar, (long) i, (long) i, TimeUnit.SECONDS);
                    return;
                }
                newScheduledThreadPool.shutdownNow();
            }
        }
    }

    private static void a(boolean z, ScheduledExecutorService scheduledExecutorService) {
        if (z && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
            a.put((ScheduledThreadPoolExecutor) scheduledExecutorService, scheduledExecutorService);
        }
    }
}
