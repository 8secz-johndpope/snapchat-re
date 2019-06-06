package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.overlay.zzn;

final class zzaok implements zzn {
    private zzn zzccs;
    private zzaof zzdpv;

    public zzaok(zzaof zzaof, zzn zzn) {
        this.zzdpv = zzaof;
        this.zzccs = zzn;
    }

    public final void onPause() {
    }

    public final void onResume() {
    }

    public final void zzcf() {
        this.zzccs.zzcf();
        this.zzdpv.zztt();
    }

    public final void zzcg() {
        this.zzccs.zzcg();
        this.zzdpv.zznn();
    }
}
