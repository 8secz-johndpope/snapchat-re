package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;
import com.google.android.gms.common.internal.zzbq;
import com.google.android.gms.dynamic.zzn;

@zzabh
public final class zzagc implements MediationRewardedVideoAdListener {
    private final zzafz zzdaw;

    public zzagc(zzafz zzafz) {
        this.zzdaw = zzafz;
    }

    public final void onAdClosed(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        zzbq.zzgn("onAdClosed must be called on the main UI thread.");
        zzaky.zzby("Adapter called onAdClosed.");
        try {
            this.zzdaw.zzq(zzn.zzz(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            zzaky.zzc("Could not call onAdClosed.", e);
        }
    }

    public final void onAdFailedToLoad(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, int i) {
        zzbq.zzgn("onAdFailedToLoad must be called on the main UI thread.");
        zzaky.zzby("Adapter called onAdFailedToLoad.");
        try {
            this.zzdaw.zzd(zzn.zzz(mediationRewardedVideoAdAdapter), i);
        } catch (RemoteException e) {
            zzaky.zzc("Could not call onAdFailedToLoad.", e);
        }
    }

    public final void onAdLeftApplication(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        zzbq.zzgn("onAdLeftApplication must be called on the main UI thread.");
        zzaky.zzby("Adapter called onAdLeftApplication.");
        try {
            this.zzdaw.zzs(zzn.zzz(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            zzaky.zzc("Could not call onAdLeftApplication.", e);
        }
    }

    public final void onAdLoaded(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        zzbq.zzgn("onAdLoaded must be called on the main UI thread.");
        zzaky.zzby("Adapter called onAdLoaded.");
        try {
            this.zzdaw.zzn(zzn.zzz(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            zzaky.zzc("Could not call onAdLoaded.", e);
        }
    }

    public final void onAdOpened(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        zzbq.zzgn("onAdOpened must be called on the main UI thread.");
        zzaky.zzby("Adapter called onAdOpened.");
        try {
            this.zzdaw.zzo(zzn.zzz(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            zzaky.zzc("Could not call onAdOpened.", e);
        }
    }

    public final void onInitializationSucceeded(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        zzbq.zzgn("onInitializationSucceeded must be called on the main UI thread.");
        zzaky.zzby("Adapter called onInitializationSucceeded.");
        try {
            this.zzdaw.zzm(zzn.zzz(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            zzaky.zzc("Could not call onInitializationSucceeded.", e);
        }
    }

    public final void onRewarded(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, RewardItem rewardItem) {
        zzbq.zzgn("onRewarded must be called on the main UI thread.");
        zzaky.zzby("Adapter called onRewarded.");
        if (rewardItem != null) {
            try {
                this.zzdaw.zza(zzn.zzz(mediationRewardedVideoAdAdapter), new zzagd(rewardItem));
                return;
            } catch (RemoteException e) {
                zzaky.zzc("Could not call onRewarded.", e);
                return;
            }
        }
        this.zzdaw.zza(zzn.zzz(mediationRewardedVideoAdAdapter), new zzagd("", 1));
    }

    public final void onVideoCompleted(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        zzbq.zzgn("onVideoCompleted must be called on the main UI thread.");
        zzaky.zzby("Adapter called onVideoCompleted.");
        try {
            this.zzdaw.zzt(zzn.zzz(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            zzaky.zzc("Could not call onVideoCompleted.", e);
        }
    }

    public final void onVideoStarted(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        zzbq.zzgn("onVideoStarted must be called on the main UI thread.");
        zzaky.zzby("Adapter called onVideoStarted.");
        try {
            this.zzdaw.zzp(zzn.zzz(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            zzaky.zzc("Could not call onVideoStarted.", e);
        }
    }
}
