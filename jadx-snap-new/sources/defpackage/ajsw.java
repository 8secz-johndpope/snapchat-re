package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajsw */
public final class ajsw<T> extends ajdx<T> {
    private ajeb<T> a;
    private ajdw b;

    /* renamed from: ajsw$a */
    static final class a<T> extends AtomicReference<ajej> implements ajdz<T>, ajej, Runnable {
        private ajdz<? super T> a;
        private ajdw b;
        private ajej c;

        a(ajdz<? super T> ajdz, ajdw ajdw) {
            this.a = ajdz;
            this.b = ajdw;
        }

        public final void a(ajej ajej) {
            if (ajfp.b(this, ajej)) {
                this.a.a((ajej) this);
            }
        }

        public final void a(Throwable th) {
            this.a.a(th);
        }

        public final void b_(T t) {
            this.a.b_(t);
        }

        public final void dispose() {
            ajej ajej = (ajej) getAndSet(ajfp.DISPOSED);
            if (ajej != ajfp.DISPOSED) {
                this.c = ajej;
                this.b.a((Runnable) this);
            }
        }

        public final boolean isDisposed() {
            return ajfp.a((ajej) get());
        }

        public final void run() {
            this.c.dispose();
        }
    }

    public ajsw(ajeb<T> ajeb, ajdw ajdw) {
        this.a = ajeb;
        this.b = ajdw;
    }

    public final void b(ajdz<? super T> ajdz) {
        this.a.a(new a(ajdz, this.b));
    }
}
