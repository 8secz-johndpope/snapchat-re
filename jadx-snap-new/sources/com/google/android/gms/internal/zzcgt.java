package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class zzcgt extends zzev implements zzcgr {
    zzcgt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    public final void zza(zzcgl zzcgl) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (Parcelable) zzcgl);
        zzc(1, zzbc);
    }
}
