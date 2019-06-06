package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ajqe */
public final class ajqe<T> extends ajnp<T, T> {
    private long b;

    /* renamed from: ajqe$a */
    static final class a<T> extends AtomicInteger implements ajdv<T> {
        private ajdv<? super T> a;
        private ajft b;
        private ajdt<? extends T> c;
        private long d;

        a(ajdv<? super T> ajdv, long j, ajft ajft, ajdt<? extends T> ajdt) {
            this.a = ajdv;
            this.b = ajft;
            this.c = ajdt;
            this.d = j;
        }

        public final void a() {
            long j = this.d;
            if (j != Long.MAX_VALUE) {
                this.d = j - 1;
            }
            if (j != 0) {
                b();
            } else {
                this.a.a();
            }
        }

        public final void a(ajej ajej) {
            ajfp.c(this.b, ajej);
        }

        public final void a(T t) {
            this.a.a((Object) t);
        }

        public final void a(Throwable th) {
            this.a.a(th);
        }

        /* Access modifiers changed, original: final */
        public final void b() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.b.isDisposed()) {
                    this.c.a(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                    }
                }
            }
        }
    }

    public ajqe(ajdp<T> ajdp, long j) {
        super(ajdp);
        this.b = j;
    }

    public final void a_(ajdv<? super T> ajdv) {
        ajej ajft = new ajft();
        ajdv.a(ajft);
        long j = this.b;
        long j2 = Long.MAX_VALUE;
        if (j != Long.MAX_VALUE) {
            j2 = j - 1;
        }
        new a(ajdv, j2, ajft, this.a).b();
    }
}
