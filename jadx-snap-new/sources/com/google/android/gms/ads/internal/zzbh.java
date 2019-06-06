package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.zzahd;
import com.google.android.gms.internal.zzaky;
import com.google.android.gms.internal.zzpo;
import com.google.android.gms.internal.zzsb;

final class zzbh implements Runnable {
    private /* synthetic */ zzbb zzaro;
    private /* synthetic */ String zzaru;
    private /* synthetic */ zzahd zzarv;

    zzbh(zzbb zzbb, String str, zzahd zzahd) {
        this.zzaro = zzbb;
        this.zzaru = str;
        this.zzarv = zzahd;
    }

    public final void run() {
        try {
            ((zzsb) this.zzaro.zzanm.zzaup.get(this.zzaru)).zzb((zzpo) this.zzarv.zzdcp);
        } catch (RemoteException e) {
            zzaky.zzc("Could not call onCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded().", e);
        }
    }
}
