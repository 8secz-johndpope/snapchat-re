package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;

public final class zzacx implements Creator<zzacv> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int zzd = zzbgm.zzd(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 2) {
                zzbgm.zzb(parcel, readInt);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) zzbgm.zza(parcel, readInt, ParcelFileDescriptor.CREATOR);
            }
        }
        zzbgm.zzaf(parcel, zzd);
        return new zzacv(parcelFileDescriptor);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzacv[i];
    }
}
