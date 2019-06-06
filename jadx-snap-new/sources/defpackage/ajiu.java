package defpackage;

import defpackage.ajkc.b;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajiu */
public final class ajiu<T, R> extends ajde<R> {
    final ajfc<? super Object[], ? extends R> b;
    private akuw<? extends T>[] c;
    private Iterable<? extends akuw<? extends T>> d;
    private int e;
    private boolean f;

    /* renamed from: ajiu$a */
    static final class a<T, R> extends ajuc<R> {
        final b<T>[] a;
        final boolean b;
        volatile boolean c;
        volatile boolean d;
        final AtomicReference<Throwable> e;
        private akux<? super R> f;
        private ajfc<? super Object[], ? extends R> g;
        private ajtb<Object> h;
        private Object[] i;
        private boolean j;
        private int k;
        private int l;
        private AtomicLong m;

        a(akux<? super R> akux, ajfc<? super Object[], ? extends R> ajfc, int i, int i2, boolean z) {
            this.f = akux;
            this.g = ajfc;
            b[] bVarArr = new b[i];
            for (int i3 = 0; i3 < i; i3++) {
                bVarArr[i3] = new b(this, i3, i2);
            }
            this.a = bVarArr;
            this.i = new Object[i];
            this.h = new ajtb(i2);
            this.m = new AtomicLong();
            this.e = new AtomicReference();
            this.b = false;
        }

        private boolean a(boolean z, boolean z2, akux<?> akux, ajtb<?> ajtb) {
            if (this.c) {
                c();
                ajtb.clear();
                return true;
            }
            if (z) {
                Throwable a;
                if (!this.b) {
                    a = ajur.a(this.e);
                    if (a != null && a != ajur.a) {
                        c();
                        ajtb.clear();
                        akux.a(a);
                        return true;
                    } else if (z2) {
                        c();
                        akux.a();
                        return true;
                    }
                } else if (z2) {
                    c();
                    a = ajur.a(this.e);
                    if (a == null || a == ajur.a) {
                        akux.a();
                    } else {
                        akux.a(a);
                    }
                    return true;
                }
            }
            return false;
        }

