package com.google.android.gms.ads.internal.js;

final /* synthetic */ class zzai implements Runnable {
    private final zzah zzcgh;
    private final zzc zzcgi;

    zzai(zzah zzah, zzc zzc) {
        this.zzcgh = zzah;
        this.zzcgi = zzc;
    }

    public final void run() {
        zzah zzah = this.zzcgh;
        zzc zzc = this.zzcgi;
        zzah.zzcgg.zzcfj.zze(zzc);
        zzc.destroy();
    }
}
