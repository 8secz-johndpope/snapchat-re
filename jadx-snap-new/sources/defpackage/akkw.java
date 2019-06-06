package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: akkw */
public class akkw {
    public static final akkw f = new 1();
    private boolean a;
    private long b;
    private long c;

    /* renamed from: akkw$1 */
    class 1 extends akkw {
        1() {
        }

        public final akkw a(long j) {
            return this;
        }

        public final akkw a(long j, TimeUnit timeUnit) {
            return this;
        }

        public final void f() {
        }
    }

    public akkw a(long j) {
        this.a = true;
        this.b = j;
        return this;
    }

    public akkw a(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException("timeout < 0: ".concat(String.valueOf(j)));
        } else if (timeUnit != null) {
            this.c = timeUnit.toNanos(j);
            return this;
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    public long as_() {
        return this.c;
    }

    public boolean at_() {
        return this.a;
    }

    public long c() {
        if (this.a) {
            return this.b;
        }
        throw new IllegalStateException("No deadline");
    }

    public akkw d() {
        this.c = 0;
        return this;
    }

    public akkw e() {
        this.a = false;
        return this;
    }

    public void f() {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("thread interrupted");
        } else if (this.a && this.b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }
}
