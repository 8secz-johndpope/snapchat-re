package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class zzio implements Creator<zzin> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int zzd = zzbgm.zzd(parcel);
        long j = 0;
        long j2 = j;
        String str = null;
        String str2 = str;
        String str3 = str2;
        String str4 = str3;
        Bundle bundle = str4;
        boolean z = false;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = zzbgm.zzq(parcel2, readInt);
                    break;
                case 3:
                    j = zzbgm.zzi(parcel2, readInt);
                    break;
                case 4:
                    str2 = zzbgm.zzq(parcel2, readInt);
                    break;
                case 5:
                    str3 = zzbgm.zzq(parcel2, readInt);
                    break;
                case 6:
                    str4 = zzbgm.zzq(parcel2, readInt);
                    break;
                case 7:
                    bundle = zzbgm.zzs(parcel2, readInt);
                    break;
                case 8:
                    z = zzbgm.zzc(parcel2, readInt);
                    break;
                case 9:
                    j2 = zzbgm.zzi(parcel2, readInt);
                    break;
                default:
                    zzbgm.zzb(parcel2, readInt);
                    break;
            }
        }
        zzbgm.zzaf(parcel2, zzd);
        return new zzin(str, j, str2, str3, str4, bundle, z, j2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzin[i];
    }
}
