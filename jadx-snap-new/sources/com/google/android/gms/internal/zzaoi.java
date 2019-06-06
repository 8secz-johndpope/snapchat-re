package com.google.android.gms.internal;

import android.view.View;

final class zzaoi implements Runnable {
    private /* synthetic */ View val$view;
    private /* synthetic */ zzagq zzdps;
    private /* synthetic */ int zzdpt;
    private /* synthetic */ zzaog zzdpu;

    zzaoi(zzaog zzaog, View view, zzagq zzagq, int i) {
        this.zzdpu = zzaog;
        this.val$view = view;
        this.zzdps = zzagq;
        this.zzdpt = i;
    }

    public final void run() {
        this.zzdpu.zza(this.val$view, this.zzdps, this.zzdpt - 1);
    }
}
