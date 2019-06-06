package com.google.android.gms.internal;

import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;

@zzabh
public final class zzpe extends zzpc {
    private final OnCustomRenderedAdLoadedListener zzbjx;

    public zzpe(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.zzbjx = onCustomRenderedAdLoadedListener;
    }

    public final void zza(zzoy zzoy) {
        this.zzbjx.onCustomRenderedAdLoaded(new zzox(zzoy));
    }
}
