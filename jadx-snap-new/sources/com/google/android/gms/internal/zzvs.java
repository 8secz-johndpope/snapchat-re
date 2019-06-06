package com.google.android.gms.internal;

@zzabh
public final class zzvs extends zzwm {
    private final Object mLock = new Object();
    private zzvx zzcin;
    private zzvr zzcio;

    public final void onAdClicked() {
        synchronized (this.mLock) {
            if (this.zzcio != null) {
                this.zzcio.zzci();
            }
        }
    }

    public final void onAdClosed() {
        synchronized (this.mLock) {
            if (this.zzcio != null) {
                this.zzcio.zzcj();
            }
        }
    }

    public final void onAdFailedToLoad(int i) {
        synchronized (this.mLock) {
            if (this.zzcin != null) {
                this.zzcin.zzv(i == 3 ? 1 : 2);
                this.zzcin = null;
            }
        }
    }

    public final void onAdImpression() {
        synchronized (this.mLock) {
            if (this.zzcio != null) {
                this.zzcio.zzcn();
            }
        }
    }

    public final void onAdLeftApplication() {
        synchronized (this.mLock) {
            if (this.zzcio != null) {
                this.zzcio.zzck();
            }
        }
    }

    /* JADX WARNING: Missing block: B:12:0x001c, code skipped:
            return;
     */
    public final void onAdLoaded() {
        /*
        r3 = this;
        r0 = r3.mLock;
        monitor-enter(r0);
        r1 = r3.zzcin;	 Catch:{ all -> 0x001d }
        if (r1 == 0) goto L_0x0012;
    L_0x0007:
        r1 = r3.zzcin;	 Catch:{ all -> 0x001d }
        r2 = 0;
        r1.zzv(r2);	 Catch:{ all -> 0x001d }
        r1 = 0;
        r3.zzcin = r1;	 Catch:{ all -> 0x001d }
        monitor-exit(r0);	 Catch:{ all -> 0x001d }
        return;
    L_0x0012:
        r1 = r3.zzcio;	 Catch:{ all -> 0x001d }
        if (r1 == 0) goto L_0x001b;
    L_0x0016:
        r1 = r3.zzcio;	 Catch:{ all -> 0x001d }
        r1.zzcm();	 Catch:{ all -> 0x001d }
    L_0x001b:
        monitor-exit(r0);	 Catch:{ all -> 0x001d }
        return;
    L_0x001d:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x001d }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzvs.onAdLoaded():void");
    }

    public final void onAdOpened() {
        synchronized (this.mLock) {
            if (this.zzcio != null) {
                this.zzcio.zzcl();
            }
        }
    }

    public final void onAppEvent(String str, String str2) {
        synchronized (this.mLock) {
            if (this.zzcio != null) {
                this.zzcio.zzc(str, str2);
            }
        }
    }

    public final void onVideoEnd() {
        synchronized (this.mLock) {
            if (this.zzcio != null) {
                this.zzcio.zzch();
            }
        }
    }

    public final void zza(zzvr zzvr) {
        synchronized (this.mLock) {
            this.zzcio = zzvr;
        }
    }

    public final void zza(zzvx zzvx) {
        synchronized (this.mLock) {
            this.zzcin = zzvx;
        }
    }

    /* JADX WARNING: Missing block: B:12:0x001c, code skipped:
            return;
     */
    public final void zza(com.google.android.gms.internal.zzwo r4) {
        /*
        r3 = this;
        r0 = r3.mLock;
        monitor-enter(r0);
        r1 = r3.zzcin;	 Catch:{ all -> 0x001d }
        if (r1 == 0) goto L_0x0012;
    L_0x0007:
        r1 = r3.zzcin;	 Catch:{ all -> 0x001d }
        r2 = 0;
        r1.zza(r2, r4);	 Catch:{ all -> 0x001d }
        r4 = 0;
        r3.zzcin = r4;	 Catch:{ all -> 0x001d }
        monitor-exit(r0);	 Catch:{ all -> 0x001d }
        return;
    L_0x0012:
        r4 = r3.zzcio;	 Catch:{ all -> 0x001d }
        if (r4 == 0) goto L_0x001b;
    L_0x0016:
        r4 = r3.zzcio;	 Catch:{ all -> 0x001d }
        r4.zzcm();	 Catch:{ all -> 0x001d }
    L_0x001b:
        monitor-exit(r0);	 Catch:{ all -> 0x001d }
        return;
    L_0x001d:
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x001d }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzvs.zza(com.google.android.gms.internal.zzwo):void");
    }

    public final void zzb(zzro zzro, String str) {
        synchronized (this.mLock) {
            if (this.zzcio != null) {
                this.zzcio.zza(zzro, str);
            }
        }
    }
}
