package com.google.android.gms.ads.internal.js;

import com.google.android.gms.internal.zzahw;
import com.google.android.gms.internal.zzami;

final class zzac implements zzami<zzaj> {
    private /* synthetic */ zzaa zzcgc;

    zzac(zzaa zzaa) {
        this.zzcgc = zzaa;
    }

    public final /* synthetic */ void zze(Object obj) {
        zzahw.v("Releasing engine reference.");
        this.zzcgc.zzcga.zzmb();
    }
}
