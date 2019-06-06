package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajoa */
public final class ajoa<T, R> extends ajdp<R> {
    private ajdt<? extends T>[] a;
    private Iterable<? extends ajdt<? extends T>> b;
    private ajfc<? super Object[], ? extends R> c;
    private int d;
    private boolean e = false;

    /* renamed from: ajoa$a */
    static final class a<T, R> extends AtomicReference<ajej> implements ajdv<T> {
        private b<T, R> a;
        private int b;

        a(b<T, R> bVar, int i) {
            this.a = bVar;
            this.b = i;
        }

        /* JADX WARNING: Missing block: B:13:0x001b, code skipped:
            if (r4 == r2.length) goto L_0x001d;
     */
        /* JADX WARNING: Missing block: B:16:0x0020, code skipped:
            if (r1 == null) goto L_0x0025;
     */
        /* JADX WARNING: Missing block: B:17:0x0022, code skipped:
            r0.a();
     */
        /* JADX WARNING: Missing block: B:18:0x0025, code skipped:
            r0.b();
     */
        /* JADX WARNING: Missing block: B:19:0x0028, code skipped:
            return;
     */
        public final void a() {
            /*
            r5 = this;
            r0 = r5.a;
            r1 = r5.b;
            monitor-enter(r0);
            r2 = r0.c;	 Catch:{ all -> 0x0029 }
            if (r2 != 0) goto L_0x000b;
        L_0x0009:
            monitor-exit(r0);	 Catch:{ all -> 0x0029 }
            return;
        L_0x000b:
            r1 = r2[r1];	 Catch:{ all -> 0x0029 }
            r3 = 1;
            if (r1 != 0) goto L_0x0012;
        L_0x0010:
            r1 = 1;
            goto L_0x0013;
        L_0x0012:
            r1 = 0;
        L_0x0013:
            if (r1 != 0) goto L_0x001d;
        L_0x0015:
            r4 = r0.h;	 Catch:{ all -> 0x0029 }
            r4 = r4 + r3;
            r0.h = r4;	 Catch:{ all -> 0x0029 }
            r2 = r2.length;	 Catch:{ all -> 0x0029 }
            if (r4 != r2) goto L_0x001f;
        L_0x001d:
            r0.f = r3;	 Catch:{ all -> 0x0029 }
        L_0x001f:
            monitor-exit(r0);	 Catch:{ all -> 0x0029 }
            if (r1 == 0) goto L_0x0025;
        L_0x0022:
            r0.a();
        L_0x0025:
            r0.b();
            return;
        L_0x0029:
            r1 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x0029 }
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ajoa$a.a():void");
        }

        public final void a(ajej ajej) {
            ajfp.b(this, ajej);
        }

        public final void a(T t) {
            this.a.a(this.b, t);
        }

        /* JADX WARNING: Missing block: B:16:0x0027, code skipped:
            if (r3 == r5.length) goto L_0x0029;
     */
        public final void a(java.lang.Throwable r5) {
            /*
            r4 = this;
            r0 = r4.a;
            r1 = r4.b;
            r2 = r0.g;
            r2 = defpackage.ajur.a(r2, r5);
            if (r2 == 0) goto L_0x003a;
        L_0x000c:
            r5 = r0.d;
            r2 = 1;
            if (r5 == 0) goto L_0x0030;
        L_0x0011:
            monitor-enter(r0);
            r5 = r0.c;	 Catch:{ all -> 0x002d }
            if (r5 != 0) goto L_0x0018;
        L_0x0016:
            monitor-exit(r0);	 Catch:{ all -> 0x002d }
            return;
        L_0x0018:
            r1 = r5[r1];	 Catch:{ all -> 0x002d }
            if (r1 != 0) goto L_0x001e;
        L_0x001c:
            r1 = 1;
            goto L_0x001f;
        L_0x001e:
            r1 = 0;
        L_0x001f:
            if (r1 != 0) goto L_0x0029;
        L_0x0021:
            r3 = r0.h;	 Catch:{ all -> 0x002d }
            r3 = r3 + r2;
            r0.h = r3;	 Catch:{ all -> 0x002d }
            r5 = r5.length;	 Catch:{ all -> 0x002d }
            if (r3 != r5) goto L_0x002b;
        L_0x0029:
            r0.f = r2;	 Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r0);	 Catch:{ all -> 0x002d }
            goto L_0x0031;
        L_0x002d:
            r5 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x002d }
            throw r5;
        L_0x0030:
            r1 = 1;
        L_0x0031:
            if (r1 == 0) goto L_0x0036;
        L_0x0033:
            r0.a();
        L_0x0036:
            r0.b();
            return;
        L_0x003a:
            defpackage.ajvo.a(r5);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ajoa$a.a(java.lang.Throwable):void");
        }
    }

    /* renamed from: ajoa$b */
    static final class b<T, R> extends AtomicInteger implements ajej {
        final ajdv<? super R> a;
        final a<T, R>[] b;
        Object[] c;
        final boolean d;
        volatile boolean e;
        volatile boolean f;
        final ajul g = new ajul();
        int h;
        private ajfc<? super Object[], ? extends R> i;
        private ajtb<Object[]> j;
        private int k;

        b(ajdv<? super R> ajdv, ajfc<? super Object[], ? extends R> ajfc, int i, int i2, boolean z) {
            this.a = ajdv;
            this.i = ajfc;
            int i3 = 0;
            this.d = false;
            this.c = new Object[i];
            a[] aVarArr = new a[i];
            while (i3 < i) {
                aVarArr[i3] = new a(this, i3);
                i3++;
            }
            this.b = aVarArr;
            this.j = new ajtb(i2);
        }

        private void a(ajtb<?> ajtb) {
            synchronized (this) {
                this.c = null;
            }
            ajtb.clear();
        }

        /* Access modifiers changed, original: final */
        public final void a() {
            for (AtomicReference a : this.b) {
                ajfp.a(a);
            }
        }

        /* Access modifiers changed, original: final */
        /* JADX WARNING: Missing block: B:14:0x0023, code skipped:
            if (r4 == null) goto L_0x0028;
     */
        /* JADX WARNING: Missing block: B:15:0x0025, code skipped:
            b();
     */
        /* JADX WARNING: Missing block: B:16:0x0028, code skipped:
            return;
     */
        public final void a(int r4, T r5) {
            /*
            r3 = this;
            monitor-enter(r3);
            r0 = r3.c;	 Catch:{ all -> 0x0029 }
            if (r0 != 0) goto L_0x0007;
        L_0x0005:
            monitor-exit(r3);	 Catch:{ all -> 0x0029 }
            return;
        L_0x0007:
            r1 = r0[r4];	 Catch:{ all -> 0x0029 }
            r2 = r3.k;	 Catch:{ all -> 0x0029 }
            if (r1 != 0) goto L_0x0011;
        L_0x000d:
            r2 = r2 + 1;
            r3.k = r2;	 Catch:{ all -> 0x0029 }
        L_0x0011:
            r0[r4] = r5;	 Catch:{ all -> 0x0029 }
            r4 = r0.length;	 Catch:{ all -> 0x0029 }
            if (r2 != r4) goto L_0x0021;
        L_0x0016:
            r4 = r3.j;	 Catch:{ all -> 0x0029 }
            r5 = r0.clone();	 Catch:{ all -> 0x0029 }
            r4.offer(r5);	 Catch:{ all -> 0x0029 }
            r4 = 1;
            goto L_0x0022;
        L_0x0021:
            r4 = 0;
        L_0x0022:
            monitor-exit(r3);	 Catch:{ all -> 0x0029 }
            if (r4 == 0) goto L_0x0028;
        L_0x0025:
            r3.b();
        L_0x0028:
            return;
        L_0x0029:
            r4 = move-exception;
            monitor-exit(r3);	 Catch:{ all -> 0x0029 }
            throw r4;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ajoa$b.a(int, java.lang.Object):void");
        }

        /* Access modifiers changed, original: final */
        public final void b() {
            if (getAndIncrement() == 0) {
                ajtb ajtb = this.j;
                ajdv ajdv = this.a;
                boolean z = this.d;
                int i = 1;
                while (!this.e) {
                    if (z || this.g.get() == null) {
                        boolean z2 = this.f;
                        Object[] objArr = (Object[]) ajtb.poll();
                        Object obj = objArr == null ? 1 : null;
                        if (z2 && obj != null) {
                            a(ajtb);
                            Throwable a = ajur.a(this.g);
                            if (a == null) {
                                ajdv.a();
                                return;
                            } else {
                                ajdv.a(a);
                                return;
                            }
                        } else if (obj == null) {
                            try {
                                ajdv.a(ajfv.a(this.i.apply(objArr), "The combiner returned a null value"));
                            } catch (Throwable th) {
                                ajep.a(th);
                                ajur.a(this.g, th);
                            }
                        } else {
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        }
                    } else {
                        a();
                        a(ajtb);
                        ajdv.a(ajur.a(this.g));
                        return;
                    }
                }
                a(ajtb);
            }
        }

        public final void dispose() {
            if (!this.e) {
                this.e = true;
                a();
                if (getAndIncrement() == 0) {
                    a(this.j);
                }
            }
        }

        public final boolean isDisposed() {
            return this.e;
        }
    }

    public ajoa(ajdt<? extends T>[] ajdtArr, Iterable<? extends ajdt<? extends T>> iterable, ajfc<? super Object[], ? extends R> ajfc, int i) {
        this.a = ajdtArr;
        this.b = iterable;
        this.c = ajfc;
        this.d = i;
    }

    public final void a_(ajdv<? super R> ajdv) {
        int i;
        ajdt[] ajdtArr = this.a;
        int i2 = 0;
        if (ajdtArr == null) {
            Object obj = new ajdp[8];
            Object obj2 = obj;
            int i3 = 0;
            for (ajdt ajdt : this.b) {
                if (i3 == obj2.length) {
                    Object obj3 = new ajdt[((i3 >> 2) + i3)];
                    System.arraycopy(obj2, 0, obj3, 0, i3);
                    obj2 = obj3;
                }
                int i4 = i3 + 1;
                obj2[i3] = ajdt;
                i3 = i4;
            }
            i = i3;
            ajdtArr = obj2;
        } else {
            i = ajdtArr.length;
        }
        if (i == 0) {
            ajfq.a((ajdv) ajdv);
            return;
        }
        ajej bVar = new b(ajdv, this.c, i, this.d, false);
        a[] aVarArr = bVar.b;
        int length = aVarArr.length;
        bVar.a.a(bVar);
        while (i2 < length && !bVar.f && !bVar.e) {
            ajdtArr[i2].a(aVarArr[i2]);
            i2++;
        }
    }
}
