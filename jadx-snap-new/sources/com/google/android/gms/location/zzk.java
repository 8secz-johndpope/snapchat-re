package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.zzbgm;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

public final class zzk implements Creator<zzj> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int zzd = zzbgm.zzd(parcel);
        long j = 50;
        long j2 = Long.MAX_VALUE;
        boolean z = true;
        float f = MapboxConstants.MINIMUM_ZOOM;
        int i = Integer.MAX_VALUE;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                z = zzbgm.zzc(parcel2, readInt);
            } else if (i2 == 2) {
                j = zzbgm.zzi(parcel2, readInt);
            } else if (i2 == 3) {
                f = zzbgm.zzl(parcel2, readInt);
            } else if (i2 == 4) {
                j2 = zzbgm.zzi(parcel2, readInt);
            } else if (i2 != 5) {
                zzbgm.zzb(parcel2, readInt);
            } else {
                i = zzbgm.zzg(parcel2, readInt);
            }
        }
        zzbgm.zzaf(parcel2, zzd);
        return new zzj(z, j, f, j2, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzj[i];
    }
}
