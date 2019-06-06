package com.google.android.gms.ads.internal.js;

import com.google.android.gms.internal.zzcv;

final /* synthetic */ class zzo implements Runnable {
    private final zzn zzcfm;
    private final zzcv zzcfn;
    private final zzae zzcfo;

    zzo(zzn zzn, zzcv zzcv, zzae zzae) {
        this.zzcfm = zzn;
        this.zzcfn = zzcv;
        this.zzcfo = zzae;
    }

    public final void run() {
        this.zzcfm.zza(this.zzcfn, this.zzcfo);
    }
}
