package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

public final class zzack implements Creator<zzacj> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int zzd = zzbgm.zzd(parcel);
        long j = 0;
        long j2 = j;
        long j3 = j2;
        long j4 = j3;
        String str = null;
        String str2 = str;
        List list = str2;
        List list2 = list;
        List list3 = list2;
        String str3 = list3;
        String str4 = str3;
        String str5 = str4;
        String str6 = str5;
        zzacv zzacv = str6;
        String str7 = zzacv;
        String str8 = str7;
        zzagd zzagd = str8;
        List list4 = zzagd;
        List list5 = list4;
        zzacl zzacl = list5;
        String str9 = zzacl;
        List list6 = str9;
        String str10 = list6;
        zzagn zzagn = str10;
        String str11 = zzagn;
        Bundle bundle = str11;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        int i4 = 0;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = zzbgm.zzg(parcel2, readInt);
                    break;
                case 2:
                    str = zzbgm.zzq(parcel2, readInt);
                    break;
                case 3:
                    str2 = zzbgm.zzq(parcel2, readInt);
                    break;
                case 4:
                    list = zzbgm.zzac(parcel2, readInt);
                    break;
                case 5:
                    i2 = zzbgm.zzg(parcel2, readInt);
                    break;
                case 6:
                    list2 = zzbgm.zzac(parcel2, readInt);
                    break;
                case 7:
                    j = zzbgm.zzi(parcel2, readInt);
                    break;
                case 8:
                    z = zzbgm.zzc(parcel2, readInt);
                    break;
                case 9:
                    j2 = zzbgm.zzi(parcel2, readInt);
                    break;
                case 10:
                    list3 = zzbgm.zzac(parcel2, readInt);
                    break;
                case 11:
                    j3 = zzbgm.zzi(parcel2, readInt);
                    break;
                case 12:
                    i3 = zzbgm.zzg(parcel2, readInt);
                    break;
                case 13:
                    str3 = zzbgm.zzq(parcel2, readInt);
                    break;
                case 14:
                    j4 = zzbgm.zzi(parcel2, readInt);
                    break;
                case 15:
                    str4 = zzbgm.zzq(parcel2, readInt);
                    break;
                case 18:
                    z2 = zzbgm.zzc(parcel2, readInt);
                    break;
                case 19:
                    str5 = zzbgm.zzq(parcel2, readInt);
                    break;
                case 21:
                    str6 = zzbgm.zzq(parcel2, readInt);
                    break;
                case 22:
                    z3 = zzbgm.zzc(parcel2, readInt);
                    break;
                case 23:
                    z4 = zzbgm.zzc(parcel2, readInt);
                    break;
                case 24:
                    z5 = zzbgm.zzc(parcel2, readInt);
                    break;
                case 25:
                    z6 = zzbgm.zzc(parcel2, readInt);
                    break;
                case 26:
                    z7 = zzbgm.zzc(parcel2, readInt);
                    break;
                case 28:
                    zzacv = (zzacv) zzbgm.zza(parcel2, readInt, zzacv.CREATOR);
                    break;
                case 29:
                    str7 = zzbgm.zzq(parcel2, readInt);
                    break;
                case 30:
                    str8 = zzbgm.zzq(parcel2, readInt);
                    break;
                case 31:
                    z8 = zzbgm.zzc(parcel2, readInt);
                    break;
                case 32:
                    z9 = zzbgm.zzc(parcel2, readInt);
                    break;
                case 33:
                    zzagd = (zzagd) zzbgm.zza(parcel2, readInt, zzagd.CREATOR);
                    break;
                case 34:
                    list4 = zzbgm.zzac(parcel2, readInt);
                    break;
                case 35:
                    list5 = zzbgm.zzac(parcel2, readInt);
                    break;
                case 36:
                    z10 = zzbgm.zzc(parcel2, readInt);
                    break;
                case 37:
                    zzacl = (zzacl) zzbgm.zza(parcel2, readInt, zzacl.CREATOR);
                    break;
                case 38:
                    z11 = zzbgm.zzc(parcel2, readInt);
                    break;
                case 39:
                    str9 = zzbgm.zzq(parcel2, readInt);
                    break;
                case 40:
                    list6 = zzbgm.zzac(parcel2, readInt);
                    break;
                case 42:
                    z12 = zzbgm.zzc(parcel2, readInt);
                    break;
                case 43:
                    str10 = zzbgm.zzq(parcel2, readInt);
                    break;
                case 44:
                    zzagn = (zzagn) zzbgm.zza(parcel2, readInt, zzagn.CREATOR);
                    break;
                case 45:
                    str11 = zzbgm.zzq(parcel2, readInt);
                    break;
                case 46:
                    z13 = zzbgm.zzc(parcel2, readInt);
                    break;
                case 47:
                    z14 = zzbgm.zzc(parcel2, readInt);
                    break;
                case 48:
                    bundle = zzbgm.zzs(parcel2, readInt);
                    break;
                case 49:
                    z15 = zzbgm.zzc(parcel2, readInt);
                    break;
                case 50:
                    i4 = zzbgm.zzg(parcel2, readInt);
                    break;
                default:
                    zzbgm.zzb(parcel2, readInt);
                    break;
            }
        }
        zzbgm.zzaf(parcel2, zzd);
        return new zzacj(i, str, str2, list, i2, list2, j, z, j2, list3, j3, i3, str3, j4, str4, z2, str5, str6, z3, z4, z5, z6, z7, zzacv, str7, str8, z8, z9, zzagd, list4, list5, z10, zzacl, z11, str9, list6, z12, str10, zzagn, str11, z13, z14, bundle, z15, i4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzacj[i];
    }
}
