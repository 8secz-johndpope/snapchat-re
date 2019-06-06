package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzmj extends zzev implements zzmh {
    zzmj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    public final void initialize() {
        zzb(1, zzbc());
    }

    public final void setAppMuted(boolean z) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, z);
        zzb(4, zzbc);
    }

    public final void setAppVolume(float f) {
        Parcel zzbc = zzbc();
        zzbc.writeFloat(f);
        zzb(2, zzbc);
    }

    public final void zza(String str, IObjectWrapper iObjectWrapper) {
        Parcel zzbc = zzbc();
        zzbc.writeString(str);
        zzex.zza(zzbc, (IInterface) iObjectWrapper);
        zzb(6, zzbc);
    }

    public final void zzb(IObjectWrapper iObjectWrapper, String str) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) iObjectWrapper);
        zzbc.writeString(str);
        zzb(5, zzbc);
    }

    public final float zzdp() {
        Parcel zza = zza(7, zzbc());
        float readFloat = zza.readFloat();
        zza.recycle();
        return readFloat;
    }

    public final boolean zzdq() {
        Parcel zza = zza(8, zzbc());
        boolean zza2 = zzex.zza(zza);
        zza.recycle();
        return zza2;
    }

    public final void zzu(String str) {
        Parcel zzbc = zzbc();
        zzbc.writeString(str);
        zzb(3, zzbc);
    }
}
