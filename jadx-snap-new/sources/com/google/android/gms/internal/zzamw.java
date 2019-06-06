package com.google.android.gms.internal;

final class zzamw implements Runnable {
    private /* synthetic */ zzamp zzdkz;

    zzamw(zzamp zzamp) {
        this.zzdkz = zzamp;
    }

    public final void run() {
        if (this.zzdkz.zzdky != null) {
            this.zzdkz.zzdky.zzsq();
        }
    }
}
