package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class zzafj implements Creator<zzafi> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int zzd = zzbgm.zzd(parcel);
        zzkk zzkk = null;
        String str = null;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                zzkk = (zzkk) zzbgm.zza(parcel, readInt, zzkk.CREATOR);
            } else if (i != 3) {
                zzbgm.zzb(parcel, readInt);
            } else {
                str = zzbgm.zzq(parcel, readInt);
            }
        }
        zzbgm.zzaf(parcel, zzd);
        return new zzafi(zzkk, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzafi[i];
    }
}
