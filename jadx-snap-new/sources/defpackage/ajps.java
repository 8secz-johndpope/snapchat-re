package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajps */
public final class ajps<T> extends ajnp<T, T> {
    private ajdb b;

    /* renamed from: ajps$a */
    static final class a<T> extends AtomicInteger implements ajdv<T>, ajej {
        final ajdv<? super T> a;
        final AtomicReference<ajej> b = new AtomicReference();
        final a c = new a(this);
        final ajul d = new ajul();
        volatile boolean e;
        volatile boolean f;

        /* renamed from: ajps$a$a */
        static final class a extends AtomicReference<ajej> implements ajcz {
            private a<?> a;

            a(a<?> aVar) {
                this.a = aVar;
            }

            public final void a() {
                AtomicInteger atomicInteger = this.a;
                atomicInteger.f = true;
                if (atomicInteger.e) {
                    ajus.a(atomicInteger.a, atomicInteger, atomicInteger.d);
                }
            }

            public final void a(ajej ajej) {
                ajfp.b(this, ajej);
            }

            public final void a(Throwable th) {
                AtomicInteger atomicInteger = this.a;
                ajfp.a(atomicInteger.b);
                ajus.a(atomicInteger.a, th, atomicInteger, atomicInteger.d);
            }
        }

        a(ajdv<? super T> ajdv) {
            this.a = ajdv;
        }

        public final void a() {
            this.e = true;
            if (this.f) {
                ajus.a(this.a, (AtomicInteger) this, this.d);
            }
        }

        public final void a(ajej ajej) {
            ajfp.b(this.b, ajej);
        }

        public final void a(T t) {
            ajus.a(this.a, (Object) t, (AtomicInteger) this, this.d);
        }

        public final void a(Throwable th) {
            ajfp.a(this.b);
            ajus.a(this.a, th, (AtomicInteger) this, this.d);
        }

        public final void dispose() {
            ajfp.a(this.b);
            ajfp.a(this.c);
        }

        public final boolean isDisposed() {
            return ajfp.a((ajej) this.b.get());
        }
    }

    public ajps(ajdp<T> ajdp, ajdb ajdb) {
        super(ajdp);
        this.b = ajdb;
    }

    public final void a_(ajdv<? super T> ajdv) {
        ajej aVar = new a(ajdv);
        ajdv.a(aVar);
        this.a.a(aVar);
        this.b.a(aVar.c);
    }
}
