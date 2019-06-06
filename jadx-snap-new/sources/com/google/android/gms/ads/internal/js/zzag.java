package com.google.android.gms.ads.internal.js;

import com.google.android.gms.internal.zzahw;
import com.google.android.gms.internal.zzamg;

final class zzag implements zzamg {
    private /* synthetic */ zzaa zzcgf;

    zzag(zzae zzae, zzaa zzaa) {
        this.zzcgf = zzaa;
    }

    public final void run() {
        zzahw.v("Rejecting reference for JS Engine.");
        this.zzcgf.reject();
    }
}
