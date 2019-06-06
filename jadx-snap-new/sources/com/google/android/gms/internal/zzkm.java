package com.google.android.gms.internal;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

public final class zzkm implements Creator<zzkk> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int zzd = zzbgm.zzd(parcel);
        Bundle bundle = null;
        List list = bundle;
        String str = list;
        zzno zzno = str;
        Location location = zzno;
        String str2 = location;
        Bundle bundle2 = str2;
        Bundle bundle3 = bundle2;
        List list2 = bundle3;
        String str3 = list2;
        String str4 = str3;
        long j = 0;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
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
                    bundle = zzbgm.zzs(parcel2, readInt);
                    break;
                case 4:
                    i2 = zzbgm.zzg(parcel2, readInt);
                    break;
                case 5:
                    list = zzbgm.zzac(parcel2, readInt);
                    break;
                case 6:
                    z = zzbgm.zzc(parcel2, readInt);
                    break;
                case 7:
                    i3 = zzbgm.zzg(parcel2, readInt);
                    break;
                case 8:
                    z2 = zzbgm.zzc(parcel2, readInt);
                    break;
                case 9:
                    str = zzbgm.zzq(parcel2, readInt);
                    break;
                case 10:
                    zzno = (zzno) zzbgm.zza(parcel2, readInt, zzno.CREATOR);
                    break;
                case 11:
                    location = (Location) zzbgm.zza(parcel2, readInt, Location.CREATOR);
                    break;
                case 12:
                    str2 = zzbgm.zzq(parcel2, readInt);
                    break;
                case 13:
                    bundle2 = zzbgm.zzs(parcel2, readInt);
                    break;
                case 14:
                    bundle3 = zzbgm.zzs(parcel2, readInt);
                    break;
                case 15:
                    list2 = zzbgm.zzac(parcel2, readInt);
                    break;
                case 16:
                    str3 = zzbgm.zzq(parcel2, readInt);
                    break;
                case 17:
                    str4 = zzbgm.zzq(parcel2, readInt);
                    break;
                case 18:
                    z3 = zzbgm.zzc(parcel2, readInt);
                    break;
                default:
                    zzbgm.zzb(parcel2, readInt);
                    break;
            }
        }
        zzbgm.zzaf(parcel2, zzd);
        return new zzkk(i, j, bundle, i2, list, z, i3, z2, str, zzno, location, str2, bundle2, bundle3, list2, str3, str4, z3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzkk[i];
    }
}
