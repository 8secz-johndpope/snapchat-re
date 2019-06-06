package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ard */
final class ard {
    final ScheduledExecutorService a;
    final List<a> b = new ArrayList();
    volatile boolean c = true;
    final AtomicReference<ScheduledFuture<?>> d = new AtomicReference();
    boolean e = true;

    /* renamed from: ard$1 */
    class 1 implements Runnable {
        1() {
        }

        public final void run() {
            ard.this.d.set(null);
            for (a a : ard.this.b) {
                a.a();
            }
        }
    }

    /* renamed from: ard$a */
    public interface a {
        void a();
    }

    public ard(ScheduledExecutorService scheduledExecutorService) {
        this.a = scheduledExecutorService;
    }
}
