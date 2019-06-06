package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class zzwn extends zzev implements zzwl {
    zzwn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public final void onAdClicked() {
        zzb(1, zzbc());
    }

    public final void onAdClosed() {
        zzb(2, zzbc());
    }

    public final void onAdFailedToLoad(int i) {
        Parcel zzbc = zzbc();
        zzbc.writeInt(i);
        zzb(3, zzbc);
    }

    public final void onAdImpression() {
        zzb(8, zzbc());
    }

    public final void onAdLeftApplication() {
        zzb(4, zzbc());
    }

    public final void onAdLoaded() {
        zzb(6, zzbc());
    }

    public final void onAdOpened() {
        zzb(5, zzbc());
    }

    public final void onAppEvent(String str, String str2) {
        Parcel zzbc = zzbc();
        zzbc.writeString(str);
        zzbc.writeString(str2);
        zzb(9, zzbc);
    }

    public final void onVideoEnd() {
        zzb(11, zzbc());
    }

    public final void zza(zzwo zzwo) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) zzwo);
        zzb(7, zzbc);
    }

    public final void zzb(zzro zzro, String str) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) zzro);
        zzbc.writeString(str);
        zzb(10, zzbc);
    }
}
