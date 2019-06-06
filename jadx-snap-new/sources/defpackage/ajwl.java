package defpackage;

import defpackage.ajuu.b;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: ajwl */
public final class ajwl<T> extends ajws<T> {
    private static a[] c = new a[0];
    private static a[] d = new a[0];
    private AtomicReference<Object> a;
    private AtomicReference<a<T>[]> b;
    private ReadWriteLock e;
    private Lock f;
    private Lock g;
    private AtomicReference<Throwable> h;
    private long i;

    /* renamed from: ajwl$a */
    static final class a<T> implements ajej, defpackage.ajuj.a<Object> {
        final ajwl<T> a;
        boolean b;
        boolean c;
        ajuj<Object> d;
        volatile boolean e;
        long f;
        private ajdv<? super T> g;
        private boolean h;

        a(ajdv<? super T> ajdv, ajwl<T> ajwl) {
            this.g = ajdv;
            this.a = ajwl;
        }

        /* Access modifiers changed, original: final */
        /* JADX WARNING: Missing block: B:25:0x0030, code skipped:
            r3.h = true;
     */
        public final void a(java.lang.Object r4, long r5) {
            /*
            r3 = this;
            r0 = r3.e;
            if (r0 == 0) goto L_0x0005;
        L_0x0004:
            return;
        L_0x0005:
            r0 = r3.h;
            if (r0 != 0) goto L_0x0036;
        L_0x0009:
            monitor-enter(r3);
            r0 = r3.e;	 Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0010;
        L_0x000e:
            monitor-exit(r3);	 Catch:{ all -> 0x0033 }
            return;
        L_0x0010:
            r0 = r3.f;	 Catch:{ all -> 0x0033 }
            r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1));
            if (r2 != 0) goto L_0x0018;
        L_0x0016:
            monitor-exit(r3);	 Catch:{ all -> 0x0033 }
            return;
        L_0x0018:
            r5 = r3.c;	 Catch:{ all -> 0x0033 }
            if (r5 == 0) goto L_0x002c;
        L_0x001c:
            r5 = r3.d;	 Catch:{ all -> 0x0033 }
            if (r5 != 0) goto L_0x0027;
        L_0x0020:
            r5 = new ajuj;	 Catch:{ all -> 0x0033 }
            r5.<init>();	 Catch:{ all -> 0x0033 }
            r3.d = r5;	 Catch:{ all -> 0x0033 }
        L_0x0027:
            r5.a(r4);	 Catch:{ all -> 0x0033 }
            monitor-exit(r3);	 Catch:{ all -> 0x0033 }
            return;
        L_0x002c:
            r5 = 1;
            r3.b = r5;	 Catch:{ all -> 0x0033 }
            monitor-exit(r3);	 Catch:{ all -> 0x0033 }
            r3.h = r5;
            goto L_0x0036;
        L_0x0033:
            r4 = move-exception;
            monitor-exit(r3);	 Catch:{ all -> 0x0033 }
            throw r4;
        L_0x0036:
            r3.test(r4);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ajwl$a.a(java.lang.Object, long):void");
        }

        public final void dispose() {
            if (!this.e) {
                this.e = true;
                this.a.a(this);
            }
        }

        public final boolean isDisposed() {
            return this.e;
        }

        public final boolean test(Object obj) {
            return this.e || ajuu.a(obj, this.g);
        }
    }

    public ajwl() {
        this.e = new ReentrantReadWriteLock();
        this.f = this.e.readLock();
        this.g = this.e.writeLock();
        this.b = new AtomicReference(c);
        this.a = new AtomicReference();
        this.h = new AtomicReference();
    }

    private ajwl(T t) {
        this();
        this.a.lazySet(ajfv.a((Object) t, "defaultValue is null"));
    }

    public static <T> ajwl<T> i(T t) {
        return new ajwl(t);
    }

    private a<T>[] j(Object obj) {
        a[] aVarArr = (a[]) this.b.getAndSet(d);
        if (aVarArr != d) {
            k(obj);
        }
        return aVarArr;
    }

    private void k(Object obj) {
        this.g.lock();
        this.i++;
        this.a.lazySet(obj);
        this.g.unlock();
    }

    public final void a() {
        if (this.h.compareAndSet(null, ajur.a)) {
            ajuu ajuu = ajuu.COMPLETE;
            for (a a : j(ajuu)) {
                a.a(ajuu, this.i);
            }
        }
    }

    public final void a(ajej ajej) {
        if (this.h.get() != null) {
            ajej.dispose();
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(a<T> aVar) {
        a[] aVarArr;
        Object obj;
        do {
            aVarArr = (a[]) this.b.get();
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
                        obj = c;
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
        } while (!this.b.compareAndSet(aVarArr, obj));
    }

    public final void a(T t) {
        ajfv.a((Object) t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.h.get() == null) {
            k(t);
            for (a a : (a[]) this.b.get()) {
                a.a(t, this.i);
            }
        }
    }

    public final void a(Throwable th) {
        ajfv.a((Object) th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.h.compareAndSet(null, th)) {
            Object a = ajuu.a(th);
            for (a a2 : j(a)) {
                a2.a(a, this.i);
            }
            return;
        }
        ajvo.a(th);
    }

    /* JADX WARNING: Missing block: B:30:0x0064, code skipped:
            if (r8 == null) goto L_0x0087;
     */
    /* JADX WARNING: Missing block: B:32:0x006a, code skipped:
            if (r0.test(r8) != false) goto L_0x0087;
     */
    /* JADX WARNING: Missing block: B:34:0x006e, code skipped:
            if (r0.e != false) goto L_0x0087;
     */
    /* JADX WARNING: Missing block: B:35:0x0070, code skipped:
            monitor-enter(r0);
     */
    /* JADX WARNING: Missing block: B:37:?, code skipped:
            r8 = r0.d;
     */
    /* JADX WARNING: Missing block: B:38:0x0073, code skipped:
            if (r8 != null) goto L_0x0079;
     */
    /* JADX WARNING: Missing block: B:39:0x0075, code skipped:
            r0.c = false;
     */
    /* JADX WARNING: Missing block: B:40:0x0077, code skipped:
            monitor-exit(r0);
     */
    /* JADX WARNING: Missing block: B:41:0x0078, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:42:0x0079, code skipped:
            r0.d = null;
     */
    /* JADX WARNING: Missing block: B:43:0x007c, code skipped:
            monitor-exit(r0);
     */
    /* JADX WARNING: Missing block: B:44:0x007d, code skipped:
            r8.a(r0);
     */
    public final void a_(defpackage.ajdv<? super T> r8) {
        /*
        r7 = this;
        r0 = new ajwl$a;
        r0.<init>(r8, r7);
        r8.a(r0);
    L_0x0008:
        r1 = r7.b;
        r1 = r1.get();
        r1 = (defpackage.ajwl.a[]) r1;
        r2 = d;
        r3 = 1;
        r4 = 0;
        if (r1 != r2) goto L_0x0018;
    L_0x0016:
        r1 = 0;
        goto L_0x002b;
    L_0x0018:
        r2 = r1.length;
        r5 = r2 + 1;
        r5 = new defpackage.ajwl.a[r5];
        java.lang.System.arraycopy(r1, r4, r5, r4, r2);
        r5[r2] = r0;
        r2 = r7.b;
        r1 = r2.compareAndSet(r1, r5);
        if (r1 == 0) goto L_0x0008;
    L_0x002a:
        r1 = 1;
    L_0x002b:
        if (r1 == 0) goto L_0x0088;
    L_0x002d:
        r8 = r0.e;
        if (r8 == 0) goto L_0x0035;
    L_0x0031:
        r7.a(r0);
        return;
    L_0x0035:
        r8 = r0.e;
        if (r8 != 0) goto L_0x0087;
    L_0x0039:
        monitor-enter(r0);
        r8 = r0.e;	 Catch:{ all -> 0x0084 }
        if (r8 == 0) goto L_0x0040;
    L_0x003e:
        monitor-exit(r0);	 Catch:{ all -> 0x0084 }
        return;
    L_0x0040:
        r8 = r0.b;	 Catch:{ all -> 0x0084 }
        if (r8 == 0) goto L_0x0046;
    L_0x0044:
        monitor-exit(r0);	 Catch:{ all -> 0x0084 }
        return;
    L_0x0046:
        r8 = r0.a;	 Catch:{ all -> 0x0084 }
        r1 = r8.f;	 Catch:{ all -> 0x0084 }
        r1.lock();	 Catch:{ all -> 0x0084 }
        r5 = r8.i;	 Catch:{ all -> 0x0084 }
        r0.f = r5;	 Catch:{ all -> 0x0084 }
        r8 = r8.a;	 Catch:{ all -> 0x0084 }
        r8 = r8.get();	 Catch:{ all -> 0x0084 }
        r1.unlock();	 Catch:{ all -> 0x0084 }
        if (r8 == 0) goto L_0x005e;
    L_0x005c:
        r1 = 1;
        goto L_0x005f;
    L_0x005e:
        r1 = 0;
    L_0x005f:
        r0.c = r1;	 Catch:{ all -> 0x0084 }
        r0.b = r3;	 Catch:{ all -> 0x0084 }
        monitor-exit(r0);	 Catch:{ all -> 0x0084 }
        if (r8 == 0) goto L_0x0087;
    L_0x0066:
        r8 = r0.test(r8);
        if (r8 != 0) goto L_0x0087;
    L_0x006c:
        r8 = r0.e;
        if (r8 != 0) goto L_0x0087;
    L_0x0070:
        monitor-enter(r0);
        r8 = r0.d;	 Catch:{ all -> 0x0081 }
        if (r8 != 0) goto L_0x0079;
    L_0x0075:
        r0.c = r4;	 Catch:{ all -> 0x0081 }
        monitor-exit(r0);	 Catch:{ all -> 0x0081 }
        return;
    L_0x0079:
        r1 = 0;
        r0.d = r1;	 Catch:{ all -> 0x0081 }
        monitor-exit(r0);	 Catch:{ all -> 0x0081 }
        r8.a(r0);
        goto L_0x006c;
    L_0x0081:
        r8 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0081 }
        throw r8;
    L_0x0084:
        r8 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0084 }
        throw r8;
    L_0x0087:
        return;
    L_0x0088:
        r0 = r7.h;
        r0 = r0.get();
        r0 = (java.lang.Throwable) r0;
        r1 = defpackage.ajur.a;
        if (r0 != r1) goto L_0x0098;
    L_0x0094:
        r8.a();
        return;
    L_0x0098:
        r8.a(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajwl.a_(ajdv):void");
    }

    public final boolean n() {
        return ((a[]) this.b.get()).length != 0;
    }

    public final boolean o() {
        return ajuu.a(this.a.get());
    }

    public final T p() {
        Object obj = this.a.get();
        return (ajuu.a(obj) || (obj instanceof b)) ? null : obj;
    }

    public final boolean q() {
        Object obj = this.a.get();
        return (obj == null || ajuu.a(obj) || (obj instanceof b)) ? false : true;
    }
}
