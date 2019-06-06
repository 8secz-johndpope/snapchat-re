package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajrm */
public final class ajrm<T, R> extends ajdp<R> {
    private ajdt<? extends T>[] a;
    private Iterable<? extends ajdt<? extends T>> b;
    private ajfc<? super Object[], ? extends R> c;
    private int d;
    private boolean e = false;

    /* renamed from: ajrm$b */
    static final class b<T, R> implements ajdv<T> {
        final ajtb<T> a;
        volatile boolean b;
        Throwable c;
        private a<T, R> d;
        private AtomicReference<ajej> e = new AtomicReference();

        b(a<T, R> aVar, int i) {
            this.d = aVar;
            this.a = new ajtb(i);
        }

        public final void a() {
            this.b = true;
            this.d.a();
        }

        public final void a(ajej ajej) {
            ajfp.b(this.e, ajej);
        }

        public final void a(T t) {
            this.a.offer(t);
            this.d.a();
        }

        public final void a(Throwable th) {
            this.c = th;
            this.b = true;
            this.d.a();
        }

        public final void b() {
            ajfp.a(this.e);
        }
    }

    /* renamed from: ajrm$a */
    static final class a<T, R> extends AtomicInteger implements ajej {
        final ajdv<? super R> a;
        final b<T, R>[] b;
        volatile boolean c;
        private ajfc<? super Object[], ? extends R> d;
        private T[] e;
        private boolean f;

        a(ajdv<? super R> ajdv, ajfc<? super Object[], ? extends R> ajfc, int i, boolean z) {
            this.a = ajdv;
            this.d = ajfc;
            this.b = new b[i];
            this.e = new Object[i];
            this.f = z;
        }

        private void b() {
            d();
            c();
        }

        private void c() {
            for (b b : this.b) {
                b.b();
            }
        }

        private void d() {
            for (b bVar : this.b) {
                bVar.a.clear();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:31:0x005b  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x005a A:{SYNTHETIC} */
        /* JADX WARNING: Missing block: B:20:0x0040, code skipped:
            if (r5 != null) goto L_0x004a;
     */
        public final void a() {
            /*
            r16 = this;
            r1 = r16;
            r0 = r16.getAndIncrement();
            if (r0 == 0) goto L_0x0009;
        L_0x0008:
            return;
        L_0x0009:
            r0 = r1.b;
            r2 = r1.a;
            r3 = r1.e;
            r4 = r1.f;
            r6 = 1;
        L_0x0012:
            r7 = r0.length;
            r8 = 0;
            r9 = 0;
            r10 = 0;
            r11 = 0;
        L_0x0017:
            if (r9 >= r7) goto L_0x0079;
        L_0x0019:
            r12 = r0[r9];
            r13 = r3[r11];
            if (r13 != 0) goto L_0x0063;
        L_0x001f:
            r13 = r12.b;
            r14 = r12.a;
            r14 = r14.poll();
            if (r14 != 0) goto L_0x002b;
        L_0x0029:
            r15 = 1;
            goto L_0x002c;
        L_0x002b:
            r15 = 0;
        L_0x002c:
            r5 = r1.c;
            if (r5 == 0) goto L_0x0035;
        L_0x0030:
            r16.b();
        L_0x0033:
            r5 = 1;
            goto L_0x0058;
        L_0x0035:
            if (r13 == 0) goto L_0x0057;
        L_0x0037:
            if (r4 == 0) goto L_0x0043;
        L_0x0039:
            if (r15 == 0) goto L_0x0057;
        L_0x003b:
            r5 = r12.c;
            r16.b();
            if (r5 == 0) goto L_0x0053;
        L_0x0042:
            goto L_0x004a;
        L_0x0043:
            r5 = r12.c;
            if (r5 == 0) goto L_0x004e;
        L_0x0047:
            r16.b();
        L_0x004a:
            r2.a(r5);
            goto L_0x0033;
        L_0x004e:
            if (r15 == 0) goto L_0x0057;
        L_0x0050:
            r16.b();
        L_0x0053:
            r2.a();
            goto L_0x0033;
        L_0x0057:
            r5 = 0;
        L_0x0058:
            if (r5 == 0) goto L_0x005b;
        L_0x005a:
            return;
        L_0x005b:
            if (r15 != 0) goto L_0x0060;
        L_0x005d:
            r3[r11] = r14;
            goto L_0x0074;
        L_0x0060:
            r10 = r10 + 1;
            goto L_0x0074;
        L_0x0063:
            r5 = r12.b;
            if (r5 == 0) goto L_0x0074;
        L_0x0067:
            if (r4 != 0) goto L_0x0074;
        L_0x0069:
            r5 = r12.c;
            if (r5 == 0) goto L_0x0074;
        L_0x006d:
            r16.b();
            r2.a(r5);
            return;
        L_0x0074:
            r11 = r11 + 1;
            r9 = r9 + 1;
            goto L_0x0017;
        L_0x0079:
            if (r10 != 0) goto L_0x009e;
        L_0x007b:
            r5 = r1.d;	 Catch:{ Throwable -> 0x0093 }
            r7 = r3.clone();	 Catch:{ Throwable -> 0x0093 }
            r5 = r5.apply(r7);	 Catch:{ Throwable -> 0x0093 }
            r7 = "The zipper returned a null value";
            r5 = defpackage.ajfv.a(r5, r7);	 Catch:{ Throwable -> 0x0093 }
            r2.a(r5);
            r5 = 0;
            java.util.Arrays.fill(r3, r5);
            goto L_0x0012;
        L_0x0093:
            r0 = move-exception;
            defpackage.ajep.a(r0);
            r16.b();
            r2.a(r0);
            return;
        L_0x009e:
            r5 = -r6;
            r6 = r1.addAndGet(r5);
            if (r6 != 0) goto L_0x0012;
        L_0x00a5:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ajrm$a.a():void");
        }

        public final void dispose() {
            if (!this.c) {
                this.c = true;
                c();
                if (getAndIncrement() == 0) {
                    d();
                }
            }
        }

        public final boolean isDisposed() {
            return this.c;
        }
    }

    public ajrm(ajdt<? extends T>[] ajdtArr, Iterable<? extends ajdt<? extends T>> iterable, ajfc<? super Object[], ? extends R> ajfc, int i) {
        this.a = ajdtArr;
        this.b = iterable;
        this.c = ajfc;
        this.d = i;
    }

    public final void a_(ajdv<? super R> ajdv) {
        int i;
        int i2;
        Object obj = this.a;
        int i3 = 0;
        if (obj == null) {
            obj = new ajdp[8];
            i = 0;
            for (ajdt ajdt : this.b) {
                if (i == obj.length) {
                    Object obj2 = new ajdt[((i >> 2) + i)];
                    System.arraycopy(obj, 0, obj2, 0, i);
                    obj = obj2;
                }
                i2 = i + 1;
                obj[i] = ajdt;
                i = i2;
            }
        } else {
            i = obj.length;
        }
        if (i == 0) {
            ajfq.a((ajdv) ajdv);
            return;
        }
        ajej aVar = new a(ajdv, this.c, i, false);
        int i4 = this.d;
        b[] bVarArr = aVar.b;
        int length = bVarArr.length;
        for (i2 = 0; i2 < length; i2++) {
            bVarArr[i2] = new b(aVar, i4);
        }
        aVar.lazySet(0);
        aVar.a.a(aVar);
        while (i3 < length && !aVar.c) {
            obj[i3].a(bVarArr[i3]);
            i3++;
        }
    }
}
