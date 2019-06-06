package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ajri */
public final class ajri<T> extends ajnp<T, T> {
    private ajdw b;

    /* renamed from: ajri$a */
    static final class a<T> extends AtomicBoolean implements ajdv<T>, ajej {
        ajej a;
        private ajdv<? super T> b;
        private ajdw c;

        /* renamed from: ajri$a$a */
        final class a implements Runnable {
            a() {
            }

            public final void run() {
                a.this.a.dispose();
            }
        }

        a(ajdv<? super T> ajdv, ajdw ajdw) {
            this.b = ajdv;
            this.c = ajdw;
        }

        public final void a() {
            if (!get()) {
                this.b.a();
            }
        }

        public final void a(ajej ajej) {
            if (ajfp.a(this.a, ajej)) {
                this.a = ajej;
                this.b.a((ajej) this);
            }
        }

        public final void a(T t) {
            if (!get()) {
                this.b.a((Object) t);
            }
        }

        public final void a(Throwable th) {
            if (get()) {
                ajvo.a(th);
            } else {
                this.b.a(th);
            }
        }

        public final void dispose() {
            if (compareAndSet(false, true)) {
                this.c.a(new a());
            }
        }

        public final boolean isDisposed() {
            return get();
        }
    }

    public ajri(ajdt<T> ajdt, ajdw ajdw) {
        super(ajdt);
        this.b = ajdw;
    }

    public final void a_(ajdv<? super T> ajdv) {
        this.a.a(new a(ajdv, this.b));
    }
}
