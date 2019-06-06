package defpackage;

import defpackage.ajdw.c;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajrb */
public final class ajrb<T> extends ajnp<T, T> {
    private long b;
    private TimeUnit c;
    private ajdw d;
    private boolean e = false;

    /* renamed from: ajrb$a */
    static final class a<T> extends AtomicInteger implements ajdv<T>, ajej, Runnable {
        private ajdv<? super T> a;
        private long b;
        private TimeUnit c;
        private c d;
        private boolean e;
        private AtomicReference<T> f = new AtomicReference();
        private ajej g;
        private volatile boolean h;
        private Throwable i;
        private volatile boolean j;
        private volatile boolean k;
        private boolean l;

        a(ajdv<? super T> ajdv, long j, TimeUnit timeUnit, c cVar, boolean z) {
            this.a = ajdv;
            this.b = j;
            this.c = timeUnit;
            this.d = cVar;
            this.e = z;
        }

        private void b() {
            if (getAndIncrement() == 0) {
                AtomicReference atomicReference = this.f;
                ajdv ajdv = this.a;
                int i = 1;
                while (!this.j) {
                    boolean z = this.h;
                    if (!z || this.i == null) {
                        Object obj = atomicReference.get() == null ? 1 : null;
                        if (z) {
                            Object andSet = atomicReference.getAndSet(null);
                            if (obj == null && this.e) {
                                ajdv.a(andSet);
                            }
                            ajdv.a();
                        } else {
                            if (obj != null) {
                                if (this.k) {
                                    this.l = false;
                                    this.k = false;
                                }
                            } else if (!this.l || this.k) {
                                ajdv.a(atomicReference.getAndSet(null));
                                this.k = false;
                                this.l = true;
                                this.d.a(this, this.b, this.c);
                            }
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        }
                    } else {
                        atomicReference.lazySet(null);
                        ajdv.a(this.i);
                    }
                    this.d.dispose();
                    return;
                }
                atomicReference.lazySet(null);
            }
        }

        public final void a() {
            this.h = true;
            b();
        }

        public final void a(ajej ajej) {
            if (ajfp.a(this.g, ajej)) {
                this.g = ajej;
                this.a.a((ajej) this);
            }
        }

        public final void a(T t) {
            this.f.set(t);
            b();
        }

        public final void a(Throwable th) {
            this.i = th;
            this.h = true;
            b();
        }

        public final void dispose() {
            this.j = true;
            this.g.dispose();
            this.d.dispose();
            if (getAndIncrement() == 0) {
                this.f.lazySet(null);
            }
        }

        public final boolean isDisposed() {
            return this.j;
        }

        public final void run() {
            this.k = true;
            b();
        }
    }

    public ajrb(ajdp<T> ajdp, long j, TimeUnit timeUnit, ajdw ajdw, boolean z) {
        super(ajdp);
        this.b = j;
        this.c = timeUnit;
        this.d = ajdw;
    }

    public final void a_(ajdv<? super T> ajdv) {
        this.a.a(new a(ajdv, this.b, this.c, this.d.b(), this.e));
    }
}
