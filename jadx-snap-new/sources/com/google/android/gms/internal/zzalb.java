package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class zzalb implements Creator<zzala> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int zzd = zzbgm.zzd(parcel);
        String str = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 2) {
                str = zzbgm.zzq(parcel, readInt);
            } else if (i3 == 3) {
                i = zzbgm.zzg(parcel, readInt);
            } else if (i3 == 4) {
                i2 = zzbgm.zzg(parcel, readInt);
            } else if (i3 == 5) {
                z = zzbgm.zzc(parcel, readInt);
            } else if (i3 != 6) {
                zzbgm.zzb(parcel, readInt);
            } else {
                z2 = zzbgm.zzc(parcel, readInt);
            }
        }
        zzbgm.zzaf(parcel, zzd);
        return new zzala(str, i, i2, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzala[i];
    }
}
