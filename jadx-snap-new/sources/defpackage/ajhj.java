package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajhj */
public final class ajhj extends ajcx {
    private ajdb a;
    private long b;
    private TimeUnit c;
    private ajdw d;
    private boolean e = false;

    /* renamed from: ajhj$a */
    static final class a extends AtomicReference<ajej> implements ajcz, ajej, Runnable {
        private ajcz a;
        private long b;
        private TimeUnit c;
        private ajdw d;
        private boolean e;
        private Throwable f;

        a(ajcz ajcz, long j, TimeUnit timeUnit, ajdw ajdw, boolean z) {
            this.a = ajcz;
            this.b = j;
            this.c = timeUnit;
            this.d = ajdw;
            this.e = z;
        }

        public final void a() {
            ajfp.c(this, this.d.a(this, this.b, this.c));
        }

        public final void a(ajej ajej) {
            if (ajfp.b(this, ajej)) {
                this.a.a((ajej) this);
            }
        }

        public final void a(Throwable th) {
            this.f = th;
            ajfp.c(this, this.d.a(this, this.e ? this.b : 0, this.c));
        }

        public final void dispose() {
            ajfp.a((AtomicReference) this);
        }

        public final boolean isDisposed() {
            return ajfp.a((ajej) get());
        }

        public final void run() {
            Throwable th = this.f;
            this.f = null;
            if (th != null) {
                this.a.a(th);
            } else {
                this.a.a();
            }
        }
    }

    public ajhj(ajdb ajdb, long j, TimeUnit timeUnit, ajdw ajdw) {
        this.a = ajdb;
        this.b = j;
        this.c = timeUnit;
        this.d = ajdw;
    }

    public final void b(ajcz ajcz) {
        this.a.a(new a(ajcz, this.b, this.c, this.d, false));
    }
}
