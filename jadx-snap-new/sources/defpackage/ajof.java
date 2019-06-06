package defpackage;

import defpackage.ajdw.c;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajof */
public final class ajof<T> extends ajnp<T, T> {
    private long b;
    private TimeUnit c;
    private ajdw d;

    /* renamed from: ajof$b */
    static final class b<T> implements ajdv<T>, ajej {
        final ajdv<? super T> a;
        volatile long b;
        private long c;
        private TimeUnit d;
        private c e;
        private ajej f;
        private ajej g;
        private boolean h;

        b(ajdv<? super T> ajdv, long j, TimeUnit timeUnit, c cVar) {
            this.a = ajdv;
            this.c = j;
            this.d = timeUnit;
            this.e = cVar;
        }

        public final void a() {
            if (!this.h) {
                this.h = true;
                ajej ajej = this.g;
                if (ajej != null) {
                    ajej.dispose();
                }
                a aVar = (a) ajej;
                if (aVar != null) {
                    aVar.run();
                }
                this.a.a();
                this.e.dispose();
            }
        }

        public final void a(ajej ajej) {
            if (ajfp.a(this.f, ajej)) {
                this.f = ajej;
                this.a.a((ajej) this);
            }
        }

        public final void a(T t) {
            if (!this.h) {
                long j = this.b + 1;
                this.b = j;
                ajej ajej = this.g;
                if (ajej != null) {
                    ajej.dispose();
                }
                a aVar = new a(t, j, this);
                this.g = aVar;
                ajfp.c(aVar, this.e.a(aVar, this.c, this.d));
            }
        }

        public final void a(Throwable th) {
            if (this.h) {
                ajvo.a(th);
                return;
            }
            ajej ajej = this.g;
            if (ajej != null) {
                ajej.dispose();
            }
            this.h = true;
            this.a.a(th);
            this.e.dispose();
        }

        public final void dispose() {
            this.f.dispose();
            this.e.dispose();
        }

        public final boolean isDisposed() {
            return this.e.isDisposed();
        }
    }

    /* renamed from: ajof$a */
    static final class a<T> extends AtomicReference<ajej> implements ajej, Runnable {
        private T a;
        private long b;
        private b<T> c;
        private AtomicBoolean d = new AtomicBoolean();

        a(T t, long j, b<T> bVar) {
            this.a = t;
            this.b = j;
            this.c = bVar;
        }

        public final void dispose() {
            ajfp.a((AtomicReference) this);
        }

        public final boolean isDisposed() {
            return get() == ajfp.DISPOSED;
        }

        public final void run() {
            if (this.d.compareAndSet(false, true)) {
                b bVar = this.c;
                long j = this.b;
                Object obj = this.a;
                if (j == bVar.b) {
                    bVar.a.a(obj);
                    dispose();
                }
            }
        }
    }

    public ajof(ajdt<T> ajdt, long j, TimeUnit timeUnit, ajdw ajdw) {
        super(ajdt);
        this.b = j;
        this.c = timeUnit;
        this.d = ajdw;
    }

    public final void a_(ajdv<? super T> ajdv) {
        this.a.a(new b(new ajvm(ajdv), this.b, this.c, this.d.b()));
    }
}
