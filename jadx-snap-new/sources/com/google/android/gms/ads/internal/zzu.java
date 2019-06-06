package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.zzaky;
import com.google.android.gms.internal.zzro;
import com.google.android.gms.internal.zzsb;

final class zzu implements Runnable {
    private /* synthetic */ zzq zzaog;
    private /* synthetic */ zzro zzaoj;

    zzu(zzq zzq, zzro zzro) {
        this.zzaog = zzq;
        this.zzaoj = zzro;
    }

    public final void run() {
        try {
            ((zzsb) this.zzaog.zzanm.zzaup.get(this.zzaoj.getCustomTemplateId())).zzb(this.zzaoj);
        } catch (RemoteException e) {
            zzaky.zzc("Could not call onCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded().", e);
        }
    }
}
