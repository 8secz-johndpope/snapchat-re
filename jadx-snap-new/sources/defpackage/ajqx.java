package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajqx */
public final class ajqx<T, U> extends ajnp<T, T> {
    private ajdt<? extends U> b;

    /* renamed from: ajqx$a */
    static final class a<T, U> extends AtomicInteger implements ajdv<T>, ajej {
        final ajdv<? super T> a;
        final AtomicReference<ajej> b = new AtomicReference();
        final a c = new a();
        final ajul d = new ajul();

        /* renamed from: ajqx$a$a */
        final class a extends AtomicReference<ajej> implements ajdv<U> {
            a() {
            }

            public final void a() {
                a.this.b();
            }

            public final void a(ajej ajej) {
                ajfp.b(this, ajej);
            }

            public final void a(U u) {
                ajfp.a((AtomicReference) this);
                a.this.b();
            }

            public final void a(Throwable th) {
                AtomicInteger atomicInteger = a.this;
                ajfp.a(atomicInteger.b);
                ajus.a(atomicInteger.a, th, atomicInteger, atomicInteger.d);
            }
        }

        a(ajdv<? super T> ajdv) {
            this.a = ajdv;
        }

        public final void a() {
            ajfp.a(this.c);
            ajus.a(this.a, (AtomicInteger) this, this.d);
        }

        public final void a(ajej ajej) {
            ajfp.b(this.b, ajej);
        }

        public final void a(T t) {
            ajus.a(this.a, (Object) t, (AtomicInteger) this, this.d);
        }

        public final void a(Throwable th) {
            ajfp.a(this.c);
            ajus.a(this.a, th, (AtomicInteger) this, this.d);
        }

        /* Access modifiers changed, original: final */
        public final void b() {
            ajfp.a(this.b);
            ajus.a(this.a, (AtomicInteger) this, this.d);
        }

        public final void dispose() {
            ajfp.a(this.b);
            ajfp.a(this.c);
        }

        public final boolean isDisposed() {
            return ajfp.a((ajej) this.b.get());
        }
    }

    public ajqx(ajdt<T> ajdt, ajdt<? extends U> ajdt2) {
        super(ajdt);
        this.b = ajdt2;
    }

    public final void a_(ajdv<? super T> ajdv) {
        ajej aVar = new a(ajdv);
        ajdv.a(aVar);
        this.b.a(aVar.c);
        this.a.a(aVar);
    }
}
