package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajqf */
public final class ajqf<T> extends ajnp<T, T> {
    private ajfc<? super ajdp<Object>, ? extends ajdt<?>> b;

    /* renamed from: ajqf$a */
    static final class a<T> extends AtomicInteger implements ajdv<T>, ajej {
        final ajdv<? super T> a;
        final ajul b = new ajul();
        final a c = new a();
        final AtomicReference<ajej> d = new AtomicReference();
        private AtomicInteger e = new AtomicInteger();
        private ajws<Object> f;
        private ajdt<T> g;
        private volatile boolean h;

        /* renamed from: ajqf$a$a */
        final class a extends AtomicReference<ajej> implements ajdv<Object> {
            a() {
            }

            public final void a() {
                AtomicInteger atomicInteger = a.this;
                ajfp.a(atomicInteger.d);
                ajus.a(atomicInteger.a, atomicInteger, atomicInteger.b);
            }

            public final void a(ajej ajej) {
                ajfp.b(this, ajej);
            }

            public final void a(Object obj) {
                a.this.b();
            }

            public final void a(Throwable th) {
                AtomicInteger atomicInteger = a.this;
                ajfp.a(atomicInteger.d);
                ajus.a(atomicInteger.a, th, atomicInteger, atomicInteger.b);
            }
        }

        a(ajdv<? super T> ajdv, ajws<Object> ajws, ajdt<T> ajdt) {
            this.a = ajdv;
            this.f = ajws;
            this.g = ajdt;
        }

        public final void a() {
            ajfp.c(this.d, null);
            this.h = false;
            this.f.a((Object) Integer.valueOf(0));
        }

        public final void a(ajej ajej) {
            ajfp.b(this.d, ajej);
        }

        public final void a(T t) {
            ajus.a(this.a, (Object) t, (AtomicInteger) this, this.b);
        }

        public final void a(Throwable th) {
            ajfp.a(this.c);
            ajus.a(this.a, th, (AtomicInteger) this, this.b);
        }

        /* Access modifiers changed, original: final */
        public final void b() {
            if (this.e.getAndIncrement() == 0) {
                while (!isDisposed()) {
                    if (!this.h) {
                        this.h = true;
                        this.g.a(this);
                    }
                    if (this.e.decrementAndGet() == 0) {
                    }
                }
            }
        }

        public final void dispose() {
            ajfp.a(this.d);
            ajfp.a(this.c);
        }

        public final boolean isDisposed() {
            return ajfp.a((ajej) this.d.get());
        }
    }

    public ajqf(ajdt<T> ajdt, ajfc<? super ajdp<Object>, ? extends ajdt<?>> ajfc) {
        super(ajdt);
        this.b = ajfc;
    }

    public final void a_(ajdv<? super T> ajdv) {
        ajws r = new ajwo().r();
        try {
            ajdt ajdt = (ajdt) ajfv.a(this.b.apply(r), "The handler returned a null ObservableSource");
            ajej aVar = new a(ajdv, r, this.a);
            ajdv.a(aVar);
            ajdt.a(aVar.c);
            aVar.b();
        } catch (Throwable th) {
            ajep.a(th);
            ajfq.a(th, (ajdv) ajdv);
        }
    }
}
