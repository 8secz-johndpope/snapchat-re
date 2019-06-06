package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajqv */
public final class ajqv<T, R> extends ajnp<T, R> {
    private ajfc<? super T, ? extends ajdt<? extends R>> b;
    private int c;
    private boolean d = false;

    /* renamed from: ajqv$a */
    static final class a<T, R> extends AtomicReference<ajej> implements ajdv<R> {
        volatile ajgf<R> a;
        volatile boolean b;
        private b<T, R> c;
        private long d;
        private int e;

        a(b<T, R> bVar, long j, int i) {
            this.c = bVar;
            this.d = j;
            this.e = i;
        }

        public final void a() {
            if (this.d == this.c.d) {
                this.b = true;
                this.c.b();
            }
        }

        public final void a(ajej ajej) {
            if (ajfp.b(this, ajej)) {
                if (ajej instanceof ajga) {
                    ajga ajga = (ajga) ajej;
                    int a = ajga.a(7);
                    if (a == 1) {
                        this.a = ajga;
                        this.b = true;
                        this.c.b();
                        return;
                    } else if (a == 2) {
                        this.a = ajga;
                        return;
                    }
                }
                this.a = new ajtb(this.e);
            }
        }

        public final void a(R r) {
            if (this.d == this.c.d) {
                if (r != null) {
                    this.a.offer(r);
                }
                this.c.b();
            }
        }

        public final void a(Throwable th) {
            b bVar = this.c;
            if (this.d == bVar.d && ajur.a(bVar.b, th)) {
                if (!bVar.a) {
                    bVar.c.dispose();
                }
                this.b = true;
                bVar.b();
                return;
            }
            ajvo.a(th);
        }
    }

    /* renamed from: ajqv$b */
    static final class b<T, R> extends AtomicInteger implements ajdv<T>, ajej {
        private static a<Object, Object> k;
        final boolean a;
        final ajul b;
        ajej c;
        volatile long d;
        private ajdv<? super R> e;
        private ajfc<? super T, ? extends ajdt<? extends R>> f;
        private int g;
        private volatile boolean h;
        private volatile boolean i;
        private AtomicReference<a<T, R>> j = new AtomicReference();

        static {
            AtomicReference aVar = new a(null, -1, 1);
            k = aVar;
            ajfp.a(aVar);
        }

        b(ajdv<? super R> ajdv, ajfc<? super T, ? extends ajdt<? extends R>> ajfc, int i, boolean z) {
            this.e = ajdv;
            this.f = ajfc;
            this.g = i;
            this.a = false;
            this.b = new ajul();
        }

        private void c() {
            a aVar = (a) this.j.get();
            a aVar2 = k;
            if (aVar != aVar2) {
                AtomicReference atomicReference = (a) this.j.getAndSet(aVar2);
                if (atomicReference != k && atomicReference != null) {
                    ajfp.a(atomicReference);
                }
            }
        }

        public final void a() {
            if (!this.h) {
                this.h = true;
                b();
            }
        }

        public final void a(ajej ajej) {
            if (ajfp.a(this.c, ajej)) {
                this.c = ajej;
                this.e.a((ajej) this);
            }
        }

        public final void a(T t) {
            long j = this.d + 1;
            this.d = j;
            AtomicReference atomicReference = (a) this.j.get();
            if (atomicReference != null) {
                ajfp.a(atomicReference);
            }
            try {
                ajdt ajdt = (ajdt) ajfv.a(this.f.apply(t), "The ObservableSource returned is null");
                a aVar = new a(this, j, this.g);
                a aVar2;
                do {
                    aVar2 = (a) this.j.get();
                    if (aVar2 == k) {
                        break;
                    }
                } while (!this.j.compareAndSet(aVar2, aVar));
                ajdt.a(aVar);
            } catch (Throwable th) {
                ajep.a(th);
                this.c.dispose();
                a(th);
            }
        }

        public final void a(Throwable th) {
            if (this.h || !ajur.a(this.b, th)) {
                ajvo.a(th);
                return;
            }
            if (!this.a) {
                c();
            }
            this.h = true;
            b();
        }

