package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class zzcyn implements Creator<zzcym> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int zzd = zzbgm.zzd(parcel);
        int i = 0;
        Intent intent = null;
        int i2 = 0;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                i = zzbgm.zzg(parcel, readInt);
            } else if (i3 == 2) {
                i2 = zzbgm.zzg(parcel, readInt);
            } else if (i3 != 3) {
                zzbgm.zzb(parcel, readInt);
            } else {
                intent = (Intent) zzbgm.zza(parcel, readInt, Intent.CREATOR);
            }
        }
        zzbgm.zzaf(parcel, zzd);
        return new zzcym(i, i2, intent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcym[i];
    }
}
