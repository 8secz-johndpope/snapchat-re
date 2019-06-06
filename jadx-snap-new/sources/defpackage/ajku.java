package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajku */
public final class ajku<T> extends ajim<T, T> {
    private long c;
    private TimeUnit d;
    private ajdw e;
    private boolean f = false;

    /* renamed from: ajku$b */
    static abstract class b<T> extends AtomicReference<T> implements ajdh<T>, akuy, Runnable {
        final akux<? super T> a;
        AtomicLong b = new AtomicLong();
        private long c;
        private TimeUnit d;
        private ajdw e;
        private ajft f = new ajft();
        private akuy g;

        b(akux<? super T> akux, long j, TimeUnit timeUnit, ajdw ajdw) {
            this.a = akux;
            this.c = j;
            this.d = timeUnit;
            this.e = ajdw;
        }

        private void d() {
            ajfp.a(this.f);
        }

        public final void a() {
            d();
            c();
        }

        public final void a(long j) {
            if (ajui.b(j)) {
                ajum.a(this.b, j);
            }
        }

        public final void a(akuy akuy) {
            if (ajui.a(this.g, akuy)) {
                this.g = akuy;
                this.a.a((akuy) this);
                ajft ajft = this.f;
                ajdw ajdw = this.e;
                long j = this.c;
                ajfp.c(ajft, ajdw.a(this, j, j, this.d));
                akuy.a(Long.MAX_VALUE);
            }
        }

        public void a(T t) {
            lazySet(t);
        }

        public final void a(Throwable th) {
            d();
            this.a.a(th);
        }

        public final void b() {
            d();
            this.g.b();
        }

        public abstract void c();
    }

    /* renamed from: ajku$a */
    static final class a<T> extends b<T> {
        a(akux<? super T> akux, long j, TimeUnit timeUnit, ajdw ajdw) {
            super(akux, j, timeUnit, ajdw);
        }

        /* Access modifiers changed, original: final */
        public final void c() {
            this.a.a();
        }

        public final void run() {
            Object andSet = getAndSet(null);
            if (andSet != null) {
                if (this.b.get() != 0) {
                    this.a.a(andSet);
                    ajum.c(this.b, 1);
                    return;
                }
                b();
                this.a.a(new ajeq("Couldn't emit value due to lack of requests!"));
            }
        }
    }

    public ajku(ajde<T> ajde, long j, TimeUnit timeUnit, ajdw ajdw) {
        super(ajde);
        this.c = j;
        this.d = timeUnit;
        this.e = ajdw;
    }

    public final void a_(akux<? super T> akux) {
        this.b.a(new a(new ajwx(akux), this.c, this.d, this.e));
    }
}
