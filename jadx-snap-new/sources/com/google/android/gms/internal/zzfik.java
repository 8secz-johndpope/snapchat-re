package com.google.android.gms.internal;

public class zzfik {
    private static final zzfhm zzpns = zzfhm.zzczf();
    private zzfgs zzpqq;
    private volatile zzfjc zzpqr;
    private volatile zzfgs zzpqs;

    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    private com.google.android.gms.internal.zzfjc zzj(com.google.android.gms.internal.zzfjc r2) {
        /*
        r1 = this;
        r0 = r1.zzpqr;
        if (r0 != 0) goto L_0x001c;
    L_0x0004:
        monitor-enter(r1);
        r0 = r1.zzpqr;	 Catch:{ all -> 0x0019 }
        if (r0 == 0) goto L_0x000b;
    L_0x0009:
        monitor-exit(r1);	 Catch:{ all -> 0x0019 }
        goto L_0x001c;
    L_0x000b:
        r1.zzpqr = r2;	 Catch:{ zzfie -> 0x0012 }
        r0 = com.google.android.gms.internal.zzfgs.zzpnw;	 Catch:{ zzfie -> 0x0012 }
        r1.zzpqs = r0;	 Catch:{ zzfie -> 0x0012 }
        goto L_0x0009;
    L_0x0012:
        r1.zzpqr = r2;	 Catch:{ all -> 0x0019 }
        r2 = com.google.android.gms.internal.zzfgs.zzpnw;	 Catch:{ all -> 0x0019 }
        r1.zzpqs = r2;	 Catch:{ all -> 0x0019 }
        goto L_0x0009;
    L_0x0019:
        r2 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0019 }
        throw r2;
    L_0x001c:
        r2 = r1.zzpqr;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzfik.zzj(com.google.android.gms.internal.zzfjc):com.google.android.gms.internal.zzfjc");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfik)) {
            return false;
        }
        zzfik zzfik = (zzfik) obj;
        zzfjc zzfjc = this.zzpqr;
        zzfjc zzfjc2 = zzfik.zzpqr;
        return (zzfjc == null && zzfjc2 == null) ? toByteString().equals(zzfik.toByteString()) : (zzfjc == null || zzfjc2 == null) ? zzfjc != null ? zzfjc.equals(zzfik.zzj(zzfjc.zzczu())) : zzj(zzfjc2.zzczu()).equals(zzfjc2) : zzfjc.equals(zzfjc2);
    }

    public int hashCode() {
        return 1;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:22:0x0027 in {3, 10, 13, 15, 18, 21} preds:[]
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
    public final com.google.android.gms.internal.zzfgs toByteString() {
        /*
        r1 = this;
        r0 = r1.zzpqs;
        if (r0 == 0) goto L_0x0007;
        r0 = r1.zzpqs;
        return r0;
        monitor-enter(r1);
        r0 = r1.zzpqs;	 Catch:{ all -> 0x0024 }
        if (r0 == 0) goto L_0x0010;	 Catch:{ all -> 0x0024 }
        r0 = r1.zzpqs;	 Catch:{ all -> 0x0024 }
        monitor-exit(r1);	 Catch:{ all -> 0x0024 }
        return r0;	 Catch:{ all -> 0x0024 }
        r0 = r1.zzpqr;	 Catch:{ all -> 0x0024 }
        if (r0 != 0) goto L_0x0019;	 Catch:{ all -> 0x0024 }
        r0 = com.google.android.gms.internal.zzfgs.zzpnw;	 Catch:{ all -> 0x0024 }
        r1.zzpqs = r0;	 Catch:{ all -> 0x0024 }
        goto L_0x0020;	 Catch:{ all -> 0x0024 }
        r0 = r1.zzpqr;	 Catch:{ all -> 0x0024 }
        r0 = r0.toByteString();	 Catch:{ all -> 0x0024 }
        goto L_0x0016;	 Catch:{ all -> 0x0024 }
        r0 = r1.zzpqs;	 Catch:{ all -> 0x0024 }
        monitor-exit(r1);	 Catch:{ all -> 0x0024 }
        return r0;	 Catch:{ all -> 0x0024 }
        r0 = move-exception;	 Catch:{ all -> 0x0024 }
        monitor-exit(r1);	 Catch:{ all -> 0x0024 }
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzfik.toByteString():com.google.android.gms.internal.zzfgs");
    }

    public final int zzhs() {
        return this.zzpqs != null ? this.zzpqs.size() : this.zzpqr != null ? this.zzpqr.zzhs() : 0;
    }

    public final zzfjc zzk(zzfjc zzfjc) {
        zzfjc zzfjc2 = this.zzpqr;
        this.zzpqq = null;
        this.zzpqs = null;
        this.zzpqr = zzfjc;
        return zzfjc2;
    }
}
