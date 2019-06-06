package defpackage;

import defpackage.ajdw.c;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajiz */
public final class ajiz<T> extends ajim<T, T> {
    private long c;
    private TimeUnit d;
    private ajdw e;

    /* renamed from: ajiz$b */
    static final class b<T> extends AtomicLong implements ajdh<T>, akuy {
        private akux<? super T> a;
        private long b;
        private TimeUnit c;
        private c d;
        private akuy e;
        private ajej f;
        private volatile long g;
        private boolean h;

        b(akux<? super T> akux, long j, TimeUnit timeUnit, c cVar) {
            this.a = akux;
            this.b = j;
            this.c = timeUnit;
            this.d = cVar;
        }

        public final void a() {
            if (!this.h) {
                this.h = true;
                ajej ajej = this.f;
                if (ajej != null) {
                    ajej.dispose();
                }
                a aVar = (a) ajej;
                if (aVar != null) {
                    aVar.a();
                }
                this.a.a();
                this.d.dispose();
            }
        }

        public final void a(long j) {
            if (ajui.b(j)) {
                ajum.a((AtomicLong) this, j);
            }
        }

        /* Access modifiers changed, original: final */
        public final void a(long j, T t, a<T> aVar) {
            if (j == this.g) {
                if (get() != 0) {
                    this.a.a((Object) t);
                    ajum.c(this, 1);
                    aVar.dispose();
                    return;
                }
                b();
                this.a.a(new ajeq("Could not deliver value due to lack of requests"));
            }
        }

        public final void a(akuy akuy) {
            if (ajui.a(this.e, akuy)) {
                this.e = akuy;
                this.a.a((akuy) this);
                akuy.a(Long.MAX_VALUE);
            }
        }

        public final void a(T t) {
            if (!this.h) {
                long j = this.g + 1;
                this.g = j;
                ajej ajej = this.f;
                if (ajej != null) {
                    ajej.dispose();
                }
                a aVar = new a(t, j, this);
                this.f = aVar;
                ajfp.c(aVar, this.d.a(aVar, this.b, this.c));
            }
        }

        public final void a(Throwable th) {
            if (this.h) {
                ajvo.a(th);
                return;
            }
            this.h = true;
            ajej ajej = this.f;
            if (ajej != null) {
                ajej.dispose();
            }
            this.a.a(th);
            this.d.dispose();
        }

        public final void b() {
            this.e.b();
            this.d.dispose();
        }
    }

    /* renamed from: ajiz$a */
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

        /* Access modifiers changed, original: final */
        public final void a() {
            if (this.d.compareAndSet(false, true)) {
                this.c.a(this.b, this.a, this);
            }
        }

        public final void dispose() {
            ajfp.a((AtomicReference) this);
        }

        public final boolean isDisposed() {
            return get() == ajfp.DISPOSED;
        }

        public final void run() {
            a();
        }
    }

    public ajiz(ajde<T> ajde, long j, TimeUnit timeUnit, ajdw ajdw) {
        super(ajde);
        this.c = j;
        this.d = timeUnit;
        this.e = ajdw;
    }

    public final void a_(akux<? super T> akux) {
        this.b.a(new b(new ajwx(akux), this.c, this.d, this.e.b()));
    }
}
