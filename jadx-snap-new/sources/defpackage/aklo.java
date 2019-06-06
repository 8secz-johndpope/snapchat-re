package defpackage;

import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import org.opencv.imgproc.Imgproc;

/* renamed from: aklo */
public final class aklo extends OutputStream {
    private static final byte[] a = new byte[0];
    private final List<byte[]> b;
    private int c;
    private int d;
    private byte[] e;
    private int f;
    private boolean g;

    public aklo() {
        this(Imgproc.INTER_TAB_SIZE2);
    }

    public aklo(int i) {
        this.b = new ArrayList();
        this.g = true;
        if (i >= 0) {
            synchronized (this) {
                a(i);
            }
            return;
        }
        throw new IllegalArgumentException("Negative initial size: ".concat(String.valueOf(i)));
    }

    private void a(int i) {
        if (this.c < this.b.size() - 1) {
            this.d += this.e.length;
            this.c++;
            this.e = (byte[]) this.b.get(this.c);
            return;
        }
        int i2;
        byte[] bArr = this.e;
        if (bArr == null) {
            i2 = 0;
        } else {
            i = Math.max(bArr.length << 1, i - this.d);
            i2 = this.d + this.e.length;
        }
        this.d = i2;
        this.c++;
        this.e = new byte[i];
        this.b.add(this.e);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:19:0x0030 in {6, 13, 15, 18} preds:[]
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
    public final synchronized byte[] a() {
        /*
        r7 = this;
        monitor-enter(r7);
        r0 = r7.f;	 Catch:{ all -> 0x002d }
        if (r0 != 0) goto L_0x0009;	 Catch:{ all -> 0x002d }
        r0 = a;	 Catch:{ all -> 0x002d }
        monitor-exit(r7);
        return r0;
        r1 = new byte[r0];	 Catch:{ all -> 0x002d }
        r2 = r7.b;	 Catch:{ all -> 0x002d }
        r2 = r2.iterator();	 Catch:{ all -> 0x002d }
        r3 = 0;	 Catch:{ all -> 0x002d }
        r4 = 0;	 Catch:{ all -> 0x002d }
        r5 = r2.hasNext();	 Catch:{ all -> 0x002d }
        if (r5 == 0) goto L_0x002b;	 Catch:{ all -> 0x002d }
        r5 = r2.next();	 Catch:{ all -> 0x002d }
        r5 = (byte[]) r5;	 Catch:{ all -> 0x002d }
        r6 = r5.length;	 Catch:{ all -> 0x002d }
        r6 = java.lang.Math.min(r6, r0);	 Catch:{ all -> 0x002d }
        java.lang.System.arraycopy(r5, r3, r1, r4, r6);	 Catch:{ all -> 0x002d }
        r4 = r4 + r6;
        r0 = r0 - r6;
        if (r0 != 0) goto L_0x0013;
        monitor-exit(r7);
        return r1;
        r0 = move-exception;
        monitor-exit(r7);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aklo.a():byte[]");
    }

    public final void close() {
    }

    @Deprecated
    public final String toString() {
        return new String(a(), Charset.defaultCharset());
    }

    public final synchronized void write(int i) {
        int i2 = this.f - this.d;
        if (i2 == this.e.length) {
            a(this.f + 1);
            i2 = 0;
        }
        this.e[i2] = (byte) i;
        this.f++;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:24:0x003f in {8, 15, 18, 21, 23} preds:[]
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
    public final void write(byte[] r6, int r7, int r8) {
        /*
        r5 = this;
        if (r7 < 0) goto L_0x0039;
        r0 = r6.length;
        if (r7 > r0) goto L_0x0039;
        if (r8 < 0) goto L_0x0039;
        r7 = r7 + r8;
        r0 = r6.length;
        if (r7 > r0) goto L_0x0039;
        if (r7 < 0) goto L_0x0039;
        if (r8 != 0) goto L_0x0010;
        return;
        monitor-enter(r5);
        r0 = r5.f;	 Catch:{ all -> 0x0036 }
        r0 = r0 + r8;	 Catch:{ all -> 0x0036 }
        r1 = r5.f;	 Catch:{ all -> 0x0036 }
        r2 = r5.d;	 Catch:{ all -> 0x0036 }
        r1 = r1 - r2;	 Catch:{ all -> 0x0036 }
        if (r8 <= 0) goto L_0x0032;	 Catch:{ all -> 0x0036 }
        r2 = r5.e;	 Catch:{ all -> 0x0036 }
        r2 = r2.length;	 Catch:{ all -> 0x0036 }
        r2 = r2 - r1;	 Catch:{ all -> 0x0036 }
        r2 = java.lang.Math.min(r8, r2);	 Catch:{ all -> 0x0036 }
        r3 = r7 - r8;	 Catch:{ all -> 0x0036 }
        r4 = r5.e;	 Catch:{ all -> 0x0036 }
        java.lang.System.arraycopy(r6, r3, r4, r1, r2);	 Catch:{ all -> 0x0036 }
        r8 = r8 - r2;	 Catch:{ all -> 0x0036 }
        if (r8 <= 0) goto L_0x0019;	 Catch:{ all -> 0x0036 }
        r5.a(r0);	 Catch:{ all -> 0x0036 }
        r1 = 0;	 Catch:{ all -> 0x0036 }
        goto L_0x0019;	 Catch:{ all -> 0x0036 }
        r5.f = r0;	 Catch:{ all -> 0x0036 }
        monitor-exit(r5);	 Catch:{ all -> 0x0036 }
        return;	 Catch:{ all -> 0x0036 }
        r6 = move-exception;	 Catch:{ all -> 0x0036 }
        monitor-exit(r5);	 Catch:{ all -> 0x0036 }
        throw r6;
        r6 = new java.lang.IndexOutOfBoundsException;
        r6.<init>();
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aklo.write(byte[], int, int):void");
    }
}
