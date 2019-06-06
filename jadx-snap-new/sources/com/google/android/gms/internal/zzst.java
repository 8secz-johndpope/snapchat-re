package com.google.android.gms.internal;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener;

@zzabh
public final class zzst extends zzsc {
    private final OnCustomTemplateAdLoadedListener zzcaw;

    public zzst(OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener) {
        this.zzcaw = onCustomTemplateAdLoadedListener;
    }

    public final void zzb(zzro zzro) {
        this.zzcaw.onCustomTemplateAdLoaded(zzrr.zza(zzro));
    }
}
