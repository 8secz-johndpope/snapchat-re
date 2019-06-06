package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbt;

final class zzalh implements zzalf {
    private /* synthetic */ String zzdjd;

    zzalh(String str) {
        this.zzdjd = str;
    }

    public final void onSuccess(Object obj) {
    }

    public final void zzb(Throwable th) {
        zzbt.zzep().zza(th, this.zzdjd);
    }
}
