package defpackage;

import defpackage.akje.b;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: akjk */
public final class akjk implements Closeable {
    private static final Logger b = Logger.getLogger(akjf.class.getName());
    int a = 16384;
    private final akke c;
    private final boolean d;
    private final akkd e = new akkd();
    private boolean f;
    private b g = new b(this.e);

    akjk(akke akke, boolean z) {
        this.c = akke;
        this.d = z;
    }

    private void a(int i, int i2, byte b, byte b2) {
        if (b.isLoggable(Level.FINE)) {
            b.fine(akjf.a(false, i, i2, b, b2));
        }
        if (i2 > this.a) {
            throw akjf.a("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(this.a), Integer.valueOf(i2));
        } else if ((Integer.MIN_VALUE & i) == 0) {
            akjk.a(this.c, i2);
            this.c.j(b & 255);
            this.c.j(b2 & 255);
            this.c.h(i & Integer.MAX_VALUE);
        } else {
            throw akjf.a("reserved bit set: %s", Integer.valueOf(i));
        }
    }

    private static void a(akke akke, int i) {
        akke.j((i >>> 16) & 255);
        akke.j((i >>> 8) & 255);
        akke.j(i & 255);
    }

    private void b(int i, long j) {
        while (j > 0) {
            int min = (int) Math.min((long) this.a, j);
            long j2 = (long) min;
            j -= j2;
            a(i, min, (byte) 9, j == 0 ? (byte) 4 : (byte) 0);
            this.c.a_(this.e, j2);
        }
    }

    public final synchronized void a() {
        if (this.f) {
            throw new IOException("closed");
        } else if (this.d) {
            if (b.isLoggable(Level.FINE)) {
                b.fine(akib.a(">> CONNECTION %s", akjf.a.e()));
            }
            this.c.c(akjf.a.h());
            this.c.flush();
        }
    }

    public final synchronized void a(int i, long j) {
        if (this.f) {
            throw new IOException("closed");
        } else if (j == 0 || j > 2147483647L) {
            throw akjf.a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
        } else {
            a(i, 4, (byte) 8, (byte) 0);
            this.c.h((int) j);
            this.c.flush();
        }
    }

    public final synchronized void a(int i, akjc akjc) {
        if (this.f) {
            throw new IOException("closed");
        } else if (akjc.httpCode != -1) {
            a(i, 4, (byte) 3, (byte) 0);
            this.c.h(akjc.httpCode);
            this.c.flush();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final synchronized void a(int i, akjc akjc, byte[] bArr) {
        if (this.f) {
            throw new IOException("closed");
        } else if (akjc.httpCode != -1) {
            a(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.c.h(i);
            this.c.h(akjc.httpCode);
            if (bArr.length > 0) {
                this.c.c(bArr);
            }
            this.c.flush();
        } else {
            throw akjf.a("errorCode.httpCode == -1", new Object[0]);
        }
    }

    public final synchronized void a(akjo akjo) {
        if (this.f) {
            throw new IOException("closed");
        }
        int i = this.a;
        if ((akjo.a & 32) != 0) {
            i = akjo.b[5];
        }
        this.a = i;
        if (akjo.a() != -1) {
            this.g.a(akjo.a());
        }
        a(0, 0, (byte) 4, (byte) 1);
        this.c.flush();
    }

    public final synchronized void a(boolean z, int i, int i2) {
        if (this.f) {
            throw new IOException("closed");
        }
        a(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
        this.c.h(i);
        this.c.h(i2);
        this.c.flush();
    }

    public final synchronized void a(boolean z, int i, akkd akkd, int i2) {
        if (this.f) {
            throw new IOException("closed");
        }
        a(i, i2, (byte) 0, (byte) z);
        if (i2 > 0) {
            this.c.a_(akkd, (long) i2);
        }
    }

    public final synchronized void a(boolean z, int i, List<akjd> list) {
        if (this.f) {
            throw new IOException("closed");
        } else if (this.f) {
            throw new IOException("closed");
        } else {
            this.g.a((List) list);
            long j = this.e.b;
            int min = (int) Math.min((long) this.a, j);
            long j2 = (long) min;
            byte b = j == j2 ? (byte) 4 : (byte) 0;
            if (z) {
                b = (byte) (b | 1);
            }
            a(i, min, (byte) 1, b);
            this.c.a_(this.e, j2);
            if (j > j2) {
                b(i, j - j2);
            }
        }
    }

    public final synchronized void b() {
        if (this.f) {
            throw new IOException("closed");
        }
        this.c.flush();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:26:0x0049 in {10, 13, 14, 15, 16, 19, 22, 25} preds:[]
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
    public final synchronized void b(defpackage.akjo r5) {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.f;	 Catch:{ all -> 0x0046 }
        if (r0 != 0) goto L_0x003e;	 Catch:{ all -> 0x0046 }
        r0 = r5.a;	 Catch:{ all -> 0x0046 }
        r0 = java.lang.Integer.bitCount(r0);	 Catch:{ all -> 0x0046 }
        r0 = r0 * 6;	 Catch:{ all -> 0x0046 }
        r1 = 4;	 Catch:{ all -> 0x0046 }
        r2 = 0;	 Catch:{ all -> 0x0046 }
        r4.a(r2, r0, r1, r2);	 Catch:{ all -> 0x0046 }
        r0 = 10;	 Catch:{ all -> 0x0046 }
        if (r2 >= r0) goto L_0x0037;	 Catch:{ all -> 0x0046 }
        r0 = r5.a(r2);	 Catch:{ all -> 0x0046 }
        if (r0 == 0) goto L_0x0034;	 Catch:{ all -> 0x0046 }
        if (r2 != r1) goto L_0x0020;	 Catch:{ all -> 0x0046 }
        r0 = 3;	 Catch:{ all -> 0x0046 }
        goto L_0x0026;	 Catch:{ all -> 0x0046 }
        r0 = 7;	 Catch:{ all -> 0x0046 }
        if (r2 != r0) goto L_0x0025;	 Catch:{ all -> 0x0046 }
        r0 = 4;	 Catch:{ all -> 0x0046 }
        goto L_0x0026;	 Catch:{ all -> 0x0046 }
        r0 = r2;	 Catch:{ all -> 0x0046 }
        r3 = r4.c;	 Catch:{ all -> 0x0046 }
        r3.i(r0);	 Catch:{ all -> 0x0046 }
        r0 = r4.c;	 Catch:{ all -> 0x0046 }
        r3 = r5.b;	 Catch:{ all -> 0x0046 }
        r3 = r3[r2];	 Catch:{ all -> 0x0046 }
        r0.h(r3);	 Catch:{ all -> 0x0046 }
        r2 = r2 + 1;	 Catch:{ all -> 0x0046 }
        goto L_0x0012;	 Catch:{ all -> 0x0046 }
        r5 = r4.c;	 Catch:{ all -> 0x0046 }
        r5.flush();	 Catch:{ all -> 0x0046 }
        monitor-exit(r4);
        return;
        r5 = new java.io.IOException;	 Catch:{ all -> 0x0046 }
        r0 = "closed";	 Catch:{ all -> 0x0046 }
        r5.<init>(r0);	 Catch:{ all -> 0x0046 }
        throw r5;	 Catch:{ all -> 0x0046 }
        r5 = move-exception;
        monitor-exit(r4);
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akjk.b(akjo):void");
    }

    public final synchronized void close() {
        this.f = true;
        this.c.close();
    }
}
