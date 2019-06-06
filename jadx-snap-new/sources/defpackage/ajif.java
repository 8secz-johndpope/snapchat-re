package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajif */
public final class ajif extends ajcx {
    private ajdb a;
    private ajfc<? super Throwable, ? extends ajdb> b;

    /* renamed from: ajif$a */
    static final class a extends AtomicReference<ajej> implements ajcz, ajej {
        private ajcz a;
        private ajfc<? super Throwable, ? extends ajdb> b;
        private boolean c;

        a(ajcz ajcz, ajfc<? super Throwable, ? extends ajdb> ajfc) {
            this.a = ajcz;
            this.b = ajfc;
        }

        public final void a() {
            this.a.a();
        }

        public final void a(ajej ajej) {
            ajfp.c(this, ajej);
        }

        public final void a(Throwable th) {
            if (this.c) {
                this.a.a(th);
                return;
            }
            this.c = true;
            try {
                ((ajdb) ajfv.a(this.b.apply(th), "The errorMapper returned a null CompletableSource")).a(this);
            } catch (Throwable th2) {
                ajep.a(th2);
                this.a.a(new ajeo(th, th2));
            }
        }

        public final void dispose() {
            ajfp.a((AtomicReference) this);
        }

        public final boolean isDisposed() {
            return ajfp.a((ajej) get());
        }
    }

    public ajif(ajdb ajdb, ajfc<? super Throwable, ? extends ajdb> ajfc) {
        this.a = ajdb;
        this.b = ajfc;
    }

    public final void b(ajcz ajcz) {
        ajej aVar = new a(ajcz, this.b);
        ajcz.a(aVar);
        this.a.a(aVar);
    }
}
