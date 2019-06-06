package defpackage;

/* renamed from: ajor */
public final class ajor<T> extends ajdj<T> implements ajfz<T> {
    private ajdt<T> a;
    private long b = 0;

    /* renamed from: ajor$a */
    static final class a<T> implements ajdv<T>, ajej {
        private ajdl<? super T> a;
        private long b;
        private ajej c;
        private long d;
        private boolean e;

        a(ajdl<? super T> ajdl, long j) {
            this.a = ajdl;
            this.b = j;
        }

        public final void a() {
            if (!this.e) {
                this.e = true;
                this.a.a();
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
                long j = this.d;
                if (j == this.b) {
                    this.e = true;
                    this.c.dispose();
                    this.a.b_(t);
                    return;
                }
                this.d = j + 1;
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

    public ajor(ajdt<T> ajdt) {
        this.a = ajdt;
    }

    public final void a(ajdl<? super T> ajdl) {
        this.a.a(new a(ajdl, 0));
    }

    public final ajdp<T> ap_() {
        return ajvo.a(new ajoq(this.a, 0, null, false));
    }
}
