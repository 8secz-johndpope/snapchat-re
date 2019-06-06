package defpackage;

import defpackage.ajdw.c;
import java.util.concurrent.TimeUnit;

/* renamed from: ajjb */
public final class ajjb<T> extends ajim<T, T> {
    private long c;
    private TimeUnit d;
    private ajdw e;
    private boolean f = false;

    /* renamed from: ajjb$a */
    static final class a<T> implements ajdh<T>, akuy {
        final akux<? super T> a;
        final c b;
        private long c;
        private TimeUnit d;
        private boolean e;
        private akuy f;

        /* renamed from: ajjb$a$c */
        final class c implements Runnable {
            private final T a;

            c(T t) {
                this.a = t;
            }

            public final void run() {
                a.this.a.a(this.a);
            }
        }

        /* renamed from: ajjb$a$a */
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

        /* renamed from: ajjb$a$b */
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

        a(akux<? super T> akux, long j, TimeUnit timeUnit, c cVar, boolean z) {
            this.a = akux;
            this.c = j;
            this.d = timeUnit;
            this.b = cVar;
            this.e = z;
        }

        public final void a() {
            this.b.a(new a(), this.c, this.d);
        }

        public final void a(long j) {
            this.f.a(j);
        }

        public final void a(akuy akuy) {
            if (ajui.a(this.f, akuy)) {
                this.f = akuy;
                this.a.a((akuy) this);
            }
        }

        public final void a(T t) {
            this.b.a(new c(t), this.c, this.d);
        }

        public final void a(Throwable th) {
            this.b.a(new b(th), this.e ? this.c : 0, this.d);
        }

        public final void b() {
            this.f.b();
            this.b.dispose();
        }
    }

    public ajjb(ajde<T> ajde, long j, TimeUnit timeUnit, ajdw ajdw) {
        super(ajde);
        this.c = j;
        this.d = timeUnit;
        this.e = ajdw;
    }

    public final void a_(akux<? super T> akux) {
        this.b.a(new a(new ajwx(akux), this.c, this.d, this.e.b(), false));
    }
}
