package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

@zzabh
public final class zzafi extends zzbgl {
    public static final Creator<zzafi> CREATOR = new zzafj();
    public final String zzatx;
    public final zzkk zzcrv;

    public zzafi(zzkk zzkk, String str) {
        this.zzcrv = zzkk;
        this.zzatx = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int zze = zzbgo.zze(parcel);
        zzbgo.zza(parcel, 2, this.zzcrv, i, false);
        zzbgo.zza(parcel, 3, this.zzatx, false);
        zzbgo.zzai(parcel, zze);
    }
}
