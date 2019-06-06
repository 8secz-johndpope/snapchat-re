package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajjo */
public final class ajjo<T, U> extends ajim<T, U> {
    private ajfc<? super T, ? extends akuw<? extends U>> c;
    private boolean d = false;
    private int e;
    private int f;

    /* renamed from: ajjo$a */
    static final class a<T, U> extends AtomicReference<akuy> implements ajdh<U>, ajej {
        final long a;
        volatile boolean b;
        volatile ajgf<U> c;
        private b<T, U> d;
        private int e = (this.f >> 2);
        private int f;
        private long g;
        private int h;

        a(b<T, U> bVar, long j) {
            this.a = j;
            this.d = bVar;
            this.f = bVar.c;
        }

        public final void a() {
            this.b = true;
            this.d.c();
        }

        /* Access modifiers changed, original: final */
        public final void a(long j) {
            if (this.h != 1) {
                long j2 = this.g + j;
                if (j2 >= ((long) this.e)) {
                    this.g = 0;
                    ((akuy) get()).a(j2);
                    return;
                }
                this.g = j2;
            }
        }

        public final void a(akuy akuy) {
            if (ajui.a((AtomicReference) this, akuy)) {
                if (akuy instanceof ajgc) {
                    ajgc ajgc = (ajgc) akuy;
                    int a = ajgc.a(7);
                    if (a == 1) {
                        this.h = a;
                        this.c = ajgc;
                        this.b = true;
                        this.d.c();
                        return;
                    } else if (a == 2) {
                        this.h = a;
                        this.c = ajgc;
                    }
                }
                akuy.a((long) this.f);
            }
        }

