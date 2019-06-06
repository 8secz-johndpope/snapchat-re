package com.google.android.gms.internal;

final class zzpl implements Runnable {
    private /* synthetic */ zzpk zzbyj;

    zzpl(zzpk zzpk) {
        this.zzbyj = zzpk;
    }

    public final void run() {
        if (this.zzbyj.zzbyi != null) {
            this.zzbyj.zzbyi.zzks();
            this.zzbyj.zzbyi.zzkr();
        }
        this.zzbyj.zzbyi = null;
    }
}
