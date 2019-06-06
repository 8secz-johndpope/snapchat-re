package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

public final class zzlk extends zzev implements zzli {
    zzlk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    public final void onAdClicked() {
        zzb(6, zzbc());
    }

    public final void onAdClosed() {
        zzb(1, zzbc());
    }

    public final void onAdFailedToLoad(int i) {
        Parcel zzbc = zzbc();
        zzbc.writeInt(i);
        zzb(2, zzbc);
    }

    public final void onAdImpression() {
        zzb(7, zzbc());
    }

    public final void onAdLeftApplication() {
        zzb(3, zzbc());
    }

    public final void onAdLoaded() {
        zzb(4, zzbc());
    }

    public final void onAdOpened() {
        zzb(5, zzbc());
    }
}
