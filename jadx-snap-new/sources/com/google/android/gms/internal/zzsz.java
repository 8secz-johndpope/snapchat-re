package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class zzsz implements Creator<zzsy> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int zzd = zzbgm.zzd(parcel);
        String str = null;
        String[] strArr = null;
        String[] strArr2 = strArr;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                str = zzbgm.zzq(parcel, readInt);
            } else if (i == 2) {
                strArr = zzbgm.zzaa(parcel, readInt);
            } else if (i != 3) {
                zzbgm.zzb(parcel, readInt);
            } else {
                strArr2 = zzbgm.zzaa(parcel, readInt);
            }
        }
        zzbgm.zzaf(parcel, zzd);
        return new zzsy(str, strArr, strArr2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzsy[i];
    }
}
