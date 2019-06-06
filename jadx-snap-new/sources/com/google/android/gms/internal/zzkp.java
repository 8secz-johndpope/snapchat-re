package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class zzkp implements Creator<zzko> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int zzd = zzbgm.zzd(parcel);
        String str = null;
        zzko[] zzkoArr = str;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = zzbgm.zzq(parcel, readInt);
                    break;
                case 3:
                    i = zzbgm.zzg(parcel, readInt);
                    break;
                case 4:
                    i2 = zzbgm.zzg(parcel, readInt);
                    break;
                case 5:
                    z = zzbgm.zzc(parcel, readInt);
                    break;
                case 6:
                    i3 = zzbgm.zzg(parcel, readInt);
                    break;
                case 7:
                    i4 = zzbgm.zzg(parcel, readInt);
                    break;
                case 8:
                    zzkoArr = (zzko[]) zzbgm.zzb(parcel, readInt, zzko.CREATOR);
                    break;
                case 9:
                    z2 = zzbgm.zzc(parcel, readInt);
                    break;
                case 10:
                    z3 = zzbgm.zzc(parcel, readInt);
                    break;
                case 11:
                    z4 = zzbgm.zzc(parcel, readInt);
                    break;
                default:
                    zzbgm.zzb(parcel, readInt);
                    break;
            }
        }
        zzbgm.zzaf(parcel, zzd);
        return new zzko(str, i, i2, z, i3, i4, zzkoArr, z2, z3, z4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzko[i];
    }
}
