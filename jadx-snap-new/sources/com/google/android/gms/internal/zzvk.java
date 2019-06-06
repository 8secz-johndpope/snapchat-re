package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.js.zzaa;

final class zzvk implements zzamg {
    private /* synthetic */ zzaa zzcgv;
    private /* synthetic */ zzamd zzcgx;

    zzvk(zzvi zzvi, zzamd zzamd, zzaa zzaa) {
        this.zzcgx = zzamd;
        this.zzcgv = zzaa;
    }

    public final void run() {
        this.zzcgx.setException(new zzuw("Unable to obtain a JavascriptEngine."));
        this.zzcgv.release();
    }
}
