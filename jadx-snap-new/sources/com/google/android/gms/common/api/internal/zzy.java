package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

final class zzy implements zzcd {
    private /* synthetic */ zzv zzfwc;

    private zzy(zzv zzv) {
        this.zzfwc = zzv;
    }

    /* synthetic */ zzy(zzv zzv, zzw zzw) {
        this(zzv);
    }

    public final void zzc(ConnectionResult connectionResult) {
        this.zzfwc.zzfwa.lock();
        try {
            this.zzfwc.zzfvy = connectionResult;
            this.zzfwc.zzait();
        } finally {
            this.zzfwc.zzfwa.unlock();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x0041 in {4, 6, 9, 12} preds:[]
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
    public final void zzf(int r3, boolean r4) {
        /*
        r2 = this;
        r0 = r2.zzfwc;
        r0 = r0.zzfwa;
        r0.lock();
        r0 = r2.zzfwc;	 Catch:{ all -> 0x0036 }
        r0 = r0.zzfvz;	 Catch:{ all -> 0x0036 }
        if (r0 == 0) goto L_0x0026;	 Catch:{ all -> 0x0036 }
        r0 = r2.zzfwc;	 Catch:{ all -> 0x0036 }
        r1 = 0;	 Catch:{ all -> 0x0036 }
        r0.zzfvz = r1;	 Catch:{ all -> 0x0036 }
        r0 = r2.zzfwc;	 Catch:{ all -> 0x0036 }
        r0.zze(r3, r4);	 Catch:{ all -> 0x0036 }
        r3 = r2.zzfwc;
        r3 = r3.zzfwa;
        r3.unlock();
        return;
        r4 = r2.zzfwc;	 Catch:{ all -> 0x0036 }
        r0 = 1;	 Catch:{ all -> 0x0036 }
        r4.zzfvz = r0;	 Catch:{ all -> 0x0036 }
        r4 = r2.zzfwc;	 Catch:{ all -> 0x0036 }
        r4 = r4.zzfvr;	 Catch:{ all -> 0x0036 }
        r4.onConnectionSuspended(r3);	 Catch:{ all -> 0x0036 }
        goto L_0x001c;
        r3 = move-exception;
        r4 = r2.zzfwc;
        r4 = r4.zzfwa;
        r4.unlock();
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zzy.zzf(int, boolean):void");
    }

    public final void zzk(Bundle bundle) {
        this.zzfwc.zzfwa.lock();
        try {
            this.zzfwc.zzfvy = ConnectionResult.zzfqt;
            this.zzfwc.zzait();
        } finally {
            this.zzfwc.zzfwa.unlock();
        }
    }
}
