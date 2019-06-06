package com.google.android.gms.internal;

import java.util.concurrent.Callable;

final class zzwa implements Callable<zzvw> {
    private /* synthetic */ zzvt zzcjr;
    private /* synthetic */ zzvz zzcjs;

    zzwa(zzvz zzvz, zzvt zzvt) {
        this.zzcjs = zzvz;
        this.zzcjr = zzvt;
    }

    private final zzvw zzmo() {
        synchronized (this.zzcjs.mLock) {
            if (this.zzcjs.zzcjn) {
                return null;
            }
            return this.zzcjr.zza(this.zzcjs.mStartTime, this.zzcjs.zzcjl);
        }
    }

    public final /* synthetic */ Object call() {
        return zzmo();
    }
}
