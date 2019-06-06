package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

@zzabh
public final class zzta extends zzbgl {
    public static final Creator<zzta> CREATOR = new zztb();
    public final byte[] data;
    public final int statusCode;
    public final boolean zzac;
    public final long zzad;
    public final String[] zzccx;
    public final String[] zzccy;
    public final boolean zzccz;
    public final String zzcda;

    zzta(boolean z, String str, int i, byte[] bArr, String[] strArr, String[] strArr2, boolean z2, long j) {
        this.zzccz = z;
        this.zzcda = str;
        this.statusCode = i;
        this.data = bArr;
        this.zzccx = strArr;
        this.zzccy = strArr2;
        this.zzac = z2;
        this.zzad = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = zzbgo.zze(parcel);
        zzbgo.zza(parcel, 1, this.zzccz);
        zzbgo.zza(parcel, 2, this.zzcda, false);
        zzbgo.zzc(parcel, 3, this.statusCode);
        zzbgo.zza(parcel, 4, this.data, false);
        zzbgo.zza(parcel, 5, this.zzccx, false);
        zzbgo.zza(parcel, 6, this.zzccy, false);
        zzbgo.zza(parcel, 7, this.zzac);
        zzbgo.zza(parcel, 8, this.zzad);
        zzbgo.zzai(parcel, i);
    }
}
