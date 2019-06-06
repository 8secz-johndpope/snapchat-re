package defpackage;

import defpackage.ajdw.c;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajpn */
public final class ajpn extends ajdp<Long> {
    private ajdw a;
    private long b;
    private long c;
    private TimeUnit d;

    /* renamed from: ajpn$a */
    static final class a extends AtomicReference<ajej> implements ajej, Runnable {
        private ajdv<? super Long> a;
        private long b;

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
            if (get() != ajfp.DISPOSED) {
                ajdv ajdv = this.a;
                long j = this.b;
                this.b = 1 + j;
                ajdv.a(Long.valueOf(j));
            }
        }
    }

    public ajpn(long j, long j2, TimeUnit timeUnit, ajdw ajdw) {
        this.b = j;
        this.c = j2;
        this.d = timeUnit;
        this.a = ajdw;
    }

    public final void a_(ajdv<? super Long> ajdv) {
        ajej aVar = new a(ajdv);
        ajdv.a(aVar);
        ajdw ajdw = this.a;
        if (ajdw instanceof ajtq) {
            c b = ajdw.b();
            ajfp.b(aVar, b);
            b.a(aVar, this.b, this.c, this.d);
            return;
        }
        ajfp.b(aVar, ajdw.a(aVar, this.b, this.c, this.d));
    }
}
