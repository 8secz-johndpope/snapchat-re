package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class zzacs extends zzev implements zzacq {
    zzacs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdResponseListener");
    }

    public final void zza(zzacj zzacj) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (Parcelable) zzacj);
        zzb(1, zzbc);
    }
}
