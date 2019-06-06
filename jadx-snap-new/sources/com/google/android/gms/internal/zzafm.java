package com.google.android.gms.internal;

final class zzafm implements Runnable {
    private /* synthetic */ zzkk zzaps;
    private /* synthetic */ zzwi zzdai;
    private /* synthetic */ zzafl zzdaj;

    zzafm(zzafl zzafl, zzkk zzkk, zzwi zzwi) {
        this.zzdaj = zzafl;
        this.zzaps = zzkk;
        this.zzdai = zzwi;
    }

    public final void run() {
        this.zzdaj.zza(this.zzaps, this.zzdai);
    }
}
