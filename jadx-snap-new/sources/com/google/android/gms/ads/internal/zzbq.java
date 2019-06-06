package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.zzcu;
import com.google.android.gms.internal.zzcv;
import java.util.concurrent.Callable;

final class zzbq implements Callable<zzcv> {
    private /* synthetic */ zzbn zzasj;

    zzbq(zzbn zzbn) {
        this.zzasj = zzbn;
    }

    public final /* synthetic */ Object call() {
        return new zzcv(zzcu.zza(this.zzasj.zzapq.zzcu, this.zzasj.mContext, false));
    }
}
