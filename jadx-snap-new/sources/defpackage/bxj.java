package defpackage;

import android.os.Handler;
import defpackage.bxa.a;

/* renamed from: bxj */
public final class bxj implements bxa, bxw<Object> {
    private final Handler a;
    private a b;
    private final bzh c;
    private final byq d;
    private int e;
    private long f;
    private long g;
    private long h;
    private long i;
    private long j;

    public bxj() {
        this(byq.a);
    }

    private bxj(byq byq) {
        this.a = null;
        this.b = null;
        this.c = new bzh();
        this.d = byq;
        this.j = 1000000;
    }

    public final synchronized long a() {
        return this.j;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:52:0x0120 in {4, 5, 10, 13, 14, 22, 23, 27, 30, 36, 37, 40, 41, 42, 45, 48, 51} preds:[]
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
    public final synchronized void a(java.lang.Object r11) {
        /*
        r10 = this;
        monitor-enter(r10);
        r11 = r10.e;	 Catch:{ all -> 0x011d }
        r0 = 0;	 Catch:{ all -> 0x011d }
        r1 = 1;	 Catch:{ all -> 0x011d }
        if (r11 <= 0) goto L_0x0009;	 Catch:{ all -> 0x011d }
        r11 = 1;	 Catch:{ all -> 0x011d }
        goto L_0x000a;	 Catch:{ all -> 0x011d }
        r11 = 0;	 Catch:{ all -> 0x011d }
        defpackage.byo.b(r11);	 Catch:{ all -> 0x011d }
        r11 = r10.d;	 Catch:{ all -> 0x011d }
        r2 = r11.a();	 Catch:{ all -> 0x011d }
        r4 = r10.f;	 Catch:{ all -> 0x011d }
        r4 = r2 - r4;	 Catch:{ all -> 0x011d }
        r11 = (int) r4;	 Catch:{ all -> 0x011d }
        r4 = r10.h;	 Catch:{ all -> 0x011d }
        r6 = (long) r11;	 Catch:{ all -> 0x011d }
        r4 = r4 + r6;	 Catch:{ all -> 0x011d }
        r10.h = r4;	 Catch:{ all -> 0x011d }
        r4 = r10.i;	 Catch:{ all -> 0x011d }
        r8 = r10.g;	 Catch:{ all -> 0x011d }
        r4 = r4 + r8;	 Catch:{ all -> 0x011d }
        r10.i = r4;	 Catch:{ all -> 0x011d }
        if (r11 <= 0) goto L_0x010e;	 Catch:{ all -> 0x011d }
        r4 = r10.g;	 Catch:{ all -> 0x011d }
        r8 = 8000; // 0x1f40 float:1.121E-41 double:3.9525E-320;	 Catch:{ all -> 0x011d }
        r4 = r4 * r8;	 Catch:{ all -> 0x011d }
        r4 = r4 / r6;	 Catch:{ all -> 0x011d }
        r11 = (float) r4;	 Catch:{ all -> 0x011d }
        r4 = r10.c;	 Catch:{ all -> 0x011d }
        r5 = r10.g;	 Catch:{ all -> 0x011d }
        r5 = (double) r5;	 Catch:{ all -> 0x011d }
        r5 = java.lang.Math.sqrt(r5);	 Catch:{ all -> 0x011d }
        r5 = (int) r5;	 Catch:{ all -> 0x011d }
        r6 = r4.f;	 Catch:{ all -> 0x011d }
        if (r6 == r1) goto L_0x0045;	 Catch:{ all -> 0x011d }
        r6 = r4.d;	 Catch:{ all -> 0x011d }
        r7 = defpackage.bzh.a;	 Catch:{ all -> 0x011d }
        java.util.Collections.sort(r6, r7);	 Catch:{ all -> 0x011d }
        r4.f = r1;	 Catch:{ all -> 0x011d }
        r6 = r4.i;	 Catch:{ all -> 0x011d }
        if (r6 <= 0) goto L_0x0053;	 Catch:{ all -> 0x011d }
        r6 = r4.e;	 Catch:{ all -> 0x011d }
        r7 = r4.i;	 Catch:{ all -> 0x011d }
        r7 = r7 - r1;	 Catch:{ all -> 0x011d }
        r4.i = r7;	 Catch:{ all -> 0x011d }
        r6 = r6[r7];	 Catch:{ all -> 0x011d }
        goto L_0x0058;	 Catch:{ all -> 0x011d }
        r6 = new bzh$a;	 Catch:{ all -> 0x011d }
        r6.<init>(r0);	 Catch:{ all -> 0x011d }
        r7 = r4.g;	 Catch:{ all -> 0x011d }
        r8 = r7 + 1;	 Catch:{ all -> 0x011d }
        r4.g = r8;	 Catch:{ all -> 0x011d }
        r6.a = r7;	 Catch:{ all -> 0x011d }
        r6.b = r5;	 Catch:{ all -> 0x011d }
        r6.c = r11;	 Catch:{ all -> 0x011d }
        r11 = r4.d;	 Catch:{ all -> 0x011d }
        r11.add(r6);	 Catch:{ all -> 0x011d }
        r11 = r4.h;	 Catch:{ all -> 0x011d }
        r11 = r11 + r5;	 Catch:{ all -> 0x011d }
        r4.h = r11;	 Catch:{ all -> 0x011d }
        r11 = r4.h;	 Catch:{ all -> 0x011d }
        r5 = 2000; // 0x7d0 float:2.803E-42 double:9.88E-321;	 Catch:{ all -> 0x011d }
        if (r11 <= r5) goto L_0x00aa;	 Catch:{ all -> 0x011d }
        r11 = r4.h;	 Catch:{ all -> 0x011d }
        r11 = r11 - r5;	 Catch:{ all -> 0x011d }
        r5 = r4.d;	 Catch:{ all -> 0x011d }
        r5 = r5.get(r0);	 Catch:{ all -> 0x011d }
        r5 = (defpackage.bzh.a) r5;	 Catch:{ all -> 0x011d }
        r6 = r5.b;	 Catch:{ all -> 0x011d }
        if (r6 > r11) goto L_0x009f;	 Catch:{ all -> 0x011d }
        r11 = r4.h;	 Catch:{ all -> 0x011d }
        r6 = r5.b;	 Catch:{ all -> 0x011d }
        r11 = r11 - r6;	 Catch:{ all -> 0x011d }
        r4.h = r11;	 Catch:{ all -> 0x011d }
        r11 = r4.d;	 Catch:{ all -> 0x011d }
        r11.remove(r0);	 Catch:{ all -> 0x011d }
        r11 = r4.i;	 Catch:{ all -> 0x011d }
        r6 = 5;	 Catch:{ all -> 0x011d }
        if (r11 >= r6) goto L_0x006e;	 Catch:{ all -> 0x011d }
        r11 = r4.e;	 Catch:{ all -> 0x011d }
        r6 = r4.i;	 Catch:{ all -> 0x011d }
        r7 = r6 + 1;	 Catch:{ all -> 0x011d }
        r4.i = r7;	 Catch:{ all -> 0x011d }
        r11[r6] = r5;	 Catch:{ all -> 0x011d }
        goto L_0x006e;	 Catch:{ all -> 0x011d }
        r6 = r5.b;	 Catch:{ all -> 0x011d }
        r6 = r6 - r11;	 Catch:{ all -> 0x011d }
        r5.b = r6;	 Catch:{ all -> 0x011d }
        r5 = r4.h;	 Catch:{ all -> 0x011d }
        r5 = r5 - r11;	 Catch:{ all -> 0x011d }
        r4.h = r5;	 Catch:{ all -> 0x011d }
        goto L_0x006e;	 Catch:{ all -> 0x011d }
        r4 = r10.h;	 Catch:{ all -> 0x011d }
        r6 = 2000; // 0x7d0 float:2.803E-42 double:9.88E-321;	 Catch:{ all -> 0x011d }
        r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));	 Catch:{ all -> 0x011d }
        if (r11 >= 0) goto L_0x00bb;	 Catch:{ all -> 0x011d }
        r4 = r10.i;	 Catch:{ all -> 0x011d }
        r6 = 524288; // 0x80000 float:7.34684E-40 double:2.590327E-318;	 Catch:{ all -> 0x011d }
        r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));	 Catch:{ all -> 0x011d }
        if (r11 < 0) goto L_0x010e;	 Catch:{ all -> 0x011d }
        r11 = r10.c;	 Catch:{ all -> 0x011d }
        r4 = r11.f;	 Catch:{ all -> 0x011d }
        if (r4 == 0) goto L_0x00ca;	 Catch:{ all -> 0x011d }
        r4 = r11.d;	 Catch:{ all -> 0x011d }
        r5 = defpackage.bzh.b;	 Catch:{ all -> 0x011d }
        java.util.Collections.sort(r4, r5);	 Catch:{ all -> 0x011d }
        r11.f = r0;	 Catch:{ all -> 0x011d }
        r4 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;	 Catch:{ all -> 0x011d }
        r5 = r11.h;	 Catch:{ all -> 0x011d }
        r5 = (float) r5;	 Catch:{ all -> 0x011d }
        r5 = r5 * r4;	 Catch:{ all -> 0x011d }
        r4 = 0;	 Catch:{ all -> 0x011d }
        r6 = r11.d;	 Catch:{ all -> 0x011d }
        r6 = r6.size();	 Catch:{ all -> 0x011d }
        if (r0 >= r6) goto L_0x00ef;	 Catch:{ all -> 0x011d }
        r6 = r11.d;	 Catch:{ all -> 0x011d }
        r6 = r6.get(r0);	 Catch:{ all -> 0x011d }
        r6 = (defpackage.bzh.a) r6;	 Catch:{ all -> 0x011d }
        r7 = r6.b;	 Catch:{ all -> 0x011d }
        r4 = r4 + r7;	 Catch:{ all -> 0x011d }
        r7 = (float) r4;	 Catch:{ all -> 0x011d }
        r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1));	 Catch:{ all -> 0x011d }
        if (r7 < 0) goto L_0x00ec;	 Catch:{ all -> 0x011d }
        r11 = r6.c;	 Catch:{ all -> 0x011d }
        goto L_0x010b;	 Catch:{ all -> 0x011d }
        r0 = r0 + 1;	 Catch:{ all -> 0x011d }
        goto L_0x00d1;	 Catch:{ all -> 0x011d }
        r0 = r11.d;	 Catch:{ all -> 0x011d }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x011d }
        if (r0 == 0) goto L_0x00fa;	 Catch:{ all -> 0x011d }
        r11 = 2143289344; // 0x7fc00000 float:NaN double:1.058925634E-314;	 Catch:{ all -> 0x011d }
        goto L_0x010b;	 Catch:{ all -> 0x011d }
        r0 = r11.d;	 Catch:{ all -> 0x011d }
        r11 = r11.d;	 Catch:{ all -> 0x011d }
        r11 = r11.size();	 Catch:{ all -> 0x011d }
        r11 = r11 - r1;	 Catch:{ all -> 0x011d }
        r11 = r0.get(r11);	 Catch:{ all -> 0x011d }
        r11 = (defpackage.bzh.a) r11;	 Catch:{ all -> 0x011d }
        r11 = r11.c;	 Catch:{ all -> 0x011d }
        r4 = (long) r11;	 Catch:{ all -> 0x011d }
        r10.j = r4;	 Catch:{ all -> 0x011d }
        r11 = r10.e;	 Catch:{ all -> 0x011d }
        r11 = r11 - r1;	 Catch:{ all -> 0x011d }
        r10.e = r11;	 Catch:{ all -> 0x011d }
        if (r11 <= 0) goto L_0x0117;	 Catch:{ all -> 0x011d }
        r10.f = r2;	 Catch:{ all -> 0x011d }
        r0 = 0;	 Catch:{ all -> 0x011d }
        r10.g = r0;	 Catch:{ all -> 0x011d }
        monitor-exit(r10);
        return;
        r11 = move-exception;
        monitor-exit(r10);
        throw r11;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxj.a(java.lang.Object):void");
    }

    public final synchronized void a(Object obj, int i) {
        this.g += (long) i;
    }

    public final synchronized void a(Object obj, bxh bxh) {
        if (this.e == 0) {
            this.f = this.d.a();
        }
        this.e++;
    }
}
