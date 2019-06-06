package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzbt;

final class zzadp implements Runnable {
    private /* synthetic */ zzacf zzcwe;
    private /* synthetic */ zzacq zzcwf;
    private /* synthetic */ zzadn zzcwg;

    zzadp(zzadn zzadn, zzacf zzacf, zzacq zzacq) {
        this.zzcwg = zzadn;
        this.zzcwe = zzacf;
        this.zzcwf = zzacq;
    }

    public final void run() {
        zzacj zzb;
        try {
            zzb = this.zzcwg.zzb(this.zzcwe);
        } catch (Exception e) {
            zzbt.zzep().zza(e, "AdRequestServiceImpl.loadAdAsync");
            zzaky.zzc("Could not fetch ad response due to an Exception.", e);
            zzb = null;
        }
        if (zzb == null) {
            zzb = new zzacj(0);
        }
        try {
            this.zzcwf.zza(zzb);
        } catch (RemoteException e2) {
            zzaky.zzc("Fail to forward ad response.", e2);
        }
    }
}
