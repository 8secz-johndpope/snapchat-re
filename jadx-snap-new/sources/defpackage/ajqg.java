package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajqg */
public final class ajqg<T> extends ajva<T> implements ajfs {
    public static final b a = new k();
    private ajdt<T> b;
    private AtomicReference<h<T>> c;
    private b<T> d;
    private ajdt<T> e;

    /* renamed from: ajqg$j */
    static final class j<T> extends a<T> {
        private int b;

        j(int i) {
            this.b = i;
        }

        /* Access modifiers changed, original: final */
        public final void b() {
            if (this.a > this.b) {
                d dVar = (d) ((d) get()).get();
                this.a--;
                set(dVar);
            }
        }
    }

    /* renamed from: ajqg$b */
    interface b<T> {
        f<T> a();
    }

    /* renamed from: ajqg$k */
    static final class k implements b<Object> {
        k() {
        }

        public final f<Object> a() {
            return new l();
        }
    }

    /* renamed from: ajqg$g */
    static final class g<T> implements b<T> {
        private final int a;

        g(int i) {
            this.a = i;
        }

        public final f<T> a() {
            return new j(this.a);
        }
    }

    /* renamed from: ajqg$i */
    static final class i<T> implements ajdt<T> {
        private final AtomicReference<h<T>> a;
        private final b<T> b;

        i(AtomicReference<h<T>> atomicReference, b<T> bVar) {
            this.a = atomicReference;
            this.b = bVar;
        }

        public final void a(ajdv<? super T> ajdv) {
            h hVar;
            h hVar2;
            do {
                hVar2 = (h) this.a.get();
                if (hVar2 != null) {
                    break;
                }
                hVar = new h(this.b.a());
            } while (!this.a.compareAndSet(null, hVar));
            hVar2 = hVar;
            c cVar = new c(hVar2, ajdv);
            ajdv.a((ajej) cVar);
            c[] cVarArr;
            c[] cVarArr2;
            do {
                cVarArr = (c[]) hVar2.c.get();
                if (cVarArr == h.b) {
                    break;
                }
                int length = cVarArr.length;
                cVarArr2 = new c[(length + 1)];
                System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
                cVarArr2[length] = cVar;
            } while (!hVar2.c.compareAndSet(cVarArr, cVarArr2));
            if (cVar.isDisposed()) {
                hVar2.a(cVar);
            } else {
                hVar2.a.a(cVar);
            }
        }
    }

    /* renamed from: ajqg$h */
    static final class h<T> extends AtomicReference<ajej> implements ajdv<T>, ajej {
        static final c[] b = new c[0];
        private static c[] f = new c[0];
        final f<T> a;
        final AtomicReference<c[]> c = new AtomicReference(f);
        final AtomicBoolean d = new AtomicBoolean();
        private boolean e;

        h(f<T> fVar) {
            this.a = fVar;
        }

        private void b() {
            for (c a : (c[]) this.c.get()) {
                this.a.a(a);
            }
        }

        private void c() {
            for (c a : (c[]) this.c.getAndSet(b)) {
                this.a.a(a);
            }
        }

        public final void a() {
            if (!this.e) {
                this.e = true;
                this.a.a();
                c();
            }
        }

        public final void a(ajej ajej) {
            if (ajfp.b(this, ajej)) {
                b();
            }
        }

        /* Access modifiers changed, original: final */
        public final void a(c<T> cVar) {
            c[] cVarArr;
            Object obj;
            do {
                cVarArr = (c[]) this.c.get();
                int length = cVarArr.length;
                if (length != 0) {
                    int i = -1;
                    for (int i2 = 0; i2 < length; i2++) {
                        if (cVarArr[i2].equals(cVar)) {
                            i = i2;
                            break;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            obj = f;
                        } else {
                            Object obj2 = new c[(length - 1)];
                            System.arraycopy(cVarArr, 0, obj2, 0, i);
                            System.arraycopy(cVarArr, i + 1, obj2, i, (length - i) - 1);
                            obj = obj2;
                        }
                    } else {
                        return;
                    }
                }
                return;
            } while (!this.c.compareAndSet(cVarArr, obj));
        }

        public final void a(T t) {
            if (!this.e) {
                this.a.a((Object) t);
                b();
            }
        }

        public final void a(Throwable th) {
            if (this.e) {
                ajvo.a(th);
                return;
            }
            this.e = true;
            this.a.a(th);
            c();
        }

        public final void dispose() {
            this.c.set(b);
            ajfp.a((AtomicReference) this);
        }

        public final boolean isDisposed() {
            return this.c.get() == b;
        }
    }

    /* renamed from: ajqg$c */
    static final class c<T> extends AtomicInteger implements ajej {
        final ajdv<? super T> a;
        Object b;
        private h<T> c;
        private volatile boolean d;

        c(h<T> hVar, ajdv<? super T> ajdv) {
            this.c = hVar;
            this.a = ajdv;
        }

        public final void dispose() {
            if (!this.d) {
                this.d = true;
                this.c.a(this);
                this.b = null;
            }
        }

        public final boolean isDisposed() {
            return this.d;
        }
    }

    /* renamed from: ajqg$a */
    static abstract class a<T> extends AtomicReference<d> implements f<T> {
        int a;
        private d b;

        a() {
            d dVar = new d(null);
            this.b = dVar;
            set(dVar);
        }

        private void a(d dVar) {
            this.b.set(dVar);
            this.b = dVar;
            this.a++;
        }

