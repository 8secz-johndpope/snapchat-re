package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import java.util.Map;

final class zzac implements OnCompleteListener<Map<zzh<?>, String>> {
    private /* synthetic */ zzaa zzfwu;

    private zzac(zzaa zzaa) {
        this.zzfwu = zzaa;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:41:0x015e in {5, 12, 22, 23, 24, 25, 26, 27, 28, 31, 34, 35, 37, 40} preds:[]
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
    public final void onComplete(com.google.android.gms.tasks.Task<java.util.Map<com.google.android.gms.common.api.internal.zzh<?>, java.lang.String>> r6) {
        /*
        r5 = this;
        r0 = r5.zzfwu;
        r0 = r0.zzfwa;
        r0.lock();
        r0 = r5.zzfwu;	 Catch:{ all -> 0x0153 }
        r0 = r0.zzfwp;	 Catch:{ all -> 0x0153 }
        if (r0 != 0) goto L_0x001b;
        r6 = r5.zzfwu;
        r6 = r6.zzfwa;
        r6.unlock();
        return;
        r0 = r6.isSuccessful();	 Catch:{ all -> 0x0153 }
        if (r0 == 0) goto L_0x005f;	 Catch:{ all -> 0x0153 }
        r6 = r5.zzfwu;	 Catch:{ all -> 0x0153 }
        r0 = new iv;	 Catch:{ all -> 0x0153 }
        r1 = r5.zzfwu;	 Catch:{ all -> 0x0153 }
        r1 = r1.zzfwg;	 Catch:{ all -> 0x0153 }
        r1 = r1.size();	 Catch:{ all -> 0x0153 }
        r0.<init>(r1);	 Catch:{ all -> 0x0153 }
        r6.zzfwq = r0;	 Catch:{ all -> 0x0153 }
        r6 = r5.zzfwu;	 Catch:{ all -> 0x0153 }
        r6 = r6.zzfwg;	 Catch:{ all -> 0x0153 }
        r6 = r6.values();	 Catch:{ all -> 0x0153 }
        r6 = r6.iterator();	 Catch:{ all -> 0x0153 }
        r0 = r6.hasNext();	 Catch:{ all -> 0x0153 }
        if (r0 == 0) goto L_0x00fe;	 Catch:{ all -> 0x0153 }
        r0 = r6.next();	 Catch:{ all -> 0x0153 }
        r0 = (com.google.android.gms.common.api.internal.zzz) r0;	 Catch:{ all -> 0x0153 }
        r1 = r5.zzfwu;	 Catch:{ all -> 0x0153 }
        r1 = r1.zzfwq;	 Catch:{ all -> 0x0153 }
        r0 = r0.zzahv();	 Catch:{ all -> 0x0153 }
        r2 = com.google.android.gms.common.ConnectionResult.zzfqt;	 Catch:{ all -> 0x0153 }
        r1.put(r0, r2);	 Catch:{ all -> 0x0153 }
        goto L_0x0043;	 Catch:{ all -> 0x0153 }
        r0 = r6.getException();	 Catch:{ all -> 0x0153 }
        r0 = r0 instanceof com.google.android.gms.common.api.AvailabilityException;	 Catch:{ all -> 0x0153 }
        if (r0 == 0) goto L_0x00e0;	 Catch:{ all -> 0x0153 }
        r6 = r6.getException();	 Catch:{ all -> 0x0153 }
        r6 = (com.google.android.gms.common.api.AvailabilityException) r6;	 Catch:{ all -> 0x0153 }
        r0 = r5.zzfwu;	 Catch:{ all -> 0x0153 }
        r0 = r0.zzfwn;	 Catch:{ all -> 0x0153 }
        if (r0 == 0) goto L_0x00cb;	 Catch:{ all -> 0x0153 }
        r0 = r5.zzfwu;	 Catch:{ all -> 0x0153 }
        r1 = new iv;	 Catch:{ all -> 0x0153 }
        r2 = r5.zzfwu;	 Catch:{ all -> 0x0153 }
        r2 = r2.zzfwg;	 Catch:{ all -> 0x0153 }
        r2 = r2.size();	 Catch:{ all -> 0x0153 }
        r1.<init>(r2);	 Catch:{ all -> 0x0153 }
        r0.zzfwq = r1;	 Catch:{ all -> 0x0153 }
        r0 = r5.zzfwu;	 Catch:{ all -> 0x0153 }
        r0 = r0.zzfwg;	 Catch:{ all -> 0x0153 }
        r0 = r0.values();	 Catch:{ all -> 0x0153 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0153 }
        r1 = r0.hasNext();	 Catch:{ all -> 0x0153 }
        if (r1 == 0) goto L_0x00d4;	 Catch:{ all -> 0x0153 }
        r1 = r0.next();	 Catch:{ all -> 0x0153 }
        r1 = (com.google.android.gms.common.api.internal.zzz) r1;	 Catch:{ all -> 0x0153 }
        r2 = r1.zzahv();	 Catch:{ all -> 0x0153 }
        r3 = r6.getConnectionResult(r1);	 Catch:{ all -> 0x0153 }
        r4 = r5.zzfwu;	 Catch:{ all -> 0x0153 }
        r1 = r4.zza(r1, r3);	 Catch:{ all -> 0x0153 }
        if (r1 == 0) goto L_0x00c4;	 Catch:{ all -> 0x0153 }
        r1 = r5.zzfwu;	 Catch:{ all -> 0x0153 }
        r1 = r1.zzfwq;	 Catch:{ all -> 0x0153 }
        r3 = new com.google.android.gms.common.ConnectionResult;	 Catch:{ all -> 0x0153 }
        r4 = 16;	 Catch:{ all -> 0x0153 }
        r3.<init>(r4);	 Catch:{ all -> 0x0153 }
        r1.put(r2, r3);	 Catch:{ all -> 0x0153 }
        goto L_0x0097;	 Catch:{ all -> 0x0153 }
        r1 = r5.zzfwu;	 Catch:{ all -> 0x0153 }
        r1 = r1.zzfwq;	 Catch:{ all -> 0x0153 }
        goto L_0x00c0;	 Catch:{ all -> 0x0153 }
        r0 = r5.zzfwu;	 Catch:{ all -> 0x0153 }
        r6 = r6.zzahr();	 Catch:{ all -> 0x0153 }
        r0.zzfwq = r6;	 Catch:{ all -> 0x0153 }
        r6 = r5.zzfwu;	 Catch:{ all -> 0x0153 }
        r0 = r5.zzfwu;	 Catch:{ all -> 0x0153 }
        r0 = r0.zzajb();	 Catch:{ all -> 0x0153 }
        r6.zzfwt = r0;	 Catch:{ all -> 0x0153 }
        goto L_0x00fe;	 Catch:{ all -> 0x0153 }
        r0 = "ConnectionlessGAC";	 Catch:{ all -> 0x0153 }
        r1 = "Unexpected availability exception";	 Catch:{ all -> 0x0153 }
        r6 = r6.getException();	 Catch:{ all -> 0x0153 }
        android.util.Log.e(r0, r1, r6);	 Catch:{ all -> 0x0153 }
        r6 = r5.zzfwu;	 Catch:{ all -> 0x0153 }
        r0 = java.util.Collections.emptyMap();	 Catch:{ all -> 0x0153 }
        r6.zzfwq = r0;	 Catch:{ all -> 0x0153 }
        r6 = r5.zzfwu;	 Catch:{ all -> 0x0153 }
        r0 = new com.google.android.gms.common.ConnectionResult;	 Catch:{ all -> 0x0153 }
        r1 = 8;	 Catch:{ all -> 0x0153 }
        r0.<init>(r1);	 Catch:{ all -> 0x0153 }
        goto L_0x00dc;	 Catch:{ all -> 0x0153 }
        r6 = r5.zzfwu;	 Catch:{ all -> 0x0153 }
        r6 = r6.zzfwr;	 Catch:{ all -> 0x0153 }
        if (r6 == 0) goto L_0x0120;	 Catch:{ all -> 0x0153 }
        r6 = r5.zzfwu;	 Catch:{ all -> 0x0153 }
        r6 = r6.zzfwq;	 Catch:{ all -> 0x0153 }
        r0 = r5.zzfwu;	 Catch:{ all -> 0x0153 }
        r0 = r0.zzfwr;	 Catch:{ all -> 0x0153 }
        r6.putAll(r0);	 Catch:{ all -> 0x0153 }
        r6 = r5.zzfwu;	 Catch:{ all -> 0x0153 }
        r0 = r5.zzfwu;	 Catch:{ all -> 0x0153 }
        r0 = r0.zzajb();	 Catch:{ all -> 0x0153 }
        r6.zzfwt = r0;	 Catch:{ all -> 0x0153 }
        r6 = r5.zzfwu;	 Catch:{ all -> 0x0153 }
        r6 = r6.zzfwt;	 Catch:{ all -> 0x0153 }
        if (r6 != 0) goto L_0x0133;	 Catch:{ all -> 0x0153 }
        r6 = r5.zzfwu;	 Catch:{ all -> 0x0153 }
        r6.zzaiz();	 Catch:{ all -> 0x0153 }
        r6 = r5.zzfwu;	 Catch:{ all -> 0x0153 }
        r6.zzaja();	 Catch:{ all -> 0x0153 }
        goto L_0x0148;	 Catch:{ all -> 0x0153 }
        r6 = r5.zzfwu;	 Catch:{ all -> 0x0153 }
        r0 = 0;	 Catch:{ all -> 0x0153 }
        r6.zzfwp = false;	 Catch:{ all -> 0x0153 }
        r6 = r5.zzfwu;	 Catch:{ all -> 0x0153 }
        r6 = r6.zzfwj;	 Catch:{ all -> 0x0153 }
        r0 = r5.zzfwu;	 Catch:{ all -> 0x0153 }
        r0 = r0.zzfwt;	 Catch:{ all -> 0x0153 }
        r6.zzc(r0);	 Catch:{ all -> 0x0153 }
        r6 = r5.zzfwu;	 Catch:{ all -> 0x0153 }
        r6 = r6.zzfwl;	 Catch:{ all -> 0x0153 }
        r6.signalAll();	 Catch:{ all -> 0x0153 }
        goto L_0x0011;
        r6 = move-exception;
        r0 = r5.zzfwu;
        r0 = r0.zzfwa;
        r0.unlock();
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zzac.onComplete(com.google.android.gms.tasks.Task):void");
    }
}
