package defpackage;

import defpackage.ajuu.b;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajkm */
public final class ajkm<T> extends ajeu<T> {
    private ajde<T> b;
    private AtomicReference<c<T>> c;
    private int d;
    private akuw<T> e;

    /* renamed from: ajkm$a */
    public static final class a<T> implements akuw<T> {
        private final AtomicReference<c<T>> a;
        private final int b;

        public a(AtomicReference<c<T>> atomicReference, int i) {
            this.a = atomicReference;
            this.b = i;
        }

        public final void a(akux<? super T> akux) {
            c cVar;
            b bVar = new b(akux);
            akux.a((akuy) bVar);
            while (true) {
                int i;
                cVar = (c) this.a.get();
                if (cVar == null || cVar.isDisposed()) {
                    c cVar2 = new c(this.a, this.b);
                    if (this.a.compareAndSet(cVar, cVar2)) {
                        cVar = cVar2;
                    } else {
                        continue;
                    }
                }
                b[] bVarArr;
                b[] bVarArr2;
                do {
                    bVarArr = (b[]) cVar.b.get();
                    i = 0;
                    if (bVarArr == c.a) {
                        break;
                    }
                    int length = bVarArr.length;
                    bVarArr2 = new b[(length + 1)];
                    System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                    bVarArr2[length] = bVar;
                } while (!cVar.b.compareAndSet(bVarArr, bVarArr2));
                i = 1;
                if (i != 0) {
                    break;
                }
            }
            if (bVar.get() == Long.MIN_VALUE) {
                cVar.a(bVar);
            } else {
                bVar.b = cVar;
            }
            cVar.b();
        }
    }

    /* renamed from: ajkm$b */
    static final class b<T> extends AtomicLong implements akuy {
        final akux<? super T> a;
        volatile c<T> b;
        long c;

        b(akux<? super T> akux) {
            this.a = akux;
        }

        public final void a(long j) {
            if (ajui.b(j)) {
                ajum.b(this, j);
                c cVar = this.b;
                if (cVar != null) {
                    cVar.b();
                }
            }
        }

        public final void b() {
            if (get() != Long.MIN_VALUE && getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                c cVar = this.b;
                if (cVar != null) {
                    cVar.a(this);
                    cVar.b();
                }
            }
        }
    }

    /* renamed from: ajkm$c */
    static final class c<T> extends AtomicInteger implements ajdh<T>, ajej {
        static final b[] a = new b[0];
        private static b[] d = new b[0];
        final AtomicReference<b<T>[]> b = new AtomicReference(d);
        final AtomicBoolean c;
        private AtomicReference<c<T>> e;
        private int f;
        private AtomicReference<akuy> g = new AtomicReference();
        private volatile Object h;
        private int i;
        private volatile ajgf<T> j;

        c(AtomicReference<c<T>> atomicReference, int i) {
            this.e = atomicReference;
            this.c = new AtomicBoolean();
            this.f = i;
        }

        private boolean a(Object obj, boolean z) {
            int i = 0;
            if (obj != null) {
                if (!ajuu.a(obj)) {
                    Throwable th = ((b) obj).a;
                    this.e.compareAndSet(this, null);
                    b[] bVarArr = (b[]) this.b.getAndSet(a);
                    if (bVarArr.length != 0) {
                        int length = bVarArr.length;
                        while (i < length) {
                            bVarArr[i].a.a(th);
                            i++;
                        }
                    } else {
                        ajvo.a(th);
                    }
                    return true;
                } else if (z) {
                    this.e.compareAndSet(this, null);
                    b[] bVarArr2 = (b[]) this.b.getAndSet(a);
                    int length2 = bVarArr2.length;
                    while (i < length2) {
                        bVarArr2[i].a.a();
                        i++;
                    }
                    return true;
                }
            }
            return false;
        }

        public final void a() {
            if (this.h == null) {
                this.h = ajuu.COMPLETE;
                b();
            }
        }

        /* Access modifiers changed, original: final */
        public final void a(b<T> bVar) {
            b[] bVarArr;
            Object obj;
            do {
                bVarArr = (b[]) this.b.get();
                int length = bVarArr.length;
                if (length == 0) {
                    break;
                }
                int i = -1;
                for (int i2 = 0; i2 < length; i2++) {
                    if (bVarArr[i2].equals(bVar)) {
                        i = i2;
                        break;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        obj = d;
                    } else {
                        Object obj2 = new b[(length - 1)];
                        System.arraycopy(bVarArr, 0, obj2, 0, i);
                        System.arraycopy(bVarArr, i + 1, obj2, i, (length - i) - 1);
                        obj = obj2;
                    }
                } else {
                    return;
                }
            } while (!this.b.compareAndSet(bVarArr, obj));
        }

        public final void a(akuy akuy) {
            if (ajui.a(this.g, akuy)) {
                if (akuy instanceof ajgc) {
                    ajgc ajgc = (ajgc) akuy;
                    int a = ajgc.a(7);
                    if (a == 1) {
                        this.i = a;
                        this.j = ajgc;
                        this.h = ajuu.COMPLETE;
                        b();
                        return;
                    } else if (a == 2) {
                        this.i = a;
                        this.j = ajgc;
                        akuy.a((long) this.f);
                        return;
                    }
                }
                this.j = new ajta(this.f);
                akuy.a((long) this.f);
            }
        }

