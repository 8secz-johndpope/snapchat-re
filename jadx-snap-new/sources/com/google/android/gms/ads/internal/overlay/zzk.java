package com.google.android.gms.ads.internal.overlay;

import android.graphics.drawable.Drawable;

final class zzk implements Runnable {
    private /* synthetic */ Drawable zzcnh;
    private /* synthetic */ zzj zzcni;

    zzk(zzj zzj, Drawable drawable) {
        this.zzcni = zzj;
        this.zzcnh = drawable;
    }

    public final void run() {
        this.zzcni.zzcne.mActivity.getWindow().setBackgroundDrawable(this.zzcnh);
    }
}
