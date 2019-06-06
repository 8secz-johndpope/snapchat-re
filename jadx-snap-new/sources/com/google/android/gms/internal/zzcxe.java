package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class zzcxe extends zzev implements zzcxd {
    zzcxe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.safetynet.internal.ISafetyNetService");
    }

    public final void zza(zzcxb zzcxb, byte[] bArr, String str) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) zzcxb);
        zzbc.writeByteArray(bArr);
        zzbc.writeString(str);
        zzb(7, zzbc);
    }
}
