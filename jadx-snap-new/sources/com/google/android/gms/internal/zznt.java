package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class zznt implements Creator<zzns> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int zzd = zzbgm.zzd(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                z = zzbgm.zzc(parcel, readInt);
            } else if (i == 3) {
                z2 = zzbgm.zzc(parcel, readInt);
            } else if (i != 4) {
                zzbgm.zzb(parcel, readInt);
            } else {
                z3 = zzbgm.zzc(parcel, readInt);
            }
        }
        zzbgm.zzaf(parcel, zzd);
        return new zzns(z, z2, z3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzns[i];
    }
}
