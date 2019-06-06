package com.google.android.gms.internal;

final class zzmx extends zzle {
    private /* synthetic */ zzmw zzbka;

    zzmx(zzmw zzmw) {
        this.zzbka = zzmw;
    }

    public final void onAdFailedToLoad(int i) {
        this.zzbka.zzbjt.zza(this.zzbka.zzbh());
        super.onAdFailedToLoad(i);
    }

    public final void onAdLoaded() {
        this.zzbka.zzbjt.zza(this.zzbka.zzbh());
        super.onAdLoaded();
    }
}
