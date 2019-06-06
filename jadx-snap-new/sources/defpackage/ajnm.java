package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajnm */
public final class ajnm<T, R> extends ajdp<R> {
    private ajdp<T> a;
    private ajfc<? super T, ? extends ajeb<? extends R>> b;
    private boolean c = false;

    /* renamed from: ajnm$a */
    static final class a<T, R> extends AtomicInteger implements ajdv<T>, ajej {
        private static a<Object> g = new a(null);
        final boolean a = false;
        final ajul b = new ajul();
        final AtomicReference<a<R>> c = new AtomicReference();
        ajej d;
        private ajdv<? super R> e;
        private ajfc<? super T, ? extends ajeb<? extends R>> f;
        private volatile boolean h;
        private volatile boolean i;

        /* renamed from: ajnm$a$a */
        static final class a<R> extends AtomicReference<ajej> implements ajdz<R> {
            volatile R a;
            private a<?, R> b;

            a(a<?, R> aVar) {
                this.b = aVar;
            }

            public final void a(ajej ajej) {
                ajfp.b(this, ajej);
            }

            public final void a(Throwable th) {
                a aVar = this.b;
                if (aVar.c.compareAndSet(this, null) && ajur.a(aVar.b, th)) {
                    if (!aVar.a) {
                        aVar.d.dispose();
                        aVar.b();
                    }
                    aVar.c();
                    return;
                }
                ajvo.a(th);
            }

            public final void b_(R r) {
                this.a = r;
                this.b.c();
            }
        }

        a(ajdv<? super R> ajdv, ajfc<? super T, ? extends ajeb<? extends R>> ajfc, boolean z) {
            this.e = ajdv;
            this.f = ajfc;
        }

        public final void a() {
            this.h = true;
            c();
        }

        public final void a(ajej ajej) {
            if (ajfp.a(this.d, ajej)) {
                this.d = ajej;
                this.e.a((ajej) this);
            }
        }

        public final void a(T t) {
            AtomicReference atomicReference = (a) this.c.get();
            if (atomicReference != null) {
                ajfp.a(atomicReference);
            }
            try {
                ajeb ajeb = (ajeb) ajfv.a(this.f.apply(t), "The mapper returned a null SingleSource");
                a aVar = new a(this);
                a aVar2;
                do {
                    aVar2 = (a) this.c.get();
                    if (aVar2 == g) {
                        break;
                    }
                } while (!this.c.compareAndSet(aVar2, aVar));
                ajeb.a(aVar);
            } catch (Throwable th) {
                ajep.a(th);
                this.d.dispose();
                this.c.getAndSet(g);
                a(th);
            }
        }

        public final void a(Throwable th) {
            if (ajur.a(this.b, th)) {
                if (!this.a) {
                    b();
                }
                this.h = true;
                c();
                return;
            }
            ajvo.a(th);
        }

        /* Access modifiers changed, original: final */
        public final void b() {
            AtomicReference atomicReference = (a) this.c.getAndSet(g);
            if (atomicReference != null && atomicReference != g) {
                ajfp.a(atomicReference);
            }
        }

        /* Access modifiers changed, original: final */
        public final void c() {
            if (getAndIncrement() == 0) {
                ajdv ajdv = this.e;
                AtomicReference atomicReference = this.b;
                AtomicReference atomicReference2 = this.c;
                int i = 1;
                while (!this.i) {
                    if (atomicReference.get() == null || this.a) {
                        boolean z = this.h;
                        a aVar = (a) atomicReference2.get();
                        Object obj = aVar == null ? 1 : null;
                        if (z && obj != null) {
                            Throwable a = ajur.a(atomicReference);
                            if (a != null) {
                                ajdv.a(a);
                                return;
                            } else {
                                ajdv.a();
                                return;
                            }
                        } else if (obj != null || aVar.a == null) {
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        } else {
                            atomicReference2.compareAndSet(aVar, null);
                            ajdv.a(aVar.a);
                        }
                    } else {
                        ajdv.a(ajur.a(atomicReference));
                        return;
                    }
                }
            }
        }

        public final void dispose() {
            this.i = true;
            this.d.dispose();
            b();
        }

        public final boolean isDisposed() {
            return this.i;
        }
    }

    public ajnm(ajdp<T> ajdp, ajfc<? super T, ? extends ajeb<? extends R>> ajfc) {
        this.a = ajdp;
        this.b = ajfc;
    }

    public final void a_(ajdv<? super R> ajdv) {
        if (!ajnn.b(this.a, this.b, ajdv)) {
            this.a.a(new a(ajdv, this.b, false));
        }
    }
}
