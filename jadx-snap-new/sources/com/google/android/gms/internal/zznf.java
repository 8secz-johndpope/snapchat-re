package com.google.android.gms.internal;

final class zznf extends zzlm {
    final /* synthetic */ zznd zzbkh;

    private zznf(zznd zznd) {
        this.zzbkh = zznd;
    }

    public final String getMediationAdapterClassName() {
        return null;
    }

    public final boolean isLoading() {
        return false;
    }

    public final void zza(zzkk zzkk, int i) {
        zzaky.e("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzako.zzaju.post(new zzng(this));
    }

    public final String zzco() {
        return null;
    }

    public final void zzd(zzkk zzkk) {
        zza(zzkk, 1);
    }
}
