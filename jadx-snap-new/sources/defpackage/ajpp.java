package defpackage;

import java.util.NoSuchElementException;

/* renamed from: ajpp */
public final class ajpp<T> extends ajdx<T> {
    private ajdt<T> a;
    private T b;

    /* renamed from: ajpp$a */
    static final class a<T> implements ajdv<T>, ajej {
        private ajdz<? super T> a;
        private T b;
        private ajej c;
        private T d;

        a(ajdz<? super T> ajdz, T t) {
            this.a = ajdz;
            this.b = t;
        }

        public final void a() {
            this.c = ajfp.DISPOSED;
            Object obj = this.d;
            if (obj != null) {
                this.d = null;
                this.a.b_(obj);
                return;
            }
            obj = this.b;
            if (obj != null) {
                this.a.b_(obj);
            } else {
                this.a.a(new NoSuchElementException());
            }
        }

        public final void a(ajej ajej) {
            if (ajfp.a(this.c, ajej)) {
                this.c = ajej;
                this.a.a((ajej) this);
            }
        }

        public final void a(T t) {
            this.d = t;
        }

        public final void a(Throwable th) {
            this.c = ajfp.DISPOSED;
            this.d = null;
            this.a.a(th);
        }

        public final void dispose() {
            this.c.dispose();
            this.c = ajfp.DISPOSED;
        }

        public final boolean isDisposed() {
            return this.c == ajfp.DISPOSED;
        }
    }

    public ajpp(ajdt<T> ajdt, T t) {
        this.a = ajdt;
        this.b = t;
    }

    public final void b(ajdz<? super T> ajdz) {
        this.a.a(new a(ajdz, this.b));
    }
}
