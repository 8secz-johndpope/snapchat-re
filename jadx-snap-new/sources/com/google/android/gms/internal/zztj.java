package com.google.android.gms.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzg;

final class zztj implements zzg {
    private /* synthetic */ zzte zzcdd;
    private /* synthetic */ zzamd zzcde;

    zztj(zzte zzte, zzamd zzamd) {
        this.zzcdd = zzte;
        this.zzcde = zzamd;
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        synchronized (this.zzcdd.mLock) {
            this.zzcde.setException(new RuntimeException("Connection failed."));
        }
    }
}
