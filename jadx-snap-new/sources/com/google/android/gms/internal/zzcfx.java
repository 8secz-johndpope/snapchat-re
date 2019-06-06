package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class zzcfx implements Creator<zzcfw> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int zzd = zzbgm.zzd(parcel);
        zzcfu zzcfu = null;
        IBinder iBinder = zzcfu;
        IBinder iBinder2 = iBinder;
        int i = 1;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                i = zzbgm.zzg(parcel, readInt);
            } else if (i2 == 2) {
                zzcfu = (zzcfu) zzbgm.zza(parcel, readInt, zzcfu.CREATOR);
            } else if (i2 == 3) {
                iBinder = zzbgm.zzr(parcel, readInt);
            } else if (i2 != 4) {
                zzbgm.zzb(parcel, readInt);
            } else {
                iBinder2 = zzbgm.zzr(parcel, readInt);
            }
        }
        zzbgm.zzaf(parcel, zzd);
        return new zzcfw(i, zzcfu, iBinder, iBinder2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcfw[i];
    }
}
