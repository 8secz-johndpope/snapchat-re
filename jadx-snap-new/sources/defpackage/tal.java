package defpackage;

import android.os.Handler;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: tal */
public final class tal {
    public static final Executor a = -$$Lambda$tal$cfZrPiIfInwEJchjQ0tE4vxjY0A.INSTANCE;
    public static final ExecutorService b = Executors.newSingleThreadExecutor(new a("MediaPlayer"));
    public static final ExecutorService c = Executors.newFixedThreadPool(3, new a("OperaExoPlayer"));
    public static final ExecutorService d;
    public static final ExecutorService e = zgb.a(szp.a, "HighPriority").a();
    private static final Supplier<Handler> f = Suppliers.memoize(-$$Lambda$tal$pnc7RPigDeLtxaNNCmnv_v1B-pM.INSTANCE);

    /* renamed from: tal$a */
    static final class a implements ThreadFactory {
        private static final AtomicInteger a = new AtomicInteger(0);
        private final AtomicInteger b = new AtomicInteger(0);
        private final String c;
        private final int d;

        public a(String str) {
            this.c = str;
            this.d = -1;
        }

        public final Thread newThread(Runnable runnable) {
            int incrementAndGet = this.b.incrementAndGet();
            a.incrementAndGet();
            return new Thread(new tam(runnable, -1), String.format("Opera-%s-Pool-%d", new Object[]{this.c, Integer.valueOf(incrementAndGet)}));
        }
    }

    static {
        zgb zgb = new zgb();
        ExecutorService e = zgb.a(szp.a, "backgroundIO").e();
        akcr.b(e, "executor");
        if (!(e instanceof zfk)) {
            if (e instanceof zfh) {
                zfh zfh = (zfh) e;
                Object zfk = new zfk(zfh.a, (ScheduledExecutorService) zfh.b.get(), zfh.c);
                akcr.a(zfk, "this.toSerialExecutor(callsite)");
                e = (zgc) zfk;
            } else {
                throw new UnsupportedOperationException("This class must be an instance of AttributedScheduledExecutorService");
            }
        }
        d = e;
    }
}
