package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.common.internal.zzbq;
import com.google.android.gms.internal.zzkf;
import com.google.android.gms.internal.zzmy;

public final class InterstitialAd {
    private final zzmy zzaly;

    public InterstitialAd(Context context) {
        this.zzaly = new zzmy(context);
        zzbq.checkNotNull(context, "Context cannot be null");
    }

    public final void loadAd(AdRequest adRequest) {
        this.zzaly.zza(adRequest.zzbe());
    }

    public final void setAdListener(AdListener adListener) {
        this.zzaly.setAdListener(adListener);
        if (adListener == null || !(adListener instanceof zzkf)) {
            if (adListener == null) {
                this.zzaly.zza(null);
            }
            return;
        }
        this.zzaly.zza((zzkf) adListener);
    }

    public final void setAdUnitId(String str) {
        this.zzaly.setAdUnitId(str);
    }

    public final void setImmersiveMode(boolean z) {
        this.zzaly.setImmersiveMode(z);
    }

    public final void setRewardedVideoAdListener(RewardedVideoAdListener rewardedVideoAdListener) {
        this.zzaly.setRewardedVideoAdListener(rewardedVideoAdListener);
    }

    public final void show() {
        this.zzaly.show();
    }

    public final void zza(boolean z) {
        this.zzaly.zza(true);
    }
}
