package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajsr */
public final class ajsr<T> extends ajdx<T> {
    private ajeb<? extends T> a;
    private ajdw b;

    /* renamed from: ajsr$a */
    static final class a<T> extends AtomicReference<ajej> implements ajdz<T>, ajej, Runnable {
        final ajft a = new ajft();
        private ajdz<? super T> b;
        private ajeb<? extends T> c;

        a(ajdz<? super T> ajdz, ajeb<? extends T> ajeb) {
            this.b = ajdz;
            this.c = ajeb;
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

        public final void run() {
            this.c.a(this);
        }
    }

    public ajsr(ajeb<? extends T> ajeb, ajdw ajdw) {
        this.a = ajeb;
        this.b = ajdw;
    }

    public final void b(ajdz<? super T> ajdz) {
        Runnable aVar = new a(ajdz, this.a);
        ajdz.a((ajej) aVar);
        ajfp.c(aVar.a, this.b.a(aVar));
    }
}
