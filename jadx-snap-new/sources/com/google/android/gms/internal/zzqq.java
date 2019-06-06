package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

public final class zzqq extends zzev implements zzqo {
    zzqq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    public final String getText() {
        Parcel zza = zza(2, zzbc());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    public final List<zzqs> zzjw() {
        Parcel zza = zza(3, zzbc());
        ArrayList zzb = zzex.zzb(zza);
        zza.recycle();
        return zzb;
    }
}
