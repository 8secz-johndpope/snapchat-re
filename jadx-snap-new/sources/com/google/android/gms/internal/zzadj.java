package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

@zzabh
public final class zzadj extends zzbgl {
    public static final Creator<zzadj> CREATOR = new zzadk();
    String zzbwz;

    public zzadj(String str) {
        this.zzbwz = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = zzbgo.zze(parcel);
        zzbgo.zza(parcel, 2, this.zzbwz, false);
        zzbgo.zzai(parcel, i);
    }
}
