package com.google.android.gms.ads.internal.js;

final /* synthetic */ class zzq implements Runnable {
    private final zzn zzcfm;
    private final zzae zzcfp;
    private final zzc zzcfq;

    zzq(zzn zzn, zzae zzae, zzc zzc) {
        this.zzcfm = zzn;
        this.zzcfp = zzae;
        this.zzcfq = zzc;
    }

    public final void run() {
        this.zzcfm.zza(this.zzcfp, this.zzcfq);
    }
}
