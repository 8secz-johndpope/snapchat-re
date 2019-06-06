package com.google.android.gms.internal;

import android.view.MotionEvent;
import android.view.View;

final class zzqk implements zzpt {
    private /* synthetic */ View zzbzy;
    private /* synthetic */ zzqj zzbzz;

    zzqk(zzqj zzqj, View view) {
        this.zzbzz = zzqj;
        this.zzbzy = view;
    }

    public final void zzc(MotionEvent motionEvent) {
        this.zzbzz.onTouch(null, motionEvent);
    }

    public final void zzkl() {
        this.zzbzz.onClick(this.zzbzy);
    }
}
