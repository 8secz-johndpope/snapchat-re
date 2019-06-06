package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.zzbgm;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

public final class zzab implements Creator<LocationRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int zzd = zzbgm.zzd(parcel);
        long j = 3600000;
        long j2 = 600000;
        long j3 = Long.MAX_VALUE;
        long j4 = 0;
        int i = 102;
        boolean z = false;
        int i2 = Integer.MAX_VALUE;
        float f = MapboxConstants.MINIMUM_ZOOM;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = zzbgm.zzg(parcel2, readInt);
                    break;
                case 2:
                    j = zzbgm.zzi(parcel2, readInt);
                    break;
                case 3:
                    j2 = zzbgm.zzi(parcel2, readInt);
                    break;
                case 4:
                    z = zzbgm.zzc(parcel2, readInt);
                    break;
                case 5:
                    j3 = zzbgm.zzi(parcel2, readInt);
                    break;
                case 6:
                    i2 = zzbgm.zzg(parcel2, readInt);
                    break;
                case 7:
                    f = zzbgm.zzl(parcel2, readInt);
                    break;
                case 8:
                    j4 = zzbgm.zzi(parcel2, readInt);
                    break;
                default:
                    zzbgm.zzb(parcel2, readInt);
                    break;
            }
        }
        zzbgm.zzaf(parcel2, zzd);
        return new LocationRequest(i, j, j2, z, j3, i2, f, j4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationRequest[i];
    }
}
