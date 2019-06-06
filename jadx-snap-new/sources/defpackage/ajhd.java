package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajhd */
public final class ajhd extends ajcx {
    private ajdb a;
    private ajdb b;

    /* renamed from: ajhd$a */
    static final class a implements ajcz {
        private AtomicReference<ajej> a;
        private ajcz b;

        public a(AtomicReference<ajej> atomicReference, ajcz ajcz) {
            this.a = atomicReference;
            this.b = ajcz;
        }

        public final void a() {
            this.b.a();
        }

        public final void a(ajej ajej) {
            ajfp.c(this.a, ajej);
        }

        public final void a(Throwable th) {
            this.b.a(th);
        }
    }

    /* renamed from: ajhd$b */
    static final class b extends AtomicReference<ajej> implements ajcz, ajej {
        private ajcz a;
        private ajdb b;

        b(ajcz ajcz, ajdb ajdb) {
            this.a = ajcz;
            this.b = ajdb;
        }

        public final void a() {
            this.b.a(new a(this, this.a));
        }

        public final void a(ajej ajej) {
            if (ajfp.b(this, ajej)) {
                this.a.a((ajej) this);
            }
        }

        public final void a(Throwable th) {
            this.a.a(th);
        }

        public final void dispose() {
            ajfp.a((AtomicReference) this);
        }

        public final boolean isDisposed() {
            return ajfp.a((ajej) get());
        }
    }

    public ajhd(ajdb ajdb, ajdb ajdb2) {
        this.a = ajdb;
        this.b = ajdb2;
    }

    public final void b(ajcz ajcz) {
        this.a.a(new b(ajcz, this.b));
    }
}
