package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class zzsj extends zzev implements zzsh {
    zzsj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    public final void zza(zzsk zzsk) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) zzsk);
        zzb(1, zzbc);
    }
}
