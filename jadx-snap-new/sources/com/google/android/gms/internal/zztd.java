package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

public final class zztd extends zzev implements zztc {
    zztd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final ParcelFileDescriptor zza(zzsy zzsy) {
        Parcel zzbc = zzbc();
        zzex.zza(zzbc, (Parcelable) zzsy);
        Parcel zza = zza(1, zzbc);
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzex.zza(zza, ParcelFileDescriptor.CREATOR);
        zza.recycle();
        return parcelFileDescriptor;
    }
}
