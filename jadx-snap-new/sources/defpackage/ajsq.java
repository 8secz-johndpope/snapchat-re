package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajsq */
public final class ajsq<T> extends ajdx<T> {
    private ajeb<? extends T> a;
    private ajfc<? super Throwable, ? extends ajeb<? extends T>> b;

    /* renamed from: ajsq$a */
    static final class a<T> extends AtomicReference<ajej> implements ajdz<T>, ajej {
        private ajdz<? super T> a;
        private ajfc<? super Throwable, ? extends ajeb<? extends T>> b;

        a(ajdz<? super T> ajdz, ajfc<? super Throwable, ? extends ajeb<? extends T>> ajfc) {
            this.a = ajdz;
            this.b = ajfc;
        }

        public final void a(ajej ajej) {
            if (ajfp.b(this, ajej)) {
                this.a.a((ajej) this);
            }
        }

        public final void a(Throwable th) {
            try {
                ((ajeb) ajfv.a(this.b.apply(th), "The nextFunction returned a null SingleSource.")).a(new ajha(this, this.a));
            } catch (Throwable th2) {
                ajep.a(th2);
                this.a.a(new ajeo(th, th2));
            }
        }

        public final void b_(T t) {
            this.a.b_(t);
        }

        public final void dispose() {
            ajfp.a((AtomicReference) this);
        }

        public final boolean isDisposed() {
            return ajfp.a((ajej) get());
        }
    }

    public ajsq(ajeb<? extends T> ajeb, ajfc<? super Throwable, ? extends ajeb<? extends T>> ajfc) {
        this.a = ajeb;
        this.b = ajfc;
    }

    public final void b(ajdz<? super T> ajdz) {
        this.a.a(new a(ajdz, this.b));
    }
}
