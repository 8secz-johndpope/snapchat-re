package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajkr */
public final class ajkr<T> extends ajeu<T> implements ajfs {
    private ajde<T> b;
    private AtomicReference<h<T>> c;
    private Callable<? extends e<T>> d;
    private akuw<T> e;

    /* renamed from: ajkr$e */
    interface e<T> {
        void a();

        void a(c<T> cVar);

        void a(T t);

        void a(Throwable th);
    }

    /* renamed from: ajkr$h */
    static final class h<T> extends AtomicReference<akuy> implements ajdh<T>, ajej {
        static final c[] b = new c[0];
        private static c[] f = new c[0];
        final e<T> a;
        final AtomicReference<c<T>[]> c = new AtomicReference(f);
        final AtomicBoolean d = new AtomicBoolean();
        private boolean e;
        private AtomicInteger g = new AtomicInteger();
        private long h;
        private long i;

        h(e<T> eVar) {
            this.a = eVar;
        }

        public final void a() {
            if (!this.e) {
                this.e = true;
                this.a.a();
                for (c a : (c[]) this.c.getAndSet(b)) {
                    this.a.a(a);
                }
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

        public final void a(akuy akuy) {
            if (ajui.a((AtomicReference) this, akuy)) {
                b();
                for (c a : (c[]) this.c.get()) {
                    this.a.a(a);
                }
            }
        }

        public final void a(T t) {
            if (!this.e) {
                this.a.a((Object) t);
                for (c a : (c[]) this.c.get()) {
                    this.a.a(a);
                }
            }
        }

        public final void a(Throwable th) {
            if (this.e) {
                ajvo.a(th);
                return;
            }
            this.e = true;
            this.a.a(th);
            for (c a : (c[]) this.c.getAndSet(b)) {
                this.a.a(a);
            }
        }

        /* Access modifiers changed, original: final */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0070 A:{SYNTHETIC} */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0070 A:{SYNTHETIC} */
        public final void b() {
            /*
            r11 = this;
            r0 = r11.g;
            r0 = r0.getAndIncrement();
            if (r0 == 0) goto L_0x0009;
        L_0x0008:
            return;
        L_0x0009:
            r0 = 1;
        L_0x000a:
            r1 = r11.isDisposed();
            if (r1 == 0) goto L_0x0011;
        L_0x0010:
            return;
        L_0x0011:
            r1 = r11.c;
            r1 = r1.get();
            r1 = (defpackage.ajkr.c[]) r1;
            r2 = r11.h;
            r4 = r1.length;
            r5 = 0;
            r6 = r2;
        L_0x001e:
            if (r5 >= r4) goto L_0x002f;
        L_0x0020:
            r8 = r1[r5];
            r8 = r8.c;
            r8 = r8.get();
            r6 = java.lang.Math.max(r6, r8);
            r5 = r5 + 1;
            goto L_0x001e;
        L_0x002f:
            r4 = r11.i;
            r1 = r11.get();
            r1 = (defpackage.akuy) r1;
            r2 = r6 - r2;
            r8 = 0;
            r10 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1));
            if (r10 == 0) goto L_0x005c;
        L_0x003f:
            r11.h = r6;
            if (r1 == 0) goto L_0x004f;
        L_0x0043:
            r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
            if (r6 == 0) goto L_0x004b;
        L_0x0047:
            r11.i = r8;
            r4 = r4 + r2;
            goto L_0x0064;
        L_0x004b:
            r1.a(r2);
            goto L_0x0067;
        L_0x004f:
            r4 = r4 + r2;
            r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
            if (r1 >= 0) goto L_0x0059;
        L_0x0054:
            r4 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        L_0x0059:
            r11.i = r4;
            goto L_0x0067;
        L_0x005c:
            r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
            if (r2 == 0) goto L_0x0067;
        L_0x0060:
            if (r1 == 0) goto L_0x0067;
        L_0x0062:
            r11.i = r8;
        L_0x0064:
            r1.a(r4);
        L_0x0067:
            r1 = r11.g;
            r0 = -r0;
            r0 = r1.addAndGet(r0);
            if (r0 != 0) goto L_0x000a;
        L_0x0070:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ajkr$h.b():void");
        }

        public final void dispose() {
            this.c.set(b);
            ajui.a((AtomicReference) this);
        }

        public final boolean isDisposed() {
            return this.c.get() == b;
        }
    }

    /* renamed from: ajkr$d */
    static final class d extends AtomicReference<d> {
        final Object a;
        final long b;

        d(Object obj, long j) {
            this.a = obj;
            this.b = j;
        }
    }

    /* renamed from: ajkr$f */
    public static final class f<T> implements Callable<e<T>> {
        private final int a = 1;

        public final /* synthetic */ Object call() {
            return new i(1);
        }
    }

    /* renamed from: ajkr$g */
    public static final class g<T> implements akuw<T> {
        private final AtomicReference<h<T>> a;
        private final Callable<? extends e<T>> b;

        public g(AtomicReference<h<T>> atomicReference, Callable<? extends e<T>> callable) {
            this.a = atomicReference;
            this.b = callable;
        }

        public final void a(akux<? super T> akux) {
            h hVar;
            h hVar2;
            do {
                hVar2 = (h) this.a.get();
                if (hVar2 != null) {
                    break;
                }
                try {
                    hVar = new h((e) this.b.call());
                } catch (Throwable th) {
                    ajep.a(th);
                    ajuf.a(th, akux);
                    return;
                }
            } while (!this.a.compareAndSet(null, hVar));
            hVar2 = hVar;
            c cVar = new c(hVar2, akux);
            akux.a((akuy) cVar);
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
                return;
            }
            hVar2.b();
            hVar2.a.a(cVar);
        }
    }

    /* renamed from: ajkr$b */
    static final class b implements Callable<Object> {
        b() {
        }

        public final Object call() {
            return new j();
        }
    }

    /* renamed from: ajkr$a */
    static class a<T> extends AtomicReference<d> implements e<T> {
        int a;
        private d b;
        private long c;

        a() {
            d dVar = new d(null, 0);
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
                d dVar2 = new d(null, 0);
                dVar2.lazySet(dVar.get());
                set(dVar2);
            }
        }

        public final void a() {
            ajuu ajuu = ajuu.COMPLETE;
            long j = this.c + 1;
            this.c = j;
            a(new d(ajuu, j));
            c();
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:65:0x00a0 in {6, 12, 15, 16, 19, 30, 34, 35, 41, 42, 47, 54, 57, 60, 64} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final void a(defpackage.ajkr.c<T> r15) {
            /*
            r14 = this;
            monitor-enter(r15);
            r0 = r15.d;	 Catch:{ all -> 0x009d }
            r1 = 1;	 Catch:{ all -> 0x009d }
            if (r0 == 0) goto L_0x000a;	 Catch:{ all -> 0x009d }
            r15.e = r1;	 Catch:{ all -> 0x009d }
            monitor-exit(r15);	 Catch:{ all -> 0x009d }
            return;	 Catch:{ all -> 0x009d }
            r15.d = r1;	 Catch:{ all -> 0x009d }
            monitor-exit(r15);	 Catch:{ all -> 0x009d }
            r0 = r15.isDisposed();
            r2 = 0;
            if (r0 == 0) goto L_0x0017;
            r15.b = r2;
            return;
            r3 = r15.get();
            r5 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
            r0 = 0;
            r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
            if (r7 != 0) goto L_0x0027;
            r5 = 1;
            goto L_0x0028;
            r5 = 0;
            r6 = r15.b;
            r6 = (defpackage.ajkr.d) r6;
            r7 = 0;
            if (r6 != 0) goto L_0x003f;
            r6 = r14.get();
            r6 = (defpackage.ajkr.d) r6;
            r15.b = r6;
            r9 = r15.c;
            r10 = r6.b;
            defpackage.ajum.a(r9, r10);
            r9 = r7;
            r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1));
            if (r11 == 0) goto L_0x0081;
            r11 = r6.get();
            r11 = (defpackage.ajkr.d) r11;
            if (r11 == 0) goto L_0x0081;
            r6 = r11.a;
            r12 = r15.a;	 Catch:{ Throwable -> 0x0068 }
            r12 = defpackage.ajuu.a(r6, r12);	 Catch:{ Throwable -> 0x0068 }
            if (r12 == 0) goto L_0x0059;	 Catch:{ Throwable -> 0x0068 }
            r15.b = r2;	 Catch:{ Throwable -> 0x0068 }
            return;
            r12 = 1;
            r9 = r9 + r12;
            r3 = r3 - r12;
            r6 = r15.isDisposed();
            if (r6 == 0) goto L_0x0066;
            r15.b = r2;
            return;
            r6 = r11;
            goto L_0x0040;
            r0 = move-exception;
            defpackage.ajep.a(r0);
            r15.b = r2;
            r15.dispose();
            r1 = r6 instanceof defpackage.ajuu.b;
            if (r1 != 0) goto L_0x0080;
            r1 = defpackage.ajuu.a(r6);
            if (r1 != 0) goto L_0x0080;
            r15 = r15.a;
            r15.a(r0);
            return;
            r2 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1));
            if (r2 == 0) goto L_0x008c;
            r15.b = r6;
            if (r5 != 0) goto L_0x008c;
            defpackage.ajum.d(r15, r9);
            monitor-enter(r15);
            r2 = r15.e;	 Catch:{ all -> 0x009a }
            if (r2 != 0) goto L_0x0095;	 Catch:{ all -> 0x009a }
            r15.d = r0;	 Catch:{ all -> 0x009a }
            monitor-exit(r15);	 Catch:{ all -> 0x009a }
            return;	 Catch:{ all -> 0x009a }
            r15.e = r0;	 Catch:{ all -> 0x009a }
            monitor-exit(r15);	 Catch:{ all -> 0x009a }
            goto L_0x000d;	 Catch:{ all -> 0x009a }
            r0 = move-exception;	 Catch:{ all -> 0x009a }
            monitor-exit(r15);	 Catch:{ all -> 0x009a }
            throw r0;
            r0 = move-exception;
            monitor-exit(r15);	 Catch:{ all -> 0x009d }
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ajkr$a.a(ajkr$c):void");
        }

        public final void a(T t) {
            long j = this.c + 1;
            this.c = j;
            a(new d(t, j));
            b();
        }

        public final void a(Throwable th) {
            Object a = ajuu.a(th);
            long j = this.c + 1;
            this.c = j;
            a(new d(a, j));
            c();
        }

        /* Access modifiers changed, original: 0000 */
        public void b() {
        }
    }

    /* renamed from: ajkr$i */
    static final class i<T> extends a<T> {
        private int b;

        i(int i) {
            this.b = i;
        }

        /* Access modifiers changed, original: final */
        public final void b() {
            if (this.a > this.b) {
                d dVar = (d) ((d) get()).get();
                if (dVar != null) {
                    this.a--;
                    set(dVar);
                    return;
                }
                throw new IllegalStateException("Empty list!");
            }
        }
    }

    /* renamed from: ajkr$c */
    static final class c<T> extends AtomicLong implements ajej, akuy {
        final akux<? super T> a;
        Object b;
        final AtomicLong c = new AtomicLong();
        boolean d;
        boolean e;
        private h<T> f;

        c(h<T> hVar, akux<? super T> akux) {
            this.f = hVar;
            this.a = akux;
        }

        public final void a(long j) {
            if (ajui.b(j) && ajum.b(this, j) != Long.MIN_VALUE) {
                ajum.a(this.c, j);
                this.f.b();
                this.f.a.a(this);
            }
        }

        public final void b() {
            dispose();
        }

        public final void dispose() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f.a(this);
                this.f.b();
                this.b = null;
            }
        }

        public final boolean isDisposed() {
            return get() == Long.MIN_VALUE;
        }
    }

    /* renamed from: ajkr$j */
    static final class j<T> extends ArrayList<Object> implements e<T> {
        private volatile int a;

        j() {
            super(16);
        }

        public final void a() {
            add(ajuu.COMPLETE);
            this.a++;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:59:0x008a in {6, 12, 15, 16, 25, 28, 29, 35, 36, 41, 48, 51, 54, 58} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final void a(defpackage.ajkr.c<T> r15) {
            /*
            r14 = this;
            monitor-enter(r15);
            r0 = r15.d;	 Catch:{ all -> 0x0087 }
            r1 = 1;	 Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x000a;	 Catch:{ all -> 0x0087 }
            r15.e = r1;	 Catch:{ all -> 0x0087 }
            monitor-exit(r15);	 Catch:{ all -> 0x0087 }
            return;	 Catch:{ all -> 0x0087 }
            r15.d = r1;	 Catch:{ all -> 0x0087 }
            monitor-exit(r15);	 Catch:{ all -> 0x0087 }
            r0 = r15.a;
            r1 = r15.isDisposed();
            if (r1 == 0) goto L_0x0016;
            return;
            r1 = r14.a;
            r2 = r15.b;
            r2 = (java.lang.Integer) r2;
            r3 = 0;
            if (r2 == 0) goto L_0x0024;
            r2 = r2.intValue();
            goto L_0x0025;
            r2 = 0;
            r4 = r15.get();
            r6 = 0;
            r8 = r4;
            r10 = r6;
            r12 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1));
            if (r12 == 0) goto L_0x0061;
            if (r2 >= r1) goto L_0x0061;
            r12 = r14.get(r2);
            r12 = defpackage.ajuu.a(r12, r0);	 Catch:{ Throwable -> 0x004c }
            if (r12 == 0) goto L_0x003e;
            return;
            r12 = r15.isDisposed();
            if (r12 == 0) goto L_0x0045;
            return;
            r2 = r2 + 1;
            r12 = 1;
            r8 = r8 - r12;
            r10 = r10 + r12;
            goto L_0x002d;
            r1 = move-exception;
            defpackage.ajep.a(r1);
            r15.dispose();
            r15 = r12 instanceof defpackage.ajuu.b;
            if (r15 != 0) goto L_0x0060;
            r15 = defpackage.ajuu.a(r12);
            if (r15 != 0) goto L_0x0060;
            r0.a(r1);
            return;
            r1 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1));
            if (r1 == 0) goto L_0x0077;
            r1 = java.lang.Integer.valueOf(r2);
            r15.b = r1;
            r1 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
            r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1));
            if (r6 == 0) goto L_0x0077;
            defpackage.ajum.d(r15, r10);
            monitor-enter(r15);
            r1 = r15.e;	 Catch:{ all -> 0x0084 }
            if (r1 != 0) goto L_0x0080;	 Catch:{ all -> 0x0084 }
            r15.d = r3;	 Catch:{ all -> 0x0084 }
            monitor-exit(r15);	 Catch:{ all -> 0x0084 }
            return;	 Catch:{ all -> 0x0084 }
            r15.e = r3;	 Catch:{ all -> 0x0084 }
            monitor-exit(r15);	 Catch:{ all -> 0x0084 }
            goto L_0x000f;	 Catch:{ all -> 0x0084 }
            r0 = move-exception;	 Catch:{ all -> 0x0084 }
            monitor-exit(r15);	 Catch:{ all -> 0x0084 }
            throw r0;
            r0 = move-exception;
            monitor-exit(r15);	 Catch:{ all -> 0x0087 }
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ajkr$j.a(ajkr$c):void");
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

    static {
        b bVar = new b();
    }

    public ajkr(akuw<T> akuw, ajde<T> ajde, AtomicReference<h<T>> atomicReference, Callable<? extends e<T>> callable) {
        this.e = akuw;
        this.b = ajde;
        this.c = atomicReference;
        this.d = callable;
    }

    public final void a(ajej ajej) {
        this.c.compareAndSet((h) ajej, null);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:28:0x005f in {3, 8, 13, 14, 18, 19, 22, 24, 27} preds:[]
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
        r0 = (defpackage.ajkr.h) r0;
        if (r0 == 0) goto L_0x0010;
        r1 = r0.isDisposed();
        if (r1 == 0) goto L_0x0026;
        r1 = r4.d;	 Catch:{ Throwable -> 0x0056 }
        r1 = r1.call();	 Catch:{ Throwable -> 0x0056 }
        r1 = (defpackage.ajkr.e) r1;	 Catch:{ Throwable -> 0x0056 }
        r2 = new ajkr$h;
        r2.<init>(r1);
        r1 = r4.c;
        r0 = r1.compareAndSet(r0, r2);
        if (r0 == 0) goto L_0x0000;
        r0 = r2;
        r1 = r0.d;
        r1 = r1.get();
        r2 = 1;
        r3 = 0;
        if (r1 != 0) goto L_0x003a;
        r1 = r0.d;
        r1 = r1.compareAndSet(r3, r2);
        if (r1 == 0) goto L_0x003a;
        r1 = 1;
        goto L_0x003b;
        r1 = 0;
        r5.accept(r0);	 Catch:{ Throwable -> 0x0046 }
        if (r1 == 0) goto L_0x0045;
        r5 = r4.b;
        r5.a(r0);
        return;
        r5 = move-exception;
        if (r1 == 0) goto L_0x004e;
        r0 = r0.d;
        r0.compareAndSet(r2, r3);
        defpackage.ajep.a(r5);
        r5 = defpackage.ajur.a(r5);
        throw r5;
        r5 = move-exception;
        defpackage.ajep.a(r5);
        r5 = defpackage.ajur.a(r5);
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajkr.a(ajfb):void");
    }

    public final void a_(akux<? super T> akux) {
        this.e.a(akux);
    }
}
