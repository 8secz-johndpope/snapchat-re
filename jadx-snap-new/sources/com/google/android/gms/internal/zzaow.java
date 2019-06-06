package com.google.android.gms.internal;

final /* synthetic */ class zzaow implements Runnable {
    private final zzaou zzdrv;
    private final int zzdrw;
    private final int zzdrx;
    private final boolean zzdry;
    private final boolean zzdrz;

    zzaow(zzaou zzaou, int i, int i2, boolean z, boolean z2) {
        this.zzdrv = zzaou;
        this.zzdrw = i;
        this.zzdrx = i2;
        this.zzdry = z;
        this.zzdrz = z2;
    }

    public final void run() {
        this.zzdrv.zza(this.zzdrw, this.zzdrx, this.zzdry, this.zzdrz);
    }
}
