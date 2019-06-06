package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

public final class zzwq extends zzev implements zzwo {
    zzwq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
    }

    public final int zzmn() {
        Parcel zza = zza(1, zzbc());
        int readInt = zza.readInt();
        zza.recycle();
        return readInt;
    }
}
