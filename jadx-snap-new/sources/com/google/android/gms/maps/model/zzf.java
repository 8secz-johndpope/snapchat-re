package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.zzbgm;

public final class zzf implements Creator<LatLng> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int zzd = zzbgm.zzd(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                d = zzbgm.zzn(parcel, readInt);
            } else if (i != 3) {
                zzbgm.zzb(parcel, readInt);
            } else {
                d2 = zzbgm.zzn(parcel, readInt);
            }
        }
        zzbgm.zzaf(parcel, zzd);
        return new LatLng(d, d2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LatLng[i];
    }
}
