package com.google.android.gms.ads.internal.js;

import com.google.android.gms.internal.zzahw;
import com.google.android.gms.internal.zzamg;

final class zzx implements zzamg {
    private /* synthetic */ zzn zzcfu;
    private /* synthetic */ zzae zzcfx;

    zzx(zzn zzn, zzae zzae) {
        this.zzcfu = zzn;
        this.zzcfx = zzae;
    }

    public final void run() {
        synchronized (this.zzcfu.mLock) {
            this.zzcfu.zzcfl = 1;
            zzahw.v("Failed loading new engine. Marking new engine destroyable.");
            this.zzcfx.zzmc();
        }
    }
}
