package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.zzj;
import java.util.List;

public final class zzcfv implements Creator<zzcfu> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int zzd = zzbgm.zzd(parcel);
        zzj zzj = zzcfu.zzitn;
        List list = zzcfu.zzitm;
        String str = null;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                zzj = (zzj) zzbgm.zza(parcel, readInt, zzj.CREATOR);
            } else if (i == 2) {
                list = zzbgm.zzc(parcel, readInt, zzcfs.CREATOR);
            } else if (i != 3) {
                zzbgm.zzb(parcel, readInt);
            } else {
                str = zzbgm.zzq(parcel, readInt);
            }
        }
        zzbgm.zzaf(parcel, zzd);
        return new zzcfu(zzj, list, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcfu[i];
    }
}
