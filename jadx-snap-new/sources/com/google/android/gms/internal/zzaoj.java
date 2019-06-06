package com.google.android.gms.internal;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;

final class zzaoj implements OnAttachStateChangeListener {
    private /* synthetic */ zzagq zzdps;
    private /* synthetic */ zzaog zzdpu;

    zzaoj(zzaog zzaog, zzagq zzagq) {
        this.zzdpu = zzaog;
        this.zzdps = zzagq;
    }

    public final void onViewAttachedToWindow(View view) {
        this.zzdpu.zza(view, this.zzdps, 10);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
