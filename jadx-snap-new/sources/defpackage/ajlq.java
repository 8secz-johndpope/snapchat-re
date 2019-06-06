package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajlq */
public final class ajlq<T> extends ajdj<T> {
    private ajdn<T> a;
    private ajdb b;

    /* renamed from: ajlq$b */
    static final class b<T> extends AtomicReference<ajej> implements ajcz, ajej {
        private ajdl<? super T> a;
        private ajdn<T> b;

        b(ajdl<? super T> ajdl, ajdn<T> ajdn) {
            this.a = ajdl;
            this.b = ajdn;
        }

        public final void a() {
            this.b.b(new a(this, this.a));
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

    /* renamed from: ajlq$a */
    static final class a<T> implements ajdl<T> {
        private AtomicReference<ajej> a;
        private ajdl<? super T> b;

        a(AtomicReference<ajej> atomicReference, ajdl<? super T> ajdl) {
            this.a = atomicReference;
            this.b = ajdl;
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

        public final void b_(T t) {
            this.b.b_(t);
        }
    }

    public ajlq(ajdn<T> ajdn, ajdb ajdb) {
        this.a = ajdn;
        this.b = ajdb;
    }

    public final void a(ajdl<? super T> ajdl) {
        this.b.a(new b(ajdl, this.a));
    }
}
