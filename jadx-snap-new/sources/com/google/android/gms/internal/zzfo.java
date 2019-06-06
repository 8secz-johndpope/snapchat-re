package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzfo extends zzev implements zzfm {
    zzfo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    public final void log() {
        zzb(3, zzbc());
    }

    public final void zza(IObjectWrapper iObjectWrapper, String str) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) iObjectWrapper);
        zzbc.writeString(str);
        zzb(2, zzbc);
    }

    public final void zza(IObjectWrapper iObjectWrapper, String str, String str2) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) iObjectWrapper);
        zzbc.writeString(str);
        zzbc.writeString(null);
        zzb(8, zzbc);
    }

    public final void zza(int[] iArr) {
        Parcel zzbc = zzbc();
        zzbc.writeIntArray(null);
        zzb(4, zzbc);
    }

    public final void zzc(byte[] bArr) {
        Parcel zzbc = zzbc();
        zzbc.writeByteArray(bArr);
        zzb(5, zzbc);
    }

    public final void zzg(int i) {
        Parcel zzbc = zzbc();
        zzbc.writeInt(i);
        zzb(6, zzbc);
    }

    public final void zzh(int i) {
        Parcel zzbc = zzbc();
        zzbc.writeInt(i);
        zzb(7, zzbc);
    }
}
