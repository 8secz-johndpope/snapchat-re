package com.google.android.gms.ads.internal;

final /* synthetic */ class zzaz implements Runnable {
    private final Runnable zzaot;
    private final zzax zzarh;

    zzaz(zzax zzax, Runnable runnable) {
        this.zzarh = zzax;
        this.zzaot = runnable;
    }

    public final void run() {
        this.zzarh.zza(this.zzaot);
    }
}