        private void c() {
            d dVar = (d) get();
            if (dVar.a != null) {
                d dVar2 = new d(null);
                dVar2.lazySet(dVar.get());
                set(dVar2);
            }
        }

        public final void a() {
            a(new d(ajuu.COMPLETE));
            c();
        }

        public final void a(c<T> cVar) {
            if (cVar.getAndIncrement() == 0) {
                int i = 1;
                do {
                    d dVar = (d) cVar.b;
                    if (dVar == null) {
                        dVar = (d) get();
                        cVar.b = dVar;
                    }
                    while (!cVar.isDisposed()) {
                        d dVar2 = (d) dVar.get();
                        if (dVar2 == null) {
                            cVar.b = dVar;
                            i = cVar.addAndGet(-i);
                        } else if (ajuu.a(dVar2.a, cVar.a)) {
                            cVar.b = null;
                            return;
                        } else {
                            dVar = dVar2;
                        }
                    }
                    cVar.b = null;
                    return;
                } while (i != 0);
            }
        }

        public final void a(T t) {
            a(new d(t));
            b();
        }

        public final void a(Throwable th) {
            a(new d(ajuu.a(th)));
            c();
        }

        public abstract void b();
    }

    /* renamed from: ajqg$f */
    interface f<T> {
        void a();

        void a(c<T> cVar);

        void a(T t);

        void a(Throwable th);
    }

    /* renamed from: ajqg$d */
    static final class d extends AtomicReference<d> {
        final Object a;

        d(Object obj) {
            this.a = obj;
        }
    }

    /* renamed from: ajqg$l */
    static final class l<T> extends ArrayList<Object> implements f<T> {
        private volatile int a;

        l() {
            super(16);
        }

        public final void a() {
            add(ajuu.COMPLETE);
            this.a++;
        }

        public final void a(c<T> cVar) {
            if (cVar.getAndIncrement() == 0) {
                ajdv ajdv = cVar.a;
                int i = 1;
                while (!cVar.isDisposed()) {
                    int i2 = this.a;
                    Integer num = (Integer) cVar.b;
                    int intValue = num != null ? num.intValue() : 0;
                    while (intValue < i2) {
                        if (!ajuu.a(get(intValue), ajdv) && !cVar.isDisposed()) {
                            intValue++;
                        } else {
                            return;
                        }
                    }
                    cVar.b = Integer.valueOf(intValue);
                    i = cVar.addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }

        public final void a(T t) {
            add(t);
            this.a++;
        }

        public final void a(Throwable th) {
            add(ajuu.a(th));
            this.a++;
        }
    }

    /* renamed from: ajqg$e */
    public static final class e<T> extends ajva<T> {
        private final ajva<T> a;
        private final ajdp<T> b;

        public e(ajva<T> ajva, ajdp<T> ajdp) {
            this.a = ajva;
            this.b = ajdp;
        }

        public final void a(ajfb<? super ajej> ajfb) {
            this.a.a(ajfb);
        }

        public final void a_(ajdv<? super T> ajdv) {
            this.b.a((ajdv) ajdv);
        }
    }

    private ajqg(ajdt<T> ajdt, ajdt<T> ajdt2, AtomicReference<h<T>> atomicReference, b<T> bVar) {
        this.e = ajdt;
        this.b = ajdt2;
        this.c = atomicReference;
        this.d = bVar;
    }

    public static <T> ajva<T> a(ajdt<T> ajdt, b<T> bVar) {
        AtomicReference atomicReference = new AtomicReference();
        return ajvo.a(new ajqg(new i(atomicReference, bVar), ajdt, atomicReference, bVar));
    }

    public static <T> ajva<T> b(ajdt<T> ajdt, int i) {
        return ajqg.a(ajdt, new g(1));
    }

    public final void a(ajej ajej) {
        this.c.compareAndSet((h) ajej, null);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:23:0x0054 in {3, 6, 11, 12, 16, 17, 20, 22} preds:[]
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
        r0 = r4.c;
        r0 = r0.get();
        r0 = (defpackage.ajqg.h) r0;
        if (r0 == 0) goto L_0x0010;
        r1 = r0.isDisposed();
        if (r1 == 0) goto L_0x0024;
        r1 = r4.d;
        r1 = r1.a();
        r2 = new ajqg$h;
        r2.<init>(r1);
        r1 = r4.c;
        r0 = r1.compareAndSet(r0, r2);
        if (r0 == 0) goto L_0x0000;
        r0 = r2;
        r1 = r0.d;
        r1 = r1.get();
        r2 = 1;
        r3 = 0;
        if (r1 != 0) goto L_0x0038;
        r1 = r0.d;
        r1 = r1.compareAndSet(r3, r2);
        if (r1 == 0) goto L_0x0038;
        r1 = 1;
        goto L_0x0039;
        r1 = 0;
        r5.accept(r0);	 Catch:{ Throwable -> 0x0044 }
        if (r1 == 0) goto L_0x0043;
        r5 = r4.b;
        r5.a(r0);
        return;
        r5 = move-exception;
        if (r1 == 0) goto L_0x004c;
        r0 = r0.d;
        r0.compareAndSet(r2, r3);
        defpackage.ajep.a(r5);
        r5 = defpackage.ajur.a(r5);
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajqg.a(ajfb):void");
    }

    public final void a_(ajdv<? super T> ajdv) {
        this.e.a(ajdv);
    }
}
