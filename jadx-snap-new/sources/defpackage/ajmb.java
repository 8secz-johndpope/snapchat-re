package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajmb */
public final class ajmb<T, R> extends ajlj<T, R> {
    private ajfc<? super T, ? extends ajdn<? extends R>> b;

    /* renamed from: ajmb$a */
    static final class a<T, R> extends AtomicReference<ajej> implements ajdl<T>, ajej {
        final ajdl<? super R> a;
        private ajfc<? super T, ? extends ajdn<? extends R>> b;
        private ajej c;

        /* renamed from: ajmb$a$a */
        final class a implements ajdl<R> {
            a() {
            }

            public final void a() {
                a.this.a.a();
            }

            public final void a(ajej ajej) {
                ajfp.b(a.this, ajej);
            }

            public final void a(Throwable th) {
                a.this.a.a(th);
            }

            public final void b_(R r) {
                a.this.a.b_(r);
            }
        }

        a(ajdl<? super R> ajdl, ajfc<? super T, ? extends ajdn<? extends R>> ajfc) {
            this.a = ajdl;
            this.b = ajfc;
        }

        public final void a() {
            this.a.a();
        }

        public final void a(ajej ajej) {
            if (ajfp.a(this.c, ajej)) {
                this.c = ajej;
                this.a.a((ajej) this);
            }
        }

        public final void a(Throwable th) {
            this.a.a(th);
        }

        public final void b_(T t) {
            try {
                ajdn ajdn = (ajdn) ajfv.a(this.b.apply(t), "The mapper returned a null MaybeSource");
                if (!isDisposed()) {
                    ajdn.b(new a());
                }
            } catch (Exception e) {
                ajep.a(e);
                this.a.a(e);
            }
        }

        public final void dispose() {
            ajfp.a((AtomicReference) this);
            this.c.dispose();
        }

        public final boolean isDisposed() {
            return ajfp.a((ajej) get());
        }
    }

    public ajmb(ajdn<T> ajdn, ajfc<? super T, ? extends ajdn<? extends R>> ajfc) {
        super(ajdn);
        this.b = ajfc;
    }

    public final void a(ajdl<? super R> ajdl) {
        this.a.b(new a(ajdl, this.b));
    }
}
