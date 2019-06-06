package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.zzaky;
import com.google.android.gms.internal.zzro;
import com.google.android.gms.internal.zzsb;

final class zzbi implements Runnable {
    private /* synthetic */ zzro zzaoj;
    private /* synthetic */ zzbb zzaro;

    zzbi(zzbb zzbb, zzro zzro) {
        this.zzaro = zzbb;
        this.zzaoj = zzro;
    }

    public final void run() {
        try {
            ((zzsb) this.zzaro.zzanm.zzaup.get(this.zzaoj.getCustomTemplateId())).zzb(this.zzaoj);
        } catch (RemoteException e) {
            zzaky.zzc("Could not call onCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded().", e);
        }
    }
}
