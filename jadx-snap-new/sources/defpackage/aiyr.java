package defpackage;

import com.google.common.base.Stopwatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: aiyr */
final class aiyr {
    final ScheduledExecutorService a;
    final Executor b;
    final Runnable c;
    long d;
    boolean e;
    ScheduledFuture<?> f;
    private final Stopwatch g;

    /* renamed from: aiyr$b */
    final class b implements Runnable {
        private b() {
        }

        /* synthetic */ b(aiyr aiyr, byte b) {
            this();
        }

        public final void run() {
            aiyr.this.b.execute(new a(aiyr.this, (byte) 0));
        }
    }

    /* renamed from: aiyr$a */
    final class a implements Runnable {
        private a() {
        }

        /* synthetic */ a(aiyr aiyr, byte b) {
            this();
        }

        public final void run() {
            if (aiyr.this.e) {
                long a = aiyr.this.a();
                if (aiyr.this.d - a > 0) {
                    aiyr aiyr = aiyr.this;
                    aiyr.f = aiyr.a.schedule(new b(aiyr.this, (byte) 0), aiyr.this.d - a, TimeUnit.NANOSECONDS);
                    return;
                }
                aiyr aiyr2 = aiyr.this;
                aiyr2.e = false;
                aiyr2.f = null;
                aiyr2.c.run();
                return;
            }
            aiyr.this.f = null;
        }
    }

    aiyr(Runnable runnable, Executor executor, ScheduledExecutorService scheduledExecutorService, Stopwatch stopwatch) {
        this.c = runnable;
        this.b = executor;
        this.a = scheduledExecutorService;
        this.g = stopwatch;
        stopwatch.start();
    }

    /* Access modifiers changed, original: final */
    public final long a() {
        return this.g.elapsed(TimeUnit.NANOSECONDS);
    }

    /* Access modifiers changed, original: final */
    public final void a(long j, TimeUnit timeUnit) {
        j = timeUnit.toNanos(j);
        long a = a() + j;
        this.e = true;
        if (a - this.d < 0 || this.f == null) {
            ScheduledFuture scheduledFuture = this.f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.f = this.a.schedule(new b(this, (byte) 0), j, TimeUnit.NANOSECONDS);
        }
        this.d = a;
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z) {
        this.e = false;
        if (z) {
            ScheduledFuture scheduledFuture = this.f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.f = null;
            }
        }
    }
}
