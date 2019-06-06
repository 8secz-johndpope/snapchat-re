package com.google.android.gms.internal;

import android.os.RemoteException;
import defpackage.bbb.a;

final class zzxn implements Runnable {
    private /* synthetic */ zzxi zzckk;
    private /* synthetic */ a zzckl;

    zzxn(zzxi zzxi, a aVar) {
        this.zzckk = zzxi;
        this.zzckl = aVar;
    }

    public final void run() {
        try {
            this.zzckk.zzckb.onAdFailedToLoad(zzxu.zza(this.zzckl));
        } catch (RemoteException e) {
            zzaky.zzc("Could not call onAdFailedToLoad.", e);
        }
    }
}
