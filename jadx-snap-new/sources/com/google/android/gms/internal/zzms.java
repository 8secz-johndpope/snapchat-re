package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

@zzabh
public final class zzms extends zzbgl {
    public static final Creator<zzms> CREATOR = new zzmt();
    public final int zzbjh;

    public zzms(int i) {
        this.zzbjh = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = zzbgo.zze(parcel);
        zzbgo.zzc(parcel, 2, this.zzbjh);
        zzbgo.zzai(parcel, i);
    }
}
