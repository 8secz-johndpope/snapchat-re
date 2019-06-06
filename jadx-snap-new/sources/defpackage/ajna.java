package defpackage;

import java.util.NoSuchElementException;

/* renamed from: ajna */
public final class ajna<T> extends ajdx<T> {
    private ajdn<T> a;
    private T b;

    /* renamed from: ajna$a */
    static final class a<T> implements ajdl<T>, ajej {
        private ajdz<? super T> a;
        private T b;
        private ajej c;

        a(ajdz<? super T> ajdz, T t) {
            this.a = ajdz;
            this.b = t;
        }

        public final void a() {
            this.c = ajfp.DISPOSED;
            Object obj = this.b;
            if (obj != null) {
                this.a.b_(obj);
            } else {
                this.a.a(new NoSuchElementException("The MaybeSource is empty"));
            }
        }

        public final void a(ajej ajej) {
            if (ajfp.a(this.c, ajej)) {
                this.c = ajej;
                this.a.a((ajej) this);
            }
        }

        public final void a(Throwable th) {
            this.c = ajfp.DISPOSED;
            this.a.a(th);
        }

        public final void b_(T t) {
            this.c = ajfp.DISPOSED;
            this.a.b_(t);
        }

        public final void dispose() {
            this.c.dispose();
            this.c = ajfp.DISPOSED;
        }

        public final boolean isDisposed() {
            return this.c.isDisposed();
        }
    }

    public ajna(ajdn<T> ajdn, T t) {
        this.a = ajdn;
        this.b = t;
    }

    public final void b(ajdz<? super T> ajdz) {
        this.a.b(new a(ajdz, this.b));
    }
}
