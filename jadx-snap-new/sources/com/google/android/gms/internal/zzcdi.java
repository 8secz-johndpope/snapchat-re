package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class zzcdi extends zzev implements zzcdh {
    zzcdi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzcdf zza(zzcdd zzcdd) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (Parcelable) zzcdd);
        Parcel zza = zza(1, zzbc);
        zzcdf zzcdf = (zzcdf) zzex.zza(zza, zzcdf.CREATOR);
        zza.recycle();
        return zzcdf;
    }
}
