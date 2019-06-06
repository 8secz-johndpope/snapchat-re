package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.zzs;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzls extends zzev implements zzlr {
    zzls(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
    }

    public final IBinder zza(IObjectWrapper iObjectWrapper, String str, zzwf zzwf, int i) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (IInterface) iObjectWrapper);
        zzbc.writeString(str);
        zzex.zza(zzbc, (IInterface) zzwf);
        zzbc.writeInt(zzs.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        Parcel zza = zza(1, zzbc);
        IBinder readStrongBinder = zza.readStrongBinder();
        zza.recycle();
        return readStrongBinder;
    }
}
