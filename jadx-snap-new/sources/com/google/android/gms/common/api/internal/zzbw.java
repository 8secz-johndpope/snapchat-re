package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Result;

public final class zzbw<O extends ApiOptions> extends zzak {
    private final GoogleApi<O> zzgaf;

    public zzbw(GoogleApi<O> googleApi) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.zzgaf = googleApi;
    }

    public final Looper getLooper() {
        return this.zzgaf.getLooper();
    }

    public final void zza(zzdh zzdh) {
    }

    public final void zzb(zzdh zzdh) {
    }

    public final <A extends zzb, R extends Result, T extends zzm<R, A>> T zzd(T t) {
        return this.zzgaf.zza(t);
    }

    public final <A extends zzb, T extends zzm<? extends Result, A>> T zze(T t) {
        return this.zzgaf.zzb((zzm) t);
    }
}
