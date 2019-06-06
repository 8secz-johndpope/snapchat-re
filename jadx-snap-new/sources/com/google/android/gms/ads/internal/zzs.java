package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.zzaky;
import com.google.android.gms.internal.zzpk;

final class zzs implements Runnable {
    private /* synthetic */ zzq zzaog;
    private /* synthetic */ zzpk zzaoh;

    zzs(zzq zzq, zzpk zzpk) {
        this.zzaog = zzq;
        this.zzaoh = zzpk;
    }

    public final void run() {
        try {
            if (this.zzaog.zzanm.zzaul != null) {
                this.zzaog.zzanm.zzaul.zza(this.zzaoh);
            }
        } catch (RemoteException e) {
            zzaky.zzc("Could not call OnAppInstallAdLoadedListener.onAppInstallAdLoaded().", e);
        }
    }
}
