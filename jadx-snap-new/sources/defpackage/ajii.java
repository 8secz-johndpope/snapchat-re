package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajii */
public final class ajii extends ajcx {
    private long a;
    private TimeUnit b;
    private ajdw c;

    /* renamed from: ajii$a */
    static final class a extends AtomicReference<ajej> implements ajej, Runnable {
        private ajcz a;

        a(ajcz ajcz) {
            this.a = ajcz;
        }

        public final void dispose() {
            ajfp.a((AtomicReference) this);
        }

        public final boolean isDisposed() {
            return ajfp.a((ajej) get());
        }

        public final void run() {
            this.a.a();
        }
    }

    public ajii(long j, TimeUnit timeUnit, ajdw ajdw) {
        this.a = j;
        this.b = timeUnit;
        this.c = ajdw;
    }

    public final void b(ajcz ajcz) {
        ajej aVar = new a(ajcz);
        ajcz.a(aVar);
        ajfp.c(aVar, this.c.a(aVar, this.a, this.b));
    }
}
