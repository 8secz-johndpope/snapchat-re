package defpackage;

import java.util.Arrays;
import java.util.Map.Entry;
import java.util.TreeMap;

/* renamed from: as */
public final class as implements ac, ad {
    private static TreeMap<Integer, as> i = new TreeMap();
    private volatile String a;
    private long[] b;
    private double[] c;
    private String[] d;
    private byte[][] e;
    private final int[] f;
    private int g;
    private int h;

    private as(int i) {
        this.g = i;
        i++;
        this.f = new int[i];
        this.b = new long[i];
        this.c = new double[i];
        this.d = new String[i];
        this.e = new byte[i][];
    }

    public static as a(String str, int i) {
        synchronized (i) {
            Entry ceilingEntry = i.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry != null) {
                i.remove(ceilingEntry.getKey());
                as asVar = (as) ceilingEntry.getValue();
                asVar.b(str, i);
                return asVar;
            }
            as asVar2 = new as(i);
            asVar2.b(str, i);
            return asVar2;
        }
    }

    private void b(String str, int i) {
        this.a = str;
        this.h = i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:14:0x003b in {8, 10, 13} preds:[]
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
    public final void a() {
        /*
        r4 = this;
        r0 = i;
        monitor-enter(r0);
        r1 = i;	 Catch:{ all -> 0x0038 }
        r2 = r4.g;	 Catch:{ all -> 0x0038 }
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ all -> 0x0038 }
        r1.put(r2, r4);	 Catch:{ all -> 0x0038 }
        r1 = i;	 Catch:{ all -> 0x0038 }
        r1 = r1.size();	 Catch:{ all -> 0x0038 }
        r2 = 15;	 Catch:{ all -> 0x0038 }
        if (r1 <= r2) goto L_0x0036;	 Catch:{ all -> 0x0038 }
        r1 = i;	 Catch:{ all -> 0x0038 }
        r1 = r1.size();	 Catch:{ all -> 0x0038 }
        r1 = r1 + -10;	 Catch:{ all -> 0x0038 }
        r2 = i;	 Catch:{ all -> 0x0038 }
        r2 = r2.descendingKeySet();	 Catch:{ all -> 0x0038 }
        r2 = r2.iterator();	 Catch:{ all -> 0x0038 }
        r3 = r1 + -1;	 Catch:{ all -> 0x0038 }
        if (r1 <= 0) goto L_0x0036;	 Catch:{ all -> 0x0038 }
        r2.next();	 Catch:{ all -> 0x0038 }
        r2.remove();	 Catch:{ all -> 0x0038 }
        r1 = r3;	 Catch:{ all -> 0x0038 }
        goto L_0x002a;	 Catch:{ all -> 0x0038 }
        monitor-exit(r0);	 Catch:{ all -> 0x0038 }
        return;	 Catch:{ all -> 0x0038 }
        r1 = move-exception;	 Catch:{ all -> 0x0038 }
        monitor-exit(r0);	 Catch:{ all -> 0x0038 }
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.as.a():void");
    }

    public final void bindBlob(int i, byte[] bArr) {
        this.f[i] = 5;
        this.e[i] = bArr;
    }

    public final void bindDouble(int i, double d) {
        this.f[i] = 3;
        this.c[i] = d;
    }

    public final void bindLong(int i, long j) {
        this.f[i] = 2;
        this.b[i] = j;
    }

    public final void bindNull(int i) {
        this.f[i] = 1;
    }

    public final void bindString(int i, String str) {
        this.f[i] = 4;
        this.d[i] = str;
    }

    public final void bindTo(ac acVar) {
        for (int i = 1; i <= this.h; i++) {
            int i2 = this.f[i];
            if (i2 == 1) {
                acVar.bindNull(i);
            } else if (i2 == 2) {
                acVar.bindLong(i, this.b[i]);
            } else if (i2 == 3) {
                acVar.bindDouble(i, this.c[i]);
            } else if (i2 == 4) {
                acVar.bindString(i, this.d[i]);
            } else if (i2 == 5) {
                acVar.bindBlob(i, this.e[i]);
            }
        }
    }

    public final void clearBindings() {
        Arrays.fill(this.f, 1);
        Arrays.fill(this.d, null);
        Arrays.fill(this.e, null);
        this.a = null;
    }

    public final void close() {
    }

    public final int getArgCount() {
        return this.h;
    }

    public final String getSql() {
        return this.a;
    }
}
