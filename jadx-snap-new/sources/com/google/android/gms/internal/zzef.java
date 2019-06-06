package com.google.android.gms.internal;

import java.util.concurrent.Callable;

public final class zzef implements Callable {
    private final zzdm zzagq;
    private final zzba zzakm;

    public zzef(zzdm zzdm, zzba zzba) {
        this.zzagq = zzdm;
        this.zzakm = zzba;
    }

    private final Void zzay() {
        if (this.zzagq.zzan() != null) {
            this.zzagq.zzan().get();
        }
        zzba zzam = this.zzagq.zzam();
        if (zzam != null) {
            try {
                synchronized (this.zzakm) {
                    zzfls.zza(this.zzakm, zzfls.zzc(zzam));
                }
            } catch (zzflr unused) {
            }
        }
        return null;
    }

    public final /* synthetic */ Object call() {
        return zzay();
    }
}
