package com.google.android.gms.internal;

final class zzamq implements Runnable {
    private /* synthetic */ zzamp zzdkz;

    zzamq(zzamp zzamp) {
        this.zzdkz = zzamp;
    }

    public final void run() {
        if (this.zzdkz.zzdky != null) {
            this.zzdkz.zzdky.zzsp();
        }
    }
}
