package com.google.android.gms.internal;

final class zzuh implements zzuk {
    private /* synthetic */ int zzcdn;

    zzuh(zzua zzua, int i) {
        this.zzcdn = i;
    }

    public final void zzb(zzul zzul) {
        if (zzul.zzcdw != null) {
            zzul.zzcdw.onRewardedVideoAdFailedToLoad(this.zzcdn);
        }
    }
}
