package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajqt */
public final class ajqt<T> extends ajnp<T, T> {
    private ajdw b;

    /* renamed from: ajqt$a */
    static final class a<T> extends AtomicReference<ajej> implements ajdv<T>, ajej {
        private ajdv<? super T> a;
        private AtomicReference<ajej> b = new AtomicReference();

        a(ajdv<? super T> ajdv) {
            this.a = ajdv;
        }

        public final void a() {
            this.a.a();
        }

        public final void a(ajej ajej) {
            ajfp.b(this.b, ajej);
        }

        public final void a(T t) {
            this.a.a((Object) t);
        }

        public final void a(Throwable th) {
            this.a.a(th);
        }

        public final void dispose() {
            ajfp.a(this.b);
            ajfp.a((AtomicReference) this);
        }

        public final boolean isDisposed() {
            return ajfp.a((ajej) get());
        }
    }

    /* renamed from: ajqt$b */
    final class b implements Runnable {
        private final a<T> a;

        b(a<T> aVar) {
            this.a = aVar;
        }

        public final void run() {
            ajqt.this.a.a(this.a);
        }
    }

    public ajqt(ajdt<T> ajdt, ajdw ajdw) {
        super(ajdt);
        this.b = ajdw;
    }

    public final void a_(ajdv<? super T> ajdv) {
        ajej aVar = new a(ajdv);
        ajdv.a(aVar);
        ajfp.b(aVar, this.b.a(new b(aVar)));
    }
}
