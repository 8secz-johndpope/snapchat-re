package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class zzsa extends zzev implements zzry {
    zzsa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public final void zzb(zzro zzro, String str) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) zzro);
        zzbc.writeString(str);
        zzb(1, zzbc);
    }
}
