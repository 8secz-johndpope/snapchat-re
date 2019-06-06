package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.zzaky;
import com.google.android.gms.internal.zzpm;

final class zzbg implements Runnable {
    private /* synthetic */ zzpm zzaoi;
    private /* synthetic */ zzbb zzaro;

    zzbg(zzbb zzbb, zzpm zzpm) {
        this.zzaro = zzbb;
        this.zzaoi = zzpm;
    }

    public final void run() {
        try {
            if (this.zzaro.zzanm.zzaum != null) {
                this.zzaro.zzanm.zzaum.zza(this.zzaoi);
            }
        } catch (RemoteException e) {
            zzaky.zzc("Could not call OnContentAdLoadedListener.onContentAdLoaded().", e);
        }
    }
}
