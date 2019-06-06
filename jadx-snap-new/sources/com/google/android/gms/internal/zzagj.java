package com.google.android.gms.internal;

final class zzagj implements zzalf<Void> {
    private /* synthetic */ zzalt zzdbl;

    zzagj(zzagf zzagf, zzalt zzalt) {
        this.zzdbl = zzalt;
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        zzagf.zzday.remove(this.zzdbl);
    }

    public final void zzb(Throwable th) {
        zzagf.zzday.remove(this.zzdbl);
    }
}
