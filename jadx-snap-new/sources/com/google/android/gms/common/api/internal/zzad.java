package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import java.util.Map;

final class zzad implements OnCompleteListener<Map<zzh<?>, String>> {
    private /* synthetic */ zzaa zzfwu;
    private zzcu zzfwv;

    /* Access modifiers changed, original: final */
    public final void cancel() {
        this.zzfwv.zzacm();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:39:0x012f in {4, 7, 14, 24, 25, 26, 27, 28, 33, 35, 38} preds:[]
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
    public final void onComplete(com.google.android.gms.tasks.Task<java.util.Map<com.google.android.gms.common.api.internal.zzh<?>, java.lang.String>> r6) {
        /*
        r5 = this;
        r0 = r5.zzfwu;
        r0 = r0.zzfwa;
        r0.lock();
        r0 = r5.zzfwu;	 Catch:{ all -> 0x0124 }
        r0 = r0.zzfwp;	 Catch:{ all -> 0x0124 }
        if (r0 != 0) goto L_0x0020;	 Catch:{ all -> 0x0124 }
        r6 = r5.zzfwv;	 Catch:{ all -> 0x0124 }
        r6.zzacm();	 Catch:{ all -> 0x0124 }
        r6 = r5.zzfwu;
        r6 = r6.zzfwa;
        r6.unlock();
        return;
        r0 = r6.isSuccessful();	 Catch:{ all -> 0x0124 }
        if (r0 == 0) goto L_0x0064;	 Catch:{ all -> 0x0124 }
        r6 = r5.zzfwu;	 Catch:{ all -> 0x0124 }
        r0 = new iv;	 Catch:{ all -> 0x0124 }
        r1 = r5.zzfwu;	 Catch:{ all -> 0x0124 }
        r1 = r1.zzfwh;	 Catch:{ all -> 0x0124 }
        r1 = r1.size();	 Catch:{ all -> 0x0124 }
        r0.<init>(r1);	 Catch:{ all -> 0x0124 }
        r6.zzfwr = r0;	 Catch:{ all -> 0x0124 }
        r6 = r5.zzfwu;	 Catch:{ all -> 0x0124 }
        r6 = r6.zzfwh;	 Catch:{ all -> 0x0124 }
        r6 = r6.values();	 Catch:{ all -> 0x0124 }
        r6 = r6.iterator();	 Catch:{ all -> 0x0124 }
        r0 = r6.hasNext();	 Catch:{ all -> 0x0124 }
        if (r0 == 0) goto L_0x00ee;	 Catch:{ all -> 0x0124 }
        r0 = r6.next();	 Catch:{ all -> 0x0124 }
        r0 = (com.google.android.gms.common.api.internal.zzz) r0;	 Catch:{ all -> 0x0124 }
        r1 = r5.zzfwu;	 Catch:{ all -> 0x0124 }
        r1 = r1.zzfwr;	 Catch:{ all -> 0x0124 }
        r0 = r0.zzahv();	 Catch:{ all -> 0x0124 }
        r2 = com.google.android.gms.common.ConnectionResult.zzfqt;	 Catch:{ all -> 0x0124 }
        r1.put(r0, r2);	 Catch:{ all -> 0x0124 }
        goto L_0x0048;	 Catch:{ all -> 0x0124 }
        r0 = r6.getException();	 Catch:{ all -> 0x0124 }
        r0 = r0 instanceof com.google.android.gms.common.api.AvailabilityException;	 Catch:{ all -> 0x0124 }
        if (r0 == 0) goto L_0x00da;	 Catch:{ all -> 0x0124 }
        r6 = r6.getException();	 Catch:{ all -> 0x0124 }
        r6 = (com.google.android.gms.common.api.AvailabilityException) r6;	 Catch:{ all -> 0x0124 }
        r0 = r5.zzfwu;	 Catch:{ all -> 0x0124 }
        r0 = r0.zzfwn;	 Catch:{ all -> 0x0124 }
        if (r0 == 0) goto L_0x00d0;	 Catch:{ all -> 0x0124 }
        r0 = r5.zzfwu;	 Catch:{ all -> 0x0124 }
        r1 = new iv;	 Catch:{ all -> 0x0124 }
        r2 = r5.zzfwu;	 Catch:{ all -> 0x0124 }
        r2 = r2.zzfwh;	 Catch:{ all -> 0x0124 }
        r2 = r2.size();	 Catch:{ all -> 0x0124 }
        r1.<init>(r2);	 Catch:{ all -> 0x0124 }
        r0.zzfwr = r1;	 Catch:{ all -> 0x0124 }
        r0 = r5.zzfwu;	 Catch:{ all -> 0x0124 }
        r0 = r0.zzfwh;	 Catch:{ all -> 0x0124 }
        r0 = r0.values();	 Catch:{ all -> 0x0124 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0124 }
        r1 = r0.hasNext();	 Catch:{ all -> 0x0124 }
        if (r1 == 0) goto L_0x00ee;	 Catch:{ all -> 0x0124 }
        r1 = r0.next();	 Catch:{ all -> 0x0124 }
        r1 = (com.google.android.gms.common.api.internal.zzz) r1;	 Catch:{ all -> 0x0124 }
        r2 = r1.zzahv();	 Catch:{ all -> 0x0124 }
        r3 = r6.getConnectionResult(r1);	 Catch:{ all -> 0x0124 }
        r4 = r5.zzfwu;	 Catch:{ all -> 0x0124 }
        r1 = r4.zza(r1, r3);	 Catch:{ all -> 0x0124 }
        if (r1 == 0) goto L_0x00c9;	 Catch:{ all -> 0x0124 }
        r1 = r5.zzfwu;	 Catch:{ all -> 0x0124 }
        r1 = r1.zzfwr;	 Catch:{ all -> 0x0124 }
        r3 = new com.google.android.gms.common.ConnectionResult;	 Catch:{ all -> 0x0124 }
        r4 = 16;	 Catch:{ all -> 0x0124 }
        r3.<init>(r4);	 Catch:{ all -> 0x0124 }
        r1.put(r2, r3);	 Catch:{ all -> 0x0124 }
        goto L_0x009c;	 Catch:{ all -> 0x0124 }
        r1 = r5.zzfwu;	 Catch:{ all -> 0x0124 }
        r1 = r1.zzfwr;	 Catch:{ all -> 0x0124 }
        goto L_0x00c5;	 Catch:{ all -> 0x0124 }
        r0 = r5.zzfwu;	 Catch:{ all -> 0x0124 }
        r6 = r6.zzahr();	 Catch:{ all -> 0x0124 }
        r0.zzfwr = r6;	 Catch:{ all -> 0x0124 }
        goto L_0x00ee;	 Catch:{ all -> 0x0124 }
        r0 = "ConnectionlessGAC";	 Catch:{ all -> 0x0124 }
        r1 = "Unexpected availability exception";	 Catch:{ all -> 0x0124 }
        r6 = r6.getException();	 Catch:{ all -> 0x0124 }
        android.util.Log.e(r0, r1, r6);	 Catch:{ all -> 0x0124 }
        r6 = r5.zzfwu;	 Catch:{ all -> 0x0124 }
        r0 = java.util.Collections.emptyMap();	 Catch:{ all -> 0x0124 }
        r6.zzfwr = r0;	 Catch:{ all -> 0x0124 }
        r6 = r5.zzfwu;	 Catch:{ all -> 0x0124 }
        r6 = r6.isConnected();	 Catch:{ all -> 0x0124 }
        if (r6 == 0) goto L_0x0120;	 Catch:{ all -> 0x0124 }
        r6 = r5.zzfwu;	 Catch:{ all -> 0x0124 }
        r6 = r6.zzfwq;	 Catch:{ all -> 0x0124 }
        r0 = r5.zzfwu;	 Catch:{ all -> 0x0124 }
        r0 = r0.zzfwr;	 Catch:{ all -> 0x0124 }
        r6.putAll(r0);	 Catch:{ all -> 0x0124 }
        r6 = r5.zzfwu;	 Catch:{ all -> 0x0124 }
        r6 = r6.zzajb();	 Catch:{ all -> 0x0124 }
        if (r6 != 0) goto L_0x0120;	 Catch:{ all -> 0x0124 }
        r6 = r5.zzfwu;	 Catch:{ all -> 0x0124 }
        r6.zzaiz();	 Catch:{ all -> 0x0124 }
        r6 = r5.zzfwu;	 Catch:{ all -> 0x0124 }
        r6.zzaja();	 Catch:{ all -> 0x0124 }
        r6 = r5.zzfwu;	 Catch:{ all -> 0x0124 }
        r6 = r6.zzfwl;	 Catch:{ all -> 0x0124 }
        r6.signalAll();	 Catch:{ all -> 0x0124 }
        r6 = r5.zzfwv;	 Catch:{ all -> 0x0124 }
        goto L_0x0013;
        r6 = move-exception;
        r0 = r5.zzfwu;
        r0 = r0.zzfwa;
        r0.unlock();
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zzad.onComplete(com.google.android.gms.tasks.Task):void");
    }
}
