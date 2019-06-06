package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.zzkk;

final class zzai implements Runnable {
    private /* synthetic */ zzkk zzaps;
    private /* synthetic */ zzag zzapt;
    private /* synthetic */ int zzapu;

    zzai(zzag zzag, zzkk zzkk, int i) {
        this.zzapt = zzag;
        this.zzaps = zzkk;
        this.zzapu = i;
    }

    public final void run() {
        synchronized (this.zzapt.mLock) {
            this.zzapt.zzb(this.zzaps, this.zzapu);
        }
    }
}
