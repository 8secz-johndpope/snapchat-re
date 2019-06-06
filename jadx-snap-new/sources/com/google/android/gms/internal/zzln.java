package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class zzln extends zzev implements zzll {
    zzln(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    public final String getMediationAdapterClassName() {
        Parcel zza = zza(2, zzbc());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    public final boolean isLoading() {
        Parcel zza = zza(3, zzbc());
        boolean zza2 = zzex.zza(zza);
        zza.recycle();
        return zza2;
    }

    public final void zza(zzkk zzkk, int i) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (Parcelable) zzkk);
        zzbc.writeInt(i);
        zzb(5, zzbc);
    }

    public final String zzco() {
        Parcel zza = zza(4, zzbc());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    public final void zzd(zzkk zzkk) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (Parcelable) zzkk);
        zzb(1, zzbc);
    }
}
