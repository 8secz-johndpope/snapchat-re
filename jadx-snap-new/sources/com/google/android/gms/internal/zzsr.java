package com.google.android.gms.internal;

import com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener;

@zzabh
public final class zzsr extends zzrw {
    private final OnContentAdLoadedListener zzcau;

    public zzsr(OnContentAdLoadedListener onContentAdLoadedListener) {
        this.zzcau = onContentAdLoadedListener;
    }

    public final void zza(zzrk zzrk) {
        this.zzcau.onContentAdLoaded(new zzrn(zzrk));
    }
}