        private void d() {
            akux akux = this.f;
            ajtb ajtb = this.h;
            int i = 1;
            while (!this.c) {
                Throwable th = (Throwable) this.e.get();
                if (th != null) {
                    ajtb.clear();
                    akux.a(th);
                    return;
                }
                boolean z = this.d;
                boolean isEmpty = ajtb.isEmpty();
                if (!isEmpty) {
                    akux.a(null);
                }
                if (z && isEmpty) {
                    akux.a();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
            ajtb.clear();
        }

        private void e() {
            akux akux = this.f;
            ajtb ajtb = this.h;
            int i = 1;
            do {
                long j = this.m.get();
                long j2 = 0;
                while (j2 != j) {
                    boolean z = this.d;
                    Object poll = ajtb.poll();
                    boolean z2 = poll == null;
                    if (!a(z, z2, akux, ajtb)) {
                        if (z2) {
                            break;
                        }
                        try {
                            akux.a(ajfv.a(this.g.apply((Object[]) ajtb.poll()), "The combiner returned a null value"));
                            ((b) poll).b();
                            j2++;
                        } catch (Throwable th) {
                            ajep.a(th);
                            c();
                            ajur.a(this.e, th);
                            akux.a(ajur.a(this.e));
                            return;
                        }
                    }
                    return;
                }
                if (j2 != j || !a(this.d, ajtb.isEmpty(), akux, ajtb)) {
                    if (!(j2 == 0 || j == Long.MAX_VALUE)) {
                        this.m.addAndGet(-j2);
                    }
                    i = addAndGet(-i);
                } else {
                    return;
                }
            } while (i != 0);
        }

        public final int a(int i) {
            boolean z = false;
            if ((i & 4) != 0) {
                return 0;
            }
            i &= 2;
            if (i != 0) {
                z = true;
            }
            this.j = z;
            return i;
        }

        /* Access modifiers changed, original: final */
        public final void a() {
            if (getAndIncrement() == 0) {
                if (this.j) {
                    d();
                } else {
                    e();
                }
            }
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:24:0x0074 in {4, 9, 11, 12, 13, 17, 19, 23} preds:[]
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
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        final void a(int r11, T r12) {
            /*
            r10 = this;
            monitor-enter(r10);
            r0 = r10.i;	 Catch:{ all -> 0x0071 }
            r1 = r10.k;	 Catch:{ all -> 0x0071 }
            r2 = r0[r11];	 Catch:{ all -> 0x0071 }
            if (r2 != 0) goto L_0x000d;	 Catch:{ all -> 0x0071 }
            r1 = r1 + 1;	 Catch:{ all -> 0x0071 }
            r10.k = r1;	 Catch:{ all -> 0x0071 }
            r0[r11] = r12;	 Catch:{ all -> 0x0071 }
            r12 = r0.length;	 Catch:{ all -> 0x0071 }
            if (r12 != r1) goto L_0x0061;	 Catch:{ all -> 0x0071 }
            r12 = r10.h;	 Catch:{ all -> 0x0071 }
            r1 = r10.a;	 Catch:{ all -> 0x0071 }
            r1 = r1[r11];	 Catch:{ all -> 0x0071 }
            r0 = r0.clone();	 Catch:{ all -> 0x0071 }
            r2 = r12.c;	 Catch:{ all -> 0x0071 }
            r3 = r12.a;	 Catch:{ all -> 0x0071 }
            r3 = r3.get();	 Catch:{ all -> 0x0071 }
            r5 = r12.b;	 Catch:{ all -> 0x0071 }
            r6 = 2;	 Catch:{ all -> 0x0071 }
            r6 = r6 + r3;	 Catch:{ all -> 0x0071 }
            r8 = (int) r6;	 Catch:{ all -> 0x0071 }
            r8 = r8 & r5;	 Catch:{ all -> 0x0071 }
            r8 = r2.get(r8);	 Catch:{ all -> 0x0071 }
            if (r8 != 0) goto L_0x0040;	 Catch:{ all -> 0x0071 }
            r4 = (int) r3;	 Catch:{ all -> 0x0071 }
            r3 = r4 & r5;	 Catch:{ all -> 0x0071 }
            r4 = r3 + 1;	 Catch:{ all -> 0x0071 }
            r2.lazySet(r4, r0);	 Catch:{ all -> 0x0071 }
            r2.lazySet(r3, r1);	 Catch:{ all -> 0x0071 }
            r12.a(r6);	 Catch:{ all -> 0x0071 }
            goto L_0x005f;	 Catch:{ all -> 0x0071 }
            r8 = r2.length();	 Catch:{ all -> 0x0071 }
            r9 = new java.util.concurrent.atomic.AtomicReferenceArray;	 Catch:{ all -> 0x0071 }
            r9.<init>(r8);	 Catch:{ all -> 0x0071 }
            r12.c = r9;	 Catch:{ all -> 0x0071 }
            r4 = (int) r3;	 Catch:{ all -> 0x0071 }
            r3 = r4 & r5;	 Catch:{ all -> 0x0071 }
            r4 = r3 + 1;	 Catch:{ all -> 0x0071 }
            r9.lazySet(r4, r0);	 Catch:{ all -> 0x0071 }
            r9.lazySet(r3, r1);	 Catch:{ all -> 0x0071 }
            defpackage.ajtb.a(r2, r9);	 Catch:{ all -> 0x0071 }
            r0 = defpackage.ajtb.d;	 Catch:{ all -> 0x0071 }
            r2.lazySet(r3, r0);	 Catch:{ all -> 0x0071 }
            goto L_0x003c;	 Catch:{ all -> 0x0071 }
            r12 = 0;	 Catch:{ all -> 0x0071 }
            goto L_0x0062;	 Catch:{ all -> 0x0071 }
            r12 = 1;	 Catch:{ all -> 0x0071 }
            monitor-exit(r10);	 Catch:{ all -> 0x0071 }
            if (r12 == 0) goto L_0x006d;
            r12 = r10.a;
            r11 = r12[r11];
            r11.b();
            return;
            r10.a();
            return;
            r11 = move-exception;
            monitor-exit(r10);	 Catch:{ all -> 0x0071 }
            throw r11;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ajiu$a.a(int, java.lang.Object):void");
        }

        public final void a(long j) {
            if (ajui.b(j)) {
                ajum.a(this.m, j);
                a();
            }
        }

        public final void b() {
            this.c = true;
            c();
        }

        /* Access modifiers changed, original: final */
        public final void b(int i) {
            synchronized (this) {
                Object[] objArr = this.i;
                if (objArr[i] != null) {
                    i = this.l + 1;
                    if (i != objArr.length) {
                        this.l = i;
                        return;
                    }
                }
                this.d = true;
                a();
            }
        }

        /* Access modifiers changed, original: final */
        public final void c() {
            for (AtomicReference a : this.a) {
                ajui.a(a);
            }
        }

        public final void clear() {
            this.h.clear();
        }

        public final boolean isEmpty() {
            return this.h.isEmpty();
        }

        public final R poll() {
            Object poll = this.h.poll();
            if (poll == null) {
                return null;
            }
            Object a = ajfv.a(this.g.apply((Object[]) this.h.poll()), "The combiner returned a null value");
            ((b) poll).b();
            return a;
        }
    }

    /* renamed from: ajiu$b */
    static final class b<T> extends AtomicReference<akuy> implements ajdh<T> {
        private a<T, ?> a;
        private int b;
        private int c;
        private int d;
        private int e;

        b(a<T, ?> aVar, int i, int i2) {
            this.a = aVar;
            this.b = i;
            this.c = i2;
            this.d = i2 - (i2 >> 2);
        }

        public final void a() {
            this.a.b(this.b);
        }

        public final void a(akuy akuy) {
            ajui.a((AtomicReference) this, akuy, (long) this.c);
        }

        public final void a(T t) {
            this.a.a(this.b, t);
        }

        public final void a(Throwable th) {
            a aVar = this.a;
            int i = this.b;
            if (!ajur.a(aVar.e, th)) {
                ajvo.a(th);
            } else if (aVar.b) {
                aVar.b(i);
            } else {
                aVar.c();
                aVar.d = true;
                aVar.a();
            }
        }

        public final void b() {
            int i = this.e + 1;
            if (i == this.d) {
                this.e = 0;
                ((akuy) get()).a((long) i);
                return;
            }
            this.e = i;
        }
    }

    /* renamed from: ajiu$c */
    final class c implements ajfc<T, R> {
        c() {
        }

        public final R apply(T t) {
            return ajiu.this.b.apply(new Object[]{t});
        }
    }

    public ajiu(Iterable<? extends akuw<? extends T>> iterable, ajfc<? super Object[], ? extends R> ajfc, int i) {
        this.c = null;
        this.d = iterable;
        this.b = ajfc;
        this.e = i;
        this.f = false;
    }

    public ajiu(akuw<? extends T>[] akuwArr, ajfc<? super Object[], ? extends R> ajfc, int i) {
        this.c = akuwArr;
        this.d = null;
        this.b = ajfc;
        this.e = i;
        this.f = false;
    }

    public final void a_(akux<? super R> akux) {
        int i;
        Object obj = this.c;
        int i2 = 0;
        if (obj == null) {
            obj = new akuw[8];
            try {
                Iterator it = (Iterator) ajfv.a(this.d.iterator(), "The iterator returned is null");
                i = 0;
                while (it.hasNext()) {
                    try {
                        try {
                            akuw akuw = (akuw) ajfv.a(it.next(), "The publisher returned by the iterator is null");
                            if (i == obj.length) {
                                Object obj2 = new akuw[((i >> 2) + i)];
                                System.arraycopy(obj, 0, obj2, 0, i);
                                obj = obj2;
                            }
                            int i3 = i + 1;
                            obj[i] = akuw;
                            i = i3;
                        } catch (Throwable th) {
                            ajep.a(th);
                            ajuf.a(th, akux);
                            return;
                        }
                    } catch (Throwable th2) {
                        ajep.a(th2);
                        ajuf.a(th2, akux);
                        return;
                    }
                }
            } catch (Throwable th22) {
                ajep.a(th22);
                ajuf.a(th22, akux);
                return;
            }
        }
        i = obj.length;
        if (i == 0) {
            ajuf.a((akux) akux);
        } else if (i == 1) {
            obj[0].a(new b(akux, new c()));
        } else {
            akuy aVar = new a(akux, this.b, i, this.e, false);
            akux.a(aVar);
            b[] bVarArr = aVar.a;
            while (i2 < i && !aVar.d && !aVar.c) {
                obj[i2].a(bVarArr[i2]);
                i2++;
            }
        }
    }
}
