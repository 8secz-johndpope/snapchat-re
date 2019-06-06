package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajpt */
public final class ajpt<T> extends ajnp<T, T> {
    private ajdn<? extends T> b;

    /* renamed from: ajpt$a */
    static final class a<T> extends AtomicInteger implements ajdv<T>, ajej {
        final ajdv<? super T> a;
        final AtomicReference<ajej> b = new AtomicReference();
        final a<T> c = new a(this);
        final ajul d = new ajul();
        T e;
        volatile int f;
        private volatile ajge<T> g;
        private volatile boolean h;
        private volatile boolean i;

        /* renamed from: ajpt$a$a */
        static final class a<T> extends AtomicReference<ajej> implements ajdl<T> {
            private a<T> a;

            a(a<T> aVar) {
                this.a = aVar;
            }

            public final void a() {
                a aVar = this.a;
                aVar.f = 2;
                aVar.b();
            }

            public final void a(ajej ajej) {
                ajfp.b(this, ajej);
            }

            public final void a(Throwable th) {
                a aVar = this.a;
                if (ajur.a(aVar.d, th)) {
                    ajfp.a(aVar.b);
                    aVar.b();
                    return;
                }
                ajvo.a(th);
            }

            public final void b_(T t) {
                a aVar = this.a;
                if (aVar.compareAndSet(0, 1)) {
                    aVar.a.a((Object) t);
                    aVar.f = 2;
                } else {
                    aVar.e = t;
                    aVar.f = 1;
                    if (aVar.getAndIncrement() != 0) {
                        return;
                    }
                }
                aVar.c();
            }
        }

        a(ajdv<? super T> ajdv) {
            this.a = ajdv;
        }

        public final void a() {
            this.i = true;
            b();
        }

        public final void a(ajej ajej) {
            ajfp.b(this.b, ajej);
        }

        public final void a(T t) {
            if (compareAndSet(0, 1)) {
                this.a.a((Object) t);
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            ajge ajge = this.g;
            if (ajge == null) {
                ajge = new ajtb(ajde.a);
                this.g = ajge;
            }
            ajge.offer(t);
            if (getAndIncrement() != 0) {
                return;
            }
            c();
        }

        public final void a(Throwable th) {
            if (ajur.a(this.d, th)) {
                ajfp.a(this.b);
                b();
                return;
            }
            ajvo.a(th);
        }

        /* Access modifiers changed, original: final */
        public final void b() {
            if (getAndIncrement() == 0) {
                c();
            }
        }

        /* Access modifiers changed, original: final */
        public final void c() {
            ajdv ajdv = this.a;
            int i = 1;
            while (!this.h) {
                if (this.d.get() != null) {
                    this.e = null;
                    this.g = null;
                    ajdv.a(ajur.a(this.d));
                    return;
                }
                int i2 = this.f;
                if (i2 == 1) {
                    Object obj = this.e;
                    this.e = null;
                    this.f = 2;
                    ajdv.a(obj);
                    i2 = 2;
                }
                boolean z = this.i;
                ajge ajge = this.g;
                Object poll = ajge != null ? ajge.poll() : null;
                Object obj2 = poll == null ? 1 : null;
                if (z && obj2 != null && i2 == 2) {
                    this.g = null;
                    ajdv.a();
                    return;
                } else if (obj2 == null) {
                    ajdv.a(poll);
                } else {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
            this.e = null;
            this.g = null;
        }

        public final void dispose() {
            this.h = true;
            ajfp.a(this.b);
            ajfp.a(this.c);
            if (getAndIncrement() == 0) {
                this.g = null;
                this.e = null;
            }
        }

        public final boolean isDisposed() {
            return ajfp.a((ajej) this.b.get());
        }
    }

    public ajpt(ajdp<T> ajdp, ajdn<? extends T> ajdn) {
        super(ajdp);
        this.b = ajdn;
    }

    public final void a_(ajdv<? super T> ajdv) {
        ajej aVar = new a(ajdv);
        ajdv.a(aVar);
        this.a.a(aVar);
        this.b.b(aVar.c);
    }
}
