package com.google.android.gms.internal;

import java.util.concurrent.Future;

final class zzaih implements Runnable {
    private /* synthetic */ zzamd zzcde;
    private /* synthetic */ Future zzdfl;

    zzaih(zzamd zzamd, Future future) {
        this.zzcde = zzamd;
        this.zzdfl = future;
    }

    public final void run() {
        if (this.zzcde.isCancelled()) {
            this.zzdfl.cancel(true);
        }
    }
}
