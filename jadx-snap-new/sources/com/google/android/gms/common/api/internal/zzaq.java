package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.zzj;
import java.lang.ref.WeakReference;

final class zzaq implements zzj {
    private final Api<?> zzfop;
    private final boolean zzfvo;
    private final WeakReference<zzao> zzfxu;

    public zzaq(zzao zzao, Api<?> api, boolean z) {
        this.zzfxu = new WeakReference(zzao);
        this.zzfop = api;
        this.zzfvo = z;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:24:0x0059 in {2, 5, 6, 12, 16, 20, 23} preds:[]
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
    public final void zzf(com.google.android.gms.common.ConnectionResult r5) {
        /*
        r4 = this;
        r0 = r4.zzfxu;
        r0 = r0.get();
        r0 = (com.google.android.gms.common.api.internal.zzao) r0;
        if (r0 != 0) goto L_0x000b;
        return;
        r1 = android.os.Looper.myLooper();
        r2 = r0.zzfxd;
        r2 = r2.zzfvq;
        r2 = r2.getLooper();
        r3 = 0;
        if (r1 != r2) goto L_0x001e;
        r1 = 1;
        goto L_0x001f;
        r1 = 0;
        r2 = "onReportServiceBinding must be called on the GoogleApiClient handler thread";
        com.google.android.gms.common.internal.zzbq.zza(r1, r2);
        r1 = r0.zzfwa;
        r1.lock();
        r1 = r0.zzbs(0);	 Catch:{ all -> 0x0050 }
        if (r1 != 0) goto L_0x0039;
        r5 = r0.zzfwa;
        r5.unlock();
        return;
        r1 = r5.isSuccess();	 Catch:{ all -> 0x0050 }
        if (r1 != 0) goto L_0x0046;	 Catch:{ all -> 0x0050 }
        r1 = r4.zzfop;	 Catch:{ all -> 0x0050 }
        r2 = r4.zzfvo;	 Catch:{ all -> 0x0050 }
        r0.zzb(r5, r1, r2);	 Catch:{ all -> 0x0050 }
        r5 = r0.zzajk();	 Catch:{ all -> 0x0050 }
        if (r5 == 0) goto L_0x0031;	 Catch:{ all -> 0x0050 }
        r0.zzajl();	 Catch:{ all -> 0x0050 }
        goto L_0x0031;
        r5 = move-exception;
        r0 = r0.zzfwa;
        r0.unlock();
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zzaq.zzf(com.google.android.gms.common.ConnectionResult):void");
    }
}
