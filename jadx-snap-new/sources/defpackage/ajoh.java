package defpackage;

import defpackage.ajdw.c;
import java.util.concurrent.TimeUnit;

/* renamed from: ajoh */
public final class ajoh<T> extends ajnp<T, T> {
    private long b;
    private TimeUnit c;
    private ajdw d;
    private boolean e = false;

    /* renamed from: ajoh$a */
    static final class a<T> implements ajdv<T>, ajej {
        final ajdv<? super T> a;
        final c b;
        private long c;
        private TimeUnit d;
        private boolean e;
        private ajej f;

        /* renamed from: ajoh$a$c */
        final class c implements Runnable {
            private final T a;

            c(T t) {
                this.a = t;
            }

            public final void run() {
                a.this.a.a(this.a);
            }
        }

        /* renamed from: ajoh$a$a */
        final class a implements Runnable {
            a() {
            }

            public final void run() {
                try {
                    a.this.a.a();
                } finally {
                    a.this.b.dispose();
                }
            }
        }

        /* renamed from: ajoh$a$b */
        final class b implements Runnable {
            private final Throwable a;

            b(Throwable th) {
                this.a = th;
            }

            public final void run() {
                try {
                    a.this.a.a(this.a);
                } finally {
                    a.this.b.dispose();
                }
            }
        }

        a(ajdv<? super T> ajdv, long j, TimeUnit timeUnit, c cVar, boolean z) {
            this.a = ajdv;
            this.c = j;
            this.d = timeUnit;
            this.b = cVar;
            this.e = z;
        }

        public final void a() {
            this.b.a(new a(), this.c, this.d);
        }

        public final void a(ajej ajej) {
            if (ajfp.a(this.f, ajej)) {
                this.f = ajej;
                this.a.a((ajej) this);
            }
        }

        public final void a(T t) {
            this.b.a(new c(t), this.c, this.d);
        }

        public final void a(Throwable th) {
            this.b.a(new b(th), this.e ? this.c : 0, this.d);
        }

        public final void dispose() {
            this.f.dispose();
            this.b.dispose();
        }

        public final boolean isDisposed() {
            return this.b.isDisposed();
        }
    }

    public ajoh(ajdt<T> ajdt, long j, TimeUnit timeUnit, ajdw ajdw) {
        super(ajdt);
        this.b = j;
        this.c = timeUnit;
        this.d = ajdw;
    }

    public final void a_(ajdv<? super T> ajdv) {
        this.a.a(new a(new ajvm(ajdv), this.b, this.c, this.d.b(), false));
    }
}
