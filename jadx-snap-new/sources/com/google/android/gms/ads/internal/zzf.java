package com.google.android.gms.ads.internal;

final /* synthetic */ class zzf implements Runnable {
    private final zzbj zzanw;

    private zzf(zzbj zzbj) {
        this.zzanw = zzbj;
    }

    static Runnable zza(zzbj zzbj) {
        return new zzf(zzbj);
    }

    public final void run() {
        this.zzanw.resume();
    }
}
