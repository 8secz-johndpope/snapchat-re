package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbt;

@zzabh
public final class zzanv extends zzahs {
    final zzann zzdly;
    final zzany zzdol;
    private final String zzdom;

    zzanv(zzann zzann, zzany zzany, String str) {
        this.zzdly = zzann;
        this.zzdol = zzany;
        this.zzdom = str;
        zzbt.zzff().zza(this);
    }

    public final void onStop() {
        this.zzdol.abort();
    }

    public final void zzdo() {
        try {
            this.zzdol.zzdc(this.zzdom);
        } finally {
            zzaij.zzdfn.post(new zzanw(this));
        }
    }
}
