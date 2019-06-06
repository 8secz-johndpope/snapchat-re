package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

public final class zzaew extends zzev implements zzaeu {
    zzaew(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    public final int getAmount() {
        Parcel zza = zza(2, zzbc());
        int readInt = zza.readInt();
        zza.recycle();
        return readInt;
    }

    public final String getType() {
        Parcel zza = zza(1, zzbc());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }
}
