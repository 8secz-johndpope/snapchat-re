package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.zzabh;
import com.google.android.gms.internal.zzbgl;
import com.google.android.gms.internal.zzbgo;

@zzabh
public final class zzc extends zzbgl {
    public static final Creator<zzc> CREATOR = new zzb();
    public final Intent intent;
    public final String mimeType;
    public final String packageName;
    public final String url;
    private String zzcmg;
    public final String zzcmh;
    public final String zzcmi;
    private String zzcmj;

    public zzc(Intent intent) {
        this(null, null, null, null, null, null, null, intent);
    }

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this(str, str2, str3, str4, str5, str6, str7, null);
    }

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent) {
        this.zzcmg = str;
        this.url = str2;
        this.mimeType = str3;
        this.packageName = str4;
        this.zzcmh = str5;
        this.zzcmi = str6;
        this.zzcmj = str7;
        this.intent = intent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int zze = zzbgo.zze(parcel);
        zzbgo.zza(parcel, 2, this.zzcmg, false);
        zzbgo.zza(parcel, 3, this.url, false);
        zzbgo.zza(parcel, 4, this.mimeType, false);
        zzbgo.zza(parcel, 5, this.packageName, false);
        zzbgo.zza(parcel, 6, this.zzcmh, false);
        zzbgo.zza(parcel, 7, this.zzcmi, false);
        zzbgo.zza(parcel, 8, this.zzcmj, false);
        zzbgo.zza(parcel, 9, this.intent, i, false);
        zzbgo.zzai(parcel, zze);
    }
}
