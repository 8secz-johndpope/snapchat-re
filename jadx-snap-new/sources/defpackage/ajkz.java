package defpackage;

import defpackage.ajdw.c;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajkz */
public final class ajkz<T> extends ajim<T, T> {
    private ajdw c;
    private boolean d;

    /* renamed from: ajkz$a */
    static final class a<T> extends AtomicReference<Thread> implements ajdh<T>, akuy, Runnable {
        private akux<? super T> a;
        private c b;
        private AtomicReference<akuy> c = new AtomicReference();
        private AtomicLong d = new AtomicLong();
        private boolean e;
        private akuw<T> f;

        /* renamed from: ajkz$a$a */
        static final class a implements Runnable {
            private akuy a;
            private long b;

            a(akuy akuy, long j) {
                this.a = akuy;
                this.b = j;
            }

            public final void run() {
                this.a.a(this.b);
            }
        }

        a(akux<? super T> akux, c cVar, akuw<T> akuw, boolean z) {
            this.a = akux;
            this.b = cVar;
            this.f = akuw;
            this.e = z ^ 1;
        }

        private void a(long j, akuy akuy) {
            if (this.e || Thread.currentThread() == get()) {
                akuy.a(j);
            } else {
                this.b.a(new a(akuy, j));
            }
        }

        public final void a() {
            this.a.a();
            this.b.dispose();
        }

        public final void a(long j) {
            if (ajui.b(j)) {
                akuy akuy = (akuy) this.c.get();
                if (akuy != null) {
                    a(j, akuy);
                    return;
                }
                ajum.a(this.d, j);
                akuy akuy2 = (akuy) this.c.get();
                if (akuy2 != null) {
                    long andSet = this.d.getAndSet(0);
                    if (andSet != 0) {
                        a(andSet, akuy2);
                    }
                }
            }
        }

        public final void a(akuy akuy) {
            if (ajui.a(this.c, akuy)) {
                long andSet = this.d.getAndSet(0);
                if (andSet != 0) {
                    a(andSet, akuy);
                }
            }
        }

        public final void a(T t) {
            this.a.a((Object) t);
        }

        public final void a(Throwable th) {
            this.a.a(th);
            this.b.dispose();
        }

        public final void b() {
            ajui.a(this.c);
            this.b.dispose();
        }

        public final void run() {
            lazySet(Thread.currentThread());
            akuw akuw = this.f;
            this.f = null;
            akuw.a(this);
        }
    }

    public ajkz(ajde<T> ajde, ajdw ajdw, boolean z) {
        super(ajde);
        this.c = ajdw;
        this.d = z;
    }

    public final void a_(akux<? super T> akux) {
        c b = this.c.b();
        Runnable aVar = new a(akux, b, this.b, this.d);
        akux.a((akuy) aVar);
        b.a(aVar);
    }
}
