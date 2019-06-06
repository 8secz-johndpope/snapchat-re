package defpackage;

/* renamed from: ajqc */
public final class ajqc<T, R> extends ajdx<R> {
    private ajdt<T> a;
    private R b;
    private ajex<R, ? super T, R> c;

    /* renamed from: ajqc$a */
    static final class a<T, R> implements ajdv<T>, ajej {
        private ajdz<? super R> a;
        private ajex<R, ? super T, R> b;
        private R c;
        private ajej d;

        a(ajdz<? super R> ajdz, ajex<R, ? super T, R> ajex, R r) {
            this.a = ajdz;
            this.c = r;
            this.b = ajex;
        }

        public final void a() {
            Object obj = this.c;
            if (obj != null) {
                this.c = null;
                this.a.b_(obj);
            }
        }

        public final void a(ajej ajej) {
            if (ajfp.a(this.d, ajej)) {
                this.d = ajej;
                this.a.a((ajej) this);
            }
        }

        public final void a(T t) {
            Object obj = this.c;
            if (obj != null) {
                try {
                    this.c = ajfv.a(this.b.apply(obj, t), "The reducer returned a null value");
                } catch (Throwable th) {
                    ajep.a(th);
                    this.d.dispose();
                    a(th);
                }
            }
        }

        public final void a(Throwable th) {
            if (this.c != null) {
                this.c = null;
                this.a.a(th);
                return;
            }
            ajvo.a(th);
        }

        public final void dispose() {
            this.d.dispose();
        }

        public final boolean isDisposed() {
            return this.d.isDisposed();
        }
    }

    public ajqc(ajdt<T> ajdt, R r, ajex<R, ? super T, R> ajex) {
        this.a = ajdt;
        this.b = r;
        this.c = ajex;
    }

    public final void b(ajdz<? super R> ajdz) {
        this.a.a(new a(ajdz, this.c, this.b));
    }
}
