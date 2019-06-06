package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajob */
public final class ajob<T, U> extends ajnp<T, U> {
    private ajfc<? super T, ? extends ajdt<? extends U>> b;
    private int c;
    private int d;

    /* renamed from: ajob$b */
    static final class b<T, U> extends AtomicInteger implements ajdv<T>, ajej {
        volatile boolean a;
        private ajdv<? super U> b;
        private ajfc<? super T, ? extends ajdt<? extends U>> c;
        private a<U> d;
        private int e;
        private ajgf<T> f;
        private ajej g;
        private volatile boolean h;
        private volatile boolean i;
        private int j;

        /* renamed from: ajob$b$a */
        static final class a<U> extends AtomicReference<ajej> implements ajdv<U> {
            private ajdv<? super U> a;
            private b<?, ?> b;

            a(ajdv<? super U> ajdv, b<?, ?> bVar) {
                this.a = ajdv;
                this.b = bVar;
            }

            public final void a() {
                b bVar = this.b;
                bVar.a = false;
                bVar.b();
            }

            public final void a(ajej ajej) {
                ajfp.c(this, ajej);
            }

            public final void a(U u) {
                this.a.a((Object) u);
            }

            public final void a(Throwable th) {
                this.b.dispose();
                this.a.a(th);
            }
        }

        b(ajdv<? super U> ajdv, ajfc<? super T, ? extends ajdt<? extends U>> ajfc, int i) {
            this.b = ajdv;
            this.c = ajfc;
            this.e = i;
            this.d = new a(ajdv, this);
        }

        public final void a() {
            if (!this.i) {
                this.i = true;
                b();
            }
        }

        public final void a(ajej ajej) {
            if (ajfp.a(this.g, ajej)) {
                this.g = ajej;
                if (ajej instanceof ajga) {
                    ajga ajga = (ajga) ajej;
                    int a = ajga.a(3);
                    if (a == 1) {
                        this.j = a;
                        this.f = ajga;
                        this.i = true;
                        this.b.a((ajej) this);
                        b();
                        return;
                    } else if (a == 2) {
                        this.j = a;
                        this.f = ajga;
                        this.b.a((ajej) this);
                        return;
                    }
                }
                this.f = new ajtb(this.e);
                this.b.a((ajej) this);
            }
        }

        public final void a(T t) {
            if (!this.i) {
                if (this.j == 0) {
                    this.f.offer(t);
                }
                b();
            }
        }

        public final void a(Throwable th) {
            if (this.i) {
                ajvo.a(th);
                return;
            }
            this.i = true;
            dispose();
            this.b.a(th);
        }

