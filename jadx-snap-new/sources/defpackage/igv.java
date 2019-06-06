package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: igv */
public final class igv {
    private final AtomicBoolean a;
    private final ajej b;

    public igv(AtomicBoolean atomicBoolean, ajej ajej) {
        this.a = atomicBoolean;
        this.b = ajej;
    }

    public static igv a(ajdw ajdw, Runnable runnable, TimeUnit timeUnit) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        return new igv(atomicBoolean, ajdw.a(new -$$Lambda$igv$RF8r2UxGHNf3VWvl5U_JBu09I5E(atomicBoolean, runnable), 1500, timeUnit));
    }

    private static /* synthetic */ void a(AtomicBoolean atomicBoolean, Runnable runnable) {
        if (atomicBoolean.compareAndSet(false, true)) {
            runnable.run();
        }
    }

    public final boolean a() {
        if (!this.a.compareAndSet(false, true)) {
            return false;
        }
        this.b.dispose();
        return true;
    }
}
