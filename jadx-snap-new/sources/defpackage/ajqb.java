package defpackage;

/* renamed from: ajqb */
public final class ajqb<T> extends ajdj<T> {
    private ajdt<T> a;
    private ajex<T, T, T> b;

    /* renamed from: ajqb$a */
    static final class a<T> implements ajdv<T>, ajej {
        private ajdl<? super T> a;
        private ajex<T, T, T> b;
        private boolean c;
        private T d;
        private ajej e;

        a(ajdl<? super T> ajdl, ajex<T, T, T> ajex) {
            this.a = ajdl;
            this.b = ajex;
        }

        public final void a() {
            if (!this.c) {
                this.c = true;
                Object obj = this.d;
                this.d = null;
                if (obj != null) {
                    this.a.b_(obj);
                } else {
                    this.a.a();
                }
            }
        }

        public final void a(ajej ajej) {
            if (ajfp.a(this.e, ajej)) {
                this.e = ajej;
                this.a.a((ajej) this);
            }
        }

        public final void a(T t) {
            if (!this.c) {
                Object obj = this.d;
                if (obj == null) {
                    this.d = t;
                    return;
                }
                try {
                    this.d = ajfv.a(this.b.apply(obj, t), "The reducer returned a null value");
                } catch (Throwable th) {
                    ajep.a(th);
                    this.e.dispose();
                    a(th);
                }
            }
        }

        public final void a(Throwable th) {
            if (this.c) {
                ajvo.a(th);
                return;
            }
            this.c = true;
            this.d = null;
            this.a.a(th);
        }

        public final void dispose() {
            this.e.dispose();
        }

        public final boolean isDisposed() {
            return this.e.isDisposed();
        }
    }

    public ajqb(ajdt<T> ajdt, ajex<T, T, T> ajex) {
        this.a = ajdt;
        this.b = ajex;
    }

    public final void a(ajdl<? super T> ajdl) {
        this.a.a(new a(ajdl, this.b));
    }
}
