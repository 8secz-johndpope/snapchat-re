package defpackage;

import com.google.common.base.Preconditions;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: adnd */
public final class adnd {
    private final long a;
    private final admz b;
    private final a c;
    private long d;
    private volatile CountDownLatch e;

    /* renamed from: adnd$a */
    public static class a {
        public static CountDownLatch a() {
            return new CountDownLatch(1);
        }
    }

    public adnd(long j) {
        this(j, new admz(), new a());
    }

    private adnd(long j, admz admz, a aVar) {
        this.d = -1;
        this.e = null;
        Preconditions.checkArgument(j > 0);
        this.a = j;
        this.b = admz;
        this.c = aVar;
    }

    public final void a() {
        this.d = System.nanoTime() / 1000;
    }

    public final void b() {
        if (this.d != -1) {
            long nanoTime = (System.nanoTime() / 1000) - this.d;
            if (nanoTime < this.a) {
                CountDownLatch a = a.a();
                this.e = a;
                try {
                    a.await((this.a - nanoTime) / 1000, TimeUnit.MILLISECONDS);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
                this.e = null;
            }
            this.d = -1;
        }
    }

    public final void c() {
        CountDownLatch countDownLatch = this.e;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }
}
