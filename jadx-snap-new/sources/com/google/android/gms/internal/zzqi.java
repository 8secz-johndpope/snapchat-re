package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class zzqi implements Creator<zzqh> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int zzd = zzbgm.zzd(parcel);
        zzns zzns = null;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = zzbgm.zzg(parcel, readInt);
                    break;
                case 2:
                    z = zzbgm.zzc(parcel, readInt);
                    break;
                case 3:
                    i2 = zzbgm.zzg(parcel, readInt);
                    break;
                case 4:
                    z2 = zzbgm.zzc(parcel, readInt);
                    break;
                case 5:
                    i3 = zzbgm.zzg(parcel, readInt);
                    break;
                case 6:
                    zzns = (zzns) zzbgm.zza(parcel, readInt, zzns.CREATOR);
                    break;
                default:
                    zzbgm.zzb(parcel, readInt);
                    break;
            }
        }
        zzbgm.zzaf(parcel, zzd);
        return new zzqh(i, z, i2, z2, i3, zzns);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzqh[i];
    }
}
