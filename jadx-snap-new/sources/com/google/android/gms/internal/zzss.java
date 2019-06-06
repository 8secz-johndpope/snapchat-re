package com.google.android.gms.internal;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener;

@zzabh
public final class zzss extends zzrz {
    private final OnCustomClickListener zzcav;

    public zzss(OnCustomClickListener onCustomClickListener) {
        this.zzcav = onCustomClickListener;
    }

    public final void zzb(zzro zzro, String str) {
        this.zzcav.onCustomClick(zzrr.zza(zzro), str);
    }
}
