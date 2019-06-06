package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.js.zzc;
import com.google.android.gms.ads.internal.js.zzn;

@zzabh
public final class zzvf {
    private static zzajm<zzc> zzcgp = new zzvg();
    private static zzajm<zzc> zzcgq = new zzvh();
    private final zzn zzcgr;

    public zzvf(Context context, zzala zzala, String str) {
        this.zzcgr = new zzn(context, zzala, str, zzcgp, zzcgq);
    }

    public final <I, O> zzux<I, O> zza(String str, zzva<I> zzva, zzuz<O> zzuz) {
        return new zzvi(this.zzcgr, str, zzva, zzuz);
    }
}
