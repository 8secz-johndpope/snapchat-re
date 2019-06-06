package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzl;

final class zzao implements Runnable {
    private /* synthetic */ AdOverlayInfoParcel zzaqn;
    private /* synthetic */ zzan zzaqo;

    zzao(zzan zzan, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zzaqo = zzan;
        this.zzaqn = adOverlayInfoParcel;
    }

    public final void run() {
        zzbt.zzej();
        zzl.zza(this.zzaqo.zzaql.zzanm.zzaiq, this.zzaqn, true);
    }
}
