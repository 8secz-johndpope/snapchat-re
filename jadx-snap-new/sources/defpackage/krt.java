package defpackage;

import com.google.common.base.Stopwatch;
import java.util.concurrent.TimeUnit;

/* renamed from: krt */
public final class krt {
    final Stopwatch a;

    public krt() {
        Object createUnstarted = Stopwatch.createUnstarted();
        akcr.a(createUnstarted, "Stopwatch.createUnstarted()");
        this.a = createUnstarted;
    }

    public final long a(TimeUnit timeUnit) {
        long elapsed;
        akcr.b(timeUnit, "milliseconds");
        synchronized (this.a) {
            elapsed = this.a.elapsed(timeUnit);
        }
        return elapsed;
    }

    public final void a() {
        synchronized (this.a) {
            this.a.reset();
            this.a.start();
        }
    }

    public final void b() {
        synchronized (this.a) {
            if (this.a.isRunning()) {
                this.a.stop();
            }
        }
    }

    public final void c() {
        synchronized (this.a) {
            if (!this.a.isRunning()) {
                this.a.start();
            }
        }
    }
}
