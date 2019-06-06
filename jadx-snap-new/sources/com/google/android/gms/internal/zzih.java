package com.google.android.gms.internal;

final class zzih implements zzhl {
    private /* synthetic */ zzif zzbay;

    zzih(zzif zzif) {
        this.zzbay = zzif;
    }

    public final void zzh(boolean z) {
        if (z) {
            this.zzbay.connect();
        } else {
            this.zzbay.disconnect();
        }
    }
}
