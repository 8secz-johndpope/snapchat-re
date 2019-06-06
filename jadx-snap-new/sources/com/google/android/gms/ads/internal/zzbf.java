package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.zzaky;
import com.google.android.gms.internal.zzpk;

final class zzbf implements Runnable {
    private /* synthetic */ zzpk zzaoh;
    private /* synthetic */ zzbb zzaro;

    zzbf(zzbb zzbb, zzpk zzpk) {
        this.zzaro = zzbb;
        this.zzaoh = zzpk;
    }

    public final void run() {
        try {
            if (this.zzaro.zzanm.zzaul != null) {
                this.zzaro.zzanm.zzaul.zza(this.zzaoh);
            }
        } catch (RemoteException e) {
            zzaky.zzc("Could not call OnAppInstallAdLoadedListener.onAppInstallAdLoaded().", e);
        }
    }
}
