package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class zzdle implements Creator<zzdld> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int zzd = zzbgm.zzd(parcel);
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            int i5 = 65535 & readInt;
            if (i5 == 2) {
                i = zzbgm.zzg(parcel, readInt);
            } else if (i5 == 3) {
                i2 = zzbgm.zzg(parcel, readInt);
            } else if (i5 == 4) {
                i3 = zzbgm.zzg(parcel, readInt);
            } else if (i5 == 5) {
                j = zzbgm.zzi(parcel, readInt);
            } else if (i5 != 6) {
                zzbgm.zzb(parcel, readInt);
            } else {
                i4 = zzbgm.zzg(parcel, readInt);
            }
        }
        zzbgm.zzaf(parcel, zzd);
        return new zzdld(i, i2, i3, j, i4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzdld[i];
    }
}