        /* Access modifiers changed, original: final */
        public final void b() {
            if (getAndIncrement() == 0) {
                while (!this.h) {
                    if (!this.a) {
                        boolean z = this.i;
                        try {
                            Object poll = this.f.poll();
                            Object obj = poll == null ? 1 : null;
                            if (z && obj != null) {
                                this.h = true;
                                this.b.a();
                                return;
                            } else if (obj == null) {
                                try {
                                    ajdt ajdt = (ajdt) ajfv.a(this.c.apply(poll), "The mapper returned a null ObservableSource");
                                    this.a = true;
                                    ajdt.a(this.d);
                                } catch (Throwable th) {
                                    ajep.a(th);
                                    dispose();
                                    this.f.clear();
                                    this.b.a(th);
                                    return;
                                }
                            }
                        } catch (Throwable th2) {
                            ajep.a(th2);
                            dispose();
                            this.f.clear();
                            this.b.a(th2);
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
                this.f.clear();
            }
        }

        public final void dispose() {
            this.h = true;
            ajfp.a(this.d);
            this.g.dispose();
            if (getAndIncrement() == 0) {
                this.f.clear();
            }
        }

        public final boolean isDisposed() {
            return this.h;
        }
    }

    /* renamed from: ajob$a */
    static final class a<T, R> extends AtomicInteger implements ajdv<T>, ajej {
        final ajul a = new ajul();
        final boolean b;
        ajej c;
        volatile boolean d;
        private ajdv<? super R> e;
        private ajfc<? super T, ? extends ajdt<? extends R>> f;
        private int g;
        private a<R> h;
        private ajgf<T> i;
        private volatile boolean j;
        private volatile boolean k;
        private int l;

        /* renamed from: ajob$a$a */
        static final class a<R> extends AtomicReference<ajej> implements ajdv<R> {
            private ajdv<? super R> a;
            private a<?, R> b;

            a(ajdv<? super R> ajdv, a<?, R> aVar) {
                this.a = ajdv;
                this.b = aVar;
            }

            public final void a() {
                a aVar = this.b;
                aVar.d = false;
                aVar.b();
            }

            public final void a(ajej ajej) {
                ajfp.c(this, ajej);
            }

            public final void a(R r) {
                this.a.a((Object) r);
            }

            public final void a(Throwable th) {
                a aVar = this.b;
                if (ajur.a(aVar.a, th)) {
                    if (!aVar.b) {
                        aVar.c.dispose();
                    }
                    aVar.d = false;
                    aVar.b();
                    return;
                }
                ajvo.a(th);
            }
        }

        a(ajdv<? super R> ajdv, ajfc<? super T, ? extends ajdt<? extends R>> ajfc, int i, boolean z) {
            this.e = ajdv;
            this.f = ajfc;
            this.g = i;
            this.b = z;
            this.h = new a(ajdv, this);
        }

        public final void a() {
            this.j = true;
            b();
        }

        public final void a(ajej ajej) {
            if (ajfp.a(this.c, ajej)) {
                this.c = ajej;
                if (ajej instanceof ajga) {
                    ajga ajga = (ajga) ajej;
                    int a = ajga.a(3);
                    if (a == 1) {
                        this.l = a;
                        this.i = ajga;
                        this.j = true;
                        this.e.a((ajej) this);
                        b();
                        return;
                    } else if (a == 2) {
                        this.l = a;
                        this.i = ajga;
                        this.e.a((ajej) this);
                        return;
                    }
                }
                this.i = new ajtb(this.g);
                this.e.a((ajej) this);
            }
        }

        public final void a(T t) {
            if (this.l == 0) {
                this.i.offer(t);
            }
            b();
        }

        public final void a(Throwable th) {
            if (ajur.a(this.a, th)) {
                this.j = true;
                b();
                return;
            }
            ajvo.a(th);
        }

        /* Access modifiers changed, original: final */
        public final void b() {
            if (getAndIncrement() == 0) {
                ajdv ajdv = this.e;
                ajgf ajgf = this.i;
                AtomicReference atomicReference = this.a;
                while (true) {
                    if (!this.d) {
                        if (!this.k) {
                            if (!this.b && ((Throwable) atomicReference.get()) != null) {
                                ajgf.clear();
                                this.k = true;
                                break;
                            }
                            boolean z = this.j;
                            Throwable a;
                            try {
                                Object poll = ajgf.poll();
                                Object obj = poll == null ? 1 : null;
                                if (z && obj != null) {
                                    this.k = true;
                                    a = ajur.a(atomicReference);
                                    if (a != null) {
                                        ajdv.a(a);
                                        return;
                                    } else {
                                        ajdv.a();
                                        return;
                                    }
                                } else if (obj == null) {
                                    try {
                                        ajdt ajdt = (ajdt) ajfv.a(this.f.apply(poll), "The mapper returned a null ObservableSource");
                                        if (ajdt instanceof Callable) {
                                            try {
                                                Object call = ((Callable) ajdt).call();
                                                if (!(call == null || this.k)) {
                                                    ajdv.a(call);
                                                }
                                            } catch (Throwable th) {
                                                ajep.a(th);
                                                ajur.a(atomicReference, th);
                                            }
                                        } else {
                                            this.d = true;
                                            ajdt.a(this.h);
                                        }
                                    } catch (Throwable th2) {
                                        ajep.a(th2);
                                        this.k = true;
                                        this.c.dispose();
                                        ajgf.clear();
                                        ajur.a(atomicReference, th2);
                                    }
                                }
                            } catch (Throwable a2) {
                                ajep.a(a2);
                                this.k = true;
                                this.c.dispose();
                                ajur.a(atomicReference, a2);
                            }
                        } else {
                            ajgf.clear();
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
                ajdv.a(ajur.a(atomicReference));
            }
        }

        public final void dispose() {
            this.k = true;
            this.c.dispose();
            ajfp.a(this.h);
        }

        public final boolean isDisposed() {
            return this.k;
        }
    }

    public ajob(ajdt<T> ajdt, ajfc<? super T, ? extends ajdt<? extends U>> ajfc, int i, int i2) {
        super(ajdt);
        this.b = ajfc;
        this.d = i2;
        this.c = Math.max(8, i);
    }

    public final void a_(ajdv<? super U> ajdv) {
        if (!ajqk.a(this.a, ajdv, this.b)) {
            boolean z = true;
            if (this.d == 1) {
                this.a.a(new b(new ajvm(ajdv), this.b, this.c));
                return;
            }
            ajdt ajdt = this.a;
            ajfc ajfc = this.b;
            int i = this.c;
            if (this.d != 3) {
                z = false;
            }
            ajdt.a(new a(ajdv, ajfc, i, z));
        }
    }
}
