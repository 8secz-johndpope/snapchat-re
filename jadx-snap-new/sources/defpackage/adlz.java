package defpackage;

import android.os.Process;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: adlz */
public final class adlz implements admb {
    final Integer a;
    private final ListeningExecutorService b;

    /* renamed from: adlz$a */
    final class a implements ThreadFactory {
        private final ThreadFactory b;

        private a() {
            this.b = Executors.defaultThreadFactory();
        }

        /* synthetic */ a(adlz adlz, byte b) {
            this();
        }

        public final Thread newThread(final Runnable runnable) {
            return this.b.newThread(new Runnable() {
                public final void run() {
                    if (adlz.this.a != null) {
                        Process.setThreadPriority(adlz.this.a.intValue());
                    }
                    runnable.run();
                }
            });
        }
    }

    public adlz() {
        this(null);
    }

    public adlz(Integer num) {
        ThreadFactory build = new ThreadFactoryBuilder().setNameFormat("MediaTask-%d").setThreadFactory(new a(this, (byte) 0)).build();
        this.a = num;
        this.b = MoreExecutors.listeningDecorator(new ThreadPoolExecutor(0, 1, 0, TimeUnit.SECONDS, new LinkedBlockingQueue(), build));
    }

    public final <T extends adma> ListenableFuture<T> a(T t) {
        Preconditions.checkNotNull(t);
        return this.b.submit(t, t);
    }

    public final void b(adma adma) {
        Preconditions.checkNotNull(adma);
        try {
            adma.a();
        } catch (RuntimeException e) {
            throw new adkc(e.toString(), e);
        }
    }
}
