package com.google.android.gms.internal;

final class zzps implements Runnable {
    private /* synthetic */ zzpr zzbyr;

    zzps(zzpr zzpr) {
        this.zzbyr = zzpr;
    }

    public final void run() {
        if (this.zzbyr.zzbyi != null) {
            this.zzbyr.zzbyi.zzks();
            this.zzbyr.zzbyi.zzkr();
        }
        this.zzbyr.zzbyi = null;
    }
}