        /* JADX WARNING: Missing block: B:24:0x0068, code skipped:
            if (r0.decrementAndGet() != 0) goto L_0x008d;
     */
        /* JADX WARNING: Missing block: B:33:0x008b, code skipped:
            if (r0.getAndIncrement() == 0) goto L_0x008d;
     */
        public final void a(U r9) {
            /*
            r8 = this;
            r0 = r8.h;
            r1 = 2;
            if (r0 == r1) goto L_0x0091;
        L_0x0005:
            r0 = r8.d;
            r1 = r0.get();
            r2 = "Inner queue full?!";
            if (r1 != 0) goto L_0x006b;
        L_0x000f:
            r1 = 0;
            r3 = 1;
            r1 = r0.compareAndSet(r1, r3);
            if (r1 == 0) goto L_0x006b;
        L_0x0017:
            r1 = r0.g;
            r3 = r1.get();
            r1 = r8.c;
            r5 = 0;
            r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
            if (r7 == 0) goto L_0x0046;
        L_0x0025:
            if (r1 == 0) goto L_0x002d;
        L_0x0027:
            r5 = r1.isEmpty();
            if (r5 == 0) goto L_0x0046;
        L_0x002d:
            r1 = r0.a;
            r1.a(r9);
            r1 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
            r9 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1));
            if (r9 == 0) goto L_0x0040;
        L_0x003b:
            r9 = r0.g;
            r9.decrementAndGet();
        L_0x0040:
            r1 = 1;
            r8.a(r1);
            goto L_0x0064;
        L_0x0046:
            if (r1 != 0) goto L_0x0055;
        L_0x0048:
            r1 = r8.c;
            if (r1 != 0) goto L_0x0055;
        L_0x004c:
            r1 = new ajta;
            r3 = r0.c;
            r1.<init>(r3);
            r8.c = r1;
        L_0x0055:
            r9 = r1.offer(r9);
            if (r9 != 0) goto L_0x0064;
        L_0x005b:
            r9 = new ajeq;
            r9.<init>(r2);
            r0.a(r9);
            return;
        L_0x0064:
            r9 = r0.decrementAndGet();
            if (r9 == 0) goto L_0x0090;
        L_0x006a:
            goto L_0x008d;
        L_0x006b:
            r1 = r8.c;
            if (r1 != 0) goto L_0x0078;
        L_0x006f:
            r1 = new ajta;
            r3 = r0.c;
            r1.<init>(r3);
            r8.c = r1;
        L_0x0078:
            r9 = r1.offer(r9);
            if (r9 != 0) goto L_0x0087;
        L_0x007e:
            r9 = new ajeq;
            r9.<init>(r2);
            r0.a(r9);
            return;
        L_0x0087:
            r9 = r0.getAndIncrement();
            if (r9 != 0) goto L_0x0090;
        L_0x008d:
            r0.d();
        L_0x0090:
            return;
        L_0x0091:
            r9 = r8.d;
            r9.c();
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ajjo$a.a(java.lang.Object):void");
        }

        public final void a(Throwable th) {
            lazySet(ajui.CANCELLED);
            b bVar = this.d;
            if (ajur.a(bVar.d, th)) {
                this.b = true;
                if (!bVar.b) {
                    bVar.h.b();
                    for (a dispose : (a[]) bVar.e.getAndSet(b.f)) {
                        dispose.dispose();
                    }
                }
                bVar.c();
                return;
            }
            ajvo.a(th);
        }

        public final void dispose() {
            ajui.a((AtomicReference) this);
        }

        public final boolean isDisposed() {
            return get() == ajui.CANCELLED;
        }
    }

    /* renamed from: ajjo$b */
    static final class b<T, U> extends AtomicInteger implements ajdh<T>, akuy {
        static final a<?, ?>[] f = new a[0];
        private static a<?, ?>[] n = new a[0];
        final akux<? super U> a;
        final boolean b;
        final int c;
        final ajul d = new ajul();
        final AtomicReference<a<?, ?>[]> e = new AtomicReference();
        final AtomicLong g = new AtomicLong();
        akuy h;
        private ajfc<? super T, ? extends akuw<? extends U>> i;
        private int j;
        private volatile ajge<U> k;
        private volatile boolean l;
        private volatile boolean m;
        private long o;
        private long p;
        private int q;
        private int r;
        private int s;

        b(akux<? super U> akux, ajfc<? super T, ? extends akuw<? extends U>> ajfc, boolean z, int i, int i2) {
            this.a = akux;
            this.i = ajfc;
            this.b = z;
            this.j = i;
            this.c = i2;
            this.s = Math.max(1, i >> 1);
            this.e.lazySet(n);
        }

        private boolean a(a<T, U> aVar) {
            a[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = (a[]) this.e.get();
                if (aVarArr == f) {
                    aVar.dispose();
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!this.e.compareAndSet(aVarArr, aVarArr2));
            return true;
        }

        private void b(a<T, U> aVar) {
            a[] aVarArr;
            Object obj;
            do {
                aVarArr = (a[]) this.e.get();
                int length = aVarArr.length;
                if (length != 0) {
                    int i = -1;
                    for (int i2 = 0; i2 < length; i2++) {
                        if (aVarArr[i2] == aVar) {
                            i = i2;
                            break;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            obj = n;
                        } else {
                            Object obj2 = new a[(length - 1)];
                            System.arraycopy(aVarArr, 0, obj2, 0, i);
                            System.arraycopy(aVarArr, i + 1, obj2, i, (length - i) - 1);
                            obj = obj2;
                        }
                    } else {
                        return;
                    }
                }
                return;
            } while (!this.e.compareAndSet(aVarArr, obj));
        }

        private ajgf<U> e() {
            ajgf<U> ajgf = this.k;
            if (ajgf == null) {
                int i = this.j;
                ajgf = i == Integer.MAX_VALUE ? new ajtb(this.c) : new ajta(i);
                this.k = ajgf;
            }
            return ajgf;
        }

        private boolean f() {
            if (this.m) {
                g();
                return true;
            } else if (this.b || this.d.get() == null) {
                return false;
            } else {
                g();
                Throwable a = ajur.a(this.d);
                if (a != ajur.a) {
                    this.a.a(a);
                }
                return true;
            }
        }

        private void g() {
            ajge ajge = this.k;
            if (ajge != null) {
                ajge.clear();
            }
        }

        public final void a() {
            if (!this.l) {
                this.l = true;
                c();
            }
        }

        public final void a(long j) {
            if (ajui.b(j)) {
                ajum.a(this.g, j);
                c();
            }
        }

        public final void a(akuy akuy) {
            if (ajui.a(this.h, akuy)) {
                this.h = akuy;
                this.a.a((akuy) this);
                if (!this.m) {
                    int i = this.j;
                    if (i == Integer.MAX_VALUE) {
                        akuy.a(Long.MAX_VALUE);
                        return;
                    }
                    akuy.a((long) i);
                }
            }
        }

        /* JADX WARNING: Missing block: B:37:0x008e, code skipped:
            if (decrementAndGet() != 0) goto L_0x00aa;
     */
        /* JADX WARNING: Missing block: B:43:0x00a8, code skipped:
            if (getAndIncrement() == 0) goto L_0x00aa;
     */
        public final void a(T r11) {
            /*
            r10 = this;
            r0 = r10.l;
            if (r0 == 0) goto L_0x0005;
        L_0x0004:
            return;
        L_0x0005:
            r0 = r10.i;	 Catch:{ Throwable -> 0x00eb }
            r11 = r0.apply(r11);	 Catch:{ Throwable -> 0x00eb }
            r0 = "The mapper returned a null Publisher";
            r11 = defpackage.ajfv.a(r11, r0);	 Catch:{ Throwable -> 0x00eb }
            r11 = (defpackage.akuw) r11;	 Catch:{ Throwable -> 0x00eb }
            r0 = r11 instanceof java.util.concurrent.Callable;
            if (r0 == 0) goto L_0x00d5;
        L_0x0017:
            r11 = (java.util.concurrent.Callable) r11;	 Catch:{ Throwable -> 0x00c8 }
            r11 = r11.call();	 Catch:{ Throwable -> 0x00c8 }
            r0 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
            r1 = 1;
            r2 = 0;
            if (r11 == 0) goto L_0x00ae;
        L_0x0024:
            r3 = r10.get();
            r4 = "Scalar queue full?!";
            if (r3 != 0) goto L_0x0091;
        L_0x002c:
            r3 = r10.compareAndSet(r2, r1);
            if (r3 == 0) goto L_0x0091;
        L_0x0032:
            r3 = r10.g;
            r5 = r3.get();
            r3 = r10.k;
            r7 = 0;
            r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
            if (r9 == 0) goto L_0x0075;
        L_0x0040:
            if (r3 == 0) goto L_0x0048;
        L_0x0042:
            r7 = r3.isEmpty();
            if (r7 == 0) goto L_0x0075;
        L_0x0048:
            r3 = r10.a;
            r3.a(r11);
            r3 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
            r11 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1));
            if (r11 == 0) goto L_0x005b;
        L_0x0056:
            r11 = r10.g;
            r11.decrementAndGet();
        L_0x005b:
            r11 = r10.j;
            if (r11 == r0) goto L_0x008a;
        L_0x005f:
            r11 = r10.m;
            if (r11 != 0) goto L_0x008a;
        L_0x0063:
            r11 = r10.r;
            r11 = r11 + r1;
            r10.r = r11;
            r0 = r10.s;
            if (r11 != r0) goto L_0x008a;
        L_0x006c:
            r10.r = r2;
            r11 = r10.h;
            r0 = (long) r0;
            r11.a(r0);
            goto L_0x008a;
        L_0x0075:
            if (r3 != 0) goto L_0x007b;
        L_0x0077:
            r3 = r10.e();
        L_0x007b:
            r11 = r3.offer(r11);
            if (r11 != 0) goto L_0x008a;
        L_0x0081:
            r11 = new java.lang.IllegalStateException;
            r11.<init>(r4);
            r10.a(r11);
            return;
        L_0x008a:
            r11 = r10.decrementAndGet();
            if (r11 == 0) goto L_0x00ad;
        L_0x0090:
            goto L_0x00aa;
        L_0x0091:
            r0 = r10.e();
            r11 = r0.offer(r11);
            if (r11 != 0) goto L_0x00a4;
        L_0x009b:
            r11 = new java.lang.IllegalStateException;
            r11.<init>(r4);
            r10.a(r11);
            return;
        L_0x00a4:
            r11 = r10.getAndIncrement();
            if (r11 != 0) goto L_0x00ad;
        L_0x00aa:
            r10.d();
        L_0x00ad:
            return;
        L_0x00ae:
            r11 = r10.j;
            if (r11 == r0) goto L_0x00c7;
        L_0x00b2:
            r11 = r10.m;
            if (r11 != 0) goto L_0x00c7;
        L_0x00b6:
            r11 = r10.r;
            r11 = r11 + r1;
            r10.r = r11;
            r0 = r10.s;
            if (r11 != r0) goto L_0x00c7;
        L_0x00bf:
            r10.r = r2;
            r11 = r10.h;
            r0 = (long) r0;
            r11.a(r0);
        L_0x00c7:
            return;
        L_0x00c8:
            r11 = move-exception;
            defpackage.ajep.a(r11);
            r0 = r10.d;
            defpackage.ajur.a(r0, r11);
            r10.c();
            return;
        L_0x00d5:
            r0 = new ajjo$a;
            r1 = r10.o;
            r3 = 1;
            r3 = r3 + r1;
            r10.o = r3;
            r0.<init>(r10, r1);
            r1 = r10.a(r0);
            if (r1 == 0) goto L_0x00ea;
        L_0x00e7:
            r11.a(r0);
        L_0x00ea:
            return;
        L_0x00eb:
            r11 = move-exception;
            defpackage.ajep.a(r11);
            r0 = r10.h;
            r0.b();
            r10.a(r11);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ajjo$b.a(java.lang.Object):void");
        }

        public final void a(Throwable th) {
            if (this.l) {
                ajvo.a(th);
            } else if (ajur.a(this.d, th)) {
                this.l = true;
                c();
            } else {
                ajvo.a(th);
            }
        }

        public final void b() {
            if (!this.m) {
                this.m = true;
                this.h.b();
                a[] aVarArr = (a[]) this.e.get();
                a[] aVarArr2 = f;
                if (aVarArr != aVarArr2) {
                    aVarArr = (a[]) this.e.getAndSet(aVarArr2);
                    if (aVarArr != f) {
                        for (a dispose : aVarArr) {
                            dispose.dispose();
                        }
                        Throwable a = ajur.a(this.d);
                        if (!(a == null || a == ajur.a)) {
                            ajvo.a(a);
                        }
                    }
                }
                if (getAndIncrement() == 0) {
                    ajge ajge = this.k;
                    if (ajge != null) {
                        ajge.clear();
                    }
                }
            }
        }

        /* Access modifiers changed, original: final */
        public final void c() {
            if (getAndIncrement() == 0) {
                d();
            }
        }

        /* Access modifiers changed, original: final */
        public final void d() {
            int i;
            akux akux = this.a;
            int i2 = 1;
            while (!f()) {
                long j;
                ajge ajge = this.k;
                long j2 = this.g.get();
                Object obj = j2 == Long.MAX_VALUE ? 1 : null;
                long j3 = 0;
                if (ajge != null) {
                    long j4 = 0;
                    while (true) {
                        long j5 = 0;
                        j = j4;
                        Object obj2 = null;
                        while (j2 != 0) {
                            Object poll = ajge.poll();
                            if (!f()) {
                                if (poll == null) {
                                    obj2 = poll;
                                    break;
                                }
                                akux.a(poll);
                                j++;
                                j5++;
                                j2--;
                                obj2 = poll;
                            } else {
                                return;
                            }
                        }
                        if (j5 != 0) {
                            j2 = obj != null ? Long.MAX_VALUE : this.g.addAndGet(-j5);
                        }
                        if (j2 == 0 || r16 == null) {
                            break;
                        }
                        j4 = j;
                    }
                } else {
                    j = 0;
                }
                boolean z = this.l;
                ajge ajge2 = this.k;
                a[] aVarArr = (a[]) this.e.get();
                int length = aVarArr.length;
                Throwable a;
                if (z && ((ajge2 == null || ajge2.isEmpty()) && length == 0)) {
                    a = ajur.a(this.d);
                    if (a != ajur.a) {
                        if (a == null) {
                            akux.a();
                            return;
                        }
                        akux.a(a);
                    }
                    return;
                }
                int i3;
                long j6;
                Object obj3;
                if (length != 0) {
                    a[] aVarArr2;
                    i3 = i2;
                    j6 = this.p;
                    int i4 = this.q;
                    if (length <= i4 || aVarArr[i4].a != j6) {
                        if (length <= i4) {
                            i4 = 0;
                        }
                        int i5 = i4;
                        for (i4 = 0; i4 < length && aVarArr[i5].a != j6; i4++) {
                            i5++;
                            if (i5 == length) {
                                i5 = 0;
                            }
                        }
                        this.q = i5;
                        this.p = aVarArr[i5].a;
                        i4 = i5;
                    }
                    i2 = i4;
                    obj3 = null;
                    int i6 = 0;
                    while (i6 < length) {
                        if (!f()) {
                            a aVar = aVarArr[i2];
                            Object obj4 = null;
                            while (!f()) {
                                int i7;
                                ajgf ajgf = aVar.c;
                                if (ajgf != null) {
                                    aVarArr2 = aVarArr;
                                    i = length;
                                    long j7 = j3;
                                    while (j2 != j3) {
                                        try {
                                            obj4 = ajgf.poll();
                                            if (obj4 == null) {
                                                break;
                                            }
                                            akux.a(obj4);
                                            if (!f()) {
                                                j2--;
                                                j7++;
                                            } else {
                                                return;
                                            }
                                        } catch (Throwable a2) {
                                            Throwable th = a2;
                                            ajep.a(th);
                                            aVar.dispose();
                                            ajur.a(this.d, th);
                                            if (!this.b) {
                                                this.h.b();
                                            }
                                            if (!f()) {
                                                b(aVar);
                                                i6++;
                                                i7 = i;
                                                obj3 = 1;
                                            } else {
                                                return;
                                            }
                                        }
                                    }
                                    if (j7 != j3) {
                                        j2 = obj == null ? this.g.addAndGet(-j7) : Long.MAX_VALUE;
                                        aVar.a(j7);
                                        j7 = 0;
                                    } else {
                                        j7 = j3;
                                    }
                                    if (!(j2 == j7 || obj4 == null)) {
                                        aVarArr = aVarArr2;
                                        length = i;
                                        j3 = 0;
                                    }
                                } else {
                                    aVarArr2 = aVarArr;
                                    i = length;
                                }
                                boolean z2 = aVar.b;
                                ajgf ajgf2 = aVar.c;
                                if (z2 && (ajgf2 == null || ajgf2.isEmpty())) {
                                    b(aVar);
                                    if (!f()) {
                                        j++;
                                        obj3 = 1;
                                    } else {
                                        return;
                                    }
                                }
                                if (j2 == 0) {
                                    break;
                                }
                                length = i2 + 1;
                                i7 = i;
                                i2 = length == i7 ? 0 : length;
                                i6++;
                                length = i7;
                                aVarArr = aVarArr2;
                                j3 = 0;
                            }
                            return;
                        }
                        return;
                    }
                    aVarArr2 = aVarArr;
                    this.q = i2;
                    this.p = aVarArr2[i2].a;
                    j6 = j;
                    j2 = 0;
                } else {
                    i3 = i2;
                    j2 = 0;
                    j6 = j;
                    obj3 = null;
                }
                if (!(j6 == j2 || this.m)) {
                    this.h.a(j6);
                }
                if (obj3 == null) {
                    i2 = addAndGet(-i3);
                    if (i2 == 0) {
                        return;
                    }
                } else {
                    i2 = i3;
                }
            }
        }
    }

    public ajjo(ajde<T> ajde, ajfc<? super T, ? extends akuw<? extends U>> ajfc, boolean z, int i, int i2) {
        super(ajde);
        this.c = ajfc;
        this.e = i;
        this.f = i2;
    }

    public static <T, U> ajdh<T> a(akux<? super U> akux, ajfc<? super T, ? extends akuw<? extends U>> ajfc, boolean z, int i, int i2) {
        return new b(akux, ajfc, z, i, i2);
    }

    public final void a_(akux<? super U> akux) {
        if (!ajkv.a(this.b, akux, this.c)) {
            this.b.a(ajjo.a(akux, this.c, this.d, this.e, this.f));
        }
    }
}
