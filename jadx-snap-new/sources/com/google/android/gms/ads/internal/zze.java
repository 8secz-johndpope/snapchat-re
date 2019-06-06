package com.google.android.gms.ads.internal;

final /* synthetic */ class zze implements Runnable {
    private final zzbj zzanw;

    private zze(zzbj zzbj) {
        this.zzanw = zzbj;
    }

    static Runnable zza(zzbj zzbj) {
        return new zze(zzbj);
    }

    public final void run() {
        this.zzanw.pause();
    }
}
