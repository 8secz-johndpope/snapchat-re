package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbt;

final class zzanw implements Runnable {
    private /* synthetic */ zzanv zzdon;

    zzanw(zzanv zzanv) {
        this.zzdon = zzanv;
    }

    public final void run() {
        zzbt.zzff().zzb(this.zzdon);
    }
}
