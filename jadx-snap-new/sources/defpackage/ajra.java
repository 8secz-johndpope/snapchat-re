package defpackage;

import defpackage.ajdw.c;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajra */
public final class ajra<T> extends ajnp<T, T> {
    private long b;
    private TimeUnit c;
    private ajdw d;

    /* renamed from: ajra$a */
    static final class a<T> extends AtomicReference<ajej> implements ajdv<T>, ajej, Runnable {
        private ajdv<? super T> a;
        private long b;
        private TimeUnit c;
        private c d;
        private ajej e;
        private volatile boolean f;
        private boolean g;

        a(ajdv<? super T> ajdv, long j, TimeUnit timeUnit, c cVar) {
            this.a = ajdv;
            this.b = j;
            this.c = timeUnit;
            this.d = cVar;
        }

        public final void a() {
            if (!this.g) {
                this.g = true;
                this.a.a();
                this.d.dispose();
            }
        }

        public final void a(ajej ajej) {
            if (ajfp.a(this.e, ajej)) {
                this.e = ajej;
                this.a.a((ajej) this);
            }
        }

        public final void a(T t) {
            if (!this.f && !this.g) {
                this.f = true;
                this.a.a((Object) t);
                ajej ajej = (ajej) get();
                if (ajej != null) {
                    ajej.dispose();
                }
                ajfp.c(this, this.d.a(this, this.b, this.c));
            }
        }

        public final void a(Throwable th) {
            if (this.g) {
                ajvo.a(th);
                return;
            }
            this.g = true;
            this.a.a(th);
            this.d.dispose();
        }

        public final void dispose() {
            this.e.dispose();
            this.d.dispose();
        }

        public final boolean isDisposed() {
            return this.d.isDisposed();
        }

        public final void run() {
            this.f = false;
        }
    }

    public ajra(ajdt<T> ajdt, long j, TimeUnit timeUnit, ajdw ajdw) {
        super(ajdt);
        this.b = j;
        this.c = timeUnit;
        this.d = ajdw;
    }

    public final void a_(ajdv<? super T> ajdv) {
        this.a.a(new a(new ajvm(ajdv), this.b, this.c, this.d.b()));
    }
}
