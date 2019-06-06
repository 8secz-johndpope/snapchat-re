package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajrs */
public final class ajrs<T> extends ajdx<T> {
    private ajeb<T> a;
    private ajdb b;

    /* renamed from: ajrs$a */
    static final class a<T> extends AtomicReference<ajej> implements ajcz, ajej {
        private ajdz<? super T> a;
        private ajeb<T> b;

        a(ajdz<? super T> ajdz, ajeb<T> ajeb) {
            this.a = ajdz;
            this.b = ajeb;
        }

        public final void a() {
            this.b.a(new ajha(this, this.a));
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

    public ajrs(ajeb<T> ajeb, ajdb ajdb) {
        this.a = ajeb;
        this.b = ajdb;
    }

    public final void b(ajdz<? super T> ajdz) {
        this.b.a(new a(ajdz, this.a));
    }
}
