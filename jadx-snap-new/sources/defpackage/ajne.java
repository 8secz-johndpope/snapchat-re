package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajne */
public final class ajne<T> extends ajcx {
    private ajde<T> a;
    private ajfc<? super T, ? extends ajdb> b;
    private int c = 1;
    private int d = 2;

    /* renamed from: ajne$a */
    static final class a<T> extends AtomicInteger implements ajdh<T>, ajej {
        final ajcz a;
        final int b;
        final ajul c = new ajul();
        final ajge<T> d;
        akuy e;
        volatile boolean f;
        private ajfc<? super T, ? extends ajdb> g;
        private a h = new a(this);
        private int i;
        private volatile boolean j;
        private volatile boolean k;
        private int l;

        /* renamed from: ajne$a$a */
        static final class a extends AtomicReference<ajej> implements ajcz {
            private a<?> a;

            a(a<?> aVar) {
                this.a = aVar;
            }

            public final void a() {
                a aVar = this.a;
                aVar.f = false;
                aVar.b();
            }

            public final void a(ajej ajej) {
                ajfp.c(this, ajej);
            }

            public final void a(Throwable th) {
                a aVar = this.a;
                if (!ajur.a(aVar.c, th)) {
                    ajvo.a(th);
                } else if (aVar.b == 1) {
                    aVar.e.b();
                    th = ajur.a(aVar.c);
                    if (th != ajur.a) {
                        aVar.a.a(th);
                    }
                    if (aVar.getAndIncrement() == 0) {
                        aVar.d.clear();
                    }
                } else {
                    aVar.f = false;
                    aVar.b();
                }
            }
        }

        a(ajcz ajcz, ajfc<? super T, ? extends ajdb> ajfc, int i, int i2) {
            this.a = ajcz;
            this.g = ajfc;
            this.b = i;
            this.i = i2;
            this.d = new ajta(i2);
        }

        public final void a() {
            this.j = true;
            b();
        }

        public final void a(akuy akuy) {
            if (ajui.a(this.e, akuy)) {
                this.e = akuy;
                this.a.a((ajej) this);
                akuy.a((long) this.i);
            }
        }

        public final void a(T t) {
            if (this.d.offer(t)) {
                b();
                return;
            }
            this.e.b();
            a(new ajeq("Queue full?!"));
        }

        public final void a(Throwable th) {
            if (!ajur.a(this.c, th)) {
                ajvo.a(th);
            } else if (this.b == 1) {
                ajfp.a(this.h);
                th = ajur.a(this.c);
                if (th != ajur.a) {
                    this.a.a(th);
                }
                if (getAndIncrement() == 0) {
                    this.d.clear();
                }
            } else {
                this.j = true;
                b();
            }
        }

        /* Access modifiers changed, original: final */
        public final void b() {
            if (getAndIncrement() == 0) {
                while (!this.k) {
                    if (!this.f) {
                        if (this.b != 2 || this.c.get() == null) {
                            boolean z = this.j;
                            Object poll = this.d.poll();
                            Object obj = poll == null ? 1 : null;
                            Throwable a;
                            if (z && obj != null) {
                                a = ajur.a(this.c);
                                if (a != null) {
                                    this.a.a(a);
                                    return;
                                } else {
                                    this.a.a();
                                    return;
                                }
                            } else if (obj == null) {
                                int i = this.i;
                                i -= i >> 1;
                                int i2 = this.l + 1;
                                if (i2 == i) {
                                    this.l = 0;
                                    this.e.a((long) i);
                                } else {
                                    this.l = i2;
                                }
                                try {
                                    ajdb ajdb = (ajdb) ajfv.a(this.g.apply(poll), "The mapper returned a null CompletableSource");
                                    this.f = true;
                                    ajdb.a(this.h);
                                } catch (Throwable a2) {
                                    ajep.a(a2);
                                    this.d.clear();
                                    this.e.b();
                                    ajur.a(this.c, a2);
                                    this.a.a(ajur.a(this.c));
                                    return;
                                }
                            }
                        }
                        this.d.clear();
                        this.a.a(ajur.a(this.c));
                        return;
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
                this.d.clear();
            }
        }

        public final void dispose() {
            this.k = true;
            this.e.b();
            ajfp.a(this.h);
            if (getAndIncrement() == 0) {
                this.d.clear();
            }
        }

        public final boolean isDisposed() {
            return this.k;
        }
    }

    public ajne(ajde<T> ajde, ajfc<? super T, ? extends ajdb> ajfc, int i) {
        this.a = ajde;
        this.b = ajfc;
    }

    public final void b(ajcz ajcz) {
        this.a.a(new a(ajcz, this.b, this.c, this.d));
    }
}
