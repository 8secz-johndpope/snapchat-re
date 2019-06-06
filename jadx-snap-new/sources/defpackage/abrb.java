package defpackage;

import android.os.SystemClock;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import defpackage.abqp.a;

/* renamed from: abrb */
public final class abrb {
    public static final Supplier<abrb> a = Suppliers.memoize(new 1());
    private final abqo b;
    private long c;
    private int d;
    private long e;

    /* renamed from: abrb$a */
    static class a {
        static final abrb a = new abrb();
    }

    /* renamed from: abrb$b */
    public static class b {
        public final long a;
        public final long b;

        b(long j, long j2) {
            this.a = j;
            this.b = j2;
        }
    }

    /* renamed from: abrb$1 */
    static class 1 implements Supplier<abrb> {
        1() {
        }

        public final /* bridge */ /* synthetic */ Object get() {
            return a.a;
        }
    }

    private abrb() {
        this(a.a);
    }

    private abrb(abqo abqo) {
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.b = abqo;
    }

    private long a(long j) {
        return this.c + ((j * ((long) this.d)) - this.e);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x0047 in {5, 7, 8, 11} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final synchronized double a(defpackage.abrb.b r13) {
        /*
        r12 = this;
        monitor-enter(r12);
        r0 = r13.a;	 Catch:{ all -> 0x0044 }
        r2 = r13.b;	 Catch:{ all -> 0x0044 }
        r4 = android.os.SystemClock.elapsedRealtime();	 Catch:{ all -> 0x0044 }
        r6 = r4 - r0;	 Catch:{ all -> 0x0044 }
        r8 = 0;	 Catch:{ all -> 0x0044 }
        r6 = java.lang.Math.max(r8, r6);	 Catch:{ all -> 0x0044 }
        r10 = r12.c;	 Catch:{ all -> 0x0044 }
        r10 = r10 + r6;	 Catch:{ all -> 0x0044 }
        r12.c = r10;	 Catch:{ all -> 0x0044 }
        r10 = r12.e;	 Catch:{ all -> 0x0044 }
        r10 = r10 - r0;	 Catch:{ all -> 0x0044 }
        r0 = java.lang.Math.max(r8, r10);	 Catch:{ all -> 0x0044 }
        r12.e = r0;	 Catch:{ all -> 0x0044 }
        r13 = 0;	 Catch:{ all -> 0x0044 }
        r0 = r12.d;	 Catch:{ all -> 0x0044 }
        r0 = r0 + -1;	 Catch:{ all -> 0x0044 }
        r13 = java.lang.Math.max(r13, r0);	 Catch:{ all -> 0x0044 }
        r12.d = r13;	 Catch:{ all -> 0x0044 }
        r0 = r12.a(r4);	 Catch:{ all -> 0x0044 }
        r0 = r0 - r2;
        r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r13 <= 0) goto L_0x0041;
        r2 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
        r0 = (double) r0;
        java.lang.Double.isNaN(r0);
        r0 = r0 * r2;
        r2 = (double) r6;
        java.lang.Double.isNaN(r2);
        r0 = r0 / r2;
        monitor-exit(r12);
        return r0;
        r0 = -4616189618054758400; // 0xbff0000000000000 float:0.0 double:-1.0;
        goto L_0x003f;
        r13 = move-exception;
        monitor-exit(r12);
        throw r13;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abrb.a(abrb$b):double");
    }

    public final synchronized b a() {
        long elapsedRealtime;
        long a;
        elapsedRealtime = SystemClock.elapsedRealtime();
        a = a(elapsedRealtime);
        this.e += elapsedRealtime;
        this.d++;
        return new b(elapsedRealtime, a);
    }
}
