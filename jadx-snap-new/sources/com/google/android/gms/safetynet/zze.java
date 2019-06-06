package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.zzbgm;

public final class zze implements Creator<zzd> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int zzd = zzbgm.zzd(parcel);
        long j = 0;
        HarmfulAppsData[] harmfulAppsDataArr = null;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 2) {
                j = zzbgm.zzi(parcel, readInt);
            } else if (i2 == 3) {
                harmfulAppsDataArr = (HarmfulAppsData[]) zzbgm.zzb(parcel, readInt, HarmfulAppsData.CREATOR);
            } else if (i2 == 4) {
                i = zzbgm.zzg(parcel, readInt);
            } else if (i2 != 5) {
                zzbgm.zzb(parcel, readInt);
            } else {
                z = zzbgm.zzc(parcel, readInt);
            }
        }
        zzbgm.zzaf(parcel, zzd);
        return new zzd(j, harmfulAppsDataArr, i, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzd[i];
    }
}
