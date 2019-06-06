package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajqj */
public final class ajqj<T> extends ajnp<T, T> {
    private long b;
    private TimeUnit c;
    private ajdw d;
    private boolean e = false;

    /* renamed from: ajqj$b */
    static abstract class b<T> extends AtomicReference<T> implements ajdv<T>, ajej, Runnable {
        final ajdv<? super T> a;
        private long b;
        private TimeUnit c;
        private ajdw d;
        private AtomicReference<ajej> e = new AtomicReference();
        private ajej f;

        b(ajdv<? super T> ajdv, long j, TimeUnit timeUnit, ajdw ajdw) {
            this.a = ajdv;
            this.b = j;
            this.c = timeUnit;
            this.d = ajdw;
        }

        private void c() {
            ajfp.a(this.e);
        }

        public final void a() {
            c();
            b();
        }

        public final void a(ajej ajej) {
            if (ajfp.a(this.f, ajej)) {
                this.f = ajej;
                this.a.a((ajej) this);
                ajdw ajdw = this.d;
                long j = this.b;
                ajfp.c(this.e, ajdw.a(this, j, j, this.c));
            }
        }

        public void a(T t) {
            lazySet(t);
        }

        public final void a(Throwable th) {
            c();
            this.a.a(th);
        }

        public abstract void b();

        public void dispose() {
            c();
            this.f.dispose();
        }

        public boolean isDisposed() {
            return this.f.isDisposed();
        }
    }

    /* renamed from: ajqj$a */
    static final class a<T> extends b<T> {
        a(ajdv<? super T> ajdv, long j, TimeUnit timeUnit, ajdw ajdw) {
            super(ajdv, j, timeUnit, ajdw);
        }

        /* Access modifiers changed, original: final */
        public final void b() {
            this.a.a();
        }

        public final void run() {
            Object andSet = getAndSet(null);
            if (andSet != null) {
                this.a.a(andSet);
            }
        }
    }

    public ajqj(ajdt<T> ajdt, long j, TimeUnit timeUnit, ajdw ajdw) {
        super(ajdt);
        this.b = j;
        this.c = timeUnit;
        this.d = ajdw;
    }

    public final void a_(ajdv<? super T> ajdv) {
        this.a.a(new a(new ajvm(ajdv), this.b, this.c, this.d));
    }
}
