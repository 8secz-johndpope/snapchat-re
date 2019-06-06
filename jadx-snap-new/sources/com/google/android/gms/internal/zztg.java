package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.zzf;

final class zztg implements zzf {
    final /* synthetic */ zzte zzcdd;
    private /* synthetic */ zzamd zzcde;
    private /* synthetic */ zzsy zzcdf;

    zztg(zzte zzte, zzamd zzamd, zzsy zzsy) {
        this.zzcdd = zzte;
        this.zzcde = zzamd;
        this.zzcdf = zzsy;
    }

    public final void onConnected(Bundle bundle) {
        synchronized (this.zzcdd.mLock) {
            if (this.zzcdd.zzcdc) {
                return;
            }
            this.zzcdd.zzcdc = true;
            zzsx zzd = this.zzcdd.zzcdb;
            if (zzd == null) {
                return;
            }
            this.zzcde.zza(new zzti(this.zzcde, zzaid.zzb(new zzth(this, zzd, this.zzcde, this.zzcdf))), zzaly.zzdju);
        }
    }

    public final void onConnectionSuspended(int i) {
    }
}
