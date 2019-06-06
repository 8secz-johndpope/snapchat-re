package com.google.android.gms.internal;

final class zzamr implements Runnable {
    private /* synthetic */ zzamp zzdkz;

    zzamr(zzamp zzamp) {
        this.zzdkz = zzamp;
    }

    public final void run() {
        if (this.zzdkz.zzdky != null) {
            this.zzdkz.zzdky.zzsr();
        }
    }
}
