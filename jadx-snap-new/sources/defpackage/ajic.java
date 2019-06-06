package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajic */
public final class ajic extends ajcx {
    private ajdb a;
    private ajdw b;

    /* renamed from: ajic$a */
    static final class a extends AtomicReference<ajej> implements ajcz, ajej, Runnable {
        private ajcz a;
        private ajdw b;
        private Throwable c;

        a(ajcz ajcz, ajdw ajdw) {
            this.a = ajcz;
            this.b = ajdw;
        }

        public final void a() {
            ajfp.c(this, this.b.a((Runnable) this));
        }

        public final void a(ajej ajej) {
            if (ajfp.b(this, ajej)) {
                this.a.a((ajej) this);
            }
        }

        public final void a(Throwable th) {
            this.c = th;
            ajfp.c(this, this.b.a((Runnable) this));
        }

        public final void dispose() {
            ajfp.a((AtomicReference) this);
        }

        public final boolean isDisposed() {
            return ajfp.a((ajej) get());
        }

        public final void run() {
            Throwable th = this.c;
            if (th != null) {
                this.c = null;
                this.a.a(th);
                return;
            }
            this.a.a();
        }
    }

    public ajic(ajdb ajdb, ajdw ajdw) {
        this.a = ajdb;
        this.b = ajdw;
    }

    public final void b(ajcz ajcz) {
        this.a.a(new a(ajcz, this.b));
    }
}
