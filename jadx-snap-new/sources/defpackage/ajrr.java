package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: ajrr */
public final class ajrr<T> extends ajdx<T> {
    final long a;
    final TimeUnit b;
    final ajdw c;
    final boolean d = false;
    private ajeb<? extends T> e;

    /* renamed from: ajrr$a */
    final class a implements ajdz<T> {
        final ajdz<? super T> a;
        private final ajft b;

        /* renamed from: ajrr$a$b */
        final class b implements Runnable {
            private final T a;

            b(T t) {
                this.a = t;
            }

            public final void run() {
                a.this.a.b_(this.a);
            }
        }

        /* renamed from: ajrr$a$a */
        final class a implements Runnable {
            private final Throwable a;

            a(Throwable th) {
                this.a = th;
            }

            public final void run() {
                a.this.a.a(this.a);
            }
        }

        a(ajft ajft, ajdz<? super T> ajdz) {
            this.b = ajft;
            this.a = ajdz;
        }

        public final void a(ajej ajej) {
            ajfp.c(this.b, ajej);
        }

        public final void a(Throwable th) {
            ajfp.c(this.b, ajrr.this.c.a(new a(th), 0, ajrr.this.b));
        }

        public final void b_(T t) {
            ajfp.c(this.b, ajrr.this.c.a(new b(t), ajrr.this.a, ajrr.this.b));
        }
    }

    public ajrr(ajeb<? extends T> ajeb, long j, TimeUnit timeUnit, ajdw ajdw) {
        this.e = ajeb;
        this.a = j;
        this.b = timeUnit;
        this.c = ajdw;
    }

    public final void b(ajdz<? super T> ajdz) {
        ajej ajft = new ajft();
        ajdz.a(ajft);
        this.e.a(new a(ajft, ajdz));
    }
}
