package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzys extends zzev implements zzyq {
    zzys(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        Parcel zzbc = zzbc();
        zzbc.writeInt(i);
        zzbc.writeInt(i2);
        zzex.zza(zzbc, (Parcelable) intent);
        zzb(12, zzbc);
    }

    public final void onBackPressed() {
        zzb(10, zzbc());
    }

    public final void onCreate(Bundle bundle) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (Parcelable) bundle);
        zzb(1, zzbc);
    }

    public final void onDestroy() {
        zzb(8, zzbc());
    }

    public final void onPause() {
        zzb(5, zzbc());
    }

    public final void onRestart() {
        zzb(2, zzbc());
    }

    public final void onResume() {
        zzb(4, zzbc());
    }

    public final void onSaveInstanceState(Bundle bundle) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (Parcelable) bundle);
        zzbc = zza(6, zzbc);
        if (zzbc.readInt() != 0) {
            bundle.readFromParcel(zzbc);
        }
        zzbc.recycle();
    }

    public final void onStart() {
        zzb(3, zzbc());
    }

    public final void onStop() {
        zzb(7, zzbc());
    }

    public final void zzbd() {
        zzb(9, zzbc());
    }

    public final void zzk(IObjectWrapper iObjectWrapper) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) iObjectWrapper);
        zzb(13, zzbc);
    }

    public final boolean zzni() {
        Parcel zza = zza(11, zzbc());
        boolean zza2 = zzex.zza(zza);
        zza.recycle();
        return zza2;
    }
}
