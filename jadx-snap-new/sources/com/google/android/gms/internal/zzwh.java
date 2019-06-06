package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class zzwh extends zzev implements zzwf {
    zzwh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public final zzwi zzbg(String str) {
        zzwi zzwi;
        Parcel zzbc = zzbc();
        zzbc.writeString(str);
        Parcel zza = zza(1, zzbc);
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzwi = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            zzwi = queryLocalInterface instanceof zzwi ? (zzwi) queryLocalInterface : new zzwk(readStrongBinder);
        }
        zza.recycle();
        return zzwi;
    }

    public final boolean zzbh(String str) {
        Parcel zzbc = zzbc();
        zzbc.writeString(str);
        Parcel zza = zza(2, zzbc);
        boolean zza2 = zzex.zza(zza);
        zza.recycle();
        return zza2;
    }
}
