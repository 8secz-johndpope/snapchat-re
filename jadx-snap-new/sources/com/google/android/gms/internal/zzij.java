package com.google.android.gms.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzg;

final class zzij implements zzg {
    private /* synthetic */ zzif zzbay;

    zzij(zzif zzif) {
        this.zzbay = zzif;
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        synchronized (this.zzbay.mLock) {
            this.zzbay.zzbax = null;
            if (this.zzbay.zzbaw != null) {
                this.zzbay.zzbaw = null;
            }
            this.zzbay.mLock.notifyAll();
        }
    }
}
