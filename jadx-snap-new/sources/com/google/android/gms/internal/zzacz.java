package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

public final class zzacz implements Creator<zzacy> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int zzd = zzbgm.zzd(parcel);
        Bundle bundle = null;
        zzala zzala = bundle;
        ApplicationInfo applicationInfo = zzala;
        String str = applicationInfo;
        List list = str;
        PackageInfo packageInfo = list;
        String str2 = packageInfo;
        String str3 = str2;
        boolean z = false;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    bundle = zzbgm.zzs(parcel, readInt);
                    break;
                case 2:
                    zzala = (zzala) zzbgm.zza(parcel, readInt, zzala.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) zzbgm.zza(parcel, readInt, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    str = zzbgm.zzq(parcel, readInt);
                    break;
                case 5:
                    list = zzbgm.zzac(parcel, readInt);
                    break;
                case 6:
                    packageInfo = (PackageInfo) zzbgm.zza(parcel, readInt, PackageInfo.CREATOR);
                    break;
                case 7:
                    str2 = zzbgm.zzq(parcel, readInt);
                    break;
                case 8:
                    z = zzbgm.zzc(parcel, readInt);
                    break;
                case 9:
                    str3 = zzbgm.zzq(parcel, readInt);
                    break;
                default:
                    zzbgm.zzb(parcel, readInt);
                    break;
            }
        }
        zzbgm.zzaf(parcel, zzd);
        return new zzacy(bundle, zzala, applicationInfo, str, list, packageInfo, str2, z, str3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzacy[i];
    }
}
