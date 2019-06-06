package com.google.android.gms.internal;

import android.view.ViewTreeObserver.OnScrollChangedListener;
import java.lang.ref.WeakReference;

final class zzaam implements OnScrollChangedListener {
    private /* synthetic */ zzaaf zzcqd;
    private /* synthetic */ WeakReference zzcqe;

    zzaam(zzaaf zzaaf, WeakReference weakReference) {
        this.zzcqd = zzaaf;
        this.zzcqe = weakReference;
    }

    public final void onScrollChanged() {
        this.zzcqd.zza(this.zzcqe, true);
    }
}
