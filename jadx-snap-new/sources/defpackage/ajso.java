package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajso */
public final class ajso<T> extends ajdx<T> {
    private ajeb<T> a;
    private ajdw b;

    /* renamed from: ajso$a */
    static final class a<T> extends AtomicReference<ajej> implements ajdz<T>, ajej, Runnable {
        private ajdz<? super T> a;
        private ajdw b;
        private T c;
        private Throwable d;

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
            this.d = th;
            ajfp.c(this, this.b.a((Runnable) this));
        }

        public final void b_(T t) {
            this.c = t;
            ajfp.c(this, this.b.a((Runnable) this));
        }

        public final void dispose() {
            ajfp.a((AtomicReference) this);
        }

        public final boolean isDisposed() {
            return ajfp.a((ajej) get());
        }

        public final void run() {
            Throwable th = this.d;
            if (th != null) {
                this.a.a(th);
            } else {
                this.a.b_(this.c);
            }
        }
    }

    public ajso(ajeb<T> ajeb, ajdw ajdw) {
        this.a = ajeb;
        this.b = ajdw;
    }

    public final void b(ajdz<? super T> ajdz) {
        this.a.a(new a(ajdz, this.b));
    }
}
