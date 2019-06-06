package com.google.android.gms.internal;

final class zzpn implements Runnable {
    private /* synthetic */ zzpm zzbym;

    zzpn(zzpm zzpm) {
        this.zzbym = zzpm;
    }

    public final void run() {
        if (this.zzbym.zzbyi != null) {
            this.zzbym.zzbyi.zzks();
            this.zzbym.zzbyi.zzkr();
        }
        this.zzbym.zzbyi = null;
    }
}
