package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajow */
public final class ajow<T, U> extends ajnp<T, U> {
    private ajfc<? super T, ? extends ajdt<? extends U>> b;
    private boolean c;
    private int d;
    private int e;

    /* renamed from: ajow$a */
    static final class a<T, U> extends AtomicReference<ajej> implements ajdv<U> {
        final long a;
        volatile boolean b;
        volatile ajgf<U> c;
        private b<T, U> d;
        private int e;

        a(b<T, U> bVar, long j) {
            this.a = j;
            this.d = bVar;
        }

        public final void a() {
            this.b = true;
            this.d.b();
        }

        public final void a(ajej ajej) {
            if (ajfp.b(this, ajej) && (ajej instanceof ajga)) {
                ajga ajga = (ajga) ajej;
                int a = ajga.a(7);
                if (a == 1) {
                    this.e = a;
                    this.c = ajga;
                    this.b = true;
                    this.d.b();
                } else if (a == 2) {
                    this.e = a;
                    this.c = ajga;
                }
            }
        }

        /* JADX WARNING: Missing block: B:13:0x0034, code skipped:
            if (r0.getAndIncrement() == 0) goto L_0x0036;
     */
        public final void a(U r4) {
            /*
            r3 = this;
            r0 = r3.e;
            if (r0 != 0) goto L_0x003a;
        L_0x0004:
            r0 = r3.d;
            r1 = r0.get();
            if (r1 != 0) goto L_0x0020;
        L_0x000c:
            r1 = 0;
            r2 = 1;
            r1 = r0.compareAndSet(r1, r2);
            if (r1 == 0) goto L_0x0020;
        L_0x0014:
            r1 = r0.a;
            r1.a(r4);
            r4 = r0.decrementAndGet();
            if (r4 != 0) goto L_0x0036;
        L_0x001f:
            return;
        L_0x0020:
            r1 = r3.c;
            if (r1 != 0) goto L_0x002d;
        L_0x0024:
            r1 = new ajtb;
            r2 = r0.c;
            r1.<init>(r2);
            r3.c = r1;
        L_0x002d:
            r1.offer(r4);
            r4 = r0.getAndIncrement();
            if (r4 != 0) goto L_0x0039;
        L_0x0036:
            r0.c();
        L_0x0039:
            return;
        L_0x003a:
            r4 = r3.d;
            r4.b();
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ajow$a.a(java.lang.Object):void");
        }

        public final void a(Throwable th) {
            if (ajur.a(this.d.d, th)) {
                if (!this.d.b) {
                    this.d.d();
                }
                this.b = true;
                this.d.b();
                return;
            }
            ajvo.a(th);
        }
    }

    /* renamed from: ajow$b */
    static final class b<T, U> extends AtomicInteger implements ajdv<T>, ajej {
        private static a<?, ?>[] k = new a[0];
        private static a<?, ?>[] l = new a[0];
        final ajdv<? super U> a;
        final boolean b;
        final int c;
        final ajul d = new ajul();
        private ajfc<? super T, ? extends ajdt<? extends U>> e;
        private int f;
        private volatile ajge<U> g;
        private volatile boolean h;
        private volatile boolean i;
        private AtomicReference<a<?, ?>[]> j;
        private ajej m;
        private long n;
        private long o;
        private int p;
        private Queue<ajdt<? extends U>> q;
        private int r;

        b(ajdv<? super U> ajdv, ajfc<? super T, ? extends ajdt<? extends U>> ajfc, boolean z, int i, int i2) {
            this.a = ajdv;
            this.e = ajfc;
            this.b = z;
            this.f = i;
            this.c = i2;
            if (i != Integer.MAX_VALUE) {
                this.q = new ArrayDeque(i);
            }
            this.j = new AtomicReference(k);
        }

        private void a(ajdt<? extends U> ajdt) {
            ajdt ajdt2;
            while (ajdt2 instanceof Callable) {
                if (!a((Callable) ajdt2) || this.f == Integer.MAX_VALUE) {
                    break;
                }
                ajdt ajdt3;
                Object obj = null;
                synchronized (this) {
                    ajdt3 = (ajdt) this.q.poll();
                    if (ajdt3 == null) {
                        this.r--;
                        obj = 1;
                    }
                }
                if (obj != null) {
                    b();
                    return;
                }
                ajdt2 = ajdt3;
            }
            long j = this.n;
            this.n = 1 + j;
            a aVar = new a(this, j);
            if (a(aVar)) {
                ajdt2.a(aVar);
            }
        }

        private boolean a(a<T, U> aVar) {
            a[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = (a[]) this.j.get();
                if (aVarArr == l) {
                    ajfp.a((AtomicReference) aVar);
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!this.j.compareAndSet(aVarArr, aVarArr2));
            return true;
        }

        private boolean a(Callable<? extends U> callable) {
            try {
                Object call = callable.call();
                if (call == null) {
                    return true;
                }
                if (get() == 0 && compareAndSet(0, 1)) {
                    this.a.a(call);
                    if (decrementAndGet() == 0) {
                        return true;
                    }
                }
                ajge ajge = this.g;
                if (ajge == null) {
                    int i = this.f;
                    ajge = i == Integer.MAX_VALUE ? new ajtb(this.c) : new ajta(i);
                    this.g = ajge;
                }
                if (!ajge.offer(call)) {
                    a(new IllegalStateException("Scalar queue full?!"));
                    return true;
                } else if (getAndIncrement() != 0) {
                    return false;
                }
                c();
                return true;
            } catch (Throwable th) {
                ajep.a(th);
                ajur.a(this.d, th);
                b();
                return true;
            }
        }

        private void b(a<T, U> aVar) {
            a[] aVarArr;
            Object obj;
            do {
                aVarArr = (a[]) this.j.get();
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
                            obj = k;
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
            } while (!this.j.compareAndSet(aVarArr, obj));
        }

        private boolean e() {
            if (this.i) {
                return true;
            }
            Throwable th = (Throwable) this.d.get();
            if (this.b || th == null) {
                return false;
            }
            d();
            th = ajur.a(this.d);
            if (th != ajur.a) {
                this.a.a(th);
            }
            return true;
        }

        public final void a() {
            if (!this.h) {
                this.h = true;
                b();
            }
        }

        public final void a(ajej ajej) {
            if (ajfp.a(this.m, ajej)) {
                this.m = ajej;
                this.a.a((ajej) this);
            }
        }

        public final void a(T t) {
            if (!this.h) {
                try {
                    ajdt ajdt = (ajdt) ajfv.a(this.e.apply(t), "The mapper returned a null ObservableSource");
                    if (this.f != Integer.MAX_VALUE) {
                        synchronized (this) {
                            if (this.r == this.f) {
                                this.q.offer(ajdt);
                                return;
                            }
                            this.r++;
                        }
                    }
                    a(ajdt);
                } catch (Throwable th) {
                    ajep.a(th);
                    this.m.dispose();
                    a(th);
                }
            }
        }

        public final void a(Throwable th) {
            if (this.h) {
                ajvo.a(th);
            } else if (ajur.a(this.d, th)) {
                this.h = true;
                b();
            } else {
                ajvo.a(th);
            }
        }

        /* Access modifiers changed, original: final */
        public final void b() {
            if (getAndIncrement() == 0) {
                c();
            }
        }

        /* Access modifiers changed, original: final */
        public final void c() {
            int i;
            ajdv ajdv = this.a;
            int i2 = 1;
            while (!e()) {
                int size;
                ajge ajge = this.g;
                if (ajge != null) {
                    while (!e()) {
                        Object poll = ajge.poll();
                        if (poll != null) {
                            ajdv.a(poll);
                        }
                    }
                    return;
                }
                boolean z = this.h;
                ajge ajge2 = this.g;
                a[] aVarArr = (a[]) this.j.get();
                int length = aVarArr.length;
                if (this.f != Integer.MAX_VALUE) {
                    synchronized (this) {
                        size = this.q.size();
                    }
                } else {
                    size = 0;
                }
                if (z && ((ajge2 == null || ajge2.isEmpty()) && length == 0 && size == 0)) {
                    Throwable a = ajur.a(this.d);
                    if (a != ajur.a) {
                        if (a == null) {
                            ajdv.a();
                            return;
                        }
                        ajdv.a(a);
                    }
                    return;
                }
                int i3;
                if (length != 0) {
                    long j = this.o;
                    size = this.p;
                    if (length <= size || aVarArr[size].a != j) {
                        if (length <= size) {
                            size = 0;
                        }
                        int i4 = size;
                        for (size = 0; size < length && aVarArr[i4].a != j; size++) {
                            i4++;
                            if (i4 == length) {
                                i4 = 0;
                            }
                        }
                        this.p = i4;
                        this.o = aVarArr[i4].a;
                        size = i4;
                    }
                    i3 = 0;
                    i = 0;
                    while (i3 < length) {
                        if (!e()) {
                            AtomicReference atomicReference = aVarArr[size];
                            ajgf ajgf = atomicReference.c;
                            if (ajgf != null) {
                                while (true) {
                                    try {
                                        Object poll2 = ajgf.poll();
                                        if (poll2 == null) {
                                            break;
                                        }
                                        ajdv.a(poll2);
                                        if (e()) {
                                            return;
                                        }
                                    } catch (Throwable th) {
                                        ajep.a(th);
                                        ajfp.a(atomicReference);
                                        ajur.a(this.d, th);
                                        if (!e()) {
                                            b(atomicReference);
                                            i++;
                                            size++;
                                            if (size != length) {
                                            }
                                        } else {
                                            return;
                                        }
                                    }
                                }
                            }
                            boolean z2 = atomicReference.b;
                            ajgf ajgf2 = atomicReference.c;
                            if (z2 && (ajgf2 == null || ajgf2.isEmpty())) {
                                b(atomicReference);
                                if (!e()) {
                                    i++;
                                } else {
                                    return;
                                }
                            }
                            size++;
                            if (size != length) {
                                i3++;
                            }
                            size = 0;
                            i3++;
                        } else {
                            return;
                        }
                    }
                    this.p = size;
                    this.o = aVarArr[size].a;
                } else {
                    i = 0;
                }
                if (i == 0) {
                    i2 = addAndGet(-i2);
                    if (i2 == 0) {
                        return;
                    }
                } else if (this.f != Integer.MAX_VALUE) {
                    while (true) {
                        i3 = i - 1;
                        if (i == 0) {
                            continue;
                            break;
                        }
                        synchronized (this) {
                            ajdt ajdt = (ajdt) this.q.poll();
                            if (ajdt == null) {
                                this.r--;
                            } else {
                                a(ajdt);
                            }
                        }
                        i = i3;
                    }
                    while (true) {
                    }
                } else {
                    continue;
                }
            }
        }

        /* Access modifiers changed, original: final */
        public final boolean d() {
            this.m.dispose();
            a[] aVarArr = (a[]) this.j.get();
            a[] aVarArr2 = l;
            int i = 0;
            if (aVarArr != aVarArr2) {
                aVarArr = (a[]) this.j.getAndSet(aVarArr2);
                if (aVarArr != l) {
                    int length = aVarArr.length;
                    while (i < length) {
                        ajfp.a(aVarArr[i]);
                        i++;
                    }
                    return true;
                }
            }
            return false;
        }

        public final void dispose() {
            if (!this.i) {
                this.i = true;
                if (d()) {
                    Throwable a = ajur.a(this.d);
                    if (a != null && a != ajur.a) {
                        ajvo.a(a);
                    }
                }
            }
        }

        public final boolean isDisposed() {
            return this.i;
        }
    }

    public ajow(ajdt<T> ajdt, ajfc<? super T, ? extends ajdt<? extends U>> ajfc, boolean z, int i, int i2) {
        super(ajdt);
        this.b = ajfc;
        this.c = z;
        this.d = i;
        this.e = i2;
    }

    public final void a_(ajdv<? super U> ajdv) {
        if (!ajqk.a(this.a, ajdv, this.b)) {
            this.a.a(new b(ajdv, this.b, this.c, this.d, this.e));
        }
    }
}
