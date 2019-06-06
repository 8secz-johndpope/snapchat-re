package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajnk */
public final class ajnk<T> extends ajcx {
    private ajdp<T> a;
    private ajfc<? super T, ? extends ajdb> b;
    private boolean c = false;

    /* renamed from: ajnk$a */
    static final class a<T> implements ajdv<T>, ajej {
        private static a g = new a(null);
        final ajcz a;
        final boolean b = false;
        final ajul c = new ajul();
        final AtomicReference<a> d = new AtomicReference();
        volatile boolean e;
        private ajfc<? super T, ? extends ajdb> f;
        private ajej h;

        /* renamed from: ajnk$a$a */
        static final class a extends AtomicReference<ajej> implements ajcz {
            private a<?> a;

            a(a<?> aVar) {
                this.a = aVar;
            }

            public final void a() {
                a aVar = this.a;
                if (aVar.d.compareAndSet(this, null) && aVar.e) {
                    Throwable a = ajur.a(aVar.c);
                    if (a == null) {
                        aVar.a.a();
                        return;
                    }
                    aVar.a.a(a);
                }
            }

            public final void a(ajej ajej) {
                ajfp.b(this, ajej);
            }

            public final void a(Throwable th) {
                a aVar = this.a;
                if (aVar.d.compareAndSet(this, null) && ajur.a(aVar.c, th)) {
                    if (!aVar.b) {
                        aVar.dispose();
                        th = ajur.a(aVar.c);
                        if (th != ajur.a) {
                            aVar.a.a(th);
                        }
                    } else if (aVar.e) {
                        aVar.a.a(ajur.a(aVar.c));
                        return;
                    }
                    return;
                }
                ajvo.a(th);
            }
        }

        a(ajcz ajcz, ajfc<? super T, ? extends ajdb> ajfc, boolean z) {
            this.a = ajcz;
            this.f = ajfc;
        }

        private void b() {
            AtomicReference atomicReference = (a) this.d.getAndSet(g);
            if (atomicReference != null && atomicReference != g) {
                ajfp.a(atomicReference);
            }
        }

        public final void a() {
            this.e = true;
            if (this.d.get() == null) {
                Throwable a = ajur.a(this.c);
                if (a == null) {
                    this.a.a();
                    return;
                }
                this.a.a(a);
            }
        }

        public final void a(ajej ajej) {
            if (ajfp.a(this.h, ajej)) {
                this.h = ajej;
                this.a.a((ajej) this);
            }
        }

        public final void a(T t) {
            try {
                AtomicReference atomicReference;
                ajdb ajdb = (ajdb) ajfv.a(this.f.apply(t), "The mapper returned a null CompletableSource");
                a aVar = new a(this);
                do {
                    atomicReference = (a) this.d.get();
                    if (atomicReference == g) {
                        break;
                    }
                } while (!this.d.compareAndSet(atomicReference, aVar));
                if (atomicReference != null) {
                    ajfp.a(atomicReference);
                }
                ajdb.a(aVar);
            } catch (Throwable th) {
                ajep.a(th);
                this.h.dispose();
                a(th);
            }
        }

        public final void a(Throwable th) {
            if (!ajur.a(this.c, th)) {
                ajvo.a(th);
            } else if (this.b) {
                a();
            } else {
                b();
                th = ajur.a(this.c);
                if (th != ajur.a) {
                    this.a.a(th);
                }
            }
        }

        public final void dispose() {
            this.h.dispose();
            b();
        }

        public final boolean isDisposed() {
            return this.d.get() == g;
        }
    }

    public ajnk(ajdp<T> ajdp, ajfc<? super T, ? extends ajdb> ajfc) {
        this.a = ajdp;
        this.b = ajfc;
    }

    public final void b(ajcz ajcz) {
        if (!ajnn.a(this.a, this.b, ajcz)) {
            this.a.a(new a(ajcz, this.b, false));
        }
    }
}
