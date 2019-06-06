package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajmn */
public final class ajmn<T> extends ajlj<T, T> {
    private ajdw b;

    /* renamed from: ajmn$a */
    static final class a<T> extends AtomicReference<ajej> implements ajdl<T>, ajej, Runnable {
        private ajdl<? super T> a;
        private ajdw b;
        private T c;
        private Throwable d;

        a(ajdl<? super T> ajdl, ajdw ajdw) {
            this.a = ajdl;
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
                this.d = null;
                this.a.a(th);
                return;
            }
            Object obj = this.c;
            if (obj != null) {
                this.c = null;
                this.a.b_(obj);
                return;
            }
            this.a.a();
        }
    }

    public ajmn(ajdn<T> ajdn, ajdw ajdw) {
        super(ajdn);
        this.b = ajdw;
    }

    public final void a(ajdl<? super T> ajdl) {
        this.a.b(new a(ajdl, this.b));
    }
}
