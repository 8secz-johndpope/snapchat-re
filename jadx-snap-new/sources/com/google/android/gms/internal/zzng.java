package com.google.android.gms.internal;

import android.os.RemoteException;

final class zzng implements Runnable {
    private /* synthetic */ zznf zzbki;

    zzng(zznf zznf) {
        this.zzbki = zznf;
    }

    public final void run() {
        if (this.zzbki.zzbkh.zzapd != null) {
            try {
                this.zzbki.zzbkh.zzapd.onAdFailedToLoad(1);
            } catch (RemoteException e) {
                zzaky.zzc("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
