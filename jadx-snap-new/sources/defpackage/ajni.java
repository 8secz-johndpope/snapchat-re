package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajni */
public final class ajni<T, R> extends ajdp<R> {
    private ajdp<T> a;
    private ajfc<? super T, ? extends ajdn<? extends R>> b;
    private int c = 1;
    private int d = 2;

    /* renamed from: ajni$a */
    static final class a<T, R> extends AtomicInteger implements ajdv<T>, ajej {
        final ajul a = new ajul();
        final int b;
        ajej c;
        R d;
        volatile int e;
        private ajdv<? super R> f;
        private ajfc<? super T, ? extends ajdn<? extends R>> g;
        private a<R> h = new a(this);
        private ajge<T> i;
        private volatile boolean j;
        private volatile boolean k;

        /* renamed from: ajni$a$a */
        static final class a<R> extends AtomicReference<ajej> implements ajdl<R> {
            private a<?, R> a;

            a(a<?, R> aVar) {
                this.a = aVar;
            }

            public final void a() {
                a aVar = this.a;
                aVar.e = 0;
                aVar.b();
            }

            public final void a(ajej ajej) {
                ajfp.c(this, ajej);
            }

            public final void a(Throwable th) {
                a aVar = this.a;
                if (ajur.a(aVar.a, th)) {
                    if (aVar.b != 3) {
                        aVar.c.dispose();
                    }
                    aVar.e = 0;
                    aVar.b();
                    return;
                }
                ajvo.a(th);
            }

            public final void b_(R r) {
                a aVar = this.a;
                aVar.d = r;
                aVar.e = 2;
                aVar.b();
            }
        }

        a(ajdv<? super R> ajdv, ajfc<? super T, ? extends ajdn<? extends R>> ajfc, int i, int i2) {
            this.f = ajdv;
            this.g = ajfc;
            this.b = i2;
            this.i = new ajtb(i);
        }

        public final void a() {
            this.j = true;
            b();
        }

        public final void a(ajej ajej) {
            if (ajfp.a(this.c, ajej)) {
                this.c = ajej;
                this.f.a((ajej) this);
            }
        }

        public final void a(T t) {
            this.i.offer(t);
            b();
        }

        public final void a(Throwable th) {
            if (ajur.a(this.a, th)) {
                if (this.b == 1) {
                    ajfp.a(this.h);
                }
                this.j = true;
                b();
                return;
            }
            ajvo.a(th);
        }

        /* Access modifiers changed, original: final */
        public final void b() {
            if (getAndIncrement() == 0) {
                ajdv ajdv = this.f;
                int i = this.b;
                ajge ajge = this.i;
                AtomicReference atomicReference = this.a;
                int i2 = 1;
                while (true) {
                    if (this.k) {
                        ajge.clear();
                        this.d = null;
                    } else {
                        int i3 = this.e;
                        if (atomicReference.get() == null || !(i == 1 || (i == 2 && i3 == 0))) {
                            int i4 = 0;
                            if (i3 == 0) {
                                boolean z = this.j;
                                Object poll = ajge.poll();
                                if (poll == null) {
                                    i4 = 1;
                                }
                                Throwable a;
                                if (z && i4 != 0) {
                                    a = ajur.a(atomicReference);
                                    if (a == null) {
                                        ajdv.a();
                                        return;
                                    } else {
                                        ajdv.a(a);
                                        return;
                                    }
                                } else if (i4 == 0) {
                                    try {
                                        ajdn ajdn = (ajdn) ajfv.a(this.g.apply(poll), "The mapper returned a null MaybeSource");
                                        this.e = 1;
                                        ajdn.b(this.h);
                                    } catch (Throwable a2) {
                                        ajep.a(a2);
                                        this.c.dispose();
                                        ajge.clear();
                                        ajur.a(atomicReference, a2);
                                    }
                                }
                            } else if (i3 == 2) {
                                Object obj = this.d;
                                this.d = null;
                                ajdv.a(obj);
                                this.e = 0;
                            }
                        }
                    }
                    i2 = addAndGet(-i2);
                    if (i2 == 0) {
                        return;
                    }
                }
                ajge.clear();
                this.d = null;
                ajdv.a(ajur.a(atomicReference));
            }
        }

        public final void dispose() {
            this.k = true;
            this.c.dispose();
            ajfp.a(this.h);
            if (getAndIncrement() == 0) {
                this.i.clear();
                this.d = null;
            }
        }

        public final boolean isDisposed() {
            return this.k;
        }
    }

    public ajni(ajdp<T> ajdp, ajfc<? super T, ? extends ajdn<? extends R>> ajfc, int i) {
        this.a = ajdp;
        this.b = ajfc;
    }

    public final void a_(ajdv<? super R> ajdv) {
        if (!ajnn.a(this.a, this.b, (ajdv) ajdv)) {
            this.a.a(new a(ajdv, this.b, this.d, this.c));
        }
    }
}
