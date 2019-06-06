package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.util.List;

public final class zzach implements Creator<zzacf> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int zzd = zzbgm.zzd(parcel);
        long j = 0;
        long j2 = j;
        Bundle bundle = null;
        zzkk zzkk = bundle;
        zzko zzko = zzkk;
        String str = zzko;
        ApplicationInfo applicationInfo = str;
        PackageInfo packageInfo = applicationInfo;
        String str2 = packageInfo;
        String str3 = str2;
        String str4 = str3;
        zzala zzala = str4;
        Bundle bundle2 = zzala;
        List list = bundle2;
        Bundle bundle3 = list;
        String str5 = bundle3;
        String str6 = str5;
        List list2 = str6;
        String str7 = list2;
        zzqh zzqh = str7;
        List list3 = zzqh;
        String str8 = list3;
        String str9 = str8;
        String str10 = str9;
        Bundle bundle4 = str10;
        String str11 = bundle4;
        zzms zzms = str11;
        Bundle bundle5 = zzms;
        String str12 = bundle5;
        String str13 = str12;
        String str14 = str13;
        List list4 = str14;
        String str15 = list4;
        List list5 = str15;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        float f = MapboxConstants.MINIMUM_ZOOM;
        float f2 = MapboxConstants.MINIMUM_ZOOM;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        int i7 = 0;
        boolean z6 = false;
        boolean z7 = false;
        int i8 = 0;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = zzbgm.zzg(parcel2, readInt);
                    break;
                case 2:
                    bundle = zzbgm.zzs(parcel2, readInt);
                    break;
                case 3:
                    zzkk = (zzkk) zzbgm.zza(parcel2, readInt, zzkk.CREATOR);
                    break;
                case 4:
                    zzko = (zzko) zzbgm.zza(parcel2, readInt, zzko.CREATOR);
                    break;
                case 5:
                    str = zzbgm.zzq(parcel2, readInt);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) zzbgm.zza(parcel2, readInt, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) zzbgm.zza(parcel2, readInt, PackageInfo.CREATOR);
                    break;
                case 8:
                    str2 = zzbgm.zzq(parcel2, readInt);
                    break;
                case 9:
                    str3 = zzbgm.zzq(parcel2, readInt);
                    break;
                case 10:
                    str4 = zzbgm.zzq(parcel2, readInt);
                    break;
                case 11:
                    zzala = (zzala) zzbgm.zza(parcel2, readInt, zzala.CREATOR);
                    break;
                case 12:
                    bundle2 = zzbgm.zzs(parcel2, readInt);
                    break;
                case 13:
                    i2 = zzbgm.zzg(parcel2, readInt);
                    break;
                case 14:
                    list = zzbgm.zzac(parcel2, readInt);
                    break;
                case 15:
                    bundle3 = zzbgm.zzs(parcel2, readInt);
                    break;
                case 16:
                    z = zzbgm.zzc(parcel2, readInt);
                    break;
                case 18:
                    i3 = zzbgm.zzg(parcel2, readInt);
                    break;
                case 19:
                    i4 = zzbgm.zzg(parcel2, readInt);
                    break;
                case 20:
                    f = zzbgm.zzl(parcel2, readInt);
                    break;
                case 21:
                    str5 = zzbgm.zzq(parcel2, readInt);
                    break;
                case 25:
                    j = zzbgm.zzi(parcel2, readInt);
                    break;
                case 26:
                    str6 = zzbgm.zzq(parcel2, readInt);
                    break;
                case 27:
                    list2 = zzbgm.zzac(parcel2, readInt);
                    break;
                case 28:
                    str7 = zzbgm.zzq(parcel2, readInt);
                    break;
                case 29:
                    zzqh = (zzqh) zzbgm.zza(parcel2, readInt, zzqh.CREATOR);
                    break;
                case 30:
                    list3 = zzbgm.zzac(parcel2, readInt);
                    break;
                case 31:
                    j2 = zzbgm.zzi(parcel2, readInt);
                    break;
                case 33:
                    str8 = zzbgm.zzq(parcel2, readInt);
                    break;
                case 34:
                    f2 = zzbgm.zzl(parcel2, readInt);
                    break;
                case 35:
                    i5 = zzbgm.zzg(parcel2, readInt);
                    break;
                case 36:
                    i6 = zzbgm.zzg(parcel2, readInt);
                    break;
                case 37:
                    z3 = zzbgm.zzc(parcel2, readInt);
                    break;
                case 38:
                    z4 = zzbgm.zzc(parcel2, readInt);
                    break;
                case 39:
                    str9 = zzbgm.zzq(parcel2, readInt);
                    break;
                case 40:
                    z2 = zzbgm.zzc(parcel2, readInt);
                    break;
                case 41:
                    str10 = zzbgm.zzq(parcel2, readInt);
                    break;
                case 42:
                    z5 = zzbgm.zzc(parcel2, readInt);
                    break;
                case 43:
                    i7 = zzbgm.zzg(parcel2, readInt);
                    break;
                case 44:
                    bundle4 = zzbgm.zzs(parcel2, readInt);
                    break;
                case 45:
                    str11 = zzbgm.zzq(parcel2, readInt);
                    break;
                case 46:
                    zzms = (zzms) zzbgm.zza(parcel2, readInt, zzms.CREATOR);
                    break;
                case 47:
                    z6 = zzbgm.zzc(parcel2, readInt);
                    break;
                case 48:
                    bundle5 = zzbgm.zzs(parcel2, readInt);
                    break;
                case 49:
                    str12 = zzbgm.zzq(parcel2, readInt);
                    break;
                case 50:
                    str13 = zzbgm.zzq(parcel2, readInt);
                    break;
                case 51:
                    str14 = zzbgm.zzq(parcel2, readInt);
                    break;
                case 52:
                    z7 = zzbgm.zzc(parcel2, readInt);
                    break;
                case 53:
                    list4 = zzbgm.zzab(parcel2, readInt);
                    break;
                case 54:
                    str15 = zzbgm.zzq(parcel2, readInt);
                    break;
                case 55:
                    list5 = zzbgm.zzac(parcel2, readInt);
                    break;
                case 56:
                    i8 = zzbgm.zzg(parcel2, readInt);
                    break;
                case 57:
                    z8 = zzbgm.zzc(parcel2, readInt);
                    break;
                case 58:
                    z9 = zzbgm.zzc(parcel2, readInt);
                    break;
                case 59:
                    z10 = zzbgm.zzc(parcel2, readInt);
                    break;
                default:
                    zzbgm.zzb(parcel2, readInt);
                    break;
            }
        }
        zzbgm.zzaf(parcel2, zzd);
        return new zzacf(i, bundle, zzkk, zzko, str, applicationInfo, packageInfo, str2, str3, str4, zzala, bundle2, i2, list, bundle3, z, i3, i4, f, str5, j, str6, list2, str7, zzqh, list3, j2, str8, f2, z2, i5, i6, z3, z4, str9, str10, z5, i7, bundle4, str11, zzms, z6, bundle5, str12, str13, str14, z7, list4, str15, list5, i8, z8, z9, z10);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzacf[i];
    }
}
