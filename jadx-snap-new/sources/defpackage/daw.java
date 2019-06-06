package defpackage;

import android.os.Build.VERSION;
import android.system.Os;
import android.system.OsConstants;
import android.util.SparseIntArray;
import java.io.File;
import java.util.Locale;

/* renamed from: daw */
public final class daw extends dat<dav> {
    private static final a a = new a();
    private final int b = dax.a();
    private final File[] c = new File[this.b];

    /* renamed from: daw$a */
    static final class a extends abky<SparseIntArray> {
        private final int d;
        private final SparseIntArray e;
        private int f;

        private a() {
            int sysconf = dax.a > 0 ? dax.a : VERSION.SDK_INT >= 21 ? (int) Os.sysconf(OsConstants._SC_CLK_TCK) : 100;
            this.d = sysconf;
            this.e = new SparseIntArray();
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final void a() {
            super.a();
            this.f = 0;
            this.e.clear();
        }

        public final boolean a(int i) {
            int b = b();
            if (i % 2 == 0) {
                this.f = b;
            } else {
                this.e.put(this.f, b / this.d);
            }
            return true;
        }

        public final /* bridge */ /* synthetic */ Object getResult() {
            return this.e;
        }
    }

    public daw() {
        for (int i = 0; i < this.b; i++) {
            this.c[i] = new File(String.format(Locale.US, "/sys/devices/system/cpu/cpu%d/cpufreq/stats/time_in_state", new Object[]{Integer.valueOf(i)}));
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x0029 in {7, 8, 9, 10, 12} preds:[]
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
    private boolean a(defpackage.dav r7) {
        /*
        r6 = this;
        r0 = 0;
        r1 = 0;
        r2 = 0;
        r3 = r6.b;	 Catch:{ all -> 0x0027 }
        if (r1 >= r3) goto L_0x0026;	 Catch:{ all -> 0x0027 }
        r3 = r7.a;	 Catch:{ all -> 0x0027 }
        r3 = r3[r1];	 Catch:{ all -> 0x0027 }
        r4 = r6.c;	 Catch:{ all -> 0x0027 }
        r4 = r4[r1];	 Catch:{ all -> 0x0027 }
        r5 = a;	 Catch:{ all -> 0x0027 }
        r4 = r5.a(r4);	 Catch:{ all -> 0x0027 }
        r4 = (android.util.SparseIntArray) r4;	 Catch:{ all -> 0x0027 }
        r3.clear();	 Catch:{ all -> 0x0027 }
        if (r4 == 0) goto L_0x0021;	 Catch:{ all -> 0x0027 }
        defpackage.dav.a(r4, r3);	 Catch:{ all -> 0x0027 }
        r3 = 1;
        goto L_0x0022;
        r3 = 0;
        r2 = r2 | r3;
        r1 = r1 + 1;
        goto L_0x0003;
        return r2;
        r7 = move-exception;
        throw r7;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.daw.a(dav):boolean");
    }

    public final /* synthetic */ das b() {
        return new dav();
    }
}
