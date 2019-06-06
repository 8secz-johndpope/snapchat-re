package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbt;

final class zzajt implements zzald<Throwable, T> {
    private /* synthetic */ zzajx zzdhd;

    zzajt(zzajr zzajr, zzajx zzajx) {
        this.zzdhd = zzajx;
    }

    public final /* synthetic */ zzalt zzc(Object obj) {
        Throwable th = (Throwable) obj;
        zzaky.zzb("Error occurred while dispatching http response in getter.", th);
        zzbt.zzep().zza(th, "HttpGetter.deliverResponse.1");
        return zzali.zzh(this.zzdhd.zznx());
    }
}