        public final void a(T t) {
            if (this.i != 0 || this.j.offer(t)) {
                b();
            } else {
                a(new ajeq("Prefetch queue is full?!"));
            }
        }

        public final void a(Throwable th) {
            if (this.h == null) {
                this.h = ajuu.a(th);
                b();
                return;
            }
            ajvo.a(th);
        }

        /* Access modifiers changed, original: final */
        /* JADX WARNING: Missing block: B:73:0x0134, code skipped:
            r4 = r0;
     */
        public final void b() {
            /*
            r25 = this;
            r1 = r25;
            r0 = r25.getAndIncrement();
            if (r0 == 0) goto L_0x0009;
        L_0x0008:
            return;
        L_0x0009:
            r2 = r1.b;
            r0 = r2.get();
            r0 = (defpackage.ajkm.b[]) r0;
            r3 = 1;
            r4 = r0;
            r5 = 1;
        L_0x0014:
            r0 = r1.h;
            r6 = r1.j;
            if (r6 == 0) goto L_0x0023;
        L_0x001a:
            r8 = r6.isEmpty();
            if (r8 == 0) goto L_0x0021;
        L_0x0020:
            goto L_0x0023;
        L_0x0021:
            r8 = 0;
            goto L_0x0024;
        L_0x0023:
            r8 = 1;
        L_0x0024:
            r0 = r1.a(r0, r8);
            if (r0 == 0) goto L_0x002b;
        L_0x002a:
            return;
        L_0x002b:
            if (r8 != 0) goto L_0x0157;
        L_0x002d:
            r0 = r4.length;
            r9 = r4.length;
            r12 = 0;
            r13 = 0;
            r14 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        L_0x0036:
            r16 = -9223372036854775808;
            if (r12 >= r9) goto L_0x0053;
        L_0x003a:
            r7 = r4[r12];
            r18 = r7.get();
            r20 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1));
            if (r20 == 0) goto L_0x004e;
        L_0x0044:
            r10 = r7.c;
            r10 = r18 - r10;
            r10 = java.lang.Math.min(r14, r10);
            r14 = r10;
            goto L_0x0050;
        L_0x004e:
            r13 = r13 + 1;
        L_0x0050:
            r12 = r12 + 1;
            goto L_0x0036;
        L_0x0053:
            r9 = 1;
            if (r0 != r13) goto L_0x0093;
        L_0x0057:
            r0 = r1.h;
            r7 = r6.poll();	 Catch:{ Throwable -> 0x005e }
            goto L_0x0075;
        L_0x005e:
            r0 = move-exception;
            r6 = r0;
            defpackage.ajep.a(r6);
            r0 = r1.g;
            r0 = r0.get();
            r0 = (defpackage.akuy) r0;
            r0.b();
            r0 = defpackage.ajuu.a(r6);
            r1.h = r0;
            r7 = 0;
        L_0x0075:
            if (r7 != 0) goto L_0x0079;
        L_0x0077:
            r6 = 1;
            goto L_0x007a;
        L_0x0079:
            r6 = 0;
        L_0x007a:
            r0 = r1.a(r0, r6);
            if (r0 == 0) goto L_0x0081;
        L_0x0080:
            return;
        L_0x0081:
            r0 = r1.i;
            if (r0 == r3) goto L_0x0090;
        L_0x0085:
            r0 = r1.g;
            r0 = r0.get();
            r0 = (defpackage.akuy) r0;
            r0.a(r9);
        L_0x0090:
            r6 = 1;
            goto L_0x0166;
        L_0x0093:
            r0 = r8;
            r8 = 0;
        L_0x0095:
            r11 = (long) r8;
            r13 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1));
            if (r13 >= 0) goto L_0x013a;
        L_0x009a:
            r0 = r1.h;
            r13 = r6.poll();	 Catch:{ Throwable -> 0x00a1 }
            goto L_0x00b8;
        L_0x00a1:
            r0 = move-exception;
            r13 = r0;
            defpackage.ajep.a(r13);
            r0 = r1.g;
            r0 = r0.get();
            r0 = (defpackage.akuy) r0;
            r0.b();
            r0 = defpackage.ajuu.a(r13);
            r1.h = r0;
            r13 = 0;
        L_0x00b8:
            if (r13 != 0) goto L_0x00bc;
        L_0x00ba:
            r7 = 1;
            goto L_0x00bd;
        L_0x00bc:
            r7 = 0;
        L_0x00bd:
            r0 = r1.a(r0, r7);
            if (r0 == 0) goto L_0x00c4;
        L_0x00c3:
            return;
        L_0x00c4:
            if (r7 != 0) goto L_0x0136;
        L_0x00c6:
            r0 = r4.length;
            r11 = 0;
            r12 = 0;
        L_0x00c9:
            if (r11 >= r0) goto L_0x0104;
        L_0x00cb:
            r3 = r4[r11];
            r22 = r3.get();
            r24 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1));
            if (r24 == 0) goto L_0x00f2;
        L_0x00d5:
            r20 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
            r24 = (r22 > r20 ? 1 : (r22 == r20 ? 0 : -1));
            if (r24 == 0) goto L_0x00e8;
        L_0x00de:
            r22 = r6;
            r23 = r7;
            r6 = r3.c;
            r6 = r6 + r9;
            r3.c = r6;
            goto L_0x00ec;
        L_0x00e8:
            r22 = r6;
            r23 = r7;
        L_0x00ec:
            r3 = r3.a;
            r3.a(r13);
            goto L_0x00fc;
        L_0x00f2:
            r22 = r6;
            r23 = r7;
            r20 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
            r12 = 1;
        L_0x00fc:
            r11 = r11 + 1;
            r6 = r22;
            r7 = r23;
            r3 = 1;
            goto L_0x00c9;
        L_0x0104:
            r22 = r6;
            r23 = r7;
            r20 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
            r8 = r8 + 1;
            r0 = r2.get();
            r0 = (defpackage.ajkm.b[]) r0;
            if (r12 != 0) goto L_0x0121;
        L_0x0117:
            if (r0 == r4) goto L_0x011a;
        L_0x0119:
            goto L_0x0121;
        L_0x011a:
            r6 = r22;
            r0 = r23;
            r3 = 1;
            goto L_0x0095;
        L_0x0121:
            if (r8 == 0) goto L_0x0134;
        L_0x0123:
            r3 = r1.i;
            r4 = 1;
            if (r3 == r4) goto L_0x0134;
        L_0x0128:
            r3 = r1.g;
            r3 = r3.get();
            r3 = (defpackage.akuy) r3;
            r6 = (long) r8;
            r3.a(r6);
        L_0x0134:
            r4 = r0;
            goto L_0x0166;
        L_0x0136:
            r23 = r7;
            r0 = r23;
        L_0x013a:
            if (r8 == 0) goto L_0x014d;
        L_0x013c:
            r3 = r1.i;
            r6 = 1;
            if (r3 == r6) goto L_0x014e;
        L_0x0141:
            r3 = r1.g;
            r3 = r3.get();
            r3 = (defpackage.akuy) r3;
            r3.a(r11);
            goto L_0x014e;
        L_0x014d:
            r6 = 1;
        L_0x014e:
            r7 = 0;
            r3 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1));
            if (r3 == 0) goto L_0x0158;
        L_0x0154:
            if (r0 == 0) goto L_0x0166;
        L_0x0156:
            goto L_0x0158;
        L_0x0157:
            r6 = 1;
        L_0x0158:
            r0 = -r5;
            r5 = r1.addAndGet(r0);
            if (r5 == 0) goto L_0x0169;
        L_0x015f:
            r0 = r2.get();
            r4 = r0;
            r4 = (defpackage.ajkm.b[]) r4;
        L_0x0166:
            r3 = 1;
            goto L_0x0014;
        L_0x0169:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ajkm$c.b():void");
        }

        public final void dispose() {
            Object obj = this.b.get();
            Object obj2 = a;
            if (obj != obj2 && ((b[]) this.b.getAndSet(obj2)) != a) {
                this.e.compareAndSet(this, null);
                ajui.a(this.g);
            }
        }

        public final boolean isDisposed() {
            return this.b.get() == a;
        }
    }

    public ajkm(akuw<T> akuw, ajde<T> ajde, AtomicReference<c<T>> atomicReference, int i) {
        this.e = akuw;
        this.b = ajde;
        this.c = atomicReference;
        this.d = i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:21:0x004a in {3, 6, 11, 12, 16, 17, 20} preds:[]
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
        r0 = (defpackage.ajkm.c) r0;
        if (r0 == 0) goto L_0x0010;
        r1 = r0.isDisposed();
        if (r1 == 0) goto L_0x0022;
        r1 = new ajkm$c;
        r2 = r4.c;
        r3 = r4.d;
        r1.<init>(r2, r3);
        r2 = r4.c;
        r0 = r2.compareAndSet(r0, r1);
        if (r0 == 0) goto L_0x0000;
        r0 = r1;
        r1 = r0.c;
        r1 = r1.get();
        r2 = 1;
        r3 = 0;
        if (r1 != 0) goto L_0x0035;
        r1 = r0.c;
        r1 = r1.compareAndSet(r3, r2);
        if (r1 == 0) goto L_0x0035;
        goto L_0x0036;
        r2 = 0;
        r5.accept(r0);	 Catch:{ Throwable -> 0x0041 }
        if (r2 == 0) goto L_0x0040;
        r5 = r4.b;
        r5.a(r0);
        return;
        r5 = move-exception;
        defpackage.ajep.a(r5);
        r5 = defpackage.ajur.a(r5);
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajkm.a(ajfb):void");
    }

    public final void a_(akux<? super T> akux) {
        this.e.a(akux);
    }
}
