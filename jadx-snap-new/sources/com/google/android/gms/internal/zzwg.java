package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class zzwg extends zzew implements zzwf {
    public zzwg() {
        attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static zzwf zzu(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return queryLocalInterface instanceof zzwf ? (zzwf) queryLocalInterface : new zzwh(iBinder);
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i == 1) {
            IInterface zzbg = zzbg(parcel.readString());
            parcel2.writeNoException();
            zzex.zza(parcel2, zzbg);
        } else if (i != 2) {
            return false;
        } else {
            boolean zzbh = zzbh(parcel.readString());
            parcel2.writeNoException();
            zzex.zza(parcel2, zzbh);
        }
        return true;
    }
}
