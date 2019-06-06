package com.google.android.gms.internal;

import android.view.MotionEvent;
import android.view.View;

final class zzqn implements zzpt {
    private /* synthetic */ View zzbzy;
    private /* synthetic */ zzql zzcaf;

    zzqn(zzql zzql, View view) {
        this.zzcaf = zzql;
        this.zzbzy = view;
    }

    public final void zzc(MotionEvent motionEvent) {
        this.zzcaf.onTouch(null, motionEvent);
    }

    public final void zzkl() {
        if (this.zzcaf.zza(zzql.zzbzo)) {
            this.zzcaf.onClick(this.zzbzy);
        }
    }
}
