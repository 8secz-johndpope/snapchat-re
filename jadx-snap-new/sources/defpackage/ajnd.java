package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajnd */
public final class ajnd<R> extends ajdp<R> {
    private ajdb a;
    private ajdt<? extends R> b;

    /* renamed from: ajnd$a */
    static final class a<R> extends AtomicReference<ajej> implements ajcz, ajdv<R>, ajej {
        private ajdv<? super R> a;
        private ajdt<? extends R> b;

        a(ajdv<? super R> ajdv, ajdt<? extends R> ajdt) {
            this.b = ajdt;
            this.a = ajdv;
        }

        public final void a() {
            ajdt ajdt = this.b;
            if (ajdt == null) {
                this.a.a();
                return;
            }
            this.b = null;
            ajdt.a(this);
        }

        public final void a(ajej ajej) {
            ajfp.c(this, ajej);
        }

        public final void a(R r) {
            this.a.a((Object) r);
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

    public ajnd(ajdb ajdb, ajdt<? extends R> ajdt) {
        this.a = ajdb;
        this.b = ajdt;
    }

    public final void a_(ajdv<? super R> ajdv) {
        ajej aVar = new a(ajdv, this.b);
        ajdv.a(aVar);
        this.a.a(aVar);
    }
}
