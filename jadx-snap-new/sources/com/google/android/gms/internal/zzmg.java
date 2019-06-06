package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

public final class zzmg extends zzev implements zzme {
    zzmg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
    }

    public final long getValue() {
        Parcel zza = zza(1, zzbc());
        long readLong = zza.readLong();
        zza.recycle();
        return readLong;
    }
}
