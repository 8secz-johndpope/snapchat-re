package com.google.android.gms.internal;

import android.os.RemoteException;

final class zzwd implements Runnable {
    private /* synthetic */ zzvw zzcjv;

    zzwd(zzwc zzwc, zzvw zzvw) {
        this.zzcjv = zzvw;
    }

    public final void run() {
        try {
            this.zzcjv.zzcjf.destroy();
        } catch (RemoteException e) {
            zzaky.zzc("Could not destroy mediation adapter.", e);
        }
    }
}
