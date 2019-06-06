package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.gmsg.zzt;

final class zzaax implements zzalf<zzaof> {
    private /* synthetic */ String zzcqs;
    private /* synthetic */ zzt zzcqt;

    zzaax(zzaar zzaar, String str, zzt zzt) {
        this.zzcqs = str;
        this.zzcqt = zzt;
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        ((zzaof) obj).zza(this.zzcqs, this.zzcqt);
    }

    public final void zzb(Throwable th) {
    }
}
