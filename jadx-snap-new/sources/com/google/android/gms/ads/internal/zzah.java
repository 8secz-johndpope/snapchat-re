package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.zzkk;

final class zzah implements Runnable {
    private /* synthetic */ zzkk zzaps;
    private /* synthetic */ zzag zzapt;

    zzah(zzag zzag, zzkk zzkk) {
        this.zzapt = zzag;
        this.zzaps = zzkk;
    }

    public final void run() {
        synchronized (this.zzapt.mLock) {
            if (this.zzapt.zzdf()) {
                this.zzapt.zze(this.zzaps);
            } else {
                this.zzapt.zzb(this.zzaps, 1);
            }
        }
    }
}
