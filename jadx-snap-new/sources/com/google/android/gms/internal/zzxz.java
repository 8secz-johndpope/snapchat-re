package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.zzbt;

final class zzxz implements Runnable {
    private /* synthetic */ AdOverlayInfoParcel zzaqn;
    private /* synthetic */ zzxx zzckr;

    zzxz(zzxx zzxx, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zzckr = zzxx;
        this.zzaqn = adOverlayInfoParcel;
    }

    public final void run() {
        zzbt.zzej();
        zzl.zza(this.zzckr.zzckp, this.zzaqn, true);
    }
}
