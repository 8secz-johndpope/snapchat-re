package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.zzbgl;
import com.google.android.gms.internal.zzbgo;

public final class zzd extends zzbgl {
    public static final Creator<zzd> CREATOR = new zze();
    public final long zzkjx;
    public final HarmfulAppsData[] zzkjy;
    public final int zzkjz;
    private boolean zzkka;

    public zzd(long j, HarmfulAppsData[] harmfulAppsDataArr, int i, boolean z) {
        this.zzkjx = j;
        this.zzkjy = harmfulAppsDataArr;
        this.zzkka = z;
        if (z) {
            this.zzkjz = i;
        } else {
            this.zzkjz = -1;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int zze = zzbgo.zze(parcel);
        zzbgo.zza(parcel, 2, this.zzkjx);
        zzbgo.zza(parcel, 3, this.zzkjy, i, false);
        zzbgo.zzc(parcel, 4, this.zzkjz);
        zzbgo.zza(parcel, 5, this.zzkka);
        zzbgo.zzai(parcel, zze);
    }
}
