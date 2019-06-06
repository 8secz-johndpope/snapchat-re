package com.google.android.gms.internal;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import java.lang.ref.WeakReference;

final class zzaal implements OnGlobalLayoutListener {
    private /* synthetic */ zzaaf zzcqd;
    private /* synthetic */ WeakReference zzcqe;

    zzaal(zzaaf zzaaf, WeakReference weakReference) {
        this.zzcqd = zzaaf;
        this.zzcqe = weakReference;
    }

    public final void onGlobalLayout() {
        this.zzcqd.zza(this.zzcqe, false);
    }
}
