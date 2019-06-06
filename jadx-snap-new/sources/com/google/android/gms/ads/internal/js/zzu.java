package com.google.android.gms.ads.internal.js;

final class zzu implements Runnable {
    private /* synthetic */ zzae zzcfs;
    private /* synthetic */ zzc zzcft;
    private /* synthetic */ zzn zzcfu;

    zzu(zzn zzn, zzae zzae, zzc zzc) {
        this.zzcfu = zzn;
        this.zzcfs = zzae;
        this.zzcft = zzc;
    }

    /* JADX WARNING: Missing block: B:12:0x0035, code skipped:
            return;
     */
    public final void run() {
        /*
        r3 = this;
        r0 = r3.zzcfu;
        r0 = r0.mLock;
        monitor-enter(r0);
        r1 = r3.zzcfs;	 Catch:{ all -> 0x0036 }
        r1 = r1.getStatus();	 Catch:{ all -> 0x0036 }
        r2 = -1;
        if (r1 == r2) goto L_0x0034;
    L_0x0010:
        r1 = r3.zzcfs;	 Catch:{ all -> 0x0036 }
        r1 = r1.getStatus();	 Catch:{ all -> 0x0036 }
        r2 = 1;
        if (r1 != r2) goto L_0x001a;
    L_0x0019:
        goto L_0x0034;
    L_0x001a:
        r1 = r3.zzcfs;	 Catch:{ all -> 0x0036 }
        r1.reject();	 Catch:{ all -> 0x0036 }
        r1 = com.google.android.gms.internal.zzaly.zzdjt;	 Catch:{ all -> 0x0036 }
        r2 = r3.zzcft;	 Catch:{ all -> 0x0036 }
        r2.getClass();	 Catch:{ all -> 0x0036 }
        r2 = com.google.android.gms.ads.internal.js.zzv.zza(r2);	 Catch:{ all -> 0x0036 }
        r1.execute(r2);	 Catch:{ all -> 0x0036 }
        r1 = "Could not receive loaded message in a timely manner. Rejecting.";
        com.google.android.gms.internal.zzahw.v(r1);	 Catch:{ all -> 0x0036 }
        monitor-exit(r0);	 Catch:{ all -> 0x0036 }
        return;
    L_0x0034:
        monitor-exit(r0);	 Catch:{ all -> 0x0036 }
        return;
    L_0x0036:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0036 }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.js.zzu.run():void");
    }
}
