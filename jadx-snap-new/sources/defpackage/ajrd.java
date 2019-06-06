package defpackage;

import defpackage.ajre.d;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajrd */
public final class ajrd<T, U, V> extends ajnp<T, T> {
    private ajdt<U> b;
    private ajfc<? super T, ? extends ajdt<V>> c;
    private ajdt<? extends T> d = null;

    /* renamed from: ajrd$b */
    static final class b<T> extends AtomicLong implements ajdv<T>, ajej, c {
        final ajft a = new ajft();
        private ajdv<? super T> b;
        private ajfc<? super T, ? extends ajdt<?>> c;
        private AtomicReference<ajej> d = new AtomicReference();

        b(ajdv<? super T> ajdv, ajfc<? super T, ? extends ajdt<?>> ajfc) {
            this.b = ajdv;
            this.c = ajfc;
        }

        public final void a() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.a.dispose();
                this.b.a();
            }
        }

        public final void a(long j) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                ajfp.a(this.d);
                this.b.a(new TimeoutException());
            }
        }

        public final void a(long j, Throwable th) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                ajfp.a(this.d);
                this.b.a(th);
                return;
            }
            ajvo.a(th);
        }

        public final void a(ajej ajej) {
            ajfp.b(this.d, ajej);
        }

        public final void a(T t) {
            long j = get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    ajej ajej = (ajej) this.a.get();
                    if (ajej != null) {
                        ajej.dispose();
                    }
                    this.b.a((Object) t);
                    try {
                        ajdt ajdt = (ajdt) ajfv.a(this.c.apply(t), "The itemTimeoutIndicator returned a null ObservableSource.");
                        a aVar = new a(j2, this);
                        if (ajfp.c(this.a, aVar)) {
                            ajdt.a(aVar);
                        }
                    } catch (Throwable th) {
                        ajep.a(th);
                        ((ajej) this.d.get()).dispose();
                        getAndSet(Long.MAX_VALUE);
                        this.b.a(th);
                    }
                }
            }
        }

        public final void a(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.a.dispose();
                this.b.a(th);
                return;
            }
            ajvo.a(th);
        }

        public final void dispose() {
            ajfp.a(this.d);
            this.a.dispose();
        }

        public final boolean isDisposed() {
            return ajfp.a((ajej) this.d.get());
        }
    }

    /* renamed from: ajrd$c */
    interface c extends d {
        void a(long j, Throwable th);
    }

    /* renamed from: ajrd$a */
    static final class a extends AtomicReference<ajej> implements ajdv<Object>, ajej {
        private c a;
        private long b;

        a(long j, c cVar) {
            this.b = j;
            this.a = cVar;
        }

        public final void a() {
            if (get() != ajfp.DISPOSED) {
                lazySet(ajfp.DISPOSED);
                this.a.a(this.b);
            }
        }

        public final void a(ajej ajej) {
            ajfp.b(this, ajej);
        }

        public final void a(Object obj) {
            ajej ajej = (ajej) get();
            if (ajej != ajfp.DISPOSED) {
                ajej.dispose();
                lazySet(ajfp.DISPOSED);
                this.a.a(this.b);
            }
        }

        public final void a(Throwable th) {
            if (get() != ajfp.DISPOSED) {
                lazySet(ajfp.DISPOSED);
                this.a.a(this.b, th);
                return;
            }
            ajvo.a(th);
        }

        public final void dispose() {
            ajfp.a((AtomicReference) this);
        }

        public final boolean isDisposed() {
            return ajfp.a((ajej) get());
        }
    }

    public ajrd(ajdp<T> ajdp, ajdt<U> ajdt, ajfc<? super T, ? extends ajdt<V>> ajfc) {
        super(ajdp);
        this.b = ajdt;
        this.c = ajfc;
    }

    public final void a_(ajdv<? super T> ajdv) {
        ajej bVar = new b(ajdv, this.c);
        ajdv.a(bVar);
        ajdt ajdt = this.b;
        if (ajdt != null) {
            a aVar = new a(0, bVar);
            if (ajfp.c(bVar.a, aVar)) {
                ajdt.a(aVar);
            }
        }
        this.a.a(bVar);
    }
}
