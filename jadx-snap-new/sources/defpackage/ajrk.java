package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajrk */
public final class ajrk<T, U, R> extends ajnp<T, R> {
    private ajex<? super T, ? super U, ? extends R> b;
    private ajdt<? extends U> c;

    /* renamed from: ajrk$a */
    static final class a<T, U, R> extends AtomicReference<U> implements ajdv<T>, ajej {
        final ajdv<? super R> a;
        final AtomicReference<ajej> b = new AtomicReference();
        final AtomicReference<ajej> c = new AtomicReference();
        private ajex<? super T, ? super U, ? extends R> d;

        a(ajdv<? super R> ajdv, ajex<? super T, ? super U, ? extends R> ajex) {
            this.a = ajdv;
            this.d = ajex;
        }

        public final void a() {
            ajfp.a(this.c);
            this.a.a();
        }

        public final void a(ajej ajej) {
            ajfp.b(this.b, ajej);
        }

        public final void a(T t) {
            Object obj = get();
            if (obj != null) {
                try {
                    this.a.a(ajfv.a(this.d.apply(t, obj), "The combiner returned a null value"));
                } catch (Throwable th) {
                    ajep.a(th);
                    dispose();
                    this.a.a(th);
                }
            }
        }

        public final void a(Throwable th) {
            ajfp.a(this.c);
            this.a.a(th);
        }

        public final void dispose() {
            ajfp.a(this.b);
            ajfp.a(this.c);
        }

        public final boolean isDisposed() {
            return ajfp.a((ajej) this.b.get());
        }
    }

    /* renamed from: ajrk$b */
    final class b implements ajdv<U> {
        private final a<T, U, R> a;

        b(a<T, U, R> aVar) {
            this.a = aVar;
        }

        public final void a() {
        }

        public final void a(ajej ajej) {
            ajfp.b(this.a.c, ajej);
        }

        public final void a(U u) {
            this.a.lazySet(u);
        }

        public final void a(Throwable th) {
            a aVar = this.a;
            ajfp.a(aVar.b);
            aVar.a.a(th);
        }
    }

    public ajrk(ajdt<T> ajdt, ajex<? super T, ? super U, ? extends R> ajex, ajdt<? extends U> ajdt2) {
        super(ajdt);
        this.b = ajex;
        this.c = ajdt2;
    }

    public final void a_(ajdv<? super R> ajdv) {
        ajvm ajvm = new ajvm(ajdv);
        ajej aVar = new a(ajvm, this.b);
        ajvm.a(aVar);
        this.c.a(new b(aVar));
        this.a.a(aVar);
    }
}
