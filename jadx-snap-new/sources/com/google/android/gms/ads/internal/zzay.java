package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.zzaly;

final /* synthetic */ class zzay implements Runnable {
    private final Runnable zzaot;
    private final zzax zzarh;

    zzay(zzax zzax, Runnable runnable) {
        this.zzarh = zzax;
        this.zzaot = runnable;
    }

    public final void run() {
        zzaly.zzdjt.execute(new zzaz(this.zzarh, this.zzaot));
    }
}
