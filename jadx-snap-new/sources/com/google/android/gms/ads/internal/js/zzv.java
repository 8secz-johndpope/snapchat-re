package com.google.android.gms.ads.internal.js;

final /* synthetic */ class zzv implements Runnable {
    private final zzc zzcfr;

    private zzv(zzc zzc) {
        this.zzcfr = zzc;
    }

    static Runnable zza(zzc zzc) {
        return new zzv(zzc);
    }

    public final void run() {
        this.zzcfr.destroy();
    }
}
