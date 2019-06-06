package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class zzir extends zzev implements zziq {
    zzir(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final zzik zza(zzin zzin) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (Parcelable) zzin);
        Parcel zza = zza(1, zzbc);
        zzik zzik = (zzik) zzex.zza(zza, zzik.CREATOR);
        zza.recycle();
        return zzik;
    }
}
