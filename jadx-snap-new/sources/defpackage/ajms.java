package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajms */
public final class ajms<T> extends ajlj<T, T> {
    private ajdw b;

    /* renamed from: ajms$a */
    static final class a<T> extends AtomicReference<ajej> implements ajdl<T>, ajej {
        final ajft a = new ajft();
        private ajdl<? super T> b;

        a(ajdl<? super T> ajdl) {
            this.b = ajdl;
        }

        public final void a() {
            this.b.a();
        }

        public final void a(ajej ajej) {
            ajfp.b(this, ajej);
        }

        public final void a(Throwable th) {
            this.b.a(th);
        }

        public final void b_(T t) {
            this.b.b_(t);
        }

        public final void dispose() {
            ajfp.a((AtomicReference) this);
            this.a.dispose();
        }

        public final boolean isDisposed() {
            return ajfp.a((ajej) get());
        }
    }

    /* renamed from: ajms$b */
    static final class b<T> implements Runnable {
        private ajdl<? super T> a;
        private ajdn<T> b;

        b(ajdl<? super T> ajdl, ajdn<T> ajdn) {
            this.a = ajdl;
            this.b = ajdn;
        }

        public final void run() {
            this.b.b(this.a);
        }
    }

    public ajms(ajdn<T> ajdn, ajdw ajdw) {
        super(ajdn);
        this.b = ajdw;
    }

    public final void a(ajdl<? super T> ajdl) {
        ajej aVar = new a(ajdl);
        ajdl.a(aVar);
        ajfp.c(aVar.a, this.b.a(new b(aVar, this.a)));
    }
}
