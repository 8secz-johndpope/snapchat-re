package defpackage;

import java.util.NoSuchElementException;

/* renamed from: ajos */
public final class ajos<T> extends ajdx<T> implements ajfz<T> {
    private ajdt<T> a;
    private long b = 0;
    private T c;

    /* renamed from: ajos$a */
    static final class a<T> implements ajdv<T>, ajej {
        private ajdz<? super T> a;
        private long b;
        private T c;
        private ajej d;
        private long e;
        private boolean f;

        a(ajdz<? super T> ajdz, long j, T t) {
            this.a = ajdz;
            this.b = j;
            this.c = t;
        }

        public final void a() {
            if (!this.f) {
                this.f = true;
                Object obj = this.c;
                if (obj != null) {
                    this.a.b_(obj);
                    return;
                }
                this.a.a(new NoSuchElementException());
            }
        }

        public final void a(ajej ajej) {
            if (ajfp.a(this.d, ajej)) {
                this.d = ajej;
                this.a.a((ajej) this);
            }
        }

        public final void a(T t) {
            if (!this.f) {
                long j = this.e;
                if (j == this.b) {
                    this.f = true;
                    this.d.dispose();
                    this.a.b_(t);
                    return;
                }
                this.e = j + 1;
            }
        }

        public final void a(Throwable th) {
            if (this.f) {
                ajvo.a(th);
                return;
            }
            this.f = true;
            this.a.a(th);
        }

        public final void dispose() {
            this.d.dispose();
        }

        public final boolean isDisposed() {
            return this.d.isDisposed();
        }
    }

    public ajos(ajdt<T> ajdt, T t) {
        this.a = ajdt;
        this.c = t;
    }

    public final ajdp<T> ap_() {
        return ajvo.a(new ajoq(this.a, 0, this.c, true));
    }

    public final void b(ajdz<? super T> ajdz) {
        this.a.a(new a(ajdz, 0, this.c));
    }
}
