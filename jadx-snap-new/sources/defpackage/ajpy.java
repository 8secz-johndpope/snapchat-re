package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajpy */
public final class ajpy<T> extends ajva<T> {
    private ajdt<T> a;
    private AtomicReference<b<T>> b;
    private ajdt<T> c;

    /* renamed from: ajpy$a */
    static final class a<T> extends AtomicReference<Object> implements ajej {
        final ajdv<? super T> a;

        a(ajdv<? super T> ajdv) {
            this.a = ajdv;
        }

        public final void dispose() {
            a andSet = getAndSet(this);
            if (andSet != null && andSet != this) {
                ((b) andSet).a(this);
            }
        }

        public final boolean isDisposed() {
            return get() == this;
        }
    }

    /* renamed from: ajpy$b */
    static final class b<T> implements ajdv<T>, ajej {
        static final a[] a = new a[0];
        private static a[] e = new a[0];
        final AtomicReference<a<T>[]> b = new AtomicReference(e);
        final AtomicBoolean c;
        private AtomicReference<b<T>> d;
        private AtomicReference<ajej> f = new AtomicReference();

        b(AtomicReference<b<T>> atomicReference) {
            this.d = atomicReference;
            this.c = new AtomicBoolean();
        }

        public final void a() {
            this.d.compareAndSet(this, null);
            for (a aVar : (a[]) this.b.getAndSet(a)) {
                aVar.a.a();
            }
        }

        public final void a(ajej ajej) {
            ajfp.b(this.f, ajej);
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
                        if (aVarArr[i2].equals(aVar)) {
                            i = i2;
                            break;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            obj = e;
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
            for (a aVar : (a[]) this.b.get()) {
                aVar.a.a((Object) t);
            }
        }

        public final void a(Throwable th) {
            this.d.compareAndSet(this, null);
            a[] aVarArr = (a[]) this.b.getAndSet(a);
            if (aVarArr.length != 0) {
                for (a aVar : aVarArr) {
                    aVar.a.a(th);
                }
                return;
            }
            ajvo.a(th);
        }

        public final void dispose() {
            if (((a[]) this.b.getAndSet(a)) != a) {
                this.d.compareAndSet(this, null);
                ajfp.a(this.f);
            }
        }

        public final boolean isDisposed() {
            return this.b.get() == a;
        }
    }

    /* renamed from: ajpy$c */
    static final class c<T> implements ajdt<T> {
        private final AtomicReference<b<T>> a;

        c(AtomicReference<b<T>> atomicReference) {
            this.a = atomicReference;
        }

        public final void a(ajdv<? super T> ajdv) {
            b bVar;
            a aVar = new a(ajdv);
            ajdv.a((ajej) aVar);
            while (true) {
                int i;
                bVar = (b) this.a.get();
                if (bVar == null || bVar.isDisposed()) {
                    b bVar2 = new b(this.a);
                    if (this.a.compareAndSet(bVar, bVar2)) {
                        bVar = bVar2;
                    } else {
                        continue;
                    }
                }
                a[] aVarArr;
                a[] aVarArr2;
                do {
                    aVarArr = (a[]) bVar.b.get();
                    i = 0;
                    if (aVarArr == b.a) {
                        break;
                    }
                    int length = aVarArr.length;
                    aVarArr2 = new a[(length + 1)];
                    System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                    aVarArr2[length] = aVar;
                } while (!bVar.b.compareAndSet(aVarArr, aVarArr2));
                i = 1;
                if (i != 0) {
                    break;
                }
            }
            if (!aVar.compareAndSet(null, bVar)) {
                bVar.a(aVar);
            }
        }
    }

    private ajpy(ajdt<T> ajdt, ajdt<T> ajdt2, AtomicReference<b<T>> atomicReference) {
        this.c = ajdt;
        this.a = ajdt2;
        this.b = atomicReference;
    }

    public static <T> ajva<T> k(ajdt<T> ajdt) {
        AtomicReference atomicReference = new AtomicReference();
        return ajvo.a(new ajpy(new c(atomicReference), ajdt, atomicReference));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:21:0x0048 in {3, 6, 11, 12, 16, 17, 20} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final void a(defpackage.ajfb<? super defpackage.ajej> r5) {
        /*
        r4 = this;
        r0 = r4.b;
        r0 = r0.get();
        r0 = (defpackage.ajpy.b) r0;
        if (r0 == 0) goto L_0x0010;
        r1 = r0.isDisposed();
        if (r1 == 0) goto L_0x0020;
        r1 = new ajpy$b;
        r2 = r4.b;
        r1.<init>(r2);
        r2 = r4.b;
        r0 = r2.compareAndSet(r0, r1);
        if (r0 == 0) goto L_0x0000;
        r0 = r1;
        r1 = r0.c;
        r1 = r1.get();
        r2 = 1;
        r3 = 0;
        if (r1 != 0) goto L_0x0033;
        r1 = r0.c;
        r1 = r1.compareAndSet(r3, r2);
        if (r1 == 0) goto L_0x0033;
        goto L_0x0034;
        r2 = 0;
        r5.accept(r0);	 Catch:{ Throwable -> 0x003f }
        if (r2 == 0) goto L_0x003e;
        r5 = r4.a;
        r5.a(r0);
        return;
        r5 = move-exception;
        defpackage.ajep.a(r5);
        r5 = defpackage.ajur.a(r5);
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajpy.a(ajfb):void");
    }

    public final void a_(ajdv<? super T> ajdv) {
        this.c.a(ajdv);
    }
}
