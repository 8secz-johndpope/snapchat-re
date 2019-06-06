package com.google.android.gms.internal;

final class zzamv implements Runnable {
    private /* synthetic */ zzamp zzdkz;

    zzamv(zzamp zzamp) {
        this.zzdkz = zzamp;
    }

    public final void run() {
        if (this.zzdkz.zzdky != null) {
            this.zzdkz.zzdky.onPaused();
            this.zzdkz.zzdky.zzss();
        }
    }
}
