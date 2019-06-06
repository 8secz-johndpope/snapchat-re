package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

final class zzbp implements OnTouchListener {
    private /* synthetic */ zzbn zzasj;

    zzbp(zzbn zzbn) {
        this.zzasj = zzbn;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.zzasj.zzash != null) {
            this.zzasj.zzash.zza(motionEvent);
        }
        return false;
    }
}
