package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzaez extends zzev implements zzaex {
    zzaez(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    public final void destroy() {
        zzb(8, zzbc());
    }

    public final String getMediationAdapterClassName() {
        Parcel zza = zza(12, zzbc());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    public final boolean isLoaded() {
        Parcel zza = zza(5, zzbc());
        boolean zza2 = zzex.zza(zza);
        zza.recycle();
        return zza2;
    }

    public final void pause() {
        zzb(6, zzbc());
    }

    public final void resume() {
        zzb(7, zzbc());
    }

    public final void setImmersiveMode(boolean z) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, z);
        zzb(34, zzbc);
    }

    public final void setUserId(String str) {
        Parcel zzbc = zzbc();
        zzbc.writeString(str);
        zzb(13, zzbc);
    }

    public final void show() {
        zzb(2, zzbc());
    }

    public final void zza(zzafc zzafc) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) zzafc);
        zzb(3, zzbc);
    }

    public final void zza(zzafi zzafi) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (Parcelable) zzafi);
        zzb(1, zzbc);
    }

    public final void zzb(IObjectWrapper iObjectWrapper) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) iObjectWrapper);
        zzb(9, zzbc);
    }

    public final void zzc(IObjectWrapper iObjectWrapper) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) iObjectWrapper);
        zzb(10, zzbc);
    }

    public final void zzd(IObjectWrapper iObjectWrapper) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) iObjectWrapper);
        zzb(11, zzbc);
    }
}
