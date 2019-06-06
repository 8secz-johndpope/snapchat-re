package com.google.android.gms.internal;

import java.util.LinkedList;
import java.util.List;

@zzabh
public final class zzhh {
    private final Object mLock = new Object();
    private int zzayr;
    private List<zzhg> zzays = new LinkedList();

    public final boolean zza(zzhg zzhg) {
        synchronized (this.mLock) {
            if (this.zzays.contains(zzhg)) {
                return true;
            }
            return false;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:32:0x0086 in {15, 25, 28, 31} preds:[]
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
    public final boolean zzb(com.google.android.gms.internal.zzhg r7) {
        /*
        r6 = this;
        r0 = r6.mLock;
        monitor-enter(r0);
        r1 = r6.zzays;	 Catch:{ all -> 0x0083 }
        r1 = r1.iterator();	 Catch:{ all -> 0x0083 }
        r2 = r1.hasNext();	 Catch:{ all -> 0x0083 }
        if (r2 == 0) goto L_0x0080;	 Catch:{ all -> 0x0083 }
        r2 = r1.next();	 Catch:{ all -> 0x0083 }
        r2 = (com.google.android.gms.internal.zzhg) r2;	 Catch:{ all -> 0x0083 }
        r3 = com.google.android.gms.internal.zzoi.zzbnn;	 Catch:{ all -> 0x0083 }
        r4 = com.google.android.gms.internal.zzlc.zzio();	 Catch:{ all -> 0x0083 }
        r3 = r4.zzd(r3);	 Catch:{ all -> 0x0083 }
        r3 = (java.lang.Boolean) r3;	 Catch:{ all -> 0x0083 }
        r3 = r3.booleanValue();	 Catch:{ all -> 0x0083 }
        r4 = 1;	 Catch:{ all -> 0x0083 }
        if (r3 == 0) goto L_0x004b;	 Catch:{ all -> 0x0083 }
        r3 = com.google.android.gms.ads.internal.zzbt.zzep();	 Catch:{ all -> 0x0083 }
        r3 = r3.zzqe();	 Catch:{ all -> 0x0083 }
        r3 = r3.zzqp();	 Catch:{ all -> 0x0083 }
        if (r3 != 0) goto L_0x004b;	 Catch:{ all -> 0x0083 }
        if (r7 == r2) goto L_0x0009;	 Catch:{ all -> 0x0083 }
        r2 = r2.zzgo();	 Catch:{ all -> 0x0083 }
        r3 = r7.zzgo();	 Catch:{ all -> 0x0083 }
        r2 = r2.equals(r3);	 Catch:{ all -> 0x0083 }
        if (r2 == 0) goto L_0x0009;	 Catch:{ all -> 0x0083 }
        r1.remove();	 Catch:{ all -> 0x0083 }
        monitor-exit(r0);	 Catch:{ all -> 0x0083 }
        return r4;	 Catch:{ all -> 0x0083 }
        r3 = com.google.android.gms.internal.zzoi.zzbnp;	 Catch:{ all -> 0x0083 }
        r5 = com.google.android.gms.internal.zzlc.zzio();	 Catch:{ all -> 0x0083 }
        r3 = r5.zzd(r3);	 Catch:{ all -> 0x0083 }
        r3 = (java.lang.Boolean) r3;	 Catch:{ all -> 0x0083 }
        r3 = r3.booleanValue();	 Catch:{ all -> 0x0083 }
        if (r3 == 0) goto L_0x0009;	 Catch:{ all -> 0x0083 }
        r3 = com.google.android.gms.ads.internal.zzbt.zzep();	 Catch:{ all -> 0x0083 }
        r3 = r3.zzqe();	 Catch:{ all -> 0x0083 }
        r3 = r3.zzqr();	 Catch:{ all -> 0x0083 }
        if (r3 != 0) goto L_0x0009;	 Catch:{ all -> 0x0083 }
        if (r7 == r2) goto L_0x0009;	 Catch:{ all -> 0x0083 }
        r2 = r2.zzgq();	 Catch:{ all -> 0x0083 }
        r3 = r7.zzgq();	 Catch:{ all -> 0x0083 }
        r2 = r2.equals(r3);	 Catch:{ all -> 0x0083 }
        if (r2 == 0) goto L_0x0009;	 Catch:{ all -> 0x0083 }
        r1.remove();	 Catch:{ all -> 0x0083 }
        monitor-exit(r0);	 Catch:{ all -> 0x0083 }
        return r4;	 Catch:{ all -> 0x0083 }
        r7 = 0;	 Catch:{ all -> 0x0083 }
        monitor-exit(r0);	 Catch:{ all -> 0x0083 }
        return r7;	 Catch:{ all -> 0x0083 }
        r7 = move-exception;	 Catch:{ all -> 0x0083 }
        monitor-exit(r0);	 Catch:{ all -> 0x0083 }
        throw r7;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzhh.zzb(com.google.android.gms.internal.zzhg):boolean");
    }

    public final void zzc(zzhg zzhg) {
        synchronized (this.mLock) {
            int size;
            if (this.zzays.size() >= 10) {
                size = this.zzays.size();
                StringBuilder stringBuilder = new StringBuilder(41);
                stringBuilder.append("Queue is full, current size = ");
                stringBuilder.append(size);
                zzaky.zzby(stringBuilder.toString());
                this.zzays.remove(0);
            }
            size = this.zzayr;
            this.zzayr = size + 1;
            zzhg.zzo(size);
            this.zzays.add(zzhg);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:26:0x0055 in {7, 15, 16, 19, 22, 25} preds:[]
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
    public final com.google.android.gms.internal.zzhg zzgw() {
        /*
        r8 = this;
        r0 = r8.mLock;
        monitor-enter(r0);
        r1 = r8.zzays;	 Catch:{ all -> 0x0052 }
        r1 = r1.size();	 Catch:{ all -> 0x0052 }
        r2 = 0;	 Catch:{ all -> 0x0052 }
        if (r1 != 0) goto L_0x0013;	 Catch:{ all -> 0x0052 }
        r1 = "Queue empty";	 Catch:{ all -> 0x0052 }
        com.google.android.gms.internal.zzaky.zzby(r1);	 Catch:{ all -> 0x0052 }
        monitor-exit(r0);	 Catch:{ all -> 0x0052 }
        return r2;	 Catch:{ all -> 0x0052 }
        r1 = r8.zzays;	 Catch:{ all -> 0x0052 }
        r1 = r1.size();	 Catch:{ all -> 0x0052 }
        r3 = 2;	 Catch:{ all -> 0x0052 }
        r4 = 0;	 Catch:{ all -> 0x0052 }
        if (r1 < r3) goto L_0x0045;	 Catch:{ all -> 0x0052 }
        r1 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;	 Catch:{ all -> 0x0052 }
        r3 = r8.zzays;	 Catch:{ all -> 0x0052 }
        r3 = r3.iterator();	 Catch:{ all -> 0x0052 }
        r5 = 0;	 Catch:{ all -> 0x0052 }
        r6 = r3.hasNext();	 Catch:{ all -> 0x0052 }
        if (r6 == 0) goto L_0x003e;	 Catch:{ all -> 0x0052 }
        r6 = r3.next();	 Catch:{ all -> 0x0052 }
        r6 = (com.google.android.gms.internal.zzhg) r6;	 Catch:{ all -> 0x0052 }
        r7 = r6.getScore();	 Catch:{ all -> 0x0052 }
        if (r7 <= r1) goto L_0x003b;	 Catch:{ all -> 0x0052 }
        r4 = r5;	 Catch:{ all -> 0x0052 }
        r2 = r6;	 Catch:{ all -> 0x0052 }
        r1 = r7;	 Catch:{ all -> 0x0052 }
        r5 = r5 + 1;	 Catch:{ all -> 0x0052 }
        goto L_0x0026;	 Catch:{ all -> 0x0052 }
        r1 = r8.zzays;	 Catch:{ all -> 0x0052 }
        r1.remove(r4);	 Catch:{ all -> 0x0052 }
        monitor-exit(r0);	 Catch:{ all -> 0x0052 }
        return r2;	 Catch:{ all -> 0x0052 }
        r1 = r8.zzays;	 Catch:{ all -> 0x0052 }
        r1 = r1.get(r4);	 Catch:{ all -> 0x0052 }
        r1 = (com.google.android.gms.internal.zzhg) r1;	 Catch:{ all -> 0x0052 }
        r1.zzgr();	 Catch:{ all -> 0x0052 }
        monitor-exit(r0);	 Catch:{ all -> 0x0052 }
        return r1;	 Catch:{ all -> 0x0052 }
        r1 = move-exception;	 Catch:{ all -> 0x0052 }
        monitor-exit(r0);	 Catch:{ all -> 0x0052 }
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzhh.zzgw():com.google.android.gms.internal.zzhg");
    }
}
