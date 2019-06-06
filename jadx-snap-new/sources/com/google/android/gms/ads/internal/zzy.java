package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.zzahd;
import com.google.android.gms.internal.zzaij;
import com.google.android.gms.internal.zzapy;

final /* synthetic */ class zzy implements zzapy {
    private final zzahd zzaos;
    private final Runnable zzaot;

    zzy(zzahd zzahd, Runnable runnable) {
        this.zzaos = zzahd;
        this.zzaot = runnable;
    }

    public final void zzdb() {
        zzahd zzahd = this.zzaos;
        Runnable runnable = this.zzaot;
        if (!zzahd.zzdci) {
            zzbt.zzel();
            zzaij.zzc(runnable);
        }
    }
}
