package defpackage;

import java.util.concurrent.Callable;

/* renamed from: ajqm */
public final class ajqm<T, R> extends ajnp<T, R> {
    private ajex<R, ? super T, R> b;
    private Callable<R> c;

    /* renamed from: ajqm$a */
    static final class a<T, R> implements ajdv<T>, ajej {
        private ajdv<? super R> a;
        private ajex<R, ? super T, R> b;
        private R c;
        private ajej d;
        private boolean e;

        a(ajdv<? super R> ajdv, ajex<R, ? super T, R> ajex, R r) {
            this.a = ajdv;
            this.b = ajex;
            this.c = r;
        }

        public final void a() {
            if (!this.e) {
                this.e = true;
                this.a.a();
            }
        }

        public final void a(ajej ajej) {
            if (ajfp.a(this.d, ajej)) {
                this.d = ajej;
                this.a.a((ajej) this);
                this.a.a(this.c);
            }
        }

        public final void a(T t) {
            if (!this.e) {
                try {
                    Object a = ajfv.a(this.b.apply(this.c, t), "The accumulator returned a null value");
                    this.c = a;
                    this.a.a(a);
                } catch (Throwable th) {
                    ajep.a(th);
                    this.d.dispose();
                    a(th);
                }
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
            this.d.dispose();
        }

        public final boolean isDisposed() {
            return this.d.isDisposed();
        }
    }

    public ajqm(ajdt<T> ajdt, Callable<R> callable, ajex<R, ? super T, R> ajex) {
        super(ajdt);
        this.b = ajex;
        this.c = callable;
    }

    public final void a_(ajdv<? super R> ajdv) {
        try {
            this.a.a(new a(ajdv, this.b, ajfv.a(this.c.call(), "The seed supplied is null")));
        } catch (Throwable th) {
            ajep.a(th);
            ajfq.a(th, (ajdv) ajdv);
        }
    }
}
