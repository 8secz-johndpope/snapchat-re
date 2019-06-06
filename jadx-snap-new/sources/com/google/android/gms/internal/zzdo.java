package com.google.android.gms.internal;

final class zzdo implements Runnable {
    private /* synthetic */ zzdm zzajh;
    private /* synthetic */ int zzaji;
    private /* synthetic */ boolean zzajj;

    zzdo(zzdm zzdm, int i, boolean z) {
        this.zzajh = zzdm;
        this.zzaji = i;
        this.zzajj = z;
    }

    public final void run() {
        zzba zzb = this.zzajh.zzb(this.zzaji, this.zzajj);
        this.zzajh.zzaiy = zzb;
        if (zzdm.zza(this.zzaji, zzb)) {
            this.zzajh.zza(this.zzaji + 1, this.zzajj);
        }
    }
}
