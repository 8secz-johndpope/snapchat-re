package com.google.android.gms.internal;

final class zzamx implements Runnable {
    private /* synthetic */ zzamp zzdkz;

    zzamx(zzamp zzamp) {
        this.zzdkz = zzamp;
    }

    public final void run() {
        if (this.zzdkz.zzdky != null) {
            this.zzdkz.zzdky.onPaused();
        }
    }
}
