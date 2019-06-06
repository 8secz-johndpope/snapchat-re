package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajrf */
public final class ajrf extends ajdp<Long> {
    private ajdw a;
    private long b;
    private TimeUnit c;

    /* renamed from: ajrf$a */
    static final class a extends AtomicReference<ajej> implements ajej, Runnable {
        private ajdv<? super Long> a;

        a(ajdv<? super Long> ajdv) {
            this.a = ajdv;
        }

        public final void dispose() {
            ajfp.a((AtomicReference) this);
        }

        public final boolean isDisposed() {
            return get() == ajfp.DISPOSED;
        }

        public final void run() {
            if (!isDisposed()) {
                this.a.a(Long.valueOf(0));
                lazySet(ajfq.INSTANCE);
                this.a.a();
            }
        }
    }

    public ajrf(long j, TimeUnit timeUnit, ajdw ajdw) {
        this.b = j;
        this.c = timeUnit;
        this.a = ajdw;
    }

    public final void a_(ajdv<? super Long> ajdv) {
        ajej aVar = new a(ajdv);
        ajdv.a(aVar);
        ajfp.d(aVar, this.a.a(aVar, this.b, this.c));
    }
}
