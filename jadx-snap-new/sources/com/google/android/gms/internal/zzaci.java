package com.google.android.gms.internal;

import java.lang.ref.WeakReference;

@zzabh
public final class zzaci extends zzacr {
    private final WeakReference<zzabx> zzctm;

    public zzaci(zzabx zzabx) {
        this.zzctm = new WeakReference(zzabx);
    }

    public final void zza(zzacj zzacj) {
        zzabx zzabx = (zzabx) this.zzctm.get();
        if (zzabx != null) {
            zzabx.zza(zzacj);
        }
    }
}
