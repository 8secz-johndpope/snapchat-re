package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class zzcdd extends zzbgl {
    public static final Creator<zzcdd> CREATOR = new zzcde();
    private String packageName;
    private int versionCode;
    private String zzijf;

    zzcdd(int i, String str, String str2) {
        this.versionCode = i;
        this.packageName = str;
        this.zzijf = str2;
    }

    public zzcdd(String str, String str2) {
        this(1, str, str2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = zzbgo.zze(parcel);
        zzbgo.zzc(parcel, 1, this.versionCode);
        zzbgo.zza(parcel, 2, this.packageName, false);
        zzbgo.zza(parcel, 3, this.zzijf, false);
        zzbgo.zzai(parcel, i);
    }
}
