package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

@zzabh
public final class zzacy extends zzbgl {
    public static final Creator<zzacy> CREATOR = new zzacz();
    private ApplicationInfo applicationInfo;
    private String packageName;
    private PackageInfo zzcrw;
    private List<String> zzcsj;
    private String zzcss;
    private Bundle zzcuu;
    private zzala zzcuv;
    private boolean zzcuw;
    private String zzcux;

    public zzacy(Bundle bundle, zzala zzala, ApplicationInfo applicationInfo, String str, List<String> list, PackageInfo packageInfo, String str2, boolean z, String str3) {
        this.zzcuu = bundle;
        this.zzcuv = zzala;
        this.packageName = str;
        this.applicationInfo = applicationInfo;
        this.zzcsj = list;
        this.zzcrw = packageInfo;
        this.zzcss = str2;
        this.zzcuw = z;
        this.zzcux = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int zze = zzbgo.zze(parcel);
        zzbgo.zza(parcel, 1, this.zzcuu, false);
        zzbgo.zza(parcel, 2, this.zzcuv, i, false);
        zzbgo.zza(parcel, 3, this.applicationInfo, i, false);
        zzbgo.zza(parcel, 4, this.packageName, false);
        zzbgo.zzb(parcel, 5, this.zzcsj, false);
        zzbgo.zza(parcel, 6, this.zzcrw, i, false);
        zzbgo.zza(parcel, 7, this.zzcss, false);
        zzbgo.zza(parcel, 8, this.zzcuw);
        zzbgo.zza(parcel, 9, this.zzcux, false);
        zzbgo.zzai(parcel, zze);
    }
}
