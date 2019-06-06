package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajig */
public final class ajig extends ajcx {
    private ajdb a;
    private ajdw b;

    /* renamed from: ajig$a */
    static final class a extends AtomicReference<ajej> implements ajcz, ajej, Runnable {
        final ajft a = new ajft();
        private ajcz b;
        private ajdb c;

        a(ajcz ajcz, ajdb ajdb) {
            this.b = ajcz;
            this.c = ajdb;
        }

        public final void a() {
            this.b.a();
        }

        public final void a(ajej ajej) {
            ajfp.b(this, ajej);
        }

        public final void a(Throwable th) {
            this.b.a(th);
        }

        public final void dispose() {
            ajfp.a((AtomicReference) this);
            this.a.dispose();
        }

        public final boolean isDisposed() {
            return ajfp.a((ajej) get());
        }

        public final void run() {
            this.c.a(this);
        }
    }

    public ajig(ajdb ajdb, ajdw ajdw) {
        this.a = ajdb;
        this.b = ajdw;
    }

    public final void b(ajcz ajcz) {
        Runnable aVar = new a(ajcz, this.a);
        ajcz.a((ajej) aVar);
        ajfp.c(aVar.a, this.b.a(aVar));
    }
}
