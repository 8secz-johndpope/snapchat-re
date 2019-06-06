package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.zzs;
import com.samsung.android.sdk.camera.SCamera;

@zzabh
public final class zzala extends zzbgl {
    public static final Creator<zzala> CREATOR = new zzalb();
    public String zzcu;
    public int zzdiz;
    public int zzdja;
    public boolean zzdjb;
    public boolean zzdjc;

    public zzala(int i, int i2, boolean z) {
        this(i, i2, z, false, false);
    }

    public zzala(int i, int i2, boolean z, boolean z2) {
        this((int) zzs.GOOGLE_PLAY_SERVICES_VERSION_CODE, i2, true, false, z2);
    }

    private zzala(int i, int i2, boolean z, boolean z2, boolean z3) {
        String str = z ? "0" : SCamera.CAMERA_ID_FRONT;
        StringBuilder stringBuilder = new StringBuilder(str.length() + 36);
        stringBuilder.append("afma-sdk-a-v");
        stringBuilder.append(i);
        String str2 = ".";
        stringBuilder.append(str2);
        stringBuilder.append(i2);
        stringBuilder.append(str2);
        stringBuilder.append(str);
        this(stringBuilder.toString(), i, i2, z, z3);
    }

    zzala(String str, int i, int i2, boolean z, boolean z2) {
        this.zzcu = str;
        this.zzdiz = i;
        this.zzdja = i2;
        this.zzdjb = z;
        this.zzdjc = z2;
    }

    public static zzala zzse() {
        return new zzala(12211278, 12211278, true);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = zzbgo.zze(parcel);
        zzbgo.zza(parcel, 2, this.zzcu, false);
        zzbgo.zzc(parcel, 3, this.zzdiz);
        zzbgo.zzc(parcel, 4, this.zzdja);
        zzbgo.zza(parcel, 5, this.zzdjb);
        zzbgo.zza(parcel, 6, this.zzdjc);
        zzbgo.zzai(parcel, i);
    }
}
