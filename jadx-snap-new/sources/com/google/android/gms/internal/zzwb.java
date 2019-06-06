package com.google.android.gms.internal;

final class zzwb implements Runnable {
    private /* synthetic */ zzvz zzcjs;
    private /* synthetic */ zzalt zzcjt;

    zzwb(zzvz zzvz, zzalt zzalt) {
        this.zzcjs = zzvz;
        this.zzcjt = zzalt;
    }

    public final void run() {
        for (zzalt zzalt : this.zzcjs.zzcjo.keySet()) {
            if (zzalt != this.zzcjt) {
                ((zzvt) this.zzcjs.zzcjo.get(zzalt)).cancel();
            }
        }
    }
}
