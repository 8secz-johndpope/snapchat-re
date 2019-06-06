package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.zzbgl;
import com.google.android.gms.internal.zzbgo;

public final class zzf extends zzbgl {
    public static final Creator<zzf> CREATOR = new zzg();
    private final String zzeia;

    public zzf(String str) {
        this.zzeia = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = zzbgo.zze(parcel);
        zzbgo.zza(parcel, 2, this.zzeia, false);
        zzbgo.zzai(parcel, i);
    }
}
