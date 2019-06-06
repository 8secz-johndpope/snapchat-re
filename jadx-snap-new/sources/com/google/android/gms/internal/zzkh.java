package com.google.android.gms.internal;

import com.google.android.gms.ads.AdListener;

@zzabh
public final class zzkh extends zzlj {
    private final AdListener zzbgu;

    public zzkh(AdListener adListener) {
        this.zzbgu = adListener;
    }

    public final void onAdClicked() {
        this.zzbgu.onAdClicked();
    }

    public final void onAdClosed() {
        this.zzbgu.onAdClosed();
    }

    public final void onAdFailedToLoad(int i) {
        this.zzbgu.onAdFailedToLoad(i);
    }

    public final void onAdImpression() {
        this.zzbgu.onAdImpression();
    }

    public final void onAdLeftApplication() {
        this.zzbgu.onAdLeftApplication();
    }

    public final void onAdLoaded() {
        this.zzbgu.onAdLoaded();
    }

    public final void onAdOpened() {
        this.zzbgu.onAdOpened();
    }
}
