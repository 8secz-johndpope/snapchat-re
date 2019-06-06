package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.LocationRequest;
import java.util.List;

public final class zzchm implements Creator<zzchl> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int zzd = zzbgm.zzd(parcel);
        List list = zzchl.zzitm;
        LocationRequest locationRequest = null;
        String str = locationRequest;
        String str2 = str;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i != 1) {
                switch (i) {
                    case 5:
                        list = zzbgm.zzc(parcel, readInt, zzcfs.CREATOR);
                        break;
                    case 6:
                        str = zzbgm.zzq(parcel, readInt);
                        break;
                    case 7:
                        z = zzbgm.zzc(parcel, readInt);
                        break;
                    case 8:
                        z2 = zzbgm.zzc(parcel, readInt);
                        break;
                    case 9:
                        z3 = zzbgm.zzc(parcel, readInt);
                        break;
                    case 10:
                        str2 = zzbgm.zzq(parcel, readInt);
                        break;
                    default:
                        zzbgm.zzb(parcel, readInt);
                        break;
                }
            }
            locationRequest = (LocationRequest) zzbgm.zza(parcel, readInt, LocationRequest.CREATOR);
        }
        zzbgm.zzaf(parcel, zzd);
        return new zzchl(locationRequest, list, str, z, z2, z3, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzchl[i];
    }
}
