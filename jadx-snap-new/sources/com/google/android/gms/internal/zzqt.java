package com.google.android.gms.internal;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zzqt extends zzew implements zzqs {
    public zzqt() {
        attachInterface(this, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public static zzqs zzk(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return queryLocalInterface instanceof zzqs ? (zzqs) queryLocalInterface : new zzqu(iBinder);
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i == 1) {
            IInterface zzkb = zzkb();
            parcel2.writeNoException();
            zzex.zza(parcel2, zzkb);
        } else if (i == 2) {
            Uri uri = getUri();
            parcel2.writeNoException();
            zzex.zzb(parcel2, uri);
        } else if (i != 3) {
            return false;
        } else {
            double scale = getScale();
            parcel2.writeNoException();
            parcel2.writeDouble(scale);
        }
        return true;
    }
}