        /* Access modifiers changed, original: final */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x000f A:{SYNTHETIC} */
        /* JADX WARNING: Missing block: B:36:0x0069, code skipped:
            if (r8 != false) goto L_0x006b;
     */
        /* JADX WARNING: Missing block: B:40:0x007a, code skipped:
            if (r8 != false) goto L_0x006b;
     */
        public final void b() {
            /*
            r13 = this;
            r0 = r13.getAndIncrement();
            if (r0 == 0) goto L_0x0007;
        L_0x0006:
            return;
        L_0x0007:
            r0 = r13.e;
            r1 = r13.j;
            r2 = r13.a;
            r3 = 1;
            r4 = 1;
        L_0x000f:
            r5 = r13.i;
            if (r5 == 0) goto L_0x0014;
        L_0x0013:
            return;
        L_0x0014:
            r5 = r13.h;
            r6 = 0;
            if (r5 == 0) goto L_0x0052;
        L_0x0019:
            r5 = r1.get();
            if (r5 != 0) goto L_0x0021;
        L_0x001f:
            r5 = 1;
            goto L_0x0022;
        L_0x0021:
            r5 = 0;
        L_0x0022:
            if (r2 == 0) goto L_0x0038;
        L_0x0024:
            if (r5 == 0) goto L_0x0052;
        L_0x0026:
            r1 = r13.b;
            r1 = r1.get();
            r1 = (java.lang.Throwable) r1;
            if (r1 == 0) goto L_0x0034;
        L_0x0030:
            r0.a(r1);
            return;
        L_0x0034:
            r0.a();
            return;
        L_0x0038:
            r7 = r13.b;
            r7 = r7.get();
            r7 = (java.lang.Throwable) r7;
            if (r7 == 0) goto L_0x004c;
        L_0x0042:
            r1 = r13.b;
            r1 = defpackage.ajur.a(r1);
            r0.a(r1);
            return;
        L_0x004c:
            if (r5 == 0) goto L_0x0052;
        L_0x004e:
            r0.a();
            return;
        L_0x0052:
            r5 = r1.get();
            r5 = (defpackage.ajqv.a) r5;
            if (r5 == 0) goto L_0x00d2;
        L_0x005a:
            r7 = r5.a;
            if (r7 == 0) goto L_0x00d2;
        L_0x005e:
            r8 = r5.b;
            r9 = 0;
            if (r8 == 0) goto L_0x007d;
        L_0x0063:
            r8 = r7.isEmpty();
            if (r2 == 0) goto L_0x006f;
        L_0x0069:
            if (r8 == 0) goto L_0x007d;
        L_0x006b:
            r1.compareAndSet(r5, r9);
            goto L_0x000f;
        L_0x006f:
            r10 = r13.b;
            r10 = r10.get();
            r10 = (java.lang.Throwable) r10;
            if (r10 == 0) goto L_0x007a;
        L_0x0079:
            goto L_0x0042;
        L_0x007a:
            if (r8 == 0) goto L_0x007d;
        L_0x007c:
            goto L_0x006b;
        L_0x007d:
            r8 = 0;
        L_0x007e:
            r10 = r13.i;
            if (r10 == 0) goto L_0x0083;
        L_0x0082:
            return;
        L_0x0083:
            r10 = r1.get();
            if (r5 == r10) goto L_0x008b;
        L_0x0089:
            r8 = 1;
            goto L_0x00d0;
        L_0x008b:
            if (r2 != 0) goto L_0x0098;
        L_0x008d:
            r10 = r13.b;
            r10 = r10.get();
            r10 = (java.lang.Throwable) r10;
            if (r10 == 0) goto L_0x0098;
        L_0x0097:
            goto L_0x0042;
        L_0x0098:
            r10 = r5.b;
            r11 = r7.poll();	 Catch:{ Throwable -> 0x009f }
            goto L_0x00bd;
        L_0x009f:
            r8 = move-exception;
            defpackage.ajep.a(r8);
            r11 = r13.b;
            defpackage.ajur.a(r11, r8);
            r1.compareAndSet(r5, r9);
            if (r2 != 0) goto L_0x00b8;
        L_0x00ad:
            r13.c();
            r8 = r13.c;
            r8.dispose();
            r13.h = r3;
            goto L_0x00bb;
        L_0x00b8:
            defpackage.ajfp.a(r5);
        L_0x00bb:
            r11 = r9;
            r8 = 1;
        L_0x00bd:
            if (r11 != 0) goto L_0x00c1;
        L_0x00bf:
            r12 = 1;
            goto L_0x00c2;
        L_0x00c1:
            r12 = 0;
        L_0x00c2:
            if (r10 == 0) goto L_0x00ca;
        L_0x00c4:
            if (r12 == 0) goto L_0x00ca;
        L_0x00c6:
            r1.compareAndSet(r5, r9);
            goto L_0x0089;
        L_0x00ca:
            if (r12 != 0) goto L_0x00d0;
        L_0x00cc:
            r0.a(r11);
            goto L_0x007e;
        L_0x00d0:
            if (r8 != 0) goto L_0x000f;
        L_0x00d2:
            r4 = -r4;
            r4 = r13.addAndGet(r4);
            if (r4 != 0) goto L_0x000f;
        L_0x00d9:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ajqv$b.b():void");
        }

        public final void dispose() {
            if (!this.i) {
                this.i = true;
                this.c.dispose();
                c();
            }
        }

        public final boolean isDisposed() {
            return this.i;
        }
    }

    public ajqv(ajdt<T> ajdt, ajfc<? super T, ? extends ajdt<? extends R>> ajfc, int i) {
        super(ajdt);
        this.b = ajfc;
        this.c = i;
    }

    public final void a_(ajdv<? super R> ajdv) {
        if (!ajqk.a(this.a, ajdv, this.b)) {
            this.a.a(new b(ajdv, this.b, this.c, false));
        }
    }
}
