package com.google.android.gms.internal;

import android.content.Context;

@zzabh
public final class zzagl implements zzagr {
    private zzags zzdbm;

    public zzagl(zzags zzags) {
        this.zzdbm = zzags;
    }

    public final zzagq zza(Context context, zzala zzala, zzacj zzacj) {
        if (zzacj.zzcui == null) {
            return null;
        }
        return new zzagf(context, zzala, zzacj.zzcui, zzacj.zzcno, this.zzdbm);
    }
}
