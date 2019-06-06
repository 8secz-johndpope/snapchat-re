package com.google.android.gms.ads.internal.js;

final /* synthetic */ class zzr implements Runnable {
    private final zzc zzcfr;

    private zzr(zzc zzc) {
        this.zzcfr = zzc;
    }

    static Runnable zza(zzc zzc) {
        return new zzr(zzc);
    }

    public final void run() {
        this.zzcfr.destroy();
    }
}
