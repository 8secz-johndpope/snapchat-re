package defpackage;

import defpackage.ajdw.c;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: ajkf */
public final class ajkf<T> extends ajim<T, T> {
    private ajdw c;
    private boolean d = false;
    private int e;

    /* renamed from: ajkf$c */
    static final class c<T> extends a<T> implements ajdh<T> {
        private akux<? super T> l;

        c(akux<? super T> akux, defpackage.ajdw.c cVar, boolean z, int i) {
            super(cVar, z, i);
            this.l = akux;
        }

        public final void a(akuy akuy) {
            if (ajui.a(this.e, akuy)) {
                this.e = akuy;
                if (akuy instanceof ajgc) {
                    ajgc ajgc = (ajgc) akuy;
                    int a = ajgc.a(7);
                    if (a == 1) {
                        this.j = 1;
                        this.f = ajgc;
                        this.h = true;
                        this.l.a((akuy) this);
                        return;
                    } else if (a == 2) {
                        this.j = 2;
                        this.f = ajgc;
                        this.l.a((akuy) this);
                        akuy.a((long) this.b);
                        return;
                    }
                }
                this.f = new ajta(this.b);
                this.l.a((akuy) this);
                akuy.a((long) this.b);
            }
        }

        /* Access modifiers changed, original: final */
        public final void c() {
            int i = 1;
            while (!this.g) {
                boolean z = this.h;
                this.l.a(null);
                if (z) {
                    this.g = true;
                    Throwable th = this.i;
                    if (th != null) {
                        this.l.a(th);
                    } else {
                        this.l.a();
                    }
                    this.a.dispose();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        /* Access modifiers changed, original: final */
        public final void d() {
            akux akux = this.l;
            ajgf ajgf = this.f;
            long j = this.k;
            int i = 1;
            loop0:
            while (true) {
                long j2 = this.d.get();
                while (j != j2) {
                    try {
                        Object poll = ajgf.poll();
                        if (!this.g) {
                            if (poll == null) {
                                break loop0;
                            }
                            akux.a(poll);
                            j++;
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        ajep.a(th);
                        this.g = true;
                        this.e.b();
                        akux.a(th);
                    }
                }
                if (!this.g) {
                    if (ajgf.isEmpty()) {
                        break;
                    }
                    int i2 = get();
                    if (i == i2) {
                        this.k = j;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    return;
                }
            }
            this.g = true;
            akux.a();
            this.a.dispose();
        }

        /* Access modifiers changed, original: final */
        public final void e() {
            akux akux = this.l;
            ajgf ajgf = this.f;
            long j = this.k;
            int i = 1;
            while (true) {
                long j2 = this.d.get();
                while (j != j2) {
                    boolean z = this.h;
                    try {
                        Object poll = ajgf.poll();
                        boolean z2 = poll == null;
                        if (!a(z, z2, akux)) {
                            if (z2) {
                                break;
                            }
                            akux.a(poll);
                            j++;
                            if (j == ((long) this.c)) {
                                if (j2 != Long.MAX_VALUE) {
                                    j2 = this.d.addAndGet(-j);
                                }
                                this.e.a(j);
                                j = 0;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        ajep.a(th);
                        this.g = true;
                        this.e.b();
                        ajgf.clear();
                        akux.a(th);
                        this.a.dispose();
                        return;
                    }
                }
                if (j != j2 || !a(this.h, ajgf.isEmpty(), akux)) {
                    int i2 = get();
                    if (i == i2) {
                        this.k = j;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    return;
                }
            }
        }

        public final T poll() {
            Object poll = this.f.poll();
            if (!(poll == null || this.j == 1)) {
                long j = this.k + 1;
                if (j == ((long) this.c)) {
                    this.k = 0;
                    this.e.a(j);
                } else {
                    this.k = j;
                }
            }
            return poll;
        }
    }

    /* renamed from: ajkf$a */
    static abstract class a<T> extends ajuc<T> implements ajdh<T>, Runnable {
        final c a;
        final int b;
        final int c;
        final AtomicLong d = new AtomicLong();
        akuy e;
        ajgf<T> f;
        volatile boolean g;
        volatile boolean h;
        Throwable i;
        int j;
        long k;
        private boolean l;
        private boolean m;

        a(c cVar, boolean z, int i) {
            this.a = cVar;
            this.l = z;
            this.b = i;
            this.c = i - (i >> 2);
        }

        private void f() {
            if (getAndIncrement() == 0) {
                this.a.a((Runnable) this);
            }
        }

        public final int a(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.m = true;
            return 2;
        }

        public final void a() {
            if (!this.h) {
                this.h = true;
                f();
            }
        }

        public final void a(long j) {
            if (ajui.b(j)) {
                ajum.a(this.d, j);
                f();
            }
        }

        public final void a(T t) {
            if (!this.h) {
                if (this.j == 2) {
                    f();
                    return;
                }
                if (!this.f.offer(t)) {
                    this.e.b();
                    this.i = new ajeq("Queue is full?!");
                    this.h = true;
                }
                f();
            }
        }

        public final void a(Throwable th) {
            if (this.h) {
                ajvo.a(th);
                return;
            }
            this.i = th;
            this.h = true;
            f();
        }

        /* Access modifiers changed, original: final */
        /* JADX WARNING: Missing block: B:9:0x0015, code skipped:
            if (r3 != null) goto L_0x0027;
     */
        public final boolean a(boolean r3, boolean r4, defpackage.akux<?> r5) {
            /*
            r2 = this;
            r0 = r2.g;
            r1 = 1;
            if (r0 == 0) goto L_0x0009;
        L_0x0005:
            r2.clear();
            return r1;
        L_0x0009:
            if (r3 == 0) goto L_0x0033;
        L_0x000b:
            r3 = r2.l;
            if (r3 == 0) goto L_0x001e;
        L_0x000f:
            if (r4 == 0) goto L_0x0033;
        L_0x0011:
            r2.g = r1;
            r3 = r2.i;
            if (r3 == 0) goto L_0x002f;
        L_0x0017:
            goto L_0x0027;
        L_0x0018:
            r3 = r2.a;
            r3.dispose();
            return r1;
        L_0x001e:
            r3 = r2.i;
            if (r3 == 0) goto L_0x002b;
        L_0x0022:
            r2.g = r1;
            r2.clear();
        L_0x0027:
            r5.a(r3);
            goto L_0x0018;
        L_0x002b:
            if (r4 == 0) goto L_0x0033;
        L_0x002d:
            r2.g = r1;
        L_0x002f:
            r5.a();
            goto L_0x0018;
        L_0x0033:
            r3 = 0;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ajkf$a.a(boolean, boolean, akux):boolean");
        }

        public final void b() {
            if (!this.g) {
                this.g = true;
                this.e.b();
                this.a.dispose();
                if (getAndIncrement() == 0) {
                    this.f.clear();
                }
            }
        }

        public abstract void c();

        public final void clear() {
            this.f.clear();
        }

        public abstract void d();

        public abstract void e();

        public final boolean isEmpty() {
            return this.f.isEmpty();
        }

        public final void run() {
            if (this.m) {
                c();
            } else if (this.j == 1) {
                d();
            } else {
                e();
            }
        }
    }

    /* renamed from: ajkf$b */
    static final class b<T> extends a<T> {
        private ajfw<? super T> l;
        private long m;

        b(ajfw<? super T> ajfw, c cVar, boolean z, int i) {
            super(cVar, z, i);
            this.l = ajfw;
        }

        public final void a(akuy akuy) {
            if (ajui.a(this.e, akuy)) {
                this.e = akuy;
                if (akuy instanceof ajgc) {
                    ajgc ajgc = (ajgc) akuy;
                    int a = ajgc.a(7);
                    if (a == 1) {
                        this.j = 1;
                        this.f = ajgc;
                        this.h = true;
                        this.l.a(this);
                        return;
                    } else if (a == 2) {
                        this.j = 2;
                        this.f = ajgc;
                        this.l.a(this);
                        akuy.a((long) this.b);
                        return;
                    }
                }
                this.f = new ajta(this.b);
                this.l.a(this);
                akuy.a((long) this.b);
            }
        }

        /* Access modifiers changed, original: final */
        public final void c() {
            int i = 1;
            while (!this.g) {
                boolean z = this.h;
                this.l.a(null);
                if (z) {
                    this.g = true;
                    Throwable th = this.i;
                    if (th != null) {
                        this.l.a(th);
                    } else {
                        this.l.a();
                    }
                    this.a.dispose();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        /* Access modifiers changed, original: final */
        public final void d() {
            ajfw ajfw = this.l;
            ajgf ajgf = this.f;
            long j = this.k;
            int i = 1;
            loop0:
            while (true) {
                long j2 = this.d.get();
                while (j != j2) {
                    try {
                        Object poll = ajgf.poll();
                        if (!this.g) {
                            if (poll == null) {
                                break loop0;
                            } else if (ajfw.b(poll)) {
                                j++;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        ajep.a(th);
                        this.g = true;
                        this.e.b();
                        ajfw.a(th);
                    }
                }
                if (!this.g) {
                    if (ajgf.isEmpty()) {
                        break;
                    }
                    int i2 = get();
                    if (i == i2) {
                        this.k = j;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    return;
                }
            }
            this.g = true;
            ajfw.a();
            this.a.dispose();
        }

        /* Access modifiers changed, original: final */
        public final void e() {
            ajfw ajfw = this.l;
            ajgf ajgf = this.f;
            long j = this.k;
            long j2 = this.m;
            int i = 1;
            while (true) {
                long j3 = this.d.get();
                while (j != j3) {
                    boolean z = this.h;
                    try {
                        Object poll = ajgf.poll();
                        boolean z2 = poll == null;
                        if (!a(z, z2, ajfw)) {
                            if (z2) {
                                break;
                            }
                            if (ajfw.b(poll)) {
                                j++;
                            }
                            j2++;
                            if (j2 == ((long) this.c)) {
                                this.e.a(j2);
                                j2 = 0;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        ajep.a(th);
                        this.g = true;
                        this.e.b();
                        ajgf.clear();
                        ajfw.a(th);
                        this.a.dispose();
                        return;
                    }
                }
                if (j != j3 || !a(this.h, ajgf.isEmpty(), ajfw)) {
                    int i2 = get();
                    if (i == i2) {
                        this.k = j;
                        this.m = j2;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    return;
                }
            }
        }

        public final T poll() {
            Object poll = this.f.poll();
            if (!(poll == null || this.j == 1)) {
                long j = this.m + 1;
                if (j == ((long) this.c)) {
                    this.m = 0;
                    this.e.a(j);
                } else {
                    this.m = j;
                }
            }
            return poll;
        }
    }

    public ajkf(ajde<T> ajde, ajdw ajdw, int i) {
        super(ajde);
        this.c = ajdw;
        this.e = i;
    }

    public final void a_(akux<? super T> akux) {
        ajde ajde;
        ajdh bVar;
        c b = this.c.b();
        if (akux instanceof ajfw) {
            ajde = this.b;
            bVar = new b((ajfw) akux, b, false, this.e);
        } else {
            ajde = this.b;
            bVar = new c(akux, b, false, this.e);
        }
        ajde.a(bVar);
    }
}
