package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class zzcdg implements Creator<zzcdf> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int zzd = zzbgm.zzd(parcel);
        int i = 0;
        byte[] bArr = null;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                i = zzbgm.zzg(parcel, readInt);
            } else if (i2 != 2) {
                zzbgm.zzb(parcel, readInt);
            } else {
                bArr = zzbgm.zzt(parcel, readInt);
            }
        }
        zzbgm.zzaf(parcel, zzd);
        return new zzcdf(i, bArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcdf[i];
    }
}
