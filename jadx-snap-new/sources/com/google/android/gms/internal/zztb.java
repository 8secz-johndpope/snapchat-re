package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class zztb implements Creator<zzta> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int zzd = zzbgm.zzd(parcel);
        String str = null;
        byte[] bArr = str;
        String[] strArr = bArr;
        String[] strArr2 = strArr;
        long j = 0;
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    z = zzbgm.zzc(parcel2, readInt);
                    break;
                case 2:
                    str = zzbgm.zzq(parcel2, readInt);
                    break;
                case 3:
                    i = zzbgm.zzg(parcel2, readInt);
                    break;
                case 4:
                    bArr = zzbgm.zzt(parcel2, readInt);
                    break;
                case 5:
                    strArr = zzbgm.zzaa(parcel2, readInt);
                    break;
                case 6:
                    strArr2 = zzbgm.zzaa(parcel2, readInt);
                    break;
                case 7:
                    z2 = zzbgm.zzc(parcel2, readInt);
                    break;
                case 8:
                    j = zzbgm.zzi(parcel2, readInt);
                    break;
                default:
                    zzbgm.zzb(parcel2, readInt);
                    break;
            }
        }
        zzbgm.zzaf(parcel2, zzd);
        return new zzta(z, str, i, bArr, strArr, strArr2, z2, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzta[i];
    }
}
