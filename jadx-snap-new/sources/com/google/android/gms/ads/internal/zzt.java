package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.zzaky;
import com.google.android.gms.internal.zzpm;

final class zzt implements Runnable {
    private /* synthetic */ zzq zzaog;
    private /* synthetic */ zzpm zzaoi;

    zzt(zzq zzq, zzpm zzpm) {
        this.zzaog = zzq;
        this.zzaoi = zzpm;
    }

    public final void run() {
        try {
            if (this.zzaog.zzanm.zzaum != null) {
                this.zzaog.zzanm.zzaum.zza(this.zzaoi);
            }
        } catch (RemoteException e) {
            zzaky.zzc("Could not call OnContentAdLoadedListener.onContentAdLoaded().", e);
        }
    }
}
