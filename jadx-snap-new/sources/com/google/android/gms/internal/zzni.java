package com.google.android.gms.internal;

import android.os.RemoteException;

final class zzni implements Runnable {
    private /* synthetic */ zznh zzbkj;

    zzni(zznh zznh) {
        this.zzbkj = zznh;
    }

    public final void run() {
        if (this.zzbkj.zzapd != null) {
            try {
                this.zzbkj.zzapd.onAdFailedToLoad(1);
            } catch (RemoteException e) {
                zzaky.zzc("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
