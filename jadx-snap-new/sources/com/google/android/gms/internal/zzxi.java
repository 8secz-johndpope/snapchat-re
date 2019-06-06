package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import defpackage.bbb.a;
import defpackage.bbf;
import defpackage.bbg;
import defpackage.bbh;
import defpackage.bbi;

@zzabh
public final class zzxi<NETWORK_EXTRAS extends bbi, SERVER_PARAMETERS extends bbh> implements bbf, bbg {
    private final zzwl zzckb;

    public zzxi(zzwl zzwl) {
        this.zzckb = zzwl;
    }

    public final void onFailedToReceiveAd(MediationBannerAdapter<?, ?> mediationBannerAdapter, a aVar) {
        String valueOf = String.valueOf(aVar);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 47);
        stringBuilder.append("Adapter called onFailedToReceiveAd with error. ");
        stringBuilder.append(valueOf);
        zzaky.zzby(stringBuilder.toString());
        zzlc.zzij();
        if (zzako.zzsa()) {
            try {
                this.zzckb.onAdFailedToLoad(zzxu.zza(aVar));
                return;
            } catch (RemoteException e) {
                zzaky.zzc("Could not call onAdFailedToLoad.", e);
                return;
            }
        }
        zzaky.zzcz("onFailedToReceiveAd must be called on the main UI thread.");
        zzako.zzaju.post(new zzxn(this, aVar));
    }

    public final void onFailedToReceiveAd(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter, a aVar) {
        String valueOf = String.valueOf(aVar);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 47);
        stringBuilder.append("Adapter called onFailedToReceiveAd with error ");
        stringBuilder.append(valueOf);
        stringBuilder.append(".");
        zzaky.zzby(stringBuilder.toString());
        zzlc.zzij();
        if (zzako.zzsa()) {
            try {
                this.zzckb.onAdFailedToLoad(zzxu.zza(aVar));
                return;
            } catch (RemoteException e) {
                zzaky.zzc("Could not call onAdFailedToLoad.", e);
                return;
            }
        }
        zzaky.zzcz("onFailedToReceiveAd must be called on the main UI thread.");
        zzako.zzaju.post(new zzxs(this, aVar));
    }
}
