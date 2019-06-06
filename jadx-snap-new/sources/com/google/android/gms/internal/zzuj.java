package com.google.android.gms.internal;

import android.os.RemoteException;

final class zzuj implements Runnable {
    private /* synthetic */ zzuk zzcdr;
    private /* synthetic */ zzul zzcds;

    zzuj(zztl zztl, zzuk zzuk, zzul zzul) {
        this.zzcdr = zzuk;
        this.zzcds = zzul;
    }

    public final void run() {
        try {
            this.zzcdr.zzb(this.zzcds);
        } catch (RemoteException e) {
            zzaky.zzc("Could not propagate interstitial ad event.", e);
        }
    }
}
