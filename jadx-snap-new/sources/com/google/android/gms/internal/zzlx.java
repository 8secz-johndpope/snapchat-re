package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.zzs;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzlx extends zzev implements zzlw {
    zzlx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final IBinder zza(IObjectWrapper iObjectWrapper, zzko zzko, String str, zzwf zzwf, int i, int i2) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) iObjectWrapper);
        zzex.zza(zzbc, (Parcelable) zzko);
        zzbc.writeString(str);
        zzex.zza(zzbc, (IInterface) zzwf);
        zzbc.writeInt(zzs.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        zzbc.writeInt(i2);
        Parcel zza = zza(2, zzbc);
        IBinder readStrongBinder = zza.readStrongBinder();
        zza.recycle();
        return readStrongBinder;
    }
}
