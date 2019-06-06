package defpackage;

import java.util.Arrays;
import org.opencv.imgproc.Imgproc;

/* renamed from: bxi */
public final class bxi implements bwy {
    private final boolean a;
    private final int b;
    private final byte[] c;
    private final bwx[] d;
    private int e;
    private int f;
    private int g;
    private bwx[] h;

    public bxi() {
        this((byte) 0);
    }

    private bxi(byte b) {
        byo.a(true);
        byo.a(true);
        this.a = true;
        this.b = Imgproc.FLOODFILL_FIXED_RANGE;
        this.g = 0;
        this.h = new bwx[100];
        this.c = null;
        this.d = new bwx[1];
    }

    public final synchronized bwx a() {
        bwx bwx;
        this.f++;
        if (this.g > 0) {
            bwx[] bwxArr = this.h;
            int i = this.g - 1;
            this.g = i;
            bwx = bwxArr[i];
            this.h[this.g] = null;
        } else {
            bwx = new bwx(new byte[Imgproc.FLOODFILL_FIXED_RANGE]);
        }
        return bwx;
    }

    public final synchronized void a(int i) {
        Object obj = i < this.e ? 1 : null;
        this.e = i;
        if (obj != null) {
            b();
        }
    }

    public final synchronized void a(bwx bwx) {
        this.d[0] = bwx;
        a(this.d);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:21:0x0085 in {4, 11, 13, 14, 17, 20} preds:[]
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
    public final synchronized void a(defpackage.bwx[] r7) {
        /*
        r6 = this;
        monitor-enter(r6);
        r0 = r6.g;	 Catch:{ all -> 0x0082 }
        r1 = r7.length;	 Catch:{ all -> 0x0082 }
        r0 = r0 + r1;	 Catch:{ all -> 0x0082 }
        r1 = r6.h;	 Catch:{ all -> 0x0082 }
        r1 = r1.length;	 Catch:{ all -> 0x0082 }
        if (r0 < r1) goto L_0x0021;	 Catch:{ all -> 0x0082 }
        r0 = r6.h;	 Catch:{ all -> 0x0082 }
        r1 = r6.h;	 Catch:{ all -> 0x0082 }
        r1 = r1.length;	 Catch:{ all -> 0x0082 }
        r1 = r1 << 1;	 Catch:{ all -> 0x0082 }
        r2 = r6.g;	 Catch:{ all -> 0x0082 }
        r3 = r7.length;	 Catch:{ all -> 0x0082 }
        r2 = r2 + r3;	 Catch:{ all -> 0x0082 }
        r1 = java.lang.Math.max(r1, r2);	 Catch:{ all -> 0x0082 }
        r0 = java.util.Arrays.copyOf(r0, r1);	 Catch:{ all -> 0x0082 }
        r0 = (defpackage.bwx[]) r0;	 Catch:{ all -> 0x0082 }
        r6.h = r0;	 Catch:{ all -> 0x0082 }
        r0 = r7.length;	 Catch:{ all -> 0x0082 }
        r1 = 0;	 Catch:{ all -> 0x0082 }
        if (r1 >= r0) goto L_0x0077;	 Catch:{ all -> 0x0082 }
        r2 = r7[r1];	 Catch:{ all -> 0x0082 }
        r3 = r2.a;	 Catch:{ all -> 0x0082 }
        if (r3 == 0) goto L_0x006a;	 Catch:{ all -> 0x0082 }
        r3 = r2.a;	 Catch:{ all -> 0x0082 }
        r3 = r3.length;	 Catch:{ all -> 0x0082 }
        r4 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;	 Catch:{ all -> 0x0082 }
        if (r3 != r4) goto L_0x0033;	 Catch:{ all -> 0x0082 }
        goto L_0x006a;	 Catch:{ all -> 0x0082 }
        r7 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x0082 }
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0082 }
        r1 = "Unexpected allocation: ";	 Catch:{ all -> 0x0082 }
        r0.<init>(r1);	 Catch:{ all -> 0x0082 }
        r1 = r2.a;	 Catch:{ all -> 0x0082 }
        r1 = java.lang.System.identityHashCode(r1);	 Catch:{ all -> 0x0082 }
        r0.append(r1);	 Catch:{ all -> 0x0082 }
        r1 = ", ";	 Catch:{ all -> 0x0082 }
        r0.append(r1);	 Catch:{ all -> 0x0082 }
        r1 = 0;	 Catch:{ all -> 0x0082 }
        r1 = java.lang.System.identityHashCode(r1);	 Catch:{ all -> 0x0082 }
        r0.append(r1);	 Catch:{ all -> 0x0082 }
        r1 = ", ";	 Catch:{ all -> 0x0082 }
        r0.append(r1);	 Catch:{ all -> 0x0082 }
        r1 = r2.a;	 Catch:{ all -> 0x0082 }
        r1 = r1.length;	 Catch:{ all -> 0x0082 }
        r0.append(r1);	 Catch:{ all -> 0x0082 }
        r1 = ", 65536";	 Catch:{ all -> 0x0082 }
        r0.append(r1);	 Catch:{ all -> 0x0082 }
        r0 = r0.toString();	 Catch:{ all -> 0x0082 }
        r7.<init>(r0);	 Catch:{ all -> 0x0082 }
        throw r7;	 Catch:{ all -> 0x0082 }
        r3 = r6.h;	 Catch:{ all -> 0x0082 }
        r4 = r6.g;	 Catch:{ all -> 0x0082 }
        r5 = r4 + 1;	 Catch:{ all -> 0x0082 }
        r6.g = r5;	 Catch:{ all -> 0x0082 }
        r3[r4] = r2;	 Catch:{ all -> 0x0082 }
        r1 = r1 + 1;	 Catch:{ all -> 0x0082 }
        goto L_0x0023;	 Catch:{ all -> 0x0082 }
        r0 = r6.f;	 Catch:{ all -> 0x0082 }
        r7 = r7.length;	 Catch:{ all -> 0x0082 }
        r0 = r0 - r7;	 Catch:{ all -> 0x0082 }
        r6.f = r0;	 Catch:{ all -> 0x0082 }
        r6.notifyAll();	 Catch:{ all -> 0x0082 }
        monitor-exit(r6);
        return;
        r7 = move-exception;
        monitor-exit(r6);
        throw r7;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxi.a(bwx[]):void");
    }

    public final synchronized void b() {
        int max = Math.max(0, (((this.e + Imgproc.FLOODFILL_FIXED_RANGE) - 1) / Imgproc.FLOODFILL_FIXED_RANGE) - this.f);
        if (max < this.g) {
            Arrays.fill(this.h, max, this.g, null);
            this.g = max;
        }
    }

    public final int c() {
        return Imgproc.FLOODFILL_FIXED_RANGE;
    }

    public final synchronized void d() {
        a(0);
    }

    public final synchronized int e() {
        return this.f << 16;
    }
}
