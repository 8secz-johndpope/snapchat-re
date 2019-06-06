package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.gmsg.zzt;

final class zzaay implements zzalf<zzaof> {
    private /* synthetic */ String zzcqs;
    private /* synthetic */ zzt zzcqt;

    zzaay(zzaar zzaar, String str, zzt zzt) {
        this.zzcqs = str;
        this.zzcqt = zzt;
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        ((zzaof) obj).zzb(this.zzcqs, this.zzcqt);
    }

    public final void zzb(Throwable th) {
    }
}
