package defpackage;

import java.util.NoSuchElementException;

/* renamed from: ajqp */
public final class ajqp<T> extends ajdx<T> {
    private ajdt<? extends T> a;
    private T b;

    /* renamed from: ajqp$a */
    static final class a<T> implements ajdv<T>, ajej {
        private ajdz<? super T> a;
        private T b;
        private ajej c;
        private T d;
        private boolean e;

        a(ajdz<? super T> ajdz, T t) {
            this.a = ajdz;
            this.b = t;
        }

        public final void a() {
            if (!this.e) {
                this.e = true;
                Object obj = this.d;
                this.d = null;
                if (obj == null) {
                    obj = this.b;
                }
                if (obj != null) {
                    this.a.b_(obj);
                } else {
                    this.a.a(new NoSuchElementException());
                }
            }
        }

        public final void a(ajej ajej) {
            if (ajfp.a(this.c, ajej)) {
                this.c = ajej;
                this.a.a((ajej) this);
            }
        }

        public final void a(T t) {
            if (!this.e) {
                if (this.d != null) {
                    this.e = true;
                    this.c.dispose();
                    this.a.a(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.d = t;
            }
        }

        public final void a(Throwable th) {
            if (this.e) {
                ajvo.a(th);
                return;
            }
            this.e = true;
            this.a.a(th);
        }

        public final void dispose() {
            this.c.dispose();
        }

        public final boolean isDisposed() {
            return this.c.isDisposed();
        }
    }

    public ajqp(ajdt<? extends T> ajdt, T t) {
        this.a = ajdt;
        this.b = t;
    }

    public final void b(ajdz<? super T> ajdz) {
        this.a.a(new a(ajdz, this.b));
    }
}
