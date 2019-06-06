package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

public final class zzacm implements Creator<zzacl> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int zzd = zzbgm.zzd(parcel);
        boolean z = false;
        List list = null;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                z = zzbgm.zzc(parcel, readInt);
            } else if (i != 3) {
                zzbgm.zzb(parcel, readInt);
            } else {
                list = zzbgm.zzac(parcel, readInt);
            }
        }
        zzbgm.zzaf(parcel, zzd);
        return new zzacl(z, list);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzacl[i];
    }
}
