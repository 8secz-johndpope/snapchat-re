package com.google.android.gms.internal;

import com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener;

@zzabh
public final class zzsq extends zzrt {
    private final OnAppInstallAdLoadedListener zzcat;

    public zzsq(OnAppInstallAdLoadedListener onAppInstallAdLoadedListener) {
        this.zzcat = onAppInstallAdLoadedListener;
    }

    public final void zza(zzrg zzrg) {
        this.zzcat.onAppInstallAdLoaded(new zzrj(zzrg));
    }
}
